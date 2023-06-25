package com.internationalwinecooler.p529ui;

import android.text.TextUtils;
import androidx.core.app.NotificationCompatJellybean;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connectlife.ConnectLife;
import com.juconnect.connectlife.model.ConlManual;
import com.juconnect.connectlife.service.IConnectLifeService;
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
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getManualInfo$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getManualInfo$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getManualInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getManualInfo$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getManualInfo$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getManualInfo$1(this.$model, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getManualInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                final String string = new JSONObject(this.$model).getString("deviceId");
                if (TextUtils.isEmpty(string)) {
                    WineWebViewModel wineWebViewModel = this.this$0;
                    String b = C1527w.m1063b(R.string.parameter_error);
                    Intrinsics.checkNotNullExpressionValue(b, "getString(R.string.parameter_error)");
                    wineWebViewModel.executeFailCallback(b, WebActionEnum.GET_MANUAL_INFO_CALLBACK);
                } else {
                    IConnectLifeService connectLifeService = ConnectLife.Companion.connectLifeService();
                    String accessToken = AppConfig.Companion.getAccessToken();
                    String stringPlus = Intrinsics.stringPlus(string, "/en");
                    final WineWebViewModel wineWebViewModel2 = this.this$0;
                    C86641 r5 = new Function1<List<? extends ConlManual>, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((List<ConlManual>) (List) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull List<ConlManual> list) {
                            String deviceNickName;
                            Intrinsics.checkNotNullParameter(list, LanguageConstKt.f15954it);
                            DeviceCache instance = DeviceCache.Companion.getInstance();
                            String str = string;
                            Intrinsics.checkNotNullExpressionValue(str, KeyConst.KEY_AUIT);
                            DeviceInfo device = instance.getDevice(str);
                            JsonObject jsonObject = new JsonObject();
                            JsonArray jsonArray = new JsonArray();
                            JsonObject jsonObject2 = new JsonObject();
                            JsonArray jsonArray2 = new JsonArray();
                            for (ConlManual conlManual : list) {
                                JsonObject jsonObject3 = new JsonObject();
                                jsonObject3.addProperty(NotificationCompatJellybean.KEY_TITLE, conlManual.getDesc());
                                jsonObject3.addProperty("url", conlManual.getUrl());
                                jsonArray2.add((JsonElement) jsonObject3);
                            }
                            String str2 = "";
                            if (!(device == null || (deviceNickName = device.getDeviceNickName()) == null)) {
                                str2 = deviceNickName;
                            }
                            jsonObject2.addProperty("wineName", str2);
                            jsonObject2.add("manualData", jsonArray2);
                            jsonArray.add((JsonElement) jsonObject2);
                            jsonObject.addProperty("resultCode", (Number) 0);
                            jsonObject.add("data", jsonArray);
                            wineWebViewModel2.getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.GET_MANUAL_INFO_CALLBACK, jsonObject.toString()));
                        }
                    };
                    final WineWebViewModel wineWebViewModel3 = this.this$0;
                    connectLifeService.queryManual(accessToken, stringPlus, LanguageConstKt.f15944en, r5, new Function1<Throwable, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Throwable) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Throwable th) {
                            String message;
                            WineWebViewModel wineWebViewModel = wineWebViewModel3;
                            String str = "";
                            if (!(th == null || (message = th.getMessage()) == null)) {
                                str = message;
                            }
                            wineWebViewModel.executeFailCallback(str, WebActionEnum.GET_MANUAL_INFO_CALLBACK);
                        }
                    });
                }
            } catch (JSONException e) {
                WineWebViewModel wineWebViewModel4 = this.this$0;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                wineWebViewModel4.executeFailCallback(message, WebActionEnum.GET_MANUAL_INFO_CALLBACK);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
