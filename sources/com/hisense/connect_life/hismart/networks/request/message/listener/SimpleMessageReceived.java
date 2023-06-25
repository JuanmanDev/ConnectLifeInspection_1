package com.hisense.connect_life.hismart.networks.request.message.listener;

import com.hisense.connect_life.hismart.networks.request.message.model.AlarmMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.InventoryMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.SelfMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/listener/SimpleMessageReceived;", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "()V", "onAlarmMessage", "", "alarmMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/AlarmMessage;", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "onDeviceStatusMessage", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "onInventoryMessage", "inventoryMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/InventoryMessage;", "onSelfMessage", "selfMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/SelfMessage;", "onWifiMessage", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SimpleMessageReceived.kt */
public class SimpleMessageReceived implements MessageReceivedListener {
    public void onAlarmMessage(@NotNull AlarmMessage alarmMessage) {
        Intrinsics.checkNotNullParameter(alarmMessage, "alarmMessage");
    }

    public void onAlarmMessage(@NotNull PushMessage pushMessage) {
        Intrinsics.checkNotNullParameter(pushMessage, "alarmMessage");
    }

    public void onDeviceStatusMessage(@NotNull DeviceStatusMessage deviceStatusMessage) {
        Intrinsics.checkNotNullParameter(deviceStatusMessage, "deviceStatusMessage");
    }

    public void onInventoryMessage(@NotNull InventoryMessage inventoryMessage) {
        Intrinsics.checkNotNullParameter(inventoryMessage, "inventoryMessage");
    }

    public void onSelfMessage(@NotNull SelfMessage selfMessage) {
        Intrinsics.checkNotNullParameter(selfMessage, "selfMessage");
    }

    public void onWifiMessage(@NotNull WifiMessage wifiMessage) {
        Intrinsics.checkNotNullParameter(wifiMessage, "wifiMessage");
    }
}
