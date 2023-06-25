package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/SearchCategoryResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "categoryList", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "totalCount", "", "(Ljava/util/List;I)V", "getCategoryList", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SearchCategoryResult.kt */
public final class SearchCategoryResult extends HiResponse {
    @NotNull
    public final List<WineCategoryInfo> categoryList;
    public final int totalCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchCategoryResult(@NotNull List<WineCategoryInfo> list, int i) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "categoryList");
        this.categoryList = list;
        this.totalCount = i;
    }

    public static /* synthetic */ SearchCategoryResult copy$default(SearchCategoryResult searchCategoryResult, List<WineCategoryInfo> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = searchCategoryResult.categoryList;
        }
        if ((i2 & 2) != 0) {
            i = searchCategoryResult.totalCount;
        }
        return searchCategoryResult.copy(list, i);
    }

    @NotNull
    public final List<WineCategoryInfo> component1() {
        return this.categoryList;
    }

    public final int component2() {
        return this.totalCount;
    }

    @NotNull
    public final SearchCategoryResult copy(@NotNull List<WineCategoryInfo> list, int i) {
        Intrinsics.checkNotNullParameter(list, "categoryList");
        return new SearchCategoryResult(list, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCategoryResult)) {
            return false;
        }
        SearchCategoryResult searchCategoryResult = (SearchCategoryResult) obj;
        return Intrinsics.areEqual((Object) this.categoryList, (Object) searchCategoryResult.categoryList) && this.totalCount == searchCategoryResult.totalCount;
    }

    @NotNull
    public final List<WineCategoryInfo> getCategoryList() {
        return this.categoryList;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (this.categoryList.hashCode() * 31) + Integer.hashCode(this.totalCount);
    }

    @NotNull
    public String toString() {
        return "SearchCategoryResult(categoryList=" + this.categoryList + ", totalCount=" + this.totalCount + ')';
    }
}
