package com.hisense.juconnect.app_device.activity;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessViewModel$queryLastChange$1", mo48701f = "WineLabelScannerSuccessViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: WineLabelScannerSuccessViewModel.kt */
public final class WineLabelScannerSuccessViewModel$queryLastChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $vivinoId;
    public int label;
    public final /* synthetic */ WineLabelScannerSuccessViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineLabelScannerSuccessViewModel$queryLastChange$1(WineLabelScannerSuccessViewModel wineLabelScannerSuccessViewModel, String str, Continuation<? super WineLabelScannerSuccessViewModel$queryLastChange$1> continuation) {
        super(2, continuation);
        this.this$0 = wineLabelScannerSuccessViewModel;
        this.$vivinoId = str;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineLabelScannerSuccessViewModel$queryLastChange$1(this.this$0, this.$vivinoId, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineLabelScannerSuccessViewModel$queryLastChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getLocalWineList(this.$vivinoId);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}