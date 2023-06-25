package com.juconnect.connectlife.ju_dist.connect.order;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/connect/order/WiFiArr;", "", "()V", "BSSID", "", "getBSSID", "()Ljava/lang/String;", "setBSSID", "(Ljava/lang/String;)V", "RSSI", "getRSSI", "setRSSI", "SSID", "getSSID", "setSSID", "password", "getPassword", "setPassword", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WiFiArr.kt */
public class WiFiArr {
    @Nullable
    public String BSSID;
    @Nullable
    public String RSSI;
    @Nullable
    public String SSID;
    @Nullable
    public String password;

    @Nullable
    public final String getBSSID() {
        return this.BSSID;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final String getRSSI() {
        return this.RSSI;
    }

    @Nullable
    public final String getSSID() {
        return this.SSID;
    }

    public final void setBSSID(@Nullable String str) {
        this.BSSID = str;
    }

    public final void setPassword(@Nullable String str) {
        this.password = str;
    }

    public final void setRSSI(@Nullable String str) {
        this.RSSI = str;
    }

    public final void setSSID(@Nullable String str) {
        this.SSID = str;
    }
}
