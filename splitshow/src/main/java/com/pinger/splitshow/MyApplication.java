package com.pinger.splitshow;

import android.app.Application;

import com.itheima.retrofitutils.ItheimaHttp;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/12/6.
 */

public class MyApplication extends Application {

    private static Logger logger = Logger.getLogger(MyApplication.class.getName());
    @Override
    public void onCreate() {
        super.onCreate();
        ItheimaHttp.init(this, "https://www.easy-mock.com/");
        logger.info("init");
    }
}
