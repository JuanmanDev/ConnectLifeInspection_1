package com.hisense.connect_life.hismart.networks.request.wine.model;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategoryResult;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "categoryId", "", "photoUrl", "", "(ILjava/lang/String;)V", "getCategoryId", "()I", "getPhotoUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddWineCategoryResult.kt */
public final class AddWineCategoryResult extends HiResponse {
    public final int categoryId;
    @NotNull
    public final String photoUrl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddWineCategoryResult(int i, @NotNull String str) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "photoUrl");
        this.categoryId = i;
        this.photoUrl = str;
    }

    public static /* synthetic */ AddWineCategoryResult copy$default(AddWineCategoryResult addWineCategoryResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addWineCategoryResult.categoryId;
        }
        if ((i2 & 2) != 0) {
            str = addWineCategoryResult.photoUrl;
        }
        return addWineCategoryResult.copy(i, str);
    }

    public final int component1() {
        return this.categoryId;
    }

    @NotNull
    public final String component2() {
        return this.photoUrl;
    }

    @NotNull
    public final AddWineCategoryResult copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "photoUrl");
        return new AddWineCategoryResult(i, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddWineCategoryResult)) {
            return false;
        }
        AddWineCategoryResult addWineCategoryResult = (AddWineCategoryResult) obj;
        return this.categoryId == addWineCategoryResult.categoryId && Intrinsics.areEqual((Object) this.photoUrl, (Object) addWineCategoryResult.photoUrl);
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public int hashCode() {
        return (Integer.hashCode(this.categoryId) * 31) + this.photoUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "AddWineCategoryResult(categoryId=" + this.categoryId + ", photoUrl=" + this.photoUrl + ')';
    }
}
