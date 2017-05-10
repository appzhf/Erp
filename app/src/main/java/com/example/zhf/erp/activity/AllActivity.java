package com.example.zhf.erp.activity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.example.zhf.erp.R;
import com.example.zhf.erp.baseactivity.BaseActivity;

public class AllActivity extends BaseActivity {
    private Context context = AllActivity.this;
    private GridView all_gv, all_gv1, all_gv2;
    private String str[];
    private String recomm[];
    private String compre[];
    private int office[] = {R.drawable.office_querty, R.drawable.office_instore, R.drawable.help};
    private int recomm_img[] = {R.drawable.office_order, R.drawable.office_check, R.drawable.office_buy};
    private int compre_img[] = {R.drawable.order, R.drawable.audio, R.drawable.buy,
            R.drawable.product, R.drawable.quarty, R.drawable.instorge,
            R.drawable.sendmail};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.all_title));
        isBack(true);
        getGv();
    }

    @Override
    public void setContentView() {
        super.setContentView();
        setContentView(R.layout.activity_all);
    }

    @Override
    public void initView() {
        super.initView();
        all_gv = (GridView) findViewById(R.id.all_gv);
        all_gv1 = (GridView) findViewById(R.id.all_gv1);
        all_gv2 = (GridView) findViewById(R.id.all_gv2);
    }

    private void getGv() {
        str = getResources().getStringArray(R.array.all);
        recomm = getResources().getStringArray(R.array.all2);
        compre = getResources().getStringArray(R.array.all3);
        all_gv.setAdapter(new SimpleAdapter(context, getData1(str, office), R.layout.home_gv_item, new String[]{"text", "img"}, new int[]{R.id.gv_text, R.id.gv_img}));
        all_gv.setSelector(new ColorDrawable(Color.TRANSPARENT));
        all_gv1.setAdapter(new SimpleAdapter(context, getData1(compre, compre_img), R.layout.sns_gv_item, new String[]{"text", "img"}, new int[]{R.id.sns_text, R.id.sns_gv1}));
        all_gv1.setSelector(new ColorDrawable(Color.TRANSPARENT));
        all_gv2.setAdapter(new SimpleAdapter(context, getData1(recomm, recomm_img), R.layout.home_gv_item, new String[]{"text", "img"}, new int[]{R.id.gv_text, R.id.gv_img}));
        all_gv2.setSelector(new ColorDrawable(Color.TRANSPARENT));
    }
}
