package com.sdk.library;

import android.util.Log;

/**
 *
 */

class DefaultDeviceManager implements DeviceManager {
    public boolean isBluetoothSupported() {
        return getFlag();
    }

    public boolean isWifiSupported() {
        Log.w("DefaultDeviceManager", "I'm inside isWifiSupported");
        return false;
    }

    public boolean isNFCSupported() {
        Log.w("DefaultDeviceManager", "I'm inside isNFCSupported");
        return false;
    }

    public boolean getStatus() {
        return true;
    }

    private boolean getFlag() {
        Log.w("DefaultDeviceManager", "I'm inside getFlag");
        return true;
    }
}
