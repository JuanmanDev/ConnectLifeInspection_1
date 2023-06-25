package com.hisense.connect_life.hismart.networks.request.device.model;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/device/model/DevicePropertyResponse;", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "devicesProperties", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/SimpleDeviceDetail;", "(Ljava/util/List;)V", "getDevicesProperties", "()Ljava/util/List;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DevicePropertyResponse.kt */
public final class DevicePropertyResponse extends HiResponse {
    @NotNull
    public final List<SimpleDeviceDetail> devicesProperties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevicePropertyResponse(@NotNull List<SimpleDeviceDetail> list) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "devicesProperties");
        this.devicesProperties = list;
    }

    @NotNull
    public final List<SimpleDeviceDetail> getDevicesProperties() {
        return this.devicesProperties;
    }
}
