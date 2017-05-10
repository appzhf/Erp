package com.example.zhf.erp.utils;


import android.content.Context;

import com.example.zhf.erp.R;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/5/10.
 *  读config.properties文件
 */

public class ContentUtil {
    public static String gteContent(Context context){
        InputStream is = null;
        try {
            String content = "";
            is = context.getResources().openRawResource(R.raw.content);
            int len=0;
            byte b[] = new byte[1024];
            while((len = is.read(b))!=-1){
                content +=new String(b,0,len,"utf-8");
            }
            return content;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
