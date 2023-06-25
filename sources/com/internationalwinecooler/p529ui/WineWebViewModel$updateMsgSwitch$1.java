package com.internationalwinecooler.p529ui;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.message.IMessageService;
import com.hisense.connect_life.hismart.networks.request.message.model.MessageSwitchListResponse;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$updateMsgSwitch$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$updateMsgSwitch$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$updateMsgSwitch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$updateMsgSwitch$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$updateMsgSwitch$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$updateMsgSwitch$1(this.$model, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$updateMsgSwitch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!TextUtils.isEmpty(this.$model)) {
                MessageSwitchListResponse messageSwitchListResponse = (MessageSwitchListResponse) new Gson().fromJson(this.$model, MessageSwitchListResponse.class);
                IMessageService messageService = HiSmart.Companion.getInstance().messageService();
                String wifiId = messageSwitchListResponse.getWifiId();
                String deviceId = messageSwitchListResponse.getDeviceId();
                String needPush = messageSwitchListResponse.getNeedPush();
                final WineWebViewModel wineWebViewModel = this.this$0;
                C86991 r5 = new Function1<Boolean, Unit>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        String str = "";
                        JsResp jsResp = new JsResp(str, z ^ true ? 1 : 0, str);
                        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("updateMsgSwitch result: ", jsResp));
                        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = wineWebViewModel.getEvaluateJsLiveData();
                        WebActionEnum webActionEnum = WebActionEnum.UPDATE_MSG_SWITCH_CALLBACK;
                        String json = new Gson().toJson((Object) jsResp);
                        if (json != null) {
                            str = json;
                        }
                        evaluateJsLiveData.postValue(new Pair(webActionEnum, str));
                    }
                };
                final WineWebViewModel wineWebViewModel2 = this.this$0;
                messageService.updateMessageSwitch(wifiId, deviceId, needPush, r5, new Function1<Throwable, Unit>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                        String str = "";
                        JsResp jsResp = new JsResp(str, 1, str);
                        MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = wineWebViewModel2.getEvaluateJsLiveData();
                        WebActionEnum webActionEnum = WebActionEnum.UPDATE_MSG_SWITCH_CALLBACK;
                        String json = new Gson().toJson((Object) jsResp);
                        if (json != null) {
                            str = json;
                        }
                        evaluateJsLiveData.postValue(new Pair(webActionEnum, str));
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
