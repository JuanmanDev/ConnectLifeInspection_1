package com.hisense.connect_life.hismart.networks.request;

import com.hisense.connect_life.hismart.networks.request.wine.model.DeviceZone;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/HiWineCabinetResult;", "", "deviceIdList", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/DeviceZone;", "resultCode", "", "errorCode", "lastUpdateTime", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;J)V", "getDeviceIdList", "()Ljava/util/List;", "getErrorCode", "()Ljava/lang/String;", "getLastUpdateTime", "()J", "setLastUpdateTime", "(J)V", "getResultCode", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiWineCabinetResult.kt */
public final class HiWineCabinetResult {
    @Nullable
    public final List<DeviceZone> deviceIdList;
    @NotNull
    public final String errorCode;
    public long lastUpdateTime;
    @NotNull
    public final String resultCode;

    public HiWineCabinetResult(@Nullable List<DeviceZone> list, @NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "resultCode");
        Intrinsics.checkNotNullParameter(str2, "errorCode");
        this.deviceIdList = list;
        this.resultCode = str;
        this.errorCode = str2;
        this.lastUpdateTime = j;
    }

    @Nullable
    public final List<DeviceZone> getDeviceIdList() {
        return this.deviceIdList;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @NotNull
    public final String getResultCode() {
        return this.resultCode;
    }

    public final void setLastUpdateTime(long j) {
        this.lastUpdateTime = j;
    }
}
