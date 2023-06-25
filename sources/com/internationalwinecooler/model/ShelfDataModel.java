package com.internationalwinecooler.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, mo47991d2 = {"Lcom/internationalwinecooler/model/ShelfDataModel;", "", "shelfName", "", "wineArr", "", "Lcom/internationalwinecooler/model/WineTypeModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getShelfName", "()Ljava/lang/String;", "getWineArr", "()Ljava/util/List;", "setWineArr", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ShelfDataModel.kt */
public final class ShelfDataModel {
    @NotNull
    public final String shelfName;
    @NotNull
    public List<WineTypeModel> wineArr;

    public ShelfDataModel(@NotNull String str, @NotNull List<WineTypeModel> list) {
        Intrinsics.checkNotNullParameter(str, "shelfName");
        Intrinsics.checkNotNullParameter(list, "wineArr");
        this.shelfName = str;
        this.wineArr = list;
    }

    public static /* synthetic */ ShelfDataModel copy$default(ShelfDataModel shelfDataModel, String str, List<WineTypeModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shelfDataModel.shelfName;
        }
        if ((i & 2) != 0) {
            list = shelfDataModel.wineArr;
        }
        return shelfDataModel.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.shelfName;
    }

    @NotNull
    public final List<WineTypeModel> component2() {
        return this.wineArr;
    }

    @NotNull
    public final ShelfDataModel copy(@NotNull String str, @NotNull List<WineTypeModel> list) {
        Intrinsics.checkNotNullParameter(str, "shelfName");
        Intrinsics.checkNotNullParameter(list, "wineArr");
        return new ShelfDataModel(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShelfDataModel)) {
            return false;
        }
        ShelfDataModel shelfDataModel = (ShelfDataModel) obj;
        return Intrinsics.areEqual((Object) this.shelfName, (Object) shelfDataModel.shelfName) && Intrinsics.areEqual((Object) this.wineArr, (Object) shelfDataModel.wineArr);
    }

    @NotNull
    public final String getShelfName() {
        return this.shelfName;
    }

    @NotNull
    public final List<WineTypeModel> getWineArr() {
        return this.wineArr;
    }

    public int hashCode() {
        return (this.shelfName.hashCode() * 31) + this.wineArr.hashCode();
    }

    public final void setWineArr(@NotNull List<WineTypeModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.wineArr = list;
    }

    @NotNull
    public String toString() {
        return "ShelfDataModel(shelfName=" + this.shelfName + ", wineArr=" + this.wineArr + ')';
    }
}
