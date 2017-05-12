package com.example.zhf.erp.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.zhf.erp.MainActivity;
import com.example.zhf.erp.R;
import com.example.zhf.erp.animtion.CircularProgressButton;
import com.example.zhf.erp.baseactivity.BaseActivity;
import com.example.zhf.erp.db.HttpURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

public class LoginActivity extends BaseActivity {
    private String TAG = LoginActivity.class.getSimpleName();
    private Context context = LoginActivity.this;
    private EditText login_name, login_pwd;
    private CircularProgressButton circularButton;
    private SharedPreferences spf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        spf = getSharedPreferences("login",MODE_PRIVATE);
        if(spf.getString("login",null) != null){
            startActivity(new Intent(context, MainActivity.class));
            finish();
        }
        isTitle(false);
    }

    @Override
    public void setContentView() {
        super.setContentView();
        setContentView(R.layout.activity_login);
    }

    @Override
    public void initView() {
        super.initView();
        login_name = (EditText) findViewById(R.id.login_name);
        login_pwd = (EditText) findViewById(R.id.login_pwd);
        circularButton = (CircularProgressButton) findViewById(R.id.circularButton2);
        circularButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.circularButton2:
                if (getConnection()) {
                    login_name.setEnabled(false);
                    login_pwd.setEnabled(false);
                    if (login_name.getText().length() != 0 && login_pwd.getText().length() != 0) {
                        circularButton.setProgress(50);
                        login(login_name.getText().toString(), login_pwd.getText().toString());
                    } else {
                        show("用户名或密码不能为空!");
                        login_name.setEnabled(true);
                        login_pwd.setEnabled(true);
                    }
                    login_pwd.setText("");
                } else {
                    show("亲！你的网络走神了哦");
                    login_name.setEnabled(true);
                    login_pwd.setEnabled(true);
                }
                break;
        }
    }

    private void login(String name, String pwd) {
        OkHttpUtils
                .post()
                .addParams("name", name)
                .addParams("pwd", pwd)
                .url(HttpURL.URL + "/LoginServlet")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        System.out.println(TAG + ":" + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if(!response.equals("null")){
                            SharedPreferences.Editor se = getSharedPreferences("login",MODE_PRIVATE).edit();
                            se.putString("login",response);
                            se.commit();
                            startActivity(new Intent(context, MainActivity.class));
                            finish();
                        }else{
                            login_name.setEnabled(true);
                            login_pwd.setEnabled(true);
                            show("用户名或密码错误");
                        }
                        circularButton.setProgress(0);
                    }
                });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        OkHttpUtils.getInstance().cancelTag(this);
    }
}
