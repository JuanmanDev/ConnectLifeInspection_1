package com.hisense.connect_life.hismart.networks.request.wine.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\bb\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0018\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010!J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010-J\t\u0010_\u001a\u00020\bHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010;J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\b0\u0018HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0006HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010m\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0018HÆ\u0003J\t\u0010n\u001a\u00020\bHÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010q\u001a\u00020\u0006HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010v\u001a\u00020\u0006HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\bHÆ\u0003JÆ\u0002\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00182\b\b\u0002\u0010\u001e\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010yJ\u0013\u0010z\u001a\u00020{2\b\u0010|\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010}\u001a\u00020\u0006HÖ\u0001J\t\u0010~\u001a\u00020\bHÖ\u0001R\u001a\u0010\u001e\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001a\u0010\u0019\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%R\u001a\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010#\"\u0004\b6\u0010%R\u001a\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010#\"\u0004\b8\u0010%R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010@\"\u0004\bD\u0010BR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001a\u0010\u0014\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010F\"\u0004\bH\u0010IR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010FR\u001c\u0010 \u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010#\"\u0004\bL\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010#R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bP\u0010#R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\bQ\u0010-R\u001a\u0010\u001b\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010#\"\u0004\bS\u0010%R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010#\"\u0004\bU\u0010%R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010#\"\u0004\bW\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010#\"\u0004\b\\\u0010%¨\u0006"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "", "id", "", "inventoryId", "positionNum", "", "photoUrl", "", "wineFactoryName", "wineName", "wineType", "favorite", "produceYear", "remindAlarmDate", "deviceId", "zoneName", "cellNum", "categoryId", "filtered", "inventoryDate", "area", "country", "grapes", "", "autoAdd", "vivinoId", "score", "scoreCount", "foodMatch", "alcohol", "bestDrinkDate", "notes", "(JJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getAlcohol", "()Ljava/lang/String;", "setAlcohol", "(Ljava/lang/String;)V", "getArea", "setArea", "getAutoAdd", "()I", "setAutoAdd", "(I)V", "getBestDrinkDate", "()Ljava/lang/Long;", "setBestDrinkDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCategoryId", "setCategoryId", "getCellNum", "setCellNum", "getCountry", "setCountry", "getDeviceId", "setDeviceId", "getFavorite", "getFiltered", "()Ljava/lang/Integer;", "setFiltered", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFoodMatch", "()Ljava/util/List;", "setFoodMatch", "(Ljava/util/List;)V", "getGrapes", "setGrapes", "getId", "()J", "getInventoryDate", "setInventoryDate", "(J)V", "getInventoryId", "getNotes", "setNotes", "getPhotoUrl", "getPositionNum", "setPositionNum", "getProduceYear", "getRemindAlarmDate", "getScore", "setScore", "getScoreCount", "setScoreCount", "getVivinoId", "setVivinoId", "getWineFactoryName", "getWineName", "getWineType", "getZoneName", "setZoneName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Entity(tableName = "wine_inventory_new")
/* compiled from: DeviceZone.kt */
public final class WineBaseInfo {
    @NotNull
    public String alcohol;
    @Nullable
    public String area;
    public int autoAdd;
    @Nullable
    public Long bestDrinkDate;
    @NotNull
    public String categoryId;
    public int cellNum;
    @Nullable
    public String country;
    @NotNull
    public String deviceId;
    public final int favorite;
    @Nullable
    public Integer filtered;
    @Nullable
    public List<String> foodMatch;
    @NotNull
    public List<String> grapes;
    @PrimaryKey(autoGenerate = true)

    /* renamed from: id */
    public final long f15976id;
    public long inventoryDate;
    public final long inventoryId;
    @Nullable
    public String notes;
    @Nullable
    public final String photoUrl;
    public int positionNum;
    @Nullable
    public final String produceYear;
    @Nullable
    public final Long remindAlarmDate;
    @NotNull
    public String score;
    @Nullable
    public String scoreCount;
    @Nullable
    public String vivinoId;
    @Nullable
    public final String wineFactoryName;
    @Nullable
    public final String wineName;
    @Nullable
    public final String wineType;
    @Nullable
    public String zoneName;

