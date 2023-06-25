package com.hisense.juconnect.app_device.viewmodel;

import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
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
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.viewmodel.MessageViewModel$subscribePush$1", mo48701f = "MessageViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: MessageViewModel.kt */
public final class MessageViewModel$subscribePush$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ MessageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageViewModel$subscribePush$1(MessageViewModel messageViewModel, Continuation<? super MessageViewModel$subscribePush$1> continuation) {
        super(2, continuation);
        this.this$0 = messageViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MessageViewModel$subscribePush$1(this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MessageViewModel$subscribePush$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IPushMessageService pushMessageService = HiSmart.Companion.getInstance().pushMessageService();
            String fcmToken = AppConfig.Companion.getFcmToken();
            final MessageViewModel messageViewModel = this.this$0;
            C86411 r1 = new Function1<Boolean, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("subscribePush deviceToken: ", AppConfig.Companion.getFcmToken()));
                    LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("subscribePush suc: ", Boolean.valueOf(z)));
                    messageViewModel.getSubscribePushLiveData().postValue(Boolean.valueOf(z));
                }
            };
            final MessageViewModel messageViewModel2 = this.this$0;
            pushMessageService.subscribePush(fcmToken, "", r1, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                    LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("subscribePush fail: ", th.getMessage()));
                    messageViewModel2.getSubscribePushLiveData().postValue(Boolean.FALSE);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
