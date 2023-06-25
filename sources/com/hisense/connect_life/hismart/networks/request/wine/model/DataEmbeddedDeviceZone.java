package com.hisense.connect_life.hismart.networks.request.wine.model;

import androidx.room.Embedded;
import androidx.room.Relation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/DataEmbeddedDeviceZone;", "", "deviceZone", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/DeviceZone;", "playlists", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "(Lcom/hisense/connect_life/hismart/networks/request/wine/model/DeviceZone;Ljava/util/List;)V", "getDeviceZone", "()Lcom/hisense/connect_life/hismart/networks/request/wine/model/DeviceZone;", "setDeviceZone", "(Lcom/hisense/connect_life/hismart/networks/request/wine/model/DeviceZone;)V", "getPlaylists", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DataEmbeddedDeviceZone.kt */
public final class DataEmbeddedDeviceZone {
    @NotNull
    @Embedded
    public DeviceZone deviceZone;
    @NotNull
    @Relation(entityColumn = "childId", parentColumn = "parentId")
    public final List<WineBaseInfo> playlists;

    public DataEmbeddedDeviceZone(@NotNull DeviceZone deviceZone2, @NotNull List<WineBaseInfo> list) {
        Intrinsics.checkNotNullParameter(deviceZone2, "deviceZone");
        Intrinsics.checkNotNullParameter(list, "playlists");
        this.deviceZone = deviceZone2;
        this.playlists = list;
    }

    public static /* synthetic */ DataEmbeddedDeviceZone copy$default(DataEmbeddedDeviceZone dataEmbeddedDeviceZone, DeviceZone deviceZone2, List<WineBaseInfo> list, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceZone2 = dataEmbeddedDeviceZone.deviceZone;
        }
        if ((i & 2) != 0) {
            list = dataEmbeddedDeviceZone.playlists;
        }
        return dataEmbeddedDeviceZone.copy(deviceZone2, list);
    }

    @NotNull
    public final DeviceZone component1() {
        return this.deviceZone;
    }

    @NotNull
    public final List<WineBaseInfo> component2() {
        return this.playlists;
    }

    @NotNull
    public final DataEmbeddedDeviceZone copy(@NotNull DeviceZone deviceZone2, @NotNull List<WineBaseInfo> list) {
        Intrinsics.checkNotNullParameter(deviceZone2, "deviceZone");
        Intrinsics.checkNotNullParameter(list, "playlists");
        return new DataEmbeddedDeviceZone(deviceZone2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataEmbeddedDeviceZone)) {
            return false;
        }
        DataEmbeddedDeviceZone dataEmbeddedDeviceZone = (DataEmbeddedDeviceZone) obj;
        return Intrinsics.areEqual((Object) this.deviceZone, (Object) dataEmbeddedDeviceZone.deviceZone) && Intrinsics.areEqual((Object) this.playlists, (Object) dataEmbeddedDeviceZone.playlists);
    }

    @NotNull
    public final DeviceZone getDeviceZone() {
        return this.deviceZone;
    }

    @NotNull
    public final List<WineBaseInfo> getPlaylists() {
        return this.playlists;
    }

    public int hashCode() {
        return (this.deviceZone.hashCode() * 31) + this.playlists.hashCode();
    }

    public final void setDeviceZone(@NotNull DeviceZone deviceZone2) {
        Intrinsics.checkNotNullParameter(deviceZone2, "<set-?>");
        this.deviceZone = deviceZone2;
    }

    @NotNull
    public String toString() {
        return "DataEmbeddedDeviceZone(deviceZone=" + this.deviceZone + ", playlists=" + this.playlists + ')';
    }
}
