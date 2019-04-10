package com.example.ninetaildemonfox.recyclerviewdemo;

import android.app.Application;

import com.kongzue.baseokhttp.util.BaseOkHttp;

/**
 * Created by NineTailDemonFox on 2019/4/10.
 */

public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        BaseOkHttp.DEBUGMODE = true;
    }
}
