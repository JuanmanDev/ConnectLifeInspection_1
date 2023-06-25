package com.juconnect.connectlife.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\\\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u000eHÆ\u0003J\t\u0010[\u001a\u00020\u000eHÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00109J¸\u0002\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010fJ\u0013\u0010g\u001a\u00020\u000e2\b\u0010h\u001a\u0004\u0018\u00010\u0001H\u0002J\u0006\u0010i\u001a\u00020\u0003J\b\u0010j\u001a\u00020kH\u0016J\t\u0010l\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010!\"\u0004\b.\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010!\"\u0004\b0\u0010(R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b3\u0010$\"\u0004\b4\u00105R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010(R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\b\r\u00109\"\u0004\b:\u0010;R\u001a\u0010\u001c\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u001b\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010=\"\u0004\b@\u0010?R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010!\"\u0004\bC\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010(R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010%\u001a\u0004\bH\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010!¨\u0006m"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/WineInventoryBean;", "", "idInventory", "", "auid", "ageTo", "bestDrinkDate", "", "dateAdded", "dateEnterd", "dateRemoved", "grapeType", "", "isFavorite", "", "name", "personalNotes", "region", "country", "shelfPosition", "exactPosition", "vintage", "vivinoId", "wineType", "winery", "imageUrl", "lastChanged", "isSelected", "isFilteredOut", "id", "categoryId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Long;Ljava/lang/String;)V", "getAgeTo", "()Ljava/lang/String;", "getAuid", "getBestDrinkDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCategoryId", "setCategoryId", "(Ljava/lang/String;)V", "getCountry", "getDateAdded", "getDateEnterd", "()J", "getDateRemoved", "setDateRemoved", "getExactPosition", "setExactPosition", "getGrapeType", "()Ljava/util/List;", "getId", "setId", "(Ljava/lang/Long;)V", "getIdInventory", "getImageUrl", "setImageUrl", "()Ljava/lang/Boolean;", "setFavorite", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setFilteredOut", "(Z)V", "setSelected", "getLastChanged", "getName", "setName", "getPersonalNotes", "getRegion", "getShelfPosition", "setShelfPosition", "getVintage", "getVivinoId", "getWineType", "getWinery", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Long;Ljava/lang/String;)Lcom/juconnect/connectlife/model/WineInventoryBean;", "equals", "other", "getIdentify", "hashCode", "", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineInventoryBean.kt */
public final class WineInventoryBean {
    @Nullable
    public final String ageTo;
    @Nullable
    public final String auid;
    @Nullable
    public final Long bestDrinkDate;
    @Nullable
    public String categoryId;
    @Nullable
    public final String country;
    @Nullable
    public final String dateAdded;
    public final long dateEnterd;
    @Nullable
    public String dateRemoved;
    @Nullable
    public String exactPosition;
    @Nullable
    public final List<String> grapeType;
    @Nullable

    /* renamed from: id */
    public Long f16719id;
    @NotNull
    public final String idInventory;
    @Nullable
    public String imageUrl;
    @Nullable
    public Boolean isFavorite;
    public boolean isFilteredOut;
    public boolean isSelected;
    @Nullable
    public final String lastChanged;
    @Nullable
    public String name;
    @Nullable
    public final String personalNotes;
    @Nullable
    public final String region;
    @Nullable
    public String shelfPosition;
    @Nullable
    public final Long vintage;
    @Nullable
    public final String vivinoId;
    @Nullable
    public final String wineType;
    @Nullable
    public final String winery;

    public WineInventoryBean(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable String str4, long j, @Nullable String str5, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Long l2, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, boolean z, boolean z2, @Nullable Long l3, @Nullable String str17) {
        Intrinsics.checkNotNullParameter(str, "idInventory");
        this.idInventory = str;
        this.auid = str2;
        this.ageTo = str3;
        this.bestDrinkDate = l;
        this.dateAdded = str4;
        this.dateEnterd = j;
        this.dateRemoved = str5;
        this.grapeType = list;
        this.isFavorite = bool;
        this.name = str6;
        this.personalNotes = str7;
        this.region = str8;
        this.country = str9;
        this.shelfPosition = str10;
        this.exactPosition = str11;
        this.vintage = l2;
        this.vivinoId = str12;
        this.wineType = str13;
        this.winery = str14;
        this.imageUrl = str15;
        this.lastChanged = str16;
        this.isSelected = z;
        this.isFilteredOut = z2;
        this.f16719id = l3;
        this.categoryId = str17;
    }

