package com.hisense.connect_life.hismart.networks.request.statistic.model;

import com.google.gson.internal.bind.TypeAdapters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/statistic/model/MonthlyStatistic;", "", "month", "", "humidity", "", "temp", "vibration", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getHumidity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMonth", "()Ljava/lang/String;", "getTemp", "getVibration", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/hisense/connect_life/hismart/networks/request/statistic/model/MonthlyStatistic;", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MonthlyStatistic.kt */
public final class MonthlyStatistic {
    @Nullable
    public final Double humidity;
    @NotNull
    public final String month;
    @Nullable
    public final Double temp;
    @Nullable
    public final Double vibration;

    public MonthlyStatistic(@NotNull String str, @Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
        Intrinsics.checkNotNullParameter(str, TypeAdapters.C838126.MONTH);
        this.month = str;
        this.humidity = d;
        this.temp = d2;
        this.vibration = d3;
    }

    public static /* synthetic */ MonthlyStatistic copy$default(MonthlyStatistic monthlyStatistic, String str, Double d, Double d2, Double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = monthlyStatistic.month;
        }
        if ((i & 2) != 0) {
            d = monthlyStatistic.humidity;
        }
        if ((i & 4) != 0) {
            d2 = monthlyStatistic.temp;
        }
        if ((i & 8) != 0) {
            d3 = monthlyStatistic.vibration;
        }
        return monthlyStatistic.copy(str, d, d2, d3);
    }

    @NotNull
    public final String component1() {
        return this.month;
    }

    @Nullable
    public final Double component2() {
        return this.humidity;
    }

    @Nullable
    public final Double component3() {
        return this.temp;
    }

    @Nullable
    public final Double component4() {
        return this.vibration;
    }

    @NotNull
    public final MonthlyStatistic copy(@NotNull String str, @Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
        Intrinsics.checkNotNullParameter(str, TypeAdapters.C838126.MONTH);
        return new MonthlyStatistic(str, d, d2, d3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonthlyStatistic)) {
            return false;
        }
        MonthlyStatistic monthlyStatistic = (MonthlyStatistic) obj;
        return Intrinsics.areEqual((Object) this.month, (Object) monthlyStatistic.month) && Intrinsics.areEqual((Object) this.humidity, (Object) monthlyStatistic.humidity) && Intrinsics.areEqual((Object) this.temp, (Object) monthlyStatistic.temp) && Intrinsics.areEqual((Object) this.vibration, (Object) monthlyStatistic.vibration);
    }

    @Nullable
    public final Double getHumidity() {
        return this.humidity;
    }

    @NotNull
    public final String getMonth() {
        return this.month;
    }

    @Nullable
    public final Double getTemp() {
        return this.temp;
    }

    @Nullable
    public final Double getVibration() {
        return this.vibration;
    }

    public int hashCode() {
        int hashCode = this.month.hashCode() * 31;
        Double d = this.humidity;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.temp;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.vibration;
        if (d3 != null) {
            i = d3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public String toString() {
        return "MonthlyStatistic(month=" + this.month + ", humidity=" + this.humidity + ", temp=" + this.temp + ", vibration=" + this.vibration + ')';
    }
}
