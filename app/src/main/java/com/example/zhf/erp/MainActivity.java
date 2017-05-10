package com.example.zhf.erp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import com.example.zhf.erp.activity.IntroductionActivity;
import com.example.zhf.erp.baseactivity.BaseActivity;
import com.example.zhf.erp.loop.LoopPagerAdapterWrapper;
import com.example.zhf.erp.loop.LoopViewPager;
import com.example.zhf.erp.utils.ExitApplication;
import com.example.zhf.erp.view.HomeListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    private Context context = MainActivity.this;
    private LoopViewPager loopViewPager;
    private ImageView pageImage1, pageImage2, pageImage3, pageImage4;
    private GridView home_gv;
    private LoopPagerAdapterWrapper adapter;
    private int images[] = {R.drawable.homeimage1, R.drawable.homeimage2, R.drawable.homeimage3, R.drawable.homeimage4};
    private List<ImageView> imageViews = new ArrayList<ImageView>(4);
    private String str[] = {"公司信息", "留言功能", "帮助"};
    private int office[] = {R.drawable.office_querty, R.drawable.office_instore, R.drawable.help, R.drawable.all};
    private HomeListView listView;
    List<String> comple = new ArrayList<>();
    List<Object> list = new ArrayList<>();
    //退出
    private long exitTime = 0;
    //android 6.0手动添加权限
    private final int REQUEST_SEND_SMS = 201;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //退出程序
        ExitApplication.getInstance().addActivity(this);
        setTitle(getResources().getString(R.string.home_title));
        setUser(getResources().getString(R.string.home_user));
        for (String s : str) {
            comple.add(s);
        }
        comple.add("全部");
        home_gv.setAdapter(new SimpleAdapter(context, getData(comple, office), R.layout.home_gv_item, new String[]{"text", "img"}, new int[]{R.id.gv_text, R.id.gv_img}));
        home_gv.setSelector(new ColorDrawable(Color.TRANSPARENT));
    }

    @Override
    public void setContentView() {
        super.setContentView();
        setContentView(R.layout.activity_main);
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
        switch (office[position]) {
            case R.drawable.office_querty:
                intent = new Intent(context, IntroductionActivity.class);
                break;
            case R.drawable.office_instore:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (ContextCompat.checkSelfPermission(context, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                        requestPermissions(new String[]{Manifest.permission.SEND_SMS}, REQUEST_SEND_SMS);
                    }
                } else {
                    intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:400-1081-616"));
                }
                break;
            case R.drawable.help:

                break;
            case R.drawable.all:
                intent = new Intent(context, AllActivity.class);
                break;
        }
        startActivity(intent);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_SEND_SMS) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:400-1081-616")));
            }
        }
    }
}
