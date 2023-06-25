package com.hisense.connect_life.hismart.networks.request.message.listener;

import com.hisense.connect_life.hismart.networks.request.message.model.AlarmMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.InventoryMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.SelfMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "", "onAlarmMessage", "", "alarmMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/AlarmMessage;", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "onDeviceStatusMessage", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "onInventoryMessage", "inventoryMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/InventoryMessage;", "onSelfMessage", "selfMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/SelfMessage;", "onWifiMessage", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageReceivedListener.kt */
public interface MessageReceivedListener {
    void onAlarmMessage(@NotNull AlarmMessage alarmMessage);

    void onAlarmMessage(@NotNull PushMessage pushMessage);

    void onDeviceStatusMessage(@NotNull DeviceStatusMessage deviceStatusMessage);

    void onInventoryMessage(@NotNull InventoryMessage inventoryMessage);

    void onSelfMessage(@NotNull SelfMessage selfMessage);

    void onWifiMessage(@NotNull WifiMessage wifiMessage);
}
