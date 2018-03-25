package com.sdk.library;

/**
 *
 */

public abstract class AbstractFacadeExposer {

    private static final String TAG = AbstractFacadeExposer.class.getSimpleName();
    private static AuthenticationManager mAuthenticationManagerContract;
    private static DeviceManager mDeviceManager;

    public static void init() {
        mAuthenticationManagerContract = new DefaultAuthenticationManager();
        mDeviceManager = new DefaultDeviceManager();
    }

    public static AuthenticationManager authenticationManager() {
        return mAuthenticationManagerContract;
    }

    public static DeviceManager deviceManager() {
        return mDeviceManager;
    }
}
