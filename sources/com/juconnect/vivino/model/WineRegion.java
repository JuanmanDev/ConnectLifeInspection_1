package com.juconnect.vivino.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, mo47991d2 = {"Lcom/juconnect/vivino/model/WineRegion;", "", "id", "", "name", "", "name_en", "seo_name", "country", "background_image", "Lcom/juconnect/vivino/model/WineImage;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/juconnect/vivino/model/WineImage;)V", "getBackground_image", "()Lcom/juconnect/vivino/model/WineImage;", "getCountry", "()Ljava/lang/String;", "getId", "()J", "getName", "getName_en", "getSeo_name", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineRegion.kt */
public final class WineRegion {
    @NotNull
    public final WineImage background_image;
    @NotNull
    public final String country;

    /* renamed from: id */
    public final long f16736id;
    @NotNull
    public final String name;
    @NotNull
    public final String name_en;
    @NotNull
    public final String seo_name;

    public WineRegion(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull WineImage wineImage) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "name_en");
        Intrinsics.checkNotNullParameter(str3, "seo_name");
        Intrinsics.checkNotNullParameter(str4, "country");
        Intrinsics.checkNotNullParameter(wineImage, "background_image");
        this.f16736id = j;
        this.name = str;
        this.name_en = str2;
        this.seo_name = str3;
        this.country = str4;
        this.background_image = wineImage;
    }

    public static /* synthetic */ WineRegion copy$default(WineRegion wineRegion, long j, String str, String str2, String str3, String str4, WineImage wineImage, int i, Object obj) {
        WineRegion wineRegion2 = wineRegion;
        return wineRegion.copy((i & 1) != 0 ? wineRegion2.f16736id : j, (i & 2) != 0 ? wineRegion2.name : str, (i & 4) != 0 ? wineRegion2.name_en : str2, (i & 8) != 0 ? wineRegion2.seo_name : str3, (i & 16) != 0 ? wineRegion2.country : str4, (i & 32) != 0 ? wineRegion2.background_image : wineImage);
    }

    public final long component1() {
        return this.f16736id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.name_en;
    }

    @NotNull
    public final String component4() {
        return this.seo_name;
    }

    @NotNull
    public final String component5() {
        return this.country;
    }

    @NotNull
    public final WineImage component6() {
        return this.background_image;
    }

    @NotNull
    public final WineRegion copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull WineImage wineImage) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "name_en");
        Intrinsics.checkNotNullParameter(str3, "seo_name");
        Intrinsics.checkNotNullParameter(str4, "country");
        WineImage wineImage2 = wineImage;
        Intrinsics.checkNotNullParameter(wineImage2, "background_image");
        return new WineRegion(j, str, str2, str3, str4, wineImage2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineRegion)) {
            return false;
        }
        WineRegion wineRegion = (WineRegion) obj;
        return this.f16736id == wineRegion.f16736id && Intrinsics.areEqual((Object) this.name, (Object) wineRegion.name) && Intrinsics.areEqual((Object) this.name_en, (Object) wineRegion.name_en) && Intrinsics.areEqual((Object) this.seo_name, (Object) wineRegion.seo_name) && Intrinsics.areEqual((Object) this.country, (Object) wineRegion.country) && Intrinsics.areEqual((Object) this.background_image, (Object) wineRegion.background_image);
    }

    @NotNull
    public final WineImage getBackground_image() {
        return this.background_image;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public final long getId() {
        return this.f16736id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getName_en() {
        return this.name_en;
    }

    @NotNull
    public final String getSeo_name() {
        return this.seo_name;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f16736id) * 31) + this.name.hashCode()) * 31) + this.name_en.hashCode()) * 31) + this.seo_name.hashCode()) * 31) + this.country.hashCode()) * 31) + this.background_image.hashCode();
    }

    @NotNull
    public String toString() {
        return "WineRegion(id=" + this.f16736id + ", name=" + this.name + ", name_en=" + this.name_en + ", seo_name=" + this.seo_name + ", country=" + this.country + ", background_image=" + this.background_image + ')';
    }
}
