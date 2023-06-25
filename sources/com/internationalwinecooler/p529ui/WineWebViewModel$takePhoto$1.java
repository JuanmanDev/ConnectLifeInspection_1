package com.internationalwinecooler.p529ui;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
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
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$takePhoto$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$takePhoto$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$takePhoto$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$takePhoto$1(WineWebViewModel wineWebViewModel, String str, Continuation<? super WineWebViewModel$takePhoto$1> continuation) {
        super(2, continuation);
        this.this$0 = wineWebViewModel;
        this.$model = str;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$takePhoto$1(this.this$0, this.$model, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$takePhoto$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final WineWebViewModel wineWebViewModel = this.this$0;
            String str = this.$model;
            C86911 r1 = new Function1<JSONObject, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((JSONObject) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull JSONObject jSONObject) {
                    Intrinsics.checkNotNullParameter(jSONObject, LanguageConstKt.f15954it);
                    wineWebViewModel.getTakePhotoLiveData().postValue(jSONObject.getString("type"));
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
                    wineWebViewModel2.getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.TAKE_PHOTO_CALLBACK, new Gson().toJson((Object) new JsResp(new JsonObject(), 1, str))));
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