    public WineBaseInfo(long j, long j2, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, @Nullable String str5, @Nullable Long l, @NotNull String str6, @Nullable String str7, int i3, @NotNull String str8, @Nullable Integer num, long j3, @Nullable String str9, @Nullable String str10, @NotNull List<String> list, int i4, @Nullable String str11, @NotNull String str12, @Nullable String str13, @Nullable List<String> list2, @NotNull String str14, @Nullable Long l2, @Nullable String str15) {
        String str16 = str6;
        String str17 = str8;
        List<String> list3 = list;
        String str18 = str12;
        String str19 = str14;
        Intrinsics.checkNotNullParameter(str16, "deviceId");
        Intrinsics.checkNotNullParameter(str17, "categoryId");
        Intrinsics.checkNotNullParameter(list3, "grapes");
        Intrinsics.checkNotNullParameter(str18, "score");
        Intrinsics.checkNotNullParameter(str19, "alcohol");
        this.f15976id = j;
        this.inventoryId = j2;
        this.positionNum = i;
        this.photoUrl = str;
        this.wineFactoryName = str2;
        this.wineName = str3;
        this.wineType = str4;
        this.favorite = i2;
        this.produceYear = str5;
        this.remindAlarmDate = l;
        this.deviceId = str16;
        this.zoneName = str7;
        this.cellNum = i3;
        this.categoryId = str17;
        this.filtered = num;
        this.inventoryDate = j3;
        this.area = str9;
        this.country = str10;
        this.grapes = list3;
        this.autoAdd = i4;
        this.vivinoId = str11;
        this.score = str18;
        this.scoreCount = str13;
        this.foodMatch = list2;
        this.alcohol = str19;
        this.bestDrinkDate = l2;
        this.notes = str15;
    }

    public static /* synthetic */ WineBaseInfo copy$default(WineBaseInfo wineBaseInfo, long j, long j2, int i, String str, String str2, String str3, String str4, int i2, String str5, Long l, String str6, String str7, int i3, String str8, Integer num, long j3, String str9, String str10, List list, int i4, String str11, String str12, String str13, List list2, String str14, Long l2, String str15, int i5, Object obj) {
        WineBaseInfo wineBaseInfo2 = wineBaseInfo;
        int i6 = i5;
        return wineBaseInfo.copy((i6 & 1) != 0 ? wineBaseInfo2.f15976id : j, (i6 & 2) != 0 ? wineBaseInfo2.inventoryId : j2, (i6 & 4) != 0 ? wineBaseInfo2.positionNum : i, (i6 & 8) != 0 ? wineBaseInfo2.photoUrl : str, (i6 & 16) != 0 ? wineBaseInfo2.wineFactoryName : str2, (i6 & 32) != 0 ? wineBaseInfo2.wineName : str3, (i6 & 64) != 0 ? wineBaseInfo2.wineType : str4, (i6 & 128) != 0 ? wineBaseInfo2.favorite : i2, (i6 & 256) != 0 ? wineBaseInfo2.produceYear : str5, (i6 & 512) != 0 ? wineBaseInfo2.remindAlarmDate : l, (i6 & 1024) != 0 ? wineBaseInfo2.deviceId : str6, (i6 & 2048) != 0 ? wineBaseInfo2.zoneName : str7, (i6 & 4096) != 0 ? wineBaseInfo2.cellNum : i3, (i6 & 8192) != 0 ? wineBaseInfo2.categoryId : str8, (i6 & 16384) != 0 ? wineBaseInfo2.filtered : num, (i6 & 32768) != 0 ? wineBaseInfo2.inventoryDate : j3, (i6 & 65536) != 0 ? wineBaseInfo2.area : str9, (131072 & i6) != 0 ? wineBaseInfo2.country : str10, (i6 & 262144) != 0 ? wineBaseInfo2.grapes : list, (i6 & 524288) != 0 ? wineBaseInfo2.autoAdd : i4, (i6 & 1048576) != 0 ? wineBaseInfo2.vivinoId : str11, (i6 & 2097152) != 0 ? wineBaseInfo2.score : str12, (i6 & 4194304) != 0 ? wineBaseInfo2.scoreCount : str13, (i6 & 8388608) != 0 ? wineBaseInfo2.foodMatch : list2, (i6 & 16777216) != 0 ? wineBaseInfo2.alcohol : str14, (i6 & 33554432) != 0 ? wineBaseInfo2.bestDrinkDate : l2, (i6 & 67108864) != 0 ? wineBaseInfo2.notes : str15);
    }

