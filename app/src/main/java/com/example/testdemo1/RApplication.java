package com.example.testdemo1;

import android.app.Application;

import com.example.testdemo1.font.FontsFactory;

public class RApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FontsFactory.initData(this);
    }
}
