package com.juconnect.vivino.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, mo47991d2 = {"Lcom/juconnect/vivino/model/Winery;", "", "id", "", "name", "", "seo_name", "review_status", "statistics", "Lcom/juconnect/vivino/model/WineryStatistic;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/juconnect/vivino/model/WineryStatistic;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getReview_status", "getSeo_name", "getStatistics", "()Lcom/juconnect/vivino/model/WineryStatistic;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Winery.kt */
public final class Winery {

    /* renamed from: id */
    public final long f16737id;
    @NotNull
    public final String name;
    @NotNull
    public final String review_status;
    @NotNull
    public final String seo_name;
    @NotNull
    public final WineryStatistic statistics;

    public Winery(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull WineryStatistic wineryStatistic) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "seo_name");
        Intrinsics.checkNotNullParameter(str3, "review_status");
        Intrinsics.checkNotNullParameter(wineryStatistic, "statistics");
        this.f16737id = j;
        this.name = str;
        this.seo_name = str2;
        this.review_status = str3;
        this.statistics = wineryStatistic;
    }

    public static /* synthetic */ Winery copy$default(Winery winery, long j, String str, String str2, String str3, WineryStatistic wineryStatistic, int i, Object obj) {
        if ((i & 1) != 0) {
            j = winery.f16737id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = winery.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = winery.seo_name;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = winery.review_status;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            wineryStatistic = winery.statistics;
        }
        return winery.copy(j2, str4, str5, str6, wineryStatistic);
    }

    public final long component1() {
        return this.f16737id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.seo_name;
    }

    @NotNull
    public final String component4() {
        return this.review_status;
    }

    @NotNull
    public final WineryStatistic component5() {
        return this.statistics;
    }

    @NotNull
    public final Winery copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull WineryStatistic wineryStatistic) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "seo_name");
        Intrinsics.checkNotNullParameter(str3, "review_status");
        Intrinsics.checkNotNullParameter(wineryStatistic, "statistics");
        return new Winery(j, str, str2, str3, wineryStatistic);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Winery)) {
            return false;
        }
        Winery winery = (Winery) obj;
        return this.f16737id == winery.f16737id && Intrinsics.areEqual((Object) this.name, (Object) winery.name) && Intrinsics.areEqual((Object) this.seo_name, (Object) winery.seo_name) && Intrinsics.areEqual((Object) this.review_status, (Object) winery.review_status) && Intrinsics.areEqual((Object) this.statistics, (Object) winery.statistics);
    }

    public final long getId() {
        return this.f16737id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getReview_status() {
        return this.review_status;
    }

    @NotNull
    public final String getSeo_name() {
        return this.seo_name;
    }

    @NotNull
    public final WineryStatistic getStatistics() {
        return this.statistics;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f16737id) * 31) + this.name.hashCode()) * 31) + this.seo_name.hashCode()) * 31) + this.review_status.hashCode()) * 31) + this.statistics.hashCode();
    }

    @NotNull
    public String toString() {
        return "Winery(id=" + this.f16737id + ", name=" + this.name + ", seo_name=" + this.seo_name + ", review_status=" + this.review_status + ", statistics=" + this.statistics + ')';
    }
}
