package com.juconnect.connectlife.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/WineFavoriteBean;", "", "isFavorite", "", "name", "", "vintage", "", "winery", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "getVintage", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWinery", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/juconnect/connectlife/model/WineFavoriteBean;", "equals", "other", "hashCode", "", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineFavoriteBean.kt */
public final class WineFavoriteBean {
    @Nullable
    public final Boolean isFavorite;
    @Nullable
    public final String name;
    @Nullable
    public final Long vintage;
    @Nullable
    public final String winery;

    public WineFavoriteBean(@Nullable Boolean bool, @Nullable String str, @Nullable Long l, @Nullable String str2) {
        this.isFavorite = bool;
        this.name = str;
        this.vintage = l;
        this.winery = str2;
    }

    public static /* synthetic */ WineFavoriteBean copy$default(WineFavoriteBean wineFavoriteBean, Boolean bool, String str, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = wineFavoriteBean.isFavorite;
        }
        if ((i & 2) != 0) {
            str = wineFavoriteBean.name;
        }
        if ((i & 4) != 0) {
            l = wineFavoriteBean.vintage;
        }
        if ((i & 8) != 0) {
            str2 = wineFavoriteBean.winery;
        }
        return wineFavoriteBean.copy(bool, str, l, str2);
    }

    @Nullable
    public final Boolean component1() {
        return this.isFavorite;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final Long component3() {
        return this.vintage;
    }

    @Nullable
    public final String component4() {
        return this.winery;
    }

    @NotNull
    public final WineFavoriteBean copy(@Nullable Boolean bool, @Nullable String str, @Nullable Long l, @Nullable String str2) {
        return new WineFavoriteBean(bool, str, l, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) WineFavoriteBean.class, (Object) obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            WineFavoriteBean wineFavoriteBean = (WineFavoriteBean) obj;
            return Intrinsics.areEqual((Object) this.name, (Object) wineFavoriteBean.name) && Intrinsics.areEqual((Object) this.vintage, (Object) wineFavoriteBean.vintage) && Intrinsics.areEqual((Object) this.winery, (Object) wineFavoriteBean.winery);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.juconnect.connectlife.model.WineFavoriteBean");
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Long getVintage() {
        return this.vintage;
    }

    @Nullable
    public final String getWinery() {
        return this.winery;
    }

    public int hashCode() {
        Boolean bool = this.isFavorite;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.vintage;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.winery;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        return "WineFavoriteBean(isFavorite=" + this.isFavorite + ", name=" + this.name + ", vintage=" + this.vintage + ", winery=" + this.winery + ')';
    }
}
