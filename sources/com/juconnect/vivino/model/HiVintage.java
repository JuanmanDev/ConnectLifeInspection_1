package com.juconnect.vivino.model;

import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010HÆ\u0003J\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0013HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006;"}, mo47991d2 = {"Lcom/juconnect/vivino/model/HiVintage;", "", "id", "", "seo_name", "", "year", "name", "statistics", "Lcom/juconnect/vivino/model/WineStatistic;", "image", "Lcom/juconnect/vivino/model/WineImage;", "wine", "Lcom/juconnect/vivino/model/HiWine;", "description", "expert_reviews", "", "ratings_distribution", "", "", "ranking", "Lcom/juconnect/vivino/model/WineRank;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/juconnect/vivino/model/WineStatistic;Lcom/juconnect/vivino/model/WineImage;Lcom/juconnect/vivino/model/HiWine;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/juconnect/vivino/model/WineRank;)V", "getDescription", "()Ljava/lang/String;", "getExpert_reviews", "()Ljava/util/List;", "getId", "()J", "getImage", "()Lcom/juconnect/vivino/model/WineImage;", "getName", "getRanking", "()Lcom/juconnect/vivino/model/WineRank;", "getRatings_distribution", "()Ljava/util/Map;", "getSeo_name", "getStatistics", "()Lcom/juconnect/vivino/model/WineStatistic;", "getWine", "()Lcom/juconnect/vivino/model/HiWine;", "getYear", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiVintage.kt */
public final class HiVintage {
    @Nullable
    public final String description;
    @Nullable
    public final List<String> expert_reviews;

    /* renamed from: id */
    public final long f16732id;
    @Nullable
    public final WineImage image;
    @NotNull
    public final String name;
    @Nullable
    public final WineRank ranking;
    @Nullable
    public final Map<String, Integer> ratings_distribution;
    @NotNull
    public final String seo_name;
    @Nullable
    public final WineStatistic statistics;
    @Nullable
    public final HiWine wine;
    @NotNull
    public final String year;

    public HiVintage() {
        this(0, (String) null, (String) null, (String) null, (WineStatistic) null, (WineImage) null, (HiWine) null, (String) null, (List) null, (Map) null, (WineRank) null, 2047, (DefaultConstructorMarker) null);
    }

    public HiVintage(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable WineStatistic wineStatistic, @Nullable WineImage wineImage, @Nullable HiWine hiWine, @Nullable String str4, @Nullable List<String> list, @Nullable Map<String, Integer> map, @Nullable WineRank wineRank) {
        Intrinsics.checkNotNullParameter(str, "seo_name");
        Intrinsics.checkNotNullParameter(str2, TypeAdapters.C838126.YEAR);
        Intrinsics.checkNotNullParameter(str3, "name");
        this.f16732id = j;
        this.seo_name = str;
        this.year = str2;
        this.name = str3;
        this.statistics = wineStatistic;
        this.image = wineImage;
        this.wine = hiWine;
        this.description = str4;
        this.expert_reviews = list;
        this.ratings_distribution = map;
        this.ranking = wineRank;
    }

    public static /* synthetic */ HiVintage copy$default(HiVintage hiVintage, long j, String str, String str2, String str3, WineStatistic wineStatistic, WineImage wineImage, HiWine hiWine, String str4, List list, Map map, WineRank wineRank, int i, Object obj) {
        HiVintage hiVintage2 = hiVintage;
        int i2 = i;
        return hiVintage.copy((i2 & 1) != 0 ? hiVintage2.f16732id : j, (i2 & 2) != 0 ? hiVintage2.seo_name : str, (i2 & 4) != 0 ? hiVintage2.year : str2, (i2 & 8) != 0 ? hiVintage2.name : str3, (i2 & 16) != 0 ? hiVintage2.statistics : wineStatistic, (i2 & 32) != 0 ? hiVintage2.image : wineImage, (i2 & 64) != 0 ? hiVintage2.wine : hiWine, (i2 & 128) != 0 ? hiVintage2.description : str4, (i2 & 256) != 0 ? hiVintage2.expert_reviews : list, (i2 & 512) != 0 ? hiVintage2.ratings_distribution : map, (i2 & 1024) != 0 ? hiVintage2.ranking : wineRank);
    }

    public final long component1() {
        return this.f16732id;
    }

    @Nullable
    public final Map<String, Integer> component10() {
        return this.ratings_distribution;
    }

    @Nullable
    public final WineRank component11() {
        return this.ranking;
    }

    @NotNull
    public final String component2() {
        return this.seo_name;
    }

    @NotNull
    public final String component3() {
        return this.year;
    }

    @NotNull
    public final String component4() {
        return this.name;
    }

    @Nullable
    public final WineStatistic component5() {
        return this.statistics;
    }

    @Nullable
    public final WineImage component6() {
        return this.image;
    }

    @Nullable
    public final HiWine component7() {
        return this.wine;
    }

    @Nullable
    public final String component8() {
        return this.description;
    }

    @Nullable
    public final List<String> component9() {
        return this.expert_reviews;
    }

