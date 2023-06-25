package com.hisense.connect_life.hismart.networks.request.message;

import com.hisense.connect_life.hismart.networks.request.message.listener.SimpleMessageReceived;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.SelfMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, mo47991d2 = {"com/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel$subscribeMessage$1", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/SimpleMessageReceived;", "onAlarmMessage", "", "alarmMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "onDeviceStatusMessage", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "onSelfMessage", "selfMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/SelfMessage;", "onWifiMessage", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MsgObserverViewModel.kt */
public final class MsgObserverViewModel$subscribeMessage$1 extends SimpleMessageReceived {
    public final /* synthetic */ MsgObserverViewModel this$0;

    public MsgObserverViewModel$subscribeMessage$1(MsgObserverViewModel msgObserverViewModel) {
        this.this$0 = msgObserverViewModel;
    }

    public void onAlarmMessage(@NotNull PushMessage pushMessage) {
        Intrinsics.checkNotNullParameter(pushMessage, "alarmMessage");
        this.this$0.getAlarmMsgLiveData().postValue(pushMessage);
    }

    public void onDeviceStatusMessage(@NotNull DeviceStatusMessage deviceStatusMessage) {
        Intrinsics.checkNotNullParameter(deviceStatusMessage, "deviceStatusMessage");
        this.this$0.getStatusMsgLiveData().postValue(deviceStatusMessage);
    }

    public void onSelfMessage(@NotNull SelfMessage selfMessage) {
        Intrinsics.checkNotNullParameter(selfMessage, "selfMessage");
        this.this$0.getSelfMsgLiveData().postValue(selfMessage);
    }

    public void onWifiMessage(@NotNull WifiMessage wifiMessage) {
        Intrinsics.checkNotNullParameter(wifiMessage, "wifiMessage");
        this.this$0.getWifiMsgLiveData().postValue(wifiMessage);
    }
}
