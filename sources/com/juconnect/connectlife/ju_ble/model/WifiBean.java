package com.juconnect.connectlife.ju_ble.model;

public class WifiBean {
    public String bssid;
    public String password;
    public String rssi;
    public String ssid;

    public String getBssid() {
        return this.bssid;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRssi() {
        return this.rssi;
    }

    public String getSsid() {
        return this.ssid;
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setRssi(String str) {
        this.rssi = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public String toString() {
        return "WifiBean{BSSID='" + this.bssid + '\'' + ", rssi='" + this.rssi + '\'' + ", ssid='" + this.ssid + '\'' + ", password='" + this.password + '\'' + '}';
    }
}
