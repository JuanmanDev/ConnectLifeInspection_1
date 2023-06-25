package com.hisense.connect_life.hismart.networks.request.device;

import com.hisense.connect_life.hismart.networks.request.message.listener.SimpleMessageReceived;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo47991d2 = {"com/hisense/connect_life/hismart/networks/request/device/DeviceCache$subscribeDeviceChangeListener$1", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/SimpleMessageReceived;", "onDeviceStatusMessage", "", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "onWifiMessage", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceCache.kt */
public final class DeviceCache$subscribeDeviceChangeListener$1 extends SimpleMessageReceived {
    public final /* synthetic */ DeviceCache this$0;

    public DeviceCache$subscribeDeviceChangeListener$1(DeviceCache deviceCache) {
        this.this$0 = deviceCache;
    }

    public void onDeviceStatusMessage(@NotNull DeviceStatusMessage deviceStatusMessage) {
        Intrinsics.checkNotNullParameter(deviceStatusMessage, "deviceStatusMessage");
        this.this$0.updateDeviceStatus(deviceStatusMessage);
    }

    public void onWifiMessage(@NotNull WifiMessage wifiMessage) {
        Intrinsics.checkNotNullParameter(wifiMessage, "wifiMessage");
        this.this$0.updateWifiStatus(wifiMessage);
    }
}
