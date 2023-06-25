package com.juconnect.vivino.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/juconnect/vivino/model/WineImage;", "", "location", "", "variations", "Lcom/juconnect/vivino/model/WineImageVariation;", "(Ljava/lang/String;Lcom/juconnect/vivino/model/WineImageVariation;)V", "getLocation", "()Ljava/lang/String;", "getVariations", "()Lcom/juconnect/vivino/model/WineImageVariation;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineImage.kt */
public final class WineImage {
    @NotNull
    public final String location;
    @NotNull
    public final WineImageVariation variations;

    public WineImage(@NotNull String str, @NotNull WineImageVariation wineImageVariation) {
        Intrinsics.checkNotNullParameter(str, "location");
        Intrinsics.checkNotNullParameter(wineImageVariation, "variations");
        this.location = str;
        this.variations = wineImageVariation;
    }

    public static /* synthetic */ WineImage copy$default(WineImage wineImage, String str, WineImageVariation wineImageVariation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wineImage.location;
        }
        if ((i & 2) != 0) {
            wineImageVariation = wineImage.variations;
        }
        return wineImage.copy(str, wineImageVariation);
    }

    @NotNull
    public final String component1() {
        return this.location;
    }

    @NotNull
    public final WineImageVariation component2() {
        return this.variations;
    }

    @NotNull
    public final WineImage copy(@NotNull String str, @NotNull WineImageVariation wineImageVariation) {
        Intrinsics.checkNotNullParameter(str, "location");
        Intrinsics.checkNotNullParameter(wineImageVariation, "variations");
        return new WineImage(str, wineImageVariation);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineImage)) {
            return false;
        }
        WineImage wineImage = (WineImage) obj;
        return Intrinsics.areEqual((Object) this.location, (Object) wineImage.location) && Intrinsics.areEqual((Object) this.variations, (Object) wineImage.variations);
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final WineImageVariation getVariations() {
        return this.variations;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + this.variations.hashCode();
    }

    @NotNull
    public String toString() {
        return "WineImage(location=" + this.location + ", variations=" + this.variations + ')';
    }
}
