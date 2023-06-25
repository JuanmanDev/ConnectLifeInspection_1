package com.juconnect.vivino.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, mo47991d2 = {"Lcom/juconnect/vivino/model/WineryStatistic;", "", "labels_count", "", "ratings_average", "", "ratings_count", "wines_count", "vintages_count", "(IDIII)V", "getLabels_count", "()I", "getRatings_average", "()D", "getRatings_count", "getVintages_count", "getWines_count", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineryStatistic.kt */
public final class WineryStatistic {
    public final int labels_count;
    public final double ratings_average;
    public final int ratings_count;
    public final int vintages_count;
    public final int wines_count;

    public WineryStatistic(int i, double d, int i2, int i3, int i4) {
        this.labels_count = i;
        this.ratings_average = d;
        this.ratings_count = i2;
        this.wines_count = i3;
        this.vintages_count = i4;
    }

    public static /* synthetic */ WineryStatistic copy$default(WineryStatistic wineryStatistic, int i, double d, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = wineryStatistic.labels_count;
        }
        if ((i5 & 2) != 0) {
            d = wineryStatistic.ratings_average;
        }
        double d2 = d;
        if ((i5 & 4) != 0) {
            i2 = wineryStatistic.ratings_count;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = wineryStatistic.wines_count;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = wineryStatistic.vintages_count;
        }
        return wineryStatistic.copy(i, d2, i6, i7, i4);
    }

    public final int component1() {
        return this.labels_count;
    }

    public final double component2() {
        return this.ratings_average;
    }

    public final int component3() {
        return this.ratings_count;
    }

    public final int component4() {
        return this.wines_count;
    }

    public final int component5() {
        return this.vintages_count;
    }

    @NotNull
    public final WineryStatistic copy(int i, double d, int i2, int i3, int i4) {
        return new WineryStatistic(i, d, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineryStatistic)) {
            return false;
        }
        WineryStatistic wineryStatistic = (WineryStatistic) obj;
        return this.labels_count == wineryStatistic.labels_count && Intrinsics.areEqual((Object) Double.valueOf(this.ratings_average), (Object) Double.valueOf(wineryStatistic.ratings_average)) && this.ratings_count == wineryStatistic.ratings_count && this.wines_count == wineryStatistic.wines_count && this.vintages_count == wineryStatistic.vintages_count;
    }

    public final int getLabels_count() {
        return this.labels_count;
    }

    public final double getRatings_average() {
        return this.ratings_average;
    }

    public final int getRatings_count() {
        return this.ratings_count;
    }

    public final int getVintages_count() {
        return this.vintages_count;
    }

    public final int getWines_count() {
        return this.wines_count;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.labels_count) * 31) + Double.hashCode(this.ratings_average)) * 31) + Integer.hashCode(this.ratings_count)) * 31) + Integer.hashCode(this.wines_count)) * 31) + Integer.hashCode(this.vintages_count);
    }

    @NotNull
    public String toString() {
        return "WineryStatistic(labels_count=" + this.labels_count + ", ratings_average=" + this.ratings_average + ", ratings_count=" + this.ratings_count + ", wines_count=" + this.wines_count + ", vintages_count=" + this.vintages_count + ')';
    }
}
