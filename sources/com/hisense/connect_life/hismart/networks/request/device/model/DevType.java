package com.hisense.connect_life.hismart.networks.request.device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/DevType;", "", "deviceFeatureCode", "", "deviceTypeCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceFeatureCode", "()Ljava/lang/String;", "getDeviceTypeCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DevType.kt */
public final class DevType {
    @Nullable
    public final String deviceFeatureCode;
    @NotNull
    public final String deviceTypeCode;

    public DevType(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "deviceTypeCode");
        this.deviceFeatureCode = str;
        this.deviceTypeCode = str2;
    }

    public static /* synthetic */ DevType copy$default(DevType devType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = devType.deviceFeatureCode;
        }
        if ((i & 2) != 0) {
            str2 = devType.deviceTypeCode;
        }
        return devType.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.deviceFeatureCode;
    }

    @NotNull
    public final String component2() {
        return this.deviceTypeCode;
    }

    @NotNull
    public final DevType copy(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "deviceTypeCode");
        return new DevType(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevType)) {
            return false;
        }
        DevType devType = (DevType) obj;
        return Intrinsics.areEqual((Object) this.deviceFeatureCode, (Object) devType.deviceFeatureCode) && Intrinsics.areEqual((Object) this.deviceTypeCode, (Object) devType.deviceTypeCode);
    }

    @Nullable
    public final String getDeviceFeatureCode() {
        return this.deviceFeatureCode;
    }

    @NotNull
    public final String getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public int hashCode() {
        String str = this.deviceFeatureCode;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.deviceTypeCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "DevType(deviceFeatureCode=" + this.deviceFeatureCode + ", deviceTypeCode=" + this.deviceTypeCode + ')';
    }
}
