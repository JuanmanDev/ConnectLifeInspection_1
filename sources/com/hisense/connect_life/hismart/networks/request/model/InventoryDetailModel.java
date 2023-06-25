package com.hisense.connect_life.hismart.networks.request.model;

import com.hisense.connect_life.core.global.KeyConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bJ\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0002\u0010\u0017J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J½\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u0005HÆ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\bHÖ\u0001J\t\u0010V\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0011\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0012\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010\u0013\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u001a\u0010\u0015\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010!\"\u0004\b+\u0010#R\u001a\u0010\u0014\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010!\"\u0004\b,\u0010#R\u001a\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010!\"\u0004\b.\u0010#R\u001a\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R\u001a\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010!\"\u0004\b4\u0010#R\u001a\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR\u001a\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0019\"\u0004\b>\u0010\u001b¨\u0006W"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/model/InventoryDetailModel;", "", "inventoryId", "", "deviceId", "", "zoneName", "cellNum", "", "positionNum", "bestDrinkDate", "notes", "photoUrl", "wineFactoryName", "wineName", "wineType", "produceYear", "area", "country", "grapes", "isFavorite", "isAutoAdd", "vivinoId", "(JLjava/lang/String;Ljava/lang/String;IIJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getArea", "()Ljava/lang/String;", "setArea", "(Ljava/lang/String;)V", "getBestDrinkDate", "()J", "setBestDrinkDate", "(J)V", "getCellNum", "()I", "setCellNum", "(I)V", "getCountry", "setCountry", "getDeviceId", "setDeviceId", "getGrapes", "setGrapes", "getInventoryId", "setAutoAdd", "setFavorite", "getNotes", "setNotes", "getPhotoUrl", "setPhotoUrl", "getPositionNum", "setPositionNum", "getProduceYear", "setProduceYear", "getVivinoId", "setVivinoId", "getWineFactoryName", "setWineFactoryName", "getWineName", "setWineName", "getWineType", "setWineType", "getZoneName", "setZoneName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryDetailModel.kt */
public final class InventoryDetailModel {
    @NotNull
    public String area;
    public long bestDrinkDate;
    public int cellNum;
    @NotNull
    public String country;
    @NotNull
    public String deviceId;
    @NotNull
    public String grapes;
    public final long inventoryId;
    public int isAutoAdd;
    public int isFavorite;
    public int notes;
    @NotNull
    public String photoUrl;
    public int positionNum;
    public int produceYear;
    @NotNull
    public String vivinoId;
    @NotNull
    public String wineFactoryName;
    @NotNull
    public String wineName;
    @NotNull
    public String wineType;
    @NotNull
    public String zoneName;

    public InventoryDetailModel(long j, @NotNull String str, @NotNull String str2, int i, int i2, long j2, int i3, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i4, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i5, int i6, @NotNull String str10) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        Intrinsics.checkNotNullParameter(str11, "deviceId");
        Intrinsics.checkNotNullParameter(str12, "zoneName");
        Intrinsics.checkNotNullParameter(str13, "photoUrl");
        Intrinsics.checkNotNullParameter(str14, "wineFactoryName");
        Intrinsics.checkNotNullParameter(str15, "wineName");
        Intrinsics.checkNotNullParameter(str16, "wineType");
        Intrinsics.checkNotNullParameter(str17, "area");
        Intrinsics.checkNotNullParameter(str18, "country");
        Intrinsics.checkNotNullParameter(str19, "grapes");
        Intrinsics.checkNotNullParameter(str20, KeyConst.KEY_VIVINO_ID);
        this.inventoryId = j;
        this.deviceId = str11;
        this.zoneName = str12;
        this.cellNum = i;
        this.positionNum = i2;
        this.bestDrinkDate = j2;
        this.notes = i3;
        this.photoUrl = str13;
        this.wineFactoryName = str14;
        this.wineName = str15;
        this.wineType = str16;
        this.produceYear = i4;
        this.area = str17;
        this.country = str18;
        this.grapes = str19;
        this.isFavorite = i5;
        this.isAutoAdd = i6;
        this.vivinoId = str20;
    }

    public static /* synthetic */ InventoryDetailModel copy$default(InventoryDetailModel inventoryDetailModel, long j, String str, String str2, int i, int i2, long j2, int i3, String str3, String str4, String str5, String str6, int i4, String str7, String str8, String str9, int i5, int i6, String str10, int i7, Object obj) {
        InventoryDetailModel inventoryDetailModel2 = inventoryDetailModel;
        int i8 = i7;
        return inventoryDetailModel.copy((i8 & 1) != 0 ? inventoryDetailModel2.inventoryId : j, (i8 & 2) != 0 ? inventoryDetailModel2.deviceId : str, (i8 & 4) != 0 ? inventoryDetailModel2.zoneName : str2, (i8 & 8) != 0 ? inventoryDetailModel2.cellNum : i, (i8 & 16) != 0 ? inventoryDetailModel2.positionNum : i2, (i8 & 32) != 0 ? inventoryDetailModel2.bestDrinkDate : j2, (i8 & 64) != 0 ? inventoryDetailModel2.notes : i3, (i8 & 128) != 0 ? inventoryDetailModel2.photoUrl : str3, (i8 & 256) != 0 ? inventoryDetailModel2.wineFactoryName : str4, (i8 & 512) != 0 ? inventoryDetailModel2.wineName : str5, (i8 & 1024) != 0 ? inventoryDetailModel2.wineType : str6, (i8 & 2048) != 0 ? inventoryDetailModel2.produceYear : i4, (i8 & 4096) != 0 ? inventoryDetailModel2.area : str7, (i8 & 8192) != 0 ? inventoryDetailModel2.country : str8, (i8 & 16384) != 0 ? inventoryDetailModel2.grapes : str9, (i8 & 32768) != 0 ? inventoryDetailModel2.isFavorite : i5, (i8 & 65536) != 0 ? inventoryDetailModel2.isAutoAdd : i6, (i8 & 131072) != 0 ? inventoryDetailModel2.vivinoId : str10);
    }

    public final long component1() {
        return this.inventoryId;
    }

    @NotNull
    public final String component10() {
        return this.wineName;
    }

    @NotNull
    public final String component11() {
        return this.wineType;
    }

    public final int component12() {
        return this.produceYear;
    }

    @NotNull
    public final String component13() {
        return this.area;
    }

    @NotNull
    public final String component14() {
        return this.country;
    }

    @NotNull
    public final String component15() {
        return this.grapes;
    }

    public final int component16() {
        return this.isFavorite;
    }

    public final int component17() {
        return this.isAutoAdd;
    }

    @NotNull
    public final String component18() {
        return this.vivinoId;
    }

    @NotNull
    public final String component2() {
        return this.deviceId;
    }

    @NotNull
    public final String component3() {
        return this.zoneName;
    }

    public final int component4() {
        return this.cellNum;
    }

    public final int component5() {
        return this.positionNum;
    }

    public final long component6() {
        return this.bestDrinkDate;
    }

    public final int component7() {
        return this.notes;
    }

    @NotNull
    public final String component8() {
        return this.photoUrl;
    }

    @NotNull
    public final String component9() {
        return this.wineFactoryName;
    }

    @NotNull
    public final InventoryDetailModel copy(long j, @NotNull String str, @NotNull String str2, int i, int i2, long j2, int i3, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i4, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i5, int i6, @NotNull String str10) {
        long j3 = j;
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, "zoneName");
        Intrinsics.checkNotNullParameter(str3, "photoUrl");
        Intrinsics.checkNotNullParameter(str4, "wineFactoryName");
        Intrinsics.checkNotNullParameter(str5, "wineName");
        Intrinsics.checkNotNullParameter(str6, "wineType");
        Intrinsics.checkNotNullParameter(str7, "area");
        Intrinsics.checkNotNullParameter(str8, "country");
        Intrinsics.checkNotNullParameter(str9, "grapes");
        Intrinsics.checkNotNullParameter(str10, KeyConst.KEY_VIVINO_ID);
        return new InventoryDetailModel(j, str, str2, i, i2, j2, i3, str3, str4, str5, str6, i4, str7, str8, str9, i5, i6, str10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InventoryDetailModel)) {
            return false;
        }
        InventoryDetailModel inventoryDetailModel = (InventoryDetailModel) obj;
        return this.inventoryId == inventoryDetailModel.inventoryId && Intrinsics.areEqual((Object) this.deviceId, (Object) inventoryDetailModel.deviceId) && Intrinsics.areEqual((Object) this.zoneName, (Object) inventoryDetailModel.zoneName) && this.cellNum == inventoryDetailModel.cellNum && this.positionNum == inventoryDetailModel.positionNum && this.bestDrinkDate == inventoryDetailModel.bestDrinkDate && this.notes == inventoryDetailModel.notes && Intrinsics.areEqual((Object) this.photoUrl, (Object) inventoryDetailModel.photoUrl) && Intrinsics.areEqual((Object) this.wineFactoryName, (Object) inventoryDetailModel.wineFactoryName) && Intrinsics.areEqual((Object) this.wineName, (Object) inventoryDetailModel.wineName) && Intrinsics.areEqual((Object) this.wineType, (Object) inventoryDetailModel.wineType) && this.produceYear == inventoryDetailModel.produceYear && Intrinsics.areEqual((Object) this.area, (Object) inventoryDetailModel.area) && Intrinsics.areEqual((Object) this.country, (Object) inventoryDetailModel.country) && Intrinsics.areEqual((Object) this.grapes, (Object) inventoryDetailModel.grapes) && this.isFavorite == inventoryDetailModel.isFavorite && this.isAutoAdd == inventoryDetailModel.isAutoAdd && Intrinsics.areEqual((Object) this.vivinoId, (Object) inventoryDetailModel.vivinoId);
    }

    @NotNull
    public final String getArea() {
        return this.area;
    }

    public final long getBestDrinkDate() {
        return this.bestDrinkDate;
    }

    public final int getCellNum() {
        return this.cellNum;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getGrapes() {
        return this.grapes;
    }

    public final long getInventoryId() {
        return this.inventoryId;
    }

    public final int getNotes() {
        return this.notes;
    }

    @NotNull
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getPositionNum() {
        return this.positionNum;
    }

    public final int getProduceYear() {
        return this.produceYear;
    }

    @NotNull
    public final String getVivinoId() {
        return this.vivinoId;
    }

    @NotNull
    public final String getWineFactoryName() {
        return this.wineFactoryName;
    }

    @NotNull
    public final String getWineName() {
        return this.wineName;
    }

    @NotNull
    public final String getWineType() {
        return this.wineType;
    }

    @NotNull
    public final String getZoneName() {
        return this.zoneName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Long.hashCode(this.inventoryId) * 31) + this.deviceId.hashCode()) * 31) + this.zoneName.hashCode()) * 31) + Integer.hashCode(this.cellNum)) * 31) + Integer.hashCode(this.positionNum)) * 31) + Long.hashCode(this.bestDrinkDate)) * 31) + Integer.hashCode(this.notes)) * 31) + this.photoUrl.hashCode()) * 31) + this.wineFactoryName.hashCode()) * 31) + this.wineName.hashCode()) * 31) + this.wineType.hashCode()) * 31) + Integer.hashCode(this.produceYear)) * 31) + this.area.hashCode()) * 31) + this.country.hashCode()) * 31) + this.grapes.hashCode()) * 31) + Integer.hashCode(this.isFavorite)) * 31) + Integer.hashCode(this.isAutoAdd)) * 31) + this.vivinoId.hashCode();
    }

    public final int isAutoAdd() {
        return this.isAutoAdd;
    }

    public final int isFavorite() {
        return this.isFavorite;
    }

    public final void setArea(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.area = str;
    }

    public final void setAutoAdd(int i) {
        this.isAutoAdd = i;
    }

    public final void setBestDrinkDate(long j) {
        this.bestDrinkDate = j;
    }

    public final void setCellNum(int i) {
        this.cellNum = i;
    }

    public final void setCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.country = str;
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setFavorite(int i) {
        this.isFavorite = i;
    }

    public final void setGrapes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.grapes = str;
    }

    public final void setNotes(int i) {
        this.notes = i;
    }

    public final void setPhotoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.photoUrl = str;
    }

    public final void setPositionNum(int i) {
        this.positionNum = i;
    }

    public final void setProduceYear(int i) {
        this.produceYear = i;
    }

    public final void setVivinoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vivinoId = str;
    }

    public final void setWineFactoryName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wineFactoryName = str;
    }

    public final void setWineName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wineName = str;
    }

    public final void setWineType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wineType = str;
    }

    public final void setZoneName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.zoneName = str;
    }

    @NotNull
    public String toString() {
        return "InventoryDetailModel(inventoryId=" + this.inventoryId + ", deviceId=" + this.deviceId + ", zoneName=" + this.zoneName + ", cellNum=" + this.cellNum + ", positionNum=" + this.positionNum + ", bestDrinkDate=" + this.bestDrinkDate + ", notes=" + this.notes + ", photoUrl=" + this.photoUrl + ", wineFactoryName=" + this.wineFactoryName + ", wineName=" + this.wineName + ", wineType=" + this.wineType + ", produceYear=" + this.produceYear + ", area=" + this.area + ", country=" + this.country + ", grapes=" + this.grapes + ", isFavorite=" + this.isFavorite + ", isAutoAdd=" + this.isAutoAdd + ", vivinoId=" + this.vivinoId + ')';
    }
}
