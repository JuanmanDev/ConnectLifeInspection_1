package com.hisense.connect_life.hismart.networks.request.statistic.model;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/statistic/model/StatisticResult;", "T", "", "response", "(Ljava/lang/Object;)V", "getResponse", "()Ljava/lang/Object;", "Ljava/lang/Object;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: StatisticResult.kt */
public final class StatisticResult<T> {
    @Nullable
    public final T response;

    public StatisticResult(@Nullable T t) {
        this.response = t;
    }

    @Nullable
    public final T getResponse() {
        return this.response;
    }
}
