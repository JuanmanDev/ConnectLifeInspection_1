package com.hisense.connect_life.app_account.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import com.hisense.connect_life.hismart.networks.request.device.model.JHKUserAgreementBean;
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
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.AccountViewModel$getJHKRegisterProtocol$1", mo48701f = "AccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$getJHKRegisterProtocol$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ AccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$getJHKRegisterProtocol$1(AccountViewModel accountViewModel, Continuation<? super AccountViewModel$getJHKRegisterProtocol$1> continuation) {
        super(2, continuation);
        this.this$0 = accountViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AccountViewModel$getJHKRegisterProtocol$1(this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AccountViewModel$getJHKRegisterProtocol$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            final AccountViewModel accountViewModel = this.this$0;
            accountService.getJHKRegisterProtocol(new Function1<HiSmartCallback<JHKUserAgreementBean>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<JHKUserAgreementBean>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<JHKUserAgreementBean> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$getJHKRegisterProtocol");
                    final AccountViewModel accountViewModel = accountViewModel;
                    hiSmartCallback.success(new Function1<JHKUserAgreementBean, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((JHKUserAgreementBean) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull JHKUserAgreementBean jHKUserAgreementBean) {
                            Intrinsics.checkNotNullParameter(jHKUserAgreementBean, LanguageConstKt.f15954it);
                            accountViewModel.getGetJHKRegisterProtocolLiveData().postValue(new Pair(Boolean.TRUE, jHKUserAgreementBean));
                        }
                    });
                    final AccountViewModel accountViewModel2 = accountViewModel;
                    hiSmartCallback.failure(new Function1<FailureBean, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FailureBean) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FailureBean failureBean) {
                            Intrinsics.checkNotNullParameter(failureBean, LanguageConstKt.f15954it);
                            accountViewModel2.getGetJHKRegisterProtocolLiveData().postValue(new Pair(Boolean.FALSE, null));
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
