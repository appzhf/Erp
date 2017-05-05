package com.example.zhf.erp.baseactivity;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.zhf.erp.R;

public class BaseActivity extends Activity {
    private Context context = BaseActivity.this;
    private LinearLayout llContent;//容器
    protected LayoutInflater inflater;//布局填充器
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
        llContent = (LinearLayout)super.findViewById(R.id.base_ll_content);
        setContentView();
        initView();
    }

    public void initView(){
        inflater = getLayoutInflater();
    }

    public void setContentView(){
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
     * 显示show
     * */
    public void show(Context context, String str){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
    /**
     * 判断网络
     * */
    public static boolean getConnection(Context context) {
        //连接管理器
        ConnectivityManager conMan = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (null == conMan) {
            return false;
        }
        NetworkInfo networkinfo = conMan.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isAvailable()) {
            return false;
        }
        return true;
    }
}
