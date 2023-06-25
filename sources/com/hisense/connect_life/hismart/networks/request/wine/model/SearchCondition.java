package com.hisense.connect_life.hismart.networks.request.wine.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/SearchCondition;", "", "queryName", "", "isRemoved", "", "(Ljava/lang/String;I)V", "()I", "getQueryName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SearchCategoryResult.kt */
public final class SearchCondition {
    public final int isRemoved;
    @NotNull
    public final String queryName;

    public SearchCondition(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "queryName");
        this.queryName = str;
        this.isRemoved = i;
    }

    public static /* synthetic */ SearchCondition copy$default(SearchCondition searchCondition, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchCondition.queryName;
        }
        if ((i2 & 2) != 0) {
            i = searchCondition.isRemoved;
        }
        return searchCondition.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.queryName;
    }

    public final int component2() {
        return this.isRemoved;
    }

    @NotNull
    public final SearchCondition copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "queryName");
        return new SearchCondition(str, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCondition)) {
            return false;
        }
        SearchCondition searchCondition = (SearchCondition) obj;
        return Intrinsics.areEqual((Object) this.queryName, (Object) searchCondition.queryName) && this.isRemoved == searchCondition.isRemoved;
    }

    @NotNull
    public final String getQueryName() {
        return this.queryName;
    }

    public int hashCode() {
        return (this.queryName.hashCode() * 31) + Integer.hashCode(this.isRemoved);
    }

    public final int isRemoved() {
        return this.isRemoved;
    }

    @NotNull
    public String toString() {
        return "SearchCondition(queryName=" + this.queryName + ", isRemoved=" + this.isRemoved + ')';
    }
}
