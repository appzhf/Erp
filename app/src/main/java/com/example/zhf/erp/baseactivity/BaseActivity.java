package com.example.zhf.erp.baseactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhf.erp.R;
import com.example.zhf.erp.activity.UserActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseActivity extends Activity implements View.OnClickListener {
    private Context context = BaseActivity.this;
    private LinearLayout llContent;//容器
    protected LayoutInflater inflater;//布局填充器
    protected ImageView back;
    private TextView user;
    private TextView title_text;

    /**
     * 重写findViewById
     */
    @Override
    public View findViewById(int id) {
        return llContent.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base);
        llContent = (LinearLayout) super.findViewById(R.id.base_ll_content);
        back = (ImageView) super.findViewById(R.id.back);
        user = (TextView) super.findViewById(R.id.user);
        title_text = (TextView) super.findViewById(R.id.title_text);

        user.setOnClickListener(this);
        back.setOnClickListener(this);
        setContentView();
        initView();
    }

    public void initView() {
        inflater = getLayoutInflater();
    }

    public void setContentView() {
    }

    @Override
    public void setContentView(int layoutResID) {
        setContentView(View.inflate(this, layoutResID, null));
    }

    public void setContentView(View view) {
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        llContent.addView(view, params);
    }

    /**
     * 返回
     */
    public void isBack(boolean b) {
        back.setVisibility(b ? View.VISIBLE : View.GONE);
    }

    /**
     * 设置title文本
     */
    public void setTitle(String str) {
        title_text.setText(str);
    }

    /**
     * 是否显示个人
     */
    public void setUser(String str) {
        user.setText(str);
    }

    /**
     * 显示show
     */
    public void show(String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

    /**
     * 判断网络
     */
    public boolean getConnection() {
        //连接管理器
        ConnectivityManager conMan = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        if (null == conMan) {
            return false;
        }
        NetworkInfo networkinfo = conMan.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isAvailable()) {
            return false;
        }
        return true;
    }

    /**
     * 简单适配器list
     */
    public List<Map<String, Object>> getData(List<String> str, int office[]) {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("text", str.get(i));
            map.put("img", office[i]);
            list.add(map);
        }
        return list;
    }
    /**
     * 简单适配器list
     */
    public List<Map<String, Object>> getData1(String str[], int office[]) {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("text", str[i]);
            map.put("img", office[i]);
            list.add(map);
        }
        return list;
    }

    /**
     * 组件动画
     */
    //Animation动画
    public LayoutAnimationController getAnimationController() {
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.user:
                startActivity(new Intent(context, UserActivity.class));
                break;
        }
    }
}
