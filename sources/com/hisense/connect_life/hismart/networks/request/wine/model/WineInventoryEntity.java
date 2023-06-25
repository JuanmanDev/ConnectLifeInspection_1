package com.hisense.connect_life.hismart.networks.request.wine.model;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\bI\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001cJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rHÆ\u0003J\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020\u000f2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020YHÖ\u0001J\t\u0010Z\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR \u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010-R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b\u000e\u0010.\"\u0004\b/\u00100R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010-R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u001eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u001e¨\u0006["}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineInventoryEntity;", "", "id", "", "idInventory", "", "auid", "ageTo", "bestToOpenYearFrom", "bestToOpenYearTo", "dateAdded", "dateRemoved", "grapeType", "", "isFavorite", "", "name", "personalNotes", "region", "country", "shelfPosition", "exactPosition", "vintage", "vivinoId", "wineType", "winery", "imageUrl", "lastChanged", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgeTo", "()Ljava/lang/String;", "getAuid", "getBestToOpenYearFrom", "getBestToOpenYearTo", "getCountry", "getDateAdded", "getDateRemoved", "getExactPosition", "getGrapeType", "()Ljava/util/List;", "getId", "()J", "getIdInventory", "getImageUrl", "setImageUrl", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setFavorite", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLastChanged", "getName", "setName", "getPersonalNotes", "getRegion", "getShelfPosition", "getVintage", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVivinoId", "getWineType", "getWinery", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineInventoryEntity;", "equals", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: QueryCategory.kt */
public final class WineInventoryEntity {
    @ColumnInfo(name = "age_to")
    @Nullable
    public final String ageTo;
    @ColumnInfo(name = "auid")
    @Nullable
    public final String auid;
    @ColumnInfo(name = "best_to_open_year_from")
    @Nullable
    public final String bestToOpenYearFrom;
    @ColumnInfo(name = "best_to_open_year_to")
    @Nullable
    public final String bestToOpenYearTo;
    @ColumnInfo(name = "country")
    @Nullable
    public final String country;
    @ColumnInfo(name = "date_added")
    @Nullable
    public final String dateAdded;
    @ColumnInfo(name = "date_removed")
    @Nullable
    public final String dateRemoved;
    @ColumnInfo(name = "exact_position")
    @Nullable
    public final String exactPosition;
    @ColumnInfo(name = "grape_type")
    @Nullable
    public final List<String> grapeType;
    @PrimaryKey(autoGenerate = true)

    /* renamed from: id */
    public final long f15978id;
    @ColumnInfo(name = "id_inventory")
    @NotNull
    public final String idInventory;
    @ColumnInfo(name = "image_url")
    @Nullable
    public String imageUrl;
    @ColumnInfo(name = "favorite")
    @Nullable
    public Boolean isFavorite;
    @ColumnInfo(name = "last_changed")
    @Nullable
    public final String lastChanged;
    @ColumnInfo(name = "name")
    @Nullable
    public String name;
    @ColumnInfo(name = "personal_notes")
    @Nullable
    public final String personalNotes;
    @ColumnInfo(name = "region")
    @Nullable
    public final String region;
    @ColumnInfo(name = "shelf_position")
    @Nullable
    public final String shelfPosition;
    @ColumnInfo(name = "vintage")
    @Nullable
    public final Long vintage;
    @ColumnInfo(name = "vivino_id")
    @Nullable
    public final String vivinoId;
    @ColumnInfo(name = "wine_type")
    @Nullable
    public final String wineType;
    @ColumnInfo(name = "winery")
    @Nullable
    public final String winery;

    public WineInventoryEntity(long j, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Long l, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
        Intrinsics.checkNotNullParameter(str, "idInventory");
        this.f15978id = j;
        this.idInventory = str;
        this.auid = str2;
        this.ageTo = str3;
        this.bestToOpenYearFrom = str4;
        this.bestToOpenYearTo = str5;
        this.dateAdded = str6;
        this.dateRemoved = str7;
        this.grapeType = list;
        this.isFavorite = bool;
        this.name = str8;
        this.personalNotes = str9;
        this.region = str10;
        this.country = str11;
        this.shelfPosition = str12;
        this.exactPosition = str13;
        this.vintage = l;
        this.vivinoId = str14;
        this.wineType = str15;
        this.winery = str16;
        this.imageUrl = str17;
        this.lastChanged = str18;
    }

