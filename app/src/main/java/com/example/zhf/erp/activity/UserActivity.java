package com.example.zhf.erp.activity;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.zhf.erp.R;
import com.example.zhf.erp.baseactivity.BaseActivity;
import com.example.zhf.erp.utils.ExitApplication;
import com.example.zhf.erp.view.DialogAlertView;

/**
 * Created by Administrator on 2017/5/9.
 */

public class UserActivity extends BaseActivity {
    private Context context = UserActivity.this;
    private RelativeLayout exit;
    private RelativeLayout application, user_intro, user_phone, user_center;
    //android 6.0手动添加权限
    private final int REQUEST_CALL_PHONE = 202;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.user_title));
        isBack(true);
    }

    @Override
    public void setContentView() {
        super.setContentView();
        setContentView(R.layout.activity_user);
    }

    @Override
    public void initView() {
        super.initView();
        user_center = (RelativeLayout) findViewById(R.id.user_center);
        user_phone = (RelativeLayout) findViewById(R.id.user_phone);
        application = (RelativeLayout) findViewById(R.id.application);
        user_intro = (RelativeLayout) findViewById(R.id.user_intro);
        exit = (RelativeLayout) findViewById(R.id.exit);

        user_center.setOnClickListener(this);
        user_phone.setOnClickListener(this);
        application.setOnClickListener(this);
        user_intro.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        Intent intent = null;
        switch (v.getId()) {
            case R.id.user_center:
                intent = new Intent(context, UserCenterActivity.class);
                startActivity(intent);
                break;
            case R.id.exit:
                showDialog();
                break;
            case R.id.user_phone:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (ContextCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL_PHONE);
                    }
                } else {
                    intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:400-1081-616"));
                }
                startActivity(intent);
                break;
            case R.id.application:
                // 加载应用市场 hello
                try {
                    Uri uri = Uri.parse("market://details?id=" + getPackageName());
                    intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    show("无法加载应用市场，请检查手机是否安装");
                }
                break;
            case R.id.user_intro:
                intent = new Intent(context, IntroductionActivity.class);
                startActivity(intent);
                break;
        }
    }

    /**
     * 自定义当电话权限
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL_PHONE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:400-1081-616")));
            }
        }
    }

    /**
     * 显示对话框
     */
    private void showDialog() {
        final DialogAlertView dialog = new DialogAlertView(context, R.style.Dialog);
        dialog.setView(R.layout.dialog_exit);
        dialog.show();
        TextView dialog_cancel = (TextView) dialog.getWindow().findViewById(R.id.dialog_cancel);
        TextView dialog_exit = (TextView) dialog.getWindow().findViewById(R.id.dialog_exit);
        dialog_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor se = getSharedPreferences("login",MODE_PRIVATE).edit();
                se.clear();
                se.commit();
                ExitApplication.getInstance().exit(context);
                dialog.dismiss();
            }
        });
        dialog_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

}
