package com.internationalwinecooler.p529ui;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.IDeviceService;
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
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$updateApplianceNickName$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$updateApplianceNickName$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$updateApplianceNickName$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $auId;
    public final /* synthetic */ String $deviceNickName;
    public final /* synthetic */ String $wifiId;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$updateApplianceNickName$1(String str, String str2, String str3, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$updateApplianceNickName$1> continuation) {
        super(2, continuation);
        this.$wifiId = str;
        this.$auId = str2;
        this.$deviceNickName = str3;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$updateApplianceNickName$1(this.$wifiId, this.$auId, this.$deviceNickName, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$updateApplianceNickName$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IDeviceService deviceService = HiSmart.Companion.getInstance().deviceService();
            String str = this.$wifiId;
            String str2 = this.$auId;
            String str3 = this.$deviceNickName;
            final WineWebViewModel wineWebViewModel = this.this$0;
            C86951 r4 = new Function1<Boolean, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    String str = "";
                    JsResp jsResp = new JsResp(str, z ^ true ? 1 : 0, str);
                    MutableLiveData<Pair<WebActionEnum, String>> evaluateJsLiveData = wineWebViewModel.getEvaluateJsLiveData();
                    WebActionEnum webActionEnum = WebActionEnum.UPDATE_APPLIANCE_NICKNAME_CALLBACK;
                    String json = new Gson().toJson((Object) jsResp);
                    if (json != null) {
                        str = json;
                    }
                    evaluateJsLiveData.postValue(new Pair(webActionEnum, str));
                }
            };
            final WineWebViewModel wineWebViewModel2 = this.this$0;
            deviceService.updateDeviceCustomInfo(str, str2, str3, r4, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                    WineWebViewModel wineWebViewModel = wineWebViewModel2;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    wineWebViewModel.executeFailCallback(message, WebActionEnum.UPDATE_APPLIANCE_NICKNAME_CALLBACK);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
