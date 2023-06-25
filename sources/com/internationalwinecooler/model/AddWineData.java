package com.internationalwinecooler.model;

import com.juconnect.vivino.model.HiVintage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/internationalwinecooler/model/AddWineData;", "", "vivinoData", "Lcom/juconnect/vivino/model/HiVintage;", "imageData", "", "(Lcom/juconnect/vivino/model/HiVintage;Ljava/lang/String;)V", "getImageData", "()Ljava/lang/String;", "getVivinoData", "()Lcom/juconnect/vivino/model/HiVintage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddWineData.kt */
public final class AddWineData {
    @NotNull
    public final String imageData;
    @NotNull
    public final HiVintage vivinoData;

    public AddWineData(@NotNull HiVintage hiVintage, @NotNull String str) {
        Intrinsics.checkNotNullParameter(hiVintage, "vivinoData");
        Intrinsics.checkNotNullParameter(str, "imageData");
        this.vivinoData = hiVintage;
        this.imageData = str;
    }

    public static /* synthetic */ AddWineData copy$default(AddWineData addWineData, HiVintage hiVintage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hiVintage = addWineData.vivinoData;
        }
        if ((i & 2) != 0) {
            str = addWineData.imageData;
        }
        return addWineData.copy(hiVintage, str);
    }

    @NotNull
    public final HiVintage component1() {
        return this.vivinoData;
    }

    @NotNull
    public final String component2() {
        return this.imageData;
    }

    @NotNull
    public final AddWineData copy(@NotNull HiVintage hiVintage, @NotNull String str) {
        Intrinsics.checkNotNullParameter(hiVintage, "vivinoData");
        Intrinsics.checkNotNullParameter(str, "imageData");
        return new AddWineData(hiVintage, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddWineData)) {
            return false;
        }
        AddWineData addWineData = (AddWineData) obj;
        return Intrinsics.areEqual((Object) this.vivinoData, (Object) addWineData.vivinoData) && Intrinsics.areEqual((Object) this.imageData, (Object) addWineData.imageData);
    }

    @NotNull
    public final String getImageData() {
        return this.imageData;
    }

    @NotNull
    public final HiVintage getVivinoData() {
        return this.vivinoData;
    }

    public int hashCode() {
        return (this.vivinoData.hashCode() * 31) + this.imageData.hashCode();
    }

    @NotNull
    public String toString() {
        return "AddWineData(vivinoData=" + this.vivinoData + ", imageData=" + this.imageData + ')';
    }
}
