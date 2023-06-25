package com.hisense.juconnect.app_device.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.room.Notification;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0013J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0002J\u0006\u0010\u001a\u001a\u00020\u0013J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0006\u0010\u001c\u001a\u00020\u0013R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\r\u0010\u0007R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u001d"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/viewmodel/MessageViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "subscribePushLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getSubscribePushLiveData", "()Landroidx/lifecycle/MutableLiveData;", "subscribePushLiveData$delegate", "Lkotlin/Lazy;", "unReadMessageLiveData", "", "Lcom/hisense/connect_life/hismart/room/Notification;", "getUnReadMessageLiveData", "unReadMessageLiveData$delegate", "unsubscribeLiveData", "getUnsubscribeLiveData", "unsubscribeLiveData$delegate", "generateMessageChannel", "", "context", "", "stopAlert", "stopDeviceAlert", "auid", "model", "subscribeFireBase", "subscribePush", "unsubscribeFireBase", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageViewModel.kt */
public final class MessageViewModel extends BaseViewModel {
    @NotNull
    public final Lazy subscribePushLiveData$delegate = LazyKt__LazyJVMKt.lazy(MessageViewModel$subscribePushLiveData$2.INSTANCE);
    @NotNull
    public final Lazy unReadMessageLiveData$delegate = LazyKt__LazyJVMKt.lazy(MessageViewModel$unReadMessageLiveData$2.INSTANCE);
    @NotNull
    public final Lazy unsubscribeLiveData$delegate = LazyKt__LazyJVMKt.lazy(MessageViewModel$unsubscribeLiveData$2.INSTANCE);

    private final void stopDeviceAlert(String str, String str2) {
        JsonObject jsonObject;
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("sendCmd model: ", str2));
        try {
            if (TextUtils.isEmpty(str)) {
                LogUtilsShen.Companion.mo39138e("sendCmd model: callback succ:");
                return;
            }
            DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(str);
            if (device == null) {
                jsonObject = null;
            } else {
                jsonObject = device.getProperties();
            }
            if (jsonObject != null) {
                Object fromJson = new Gson().fromJson(str2, new MessageViewModel$stopDeviceAlert$type$1().getType());
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(model, type)");
                HiSmart.Companion.getInstance().deviceService().sendCommand(device.getDeviceId(), device.getWifiId(), (Map) fromJson, MessageViewModel$stopDeviceAlert$1.INSTANCE, MessageViewModel$stopDeviceAlert$2.INSTANCE);
            }
        } catch (JSONException unused) {
        }
    }

    private final void subscribePush() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new MessageViewModel$subscribePush$1(this, (Continuation<? super MessageViewModel$subscribePush$1>) null), 2, (Object) null);
    }

    public final void generateMessageChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "context");
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new MessageViewModel$generateMessageChannel$1(this, str, (Continuation<? super MessageViewModel$generateMessageChannel$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getSubscribePushLiveData() {
        return (MutableLiveData) this.subscribePushLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<List<Notification>> getUnReadMessageLiveData() {
        return (MutableLiveData) this.unReadMessageLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getUnsubscribeLiveData() {
        return (MutableLiveData) this.unsubscribeLiveData$delegate.getValue();
    }

    public final void stopAlert() {
        for (DeviceInfo deviceId : DeviceCache.Companion.getInstance().getDeviceList()) {
            stopDeviceAlert(deviceId.getDeviceId(), "{\"CancelAlarmSound\":1}");
        }
    }

    public final void subscribeFireBase() {
        LogUtilsShen.Companion.mo39138e("subscribeFireBase");
    }

    public final void unsubscribeFireBase() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new MessageViewModel$unsubscribeFireBase$1(this, (Continuation<? super MessageViewModel$unsubscribeFireBase$1>) null), 2, (Object) null);
    }
}
