package com.juconnect.vivino.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00066"}, mo47991d2 = {"Lcom/juconnect/vivino/model/WineImageVariation;", "", "bottle_large", "", "bottle_medium", "bottle_medium_square", "bottle_small", "bottle_small_square", "label", "label_large", "label_medium", "label_medium_square", "label_small_square", "large", "medium", "medium_square", "small_square", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBottle_large", "()Ljava/lang/String;", "getBottle_medium", "getBottle_medium_square", "getBottle_small", "getBottle_small_square", "getLabel", "getLabel_large", "getLabel_medium", "getLabel_medium_square", "getLabel_small_square", "getLarge", "getMedium", "getMedium_square", "getSmall_square", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineImageVariation.kt */
public final class WineImageVariation {
    @Nullable
    public final String bottle_large;
    @Nullable
    public final String bottle_medium;
    @Nullable
    public final String bottle_medium_square;
    @Nullable
    public final String bottle_small;
    @Nullable
    public final String bottle_small_square;
    @Nullable
    public final String label;
    @Nullable
    public final String label_large;
    @Nullable
    public final String label_medium;
    @Nullable
    public final String label_medium_square;
    @Nullable
    public final String label_small_square;
    @Nullable
    public final String large;
    @Nullable
    public final String medium;
    @Nullable
    public final String medium_square;
    @Nullable
    public final String small_square;

