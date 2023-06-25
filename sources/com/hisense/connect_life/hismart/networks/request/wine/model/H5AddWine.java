package com.hisense.connect_life.hismart.networks.request.wine.model;

import android.text.TextUtils;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0013¢\u0006\u0002\u0010\u001eJ\u0006\u0010K\u001a\u00020LJ\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000fHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010[\u001a\u00020\u0013HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010`\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\t\u0010b\u001a\u00020\u0003HÆ\u0003J \u0002\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u0010dJ\u0013\u0010e\u001a\u00020L2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010g\u001a\u00020hJ\u0006\u0010i\u001a\u00020jJ\b\u0010k\u001a\u00020lH\u0002J\t\u0010m\u001a\u00020\u0013HÖ\u0001J\u0006\u0010n\u001a\u00020LJ\t\u0010o\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001a\u0010\u001d\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b*\u0010'\"\u0004\b+\u0010,R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010 \"\u0004\b7\u00108R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010 R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010 R\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010 \"\u0004\bD\u00108R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010 R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u001a\u0010\u0016\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010 \"\u0004\bH\u00108R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010 \"\u0004\bJ\u00108¨\u0006p"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/H5AddWine;", "", "produceYear", "", "area", "country", "photo", "phoneUrl", "bestDrinkYearFrom", "", "bestDrinkYearTo", "categoryId", "deviceId", "wifiId", "foodMatch", "", "grapes", "score", "scoreCount", "", "vivinoId", "wineFactoryName", "wineName", "wineType", "alcohol", "wineInventoryInfo", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineInventoryInfo;", "photoFile", "Ljava/io/File;", "autoAdd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/io/File;I)V", "getAlcohol", "()Ljava/lang/String;", "getArea", "getAutoAdd", "()I", "setAutoAdd", "(I)V", "getBestDrinkYearFrom", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBestDrinkYearTo", "getCategoryId", "setCategoryId", "(Ljava/lang/Long;)V", "getCountry", "getDeviceId", "getFoodMatch", "()Ljava/util/List;", "setFoodMatch", "(Ljava/util/List;)V", "getGrapes", "setGrapes", "getPhoneUrl", "getPhoto", "setPhoto", "(Ljava/lang/String;)V", "getPhotoFile", "()Ljava/io/File;", "setPhotoFile", "(Ljava/io/File;)V", "getProduceYear", "getScore", "getScoreCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVivinoId", "getWifiId", "setWifiId", "getWineFactoryName", "getWineInventoryInfo", "getWineName", "setWineName", "getWineType", "setWineType", "categoryExists", "", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/io/File;I)Lcom/hisense/connect_life/hismart/networks/request/wine/model/H5AddWine;", "equals", "other", "getAddWine", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWine;", "getAddWineCategory", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategory;", "getDeviceZone", "", "hashCode", "isAutoAdd", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: H5AddWine.kt */
public final class H5AddWine {
    @Nullable
    public final String alcohol;
    @Nullable
    public final String area;
    public int autoAdd;
    @Nullable
    public final Long bestDrinkYearFrom;
    @Nullable
    public final Long bestDrinkYearTo;
    @Nullable
    public Long categoryId;
    @Nullable
    public final String country;
    @NotNull
    public final String deviceId;
    @Nullable
    public List<String> foodMatch;
    @Nullable
    public List<String> grapes;
    @Nullable
    public final String phoneUrl;
    @Nullable
    public String photo;
    @Nullable
    public File photoFile;
    @Nullable
    public final String produceYear;
    @Nullable
    public final String score;
    @Nullable
    public final Integer scoreCount;
    @Nullable
    public final String vivinoId;
    @NotNull
    public String wifiId;
    @Nullable
    public final String wineFactoryName;
    @Nullable
    public final List<WineInventoryInfo> wineInventoryInfo;
    @NotNull
    public String wineName;
    @Nullable
    public String wineType;

    public H5AddWine(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @NotNull String str6, @NotNull String str7, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str8, @Nullable Integer num, @Nullable String str9, @Nullable String str10, @NotNull String str11, @Nullable String str12, @Nullable String str13, @Nullable List<WineInventoryInfo> list3, @Nullable File file, int i) {
        String str14 = str11;
        Intrinsics.checkNotNullParameter(str6, "deviceId");
        Intrinsics.checkNotNullParameter(str7, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str14, "wineName");
        this.produceYear = str;
        this.area = str2;
        this.country = str3;
        this.photo = str4;
        this.phoneUrl = str5;
        this.bestDrinkYearFrom = l;
        this.bestDrinkYearTo = l2;
        this.categoryId = l3;
        this.deviceId = str6;
        this.wifiId = str7;
        this.foodMatch = list;
        this.grapes = list2;
        this.score = str8;
        this.scoreCount = num;
        this.vivinoId = str9;
        this.wineFactoryName = str10;
        this.wineName = str14;
        this.wineType = str12;
        this.alcohol = str13;
        this.wineInventoryInfo = list3;
        this.photoFile = file;
        this.autoAdd = i;
    }

    public static /* synthetic */ H5AddWine copy$default(H5AddWine h5AddWine, String str, String str2, String str3, String str4, String str5, Long l, Long l2, Long l3, String str6, String str7, List list, List list2, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, List list3, File file, int i, int i2, Object obj) {
        H5AddWine h5AddWine2 = h5AddWine;
        int i3 = i2;
        return h5AddWine.copy((i3 & 1) != 0 ? h5AddWine2.produceYear : str, (i3 & 2) != 0 ? h5AddWine2.area : str2, (i3 & 4) != 0 ? h5AddWine2.country : str3, (i3 & 8) != 0 ? h5AddWine2.photo : str4, (i3 & 16) != 0 ? h5AddWine2.phoneUrl : str5, (i3 & 32) != 0 ? h5AddWine2.bestDrinkYearFrom : l, (i3 & 64) != 0 ? h5AddWine2.bestDrinkYearTo : l2, (i3 & 128) != 0 ? h5AddWine2.categoryId : l3, (i3 & 256) != 0 ? h5AddWine2.deviceId : str6, (i3 & 512) != 0 ? h5AddWine2.wifiId : str7, (i3 & 1024) != 0 ? h5AddWine2.foodMatch : list, (i3 & 2048) != 0 ? h5AddWine2.grapes : list2, (i3 & 4096) != 0 ? h5AddWine2.score : str8, (i3 & 8192) != 0 ? h5AddWine2.scoreCount : num, (i3 & 16384) != 0 ? h5AddWine2.vivinoId : str9, (i3 & 32768) != 0 ? h5AddWine2.wineFactoryName : str10, (i3 & 65536) != 0 ? h5AddWine2.wineName : str11, (i3 & 131072) != 0 ? h5AddWine2.wineType : str12, (i3 & 262144) != 0 ? h5AddWine2.alcohol : str13, (i3 & 524288) != 0 ? h5AddWine2.wineInventoryInfo : list3, (i3 & 1048576) != 0 ? h5AddWine2.photoFile : file, (i3 & 2097152) != 0 ? h5AddWine2.autoAdd : i);
    }

    private final void getDeviceZone() {
    }

    public final boolean categoryExists() {
        Long l = this.categoryId;
        return l != null && (l == null || l.longValue() != 0);
    }

    @Nullable
    public final String component1() {
        return this.produceYear;
    }

    @NotNull
    public final String component10() {
        return this.wifiId;
    }

    @Nullable
    public final List<String> component11() {
        return this.foodMatch;
    }

    @Nullable
    public final List<String> component12() {
        return this.grapes;
    }

    @Nullable
    public final String component13() {
        return this.score;
    }

    @Nullable
    public final Integer component14() {
        return this.scoreCount;
    }

    @Nullable
    public final String component15() {
        return this.vivinoId;
    }

    @Nullable
    public final String component16() {
        return this.wineFactoryName;
    }

    @NotNull
    public final String component17() {
        return this.wineName;
    }

    @Nullable
    public final String component18() {
        return this.wineType;
    }

    @Nullable
    public final String component19() {
        return this.alcohol;
    }

    @Nullable
    public final String component2() {
        return this.area;
    }

    @Nullable
    public final List<WineInventoryInfo> component20() {
        return this.wineInventoryInfo;
    }

    @Nullable
    public final File component21() {
        return this.photoFile;
    }

    public final int component22() {
        return this.autoAdd;
    }

    @Nullable
    public final String component3() {
        return this.country;
    }

    @Nullable
    public final String component4() {
        return this.photo;
    }

    @Nullable
    public final String component5() {
        return this.phoneUrl;
    }

    @Nullable
    public final Long component6() {
        return this.bestDrinkYearFrom;
    }

    @Nullable
    public final Long component7() {
        return this.bestDrinkYearTo;
    }

    @Nullable
    public final Long component8() {
        return this.categoryId;
    }

    @NotNull
    public final String component9() {
        return this.deviceId;
    }

    @NotNull
    public final H5AddWine copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @NotNull String str6, @NotNull String str7, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str8, @Nullable Integer num, @Nullable String str9, @Nullable String str10, @NotNull String str11, @Nullable String str12, @Nullable String str13, @Nullable List<WineInventoryInfo> list3, @Nullable File file, int i) {
        String str14 = str;
        Intrinsics.checkNotNullParameter(str6, "deviceId");
        Intrinsics.checkNotNullParameter(str7, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str11, "wineName");
        return new H5AddWine(str, str2, str3, str4, str5, l, l2, l3, str6, str7, list, list2, str8, num, str9, str10, str11, str12, str13, list3, file, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5AddWine)) {
            return false;
        }
        H5AddWine h5AddWine = (H5AddWine) obj;
        return Intrinsics.areEqual((Object) this.produceYear, (Object) h5AddWine.produceYear) && Intrinsics.areEqual((Object) this.area, (Object) h5AddWine.area) && Intrinsics.areEqual((Object) this.country, (Object) h5AddWine.country) && Intrinsics.areEqual((Object) this.photo, (Object) h5AddWine.photo) && Intrinsics.areEqual((Object) this.phoneUrl, (Object) h5AddWine.phoneUrl) && Intrinsics.areEqual((Object) this.bestDrinkYearFrom, (Object) h5AddWine.bestDrinkYearFrom) && Intrinsics.areEqual((Object) this.bestDrinkYearTo, (Object) h5AddWine.bestDrinkYearTo) && Intrinsics.areEqual((Object) this.categoryId, (Object) h5AddWine.categoryId) && Intrinsics.areEqual((Object) this.deviceId, (Object) h5AddWine.deviceId) && Intrinsics.areEqual((Object) this.wifiId, (Object) h5AddWine.wifiId) && Intrinsics.areEqual((Object) this.foodMatch, (Object) h5AddWine.foodMatch) && Intrinsics.areEqual((Object) this.grapes, (Object) h5AddWine.grapes) && Intrinsics.areEqual((Object) this.score, (Object) h5AddWine.score) && Intrinsics.areEqual((Object) this.scoreCount, (Object) h5AddWine.scoreCount) && Intrinsics.areEqual((Object) this.vivinoId, (Object) h5AddWine.vivinoId) && Intrinsics.areEqual((Object) this.wineFactoryName, (Object) h5AddWine.wineFactoryName) && Intrinsics.areEqual((Object) this.wineName, (Object) h5AddWine.wineName) && Intrinsics.areEqual((Object) this.wineType, (Object) h5AddWine.wineType) && Intrinsics.areEqual((Object) this.alcohol, (Object) h5AddWine.alcohol) && Intrinsics.areEqual((Object) this.wineInventoryInfo, (Object) h5AddWine.wineInventoryInfo) && Intrinsics.areEqual((Object) this.photoFile, (Object) h5AddWine.photoFile) && this.autoAdd == h5AddWine.autoAdd;
    }

    @NotNull
    public final AddWine getAddWine() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AddWineItemInfo(this.deviceId, this.wifiId, this.wineInventoryInfo));
        return new AddWine(this.categoryId, this.photoFile, arrayList);
    }

    @NotNull
    public final AddWineCategory getAddWineCategory() {
        TextUtils.isEmpty(this.vivinoId);
        Long l = this.categoryId;
        String str = this.wineFactoryName;
        String str2 = this.wineName;
        String str3 = this.wineType;
        String str4 = this.area;
        String str5 = this.country;
        List<String> list = this.grapes;
        String str6 = this.vivinoId;
        String str7 = this.score;
        Integer num = this.scoreCount;
        String str8 = this.alcohol;
        List<String> list2 = this.foodMatch;
        String str9 = this.produceYear;
        String str10 = this.deviceId;
        String str11 = this.wifiId;
        Integer num2 = num;
        int i = this.autoAdd;
        String str12 = str10;
        List<WineInventoryInfo> list3 = this.wineInventoryInfo;
        return new AddWineCategory(str12, str11, l, this.photoFile, str, str2, str3, str9, str4, str5, list, i, str6, str7, num2, list2, str8, (list3 == null || list3.isEmpty()) ? null : this.wineInventoryInfo);
    }

    @Nullable
    public final String getAlcohol() {
        return this.alcohol;
    }

    @Nullable
    public final String getArea() {
        return this.area;
    }

    public final int getAutoAdd() {
        return this.autoAdd;
    }

    @Nullable
    public final Long getBestDrinkYearFrom() {
        return this.bestDrinkYearFrom;
    }

    @Nullable
    public final Long getBestDrinkYearTo() {
        return this.bestDrinkYearTo;
    }

    @Nullable
    public final Long getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final List<String> getFoodMatch() {
        return this.foodMatch;
    }

    @Nullable
    public final List<String> getGrapes() {
        return this.grapes;
    }

    @Nullable
    public final String getPhoneUrl() {
        return this.phoneUrl;
    }

    @Nullable
    public final String getPhoto() {
        return this.photo;
    }

    @Nullable
    public final File getPhotoFile() {
        return this.photoFile;
    }

    @Nullable
    public final String getProduceYear() {
        return this.produceYear;
    }

    @Nullable
    public final String getScore() {
        return this.score;
    }

    @Nullable
    public final Integer getScoreCount() {
        return this.scoreCount;
    }

    @Nullable
    public final String getVivinoId() {
        return this.vivinoId;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    @Nullable
    public final String getWineFactoryName() {
        return this.wineFactoryName;
    }

    @Nullable
    public final List<WineInventoryInfo> getWineInventoryInfo() {
        return this.wineInventoryInfo;
    }

    @NotNull
    public final String getWineName() {
        return this.wineName;
    }

    @Nullable
    public final String getWineType() {
        return this.wineType;
    }

    public int hashCode() {
        String str = this.produceYear;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.area;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.bestDrinkYearFrom;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.bestDrinkYearTo;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.categoryId;
        int hashCode8 = (((((hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31) + this.deviceId.hashCode()) * 31) + this.wifiId.hashCode()) * 31;
        List<String> list = this.foodMatch;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.grapes;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.score;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.scoreCount;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.vivinoId;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.wineFactoryName;
        int hashCode14 = (((hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.wineName.hashCode()) * 31;
        String str9 = this.wineType;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.alcohol;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<WineInventoryInfo> list3 = this.wineInventoryInfo;
        int hashCode17 = (hashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        File file = this.photoFile;
        if (file != null) {
            i = file.hashCode();
        }
        return ((hashCode17 + i) * 31) + Integer.hashCode(this.autoAdd);
    }

    public final boolean isAutoAdd() {
        return !TextUtils.isEmpty(this.vivinoId) && !Intrinsics.areEqual((Object) this.vivinoId, (Object) "-1");
    }

    public final void setAutoAdd(int i) {
        this.autoAdd = i;
    }

    public final void setCategoryId(@Nullable Long l) {
        this.categoryId = l;
    }

    public final void setFoodMatch(@Nullable List<String> list) {
        this.foodMatch = list;
    }

    public final void setGrapes(@Nullable List<String> list) {
        this.grapes = list;
    }

    public final void setPhoto(@Nullable String str) {
        this.photo = str;
    }

    public final void setPhotoFile(@Nullable File file) {
        this.photoFile = file;
    }

    public final void setWifiId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiId = str;
    }

    public final void setWineName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wineName = str;
    }

    public final void setWineType(@Nullable String str) {
        this.wineType = str;
    }

    @NotNull
    public String toString() {
        return "H5AddWine(produceYear=" + this.produceYear + ", area=" + this.area + ", country=" + this.country + ", photo=" + this.photo + ", phoneUrl=" + this.phoneUrl + ", bestDrinkYearFrom=" + this.bestDrinkYearFrom + ", bestDrinkYearTo=" + this.bestDrinkYearTo + ", categoryId=" + this.categoryId + ", deviceId=" + this.deviceId + ", wifiId=" + this.wifiId + ", foodMatch=" + this.foodMatch + ", grapes=" + this.grapes + ", score=" + this.score + ", scoreCount=" + this.scoreCount + ", vivinoId=" + this.vivinoId + ", wineFactoryName=" + this.wineFactoryName + ", wineName=" + this.wineName + ", wineType=" + this.wineType + ", alcohol=" + this.alcohol + ", wineInventoryInfo=" + this.wineInventoryInfo + ", photoFile=" + this.photoFile + ", autoAdd=" + this.autoAdd + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H5AddWine(String str, String str2, String str3, String str4, String str5, Long l, Long l2, Long l3, String str6, String str7, List list, List list2, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, List list3, File file, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, l, l2, l3, str6, str7, list, list2, str8, num, str9, str10, str11, str12, str13, list3, (i2 & 1048576) != 0 ? null : file, i);
    }
}
