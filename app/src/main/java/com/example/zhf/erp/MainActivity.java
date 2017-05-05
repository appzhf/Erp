package com.example.zhf.erp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhf.erp.fragment.HomeFragment;
import com.example.zhf.erp.fragment.SnsFragment;
import com.example.zhf.erp.fragment.UserFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private RelativeLayout home, sns, user;
    private ImageView tv_img1, tv_img2, tv_img3;
    private TextView tv_home, tv_sns, tv_user;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Intent intent;
    //退出
    private long exitTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = getIntent();
        initView();
    }

    @Override
    protected void onStart() {
        int tempFlag = intent.getIntExtra("flag", -1);
        if (tempFlag == -1) {
            HomeFragment t1 = new HomeFragment();//当没有获得意图里面传的值得时候，默认回到首页
            ft = fm.beginTransaction().replace(R.id.fl, t1);
            ft.commit();
        }

        intent.putExtra("flag", -1);
        super.onStart();
    }

    //初始化
    private void initView() {
        fm = getSupportFragmentManager();

        home = (RelativeLayout) findViewById(R.id.fm_home);
        sns = (RelativeLayout) findViewById(R.id.fm_sns);
        user = (RelativeLayout) findViewById(R.id.fm_user);
        tv_img1 = (ImageView) findViewById(R.id.tv_img1);
        tv_img2 = (ImageView) findViewById(R.id.tv_img2);
        tv_img3 = (ImageView) findViewById(R.id.tv_img3);
        tv_home = (TextView) findViewById(R.id.tv_home);
        tv_sns = (TextView) findViewById(R.id.tv_sns);
        tv_user = (TextView) findViewById(R.id.tv_user);
        home.setOnClickListener(this);
        sns.setOnClickListener(this);
        user.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fm_home:
                HomeFragment hf = new HomeFragment();
                ft = fm.beginTransaction().replace(R.id.fl, hf);
                ft.commit();
                change(0);
                break;
            case R.id.fm_sns:
                SnsFragment sf = new SnsFragment();
                ft = fm.beginTransaction().replace(R.id.fl, sf);
                ft.commit();
                change(1);
                break;
            case R.id.fm_user:
                UserFragment uf = new UserFragment();
                ft = fm.beginTransaction().replace(R.id.fl, uf);
                ft.commit();
                change(2);
                break;
        }
    }

    //改变状态
    private void change(int index) {
        switch (index) {
            case 0:
                tv_img1.setImageResource(R.mipmap.nav_bottom_home_active_60);
                tv_img2.setImageResource(R.mipmap.nav_bottom_sns_60);
                tv_img3.setImageResource(R.mipmap.nav_bottom_user_60);
                tv_home.setTextColor(getResources().getColor(R.color.orange));
                tv_sns.setTextColor(getResources().getColor(R.color.radio_text_normal));
                tv_user.setTextColor(getResources().getColor(R.color.radio_text_normal));
                break;
            case 1:
                tv_img1.setImageResource(R.mipmap.nav_bottom_home_60);
                tv_img2.setImageResource(R.mipmap.nav_bottom_sns_active_60);
                tv_img3.setImageResource(R.mipmap.nav_bottom_user_60);
                tv_home.setTextColor(getResources().getColor(R.color.radio_text_normal));
                tv_sns.setTextColor(getResources().getColor(R.color.orange));
                tv_user.setTextColor(getResources().getColor(R.color.radio_text_normal));
                break;
            case 2:
                tv_img1.setImageResource(R.mipmap.nav_bottom_home_60);
                tv_img2.setImageResource(R.mipmap.nav_bottom_sns_60);
                tv_img3.setImageResource(R.mipmap.nav_bottom_user_active_60);
                tv_home.setTextColor(getResources().getColor(R.color.radio_text_normal));
                tv_sns.setTextColor(getResources().getColor(R.color.radio_text_normal));
                tv_user.setTextColor(getResources().getColor(R.color.orange));
                break;
        }
    }

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
}