package com.internationalwinecooler.model;

import com.hisense.connect_life.core.global.KeyConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo47991d2 = {"Lcom/internationalwinecooler/model/RegionDatas;", "", "auid", "", "regionData", "", "Lcom/internationalwinecooler/model/RegionDataModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getAuid", "()Ljava/lang/String;", "getRegionData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegionDatas.kt */
public final class RegionDatas {
    @NotNull
    public final String auid;
    @NotNull
    public final List<RegionDataModel> regionData;

    public RegionDatas(@NotNull String str, @NotNull List<RegionDataModel> list) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(list, "regionData");
        this.auid = str;
        this.regionData = list;
    }

    public static /* synthetic */ RegionDatas copy$default(RegionDatas regionDatas, String str, List<RegionDataModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regionDatas.auid;
        }
        if ((i & 2) != 0) {
            list = regionDatas.regionData;
        }
        return regionDatas.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.auid;
    }

    @NotNull
    public final List<RegionDataModel> component2() {
        return this.regionData;
    }

    @NotNull
    public final RegionDatas copy(@NotNull String str, @NotNull List<RegionDataModel> list) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(list, "regionData");
        return new RegionDatas(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionDatas)) {
            return false;
        }
        RegionDatas regionDatas = (RegionDatas) obj;
        return Intrinsics.areEqual((Object) this.auid, (Object) regionDatas.auid) && Intrinsics.areEqual((Object) this.regionData, (Object) regionDatas.regionData);
    }

    @NotNull
    public final String getAuid() {
        return this.auid;
    }

    @NotNull
    public final List<RegionDataModel> getRegionData() {
        return this.regionData;
    }

    public int hashCode() {
        return (this.auid.hashCode() * 31) + this.regionData.hashCode();
    }

    @NotNull
    public String toString() {
        return "RegionDatas(auid=" + this.auid + ", regionData=" + this.regionData + ')';
    }
}
