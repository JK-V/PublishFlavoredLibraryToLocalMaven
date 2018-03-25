package com.sdk.core;

/**
 *
 */

public class Device {

    private final String mDeviceModelNumber;
    private final String mDeviceModelName;
    private final String mDeviceName;
    private final boolean mNfcCapable;
    /**
     * Encrypted Hashed Device PIN
     */
    private String mEncryptedHashedPin;

    public Device(String mDeviceModelNumber, String mDeviceModelName, String mDeviceName, boolean mNfcCapable) {
        this.mDeviceModelNumber = mDeviceModelNumber;
        this.mDeviceModelName = mDeviceModelName;
        this.mDeviceName = mDeviceName;
        this.mNfcCapable = mNfcCapable;
    }

    public String getDeviceModelNumber() {
        return mDeviceModelNumber;
    }

    public String getDeviceModelName() {
        return mDeviceModelName;
    }

    public String getDeviceName() {
        return mDeviceName;
    }

    public boolean isNfcCapable() {
        return mNfcCapable;
    }


    public String getEncryptedHashedPin() {
        return mEncryptedHashedPin;
    }

    public void setEncryptedHashedPin(String pin) {
        this.mEncryptedHashedPin = pin;
    }
}
