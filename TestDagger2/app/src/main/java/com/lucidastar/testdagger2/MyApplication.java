package com.lucidastar.testdagger2;

import android.app.Application;

/**
 * Created by hanxiaoxing on 17/1/3.
 */

public class MyApplication extends Application {

    private BaseComponent baseComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        baseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }
}
