package com.hisense.connect_life.hismart.networks.request.wine.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryByName;", "", "queryName", "", "isRemoved", "", "deviceId", "sortCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/SortCondition;", "(Ljava/lang/String;ILjava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/wine/model/SortCondition;)V", "getDeviceId", "()Ljava/lang/String;", "()I", "getQueryName", "getSortCondition", "()Lcom/hisense/connect_life/hismart/networks/request/wine/model/SortCondition;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: QueryCategoryByName.kt */
public final class QueryCategoryByName {
    @Nullable
    public final String deviceId;
    public final int isRemoved;
    @NotNull
    public final String queryName;
    @NotNull
    public final SortCondition sortCondition;

    public QueryCategoryByName(@NotNull String str, int i, @Nullable String str2, @NotNull SortCondition sortCondition2) {
        Intrinsics.checkNotNullParameter(str, "queryName");
        Intrinsics.checkNotNullParameter(sortCondition2, "sortCondition");
        this.queryName = str;
        this.isRemoved = i;
        this.deviceId = str2;
        this.sortCondition = sortCondition2;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getQueryName() {
        return this.queryName;
    }

    @NotNull
    public final SortCondition getSortCondition() {
        return this.sortCondition;
    }

    public final int isRemoved() {
        return this.isRemoved;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QueryCategoryByName(String str, int i, String str2, SortCondition sortCondition2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? new SortCondition("3") : sortCondition2);
    }
}
