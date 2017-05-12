package com.example.zhf.erp.activity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zhf.erp.R;
import com.example.zhf.erp.baseactivity.BaseActivity;

public class UserCenterActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {
    private EditText old;
    private EditText pwd_new;
    private EditText confirm;
    private Button change_password;
    private CheckBox set_pwd_radio;
    private TextView set_pwd_prompt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isBack(true);
        setTitle(getResources().getString(R.string.user_center));
    }

    @Override
    public void setContentView() {
        super.setContentView();
        setContentView(R.layout.activity_user_center);
    }

    @Override
    public void initView() {
        super.initView();
        old = (EditText) findViewById(R.id.pwd_old);
        pwd_new = (EditText) findViewById(R.id.pwd_new);
        confirm = (EditText) findViewById(R.id.confirm);
        set_pwd_prompt = (TextView) findViewById(R.id.set_pwd_prompt);//密码提示
        change_password = (Button) findViewById(R.id.pwd_ok);
        set_pwd_radio = (CheckBox) findViewById(R.id.set_pwd_radio);

        change_password.setOnClickListener(this);
        set_pwd_radio.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.pwd_ok:
                isCheckPass();
                break;
        }
    }

    //密码检查
    private void isCheckPass() {
        // 获取输入框信息
        String oldPwd = old.getText().toString();
        //新密码
        String newPwd = pwd_new.getText().toString();
        //确认密码
        String confirmPwd = confirm.getText().toString();

        String name = "";
        String pwd = "";
        if (newPwd.length() >= 6 && confirmPwd.length() >= 6) {
            if (newPwd.length() < 20 && confirmPwd.length() < 20) {
                if (pwd.equals(oldPwd)) {
                    if (oldPwd == null || oldPwd.length() <= 0) {
                        show("旧密码不能为空");
                    } else if (newPwd == null || oldPwd.length() <= 0) {
                        show("新密码不能为空");
                    } else if (confirmPwd == null || oldPwd.length() <= 0) {
                        show("确认密码不能为空");
                    } else if (confirmPwd.equals(newPwd)) {
                        if (!newPwd.contains(" ") && !confirmPwd.contains(" ")) {
                            if (newPwd.length() > 0 && confirmPwd.length() > 0) {
                                // TODO: 2017/5/10  设置密码成功
                            }
                        } else {
                            show("不能包含空格");
                        }
                    } else if (!newPwd.equals(confirmPwd)) {
                        show("新密码和确认密码不一致，请重新输入");
                    }
                } else {
                    show("密码不一致");
                }
                set_pwd_prompt.setVisibility(View.GONE);
            } else {
                set_pwd_prompt.setVisibility(View.VISIBLE);
                set_pwd_prompt.setText(getResources().getString(R.string.set_pwd_prompt));
            }
        } else {
            set_pwd_prompt.setVisibility(View.VISIBLE);
            set_pwd_prompt.setText(getResources().getString(R.string.set_pwd_prompt1));
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            old.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            pwd_new.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            confirm.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            old.setTransformationMethod(PasswordTransformationMethod.getInstance());
            pwd_new.setTransformationMethod(PasswordTransformationMethod.getInstance());
            confirm.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
