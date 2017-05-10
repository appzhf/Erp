package com.example.zhf.erp.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.zhf.erp.R;
import com.example.zhf.erp.baseactivity.BaseActivity;
import com.example.zhf.erp.utils.ContentUtil;

public class IntroductionActivity extends BaseActivity {
    private Context context = IntroductionActivity.this;
    private TextView tv_address, intro_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.intro_title));
        isBack(true);
    }

    @Override
    public void setContentView() {
        super.setContentView();
        setContentView(R.layout.activity_introduction);
    }

    @Override
    public void initView() {
        super.initView();
        tv_address = (TextView) findViewById(R.id.tv_address);
        intro_content = (TextView) findViewById(R.id.intro_content);
        intro_content.setText(ContentUtil.gteContent(context));
        tv_address.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.tv_address:
                startActivity(new Intent(Intent.ACTION_VIEW)
                        .setData(Uri.parse(getResources().getString(R.string.web_set_http))));
                break;
        }
    }
}
