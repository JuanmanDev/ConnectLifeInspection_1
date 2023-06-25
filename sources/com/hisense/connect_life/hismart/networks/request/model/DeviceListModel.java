package com.hisense.connect_life.hismart.networks.request.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0019J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0007HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010Q\u001a\u00020\u0007HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\t\u0010S\u001a\u00020\u0007HÆ\u0003J\t\u0010T\u001a\u00020\u0007HÆ\u0003Jå\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020\u0005HÖ\u0001J\t\u0010Z\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001a\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001b\"\u0004\b\"\u0010\u001dR\u001a\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001b\"\u0004\b0\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001b\"\u0004\b:\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001b\"\u0004\b<\u0010\u001dR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001b\"\u0004\bB\u0010\u001d¨\u0006["}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/model/DeviceListModel;", "", "lastUpdateTime", "", "autoAdd", "", "deviceId", "", "vivinoId", "deviceList", "", "Lcom/hisense/connect_life/hismart/networks/request/model/WinePositionModel;", "isAutoAdd", "isFavorite", "score", "scoreCount", "foodMatch", "alcohol", "wineType", "area", "country", "grapes", "photoUrl", "wineFactoryName", "wineName", "(JILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlcohol", "()Ljava/lang/String;", "setAlcohol", "(Ljava/lang/String;)V", "getArea", "setArea", "getAutoAdd", "()I", "setAutoAdd", "(I)V", "getCountry", "setCountry", "getDeviceId", "setDeviceId", "getDeviceList", "()Ljava/util/List;", "setDeviceList", "(Ljava/util/List;)V", "getFoodMatch", "setFoodMatch", "getGrapes", "setGrapes", "setFavorite", "getLastUpdateTime", "()J", "setLastUpdateTime", "(J)V", "getPhotoUrl", "setPhotoUrl", "getScore", "setScore", "getScoreCount", "setScoreCount", "getVivinoId", "setVivinoId", "getWineFactoryName", "setWineFactoryName", "getWineName", "setWineName", "getWineType", "setWineType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceListModel.kt */
public final class DeviceListModel {
    @Nullable
    public String alcohol;
    @Nullable
    public String area;
    public int autoAdd;
    @Nullable
    public String country;
    @NotNull
    public String deviceId;
    @Nullable
    public List<WinePositionModel> deviceList;
    @Nullable
    public List<String> foodMatch;
    @Nullable
    public List<String> grapes;
    @NotNull
    public String isAutoAdd;
    @NotNull
    public String isFavorite;
    public long lastUpdateTime;
    @Nullable
    public String photoUrl;
    @NotNull
    public String score;
    @NotNull
    public String scoreCount;
    @Nullable
    public String vivinoId;
    @Nullable
    public String wineFactoryName;
    @Nullable
    public String wineName;
    @Nullable
    public String wineType;

    public DeviceListModel(long j, int i, @NotNull String str, @Nullable String str2, @Nullable List<WinePositionModel> list, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @Nullable List<String> list2, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable List<String> list3, @Nullable String str11, @Nullable String str12, @Nullable String str13) {
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "isAutoAdd");
        Intrinsics.checkNotNullParameter(str14, "isFavorite");
        Intrinsics.checkNotNullParameter(str15, "score");
        Intrinsics.checkNotNullParameter(str16, "scoreCount");
        this.lastUpdateTime = j;
        this.autoAdd = i;
        this.deviceId = str;
        this.vivinoId = str2;
        this.deviceList = list;
        this.isAutoAdd = str3;
        this.isFavorite = str14;
        this.score = str15;
        this.scoreCount = str16;
        this.foodMatch = list2;
        this.alcohol = str7;
        this.wineType = str8;
        this.area = str9;
        this.country = str10;
        this.grapes = list3;
        this.photoUrl = str11;
        this.wineFactoryName = str12;
        this.wineName = str13;
    }

    public static /* synthetic */ DeviceListModel copy$default(DeviceListModel deviceListModel, long j, int i, String str, String str2, List list, String str3, String str4, String str5, String str6, List list2, String str7, String str8, String str9, String str10, List list3, String str11, String str12, String str13, int i2, Object obj) {
        DeviceListModel deviceListModel2 = deviceListModel;
        int i3 = i2;
        return deviceListModel.copy((i3 & 1) != 0 ? deviceListModel2.lastUpdateTime : j, (i3 & 2) != 0 ? deviceListModel2.autoAdd : i, (i3 & 4) != 0 ? deviceListModel2.deviceId : str, (i3 & 8) != 0 ? deviceListModel2.vivinoId : str2, (i3 & 16) != 0 ? deviceListModel2.deviceList : list, (i3 & 32) != 0 ? deviceListModel2.isAutoAdd : str3, (i3 & 64) != 0 ? deviceListModel2.isFavorite : str4, (i3 & 128) != 0 ? deviceListModel2.score : str5, (i3 & 256) != 0 ? deviceListModel2.scoreCount : str6, (i3 & 512) != 0 ? deviceListModel2.foodMatch : list2, (i3 & 1024) != 0 ? deviceListModel2.alcohol : str7, (i3 & 2048) != 0 ? deviceListModel2.wineType : str8, (i3 & 4096) != 0 ? deviceListModel2.area : str9, (i3 & 8192) != 0 ? deviceListModel2.country : str10, (i3 & 16384) != 0 ? deviceListModel2.grapes : list3, (i3 & 32768) != 0 ? deviceListModel2.photoUrl : str11, (i3 & 65536) != 0 ? deviceListModel2.wineFactoryName : str12, (i3 & 131072) != 0 ? deviceListModel2.wineName : str13);
    }

    public final long component1() {
        return this.lastUpdateTime;
    }

    @Nullable
    public final List<String> component10() {
        return this.foodMatch;
    }

    @Nullable
    public final String component11() {
        return this.alcohol;
    }

    @Nullable
    public final String component12() {
        return this.wineType;
    }

    @Nullable
    public final String component13() {
        return this.area;
    }

    @Nullable
    public final String component14() {
        return this.country;
    }

    @Nullable
    public final List<String> component15() {
        return this.grapes;
    }

    @Nullable
    public final String component16() {
        return this.photoUrl;
    }

    @Nullable
    public final String component17() {
        return this.wineFactoryName;
    }

    @Nullable
    public final String component18() {
        return this.wineName;
    }

    public final int component2() {
        return this.autoAdd;
    }

    @NotNull
    public final String component3() {
        return this.deviceId;
    }

    @Nullable
    public final String component4() {
        return this.vivinoId;
    }

    @Nullable
    public final List<WinePositionModel> component5() {
        return this.deviceList;
    }

    @NotNull
    public final String component6() {
        return this.isAutoAdd;
    }

    @NotNull
    public final String component7() {
        return this.isFavorite;
    }

    @NotNull
    public final String component8() {
        return this.score;
    }

    @NotNull
    public final String component9() {
        return this.scoreCount;
    }

    @NotNull
    public final DeviceListModel copy(long j, int i, @NotNull String str, @Nullable String str2, @Nullable List<WinePositionModel> list, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @Nullable List<String> list2, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable List<String> list3, @Nullable String str11, @Nullable String str12, @Nullable String str13) {
        long j2 = j;
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "isAutoAdd");
        Intrinsics.checkNotNullParameter(str4, "isFavorite");
        Intrinsics.checkNotNullParameter(str5, "score");
        Intrinsics.checkNotNullParameter(str6, "scoreCount");
        return new DeviceListModel(j, i, str, str2, list, str3, str4, str5, str6, list2, str7, str8, str9, str10, list3, str11, str12, str13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceListModel)) {
            return false;
        }
        DeviceListModel deviceListModel = (DeviceListModel) obj;
        return this.lastUpdateTime == deviceListModel.lastUpdateTime && this.autoAdd == deviceListModel.autoAdd && Intrinsics.areEqual((Object) this.deviceId, (Object) deviceListModel.deviceId) && Intrinsics.areEqual((Object) this.vivinoId, (Object) deviceListModel.vivinoId) && Intrinsics.areEqual((Object) this.deviceList, (Object) deviceListModel.deviceList) && Intrinsics.areEqual((Object) this.isAutoAdd, (Object) deviceListModel.isAutoAdd) && Intrinsics.areEqual((Object) this.isFavorite, (Object) deviceListModel.isFavorite) && Intrinsics.areEqual((Object) this.score, (Object) deviceListModel.score) && Intrinsics.areEqual((Object) this.scoreCount, (Object) deviceListModel.scoreCount) && Intrinsics.areEqual((Object) this.foodMatch, (Object) deviceListModel.foodMatch) && Intrinsics.areEqual((Object) this.alcohol, (Object) deviceListModel.alcohol) && Intrinsics.areEqual((Object) this.wineType, (Object) deviceListModel.wineType) && Intrinsics.areEqual((Object) this.area, (Object) deviceListModel.area) && Intrinsics.areEqual((Object) this.country, (Object) deviceListModel.country) && Intrinsics.areEqual((Object) this.grapes, (Object) deviceListModel.grapes) && Intrinsics.areEqual((Object) this.photoUrl, (Object) deviceListModel.photoUrl) && Intrinsics.areEqual((Object) this.wineFactoryName, (Object) deviceListModel.wineFactoryName) && Intrinsics.areEqual((Object) this.wineName, (Object) deviceListModel.wineName);
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
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final List<WinePositionModel> getDeviceList() {
        return this.deviceList;
    }

    @Nullable
    public final List<String> getFoodMatch() {
        return this.foodMatch;
    }

    @Nullable
    public final List<String> getGrapes() {
        return this.grapes;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Nullable
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    @NotNull
    public final String getScore() {
        return this.score;
    }

    @NotNull
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

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.lastUpdateTime) * 31) + Integer.hashCode(this.autoAdd)) * 31) + this.deviceId.hashCode()) * 31;
        String str = this.vivinoId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<WinePositionModel> list = this.deviceList;
        int hashCode3 = (((((((((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.isAutoAdd.hashCode()) * 31) + this.isFavorite.hashCode()) * 31) + this.score.hashCode()) * 31) + this.scoreCount.hashCode()) * 31;
        List<String> list2 = this.foodMatch;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.alcohol;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wineType;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.area;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.country;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list3 = this.grapes;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str6 = this.photoUrl;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.wineFactoryName;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.wineName;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode11 + i;
    }

    @NotNull
    public final String isAutoAdd() {
        return this.isAutoAdd;
    }

    @NotNull
    public final String isFavorite() {
        return this.isFavorite;
    }

    public final void setAlcohol(@Nullable String str) {
        this.alcohol = str;
    }

    public final void setArea(@Nullable String str) {
        this.area = str;
    }

    public final void setAutoAdd(int i) {
        this.autoAdd = i;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setDeviceList(@Nullable List<WinePositionModel> list) {
        this.deviceList = list;
    }

    public final void setFavorite(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isFavorite = str;
    }

    public final void setFoodMatch(@Nullable List<String> list) {
        this.foodMatch = list;
    }

    public final void setGrapes(@Nullable List<String> list) {
        this.grapes = list;
    }

    public final void setLastUpdateTime(long j) {
        this.lastUpdateTime = j;
    }

    public final void setPhotoUrl(@Nullable String str) {
        this.photoUrl = str;
    }

    public final void setScore(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.score = str;
    }

    public final void setScoreCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scoreCount = str;
    }

    public final void setVivinoId(@Nullable String str) {
        this.vivinoId = str;
    }

    public final void setWineFactoryName(@Nullable String str) {
        this.wineFactoryName = str;
    }

    public final void setWineName(@Nullable String str) {
        this.wineName = str;
    }

    public final void setWineType(@Nullable String str) {
        this.wineType = str;
    }

    @NotNull
    public String toString() {
        return "DeviceListModel(lastUpdateTime=" + this.lastUpdateTime + ", autoAdd=" + this.autoAdd + ", deviceId=" + this.deviceId + ", vivinoId=" + this.vivinoId + ", deviceList=" + this.deviceList + ", isAutoAdd=" + this.isAutoAdd + ", isFavorite=" + this.isFavorite + ", score=" + this.score + ", scoreCount=" + this.scoreCount + ", foodMatch=" + this.foodMatch + ", alcohol=" + this.alcohol + ", wineType=" + this.wineType + ", area=" + this.area + ", country=" + this.country + ", grapes=" + this.grapes + ", photoUrl=" + this.photoUrl + ", wineFactoryName=" + this.wineFactoryName + ", wineName=" + this.wineName + ')';
    }

    public final void setAutoAdd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isAutoAdd = str;
    }
}
