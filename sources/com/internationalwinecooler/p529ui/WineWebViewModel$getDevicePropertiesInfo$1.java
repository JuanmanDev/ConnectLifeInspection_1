package com.internationalwinecooler.p529ui;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.connectlife.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p072c.p073a.p074a.C1527w;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getDevicePropertiesInfo$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getDevicePropertiesInfo$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getDevicePropertiesInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getDevicePropertiesInfo$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getDevicePropertiesInfo$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WineWebViewModel$getDevicePropertiesInfo$1 wineWebViewModel$getDevicePropertiesInfo$1 = new WineWebViewModel$getDevicePropertiesInfo$1(this.$model, this.this$0, continuation);
        wineWebViewModel$getDevicePropertiesInfo$1.L$0 = obj;
        return wineWebViewModel$getDevicePropertiesInfo$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getDevicePropertiesInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            try {
                final String string = new JSONObject(this.$model).getString("deviceId");
                if (TextUtils.isEmpty(string)) {
                    WineWebViewModel wineWebViewModel = this.this$0;
                    String b = C1527w.m1063b(R.string.parameter_error);
                    Intrinsics.checkNotNullExpressionValue(b, "getString(R.string.parameter_error)");
                    wineWebViewModel.executeFailCallback(b, WebActionEnum.GET_DEVICE_PROPERTIES_INFO_CALLBACK);
                } else {
                    IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
                    final WineWebViewModel wineWebViewModel2 = this.this$0;
                    C86621 r2 = new Function1<List<? extends DeviceInfo>, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((List<DeviceInfo>) (List) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull List<DeviceInfo> list) {
                            DeviceInfo deviceInfo;
                            Intrinsics.checkNotNullParameter(list, LanguageConstKt.f15954it);
                            String str = string;
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    deviceInfo = null;
                                    break;
                                }
                                deviceInfo = (DeviceInfo) it.next();
                                if (Intrinsics.areEqual((Object) deviceInfo.getDeviceId(), (Object) str)) {
                                    break;
                                }
                            }
                            if (deviceInfo == null) {
                                wineWebViewModel2.executeFailCallback("没有指定设备", WebActionEnum.GET_DEVICE_PROPERTIES_INFO_CALLBACK);
                                return;
                            }
                            JsonObject jsonObject = new JsonObject();
                            JsonObject jsonObject2 = new JsonObject();
                            JsonObject properties = deviceInfo.getProperties();
                            jsonObject2.addProperty("deviceNickName", deviceInfo.getDeviceNickName());
                            jsonObject2.add("deviceProps", properties);
                            jsonObject.addProperty("resultCode", (Number) 0);
                            jsonObject.add("data", jsonObject2);
                            LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getDevicePropertiesInfo: ", jsonObject));
                            wineWebViewModel2.getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.GET_DEVICE_PROPERTIES_INFO_CALLBACK, jsonObject.toString()));
                        }
                    };
                    final WineWebViewModel wineWebViewModel3 = this.this$0;
                    deviceService.getApplianceListWithProperty(r2, new Function1<Throwable, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Throwable) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Throwable th) {
                            Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                            WineWebViewModel wineWebViewModel = wineWebViewModel3;
                            String message = th.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            wineWebViewModel.executeFailCallback(message, WebActionEnum.GET_DEVICE_PROPERTIES_INFO_CALLBACK);
                        }
                    });
                }
            } catch (JSONException e) {
                e.printStackTrace();
                LogUtilsShen.Companion.mo39140i("getDevicePropertiesInfo  error");
                WineWebViewModel wineWebViewModel4 = this.this$0;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                wineWebViewModel4.executeFailCallback(message, WebActionEnum.GET_DEVICE_PROPERTIES_INFO_CALLBACK);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
