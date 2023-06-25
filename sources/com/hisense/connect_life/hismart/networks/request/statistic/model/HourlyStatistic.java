package com.hisense.connect_life.hismart.networks.request.statistic.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/statistic/model/HourlyStatistic;", "", "hour", "", "humidity", "", "temp", "vibration", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getHour", "()Ljava/lang/String;", "getHumidity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTemp", "getVibration", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HourlyStatistic.kt */
public class HourlyStatistic {
    @NotNull
    public final String hour;
    @Nullable
    public final Double humidity;
    @Nullable
    public final Double temp;
    @Nullable
    public final Double vibration;

    public HourlyStatistic(@NotNull String str, @Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
        Intrinsics.checkNotNullParameter(str, "hour");
        this.hour = str;
        this.humidity = d;
        this.temp = d2;
        this.vibration = d3;
    }

    @NotNull
    public final String getHour() {
        return this.hour;
    }

    @Nullable
    public final Double getHumidity() {
        return this.humidity;
    }

    @Nullable
    public final Double getTemp() {
        return this.temp;
    }

    @Nullable
    public final Double getVibration() {
        return this.vibration;
    }

    @NotNull
    public String toString() {
        return "HourlyStatistic(date='" + this.hour + "', humidity=" + this.humidity + ", temp=" + this.temp + ", vibration=" + this.vibration + ')';
    }
}
