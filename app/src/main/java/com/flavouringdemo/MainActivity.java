package com.flavouringdemo;

import android.app.Activity;
import android.os.Bundle;

import com.sdk.library.AbstractFacadeExposer;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkVisibilityOfAPIs();
    }

    //To check visibility of SDKLibrary APIs
    private void checkVisibilityOfAPIs() {
        //with override
        AbstractFacadeExposer.authenticationManager().pinAuthentication();
//        without override
        AbstractFacadeExposer.deviceManager().isNFCSupported();
    }
}
