package com.juconnect.vivino.model;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b?\b\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0012¢\u0006\u0002\u0010!J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0012HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014HÆ\u0003J\t\u0010H\u001a\u00020\u0012HÆ\u0003J\t\u0010I\u001a\u00020\u001cHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0012HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003J\t\u0010R\u001a\u00020\u000bHÆ\u0003J\t\u0010S\u001a\u00020\rHÆ\u0003J\t\u0010T\u001a\u00020\u000fHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jñ\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u0012HÆ\u0001J\u0013\u0010W\u001a\u00020\u00122\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020\u000bHÖ\u0001J\t\u0010Z\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010 \u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u001a\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010/R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010/R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006["}, mo47991d2 = {"Lcom/juconnect/vivino/model/HiWine;", "", "id", "", "name", "", "seo_name", "type_id", "region", "Lcom/juconnect/vivino/model/WineRegion;", "review_status", "", "winery", "Lcom/juconnect/vivino/model/Winery;", "statistics", "Lcom/juconnect/vivino/model/WineryStatistic;", "rank", "hidden", "", "vintages", "", "Lcom/juconnect/vivino/model/Vintage;", "description", "style_id", "grapes", "foods", "non_vintage", "alcohol", "", "sweetness_id", "vintage_mask_raw", "created_at", "is_first_wine", "(JLjava/lang/String;Ljava/lang/String;JLcom/juconnect/vivino/model/WineRegion;ILcom/juconnect/vivino/model/Winery;Lcom/juconnect/vivino/model/WineryStatistic;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;JLjava/util/List;Ljava/util/List;ZDJLjava/lang/String;Ljava/lang/String;Z)V", "getAlcohol", "()D", "getCreated_at", "()Ljava/lang/String;", "getDescription", "getFoods", "()Ljava/util/List;", "getGrapes", "getHidden", "()Z", "setHidden", "(Z)V", "getId", "()J", "getName", "getNon_vintage", "getRank", "getRegion", "()Lcom/juconnect/vivino/model/WineRegion;", "getReview_status", "()I", "getSeo_name", "getStatistics", "()Lcom/juconnect/vivino/model/WineryStatistic;", "getStyle_id", "getSweetness_id", "getType_id", "getVintage_mask_raw", "getVintages", "getWinery", "()Lcom/juconnect/vivino/model/Winery;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiWine.kt */
public final class HiWine {
    public final double alcohol;
    @NotNull
    public final String created_at;
    @NotNull
    public final String description;
    @NotNull
    public final List<Integer> foods;
    @NotNull
    public final List<Integer> grapes;
    public boolean hidden;

    /* renamed from: id */
    public final long f16733id;
    public final boolean is_first_wine;
    @NotNull
    public final String name;
    public final boolean non_vintage;
    @Nullable
    public final String rank;
    @NotNull
    public final WineRegion region;
    public final int review_status;
    @NotNull
    public final String seo_name;
    @NotNull
    public final WineryStatistic statistics;
    public final long style_id;
    public final long sweetness_id;
    public final long type_id;
    @Nullable
    public final String vintage_mask_raw;
    @NotNull
    public final List<Vintage> vintages;
    @NotNull
    public final Winery winery;

    public HiWine(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull WineRegion wineRegion, int i, @NotNull Winery winery2, @NotNull WineryStatistic wineryStatistic, @Nullable String str3, boolean z, @NotNull List<Vintage> list, @NotNull String str4, long j3, @NotNull List<Integer> list2, @NotNull List<Integer> list3, boolean z2, double d, long j4, @Nullable String str5, @NotNull String str6, boolean z3) {
        String str7 = str;
        String str8 = str2;
        WineRegion wineRegion2 = wineRegion;
        Winery winery3 = winery2;
        WineryStatistic wineryStatistic2 = wineryStatistic;
        List<Vintage> list4 = list;
        String str9 = str4;
        List<Integer> list5 = list2;
        List<Integer> list6 = list3;
        String str10 = str6;
        Intrinsics.checkNotNullParameter(str7, "name");
        Intrinsics.checkNotNullParameter(str8, "seo_name");
        Intrinsics.checkNotNullParameter(wineRegion2, "region");
        Intrinsics.checkNotNullParameter(winery3, "winery");
        Intrinsics.checkNotNullParameter(wineryStatistic2, "statistics");
        Intrinsics.checkNotNullParameter(list4, "vintages");
        Intrinsics.checkNotNullParameter(str9, BundleJUnitUtils.KEY_DESCRIPTION);
        Intrinsics.checkNotNullParameter(list5, "grapes");
        Intrinsics.checkNotNullParameter(list6, "foods");
        Intrinsics.checkNotNullParameter(str10, "created_at");
        this.f16733id = j;
        this.name = str7;
        this.seo_name = str8;
        this.type_id = j2;
        this.region = wineRegion2;
        this.review_status = i;
        this.winery = winery3;
        this.statistics = wineryStatistic2;
        this.rank = str3;
        this.hidden = z;
        this.vintages = list4;
        this.description = str9;
        this.style_id = j3;
        this.grapes = list5;
        this.foods = list6;
        this.non_vintage = z2;
        this.alcohol = d;
        this.sweetness_id = j4;
        this.vintage_mask_raw = str5;
        this.created_at = str10;
        this.is_first_wine = z3;
    }

    public static /* synthetic */ HiWine copy$default(HiWine hiWine, long j, String str, String str2, long j2, WineRegion wineRegion, int i, Winery winery2, WineryStatistic wineryStatistic, String str3, boolean z, List list, String str4, long j3, List list2, List list3, boolean z2, double d, long j4, String str5, String str6, boolean z3, int i2, Object obj) {
        HiWine hiWine2 = hiWine;
        int i3 = i2;
        long j5 = (i3 & 1) != 0 ? hiWine2.f16733id : j;
        String str7 = (i3 & 2) != 0 ? hiWine2.name : str;
        String str8 = (i3 & 4) != 0 ? hiWine2.seo_name : str2;
        long j6 = (i3 & 8) != 0 ? hiWine2.type_id : j2;
        WineRegion wineRegion2 = (i3 & 16) != 0 ? hiWine2.region : wineRegion;
        int i4 = (i3 & 32) != 0 ? hiWine2.review_status : i;
        Winery winery3 = (i3 & 64) != 0 ? hiWine2.winery : winery2;
        WineryStatistic wineryStatistic2 = (i3 & 128) != 0 ? hiWine2.statistics : wineryStatistic;
        String str9 = (i3 & 256) != 0 ? hiWine2.rank : str3;
        boolean z4 = (i3 & 512) != 0 ? hiWine2.hidden : z;
        List list4 = (i3 & 1024) != 0 ? hiWine2.vintages : list;
        return hiWine.copy(j5, str7, str8, j6, wineRegion2, i4, winery3, wineryStatistic2, str9, z4, list4, (i3 & 2048) != 0 ? hiWine2.description : str4, (i3 & 4096) != 0 ? hiWine2.style_id : j3, (i3 & 8192) != 0 ? hiWine2.grapes : list2, (i3 & 16384) != 0 ? hiWine2.foods : list3, (i3 & 32768) != 0 ? hiWine2.non_vintage : z2, (i3 & 65536) != 0 ? hiWine2.alcohol : d, (i3 & 131072) != 0 ? hiWine2.sweetness_id : j4, (i3 & 262144) != 0 ? hiWine2.vintage_mask_raw : str5, (524288 & i3) != 0 ? hiWine2.created_at : str6, (i3 & 1048576) != 0 ? hiWine2.is_first_wine : z3);
    }

    public final long component1() {
        return this.f16733id;
    }

    public final boolean component10() {
        return this.hidden;
    }

    @NotNull
    public final List<Vintage> component11() {
        return this.vintages;
    }

    @NotNull
    public final String component12() {
        return this.description;
    }

    public final long component13() {
        return this.style_id;
    }

    @NotNull
    public final List<Integer> component14() {
        return this.grapes;
    }

    @NotNull
    public final List<Integer> component15() {
        return this.foods;
    }

    public final boolean component16() {
        return this.non_vintage;
    }

    public final double component17() {
        return this.alcohol;
    }

    public final long component18() {
        return this.sweetness_id;
    }

    @Nullable
    public final String component19() {
        return this.vintage_mask_raw;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component20() {
        return this.created_at;
    }

    public final boolean component21() {
        return this.is_first_wine;
    }

    @NotNull
    public final String component3() {
        return this.seo_name;
    }

    public final long component4() {
        return this.type_id;
    }

    @NotNull
    public final WineRegion component5() {
        return this.region;
    }

    public final int component6() {
        return this.review_status;
    }

    @NotNull
    public final Winery component7() {
        return this.winery;
    }

    @NotNull
    public final WineryStatistic component8() {
        return this.statistics;
    }

    @Nullable
    public final String component9() {
        return this.rank;
    }

    @NotNull
    public final HiWine copy(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull WineRegion wineRegion, int i, @NotNull Winery winery2, @NotNull WineryStatistic wineryStatistic, @Nullable String str3, boolean z, @NotNull List<Vintage> list, @NotNull String str4, long j3, @NotNull List<Integer> list2, @NotNull List<Integer> list3, boolean z2, double d, long j4, @Nullable String str5, @NotNull String str6, boolean z3) {
        long j5 = j;
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "seo_name");
        Intrinsics.checkNotNullParameter(wineRegion, "region");
        Intrinsics.checkNotNullParameter(winery2, "winery");
        Intrinsics.checkNotNullParameter(wineryStatistic, "statistics");
        Intrinsics.checkNotNullParameter(list, "vintages");
        Intrinsics.checkNotNullParameter(str4, BundleJUnitUtils.KEY_DESCRIPTION);
        Intrinsics.checkNotNullParameter(list2, "grapes");
        Intrinsics.checkNotNullParameter(list3, "foods");
        Intrinsics.checkNotNullParameter(str6, "created_at");
        return new HiWine(j, str, str2, j2, wineRegion, i, winery2, wineryStatistic, str3, z, list, str4, j3, list2, list3, z2, d, j4, str5, str6, z3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiWine)) {
            return false;
        }
        HiWine hiWine = (HiWine) obj;
        return this.f16733id == hiWine.f16733id && Intrinsics.areEqual((Object) this.name, (Object) hiWine.name) && Intrinsics.areEqual((Object) this.seo_name, (Object) hiWine.seo_name) && this.type_id == hiWine.type_id && Intrinsics.areEqual((Object) this.region, (Object) hiWine.region) && this.review_status == hiWine.review_status && Intrinsics.areEqual((Object) this.winery, (Object) hiWine.winery) && Intrinsics.areEqual((Object) this.statistics, (Object) hiWine.statistics) && Intrinsics.areEqual((Object) this.rank, (Object) hiWine.rank) && this.hidden == hiWine.hidden && Intrinsics.areEqual((Object) this.vintages, (Object) hiWine.vintages) && Intrinsics.areEqual((Object) this.description, (Object) hiWine.description) && this.style_id == hiWine.style_id && Intrinsics.areEqual((Object) this.grapes, (Object) hiWine.grapes) && Intrinsics.areEqual((Object) this.foods, (Object) hiWine.foods) && this.non_vintage == hiWine.non_vintage && Intrinsics.areEqual((Object) Double.valueOf(this.alcohol), (Object) Double.valueOf(hiWine.alcohol)) && this.sweetness_id == hiWine.sweetness_id && Intrinsics.areEqual((Object) this.vintage_mask_raw, (Object) hiWine.vintage_mask_raw) && Intrinsics.areEqual((Object) this.created_at, (Object) hiWine.created_at) && this.is_first_wine == hiWine.is_first_wine;
    }

    public final double getAlcohol() {
        return this.alcohol;
    }

    @NotNull
    public final String getCreated_at() {
        return this.created_at;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<Integer> getFoods() {
        return this.foods;
    }

    @NotNull
    public final List<Integer> getGrapes() {
        return this.grapes;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final long getId() {
        return this.f16733id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getNon_vintage() {
        return this.non_vintage;
    }

    @Nullable
    public final String getRank() {
        return this.rank;
    }

    @NotNull
    public final WineRegion getRegion() {
        return this.region;
    }

    public final int getReview_status() {
        return this.review_status;
    }

    @NotNull
    public final String getSeo_name() {
        return this.seo_name;
    }

    @NotNull
    public final WineryStatistic getStatistics() {
        return this.statistics;
    }

    public final long getStyle_id() {
        return this.style_id;
    }

    public final long getSweetness_id() {
        return this.sweetness_id;
    }

    public final long getType_id() {
        return this.type_id;
    }

    @Nullable
    public final String getVintage_mask_raw() {
        return this.vintage_mask_raw;
    }

    @NotNull
    public final List<Vintage> getVintages() {
        return this.vintages;
    }

    @NotNull
    public final Winery getWinery() {
        return this.winery;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Long.hashCode(this.f16733id) * 31) + this.name.hashCode()) * 31) + this.seo_name.hashCode()) * 31) + Long.hashCode(this.type_id)) * 31) + this.region.hashCode()) * 31) + Integer.hashCode(this.review_status)) * 31) + this.winery.hashCode()) * 31) + this.statistics.hashCode()) * 31;
        String str = this.rank;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.hidden;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode3 = (((((((((((hashCode2 + (z ? 1 : 0)) * 31) + this.vintages.hashCode()) * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.style_id)) * 31) + this.grapes.hashCode()) * 31) + this.foods.hashCode()) * 31;
        boolean z3 = this.non_vintage;
        if (z3) {
            z3 = true;
        }
        int hashCode4 = (((((hashCode3 + (z3 ? 1 : 0)) * 31) + Double.hashCode(this.alcohol)) * 31) + Long.hashCode(this.sweetness_id)) * 31;
        String str2 = this.vintage_mask_raw;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int hashCode5 = (((hashCode4 + i) * 31) + this.created_at.hashCode()) * 31;
        boolean z4 = this.is_first_wine;
        if (!z4) {
            z2 = z4;
        }
        return hashCode5 + (z2 ? 1 : 0);
    }

    public final boolean is_first_wine() {
        return this.is_first_wine;
    }

    public final void setHidden(boolean z) {
        this.hidden = z;
    }

    @NotNull
    public String toString() {
        return "HiWine(id=" + this.f16733id + ", name=" + this.name + ", seo_name=" + this.seo_name + ", type_id=" + this.type_id + ", region=" + this.region + ", review_status=" + this.review_status + ", winery=" + this.winery + ", statistics=" + this.statistics + ", rank=" + this.rank + ", hidden=" + this.hidden + ", vintages=" + this.vintages + ", description=" + this.description + ", style_id=" + this.style_id + ", grapes=" + this.grapes + ", foods=" + this.foods + ", non_vintage=" + this.non_vintage + ", alcohol=" + this.alcohol + ", sweetness_id=" + this.sweetness_id + ", vintage_mask_raw=" + this.vintage_mask_raw + ", created_at=" + this.created_at + ", is_first_wine=" + this.is_first_wine + ')';
    }
}
