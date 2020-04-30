package com.example.testdemo1.font;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;

/**
 * @author usherchen
 * @date 18-7-9
 * @project Midea_Demo_Plasma
 * @package io.jc.plasma.view.widget.scan.font
 * @describe FontsFactory
 */
@SuppressLint("StaticFieldLeak")
public class FontsFactory {

    private static FontsFactory mFactory;
    private static Typeface w2;
    private static Typeface w3;
    private static Typeface w4;
    private static Typeface w5;
    private static Typeface w6;
    private static Typeface w7;
    private static Typeface w8;
    private static Typeface mBrownLightFonts;

    private static Context mContext;

    public synchronized static FontsFactory newInstance(Context context) {
        mContext = context.getApplicationContext();
        synchronized (context) {
            if (mFactory == null) {
                mFactory = new FontsFactory();
                if (w2 == null) {
                    w2 = Typeface.createFromAsset(
                            context.getResources().getAssets(), "fonts/MYingHeiPRC-W2.ttf"
                    );
                }
                if (mBrownLightFonts == null) {
                    mBrownLightFonts = Typeface.createFromAsset(
                            context.getResources().getAssets(), "fonts/Brown-Light.otf"
                    );
                }
            }
            return mFactory;
        }
    }

    public Typeface obtainMYingHeiPRC_W2Fonts() {
        if (w2 == null) {
            w2 = Typeface.createFromAsset(
                    mContext.getResources().getAssets(), "fonts/MYingHeiPRC-W2.ttf"
            );
        }
        return w2;
    }

    public Typeface obtainMYingHeiPRC_W3Fonts() {
        if (w3 == null) {
            w3 = Typeface.createFromAsset(
                    mContext.getResources().getAssets(), "fonts/MYingHeiPRC-W3.ttf"
            );
        }
        return w3;
    }
    public Typeface obtainMYingHeiPRC_W4Fonts() {
        if (w4 == null) {
            w4 = Typeface.createFromAsset(
                    mContext.getResources().getAssets(), "fonts/MYingHeiPRC-W4.ttf"
            );
        }
        return w4;
    }
    public Typeface obtainMYingHeiPRC_W5Fonts() {
        if (w5 == null) {
            w5 = Typeface.createFromAsset(
                    mContext.getResources().getAssets(), "fonts/MYingHeiPRC-W5.ttf"
            );
        }
        return w5;
    }
    public Typeface obtainMYingHeiPRC_W6Fonts() {
        if (w6 == null) {
            w6 = Typeface.createFromAsset(
                    mContext.getResources().getAssets(), "fonts/MYingHeiPRC-W6.ttf"
            );
        }
        return w6;
    }

    public Typeface obtainMYingHeiPRC_W7Fonts() {
        if (w7 == null) {
            w7 = Typeface.createFromAsset(
                    mContext.getResources().getAssets(), "fonts/MYingHeiPRC-W7.ttf"
            );
        }
        return w7;
    }

    public static void initData(Context context){
        FontsFactory.newInstance(context).obtainMYingHeiPRC_W3Fonts();
    }

    public Typeface obtainMYingHeiPRC_W8Fonts() {
        if (w7 == null) {
            w7 = Typeface.createFromAsset(
                    mContext.getResources().getAssets(), "fonts/MYingHeiPRC-W8.ttf"
            );
        }
        return w7;
    }




    public Typeface obtainBrownLightFonts(){
        return mBrownLightFonts;
    }

}
