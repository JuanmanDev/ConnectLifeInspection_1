package com.hisense.connect_life.app_account.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
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
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.AccountViewModel$checkPassExist$1", mo48701f = "AccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$checkPassExist$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $requestTag;
    public int label;
    public final /* synthetic */ AccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$checkPassExist$1(AccountViewModel accountViewModel, String str, Continuation<? super AccountViewModel$checkPassExist$1> continuation) {
        super(2, continuation);
        this.this$0 = accountViewModel;
        this.$requestTag = str;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AccountViewModel$checkPassExist$1(this.this$0, this.$requestTag, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AccountViewModel$checkPassExist$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            final AccountViewModel accountViewModel = this.this$0;
            final String str = this.$requestTag;
            accountService.checkPass(new Function1<HiSmartCallback<Boolean>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<Boolean>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<Boolean> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$checkPass");
                    final AccountViewModel accountViewModel = accountViewModel;
                    final String str = str;
                    hiSmartCallback.success(new Function1<Boolean, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            accountViewModel.getCheckPassLiveData().postValue(new Triple(Boolean.TRUE, str, Boolean.valueOf(z)));
                        }
                    });
                    final AccountViewModel accountViewModel2 = accountViewModel;
                    final String str2 = str;
                    hiSmartCallback.failure(new Function1<FailureBean, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FailureBean) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FailureBean failureBean) {
                            Intrinsics.checkNotNullParameter(failureBean, LanguageConstKt.f15954it);
                            MutableLiveData<Triple<Boolean, String, Boolean>> checkPassLiveData = accountViewModel2.getCheckPassLiveData();
                            Boolean bool = Boolean.FALSE;
                            checkPassLiveData.postValue(new Triple(bool, str2, bool));
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
