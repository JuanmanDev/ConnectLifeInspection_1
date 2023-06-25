package com.hisense.connect_life.hismart.networks.request.device.model;

import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/DevicePropertyBean;", "", "deviceid", "", "wifiid", "properties", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;)V", "getDeviceid", "()Ljava/lang/String;", "getProperties", "()Lcom/google/gson/JsonObject;", "getWifiid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DevicePropertyBean.kt */
public final class DevicePropertyBean {
    @NotNull
    public final String deviceid;
    @Nullable
    public final JsonObject properties;
    @NotNull
    public final String wifiid;

    public DevicePropertyBean(@NotNull String str, @NotNull String str2, @Nullable JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "deviceid");
        Intrinsics.checkNotNullParameter(str2, "wifiid");
        this.deviceid = str;
        this.wifiid = str2;
        this.properties = jsonObject;
    }

    public static /* synthetic */ DevicePropertyBean copy$default(DevicePropertyBean devicePropertyBean, String str, String str2, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = devicePropertyBean.deviceid;
        }
        if ((i & 2) != 0) {
            str2 = devicePropertyBean.wifiid;
        }
        if ((i & 4) != 0) {
            jsonObject = devicePropertyBean.properties;
        }
        return devicePropertyBean.copy(str, str2, jsonObject);
    }

    @NotNull
    public final String component1() {
        return this.deviceid;
    }

    @NotNull
    public final String component2() {
        return this.wifiid;
    }

    @Nullable
    public final JsonObject component3() {
        return this.properties;
    }

    @NotNull
    public final DevicePropertyBean copy(@NotNull String str, @NotNull String str2, @Nullable JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "deviceid");
        Intrinsics.checkNotNullParameter(str2, "wifiid");
        return new DevicePropertyBean(str, str2, jsonObject);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevicePropertyBean)) {
            return false;
        }
        DevicePropertyBean devicePropertyBean = (DevicePropertyBean) obj;
        return Intrinsics.areEqual((Object) this.deviceid, (Object) devicePropertyBean.deviceid) && Intrinsics.areEqual((Object) this.wifiid, (Object) devicePropertyBean.wifiid) && Intrinsics.areEqual((Object) this.properties, (Object) devicePropertyBean.properties);
    }

    @NotNull
    public final String getDeviceid() {
        return this.deviceid;
    }

    @Nullable
    public final JsonObject getProperties() {
        return this.properties;
    }

    @NotNull
    public final String getWifiid() {
        return this.wifiid;
    }

    public int hashCode() {
        int hashCode = ((this.deviceid.hashCode() * 31) + this.wifiid.hashCode()) * 31;
        JsonObject jsonObject = this.properties;
        return hashCode + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "DevicePropertyBean(deviceid=" + this.deviceid + ", wifiid=" + this.wifiid + ", properties=" + this.properties + ')';
    }
}
