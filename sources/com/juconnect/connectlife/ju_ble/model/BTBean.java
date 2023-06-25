package com.juconnect.connectlife.ju_ble.model;

import android.bluetooth.BluetoothDevice;
import com.google.gson.annotations.Expose;

public class BTBean {
    @Expose
    public String bleName;
    public BluetoothDevice bluetoothDevice;
    @Expose
    public String deviceBleType;
    @Expose
    public int lifeTime;
    @Expose
    public String macAddress;
    @Expose
    public int rssi;

    public BTBean(BluetoothDevice bluetoothDevice2, int i, String str, String str2, String str3, int i2) {
        this.bluetoothDevice = bluetoothDevice2;
        this.rssi = i;
        this.deviceBleType = str;
        this.lifeTime = i2;
        this.bleName = str2;
        this.macAddress = str3;
    }

    public String getBleName() {
        return this.bleName;
    }

    public BluetoothDevice getBluetoothDevice() {
        return this.bluetoothDevice;
    }

    public String getDeviceBleType() {
        return this.deviceBleType;
    }

    public int getLifeTime() {
        return this.lifeTime;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public int getRssi() {
        return this.rssi;
    }

    public void setBleName(String str) {
        this.bleName = str;
    }

    public void setBluetoothDevice(BluetoothDevice bluetoothDevice2) {
        this.bluetoothDevice = bluetoothDevice2;
    }

    public void setDeviceBleType(String str) {
        this.deviceBleType = str;
    }

    public void setLifeTime(int i) {
        this.lifeTime = i;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public String toString() {
        return "BTBean{bluetoothDevice=" + this.bluetoothDevice + ", macAddress='" + this.macAddress + '\'' + ", bleName='" + this.bleName + '\'' + '}';
    }
}
