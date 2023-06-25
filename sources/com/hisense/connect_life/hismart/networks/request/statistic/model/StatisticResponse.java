package com.hisense.connect_life.hismart.networks.request.statistic.model;

import com.hisense.connect_life.hismart.model.HiResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/statistic/model/StatisticResponse;", "T", "Lcom/hisense/connect_life/hismart/model/HiResponse;", "dataList", "count", "", "(Ljava/lang/Object;I)V", "getCount", "()I", "getDataList", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;I)Lcom/hisense/connect_life/hismart/networks/request/statistic/model/StatisticResponse;", "equals", "", "other", "", "hashCode", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: StatisticResponse.kt */
public final class StatisticResponse<T> extends HiResponse {
    public final int count;
    @Nullable
    public final T dataList;

    public StatisticResponse(@Nullable T t, int i) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        this.dataList = t;
        this.count = i;
    }

    public static /* synthetic */ StatisticResponse copy$default(StatisticResponse statisticResponse, T t, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            t = statisticResponse.dataList;
        }
        if ((i2 & 2) != 0) {
            i = statisticResponse.count;
        }
        return statisticResponse.copy(t, i);
    }

    @Nullable
    public final T component1() {
        return this.dataList;
    }

    public final int component2() {
        return this.count;
    }

    @NotNull
    public final StatisticResponse<T> copy(@Nullable T t, int i) {
        return new StatisticResponse<>(t, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticResponse)) {
            return false;
        }
        StatisticResponse statisticResponse = (StatisticResponse) obj;
        return Intrinsics.areEqual((Object) this.dataList, (Object) statisticResponse.dataList) && this.count == statisticResponse.count;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final T getDataList() {
        return this.dataList;
    }

    public int hashCode() {
        T t = this.dataList;
        return ((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.count);
    }

    @NotNull
    public String toString() {
        return "StatisticResponse(dataList=" + this.dataList + ", count=" + this.count + ')';
    }
}
