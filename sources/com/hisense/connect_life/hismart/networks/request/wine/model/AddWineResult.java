package com.hisense.connect_life.hismart.networks.request.wine.model;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineResult;", "", "categoryId", "", "photoUrl", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getCategoryId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPhotoUrl", "()Ljava/lang/String;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddWineResult.kt */
public final class AddWineResult {
    @Nullable
    public final Long categoryId;
    @Nullable
    public final String photoUrl;

    public AddWineResult(@Nullable Long l, @Nullable String str) {
        this.categoryId = l;
        this.photoUrl = str;
    }

    @Nullable
    public final Long getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getPhotoUrl() {
        return this.photoUrl;
    }
}
