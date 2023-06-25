package com.juconnect.vivino.model;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, mo47991d2 = {"Lcom/juconnect/vivino/model/VintageStatistic;", "", "labels_count", "", "ratings_average", "", "ratings_count", "reviews_count", "status", "", "(IDIILjava/lang/String;)V", "getLabels_count", "()I", "getRatings_average", "()D", "getRatings_count", "getReviews_count", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: VintageStatistic.kt */
public final class VintageStatistic {
    public final int labels_count;
    public final double ratings_average;
    public final int ratings_count;
    public final int reviews_count;
    @NotNull
    public final String status;

    public VintageStatistic(int i, double d, int i2, int i3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_STATUS);
        this.labels_count = i;
        this.ratings_average = d;
        this.ratings_count = i2;
        this.reviews_count = i3;
        this.status = str;
    }

    public static /* synthetic */ VintageStatistic copy$default(VintageStatistic vintageStatistic, int i, double d, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = vintageStatistic.labels_count;
        }
        if ((i4 & 2) != 0) {
            d = vintageStatistic.ratings_average;
        }
        double d2 = d;
        if ((i4 & 4) != 0) {
            i2 = vintageStatistic.ratings_count;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = vintageStatistic.reviews_count;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            str = vintageStatistic.status;
        }
        return vintageStatistic.copy(i, d2, i5, i6, str);
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
        return this.reviews_count;
    }

    @NotNull
    public final String component5() {
        return this.status;
    }

    @NotNull
    public final VintageStatistic copy(int i, double d, int i2, int i3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_STATUS);
        return new VintageStatistic(i, d, i2, i3, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VintageStatistic)) {
            return false;
        }
        VintageStatistic vintageStatistic = (VintageStatistic) obj;
        return this.labels_count == vintageStatistic.labels_count && Intrinsics.areEqual((Object) Double.valueOf(this.ratings_average), (Object) Double.valueOf(vintageStatistic.ratings_average)) && this.ratings_count == vintageStatistic.ratings_count && this.reviews_count == vintageStatistic.reviews_count && Intrinsics.areEqual((Object) this.status, (Object) vintageStatistic.status);
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

    public final int getReviews_count() {
        return this.reviews_count;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.labels_count) * 31) + Double.hashCode(this.ratings_average)) * 31) + Integer.hashCode(this.ratings_count)) * 31) + Integer.hashCode(this.reviews_count)) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "VintageStatistic(labels_count=" + this.labels_count + ", ratings_average=" + this.ratings_average + ", ratings_count=" + this.ratings_count + ", reviews_count=" + this.reviews_count + ", status=" + this.status + ')';
    }
}
