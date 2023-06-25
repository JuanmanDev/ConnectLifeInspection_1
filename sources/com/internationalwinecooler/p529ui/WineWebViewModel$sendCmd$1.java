package com.internationalwinecooler.p529ui;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.model.JsResp;
import java.util.Map;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p040c.p072c.p073a.p074a.C1527w;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$sendCmd$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$sendCmd$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$sendCmd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $auid;
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$sendCmd$1(String str, String str2, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$sendCmd$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.$auid = str2;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$sendCmd$1(this.$model, this.$auid, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$sendCmd$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JsonObject jsonObject;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("sendCmd model: ", this.$model));
            Intrinsics.stringPlus(" ", this.$model);
            try {
                if (TextUtils.isEmpty(this.$auid)) {
                    WineWebViewModel wineWebViewModel = this.this$0;
                    String b = C1527w.m1063b(R.string.parameter_error);
                    Intrinsics.checkNotNullExpressionValue(b, "getString(R.string.parameter_error)");
                    wineWebViewModel.executeFailCallback(b, WebActionEnum.SEND_CMD_CALLBACK);
                } else {
                    DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(this.$auid);
                    if (device == null) {
                        jsonObject = null;
                    } else {
                        jsonObject = device.getProperties();
                    }
                    if (jsonObject != null) {
                        Object fromJson = new Gson().fromJson(this.$model, new WineWebViewModel$sendCmd$1$type$1().getType());
                        Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(model, type)");
                        IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
                        String deviceId = device.getDeviceId();
                        String wifiId = device.getWifiId();
                        final WineWebViewModel wineWebViewModel2 = this.this$0;
                        final String str = this.$auid;
                        final String str2 = this.$model;
                        C86871 r6 = new Function1<Boolean, Unit>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke(((Boolean) obj).booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                if (z) {
                                    wineWebViewModel2.updateZoneBWine(str, str2);
                                }
                                String json = new Gson().toJson((Object) new JsResp("", z ^ true ? 1 : 0, (String) null, 4, (DefaultConstructorMarker) null));
                                LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("sendCmd model: callback succ: ", json));
                                wineWebViewModel2.getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.SEND_CMD_CALLBACK, json.toString()));
                            }
                        };
                        final WineWebViewModel wineWebViewModel3 = this.this$0;
                        deviceService.sendCommand(deviceId, wifiId, (Map) fromJson, r6, new Function1<Throwable, Unit>() {
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
                                wineWebViewModel.executeFailCallback(message, WebActionEnum.SEND_CMD_CALLBACK);
                            }
                        });
                    } else {
                        WineWebViewModel wineWebViewModel4 = this.this$0;
                        String b2 = C1527w.m1063b(R.string.unit_exception);
                        Intrinsics.checkNotNullExpressionValue(b2, "getString(R.string.unit_exception)");
                        wineWebViewModel4.executeFailCallback(b2, WebActionEnum.SEND_CMD_CALLBACK);
                    }
                }
            } catch (JSONException e) {
                WineWebViewModel wineWebViewModel5 = this.this$0;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                wineWebViewModel5.executeFailCallback(message, WebActionEnum.SEND_CMD_CALLBACK);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
