package com.hisense.connect_life.hismart.networks.request.device.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/ApplianceListResult;", "", "resultCode", "", "count", "", "deviceInfoList", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "(IJLjava/util/List;)V", "getCount", "()J", "getDeviceInfoList", "()Ljava/util/List;", "getResultCode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApplianceListResult.kt */
public final class ApplianceListResult {
    public final long count;
    @NotNull
    public final List<DeviceInfo> deviceInfoList;
    public final int resultCode;

    public ApplianceListResult(int i, long j, @NotNull List<DeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "deviceInfoList");
        this.resultCode = i;
        this.count = j;
        this.deviceInfoList = list;
    }

    public static /* synthetic */ ApplianceListResult copy$default(ApplianceListResult applianceListResult, int i, long j, List<DeviceInfo> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = applianceListResult.resultCode;
        }
        if ((i2 & 2) != 0) {
            j = applianceListResult.count;
        }
        if ((i2 & 4) != 0) {
            list = applianceListResult.deviceInfoList;
        }
        return applianceListResult.copy(i, j, list);
    }

    public final int component1() {
        return this.resultCode;
    }

    public final long component2() {
        return this.count;
    }

    @NotNull
    public final List<DeviceInfo> component3() {
        return this.deviceInfoList;
    }

    @NotNull
    public final ApplianceListResult copy(int i, long j, @NotNull List<DeviceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "deviceInfoList");
        return new ApplianceListResult(i, j, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplianceListResult)) {
            return false;
        }
        ApplianceListResult applianceListResult = (ApplianceListResult) obj;
        return this.resultCode == applianceListResult.resultCode && this.count == applianceListResult.count && Intrinsics.areEqual((Object) this.deviceInfoList, (Object) applianceListResult.deviceInfoList);
    }

    public final long getCount() {
        return this.count;
    }

    @NotNull
    public final List<DeviceInfo> getDeviceInfoList() {
        return this.deviceInfoList;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resultCode) * 31) + Long.hashCode(this.count)) * 31) + this.deviceInfoList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplianceListResult(resultCode=" + this.resultCode + ", count=" + this.count + ", deviceInfoList=" + this.deviceInfoList + ')';
    }
}
