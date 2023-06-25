package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006!"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceStatusResult;", "", "resultCode", "", "errorCode", "errorDesc", "", "devicesOnlineStatus", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceStatusBean;", "(IILjava/lang/String;Ljava/util/List;)V", "getDevicesOnlineStatus", "()Ljava/util/List;", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorDesc", "()Ljava/lang/String;", "setErrorDesc", "(Ljava/lang/String;)V", "getResultCode", "setResultCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceStatusResult.kt */
public final class DeviceStatusResult {
    @Nullable
    public final List<DeviceStatusBean> devicesOnlineStatus;
    public int errorCode;
    @NotNull
    public String errorDesc;
    public int resultCode;

    public DeviceStatusResult(int i, int i2, @NotNull String str, @Nullable List<DeviceStatusBean> list) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        this.resultCode = i;
        this.errorCode = i2;
        this.errorDesc = str;
        this.devicesOnlineStatus = list;
    }

    public static /* synthetic */ DeviceStatusResult copy$default(DeviceStatusResult deviceStatusResult, int i, int i2, String str, List<DeviceStatusBean> list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = deviceStatusResult.resultCode;
        }
        if ((i3 & 2) != 0) {
            i2 = deviceStatusResult.errorCode;
        }
        if ((i3 & 4) != 0) {
            str = deviceStatusResult.errorDesc;
        }
        if ((i3 & 8) != 0) {
            list = deviceStatusResult.devicesOnlineStatus;
        }
        return deviceStatusResult.copy(i, i2, str, list);
    }

    public final int component1() {
        return this.resultCode;
    }

    public final int component2() {
        return this.errorCode;
    }

    @NotNull
    public final String component3() {
        return this.errorDesc;
    }

    @Nullable
    public final List<DeviceStatusBean> component4() {
        return this.devicesOnlineStatus;
    }

    @NotNull
    public final DeviceStatusResult copy(int i, int i2, @NotNull String str, @Nullable List<DeviceStatusBean> list) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        return new DeviceStatusResult(i, i2, str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceStatusResult)) {
            return false;
        }
        DeviceStatusResult deviceStatusResult = (DeviceStatusResult) obj;
        return this.resultCode == deviceStatusResult.resultCode && this.errorCode == deviceStatusResult.errorCode && Intrinsics.areEqual((Object) this.errorDesc, (Object) deviceStatusResult.errorDesc) && Intrinsics.areEqual((Object) this.devicesOnlineStatus, (Object) deviceStatusResult.devicesOnlineStatus);
    }

    @Nullable
    public final List<DeviceStatusBean> getDevicesOnlineStatus() {
        return this.devicesOnlineStatus;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.resultCode) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.errorDesc.hashCode()) * 31;
        List<DeviceStatusBean> list = this.devicesOnlineStatus;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDesc = str;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    @NotNull
    public String toString() {
        return "DeviceStatusResult(resultCode=" + this.resultCode + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ", devicesOnlineStatus=" + this.devicesOnlineStatus + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeviceStatusResult(int i, int i2, String str, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str, list);
    }
}
