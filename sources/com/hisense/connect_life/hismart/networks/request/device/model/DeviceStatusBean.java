package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceStatusBean;", "", "deviceid", "", "wifiid", "onlineStatus", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceOnlineStatus;", "(Ljava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceOnlineStatus;)V", "getDeviceid", "()Ljava/lang/String;", "getOnlineStatus", "()Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceOnlineStatus;", "getWifiid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceStatusBean.kt */
public final class DeviceStatusBean {
    @NotNull
    public final String deviceid;
    @NotNull
    public final DeviceOnlineStatus onlineStatus;
    @NotNull
    public final String wifiid;

    public DeviceStatusBean(@NotNull String str, @NotNull String str2, @NotNull DeviceOnlineStatus deviceOnlineStatus) {
        Intrinsics.checkNotNullParameter(str, "deviceid");
        Intrinsics.checkNotNullParameter(str2, "wifiid");
        Intrinsics.checkNotNullParameter(deviceOnlineStatus, "onlineStatus");
        this.deviceid = str;
        this.wifiid = str2;
        this.onlineStatus = deviceOnlineStatus;
    }

    public static /* synthetic */ DeviceStatusBean copy$default(DeviceStatusBean deviceStatusBean, String str, String str2, DeviceOnlineStatus deviceOnlineStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceStatusBean.deviceid;
        }
        if ((i & 2) != 0) {
            str2 = deviceStatusBean.wifiid;
        }
        if ((i & 4) != 0) {
            deviceOnlineStatus = deviceStatusBean.onlineStatus;
        }
        return deviceStatusBean.copy(str, str2, deviceOnlineStatus);
    }

    @NotNull
    public final String component1() {
        return this.deviceid;
    }

    @NotNull
    public final String component2() {
        return this.wifiid;
    }

    @NotNull
    public final DeviceOnlineStatus component3() {
        return this.onlineStatus;
    }

    @NotNull
    public final DeviceStatusBean copy(@NotNull String str, @NotNull String str2, @NotNull DeviceOnlineStatus deviceOnlineStatus) {
        Intrinsics.checkNotNullParameter(str, "deviceid");
        Intrinsics.checkNotNullParameter(str2, "wifiid");
        Intrinsics.checkNotNullParameter(deviceOnlineStatus, "onlineStatus");
        return new DeviceStatusBean(str, str2, deviceOnlineStatus);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceStatusBean)) {
            return false;
        }
        DeviceStatusBean deviceStatusBean = (DeviceStatusBean) obj;
        return Intrinsics.areEqual((Object) this.deviceid, (Object) deviceStatusBean.deviceid) && Intrinsics.areEqual((Object) this.wifiid, (Object) deviceStatusBean.wifiid) && Intrinsics.areEqual((Object) this.onlineStatus, (Object) deviceStatusBean.onlineStatus);
    }

    @NotNull
    public final String getDeviceid() {
        return this.deviceid;
    }

    @NotNull
    public final DeviceOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    @NotNull
    public final String getWifiid() {
        return this.wifiid;
    }

    public int hashCode() {
        return (((this.deviceid.hashCode() * 31) + this.wifiid.hashCode()) * 31) + this.onlineStatus.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceStatusBean(deviceid=" + this.deviceid + ", wifiid=" + this.wifiid + ", onlineStatus=" + this.onlineStatus + ')';
    }
}
