package com.internationalwinecooler.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, mo47991d2 = {"Lcom/internationalwinecooler/model/RegionDataModel;", "", "region", "", "shelfData", "", "Lcom/internationalwinecooler/model/ShelfDataModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getRegion", "()Ljava/lang/String;", "getShelfData", "()Ljava/util/List;", "setShelfData", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegionDataModel.kt */
public final class RegionDataModel {
    @NotNull
    public final String region;
    @NotNull
    public List<ShelfDataModel> shelfData;

    public RegionDataModel(@NotNull String str, @NotNull List<ShelfDataModel> list) {
        Intrinsics.checkNotNullParameter(str, "region");
        Intrinsics.checkNotNullParameter(list, "shelfData");
        this.region = str;
        this.shelfData = list;
    }

    public static /* synthetic */ RegionDataModel copy$default(RegionDataModel regionDataModel, String str, List<ShelfDataModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regionDataModel.region;
        }
        if ((i & 2) != 0) {
            list = regionDataModel.shelfData;
        }
        return regionDataModel.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.region;
    }

    @NotNull
    public final List<ShelfDataModel> component2() {
        return this.shelfData;
    }

    @NotNull
    public final RegionDataModel copy(@NotNull String str, @NotNull List<ShelfDataModel> list) {
        Intrinsics.checkNotNullParameter(str, "region");
        Intrinsics.checkNotNullParameter(list, "shelfData");
        return new RegionDataModel(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) RegionDataModel.class, (Object) obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            return Intrinsics.areEqual((Object) this.region, (Object) ((RegionDataModel) obj).region);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.internationalwinecooler.model.RegionDataModel");
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final List<ShelfDataModel> getShelfData() {
        return this.shelfData;
    }

    public int hashCode() {
        return this.region.hashCode();
    }

    public final void setShelfData(@NotNull List<ShelfDataModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shelfData = list;
    }

    @NotNull
    public String toString() {
        return "RegionDataModel(region=" + this.region + ", shelfData=" + this.shelfData + ')';
    }
}
