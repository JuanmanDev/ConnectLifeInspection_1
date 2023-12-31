package com.juconnect.connectlife.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/AddWineBean;", "", "image", "", "imageFormat", "itemGroups", "", "Lcom/juconnect/connectlife/model/WineGroupBean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getImage", "()Ljava/lang/String;", "getImageFormat", "getItemGroups", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddWineBean.kt */
public final class AddWineBean {
    @NotNull
    public final String image;
    @NotNull
    public final String imageFormat;
    @NotNull
    public final List<WineGroupBean> itemGroups;

    public AddWineBean(@NotNull String str, @NotNull String str2, @NotNull List<WineGroupBean> list) {
        Intrinsics.checkNotNullParameter(str, "image");
        Intrinsics.checkNotNullParameter(str2, "imageFormat");
        Intrinsics.checkNotNullParameter(list, "itemGroups");
        this.image = str;
        this.imageFormat = str2;
        this.itemGroups = list;
    }

    public static /* synthetic */ AddWineBean copy$default(AddWineBean addWineBean, String str, String str2, List<WineGroupBean> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addWineBean.image;
        }
        if ((i & 2) != 0) {
            str2 = addWineBean.imageFormat;
        }
        if ((i & 4) != 0) {
            list = addWineBean.itemGroups;
        }
        return addWineBean.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.image;
    }

    @NotNull
    public final String component2() {
        return this.imageFormat;
    }

    @NotNull
    public final List<WineGroupBean> component3() {
        return this.itemGroups;
    }

    @NotNull
    public final AddWineBean copy(@NotNull String str, @NotNull String str2, @NotNull List<WineGroupBean> list) {
        Intrinsics.checkNotNullParameter(str, "image");
        Intrinsics.checkNotNullParameter(str2, "imageFormat");
        Intrinsics.checkNotNullParameter(list, "itemGroups");
        return new AddWineBean(str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddWineBean)) {
            return false;
        }
        AddWineBean addWineBean = (AddWineBean) obj;
        return Intrinsics.areEqual((Object) this.image, (Object) addWineBean.image) && Intrinsics.areEqual((Object) this.imageFormat, (Object) addWineBean.imageFormat) && Intrinsics.areEqual((Object) this.itemGroups, (Object) addWineBean.itemGroups);
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getImageFormat() {
        return this.imageFormat;
    }

    @NotNull
    public final List<WineGroupBean> getItemGroups() {
        return this.itemGroups;
    }

    public int hashCode() {
        return (((this.image.hashCode() * 31) + this.imageFormat.hashCode()) * 31) + this.itemGroups.hashCode();
    }

    @NotNull
    public String toString() {
        return "AddWineBean(image=" + this.image + ", imageFormat=" + this.imageFormat + ", itemGroups=" + this.itemGroups + ')';
    }
}
