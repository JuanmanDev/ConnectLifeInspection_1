package com.hisense.connect_life.hismart.networks.request.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010-\u001a\u00020\u0003HÆ\u0003Jl\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001b¨\u00065"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/model/WinePositionModel;", "", "zoneName", "", "cellNum", "", "positionNum", "bestDrinkDate", "", "remindAlarmDate", "notes", "inventoryId", "deviceId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getBestDrinkDate", "()Ljava/lang/Long;", "setBestDrinkDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCellNum", "()Ljava/lang/Integer;", "setCellNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getInventoryId", "setInventoryId", "getNotes", "setNotes", "getPositionNum", "setPositionNum", "getRemindAlarmDate", "setRemindAlarmDate", "getZoneName", "setZoneName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/hisense/connect_life/hismart/networks/request/model/WinePositionModel;", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WinePositionModel.kt */
public final class WinePositionModel {
    @Nullable
    public Long bestDrinkDate;
    @Nullable
    public Integer cellNum;
    @NotNull
    public String deviceId;
    @Nullable
    public Long inventoryId;
    @Nullable
    public String notes;
    @Nullable
    public Integer positionNum;
    @Nullable
    public Long remindAlarmDate;
    @Nullable
    public String zoneName;

    public WinePositionModel(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l, @Nullable Long l2, @Nullable String str2, @Nullable Long l3, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "deviceId");
        this.zoneName = str;
        this.cellNum = num;
        this.positionNum = num2;
        this.bestDrinkDate = l;
        this.remindAlarmDate = l2;
        this.notes = str2;
        this.inventoryId = l3;
        this.deviceId = str3;
    }

    public static /* synthetic */ WinePositionModel copy$default(WinePositionModel winePositionModel, String str, Integer num, Integer num2, Long l, Long l2, String str2, Long l3, String str3, int i, Object obj) {
        WinePositionModel winePositionModel2 = winePositionModel;
        int i2 = i;
        return winePositionModel.copy((i2 & 1) != 0 ? winePositionModel2.zoneName : str, (i2 & 2) != 0 ? winePositionModel2.cellNum : num, (i2 & 4) != 0 ? winePositionModel2.positionNum : num2, (i2 & 8) != 0 ? winePositionModel2.bestDrinkDate : l, (i2 & 16) != 0 ? winePositionModel2.remindAlarmDate : l2, (i2 & 32) != 0 ? winePositionModel2.notes : str2, (i2 & 64) != 0 ? winePositionModel2.inventoryId : l3, (i2 & 128) != 0 ? winePositionModel2.deviceId : str3);
    }

    @Nullable
    public final String component1() {
        return this.zoneName;
    }

    @Nullable
    public final Integer component2() {
        return this.cellNum;
    }

    @Nullable
    public final Integer component3() {
        return this.positionNum;
    }

    @Nullable
    public final Long component4() {
        return this.bestDrinkDate;
    }

    @Nullable
    public final Long component5() {
        return this.remindAlarmDate;
    }

    @Nullable
    public final String component6() {
        return this.notes;
    }

    @Nullable
    public final Long component7() {
        return this.inventoryId;
    }

    @NotNull
    public final String component8() {
        return this.deviceId;
    }

    @NotNull
    public final WinePositionModel copy(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l, @Nullable Long l2, @Nullable String str2, @Nullable Long l3, @NotNull String str3) {
        String str4 = str3;
        Intrinsics.checkNotNullParameter(str4, "deviceId");
        return new WinePositionModel(str, num, num2, l, l2, str2, l3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinePositionModel)) {
            return false;
        }
        WinePositionModel winePositionModel = (WinePositionModel) obj;
        return Intrinsics.areEqual((Object) this.zoneName, (Object) winePositionModel.zoneName) && Intrinsics.areEqual((Object) this.cellNum, (Object) winePositionModel.cellNum) && Intrinsics.areEqual((Object) this.positionNum, (Object) winePositionModel.positionNum) && Intrinsics.areEqual((Object) this.bestDrinkDate, (Object) winePositionModel.bestDrinkDate) && Intrinsics.areEqual((Object) this.remindAlarmDate, (Object) winePositionModel.remindAlarmDate) && Intrinsics.areEqual((Object) this.notes, (Object) winePositionModel.notes) && Intrinsics.areEqual((Object) this.inventoryId, (Object) winePositionModel.inventoryId) && Intrinsics.areEqual((Object) this.deviceId, (Object) winePositionModel.deviceId);
    }

    @Nullable
    public final Long getBestDrinkDate() {
        return this.bestDrinkDate;
    }

    @Nullable
    public final Integer getCellNum() {
        return this.cellNum;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final Long getInventoryId() {
        return this.inventoryId;
    }

    @Nullable
    public final String getNotes() {
        return this.notes;
    }

    @Nullable
    public final Integer getPositionNum() {
        return this.positionNum;
    }

    @Nullable
    public final Long getRemindAlarmDate() {
        return this.remindAlarmDate;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public int hashCode() {
        String str = this.zoneName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.cellNum;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.positionNum;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.bestDrinkDate;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.remindAlarmDate;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.notes;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.inventoryId;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return ((hashCode6 + i) * 31) + this.deviceId.hashCode();
    }

    public final void setBestDrinkDate(@Nullable Long l) {
        this.bestDrinkDate = l;
    }

    public final void setCellNum(@Nullable Integer num) {
        this.cellNum = num;
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setInventoryId(@Nullable Long l) {
        this.inventoryId = l;
    }

    public final void setNotes(@Nullable String str) {
        this.notes = str;
    }

    public final void setPositionNum(@Nullable Integer num) {
        this.positionNum = num;
    }

    public final void setRemindAlarmDate(@Nullable Long l) {
        this.remindAlarmDate = l;
    }

    public final void setZoneName(@Nullable String str) {
        this.zoneName = str;
    }

    @NotNull
    public String toString() {
        return "WinePositionModel(zoneName=" + this.zoneName + ", cellNum=" + this.cellNum + ", positionNum=" + this.positionNum + ", bestDrinkDate=" + this.bestDrinkDate + ", remindAlarmDate=" + this.remindAlarmDate + ", notes=" + this.notes + ", inventoryId=" + this.inventoryId + ", deviceId=" + this.deviceId + ')';
    }
}
