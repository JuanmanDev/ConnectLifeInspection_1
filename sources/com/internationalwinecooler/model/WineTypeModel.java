package com.internationalwinecooler.model;

import com.juconnect.connectlife.model.WineInventoryBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, mo47991d2 = {"Lcom/internationalwinecooler/model/WineTypeModel;", "", "winInfo", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "isThisType", "", "(Lcom/juconnect/connectlife/model/WineInventoryBean;Z)V", "()Z", "getWinInfo", "()Lcom/juconnect/connectlife/model/WineInventoryBean;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineTypeModel.kt */
public final class WineTypeModel {
    public final boolean isThisType;
    @NotNull
    public final WineInventoryBean winInfo;

    public WineTypeModel(@NotNull WineInventoryBean wineInventoryBean, boolean z) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "winInfo");
        this.winInfo = wineInventoryBean;
        this.isThisType = z;
    }

    public static /* synthetic */ WineTypeModel copy$default(WineTypeModel wineTypeModel, WineInventoryBean wineInventoryBean, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wineInventoryBean = wineTypeModel.winInfo;
        }
        if ((i & 2) != 0) {
            z = wineTypeModel.isThisType;
        }
        return wineTypeModel.copy(wineInventoryBean, z);
    }

    @NotNull
    public final WineInventoryBean component1() {
        return this.winInfo;
    }

    public final boolean component2() {
        return this.isThisType;
    }

    @NotNull
    public final WineTypeModel copy(@NotNull WineInventoryBean wineInventoryBean, boolean z) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "winInfo");
        return new WineTypeModel(wineInventoryBean, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineTypeModel)) {
            return false;
        }
        WineTypeModel wineTypeModel = (WineTypeModel) obj;
        return Intrinsics.areEqual((Object) this.winInfo, (Object) wineTypeModel.winInfo) && this.isThisType == wineTypeModel.isThisType;
    }

    @NotNull
    public final WineInventoryBean getWinInfo() {
        return this.winInfo;
    }

    public int hashCode() {
        int hashCode = this.winInfo.hashCode() * 31;
        boolean z = this.isThisType;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isThisType() {
        return this.isThisType;
    }

    @NotNull
    public String toString() {
        return "WineTypeModel(winInfo=" + this.winInfo + ", isThisType=" + this.isThisType + ')';
    }
}
