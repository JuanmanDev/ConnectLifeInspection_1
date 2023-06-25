package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineItemInfo;", "", "deviceId", "", "wifiId", "zoneList", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineInventoryInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDeviceId", "()Ljava/lang/String;", "getWifiId", "getZoneList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddWine.kt */
public final class AddWineItemInfo {
    @NotNull
    public final String deviceId;
    @NotNull
    public final String wifiId;
    @Nullable
    public final List<WineInventoryInfo> zoneList;

    public AddWineItemInfo(@NotNull String str, @NotNull String str2, @Nullable List<WineInventoryInfo> list) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        this.deviceId = str;
        this.wifiId = str2;
        this.zoneList = list;
    }

    public static /* synthetic */ AddWineItemInfo copy$default(AddWineItemInfo addWineItemInfo, String str, String str2, List<WineInventoryInfo> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addWineItemInfo.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = addWineItemInfo.wifiId;
        }
        if ((i & 4) != 0) {
            list = addWineItemInfo.zoneList;
        }
        return addWineItemInfo.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.deviceId;
    }

    @NotNull
    public final String component2() {
        return this.wifiId;
    }

    @Nullable
    public final List<WineInventoryInfo> component3() {
        return this.zoneList;
    }

    @NotNull
    public final AddWineItemInfo copy(@NotNull String str, @NotNull String str2, @Nullable List<WineInventoryInfo> list) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        return new AddWineItemInfo(str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddWineItemInfo)) {
            return false;
        }
        AddWineItemInfo addWineItemInfo = (AddWineItemInfo) obj;
        return Intrinsics.areEqual((Object) this.deviceId, (Object) addWineItemInfo.deviceId) && Intrinsics.areEqual((Object) this.wifiId, (Object) addWineItemInfo.wifiId) && Intrinsics.areEqual((Object) this.zoneList, (Object) addWineItemInfo.zoneList);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    @Nullable
    public final List<WineInventoryInfo> getZoneList() {
        return this.zoneList;
    }

    public int hashCode() {
        int hashCode = ((this.deviceId.hashCode() * 31) + this.wifiId.hashCode()) * 31;
        List<WineInventoryInfo> list = this.zoneList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "AddWineItemInfo(deviceId=" + this.deviceId + ", wifiId=" + this.wifiId + ", zoneList=" + this.zoneList + ')';
    }
}
