package com.juconnect.connectlife.ju_ble.model;

import java.util.List;

public class WifiList {
    public String currentSSID;
    public List<WifiBean> data;
    public Boolean endFlag;
    public String errorCode;
    public String errorDesc;
    public String resultCode;

    public String getCurrentSSID() {
        return this.currentSSID;
    }

    public List<WifiBean> getData() {
        return this.data;
    }

    public Boolean getEndFlag() {
        return this.endFlag;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDesc() {
        return this.errorDesc;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setCurrentSSID(String str) {
        this.currentSSID = str;
    }

    public void setData(List<WifiBean> list) {
        this.data = list;
    }

    public void setEndFlag(Boolean bool) {
        this.endFlag = bool;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorDesc(String str) {
        this.errorDesc = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }
}
