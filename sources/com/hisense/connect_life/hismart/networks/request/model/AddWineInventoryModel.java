package com.hisense.connect_life.hismart.networks.request.model;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/model/AddWineInventoryModel;", "", "categoryId", "", "photo", "Ljava/io/File;", "deviceList", "", "Lcom/hisense/connect_life/hismart/networks/request/model/DeviceZoneModel;", "(JLjava/io/File;Ljava/util/List;)V", "getCategoryId", "()J", "setCategoryId", "(J)V", "getDeviceList", "()Ljava/util/List;", "setDeviceList", "(Ljava/util/List;)V", "getPhoto", "()Ljava/io/File;", "setPhoto", "(Ljava/io/File;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddWineInventoryModel.kt */
public final class AddWineInventoryModel {
    public long categoryId;
    @NotNull
    public List<DeviceZoneModel> deviceList;
    @NotNull
    public File photo;

    public AddWineInventoryModel(long j, @NotNull File file, @NotNull List<DeviceZoneModel> list) {
        Intrinsics.checkNotNullParameter(file, "photo");
        Intrinsics.checkNotNullParameter(list, "deviceList");
        this.categoryId = j;
        this.photo = file;
        this.deviceList = list;
    }

    public static /* synthetic */ AddWineInventoryModel copy$default(AddWineInventoryModel addWineInventoryModel, long j, File file, List<DeviceZoneModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = addWineInventoryModel.categoryId;
        }
        if ((i & 2) != 0) {
            file = addWineInventoryModel.photo;
        }
        if ((i & 4) != 0) {
            list = addWineInventoryModel.deviceList;
        }
        return addWineInventoryModel.copy(j, file, list);
    }

    public final long component1() {
        return this.categoryId;
    }

    @NotNull
    public final File component2() {
        return this.photo;
    }

    @NotNull
    public final List<DeviceZoneModel> component3() {
        return this.deviceList;
    }

    @NotNull
    public final AddWineInventoryModel copy(long j, @NotNull File file, @NotNull List<DeviceZoneModel> list) {
        Intrinsics.checkNotNullParameter(file, "photo");
        Intrinsics.checkNotNullParameter(list, "deviceList");
        return new AddWineInventoryModel(j, file, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddWineInventoryModel)) {
            return false;
        }
        AddWineInventoryModel addWineInventoryModel = (AddWineInventoryModel) obj;
        return this.categoryId == addWineInventoryModel.categoryId && Intrinsics.areEqual((Object) this.photo, (Object) addWineInventoryModel.photo) && Intrinsics.areEqual((Object) this.deviceList, (Object) addWineInventoryModel.deviceList);
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final List<DeviceZoneModel> getDeviceList() {
        return this.deviceList;
    }

    @NotNull
    public final File getPhoto() {
        return this.photo;
    }

    public int hashCode() {
        return (((Long.hashCode(this.categoryId) * 31) + this.photo.hashCode()) * 31) + this.deviceList.hashCode();
    }

    public final void setCategoryId(long j) {
        this.categoryId = j;
    }

    public final void setDeviceList(@NotNull List<DeviceZoneModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.deviceList = list;
    }

    public final void setPhoto(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<set-?>");
        this.photo = file;
    }

    @NotNull
    public String toString() {
        return "AddWineInventoryModel(categoryId=" + this.categoryId + ", photo=" + this.photo + ", deviceList=" + this.deviceList + ')';
    }
}