    public WineImageVariation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        this.bottle_large = str;
        this.bottle_medium = str2;
        this.bottle_medium_square = str3;
        this.bottle_small = str4;
        this.bottle_small_square = str5;
        this.label = str6;
        this.label_large = str7;
        this.label_medium = str8;
        this.label_medium_square = str9;
        this.label_small_square = str10;
        this.large = str11;
        this.medium = str12;
        this.medium_square = str13;
        this.small_square = str14;
    }

    public static /* synthetic */ WineImageVariation copy$default(WineImageVariation wineImageVariation, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        WineImageVariation wineImageVariation2 = wineImageVariation;
        int i2 = i;
        return wineImageVariation.copy((i2 & 1) != 0 ? wineImageVariation2.bottle_large : str, (i2 & 2) != 0 ? wineImageVariation2.bottle_medium : str2, (i2 & 4) != 0 ? wineImageVariation2.bottle_medium_square : str3, (i2 & 8) != 0 ? wineImageVariation2.bottle_small : str4, (i2 & 16) != 0 ? wineImageVariation2.bottle_small_square : str5, (i2 & 32) != 0 ? wineImageVariation2.label : str6, (i2 & 64) != 0 ? wineImageVariation2.label_large : str7, (i2 & 128) != 0 ? wineImageVariation2.label_medium : str8, (i2 & 256) != 0 ? wineImageVariation2.label_medium_square : str9, (i2 & 512) != 0 ? wineImageVariation2.label_small_square : str10, (i2 & 1024) != 0 ? wineImageVariation2.large : str11, (i2 & 2048) != 0 ? wineImageVariation2.medium : str12, (i2 & 4096) != 0 ? wineImageVariation2.medium_square : str13, (i2 & 8192) != 0 ? wineImageVariation2.small_square : str14);
    }

    @Nullable
    public final String component1() {
        return this.bottle_large;
    }

    @Nullable
    public final String component10() {
        return this.label_small_square;
    }

    @Nullable
    public final String component11() {
        return this.large;
    }

    @Nullable
    public final String component12() {
        return this.medium;
    }

    @Nullable
    public final String component13() {
        return this.medium_square;
    }

    @Nullable
    public final String component14() {
        return this.small_square;
    }

    @Nullable
    public final String component2() {
        return this.bottle_medium;
    }

    @Nullable
    public final String component3() {
        return this.bottle_medium_square;
    }

    @Nullable
    public final String component4() {
        return this.bottle_small;
    }

    @Nullable
    public final String component5() {
        return this.bottle_small_square;
    }

    @Nullable
    public final String component6() {
        return this.label;
    }

    @Nullable
    public final String component7() {
        return this.label_large;
    }

    @Nullable
    public final String component8() {
        return this.label_medium;
    }

    @Nullable
    public final String component9() {
        return this.label_medium_square;
    }

    @NotNull
    public final WineImageVariation copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        return new WineImageVariation(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineImageVariation)) {
            return false;
        }
        WineImageVariation wineImageVariation = (WineImageVariation) obj;
        return Intrinsics.areEqual((Object) this.bottle_large, (Object) wineImageVariation.bottle_large) && Intrinsics.areEqual((Object) this.bottle_medium, (Object) wineImageVariation.bottle_medium) && Intrinsics.areEqual((Object) this.bottle_medium_square, (Object) wineImageVariation.bottle_medium_square) && Intrinsics.areEqual((Object) this.bottle_small, (Object) wineImageVariation.bottle_small) && Intrinsics.areEqual((Object) this.bottle_small_square, (Object) wineImageVariation.bottle_small_square) && Intrinsics.areEqual((Object) this.label, (Object) wineImageVariation.label) && Intrinsics.areEqual((Object) this.label_large, (Object) wineImageVariation.label_large) && Intrinsics.areEqual((Object) this.label_medium, (Object) wineImageVariation.label_medium) && Intrinsics.areEqual((Object) this.label_medium_square, (Object) wineImageVariation.label_medium_square) && Intrinsics.areEqual((Object) this.label_small_square, (Object) wineImageVariation.label_small_square) && Intrinsics.areEqual((Object) this.large, (Object) wineImageVariation.large) && Intrinsics.areEqual((Object) this.medium, (Object) wineImageVariation.medium) && Intrinsics.areEqual((Object) this.medium_square, (Object) wineImageVariation.medium_square) && Intrinsics.areEqual((Object) this.small_square, (Object) wineImageVariation.small_square);
    }

    @Nullable
    public final String getBottle_large() {
        return this.bottle_large;
    }

    @Nullable
    public final String getBottle_medium() {
        return this.bottle_medium;
    }

    @Nullable
    public final String getBottle_medium_square() {
        return this.bottle_medium_square;
    }

    @Nullable
    public final String getBottle_small() {
        return this.bottle_small;
    }

    @Nullable
    public final String getBottle_small_square() {
        return this.bottle_small_square;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getLabel_large() {
        return this.label_large;
    }

    @Nullable
    public final String getLabel_medium() {
        return this.label_medium;
    }

    @Nullable
    public final String getLabel_medium_square() {
        return this.label_medium_square;
    }

    @Nullable
    public final String getLabel_small_square() {
        return this.label_small_square;
    }

    @Nullable
    public final String getLarge() {
        return this.large;
    }

    @Nullable
    public final String getMedium() {
        return this.medium;
    }

    @Nullable
    public final String getMedium_square() {
        return this.medium_square;
    }

    @Nullable
    public final String getSmall_square() {
        return this.small_square;
    }

    public int hashCode() {
        String str = this.bottle_large;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bottle_medium;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottle_medium_square;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bottle_small;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bottle_small_square;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.label;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.label_large;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.label_medium;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.label_medium_square;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.label_small_square;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.large;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.medium;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.medium_square;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.small_square;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return hashCode13 + i;
    }

    @NotNull
    public String toString() {
        return "WineImageVariation(bottle_large=" + this.bottle_large + ", bottle_medium=" + this.bottle_medium + ", bottle_medium_square=" + this.bottle_medium_square + ", bottle_small=" + this.bottle_small + ", bottle_small_square=" + this.bottle_small_square + ", label=" + this.label + ", label_large=" + this.label_large + ", label_medium=" + this.label_medium + ", label_medium_square=" + this.label_medium_square + ", label_small_square=" + this.label_small_square + ", large=" + this.large + ", medium=" + this.medium + ", medium_square=" + this.medium_square + ", small_square=" + this.small_square + ')';
    }
}