    public static /* synthetic */ WineInventoryBean copy$default(WineInventoryBean wineInventoryBean, String str, String str2, String str3, Long l, String str4, long j, String str5, List list, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, Long l2, String str12, String str13, String str14, String str15, String str16, boolean z, boolean z2, Long l3, String str17, int i, Object obj) {
        WineInventoryBean wineInventoryBean2 = wineInventoryBean;
        int i2 = i;
        return wineInventoryBean.copy((i2 & 1) != 0 ? wineInventoryBean2.idInventory : str, (i2 & 2) != 0 ? wineInventoryBean2.auid : str2, (i2 & 4) != 0 ? wineInventoryBean2.ageTo : str3, (i2 & 8) != 0 ? wineInventoryBean2.bestDrinkDate : l, (i2 & 16) != 0 ? wineInventoryBean2.dateAdded : str4, (i2 & 32) != 0 ? wineInventoryBean2.dateEnterd : j, (i2 & 64) != 0 ? wineInventoryBean2.dateRemoved : str5, (i2 & 128) != 0 ? wineInventoryBean2.grapeType : list, (i2 & 256) != 0 ? wineInventoryBean2.isFavorite : bool, (i2 & 512) != 0 ? wineInventoryBean2.name : str6, (i2 & 1024) != 0 ? wineInventoryBean2.personalNotes : str7, (i2 & 2048) != 0 ? wineInventoryBean2.region : str8, (i2 & 4096) != 0 ? wineInventoryBean2.country : str9, (i2 & 8192) != 0 ? wineInventoryBean2.shelfPosition : str10, (i2 & 16384) != 0 ? wineInventoryBean2.exactPosition : str11, (i2 & 32768) != 0 ? wineInventoryBean2.vintage : l2, (i2 & 65536) != 0 ? wineInventoryBean2.vivinoId : str12, (i2 & 131072) != 0 ? wineInventoryBean2.wineType : str13, (i2 & 262144) != 0 ? wineInventoryBean2.winery : str14, (i2 & 524288) != 0 ? wineInventoryBean2.imageUrl : str15, (i2 & 1048576) != 0 ? wineInventoryBean2.lastChanged : str16, (i2 & 2097152) != 0 ? wineInventoryBean2.isSelected : z, (i2 & 4194304) != 0 ? wineInventoryBean2.isFilteredOut : z2, (i2 & 8388608) != 0 ? wineInventoryBean2.f16719id : l3, (i2 & 16777216) != 0 ? wineInventoryBean2.categoryId : str17);
    }

    @NotNull
    public final String component1() {
        return this.idInventory;
    }

    @Nullable
    public final String component10() {
        return this.name;
    }

    @Nullable
    public final String component11() {
        return this.personalNotes;
    }

    @Nullable
    public final String component12() {
        return this.region;
    }

    @Nullable
    public final String component13() {
        return this.country;
    }

    @Nullable
    public final String component14() {
        return this.shelfPosition;
    }

    @Nullable
    public final String component15() {
        return this.exactPosition;
    }

    @Nullable
    public final Long component16() {
        return this.vintage;
    }

    @Nullable
    public final String component17() {
        return this.vivinoId;
    }

    @Nullable
    public final String component18() {
        return this.wineType;
    }

    @Nullable
    public final String component19() {
        return this.winery;
    }

    @Nullable
    public final String component2() {
        return this.auid;
    }

    @Nullable
    public final String component20() {
        return this.imageUrl;
    }

    @Nullable
    public final String component21() {
        return this.lastChanged;
    }

    public final boolean component22() {
        return this.isSelected;
    }

    public final boolean component23() {
        return this.isFilteredOut;
    }

    @Nullable
    public final Long component24() {
        return this.f16719id;
    }

    @Nullable
    public final String component25() {
        return this.categoryId;
    }

    @Nullable
    public final String component3() {
        return this.ageTo;
    }

    @Nullable
    public final Long component4() {
        return this.bestDrinkDate;
    }

    @Nullable
    public final String component5() {
        return this.dateAdded;
    }

    public final long component6() {
        return this.dateEnterd;
    }

    @Nullable
    public final String component7() {
        return this.dateRemoved;
    }

    @Nullable
    public final List<String> component8() {
        return this.grapeType;
    }

    @Nullable
    public final Boolean component9() {
        return this.isFavorite;
    }

