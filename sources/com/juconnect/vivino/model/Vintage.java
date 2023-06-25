package com.juconnect.vivino.model;

import com.google.gson.internal.bind.TypeAdapters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, mo47991d2 = {"Lcom/juconnect/vivino/model/Vintage;", "", "id", "", "seo_name", "", "year", "name", "statistics", "Lcom/juconnect/vivino/model/VintageStatistic;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/juconnect/vivino/model/VintageStatistic;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getSeo_name", "getStatistics", "()Lcom/juconnect/vivino/model/VintageStatistic;", "getYear", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Vintage.kt */
public final class Vintage {

    /* renamed from: id */
    public final long f16735id;
    @NotNull
    public final String name;
    @NotNull
    public final String seo_name;
    @NotNull
    public final VintageStatistic statistics;
    @NotNull
    public final String year;

    public Vintage(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull VintageStatistic vintageStatistic) {
        Intrinsics.checkNotNullParameter(str, "seo_name");
        Intrinsics.checkNotNullParameter(str2, TypeAdapters.C838126.YEAR);
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(vintageStatistic, "statistics");
        this.f16735id = j;
        this.seo_name = str;
        this.year = str2;
        this.name = str3;
        this.statistics = vintageStatistic;
    }

    public static /* synthetic */ Vintage copy$default(Vintage vintage, long j, String str, String str2, String str3, VintageStatistic vintageStatistic, int i, Object obj) {
        if ((i & 1) != 0) {
            j = vintage.f16735id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = vintage.seo_name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = vintage.year;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = vintage.name;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            vintageStatistic = vintage.statistics;
        }
        return vintage.copy(j2, str4, str5, str6, vintageStatistic);
    }

    public final long component1() {
        return this.f16735id;
    }

    @NotNull
    public final String component2() {
        return this.seo_name;
    }

    @NotNull
    public final String component3() {
        return this.year;
    }

    @NotNull
    public final String component4() {
        return this.name;
    }

    @NotNull
    public final VintageStatistic component5() {
        return this.statistics;
    }

    @NotNull
    public final Vintage copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull VintageStatistic vintageStatistic) {
        Intrinsics.checkNotNullParameter(str, "seo_name");
        Intrinsics.checkNotNullParameter(str2, TypeAdapters.C838126.YEAR);
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(vintageStatistic, "statistics");
        return new Vintage(j, str, str2, str3, vintageStatistic);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vintage)) {
            return false;
        }
        Vintage vintage = (Vintage) obj;
        return this.f16735id == vintage.f16735id && Intrinsics.areEqual((Object) this.seo_name, (Object) vintage.seo_name) && Intrinsics.areEqual((Object) this.year, (Object) vintage.year) && Intrinsics.areEqual((Object) this.name, (Object) vintage.name) && Intrinsics.areEqual((Object) this.statistics, (Object) vintage.statistics);
    }

    public final long getId() {
        return this.f16735id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSeo_name() {
        return this.seo_name;
    }

    @NotNull
    public final VintageStatistic getStatistics() {
        return this.statistics;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f16735id) * 31) + this.seo_name.hashCode()) * 31) + this.year.hashCode()) * 31) + this.name.hashCode()) * 31) + this.statistics.hashCode();
    }

    @NotNull
    public String toString() {
        return "Vintage(id=" + this.f16735id + ", seo_name=" + this.seo_name + ", year=" + this.year + ", name=" + this.name + ", statistics=" + this.statistics + ')';
    }
}
