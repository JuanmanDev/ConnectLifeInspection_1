package com.internationalwinecooler.model;

import com.juconnect.connectlife.model.WineInventoryBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\r¨\u0006%"}, mo47991d2 = {"Lcom/internationalwinecooler/model/InvSortModel;", "", "name", "", "vintage", "", "lastIn", "firstIn", "listWines", "", "Lcom/juconnect/connectlife/model/WineInventoryBean;", "(Ljava/lang/String;JJJLjava/util/List;)V", "getFirstIn", "()J", "setFirstIn", "(J)V", "getLastIn", "setLastIn", "getListWines", "()Ljava/util/List;", "setListWines", "(Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getVintage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InvSortModel.kt */
public final class InvSortModel {
    public long firstIn;
    public long lastIn;
    @NotNull
    public List<WineInventoryBean> listWines;
    @NotNull
    public final String name;
    public final long vintage;

    public InvSortModel(@NotNull String str, long j, long j2, long j3, @NotNull List<WineInventoryBean> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "listWines");
        this.name = str;
        this.vintage = j;
        this.lastIn = j2;
        this.firstIn = j3;
        this.listWines = list;
    }

    public static /* synthetic */ InvSortModel copy$default(InvSortModel invSortModel, String str, long j, long j2, long j3, List list, int i, Object obj) {
        InvSortModel invSortModel2 = invSortModel;
        return invSortModel.copy((i & 1) != 0 ? invSortModel2.name : str, (i & 2) != 0 ? invSortModel2.vintage : j, (i & 4) != 0 ? invSortModel2.lastIn : j2, (i & 8) != 0 ? invSortModel2.firstIn : j3, (i & 16) != 0 ? invSortModel2.listWines : list);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.vintage;
    }

    public final long component3() {
        return this.lastIn;
    }

    public final long component4() {
        return this.firstIn;
    }

    @NotNull
    public final List<WineInventoryBean> component5() {
        return this.listWines;
    }

    @NotNull
    public final InvSortModel copy(@NotNull String str, long j, long j2, long j3, @NotNull List<WineInventoryBean> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        List<WineInventoryBean> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "listWines");
        return new InvSortModel(str, j, j2, j3, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvSortModel)) {
            return false;
        }
        InvSortModel invSortModel = (InvSortModel) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) invSortModel.name) && this.vintage == invSortModel.vintage && this.lastIn == invSortModel.lastIn && this.firstIn == invSortModel.firstIn && Intrinsics.areEqual((Object) this.listWines, (Object) invSortModel.listWines);
    }

    public final long getFirstIn() {
        return this.firstIn;
    }

    public final long getLastIn() {
        return this.lastIn;
    }

    @NotNull
    public final List<WineInventoryBean> getListWines() {
        return this.listWines;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getVintage() {
        return this.vintage;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + Long.hashCode(this.vintage)) * 31) + Long.hashCode(this.lastIn)) * 31) + Long.hashCode(this.firstIn)) * 31) + this.listWines.hashCode();
    }

    public final void setFirstIn(long j) {
        this.firstIn = j;
    }

    public final void setLastIn(long j) {
        this.lastIn = j;
    }

    public final void setListWines(@NotNull List<WineInventoryBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listWines = list;
    }

    @NotNull
    public String toString() {
        return "InvSortModel(name=" + this.name + ", vintage=" + this.vintage + ", lastIn=" + this.lastIn + ", firstIn=" + this.firstIn + ", listWines=" + this.listWines + ')';
    }
}
