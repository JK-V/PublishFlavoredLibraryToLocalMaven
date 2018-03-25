package com.sdk.library;

/**
 * Generic-Flavor : Device Manager Contract
 */

public interface DeviceManager {
    boolean isBluetoothSupported();

    boolean isWifiSupported();

    //Only for specific flavor
    boolean isNFCSupported();
}