    public final long component1() {
        return this.f15976id;
    }

    @Nullable
    public final Long component10() {
        return this.remindAlarmDate;
    }

    @NotNull
    public final String component11() {
        return this.deviceId;
    }

    @Nullable
    public final String component12() {
        return this.zoneName;
    }

    public final int component13() {
        return this.cellNum;
    }

    @NotNull
    public final String component14() {
        return this.categoryId;
    }

    @Nullable
    public final Integer component15() {
        return this.filtered;
    }

    public final long component16() {
        return this.inventoryDate;
    }

    @Nullable
    public final String component17() {
        return this.area;
    }

    @Nullable
    public final String component18() {
        return this.country;
    }

    @NotNull
    public final List<String> component19() {
        return this.grapes;
    }

    public final long component2() {
        return this.inventoryId;
    }

    public final int component20() {
        return this.autoAdd;
    }

    @Nullable
    public final String component21() {
        return this.vivinoId;
    }

    @NotNull
    public final String component22() {
        return this.score;
    }

    @Nullable
    public final String component23() {
        return this.scoreCount;
    }

    @Nullable
    public final List<String> component24() {
        return this.foodMatch;
    }

    @NotNull
    public final String component25() {
        return this.alcohol;
    }

    @Nullable
    public final Long component26() {
        return this.bestDrinkDate;
    }

    @Nullable
    public final String component27() {
        return this.notes;
    }

    public final int component3() {
        return this.positionNum;
    }

    @Nullable
    public final String component4() {
        return this.photoUrl;
    }

    @Nullable
    public final String component5() {
        return this.wineFactoryName;
    }

    @Nullable
    public final String component6() {
        return this.wineName;
    }

    @Nullable
    public final String component7() {
        return this.wineType;
    }

    public final int component8() {
        return this.favorite;
    }

    @Nullable
    public final String component9() {
        return this.produceYear;
    }

