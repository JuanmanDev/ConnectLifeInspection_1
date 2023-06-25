package com.hisense.connect_life.hismart.networks.request.device.model;

import com.hisense.connect_life.core.global.EventBusConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/BindDeviceSuccessData;", "", "resultCode", "", "desc", "", "wifiId", "deviceId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getDeviceId", "getResultCode", "()I", "getWifiId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BindDeviceSuccessData.kt */
public final class BindDeviceSuccessData {
    @NotNull
    public final String desc;
    @NotNull
    public final String deviceId;
    public final int resultCode;
    @NotNull
    public final String wifiId;

    public BindDeviceSuccessData(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str3, "deviceId");
        this.resultCode = i;
        this.desc = str;
        this.wifiId = str2;
        this.deviceId = str3;
    }

    public static /* synthetic */ BindDeviceSuccessData copy$default(BindDeviceSuccessData bindDeviceSuccessData, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bindDeviceSuccessData.resultCode;
        }
        if ((i2 & 2) != 0) {
            str = bindDeviceSuccessData.desc;
        }
        if ((i2 & 4) != 0) {
            str2 = bindDeviceSuccessData.wifiId;
        }
        if ((i2 & 8) != 0) {
            str3 = bindDeviceSuccessData.deviceId;
        }
        return bindDeviceSuccessData.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.resultCode;
    }

    @NotNull
    public final String component2() {
        return this.desc;
    }

    @NotNull
    public final String component3() {
        return this.wifiId;
    }

    @NotNull
    public final String component4() {
        return this.deviceId;
    }

    @NotNull
    public final BindDeviceSuccessData copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str3, "deviceId");
        return new BindDeviceSuccessData(i, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindDeviceSuccessData)) {
            return false;
        }
        BindDeviceSuccessData bindDeviceSuccessData = (BindDeviceSuccessData) obj;
        return this.resultCode == bindDeviceSuccessData.resultCode && Intrinsics.areEqual((Object) this.desc, (Object) bindDeviceSuccessData.desc) && Intrinsics.areEqual((Object) this.wifiId, (Object) bindDeviceSuccessData.wifiId) && Intrinsics.areEqual((Object) this.deviceId, (Object) bindDeviceSuccessData.deviceId);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getWifiId() {
        return this.wifiId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.resultCode) * 31) + this.desc.hashCode()) * 31) + this.wifiId.hashCode()) * 31) + this.deviceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "BindDeviceSuccessData(resultCode=" + this.resultCode + ", desc=" + this.desc + ", wifiId=" + this.wifiId + ", deviceId=" + this.deviceId + ')';
    }
}
