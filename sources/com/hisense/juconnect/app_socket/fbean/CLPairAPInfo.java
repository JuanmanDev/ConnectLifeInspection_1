package com.hisense.juconnect.app_socket.fbean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/fbean/CLPairAPInfo;", "", "()V", "bssid", "", "getBssid", "()Ljava/lang/String;", "setBssid", "(Ljava/lang/String;)V", "password", "getPassword", "setPassword", "ssid", "getSsid", "setSsid", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CLPairAPInfo.kt */
public final class CLPairAPInfo {
    @Nullable
    public String bssid;
    @Nullable
    public String password;
    @Nullable
    public String ssid;

    @Nullable
    public final String getBssid() {
        return this.bssid;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final String getSsid() {
        return this.ssid;
    }

    public final void setBssid(@Nullable String str) {
        this.bssid = str;
    }

    public final void setPassword(@Nullable String str) {
        this.password = str;
    }

    public final void setSsid(@Nullable String str) {
        this.ssid = str;
    }
}
