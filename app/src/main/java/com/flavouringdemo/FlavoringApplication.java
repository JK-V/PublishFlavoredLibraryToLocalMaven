package com.flavouringdemo;

import android.app.Application;

import com.sdk.library.AbstractFacadeExposer;


/**
 *
 */

public class FlavoringApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Init SDK
        AbstractFacadeExposer.init();
    }
}
