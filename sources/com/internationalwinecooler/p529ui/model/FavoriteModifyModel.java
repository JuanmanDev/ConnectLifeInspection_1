package com.internationalwinecooler.p529ui.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/model/FavoriteModifyModel;", "", "favorite", "", "(I)V", "getFavorite", "()I", "setFavorite", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.internationalwinecooler.ui.model.FavoriteModifyModel */
/* compiled from: FavoriteModifyModel.kt */
public final class FavoriteModifyModel {
    public int favorite;

    public FavoriteModifyModel(int i) {
        this.favorite = i;
    }

    public static /* synthetic */ FavoriteModifyModel copy$default(FavoriteModifyModel favoriteModifyModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = favoriteModifyModel.favorite;
        }
        return favoriteModifyModel.copy(i);
    }

    public final int component1() {
        return this.favorite;
    }

    @NotNull
    public final FavoriteModifyModel copy(int i) {
        return new FavoriteModifyModel(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FavoriteModifyModel) && this.favorite == ((FavoriteModifyModel) obj).favorite;
    }

    public final int getFavorite() {
        return this.favorite;
    }

    public int hashCode() {
        return Integer.hashCode(this.favorite);
    }

    public final void setFavorite(int i) {
        this.favorite = i;
    }

    @NotNull
    public String toString() {
        return "FavoriteModifyModel(favorite=" + this.favorite + ')';
    }
}
