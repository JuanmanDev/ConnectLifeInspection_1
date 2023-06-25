package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryByNameResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "categoryList", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "(Ljava/util/List;)V", "getCategoryList", "()Ljava/util/List;", "setCategoryList", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: QueryCategoryByName.kt */
public final class QueryCategoryByNameResult extends HiResponse {
    @NotNull
    public List<WineCategoryInfo> categoryList;

    public QueryCategoryByNameResult() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QueryCategoryByNameResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<WineCategoryInfo> getCategoryList() {
        return this.categoryList;
    }

    public final void setCategoryList(@NotNull List<WineCategoryInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.categoryList = list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QueryCategoryByNameResult(@NotNull List<WineCategoryInfo> list) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "categoryList");
        this.categoryList = list;
    }
}
