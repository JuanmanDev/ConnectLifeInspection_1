package com.hisense.connect_life.hismart.networks.request.message.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "", "onlinestats", "", "wifiid", "", "(ILjava/lang/String;)V", "getOnlinestats", "()I", "getWifiid", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiMessage.kt */
public final class WifiMessage {
    public final int onlinestats;
    @NotNull
    public final String wifiid;

    public WifiMessage(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "wifiid");
        this.onlinestats = i;
        this.wifiid = str;
    }

    public static /* synthetic */ WifiMessage copy$default(WifiMessage wifiMessage, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wifiMessage.onlinestats;
        }
        if ((i2 & 2) != 0) {
            str = wifiMessage.wifiid;
        }
        return wifiMessage.copy(i, str);
    }

    public final int component1() {
        return this.onlinestats;
    }

    @NotNull
    public final String component2() {
        return this.wifiid;
    }

    @NotNull
    public final WifiMessage copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "wifiid");
        return new WifiMessage(i, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WifiMessage)) {
            return false;
        }
        WifiMessage wifiMessage = (WifiMessage) obj;
        return this.onlinestats == wifiMessage.onlinestats && Intrinsics.areEqual((Object) this.wifiid, (Object) wifiMessage.wifiid);
    }

    public final int getOnlinestats() {
        return this.onlinestats;
    }

    @NotNull
    public final String getWifiid() {
        return this.wifiid;
    }

    public int hashCode() {
        return (Integer.hashCode(this.onlinestats) * 31) + this.wifiid.hashCode();
    }

    @NotNull
    public String toString() {
        return "WifiMessage(onlinestats=" + this.onlinestats + ", wifiid=" + this.wifiid + ')';
    }
}
