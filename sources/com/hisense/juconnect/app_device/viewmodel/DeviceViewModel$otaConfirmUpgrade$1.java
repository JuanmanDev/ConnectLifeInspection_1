package com.hisense.juconnect.app_device.viewmodel;

import com.hisense.connect_life.hismart.core.HiSmart;
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
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.viewmodel.DeviceViewModel$otaConfirmUpgrade$1", mo48701f = "DeviceViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: DeviceViewModel.kt */
public final class DeviceViewModel$otaConfirmUpgrade$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $wifiId;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceViewModel$otaConfirmUpgrade$1(String str, Continuation<? super DeviceViewModel$otaConfirmUpgrade$1> continuation) {
        super(2, continuation);
        this.$wifiId = str;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceViewModel$otaConfirmUpgrade$1(this.$wifiId, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceViewModel$otaConfirmUpgrade$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            HiSmart.Companion.getInstance().deviceService().otaConfirmUpgrade(this.$wifiId, C86281.INSTANCE, C86292.INSTANCE);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
