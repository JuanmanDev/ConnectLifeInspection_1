package com.internationalwinecooler.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, mo47991d2 = {"Lcom/internationalwinecooler/model/WineSortBaseModel;", "", "pageIndex", "", "pageSize", "sort", "", "filterModel", "Lcom/internationalwinecooler/model/WineFilterModel;", "(IILjava/lang/String;Lcom/internationalwinecooler/model/WineFilterModel;)V", "getFilterModel", "()Lcom/internationalwinecooler/model/WineFilterModel;", "setFilterModel", "(Lcom/internationalwinecooler/model/WineFilterModel;)V", "getPageIndex", "()I", "setPageIndex", "(I)V", "getPageSize", "setPageSize", "getSort", "()Ljava/lang/String;", "setSort", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineSortBaseModel.kt */
public final class WineSortBaseModel {
    @NotNull
    public WineFilterModel filterModel;
    public int pageIndex;
    public int pageSize;
    @NotNull
    public String sort;

    public WineSortBaseModel(int i, int i2, @NotNull String str, @NotNull WineFilterModel wineFilterModel) {
        Intrinsics.checkNotNullParameter(str, "sort");
        Intrinsics.checkNotNullParameter(wineFilterModel, "filterModel");
        this.pageIndex = i;
        this.pageSize = i2;
        this.sort = str;
        this.filterModel = wineFilterModel;
    }

    public static /* synthetic */ WineSortBaseModel copy$default(WineSortBaseModel wineSortBaseModel, int i, int i2, String str, WineFilterModel wineFilterModel, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wineSortBaseModel.pageIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = wineSortBaseModel.pageSize;
        }
        if ((i3 & 4) != 0) {
            str = wineSortBaseModel.sort;
        }
        if ((i3 & 8) != 0) {
            wineFilterModel = wineSortBaseModel.filterModel;
        }
        return wineSortBaseModel.copy(i, i2, str, wineFilterModel);
    }

    public final int component1() {
        return this.pageIndex;
    }

    public final int component2() {
        return this.pageSize;
    }

    @NotNull
    public final String component3() {
        return this.sort;
    }

    @NotNull
    public final WineFilterModel component4() {
        return this.filterModel;
    }

    @NotNull
    public final WineSortBaseModel copy(int i, int i2, @NotNull String str, @NotNull WineFilterModel wineFilterModel) {
        Intrinsics.checkNotNullParameter(str, "sort");
        Intrinsics.checkNotNullParameter(wineFilterModel, "filterModel");
        return new WineSortBaseModel(i, i2, str, wineFilterModel);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineSortBaseModel)) {
            return false;
        }
        WineSortBaseModel wineSortBaseModel = (WineSortBaseModel) obj;
        return this.pageIndex == wineSortBaseModel.pageIndex && this.pageSize == wineSortBaseModel.pageSize && Intrinsics.areEqual((Object) this.sort, (Object) wineSortBaseModel.sort) && Intrinsics.areEqual((Object) this.filterModel, (Object) wineSortBaseModel.filterModel);
    }

    @NotNull
    public final WineFilterModel getFilterModel() {
        return this.filterModel;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final String getSort() {
        return this.sort;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.pageIndex) * 31) + Integer.hashCode(this.pageSize)) * 31) + this.sort.hashCode()) * 31) + this.filterModel.hashCode();
    }

    public final void setFilterModel(@NotNull WineFilterModel wineFilterModel) {
        Intrinsics.checkNotNullParameter(wineFilterModel, "<set-?>");
        this.filterModel = wineFilterModel;
    }

    public final void setPageIndex(int i) {
        this.pageIndex = i;
    }

    public final void setPageSize(int i) {
        this.pageSize = i;
    }

    public final void setSort(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sort = str;
    }

    @NotNull
    public String toString() {
        return "WineSortBaseModel(pageIndex=" + this.pageIndex + ", pageSize=" + this.pageSize + ", sort=" + this.sort + ", filterModel=" + this.filterModel + ')';
    }
}
