package com.juconnect.connectlife.ju_ble.connect.order;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/connect/order/DevInfo;", "", "()V", "DevId", "", "getDevId", "()Ljava/lang/String;", "setDevId", "(Ljava/lang/String;)V", "DevProductType", "getDevProductType", "setDevProductType", "DevType", "getDevType", "setDevType", "WifiId", "getWifiId", "setWifiId", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DevInfo.kt */
public class DevInfo {
    @Nullable
    public String DevId;
    @Nullable
    public String DevProductType;
    @Nullable
    public String DevType;
    @Nullable
    public String WifiId;

    @Nullable
    public final String getDevId() {
        return this.DevId;
    }

    @Nullable
    public final String getDevProductType() {
        return this.DevProductType;
    }

    @Nullable
    public final String getDevType() {
        return this.DevType;
    }

    @Nullable
    public final String getWifiId() {
        return this.WifiId;
    }

    public final void setDevId(@Nullable String str) {
        this.DevId = str;
    }

    public final void setDevProductType(@Nullable String str) {
        this.DevProductType = str;
    }

    public final void setDevType(@Nullable String str) {
        this.DevType = str;
    }

    public final void setWifiId(@Nullable String str) {
        this.WifiId = str;
    }
}
