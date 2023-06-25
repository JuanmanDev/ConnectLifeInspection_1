package com.hisense.connect_life.hismart.networks.request.message;

import com.hisense.connect_life.hismart.networks.request.message.listener.MessageReceivedListener;
import com.hisense.connect_life.hismart.networks.request.message.model.AlarmMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.InventoryMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.SelfMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import com.hisense.connect_life.hismart.utils.LoggerUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000eH\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/MessageObserver;", "Lcom/hisense/connect_life/hismart/networks/request/message/IMessageObserver;", "()V", "list", "", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "dispatcher", "", "alarmMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/AlarmMessage;", "deviceStatusMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "inventoryMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/InventoryMessage;", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "selfMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/SelfMessage;", "wifiMessage", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "dispose", "isSubscribe", "", "messageReceivedListener", "subscribe", "unsubscribe", "Companion", "HOLDER", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageObserver.kt */
public final class MessageObserver implements IMessageObserver {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public final List<MessageReceivedListener> list;

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/MessageObserver$Companion;", "", "()V", "getInstance", "Lcom/hisense/connect_life/hismart/networks/request/message/MessageObserver;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MessageObserver.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MessageObserver getInstance() {
            return HOLDER.INSTANCE.getMessageObserver();
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/MessageObserver$HOLDER;", "", "()V", "messageObserver", "Lcom/hisense/connect_life/hismart/networks/request/message/MessageObserver;", "getMessageObserver", "()Lcom/hisense/connect_life/hismart/networks/request/message/MessageObserver;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MessageObserver.kt */
    public static final class HOLDER {
        @NotNull
        public static final HOLDER INSTANCE = new HOLDER();
        @NotNull
        public static final MessageObserver messageObserver = new MessageObserver((DefaultConstructorMarker) null);

        @NotNull
        public final MessageObserver getMessageObserver() {
            return messageObserver;
        }
    }

    public MessageObserver() {
        this.list = new ArrayList();
    }

    public /* synthetic */ MessageObserver(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void dispatcher(@NotNull WifiMessage wifiMessage) {
        Intrinsics.checkNotNullParameter(wifiMessage, "wifiMessage");
        for (MessageReceivedListener onWifiMessage : this.list) {
            onWifiMessage.onWifiMessage(wifiMessage);
        }
    }

    public void dispose() {
        if (!this.list.isEmpty()) {
            this.list.clear();
        }
    }

    public boolean isSubscribe(@NotNull MessageReceivedListener messageReceivedListener) {
        Intrinsics.checkNotNullParameter(messageReceivedListener, "messageReceivedListener");
        return this.list.contains(messageReceivedListener);
    }

    public void subscribe(@NotNull MessageReceivedListener messageReceivedListener) {
        Intrinsics.checkNotNullParameter(messageReceivedListener, "messageReceivedListener");
        if (!this.list.contains(messageReceivedListener)) {
            this.list.add(messageReceivedListener);
        }
    }

    public void unsubscribe(@NotNull MessageReceivedListener messageReceivedListener) {
        Intrinsics.checkNotNullParameter(messageReceivedListener, "messageReceivedListener");
        if (this.list.contains(messageReceivedListener)) {
            this.list.remove(messageReceivedListener);
        }
    }

    public void dispatcher(@NotNull DeviceStatusMessage deviceStatusMessage) {
        Intrinsics.checkNotNullParameter(deviceStatusMessage, "deviceStatusMessage");
        for (MessageReceivedListener onDeviceStatusMessage : this.list) {
            onDeviceStatusMessage.onDeviceStatusMessage(deviceStatusMessage);
        }
    }

    public void dispatcher(@NotNull SelfMessage selfMessage) {
        Intrinsics.checkNotNullParameter(selfMessage, "selfMessage");
        for (MessageReceivedListener onSelfMessage : this.list) {
            onSelfMessage.onSelfMessage(selfMessage);
        }
    }

    public void dispatcher(@NotNull PushMessage pushMessage) {
        Intrinsics.checkNotNullParameter(pushMessage, "alarmMessage");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("dispatcher alarm message: ", pushMessage));
        for (MessageReceivedListener onAlarmMessage : this.list) {
            onAlarmMessage.onAlarmMessage(pushMessage);
        }
    }

    public void dispatcher(@NotNull AlarmMessage alarmMessage) {
        Intrinsics.checkNotNullParameter(alarmMessage, "alarmMessage");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("dispatcher alarm message: ", alarmMessage));
        for (MessageReceivedListener onAlarmMessage : this.list) {
            onAlarmMessage.onAlarmMessage(alarmMessage);
        }
    }

    public void dispatcher(@NotNull InventoryMessage inventoryMessage) {
        Intrinsics.checkNotNullParameter(inventoryMessage, "inventoryMessage");
        for (MessageReceivedListener onInventoryMessage : this.list) {
            onInventoryMessage.onInventoryMessage(inventoryMessage);
        }
    }
}
