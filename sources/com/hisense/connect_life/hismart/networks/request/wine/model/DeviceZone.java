package com.hisense.connect_life.hismart.networks.request.wine.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/DeviceZone;", "", "deviceId", "", "inventoryList", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "(Ljava/lang/String;Ljava/util/List;)V", "getDeviceId", "()Ljava/lang/String;", "getInventoryList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceZone.kt */
public final class DeviceZone {
    @NotNull
    public final String deviceId;
    @Nullable
    public final List<WineBaseInfo> inventoryList;

    public DeviceZone(@NotNull String str, @Nullable List<WineBaseInfo> list) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        this.deviceId = str;
        this.inventoryList = list;
    }

    public static /* synthetic */ DeviceZone copy$default(DeviceZone deviceZone, String str, List<WineBaseInfo> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceZone.deviceId;
        }
        if ((i & 2) != 0) {
            list = deviceZone.inventoryList;
        }
        return deviceZone.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.deviceId;
    }

    @Nullable
    public final List<WineBaseInfo> component2() {
        return this.inventoryList;
    }

    @NotNull
    public final DeviceZone copy(@NotNull String str, @Nullable List<WineBaseInfo> list) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        return new DeviceZone(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceZone)) {
            return false;
        }
        DeviceZone deviceZone = (DeviceZone) obj;
        return Intrinsics.areEqual((Object) this.deviceId, (Object) deviceZone.deviceId) && Intrinsics.areEqual((Object) this.inventoryList, (Object) deviceZone.inventoryList);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final List<WineBaseInfo> getInventoryList() {
        return this.inventoryList;
    }

    public int hashCode() {
        int hashCode = this.deviceId.hashCode() * 31;
        List<WineBaseInfo> list = this.inventoryList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "DeviceZone(deviceId=" + this.deviceId + ", inventoryList=" + this.inventoryList + ')';
    }
}
