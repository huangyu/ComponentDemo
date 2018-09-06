package com.huangyu.module_common;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by huangyu on 2018/9/5.
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.init(this);
    }

}
