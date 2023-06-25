package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "lastUpdateTime", "", "categoryList", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "totalCount", "", "(JLjava/util/List;I)V", "getCategoryList", "()Ljava/util/List;", "getLastUpdateTime", "()J", "getTotalCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: QueryCategory.kt */
public final class QueryCategoryResult extends HiResponse {
    @NotNull
    public final List<WineCategoryInfo> categoryList;
    public final long lastUpdateTime;
    public final int totalCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QueryCategoryResult(long j, @NotNull List<WineCategoryInfo> list, int i) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "categoryList");
        this.lastUpdateTime = j;
        this.categoryList = list;
        this.totalCount = i;
    }

    public static /* synthetic */ QueryCategoryResult copy$default(QueryCategoryResult queryCategoryResult, long j, List<WineCategoryInfo> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = queryCategoryResult.lastUpdateTime;
        }
        if ((i2 & 2) != 0) {
            list = queryCategoryResult.categoryList;
        }
        if ((i2 & 4) != 0) {
            i = queryCategoryResult.totalCount;
        }
        return queryCategoryResult.copy(j, list, i);
    }

    public final long component1() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final List<WineCategoryInfo> component2() {
        return this.categoryList;
    }

    public final int component3() {
        return this.totalCount;
    }

    @NotNull
    public final QueryCategoryResult copy(long j, @NotNull List<WineCategoryInfo> list, int i) {
        Intrinsics.checkNotNullParameter(list, "categoryList");
        return new QueryCategoryResult(j, list, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryCategoryResult)) {
            return false;
        }
        QueryCategoryResult queryCategoryResult = (QueryCategoryResult) obj;
        return this.lastUpdateTime == queryCategoryResult.lastUpdateTime && Intrinsics.areEqual((Object) this.categoryList, (Object) queryCategoryResult.categoryList) && this.totalCount == queryCategoryResult.totalCount;
    }

    @NotNull
    public final List<WineCategoryInfo> getCategoryList() {
        return this.categoryList;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (((Long.hashCode(this.lastUpdateTime) * 31) + this.categoryList.hashCode()) * 31) + Integer.hashCode(this.totalCount);
    }

    @NotNull
    public String toString() {
        return "QueryCategoryResult(lastUpdateTime=" + this.lastUpdateTime + ", categoryList=" + this.categoryList + ", totalCount=" + this.totalCount + ')';
    }
}
