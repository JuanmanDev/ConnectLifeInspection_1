package com.juconnect.connectlife.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/WineGroupBean;", "", "item", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "count", "", "(Lcom/juconnect/connectlife/model/WineInventoryBean;I)V", "getCount", "()I", "getItem", "()Lcom/juconnect/connectlife/model/WineInventoryBean;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineGroupBean.kt */
public final class WineGroupBean {
    public final int count;
    @NotNull
    public final WineInventoryBean item;

    public WineGroupBean(@NotNull WineInventoryBean wineInventoryBean, int i) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "item");
        this.item = wineInventoryBean;
        this.count = i;
    }

    public static /* synthetic */ WineGroupBean copy$default(WineGroupBean wineGroupBean, WineInventoryBean wineInventoryBean, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            wineInventoryBean = wineGroupBean.item;
        }
        if ((i2 & 2) != 0) {
            i = wineGroupBean.count;
        }
        return wineGroupBean.copy(wineInventoryBean, i);
    }

    @NotNull
    public final WineInventoryBean component1() {
        return this.item;
    }

    public final int component2() {
        return this.count;
    }

    @NotNull
    public final WineGroupBean copy(@NotNull WineInventoryBean wineInventoryBean, int i) {
        Intrinsics.checkNotNullParameter(wineInventoryBean, "item");
        return new WineGroupBean(wineInventoryBean, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineGroupBean)) {
            return false;
        }
        WineGroupBean wineGroupBean = (WineGroupBean) obj;
        return Intrinsics.areEqual((Object) this.item, (Object) wineGroupBean.item) && this.count == wineGroupBean.count;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final WineInventoryBean getItem() {
        return this.item;
    }

    public int hashCode() {
        return (this.item.hashCode() * 31) + Integer.hashCode(this.count);
    }

    @NotNull
    public String toString() {
        return "WineGroupBean(item=" + this.item + ", count=" + this.count + ')';
    }
}
