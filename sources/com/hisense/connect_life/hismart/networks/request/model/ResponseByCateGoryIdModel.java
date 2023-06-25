package com.hisense.connect_life.hismart.networks.request.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\b\u0010!\u001a\u00020\u0007H\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/model/ResponseByCateGoryIdModel;", "", "resultCode", "", "errorCode", "", "errorDesc", "", "desc", "deviceList", "Lcom/hisense/connect_life/hismart/networks/request/model/DeviceListModel;", "lastUpdateTime", "(IJLjava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/request/model/DeviceListModel;J)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getDeviceList", "()Lcom/hisense/connect_life/hismart/networks/request/model/DeviceListModel;", "setDeviceList", "(Lcom/hisense/connect_life/hismart/networks/request/model/DeviceListModel;)V", "getErrorCode", "()J", "setErrorCode", "(J)V", "getErrorDesc", "setErrorDesc", "getLastUpdateTime", "setLastUpdateTime", "getResultCode", "()I", "setResultCode", "(I)V", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ResponseByCateGoryIdModel.kt */
public final class ResponseByCateGoryIdModel {
    @NotNull
    public String desc;
    @NotNull
    public DeviceListModel deviceList;
    public long errorCode;
    @NotNull
    public String errorDesc;
    public long lastUpdateTime;
    public int resultCode;

    public ResponseByCateGoryIdModel(int i, long j, @NotNull String str, @NotNull String str2, @NotNull DeviceListModel deviceListModel, long j2) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        Intrinsics.checkNotNullParameter(str2, "desc");
        Intrinsics.checkNotNullParameter(deviceListModel, "deviceList");
        this.resultCode = i;
        this.errorCode = j;
        this.errorDesc = str;
        this.desc = str2;
        this.deviceList = deviceListModel;
        this.lastUpdateTime = j2;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final DeviceListModel getDeviceList() {
        return this.deviceList;
    }

    public final long getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final void setDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.desc = str;
    }

    public final void setDeviceList(@NotNull DeviceListModel deviceListModel) {
        Intrinsics.checkNotNullParameter(deviceListModel, "<set-?>");
        this.deviceList = deviceListModel;
    }

    public final void setErrorCode(long j) {
        this.errorCode = j;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    public final void setLastUpdateTime(long j) {
        this.lastUpdateTime = j;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "HiResponse(resultCode=" + this.resultCode + ", errorCode=" + this.errorCode + ", errorDesc='" + this.errorDesc + "', desc='" + this.desc + "')";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResponseByCateGoryIdModel(int i, long j, String str, String str2, DeviceListModel deviceListModel, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? -1 : j, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, deviceListModel, j2);
    }
}