    public static /* synthetic */ WineInventoryEntity copy$default(WineInventoryEntity wineInventoryEntity, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, Long l, String str14, String str15, String str16, String str17, String str18, int i, Object obj) {
        WineInventoryEntity wineInventoryEntity2 = wineInventoryEntity;
        int i2 = i;
        return wineInventoryEntity.copy((i2 & 1) != 0 ? wineInventoryEntity2.f15978id : j, (i2 & 2) != 0 ? wineInventoryEntity2.idInventory : str, (i2 & 4) != 0 ? wineInventoryEntity2.auid : str2, (i2 & 8) != 0 ? wineInventoryEntity2.ageTo : str3, (i2 & 16) != 0 ? wineInventoryEntity2.bestToOpenYearFrom : str4, (i2 & 32) != 0 ? wineInventoryEntity2.bestToOpenYearTo : str5, (i2 & 64) != 0 ? wineInventoryEntity2.dateAdded : str6, (i2 & 128) != 0 ? wineInventoryEntity2.dateRemoved : str7, (i2 & 256) != 0 ? wineInventoryEntity2.grapeType : list, (i2 & 512) != 0 ? wineInventoryEntity2.isFavorite : bool, (i2 & 1024) != 0 ? wineInventoryEntity2.name : str8, (i2 & 2048) != 0 ? wineInventoryEntity2.personalNotes : str9, (i2 & 4096) != 0 ? wineInventoryEntity2.region : str10, (i2 & 8192) != 0 ? wineInventoryEntity2.country : str11, (i2 & 16384) != 0 ? wineInventoryEntity2.shelfPosition : str12, (i2 & 32768) != 0 ? wineInventoryEntity2.exactPosition : str13, (i2 & 65536) != 0 ? wineInventoryEntity2.vintage : l, (i2 & 131072) != 0 ? wineInventoryEntity2.vivinoId : str14, (i2 & 262144) != 0 ? wineInventoryEntity2.wineType : str15, (i2 & 524288) != 0 ? wineInventoryEntity2.winery : str16, (i2 & 1048576) != 0 ? wineInventoryEntity2.imageUrl : str17, (i2 & 2097152) != 0 ? wineInventoryEntity2.lastChanged : str18);
    }

    public final long component1() {
        return this.f15978id;
    }

    @Nullable
    public final Boolean component10() {
        return this.isFavorite;
    }

    @Nullable
    public final String component11() {
        return this.name;
    }

    @Nullable
    public final String component12() {
        return this.personalNotes;
    }

    @Nullable
    public final String component13() {
        return this.region;
    }

    @Nullable
    public final String component14() {
        return this.country;
    }

    @Nullable
    public final String component15() {
        return this.shelfPosition;
    }

    @Nullable
    public final String component16() {
        return this.exactPosition;
    }

    @Nullable
    public final Long component17() {
        return this.vintage;
    }

    @Nullable
    public final String component18() {
        return this.vivinoId;
    }

    @Nullable
    public final String component19() {
        return this.wineType;
    }

    @NotNull
    public final String component2() {
        return this.idInventory;
    }

    @Nullable
    public final String component20() {
        return this.winery;
    }

    @Nullable
    public final String component21() {
        return this.imageUrl;
    }

    @Nullable
    public final String component22() {
        return this.lastChanged;
    }

    @Nullable
    public final String component3() {
        return this.auid;
    }

    @Nullable
    public final String component4() {
        return this.ageTo;
    }

    @Nullable
    public final String component5() {
        return this.bestToOpenYearFrom;
    }

    @Nullable
    public final String component6() {
        return this.bestToOpenYearTo;
    }

    @Nullable
    public final String component7() {
        return this.dateAdded;
    }

    @Nullable
    public final String component8() {
        return this.dateRemoved;
    }

    @Nullable
    public final List<String> component9() {
        return this.grapeType;
    }

