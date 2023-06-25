package com.hisense.juconnect.app_device.activity;

import com.hisense.connect_life.core.global.AppConfig;
import com.juconnect.connectlife.ConnectLife;
import com.juconnect.connectlife.model.VivinoUsageBean;
import com.juconnect.connectlife.service.IConnectLifeService;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.activity.ConnectLifeViewModel$vivinoLog$1", mo48701f = "ConnectLifeViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: ConnectLifeViewModel.kt */
public final class ConnectLifeViewModel$vivinoLog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isSuccess;
    public int label;
    public final /* synthetic */ ConnectLifeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectLifeViewModel$vivinoLog$1(boolean z, ConnectLifeViewModel connectLifeViewModel, Continuation<? super ConnectLifeViewModel$vivinoLog$1> continuation) {
        super(2, continuation);
        this.$isSuccess = z;
        this.this$0 = connectLifeViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ConnectLifeViewModel$vivinoLog$1(this.$isSuccess, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ConnectLifeViewModel$vivinoLog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            VivinoUsageBean vivinoUsageBean = new VivinoUsageBean(new Date(), String.valueOf(this.$isSuccess));
            IConnectLifeService connectLifeService = ConnectLife.Companion.connectLifeService();
            String accessToken = AppConfig.Companion.getAccessToken();
            final ConnectLifeViewModel connectLifeViewModel = this.this$0;
            final boolean z = this.$isSuccess;
            C85931 r2 = new Function1<Boolean, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Boolean) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Boolean bool) {
                    connectLifeViewModel.getVivinoLogLiveData().postValue(Boolean.valueOf(z));
                }
            };
            final ConnectLifeViewModel connectLifeViewModel2 = this.this$0;
            final boolean z2 = this.$isSuccess;
            connectLifeService.vivinoLog(accessToken, vivinoUsageBean, r2, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Throwable th) {
                    connectLifeViewModel2.getVivinoLogLiveData().postValue(Boolean.valueOf(z2));
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
