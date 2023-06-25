package com.juconnect.vivino.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, mo47991d2 = {"Lcom/juconnect/vivino/model/WineRank;", "", "country", "Lcom/juconnect/vivino/model/Rank;", "region", "winery", "global", "(Lcom/juconnect/vivino/model/Rank;Lcom/juconnect/vivino/model/Rank;Lcom/juconnect/vivino/model/Rank;Lcom/juconnect/vivino/model/Rank;)V", "getCountry", "()Lcom/juconnect/vivino/model/Rank;", "getGlobal", "getRegion", "getWinery", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineRank.kt */
public final class WineRank {
    @NotNull
    public final Rank country;
    @NotNull
    public final Rank global;
    @NotNull
    public final Rank region;
    @NotNull
    public final Rank winery;

    public WineRank(@NotNull Rank rank, @NotNull Rank rank2, @NotNull Rank rank3, @NotNull Rank rank4) {
        Intrinsics.checkNotNullParameter(rank, "country");
        Intrinsics.checkNotNullParameter(rank2, "region");
        Intrinsics.checkNotNullParameter(rank3, "winery");
        Intrinsics.checkNotNullParameter(rank4, "global");
        this.country = rank;
        this.region = rank2;
        this.winery = rank3;
        this.global = rank4;
    }

    public static /* synthetic */ WineRank copy$default(WineRank wineRank, Rank rank, Rank rank2, Rank rank3, Rank rank4, int i, Object obj) {
        if ((i & 1) != 0) {
            rank = wineRank.country;
        }
        if ((i & 2) != 0) {
            rank2 = wineRank.region;
        }
        if ((i & 4) != 0) {
            rank3 = wineRank.winery;
        }
        if ((i & 8) != 0) {
            rank4 = wineRank.global;
        }
        return wineRank.copy(rank, rank2, rank3, rank4);
    }

    @NotNull
    public final Rank component1() {
        return this.country;
    }

    @NotNull
    public final Rank component2() {
        return this.region;
    }

    @NotNull
    public final Rank component3() {
        return this.winery;
    }

    @NotNull
    public final Rank component4() {
        return this.global;
    }

    @NotNull
    public final WineRank copy(@NotNull Rank rank, @NotNull Rank rank2, @NotNull Rank rank3, @NotNull Rank rank4) {
        Intrinsics.checkNotNullParameter(rank, "country");
        Intrinsics.checkNotNullParameter(rank2, "region");
        Intrinsics.checkNotNullParameter(rank3, "winery");
        Intrinsics.checkNotNullParameter(rank4, "global");
        return new WineRank(rank, rank2, rank3, rank4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineRank)) {
            return false;
        }
        WineRank wineRank = (WineRank) obj;
        return Intrinsics.areEqual((Object) this.country, (Object) wineRank.country) && Intrinsics.areEqual((Object) this.region, (Object) wineRank.region) && Intrinsics.areEqual((Object) this.winery, (Object) wineRank.winery) && Intrinsics.areEqual((Object) this.global, (Object) wineRank.global);
    }

    @NotNull
    public final Rank getCountry() {
        return this.country;
    }

    @NotNull
    public final Rank getGlobal() {
        return this.global;
    }

    @NotNull
    public final Rank getRegion() {
        return this.region;
    }

    @NotNull
    public final Rank getWinery() {
        return this.winery;
    }

    public int hashCode() {
        return (((((this.country.hashCode() * 31) + this.region.hashCode()) * 31) + this.winery.hashCode()) * 31) + this.global.hashCode();
    }

    @NotNull
    public String toString() {
        return "WineRank(country=" + this.country + ", region=" + this.region + ", winery=" + this.winery + ", global=" + this.global + ')';
    }
}
