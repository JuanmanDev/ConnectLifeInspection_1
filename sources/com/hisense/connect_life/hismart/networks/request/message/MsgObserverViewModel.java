package com.hisense.connect_life.hismart.networks.request.message;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.hisense.connect_life.hismart.networks.request.message.listener.MessageReceivedListener;
import com.hisense.connect_life.hismart.networks.request.message.model.DeviceStatusMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.PushMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.SelfMessage;
import com.hisense.connect_life.hismart.networks.request.message.model.WifiMessage;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019R#\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00048FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007R!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0012\u0010\u0007R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u001d"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/MsgObserverViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "alarmMsgLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "getAlarmMsgLiveData", "()Landroidx/lifecycle/MutableLiveData;", "alarmMsgLiveData$delegate", "Lkotlin/Lazy;", "messageReceivedListener", "Lcom/hisense/connect_life/hismart/networks/request/message/listener/MessageReceivedListener;", "selfMsgLiveData", "Lcom/hisense/connect_life/hismart/networks/request/message/model/SelfMessage;", "getSelfMsgLiveData", "selfMsgLiveData$delegate", "statusMsgLiveData", "Lcom/hisense/connect_life/hismart/networks/request/message/model/DeviceStatusMessage;", "getStatusMsgLiveData", "statusMsgLiveData$delegate", "wifiMsgLiveData", "Lcom/hisense/connect_life/hismart/networks/request/message/model/WifiMessage;", "getWifiMsgLiveData", "wifiMsgLiveData$delegate", "dispose", "", "onCleared", "subscribeMessage", "unsubscibe", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MsgObserverViewModel.kt */
public final class MsgObserverViewModel extends ViewModel {
    @NotNull
    public final Lazy alarmMsgLiveData$delegate = LazyKt__LazyJVMKt.lazy(MsgObserverViewModel$alarmMsgLiveData$2.INSTANCE);
    @Nullable
    public MessageReceivedListener messageReceivedListener;
    @NotNull
    public final Lazy selfMsgLiveData$delegate = LazyKt__LazyJVMKt.lazy(MsgObserverViewModel$selfMsgLiveData$2.INSTANCE);
    @NotNull
    public final Lazy statusMsgLiveData$delegate = LazyKt__LazyJVMKt.lazy(MsgObserverViewModel$statusMsgLiveData$2.INSTANCE);
    @NotNull
    public final Lazy wifiMsgLiveData$delegate = LazyKt__LazyJVMKt.lazy(MsgObserverViewModel$wifiMsgLiveData$2.INSTANCE);

    public final void dispose() {
        MessageObserver.Companion.getInstance().dispose();
    }

    @NotNull
    public final MutableLiveData<PushMessage> getAlarmMsgLiveData() {
        return (MutableLiveData) this.alarmMsgLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<SelfMessage> getSelfMsgLiveData() {
        return (MutableLiveData) this.selfMsgLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<DeviceStatusMessage> getStatusMsgLiveData() {
        return (MutableLiveData) this.statusMsgLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<WifiMessage> getWifiMsgLiveData() {
        return (MutableLiveData) this.wifiMsgLiveData$delegate.getValue();
    }

    public void onCleared() {
        super.onCleared();
        unsubscibe();
    }

    public final void subscribeMessage() {
        if (this.messageReceivedListener == null) {
            this.messageReceivedListener = new MsgObserverViewModel$subscribeMessage$1(this);
        }
        if (this.messageReceivedListener != null) {
            MessageObserver instance = MessageObserver.Companion.getInstance();
            MessageReceivedListener messageReceivedListener2 = this.messageReceivedListener;
            Intrinsics.checkNotNull(messageReceivedListener2);
            instance.subscribe(messageReceivedListener2);
        }
    }

    public final void unsubscibe() {
        if (this.messageReceivedListener != null) {
            MessageObserver instance = MessageObserver.Companion.getInstance();
            MessageReceivedListener messageReceivedListener2 = this.messageReceivedListener;
            Intrinsics.checkNotNull(messageReceivedListener2);
            instance.unsubscribe(messageReceivedListener2);
        }
    }
}
