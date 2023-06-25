package com.hisense.connect_life.hismart.networks.request.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/model/DeviceZoneModel;", "", "deviceId", "", "zoneList", "", "Lcom/hisense/connect_life/hismart/networks/request/model/WinePositionModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getZoneList", "()Ljava/util/List;", "setZoneList", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceZoneModel.kt */
public final class DeviceZoneModel {
    @NotNull
    public String deviceId;
    @NotNull
    public List<WinePositionModel> zoneList;

    public DeviceZoneModel(@NotNull String str, @NotNull List<WinePositionModel> list) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(list, "zoneList");
        this.deviceId = str;
        this.zoneList = list;
    }

    public static /* synthetic */ DeviceZoneModel copy$default(DeviceZoneModel deviceZoneModel, String str, List<WinePositionModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceZoneModel.deviceId;
        }
        if ((i & 2) != 0) {
            list = deviceZoneModel.zoneList;
        }
        return deviceZoneModel.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.deviceId;
    }

    @NotNull
    public final List<WinePositionModel> component2() {
        return this.zoneList;
    }

    @NotNull
    public final DeviceZoneModel copy(@NotNull String str, @NotNull List<WinePositionModel> list) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(list, "zoneList");
        return new DeviceZoneModel(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceZoneModel)) {
            return false;
        }
        DeviceZoneModel deviceZoneModel = (DeviceZoneModel) obj;
        return Intrinsics.areEqual((Object) this.deviceId, (Object) deviceZoneModel.deviceId) && Intrinsics.areEqual((Object) this.zoneList, (Object) deviceZoneModel.zoneList);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final List<WinePositionModel> getZoneList() {
        return this.zoneList;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.zoneList.hashCode();
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setZoneList(@NotNull List<WinePositionModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.zoneList = list;
    }

    @NotNull
    public String toString() {
        return "DeviceZoneModel(deviceId=" + this.deviceId + ", zoneList=" + this.zoneList + ')';
    }
}
