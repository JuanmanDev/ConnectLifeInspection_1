package com.hisense.connect_life.hismart.networks.request.wine.model;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWine;", "", "categoryId", "", "photo", "Ljava/io/File;", "deviceList", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineItemInfo;", "(Ljava/lang/Long;Ljava/io/File;Ljava/util/List;)V", "getCategoryId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDeviceList", "()Ljava/util/List;", "getPhoto", "()Ljava/io/File;", "setPhoto", "(Ljava/io/File;)V", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddWine.kt */
public final class AddWine {
    @Nullable
    public final Long categoryId;
    @Nullable
    public final List<AddWineItemInfo> deviceList;
    @Nullable
    public File photo;

    public AddWine(@Nullable Long l, @Nullable File file, @Nullable List<AddWineItemInfo> list) {
        this.categoryId = l;
        this.photo = file;
        this.deviceList = list;
    }

    @Nullable
    public final Long getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final List<AddWineItemInfo> getDeviceList() {
        return this.deviceList;
    }

    @Nullable
    public final File getPhoto() {
        return this.photo;
    }

    public final void setPhoto(@Nullable File file) {
        this.photo = file;
    }
}
