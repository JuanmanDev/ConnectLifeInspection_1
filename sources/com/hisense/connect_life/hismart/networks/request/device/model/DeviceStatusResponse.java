package com.hisense.connect_life.hismart.networks.request.device.model;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceStatusResponse;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "devicesOnlineStatus", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceStatusDetail;", "(Ljava/util/List;)V", "getDevicesOnlineStatus", "()Ljava/util/List;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceStatusResponse.kt */
public final class DeviceStatusResponse extends HiResponse {
    @NotNull
    public final List<SimpleDeviceStatusDetail> devicesOnlineStatus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceStatusResponse(@NotNull List<SimpleDeviceStatusDetail> list) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "devicesOnlineStatus");
        this.devicesOnlineStatus = list;
    }

    @NotNull
    public final List<SimpleDeviceStatusDetail> getDevicesOnlineStatus() {
        return this.devicesOnlineStatus;
    }
}
