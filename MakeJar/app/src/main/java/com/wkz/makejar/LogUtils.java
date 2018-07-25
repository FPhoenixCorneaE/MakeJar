package com.wkz.makejar;

import android.util.Log;

public class LogUtils {

    public static String tag = "TestMakeJar";

    public static void e(String msg) {
        Log.e(tag, msg);
    }

    public static void v(String msg) {
        Log.v(tag, msg);
    }

    public static void i(String msg) {
        Log.i(tag, msg);
    }

    public static void d(String msg) {
        Log.d(tag, msg);
    }

    public static void w(String msg) {
        Log.w(tag, msg);
    }

}