    @NotNull
    public final WineInventoryBean copy(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable String str4, long j, @Nullable String str5, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Long l2, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, boolean z, boolean z2, @Nullable Long l3, @Nullable String str17) {
        String str18 = str;
        String str19 = str18;
        Intrinsics.checkNotNullParameter(str18, "idInventory");
        return new WineInventoryBean(str18, str2, str3, l, str4, j, str5, list, bool, str6, str7, str8, str9, str10, str11, l2, str12, str13, str14, str15, str16, z, z2, l3, str17);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) WineInventoryBean.class, (Object) obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            WineInventoryBean wineInventoryBean = (WineInventoryBean) obj;
            return Intrinsics.areEqual((Object) String.valueOf(this.grapeType), (Object) String.valueOf(wineInventoryBean.grapeType)) && Intrinsics.areEqual((Object) this.name, (Object) wineInventoryBean.name) && Intrinsics.areEqual((Object) this.region, (Object) wineInventoryBean.region) && Intrinsics.areEqual((Object) this.vintage, (Object) wineInventoryBean.vintage) && Intrinsics.areEqual((Object) this.winery, (Object) wineInventoryBean.winery);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.juconnect.connectlife.model.WineInventoryBean");
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
    public final Long getBestDrinkDate() {
        return this.bestDrinkDate;
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getDateAdded() {
        return this.dateAdded;
    }

    public final long getDateEnterd() {
        return this.dateEnterd;
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

    @Nullable
    public final Long getId() {
        return this.f16719id;
    }

    @NotNull
    public final String getIdInventory() {
        return this.idInventory;
    }

    @NotNull
    public final String getIdentify() {
        String str = getWinery() + "_" + getVintage() + "_" + getRegion() + "_" + getName() + "_" + String.valueOf(getGrapeType());
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
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
        List<String> list = this.grapeType;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.vintage;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.winery;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isFilteredOut() {
        return this.isFilteredOut;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCategoryId(@Nullable String str) {
        this.categoryId = str;
    }

    public final void setDateRemoved(@Nullable String str) {
        this.dateRemoved = str;
    }

    public final void setExactPosition(@Nullable String str) {
        this.exactPosition = str;
    }

    public final void setFavorite(@Nullable Boolean bool) {
        this.isFavorite = bool;
    }

    public final void setFilteredOut(boolean z) {
        this.isFilteredOut = z;
    }

    public final void setId(@Nullable Long l) {
        this.f16719id = l;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShelfPosition(@Nullable String str) {
        this.shelfPosition = str;
    }

    @NotNull
    public String toString() {
        return "WineInventoryBean(idInventory=" + this.idInventory + ", auid=" + this.auid + ", ageTo=" + this.ageTo + ", bestDrinkDate=" + this.bestDrinkDate + ", dateAdded=" + this.dateAdded + ", dateEnterd=" + this.dateEnterd + ", dateRemoved=" + this.dateRemoved + ", grapeType=" + this.grapeType + ", isFavorite=" + this.isFavorite + ", name=" + this.name + ", personalNotes=" + this.personalNotes + ", region=" + this.region + ", country=" + this.country + ", shelfPosition=" + this.shelfPosition + ", exactPosition=" + this.exactPosition + ", vintage=" + this.vintage + ", vivinoId=" + this.vivinoId + ", wineType=" + this.wineType + ", winery=" + this.winery + ", imageUrl=" + this.imageUrl + ", lastChanged=" + this.lastChanged + ", isSelected=" + this.isSelected + ", isFilteredOut=" + this.isFilteredOut + ", id=" + this.f16719id + ", categoryId=" + this.categoryId + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WineInventoryBean(java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.Long r34, java.lang.String r35, long r36, java.lang.String r38, java.util.List r39, java.lang.Boolean r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.Long r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, boolean r53, boolean r54, java.lang.Long r55, java.lang.String r56, int r57, kotlin.jvm.internal.DefaultConstructorMarker r58) {
        /*
            r30 = this;
            r0 = r57
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000b
            r17 = r2
            goto L_0x000d
        L_0x000b:
            r17 = r44
        L_0x000d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0014
            r18 = r2
            goto L_0x0016
        L_0x0014:
            r18 = r45
        L_0x0016:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x001d
            r19 = r2
            goto L_0x001f
        L_0x001d:
            r19 = r46
        L_0x001f:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L_0x0028
            r26 = r2
            goto L_0x002a
        L_0x0028:
            r26 = r53
        L_0x002a:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0032
            r27 = r2
            goto L_0x0034
        L_0x0032:
            r27 = r54
        L_0x0034:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0042
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r28 = r0
            goto L_0x0044
        L_0x0042:
            r28 = r55
        L_0x0044:
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r20 = r47
            r21 = r48
            r22 = r49
            r23 = r50
            r24 = r51
            r25 = r52
            r29 = r56
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.model.WineInventoryBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, long, java.lang.String, java.util.List, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.Long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
