package com.hisense.juconnect.app_socket.fbean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/fbean/Wifi;", "", "()V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "bssid", "", "getBssid", "()Ljava/lang/String;", "setBssid", "(Ljava/lang/String;)V", "rssi", "getRssi", "setRssi", "ssid", "getSsid", "setSsid", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Wifi.kt */
public final class Wifi {
    @Nullable
    public String bssid;
    @Nullable
    public String rssi;
    @Nullable
    public String ssid;

    public Wifi() {
    }

    @Nullable
    public final String getBssid() {
        return this.bssid;
    }

    @Nullable
    public final String getRssi() {
        return this.rssi;
    }

    @Nullable
    public final String getSsid() {
        return this.ssid;
    }

    public final void setBssid(@Nullable String str) {
        this.bssid = str;
    }

    public final void setRssi(@Nullable String str) {
        this.rssi = str;
    }

    public final void setSsid(@Nullable String str) {
        this.ssid = str;
    }

    public Wifi(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        try {
            this.ssid = jSONObject.getString("SSID");
            this.bssid = jSONObject.getString("BSSID");
            this.rssi = jSONObject.getString("RSSI");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
