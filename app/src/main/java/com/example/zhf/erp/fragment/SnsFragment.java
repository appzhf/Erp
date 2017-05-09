package com.example.zhf.erp.fragment;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.example.zhf.erp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class SnsFragment extends Fragment {
    private View v;
    private GridView sns_gv;
    private String compre[] = {"下单", "审核", "采购", "生产", "质检", "入库", "发货", "进度", "帮助"};
    private int compre_img[] = {R.drawable.office_order, R.drawable.office_audio, R.drawable.office_buy,
            R.drawable.office_product, R.drawable.office_quarty, R.drawable.office_instorge,
            R.drawable.office_sendmail, R.drawable.office_findby, R.drawable.office_help,};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_sns, container, false);
        initView();
        return v;
    }

    //初始化
    private void initView() {
        sns_gv = (GridView) v.findViewById(R.id.sns_gv);

        sns_gv.setAdapter(new SimpleAdapter(getActivity(), getData(), R.layout.sns_gv_item, new String[]{"text", "img"}, new int[]{R.id.sns_text, R.id.sns_gv1}));
        sns_gv.setSelector(new ColorDrawable(Color.TRANSPARENT));
        sns_gv.setLayoutAnimation(getAnimationController());
    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < compre.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("text", compre[i]);
            map.put("img", compre_img[i]);
            list.add(map);
        }
        return list;
    }

    //Animation动画
    private LayoutAnimationController getAnimationController() {
        AnimationSet set = new AnimationSet(true);
        Animation anim = new AlphaAnimation(0, 1);
        anim.setDuration(500);
        set.addAnimation(anim);
        //从上往下显示
        anim = new TranslateAnimation(0, 0, 1, 0);
        anim.setDuration(500);
        set.addAnimation(anim);
        LayoutAnimationController lac = new LayoutAnimationController(set, 0.5f);
        lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
        return lac;
    }
}
