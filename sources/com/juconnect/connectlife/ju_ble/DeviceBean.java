package com.juconnect.connectlife.ju_ble;

import androidx.annotation.Keep;

@Keep
public class DeviceBean {
    public String wifiId;

    public String getWifiId() {
        return this.wifiId;
    }

    public void setWifiId(String str) {
        this.wifiId = str;
    }
}
