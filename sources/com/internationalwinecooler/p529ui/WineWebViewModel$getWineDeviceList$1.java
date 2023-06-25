package com.internationalwinecooler.p529ui;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getWineDeviceList$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getWineDeviceList$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getWineDeviceList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getWineDeviceList$1(WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getWineDeviceList$1> continuation) {
        super(2, continuation);
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getWineDeviceList$1(this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getWineDeviceList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.log("getWineDeviceList start ====");
            List<DeviceInfo> deviceList = DeviceCache.Companion.getInstance().getDeviceList();
            JsonObject jsonObject = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Iterator<T> it = deviceList.iterator();
            while (true) {
                int i = 0;
                if (it.hasNext()) {
                    DeviceInfo deviceInfo = (DeviceInfo) it.next();
                    T jsonObject2 = new JsonObject();
                    objectRef.element = jsonObject2;
                    ((JsonObject) jsonObject2).addProperty(EventBusConstKt.WIFIID, deviceInfo.getWifiId());
                    JsonObject jsonObject3 = (JsonObject) objectRef.element;
                    OnlineStatus onlineStatus = deviceInfo.getOnlineStatus();
                    if (onlineStatus != null) {
                        i = onlineStatus.getType();
                    }
                    jsonObject3.addProperty("devNetStatus", (Number) Boxing.boxInt(i));
                    ((JsonObject) objectRef.element).addProperty("devTypeName", deviceInfo.getDeviceTypeName());
                    ((JsonObject) objectRef.element).addProperty("devNickName", deviceInfo.getDeviceNickName());
                    ((JsonObject) objectRef.element).addProperty("devName", deviceInfo.getDeviceName());
                    ((JsonObject) objectRef.element).addProperty("deviceId", deviceInfo.getDeviceId());
                    ((JsonObject) objectRef.element).addProperty("isOneZoneWineCooler", DeviceCache.Companion.getInstance().getOneZoneFlagByFeatureCode(deviceInfo.getDeviceId()));
                    ((JsonObject) objectRef.element).addProperty("onlineStatus", OnlineStatus.CONNECTED == deviceInfo.getOnlineStatus() ? "1" : "2");
                    jsonArray.add((JsonElement) objectRef.element);
                } else {
                    jsonObject.addProperty("resultCode", (Number) Boxing.boxInt(0));
                    jsonObject.add("data", jsonArray);
                    this.this$0.log("getWineDeviceList end ====");
                    this.this$0.getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.GET_WINE_DEVICE_LIST_CALLBACK, jsonObject.toString()));
                    return Unit.INSTANCE;
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