    @NotNull
    public final WineBaseInfo copy(long j, long j2, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, @Nullable String str5, @Nullable Long l, @NotNull String str6, @Nullable String str7, int i3, @NotNull String str8, @Nullable Integer num, long j3, @Nullable String str9, @Nullable String str10, @NotNull List<String> list, int i4, @Nullable String str11, @NotNull String str12, @Nullable String str13, @Nullable List<String> list2, @NotNull String str14, @Nullable Long l2, @Nullable String str15) {
        long j4 = j;
        Intrinsics.checkNotNullParameter(str6, "deviceId");
        Intrinsics.checkNotNullParameter(str8, "categoryId");
        Intrinsics.checkNotNullParameter(list, "grapes");
        Intrinsics.checkNotNullParameter(str12, "score");
        Intrinsics.checkNotNullParameter(str14, "alcohol");
        return new WineBaseInfo(j, j2, i, str, str2, str3, str4, i2, str5, l, str6, str7, i3, str8, num, j3, str9, str10, list, i4, str11, str12, str13, list2, str14, l2, str15);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineBaseInfo)) {
            return false;
        }
        WineBaseInfo wineBaseInfo = (WineBaseInfo) obj;
        return this.f15976id == wineBaseInfo.f15976id && this.inventoryId == wineBaseInfo.inventoryId && this.positionNum == wineBaseInfo.positionNum && Intrinsics.areEqual((Object) this.photoUrl, (Object) wineBaseInfo.photoUrl) && Intrinsics.areEqual((Object) this.wineFactoryName, (Object) wineBaseInfo.wineFactoryName) && Intrinsics.areEqual((Object) this.wineName, (Object) wineBaseInfo.wineName) && Intrinsics.areEqual((Object) this.wineType, (Object) wineBaseInfo.wineType) && this.favorite == wineBaseInfo.favorite && Intrinsics.areEqual((Object) this.produceYear, (Object) wineBaseInfo.produceYear) && Intrinsics.areEqual((Object) this.remindAlarmDate, (Object) wineBaseInfo.remindAlarmDate) && Intrinsics.areEqual((Object) this.deviceId, (Object) wineBaseInfo.deviceId) && Intrinsics.areEqual((Object) this.zoneName, (Object) wineBaseInfo.zoneName) && this.cellNum == wineBaseInfo.cellNum && Intrinsics.areEqual((Object) this.categoryId, (Object) wineBaseInfo.categoryId) && Intrinsics.areEqual((Object) this.filtered, (Object) wineBaseInfo.filtered) && this.inventoryDate == wineBaseInfo.inventoryDate && Intrinsics.areEqual((Object) this.area, (Object) wineBaseInfo.area) && Intrinsics.areEqual((Object) this.country, (Object) wineBaseInfo.country) && Intrinsics.areEqual((Object) this.grapes, (Object) wineBaseInfo.grapes) && this.autoAdd == wineBaseInfo.autoAdd && Intrinsics.areEqual((Object) this.vivinoId, (Object) wineBaseInfo.vivinoId) && Intrinsics.areEqual((Object) this.score, (Object) wineBaseInfo.score) && Intrinsics.areEqual((Object) this.scoreCount, (Object) wineBaseInfo.scoreCount) && Intrinsics.areEqual((Object) this.foodMatch, (Object) wineBaseInfo.foodMatch) && Intrinsics.areEqual((Object) this.alcohol, (Object) wineBaseInfo.alcohol) && Intrinsics.areEqual((Object) this.bestDrinkDate, (Object) wineBaseInfo.bestDrinkDate) && Intrinsics.areEqual((Object) this.notes, (Object) wineBaseInfo.notes);
    }

    @NotNull
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
    public final Long getBestDrinkDate() {
        return this.bestDrinkDate;
    }

    @NotNull
    public final String getCategoryId() {
        return this.categoryId;
    }

    public final int getCellNum() {
        return this.cellNum;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getFavorite() {
        return this.favorite;
    }

    @Nullable
    public final Integer getFiltered() {
        return this.filtered;
    }

    @Nullable
    public final List<String> getFoodMatch() {
        return this.foodMatch;
    }

    @NotNull
    public final List<String> getGrapes() {
        return this.grapes;
    }

    public final long getId() {
        return this.f15976id;
    }

    public final long getInventoryDate() {
        return this.inventoryDate;
    }

    public final long getInventoryId() {
        return this.inventoryId;
    }

    @Nullable
    public final String getNotes() {
        return this.notes;
    }

    @Nullable
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getPositionNum() {
        return this.positionNum;
    }

    @Nullable
    public final String getProduceYear() {
        return this.produceYear;
    }

    @Nullable
    public final Long getRemindAlarmDate() {
        return this.remindAlarmDate;
    }

    @NotNull
    public final String getScore() {
        return this.score;
    }

    @Nullable
    public final String getScoreCount() {
        return this.scoreCount;
    }

    @Nullable
    public final String getVivinoId() {
        return this.vivinoId;
    }

    @Nullable
    public final String getWineFactoryName() {
        return this.wineFactoryName;
    }

    @Nullable
    public final String getWineName() {
        return this.wineName;
    }

    @Nullable
    public final String getWineType() {
        return this.wineType;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.f15976id) * 31) + Long.hashCode(this.inventoryId)) * 31) + Integer.hashCode(this.positionNum)) * 31;
        String str = this.photoUrl;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.wineFactoryName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wineName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.wineType;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.favorite)) * 31;
        String str5 = this.produceYear;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.remindAlarmDate;
        int hashCode7 = (((hashCode6 + (l == null ? 0 : l.hashCode())) * 31) + this.deviceId.hashCode()) * 31;
        String str6 = this.zoneName;
        int hashCode8 = (((((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.cellNum)) * 31) + this.categoryId.hashCode()) * 31;
        Integer num = this.filtered;
        int hashCode9 = (((hashCode8 + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.inventoryDate)) * 31;
        String str7 = this.area;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int hashCode11 = (((((hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.grapes.hashCode()) * 31) + Integer.hashCode(this.autoAdd)) * 31;
        String str9 = this.vivinoId;
        int hashCode12 = (((hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.score.hashCode()) * 31;
        String str10 = this.scoreCount;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.foodMatch;
        int hashCode14 = (((hashCode13 + (list == null ? 0 : list.hashCode())) * 31) + this.alcohol.hashCode()) * 31;
        Long l2 = this.bestDrinkDate;
        int hashCode15 = (hashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str11 = this.notes;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode15 + i;
    }

    public final void setAlcohol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alcohol = str;
    }

    public final void setArea(@Nullable String str) {
        this.area = str;
    }

    public final void setAutoAdd(int i) {
        this.autoAdd = i;
    }

    public final void setBestDrinkDate(@Nullable Long l) {
        this.bestDrinkDate = l;
    }

    public final void setCategoryId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryId = str;
    }

    public final void setCellNum(int i) {
        this.cellNum = i;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setFiltered(@Nullable Integer num) {
        this.filtered = num;
    }

    public final void setFoodMatch(@Nullable List<String> list) {
        this.foodMatch = list;
    }

    public final void setGrapes(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.grapes = list;
    }

    public final void setInventoryDate(long j) {
        this.inventoryDate = j;
    }

    public final void setNotes(@Nullable String str) {
        this.notes = str;
    }

    public final void setPositionNum(int i) {
        this.positionNum = i;
    }

    public final void setScore(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.score = str;
    }

    public final void setScoreCount(@Nullable String str) {
        this.scoreCount = str;
    }

    public final void setVivinoId(@Nullable String str) {
        this.vivinoId = str;
    }

    public final void setZoneName(@Nullable String str) {
        this.zoneName = str;
    }

    @NotNull
    public String toString() {
        return "WineBaseInfo(id=" + this.f15976id + ", inventoryId=" + this.inventoryId + ", positionNum=" + this.positionNum + ", photoUrl=" + this.photoUrl + ", wineFactoryName=" + this.wineFactoryName + ", wineName=" + this.wineName + ", wineType=" + this.wineType + ", favorite=" + this.favorite + ", produceYear=" + this.produceYear + ", remindAlarmDate=" + this.remindAlarmDate + ", deviceId=" + this.deviceId + ", zoneName=" + this.zoneName + ", cellNum=" + this.cellNum + ", categoryId=" + this.categoryId + ", filtered=" + this.filtered + ", inventoryDate=" + this.inventoryDate + ", area=" + this.area + ", country=" + this.country + ", grapes=" + this.grapes + ", autoAdd=" + this.autoAdd + ", vivinoId=" + this.vivinoId + ", score=" + this.score + ", scoreCount=" + this.scoreCount + ", foodMatch=" + this.foodMatch + ", alcohol=" + this.alcohol + ", bestDrinkDate=" + this.bestDrinkDate + ", notes=" + this.notes + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WineBaseInfo(long r35, long r37, int r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, int r44, java.lang.String r45, java.lang.Long r46, java.lang.String r47, java.lang.String r48, int r49, java.lang.String r50, java.lang.Integer r51, long r52, java.lang.String r54, java.lang.String r55, java.util.List r56, int r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.util.List r61, java.lang.String r62, java.lang.Long r63, java.lang.String r64, int r65, kotlin.jvm.internal.DefaultConstructorMarker r66) {
        /*
            r34 = this;
            r0 = r65
            r1 = r0 & 4
            r2 = -1
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r39
        L_0x000b:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0012
            r18 = r2
            goto L_0x0014
        L_0x0012:
            r18 = r49
        L_0x0014:
            r3 = r34
            r4 = r35
            r6 = r37
            r9 = r40
            r10 = r41
            r11 = r42
            r12 = r43
            r13 = r44
            r14 = r45
            r15 = r46
            r16 = r47
            r17 = r48
            r19 = r50
            r20 = r51
            r21 = r52
            r23 = r54
            r24 = r55
            r25 = r56
            r26 = r57
            r27 = r58
            r28 = r59
            r29 = r60
            r30 = r61
            r31 = r62
            r32 = r63
            r33 = r64
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo.<init>(long, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, long, java.lang.String, java.lang.String, java.util.List, int, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.Long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
