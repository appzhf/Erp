package com.example.zhf.erp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.zhf.erp.activity.AllActivity;
import com.example.zhf.erp.activity.HelpActivity;
import com.example.zhf.erp.activity.IntroductionActivity;
import com.example.zhf.erp.activity.PersonActivity;
import com.example.zhf.erp.adapter.MainHybridAdapter;
import com.example.zhf.erp.adapter.MainListAdapter;
import com.example.zhf.erp.animtion.ZProgressHUD;
import com.example.zhf.erp.baseactivity.BaseActivity;
import com.example.zhf.erp.db.HttpURL;
import com.example.zhf.erp.loop.LoopPagerAdapterWrapper;
import com.example.zhf.erp.loop.LoopViewPager;
import com.example.zhf.erp.model.AllData;
import com.example.zhf.erp.model.Delivery;
import com.example.zhf.erp.model.Hybrid;
import com.example.zhf.erp.model.ListHybrid;
import com.example.zhf.erp.model.ListProduct;
import com.example.zhf.erp.model.Order;
import com.example.zhf.erp.model.Procurement;
import com.example.zhf.erp.model.Product;
import com.example.zhf.erp.model.Product_login;
import com.example.zhf.erp.model.PutIn;
import com.example.zhf.erp.model.Quality;
import com.example.zhf.erp.utils.ExitApplication;
import com.example.zhf.erp.view.HomeListView;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    private Context context = MainActivity.this;
    private LoopViewPager loopViewPager;
    private ImageView pageImage1, pageImage2, pageImage3, pageImage4;
    private GridView home_gv;
    private LoopPagerAdapterWrapper adapter;
    private int images[] = {R.drawable.homeimage1, R.drawable.homeimage2, R.drawable.homeimage3, R.drawable.homeimage4};
    private List<ImageView> imageViews = new ArrayList<ImageView>(4);
    private String str[] = {"公司信息", "留言功能", "帮助"};
    private int office[] = {R.drawable.office_querty, R.drawable.office_instore, R.drawable.help};
    private HomeListView listView;
    private ZProgressHUD progressHUD;
    private Product_login login;
    private ListProduct products;//管理查看所有记录
    private ListHybrid hybrid;//操作者查看所有记录
    private MainHybridAdapter hybridAdapter;//操作者查看所有记录适配器
    private MainListAdapter listAdapter;//管理查看所有记录适配器
    private SharedPreferences spf;
    private Handler handler;
    private Gson gson;
    private List<String> comple = new ArrayList<>();
    private List<Integer> comple_img = new ArrayList<>();
    private List<Object> list = new ArrayList<>();
    //退出
    private long exitTime = 0;
    //android 6.0手动添加权限
    private final int REQUEST_SEND_SMS = 201;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //退出程序
        ExitApplication.getInstance().addActivity(this);
        handler = new Handler();
        spf = getSharedPreferences("login", MODE_PRIVATE);
        gson = new Gson();
        login = gson.fromJson(spf.getString("login", null), Product_login.class);
        getLoading();
        setTitle(getResources().getString(R.string.home_title));
        setUser(getResources().getString(R.string.home_user));
        dynamicBtimp();
        home_gv.setAdapter(new SimpleAdapter(context, getData(comple, comple_img), R.layout.home_gv_item, new String[]{"text", "img"}, new int[]{R.id.gv_text, R.id.gv_img}));
        home_gv.setSelector(new ColorDrawable(Color.TRANSPARENT));
        getProduct();
    }

    @Override
    public void setContentView() {
        super.setContentView();
        setContentView(R.layout.activity_main);
    }

    private void dynamicBtimp() {
        for (String s : str) {
            comple.add(s);
        }
        for (int i : office) {
            comple_img.add(i);
        }
        if (login.getPermission().subSequence(0, 2).equals("下单")) {
            comple_img.add(R.drawable.order);
        } else if (login.getPermission().subSequence(0, 2).equals("审核")) {
            comple_img.add(R.drawable.audio);
        } else if (login.getPermission().subSequence(0, 2).equals("采购")) {
            comple_img.add(R.drawable.buy);
        } else if (login.getPermission().subSequence(0, 2).equals("生产")) {
            comple_img.add(R.drawable.product);
        } else if (login.getPermission().subSequence(0, 2).equals("质检")) {
            comple_img.add(R.drawable.quarty);
        } else if (login.getPermission().subSequence(0, 2).equals("入库")) {
            comple_img.add(R.drawable.instorge);
        } else if (login.getPermission().subSequence(0, 2).equals("发货")) {
            comple_img.add(R.drawable.sendmail);
        } else if (login.getPermission().subSequence(0, 2).equals("仓库")) {
            comple_img.add(R.drawable.warehouse);
        } else if (login.getPermission().contains("管理员")) {
            comple_img.add(R.drawable.all);
        }
        if (login.getPermission().contains("管理员")) {
            if (login.getPermission().subSequence(0, 2).equals("仓库")) {
                comple.add(login.getPermission().subSequence(0, 2).toString());
            } else {
                comple.add(login.getPermission().toString());
            }
        } else {
            comple.add(login.getPermission().subSequence(0, 2).toString());
        }
    }

    //正在加载
    private void getLoading() {
        progressHUD = ZProgressHUD.getInstance(context);
        progressHUD.setMessage("Loading ...");
        progressHUD.setSpinnerType(ZProgressHUD.SIMPLE_ROUND_SPINNER);
        progressHUD.show();
    }

    @Override
    public void initView() {
        super.initView();
        loopViewPager = (LoopViewPager) findViewById(R.id.loopViewPager);
        pageImage1 = (ImageView) findViewById(R.id.pageImage1);
        pageImage2 = (ImageView) findViewById(R.id.pageImage2);
        pageImage3 = (ImageView) findViewById(R.id.pageImage3);
        pageImage4 = (ImageView) findViewById(R.id.pageImage4);
        home_gv = (GridView) findViewById(R.id.home_gv);
        listView = (HomeListView) findViewById(R.id.listView);

        getImagePlay();
        loopViewPager.setIndex(0);

        home_gv.setOnItemClickListener(this);
        for (int i = 0; i < 20; i++) {
            list.add(i + "");
        }
        listView.setAdapter(new ArrayAdapter<Object>(context, android.R.layout.simple_list_item_1, list));
    }

    public void getImagePlay() {
        //循环插入4张图片
        for (int i = 0; i < 4; i++) {
            Bitmap bitmap = loopViewPager.decodeSampledBitmapFromResource(getResources(), images[i], 300, 300);
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageViews.add(imageView);
        }

        adapter = new LoopPagerAdapterWrapper(imageViews);
        loopViewPager.setAdapter(adapter);
        loopViewPager.addOnPageChangeListener(pageChangeListener);
        int index = Integer.MAX_VALUE / 2 - (Integer.MAX_VALUE / 2) % imageViews.size();
        loopViewPager.setCurrentItem(index);
        loopViewPager.startLoop();
    }

    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.SimpleOnPageChangeListener() {
        @Override
        public void onPageSelected(int position) {
            pageImage1.setImageDrawable(getResources().getDrawable(position % 4 == 0 ? R.mipmap.yuan1 : R.mipmap.yuan));
            pageImage2.setImageDrawable(getResources().getDrawable(position % 4 == 1 ? R.mipmap.yuan1 : R.mipmap.yuan));
            pageImage3.setImageDrawable(getResources().getDrawable(position % 4 == 2 ? R.mipmap.yuan1 : R.mipmap.yuan));
            pageImage4.setImageDrawable(getResources().getDrawable(position % 4 == 3 ? R.mipmap.yuan1 : R.mipmap.yuan));
        }
    };

    //退出程序
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                Toast.makeText(MainActivity.this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onStop() {
        super.onStop();
        loopViewPager.stopLoop();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(context, IntroductionActivity.class);
                break;
            case 1:
                //手动添加权限
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (ContextCompat.checkSelfPermission(context, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                        requestPermissions(new String[]{Manifest.permission.SEND_SMS}, REQUEST_SEND_SMS);
                    }
                } else {
                    intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:400-1081-616"));
                }
                break;
            case 2:
                intent = new Intent(context, HelpActivity.class);
                break;
            case 3:
                if (login.getPermission().contains("管理员")) {
                    if (login.getPermission().subSequence(0, 2).equals("仓库")) {
                        intent = new Intent(context, PersonActivity.class);
                    } else {
                        intent = new Intent(context, AllActivity.class);
                    }
                } else {
                    intent = new Intent(context, PersonActivity.class);
                }
                break;
        }
        startActivity(intent);
    }

    //权限回调结果
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_SEND_SMS) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:400-1081-616")));
            }
        }
    }

    //获取Product表中最新两条数据
    private void getProduct() {
        //CompreServlet
        //ProductServlet管理员
        OkHttpUtils
                .post()
                //.url(login.getPermission().contains("管理员") ? HttpURL.URL + "/ProductServlet" : HttpURL.URL + "/CompreServlet")
                .url(login.getPermission().contains("管理员") ? (login.getPermission().subSequence(0, 2).equals("仓库") ? "c" : HttpURL.URL + "/ProductServlet") : HttpURL.URL + "/CompreServlet")
                .addParams("count", "2")
                .addParams("orderName", login.getPermission())
                .addParams("name", login.getRealName())
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if (!response.trim().equals("[]")) {
                            if (login.getPermission().contains("管理员")) {
                                if (login.getPermission().subSequence(0, 2).equals("仓库")) {
                                    //仓库管理员
                                } else {
                                    products = gson.fromJson(response, ListProduct.class);
                                    List<Product> list = products.getList();
                                    AllData data = new AllData();
                                    List<Order> orders = new ArrayList<Order>();
                                    List<Delivery> deliveries = new ArrayList<Delivery>();
                                    List<Procurement> procurements = new ArrayList<Procurement>();
                                    List<Quality> qualities = new ArrayList<Quality>();
                                    List<PutIn> putIns = new ArrayList<PutIn>();
                                    Order order = null;
                                    Delivery delivery = null;
                                    Procurement procurement = null;
                                    PutIn putIn = null;
                                    Quality quality = null;
                                    for (Product product : list) {
                                        //订单
                                        order = new Order();
                                        order.setId(product.getId());
                                        order.setName(product.getName());
                                        order.setOrderTime(product.getOrderTime());
                                        order.setOtherRequire(product.getOtherRequire());
                                        order.setOrderUser(product.getOrderUser());
                                        orders.add(order);
                                        //发货
                                        delivery = new Delivery();
                                        delivery.setId(product.getId());
                                        delivery.setName(product.getName());
                                        delivery.setDeliveryTime(product.getDeliveryTime());
                                        delivery.setDeliveryUser(product.getDeliveryUser());
                                        delivery.setDeliveryBz(product.getDeliveryBz());
                                        deliveries.add(delivery);
                                        //采购
                                        procurement = new Procurement();
                                        procurement.setId(product.getId());
                                        procurement.setName(product.getName());
                                        procurement.setVerifyTime(product.getVerifyTime());
                                        procurement.setVerifyUser(product.getVerifyUser());
                                        procurement.setVerifyBz(product.getVerifyBz());
                                        procurements.add(procurement);
                                        //入库
                                        putIn = new PutIn();
                                        putIn.setId(product.getId());
                                        putIn.setName(product.getName());
                                        putIn.setInStorageTime(product.getInStorageTime());
                                        putIn.setInStorageUser(product.getInStorageUser());
                                        putIn.setInStorageBz(product.getInStorageBz());
                                        putIns.add(putIn);
                                        //质检
                                        quality = new Quality();
                                        quality.setId(product.getId());
                                        quality.setName(product.getName());
                                        quality.setQualitTime(product.getQualitTime());
                                        quality.setQualityUser(product.getQualityUser());
                                        quality.setOrderBz(product.getOrderBz());
                                        qualities.add(quality);
                                        //System.out.println(product);
                                    }
                                    data.setOrders(orders);
                                    data.setDeliveries(deliveries);
                                    data.setProcurements(procurements);
                                    data.setPutIns(putIns);
                                    data.setQualities(qualities);
                                    listAdapter = new MainListAdapter(context, data);
                                    listView.setAdapter(listAdapter);
                                    listAdapter.notifyDataSetChanged();
                                    order = null;
                                    orders = null;
                                    delivery = null;
                                    deliveries = null;
                                    procurement = null;
                                    procurements = null;
                                    putIn = null;
                                    putIns = null;
                                    quality = null;
                                    qualities = null;
                                }
                            } else {
                                hybrid = gson.fromJson(response, ListHybrid.class);
                                List<Hybrid> list = hybrid.getListHybrid();
                                hybridAdapter = new MainHybridAdapter(context, list);
                                listView.setAdapter(hybridAdapter);
                                hybridAdapter.notifyDataSetChanged();
                            }
                        } else {
                            show("暂无数据，请稍后查询!");
                        }
                        handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressHUD.dismiss();
                            }
                        }, 500);
                        handler = null;
                    }
                });
    }
}