    @NotNull
    public final WineInventoryEntity copy(long j, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Long l, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
        long j2 = j;
        Intrinsics.checkNotNullParameter(str, "idInventory");
        return new WineInventoryEntity(j, str, str2, str3, str4, str5, str6, str7, list, bool, str8, str9, str10, str11, str12, str13, l, str14, str15, str16, str17, str18);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WineInventoryEntity)) {
            return false;
        }
        WineInventoryEntity wineInventoryEntity = (WineInventoryEntity) obj;
        return this.f15978id == wineInventoryEntity.f15978id && Intrinsics.areEqual((Object) this.idInventory, (Object) wineInventoryEntity.idInventory) && Intrinsics.areEqual((Object) this.auid, (Object) wineInventoryEntity.auid) && Intrinsics.areEqual((Object) this.ageTo, (Object) wineInventoryEntity.ageTo) && Intrinsics.areEqual((Object) this.bestToOpenYearFrom, (Object) wineInventoryEntity.bestToOpenYearFrom) && Intrinsics.areEqual((Object) this.bestToOpenYearTo, (Object) wineInventoryEntity.bestToOpenYearTo) && Intrinsics.areEqual((Object) this.dateAdded, (Object) wineInventoryEntity.dateAdded) && Intrinsics.areEqual((Object) this.dateRemoved, (Object) wineInventoryEntity.dateRemoved) && Intrinsics.areEqual((Object) this.grapeType, (Object) wineInventoryEntity.grapeType) && Intrinsics.areEqual((Object) this.isFavorite, (Object) wineInventoryEntity.isFavorite) && Intrinsics.areEqual((Object) this.name, (Object) wineInventoryEntity.name) && Intrinsics.areEqual((Object) this.personalNotes, (Object) wineInventoryEntity.personalNotes) && Intrinsics.areEqual((Object) this.region, (Object) wineInventoryEntity.region) && Intrinsics.areEqual((Object) this.country, (Object) wineInventoryEntity.country) && Intrinsics.areEqual((Object) this.shelfPosition, (Object) wineInventoryEntity.shelfPosition) && Intrinsics.areEqual((Object) this.exactPosition, (Object) wineInventoryEntity.exactPosition) && Intrinsics.areEqual((Object) this.vintage, (Object) wineInventoryEntity.vintage) && Intrinsics.areEqual((Object) this.vivinoId, (Object) wineInventoryEntity.vivinoId) && Intrinsics.areEqual((Object) this.wineType, (Object) wineInventoryEntity.wineType) && Intrinsics.areEqual((Object) this.winery, (Object) wineInventoryEntity.winery) && Intrinsics.areEqual((Object) this.imageUrl, (Object) wineInventoryEntity.imageUrl) && Intrinsics.areEqual((Object) this.lastChanged, (Object) wineInventoryEntity.lastChanged);
    }

    @Nullable
    public final String getAgeTo() {
        return this.ageTo;
    }

    @Nullable
    public final String getAuid() {
        return this.auid;
    }

    @Nullable
    public final String getBestToOpenYearFrom() {
        return this.bestToOpenYearFrom;
    }

    @Nullable
    public final String getBestToOpenYearTo() {
        return this.bestToOpenYearTo;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getDateAdded() {
        return this.dateAdded;
    }

    @Nullable
    public final String getDateRemoved() {
        return this.dateRemoved;
    }

    @Nullable
    public final String getExactPosition() {
        return this.exactPosition;
    }

    @Nullable
    public final List<String> getGrapeType() {
        return this.grapeType;
    }

    public final long getId() {
        return this.f15978id;
    }

    @NotNull
    public final String getIdInventory() {
        return this.idInventory;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getLastChanged() {
        return this.lastChanged;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPersonalNotes() {
        return this.personalNotes;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final String getShelfPosition() {
        return this.shelfPosition;
    }

    @Nullable
    public final Long getVintage() {
        return this.vintage;
    }

    @Nullable
    public final String getVivinoId() {
        return this.vivinoId;
    }

    @Nullable
    public final String getWineType() {
        return this.wineType;
    }

    @Nullable
    public final String getWinery() {
        return this.winery;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.f15978id) * 31) + this.idInventory.hashCode()) * 31;
        String str = this.auid;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ageTo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bestToOpenYearFrom;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bestToOpenYearTo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dateAdded;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dateRemoved;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.grapeType;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.name;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.personalNotes;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.region;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.country;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.shelfPosition;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.exactPosition;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Long l = this.vintage;
        int hashCode16 = (hashCode15 + (l == null ? 0 : l.hashCode())) * 31;
        String str13 = this.vivinoId;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.wineType;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.winery;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.imageUrl;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.lastChanged;
        if (str17 != null) {
            i = str17.hashCode();
        }
        return hashCode20 + i;
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setFavorite(@Nullable Boolean bool) {
        this.isFavorite = bool;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "WineInventoryEntity(id=" + this.f15978id + ", idInventory=" + this.idInventory + ", auid=" + this.auid + ", ageTo=" + this.ageTo + ", bestToOpenYearFrom=" + this.bestToOpenYearFrom + ", bestToOpenYearTo=" + this.bestToOpenYearTo + ", dateAdded=" + this.dateAdded + ", dateRemoved=" + this.dateRemoved + ", grapeType=" + this.grapeType + ", isFavorite=" + this.isFavorite + ", name=" + this.name + ", personalNotes=" + this.personalNotes + ", region=" + this.region + ", country=" + this.country + ", shelfPosition=" + this.shelfPosition + ", exactPosition=" + this.exactPosition + ", vintage=" + this.vintage + ", vivinoId=" + this.vivinoId + ", wineType=" + this.wineType + ", winery=" + this.winery + ", imageUrl=" + this.imageUrl + ", lastChanged=" + this.lastChanged + ')';
    }
}
