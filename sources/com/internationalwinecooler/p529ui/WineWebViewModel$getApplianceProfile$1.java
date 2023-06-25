package com.internationalwinecooler.p529ui;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
import com.hisense.connect_life.hismart.networks.request.device.model.ApplianceProfile;
import com.internationalwinecooler.model.JsResp;
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
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getApplianceProfile$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getApplianceProfile$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getApplianceProfile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getApplianceProfile$1(WineWebViewModel wineWebViewModel, String str, Continuation<? super WineWebViewModel$getApplianceProfile$1> continuation) {
        super(2, continuation);
        this.this$0 = wineWebViewModel;
        this.$model = str;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getApplianceProfile$1(this.this$0, this.$model, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getApplianceProfile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final WineWebViewModel wineWebViewModel = this.this$0;
            String str = this.$model;
            C86581 r1 = new Function1<JSONObject, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((JSONObject) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull JSONObject jSONObject) {
                    Intrinsics.checkNotNullParameter(jSONObject, LanguageConstKt.f15954it);
                    String string = jSONObject.getString("deviceId");
                    String string2 = jSONObject.getString(EventBusConstKt.WIFIID);
                    WineWebViewModel wineWebViewModel = wineWebViewModel;
                    Intrinsics.checkNotNullExpressionValue(string, "deviceId");
                    wineWebViewModel.getCacheProfile(string);
                    IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
                    Intrinsics.checkNotNullExpressionValue(string2, EventBusConstKt.WIFIID);
                    final WineWebViewModel wineWebViewModel2 = wineWebViewModel;
                    C86591 r2 = new Function1<ApplianceProfile, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((ApplianceProfile) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable ApplianceProfile applianceProfile) {
                            String str = "";
                            if (applianceProfile == null) {
                                LoggerUtil.Companion.mo39146e("getApplianceProfile it == null");
                                JsResp jsResp = new JsResp(null, 1, str);
                                MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = wineWebViewModel2.getEvaluateJsLiveData();
                                WebActionEnum webActionEnum = WebActionEnum.GET_APPLIANCE_PROFILE_CALLBACK;
                                String json = new Gson().toJson((Object) jsResp);
                                if (json != null) {
                                    str = json;
                                }
                                evaluateJsLiveData.postValue(new Pair(webActionEnum, str));
                                return;
                            }
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getApplianceProfile suc: ", applianceProfile));
                            JsResp jsResp2 = new JsResp(applianceProfile, 0, (String) null, 6, (DefaultConstructorMarker) null);
                            MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData2 = wineWebViewModel2.getEvaluateJsLiveData();
                            WebActionEnum webActionEnum2 = WebActionEnum.GET_APPLIANCE_PROFILE_CALLBACK;
                            String json2 = new Gson().toJson((Object) jsResp2);
                            if (json2 != null) {
                                str = json2;
                            }
                            evaluateJsLiveData2.postValue(new Pair(webActionEnum2, str));
                        }
                    };
                    final WineWebViewModel wineWebViewModel3 = wineWebViewModel;
                    deviceService.getApplianceProfile(string, string2, r2, new Function1<Throwable, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Throwable) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Throwable th) {
                            Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getApplianceProfile fail: ", th));
                            String message = th.getMessage();
                            String str = "";
                            if (message == null) {
                                message = str;
                            }
                            JsResp jsResp = new JsResp(null, 1, message);
                            MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = wineWebViewModel3.getEvaluateJsLiveData();
                            WebActionEnum webActionEnum = WebActionEnum.GET_APPLIANCE_PROFILE_CALLBACK;
                            String json = new Gson().toJson((Object) jsResp);
                            if (json != null) {
                                str = json;
                            }
                            evaluateJsLiveData.postValue(new Pair(webActionEnum, str));
                        }
                    });
                }
            };
            final WineWebViewModel wineWebViewModel2 = this.this$0;
            wineWebViewModel.generateJSONObject(str, r1, new Function1<String, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, LanguageConstKt.f15954it);
                    JsResp jsResp = new JsResp(null, 1, str);
                    MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = wineWebViewModel2.getEvaluateJsLiveData();
                    WebActionEnum webActionEnum = WebActionEnum.GET_APPLIANCE_PROFILE_CALLBACK;
                    String json = new Gson().toJson((Object) jsResp);
                    if (json == null) {
                        json = "";
                    }
                    evaluateJsLiveData.postValue(new Pair(webActionEnum, json));
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
