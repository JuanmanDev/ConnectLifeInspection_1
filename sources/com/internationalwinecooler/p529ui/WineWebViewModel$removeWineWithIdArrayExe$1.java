package com.internationalwinecooler.p529ui;

import com.google.gson.Gson;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.model.JsResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1527w;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$removeWineWithIdArrayExe$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$removeWineWithIdArrayExe$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$removeWineWithIdArrayExe$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ WebActionEnum $actionEnum;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$removeWineWithIdArrayExe$1(WineWebViewModel wineWebViewModel, WebActionEnum webActionEnum, Continuation<? super WineWebViewModel$removeWineWithIdArrayExe$1> continuation) {
        super(2, continuation);
        this.this$0 = wineWebViewModel;
        this.$actionEnum = webActionEnum;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$removeWineWithIdArrayExe$1(this.this$0, this.$actionEnum, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$removeWineWithIdArrayExe$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List emptyList = CollectionsKt__CollectionsKt.emptyList();
            String b = C1527w.m1063b(R.string.parameter_error);
            Intrinsics.checkNotNullExpressionValue(b, "getString(R.string.parameter_error)");
            this.this$0.getEvaluateJsLiveData().postValue(new Pair(this.$actionEnum, new Gson().toJson((Object) new JsResp(emptyList, 1, b))));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
