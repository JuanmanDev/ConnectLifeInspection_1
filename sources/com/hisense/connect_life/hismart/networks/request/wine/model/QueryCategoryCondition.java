package com.hisense.connect_life.hismart.networks.request.wine.model;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryCondition;", "", "filterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "sortCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/SortCondition;", "lastUpdateTime", "", "(Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;Lcom/hisense/connect_life/hismart/networks/request/wine/model/SortCondition;Ljava/lang/Long;)V", "getFilterCondition", "()Lcom/hisense/connect_life/hismart/networks/request/wine/model/FilterCondition;", "getLastUpdateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSortCondition", "()Lcom/hisense/connect_life/hismart/networks/request/wine/model/SortCondition;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: QueryCategory.kt */
public final class QueryCategoryCondition {
    @Nullable
    public final FilterCondition filterCondition;
    @Nullable
    public final Long lastUpdateTime;
    @Nullable
    public final SortCondition sortCondition;

    public QueryCategoryCondition(@Nullable FilterCondition filterCondition2, @Nullable SortCondition sortCondition2, @Nullable Long l) {
        this.filterCondition = filterCondition2;
        this.sortCondition = sortCondition2;
        this.lastUpdateTime = l;
    }

    @Nullable
    public final FilterCondition getFilterCondition() {
        return this.filterCondition;
    }

    @Nullable
    public final Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Nullable
    public final SortCondition getSortCondition() {
        return this.sortCondition;
    }
}
