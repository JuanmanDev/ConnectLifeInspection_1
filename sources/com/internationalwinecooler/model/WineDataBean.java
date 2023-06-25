package com.internationalwinecooler.model;

import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo47991d2 = {"Lcom/internationalwinecooler/model/WineDataBean;", "", "wineInfo", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "wineList", "", "(Lcom/juconnect/connectlife/model/WineInventoryBean;Ljava/util/List;)V", "getWineInfo", "()Lcom/juconnect/connectlife/model/WineInventoryBean;", "getWineList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineDataBean.kt */
public final class WineDataBean {
    @NotNull
    public final WineInventoryBean wineInfo;
    @NotNull
    public final List<WineInventoryBean> wineList;

    public WineDataBean(@NotNull WineInventoryBean wineInventoryBean, @NotNull List<WineInventoryBean> list) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "wineInfo");
        Intrinsics.checkNotNullParameter(list, "wineList");
        this.wineInfo = wineInventoryBean;
        this.wineList = list;
    }

    public static /* synthetic */ WineDataBean copy$default(WineDataBean wineDataBean, WineInventoryBean wineInventoryBean, List<WineInventoryBean> list, int i, Object obj) {
        if ((i & 1) != 0) {
            wineInventoryBean = wineDataBean.wineInfo;
        }
        if ((i & 2) != 0) {
            list = wineDataBean.wineList;
        }
        return wineDataBean.copy(wineInventoryBean, list);
    }

    @NotNull
    public final WineInventoryBean component1() {
        return this.wineInfo;
    }

    @NotNull
    public final List<WineInventoryBean> component2() {
        return this.wineList;
    }

    @NotNull
    public final WineDataBean copy(@NotNull WineInventoryBean wineInventoryBean, @NotNull List<WineInventoryBean> list) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "wineInfo");
        Intrinsics.checkNotNullParameter(list, "wineList");
        return new WineDataBean(wineInventoryBean, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineDataBean)) {
            return false;
        }
        WineDataBean wineDataBean = (WineDataBean) obj;
        return Intrinsics.areEqual((Object) this.wineInfo, (Object) wineDataBean.wineInfo) && Intrinsics.areEqual((Object) this.wineList, (Object) wineDataBean.wineList);
    }

    @NotNull
    public final WineInventoryBean getWineInfo() {
        return this.wineInfo;
    }

    @NotNull
    public final List<WineInventoryBean> getWineList() {
        return this.wineList;
    }

    public int hashCode() {
        return (this.wineInfo.hashCode() * 31) + this.wineList.hashCode();
    }

    @NotNull
    public String toString() {
        return "WineDataBean(wineInfo=" + this.wineInfo + ", wineList=" + this.wineList + ')';
    }
}
