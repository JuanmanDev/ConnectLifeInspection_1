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
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.activity.WineLabelScannerSuccessActivity$onStart$1", mo48701f = "WineLabelScannerSuccessActivity.kt", mo48702i = {}, mo48703l = {41}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: WineLabelScannerSuccessActivity.kt */
public final class WineLabelScannerSuccessActivity$onStart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ WineLabelScannerSuccessActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineLabelScannerSuccessActivity$onStart$1(WineLabelScannerSuccessActivity wineLabelScannerSuccessActivity, Continuation<? super WineLabelScannerSuccessActivity$onStart$1> continuation) {
        super(2, continuation);
        this.this$0 = wineLabelScannerSuccessActivity;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineLabelScannerSuccessActivity$onStart$1(this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineLabelScannerSuccessActivity$onStart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(1000, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        WineLabelScannerSuccessActivity.access$getMViewModel(this.this$0).isInventory(this.this$0.getVivinoId());
        return Unit.INSTANCE;
    }
}
