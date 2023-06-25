package com.hisense.juconnect.app_device.fragment;

import com.hisense.juconnect.app_device.adapter.DeviceNotificationAdapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.fragment.OneApplianceFragment$getUnReadMSG$1$1$1$4", mo48701f = "OneApplianceFragment.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: OneApplianceFragment.kt */
public final class OneApplianceFragment$getUnReadMSG$1$1$1$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ OneApplianceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneApplianceFragment$getUnReadMSG$1$1$1$4(OneApplianceFragment oneApplianceFragment, Continuation<? super OneApplianceFragment$getUnReadMSG$1$1$1$4> continuation) {
        super(2, continuation);
        this.this$0 = oneApplianceFragment;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneApplianceFragment$getUnReadMSG$1$1$1$4(this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneApplianceFragment$getUnReadMSG$1$1$1$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            DeviceNotificationAdapter access$getDeviceNotificationAdapter$p = this.this$0.deviceNotificationAdapter;
            if (access$getDeviceNotificationAdapter$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceNotificationAdapter");
                access$getDeviceNotificationAdapter$p = null;
            }
            access$getDeviceNotificationAdapter$p.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
