package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/CategoryExistsResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "categoryId", "", "(Ljava/lang/Long;)V", "getCategoryId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/hisense/connect_life/hismart/networks/request/wine/model/CategoryExistsResult;", "equals", "", "other", "", "hashCode", "", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: QueryOneCategory.kt */
public final class CategoryExistsResult extends HiResponse {
    @Nullable
    public final Long categoryId;

    public CategoryExistsResult(@Nullable Long l) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        this.categoryId = l;
    }

    public static /* synthetic */ CategoryExistsResult copy$default(CategoryExistsResult categoryExistsResult, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = categoryExistsResult.categoryId;
        }
        return categoryExistsResult.copy(l);
    }

    @Nullable
    public final Long component1() {
        return this.categoryId;
    }

    @NotNull
    public final CategoryExistsResult copy(@Nullable Long l) {
        return new CategoryExistsResult(l);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryExistsResult) && Intrinsics.areEqual((Object) this.categoryId, (Object) ((CategoryExistsResult) obj).categoryId);
    }

    @Nullable
    public final Long getCategoryId() {
        return this.categoryId;
    }

    public int hashCode() {
        Long l = this.categoryId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @NotNull
    public String toString() {
        return "CategoryExistsResult(categoryId=" + this.categoryId + ')';
    }
}
