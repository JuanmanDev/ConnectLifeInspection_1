package com.internationalwinecooler.p529ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/FavoriteModel;", "", "categoryId", "", "favorite", "", "(Ljava/lang/String;I)V", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "getFavorite", "()I", "setFavorite", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.FavoriteModel */
/* compiled from: FavoriteModel.kt */
public final class FavoriteModel {
    @Nullable
    public String categoryId;
    public int favorite;

    public FavoriteModel() {
        this((String) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public FavoriteModel(@Nullable String str, int i) {
        this.categoryId = str;
        this.favorite = i;
    }

    public static /* synthetic */ FavoriteModel copy$default(FavoriteModel favoriteModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = favoriteModel.categoryId;
        }
        if ((i2 & 2) != 0) {
            i = favoriteModel.favorite;
        }
        return favoriteModel.copy(str, i);
    }

    @Nullable
    public final String component1() {
        return this.categoryId;
    }

    public final int component2() {
        return this.favorite;
    }

    @NotNull
    public final FavoriteModel copy(@Nullable String str, int i) {
        return new FavoriteModel(str, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteModel)) {
            return false;
        }
        FavoriteModel favoriteModel = (FavoriteModel) obj;
        return Intrinsics.areEqual((Object) this.categoryId, (Object) favoriteModel.categoryId) && this.favorite == favoriteModel.favorite;
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    public final int getFavorite() {
        return this.favorite;
    }

    public int hashCode() {
        String str = this.categoryId;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.favorite);
    }

    public final void setCategoryId(@Nullable String str) {
        this.categoryId = str;
    }

    public final void setFavorite(int i) {
        this.favorite = i;
    }

    @NotNull
    public String toString() {
        return "FavoriteModel(categoryId=" + this.categoryId + ", favorite=" + this.favorite + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FavoriteModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }
}
