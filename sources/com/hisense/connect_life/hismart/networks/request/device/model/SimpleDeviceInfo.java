package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceInfo;", "", "deviceid", "", "wifiid", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceid", "()Ljava/lang/String;", "getWifiid", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SimpleDeviceInfo.kt */
public class SimpleDeviceInfo {
    @NotNull
    public final String deviceid;
    @NotNull
    public final String wifiid;

    public SimpleDeviceInfo() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public SimpleDeviceInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "deviceid");
        Intrinsics.checkNotNullParameter(str2, "wifiid");
        this.deviceid = str;
        this.wifiid = str2;
    }

    @NotNull
    public final String getDeviceid() {
        return this.deviceid;
    }

    @NotNull
    public final String getWifiid() {
        return this.wifiid;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleDeviceInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
