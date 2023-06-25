package com.juconnect.connectlife.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/WifiInfo;", "", "ssid", "", "bssid", "rssi", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getBssid", "()Ljava/lang/String;", "getRssi", "()I", "getSsid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiInfo.kt */
public final class WifiInfo {
    @NotNull
    public final String bssid;
    public final int rssi;
    @NotNull
    public final String ssid;

    public WifiInfo(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "ssid");
        Intrinsics.checkNotNullParameter(str2, "bssid");
        this.ssid = str;
        this.bssid = str2;
        this.rssi = i;
    }

    public static /* synthetic */ WifiInfo copy$default(WifiInfo wifiInfo, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wifiInfo.ssid;
        }
        if ((i2 & 2) != 0) {
            str2 = wifiInfo.bssid;
        }
        if ((i2 & 4) != 0) {
            i = wifiInfo.rssi;
        }
        return wifiInfo.copy(str, str2, i);
    }

    @NotNull
    public final String component1() {
        return this.ssid;
    }

    @NotNull
    public final String component2() {
        return this.bssid;
    }

    public final int component3() {
        return this.rssi;
    }

    @NotNull
    public final WifiInfo copy(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "ssid");
        Intrinsics.checkNotNullParameter(str2, "bssid");
        return new WifiInfo(str, str2, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WifiInfo)) {
            return false;
        }
        WifiInfo wifiInfo = (WifiInfo) obj;
        return Intrinsics.areEqual((Object) this.ssid, (Object) wifiInfo.ssid) && Intrinsics.areEqual((Object) this.bssid, (Object) wifiInfo.bssid) && this.rssi == wifiInfo.rssi;
    }

    @NotNull
    public final String getBssid() {
        return this.bssid;
    }

    public final int getRssi() {
        return this.rssi;
    }

    @NotNull
    public final String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return (((this.ssid.hashCode() * 31) + this.bssid.hashCode()) * 31) + Integer.hashCode(this.rssi);
    }

    @NotNull
    public String toString() {
        return "WifiInfo(ssid=" + this.ssid + ", bssid=" + this.bssid + ", rssi=" + this.rssi + ')';
    }
}
