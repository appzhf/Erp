package com.example.zhf.erp.fragment;


import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import com.example.zhf.erp.R;
import com.example.zhf.erp.loop.LoopPagerAdapterWrapper;
import com.example.zhf.erp.loop.LoopViewPager;
import com.example.zhf.erp.view.HomeListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private LoopViewPager loopViewPager;
    private ImageView pageImage1, pageImage2, pageImage3, pageImage4;
    private GridView home_gv;
    private View v;
    private LoopPagerAdapterWrapper myAdapter;
    private int images[] = {R.drawable.homeimage1, R.drawable.homeimage2, R.drawable.homeimage3, R.drawable.homeimage4};
    private List<ImageView> imageViews = new ArrayList<ImageView>(4);
    private String str[]={"查阅进度","产品信息","库存信息","任务日志","公司信息","留言功能",};
    private int office[]={R.mipmap.office_order,R.mipmap.office_check,R.mipmap.office_buy,
                        R.mipmap.office_product,R.mipmap.office_querty,R.mipmap.office_instore};
    private HomeListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home, container, false);
        initView();
        return v;
    }

    private void initView() {
        loopViewPager = (LoopViewPager) v.findViewById(R.id.loopViewPager);
        pageImage1 = (ImageView) v.findViewById(R.id.pageImage1);
        pageImage2 = (ImageView) v.findViewById(R.id.pageImage2);
        pageImage3 = (ImageView) v.findViewById(R.id.pageImage3);
        pageImage4 = (ImageView) v.findViewById(R.id.pageImage4);
        home_gv = (GridView) v.findViewById(R.id.home_gv);
        listView = (HomeListView) v.findViewById(R.id.listView);

        getImagePlay();
        loopViewPager.setIndex(0);
        home_gv.setAdapter(new SimpleAdapter(getActivity(),getData(),R.layout.home_gv_item,new String[]{"text","img"},new int[]{R.id.gv_text,R.id.gv_img}));
        home_gv.setSelector(new ColorDrawable(Color.TRANSPARENT));
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i+"");
        }
        listView.setAdapter(new ArrayAdapter<Object>(getActivity(),android.R.layout.simple_list_item_1,list));
    }

    public void getImagePlay() {
        //循环插入4张图片
        for (int i = 0; i < 4; i++) {
            Bitmap bitmap = loopViewPager.decodeSampledBitmapFromResource(getResources(), images[i], 300, 300);
            ImageView imageView = new ImageView(getActivity());
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageViews.add(imageView);
        }

        myAdapter = new LoopPagerAdapterWrapper(imageViews);
        loopViewPager.setAdapter(myAdapter);
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
    private List<Map<String,Object>> getData(){
        List<Map<String,Object>> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            Map<String,Object> map = new HashMap<>();
            map.put("text",str[i]);
            map.put("img",office[i]);
            list.add(map);
        }
        return list;
    }

    @Override
    public void onDestroyView() {
        loopViewPager.stopLoop();
        super.onDestroyView();
    }
}
