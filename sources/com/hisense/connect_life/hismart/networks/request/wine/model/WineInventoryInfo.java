package com.hisense.connect_life.hismart.networks.request.wine.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineInventoryInfo;", "", "bestDrinkDate", "", "remindAlarmDate", "", "notes", "zoneName", "cellNum", "positionNum", "", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBestDrinkDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCellNum", "()Ljava/lang/String;", "getNotes", "getPositionNum", "()I", "setPositionNum", "(I)V", "getRemindAlarmDate", "getZoneName", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineInventoryInfo.kt */
public final class WineInventoryInfo {
    @Nullable
    public final Long bestDrinkDate;
    @Nullable
    public final String cellNum;
    @Nullable
    public final String notes;
    public int positionNum;
    @Nullable
    public final String remindAlarmDate;
    @Nullable
    public final String zoneName;

    public WineInventoryInfo(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i) {
        this.bestDrinkDate = l;
        this.remindAlarmDate = str;
        this.notes = str2;
        this.zoneName = str3;
        this.cellNum = str4;
        this.positionNum = i;
    }

    @Nullable
    public final Long getBestDrinkDate() {
        return this.bestDrinkDate;
    }

    @Nullable
    public final String getCellNum() {
        return this.cellNum;
    }

    @Nullable
    public final String getNotes() {
        return this.notes;
    }

    public final int getPositionNum() {
        return this.positionNum;
    }

    @Nullable
    public final String getRemindAlarmDate() {
        return this.remindAlarmDate;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public final void setPositionNum(int i) {
        this.positionNum = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WineInventoryInfo(Long l, String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, str3, str4, (i2 & 32) != 0 ? -1 : i);
    }
}
