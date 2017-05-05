package com.zhy.http.okhttp;

import android.util.Log;

public class L
{
    private static boolean debug = true;

    public static void e(String msg)
    {
        if (debug)
        {
            Log.e("OkHttp", msg);
        }
    }

}