    @NotNull
    public final HiVintage copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable WineStatistic wineStatistic, @Nullable WineImage wineImage, @Nullable HiWine hiWine, @Nullable String str4, @Nullable List<String> list, @Nullable Map<String, Integer> map, @Nullable WineRank wineRank) {
        String str5 = str;
        Intrinsics.checkNotNullParameter(str5, "seo_name");
        String str6 = str2;
        Intrinsics.checkNotNullParameter(str6, TypeAdapters.C838126.YEAR);
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "name");
        return new HiVintage(j, str5, str6, str7, wineStatistic, wineImage, hiWine, str4, list, map, wineRank);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiVintage)) {
            return false;
        }
        HiVintage hiVintage = (HiVintage) obj;
        return this.f16732id == hiVintage.f16732id && Intrinsics.areEqual((Object) this.seo_name, (Object) hiVintage.seo_name) && Intrinsics.areEqual((Object) this.year, (Object) hiVintage.year) && Intrinsics.areEqual((Object) this.name, (Object) hiVintage.name) && Intrinsics.areEqual((Object) this.statistics, (Object) hiVintage.statistics) && Intrinsics.areEqual((Object) this.image, (Object) hiVintage.image) && Intrinsics.areEqual((Object) this.wine, (Object) hiVintage.wine) && Intrinsics.areEqual((Object) this.description, (Object) hiVintage.description) && Intrinsics.areEqual((Object) this.expert_reviews, (Object) hiVintage.expert_reviews) && Intrinsics.areEqual((Object) this.ratings_distribution, (Object) hiVintage.ratings_distribution) && Intrinsics.areEqual((Object) this.ranking, (Object) hiVintage.ranking);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final List<String> getExpert_reviews() {
        return this.expert_reviews;
    }

    public final long getId() {
        return this.f16732id;
    }

    @Nullable
    public final WineImage getImage() {
        return this.image;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final WineRank getRanking() {
        return this.ranking;
    }

    @Nullable
    public final Map<String, Integer> getRatings_distribution() {
        return this.ratings_distribution;
    }

    @NotNull
    public final String getSeo_name() {
        return this.seo_name;
    }

    @Nullable
    public final WineStatistic getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final HiWine getWine() {
        return this.wine;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.f16732id) * 31) + this.seo_name.hashCode()) * 31) + this.year.hashCode()) * 31) + this.name.hashCode()) * 31;
        WineStatistic wineStatistic = this.statistics;
        int i = 0;
        int hashCode2 = (hashCode + (wineStatistic == null ? 0 : wineStatistic.hashCode())) * 31;
        WineImage wineImage = this.image;
        int hashCode3 = (hashCode2 + (wineImage == null ? 0 : wineImage.hashCode())) * 31;
        HiWine hiWine = this.wine;
        int hashCode4 = (hashCode3 + (hiWine == null ? 0 : hiWine.hashCode())) * 31;
        String str = this.description;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.expert_reviews;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Integer> map = this.ratings_distribution;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        WineRank wineRank = this.ranking;
        if (wineRank != null) {
            i = wineRank.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public String toString() {
        return "HiVintage(id=" + this.f16732id + ", seo_name=" + this.seo_name + ", year=" + this.year + ", name=" + this.name + ", statistics=" + this.statistics + ", image=" + this.image + ", wine=" + this.wine + ", description=" + this.description + ", expert_reviews=" + this.expert_reviews + ", ratings_distribution=" + this.ratings_distribution + ", ranking=" + this.ranking + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HiVintage(long r14, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.juconnect.vivino.model.WineStatistic r19, com.juconnect.vivino.model.WineImage r20, com.juconnect.vivino.model.HiWine r21, java.lang.String r22, java.util.List r23, java.util.Map r24, com.juconnect.vivino.model.WineRank r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = -1
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0014
        L_0x0012:
            r3 = r16
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = r4
            goto L_0x001c
        L_0x001a:
            r5 = r17
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r4 = r18
        L_0x0023:
            r6 = r0 & 16
            r7 = 0
            if (r6 == 0) goto L_0x002a
            r6 = r7
            goto L_0x002c
        L_0x002a:
            r6 = r19
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r7
            goto L_0x0034
        L_0x0032:
            r8 = r20
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r7
            goto L_0x003c
        L_0x003a:
            r9 = r21
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r7
            goto L_0x0044
        L_0x0042:
            r10 = r22
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r7
            goto L_0x004c
        L_0x004a:
            r11 = r23
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = r7
            goto L_0x0054
        L_0x0052:
            r12 = r24
        L_0x0054:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r7 = r25
        L_0x005b:
            r14 = r13
            r15 = r1
            r17 = r3
            r18 = r5
            r19 = r4
            r20 = r6
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r7
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.vivino.model.HiVintage.<init>(long, java.lang.String, java.lang.String, java.lang.String, com.juconnect.vivino.model.WineStatistic, com.juconnect.vivino.model.WineImage, com.juconnect.vivino.model.HiWine, java.lang.String, java.util.List, java.util.Map, com.juconnect.vivino.model.WineRank, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
