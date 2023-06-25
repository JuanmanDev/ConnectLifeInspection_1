package com.hisense.connect_life.app_account.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
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
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.AccountViewModel$getUserProfile$2", mo48701f = "AccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$getUserProfile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isSaveUserInfoToSql;
    public int label;
    public final /* synthetic */ AccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$getUserProfile$2(AccountViewModel accountViewModel, boolean z, Continuation<? super AccountViewModel$getUserProfile$2> continuation) {
        super(2, continuation);
        this.this$0 = accountViewModel;
        this.$isSaveUserInfoToSql = z;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AccountViewModel$getUserProfile$2(this.this$0, this.$isSaveUserInfoToSql, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AccountViewModel$getUserProfile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            final AccountViewModel accountViewModel = this.this$0;
            final boolean z = this.$isSaveUserInfoToSql;
            C85111 r0 = new Function1<UserProfile, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((UserProfile) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable UserProfile userProfile) {
                    accountViewModel.getQueryUpLiveData().postValue(new Pair(Boolean.TRUE, userProfile));
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getUserProfile success: ", userProfile));
                    accountViewModel.updateLoadingStatus(false);
                    if (z) {
                        accountViewModel.saveUserProfileToSql(userProfile);
                    }
                }
            };
            final AccountViewModel accountViewModel2 = this.this$0;
            accountService.getUserProfile(r0, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getUserProfile failure: ", th));
                    accountViewModel2.getQueryUpLiveData().postValue(new Pair(Boolean.FALSE, null));
                    accountViewModel2.updateLoadingStatus(false);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
