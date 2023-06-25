package com.juconnect.connect_life.fcm;

import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.pushmessage.IPushMessageService;
import kotlin.Metadata;
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
@DebugMetadata(mo48700c = "com.juconnect.connect_life.fcm.FireBaseViewModel$unsubscribeFireBase$1", mo48701f = "FireBaseViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: FireBaseViewModel.kt */
public final class FireBaseViewModel$unsubscribeFireBase$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ FireBaseViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FireBaseViewModel$unsubscribeFireBase$1(FireBaseViewModel fireBaseViewModel, Continuation<? super FireBaseViewModel$unsubscribeFireBase$1> continuation) {
        super(2, continuation);
        this.this$0 = fireBaseViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FireBaseViewModel$unsubscribeFireBase$1(this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FireBaseViewModel$unsubscribeFireBase$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IPushMessageService pushMessageService = HiSmart.Companion.getInstance().pushMessageService();
            String fcmToken = AppConfig.Companion.getFcmToken();
            final FireBaseViewModel fireBaseViewModel = this.this$0;
            pushMessageService.unsubcribePush(fcmToken, new Function1<Boolean, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    Intrinsics.stringPlus("unsubscribeFireBase suc: ", Boolean.valueOf(z));
                    fireBaseViewModel.getUnsubscribeLiveData().postValue(Boolean.valueOf(z));
                }
            }, C87352.INSTANCE);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
