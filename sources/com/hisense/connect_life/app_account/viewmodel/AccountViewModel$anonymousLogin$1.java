package com.hisense.connect_life.app_account.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.AccountViewModel$anonymousLogin$1", mo48701f = "AccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$anonymousLogin$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Object[] $arg;
    public final /* synthetic */ int $requestFun;
    public int label;
    public final /* synthetic */ AccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$anonymousLogin$1(int i, AccountViewModel accountViewModel, Object[] objArr, Continuation<? super AccountViewModel$anonymousLogin$1> continuation) {
        super(2, continuation);
        this.$requestFun = i;
        this.this$0 = accountViewModel;
        this.$arg = objArr;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AccountViewModel$anonymousLogin$1(this.$requestFun, this.this$0, this.$arg, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AccountViewModel$anonymousLogin$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            String jhlDevSerial = AppConfig.Companion.getJhlDevSerial();
            final int i = this.$requestFun;
            final AccountViewModel accountViewModel = this.this$0;
            final Object[] objArr = this.$arg;
            accountService.anonymousLogin(jhlDevSerial, new Function1<HiSmartCallback<ClientLoginInfo>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<ClientLoginInfo>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<ClientLoginInfo> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$anonymousLogin");
                    final int i = i;
                    final AccountViewModel accountViewModel = accountViewModel;
                    final Object[] objArr = objArr;
                    hiSmartCallback.success(new Function1<ClientLoginInfo, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((ClientLoginInfo) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ClientLoginInfo clientLoginInfo) {
                            Intrinsics.checkNotNullParameter(clientLoginInfo, LanguageConstKt.f15954it);
                            AppConfig.Companion.setAnonymousLoginToken(clientLoginInfo.getAccessToken());
                            int i = i;
                            if (i == accountViewModel.CHECK_EMAIL_REGISTER) {
                                accountViewModel.checkLoginNameSign((String) objArr[0]);
                            } else if (i == accountViewModel.CHECK_EMAIL_AUTH_CODE) {
                                AccountViewModel accountViewModel = accountViewModel;
                                Object[] objArr = objArr;
                                accountViewModel.checkAuthCode((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                            } else if (i == accountViewModel.EMAIL_REGISTER) {
                                AccountViewModel accountViewModel2 = accountViewModel;
                                Object[] objArr2 = objArr;
                                accountViewModel2.signUp((String) objArr2[0], (String) objArr2[1], (String) objArr2[2], (String) objArr2[3]);
                            } else if (i == accountViewModel.EMAIL_LOGIN) {
                                AccountViewModel accountViewModel3 = accountViewModel;
                                Object[] objArr3 = objArr;
                                accountViewModel3.signIn((String) objArr3[0], (String) objArr3[1], (String) objArr3[2]);
                            } else if (i == accountViewModel.RESET_PWD_AUTH_CODE) {
                                AccountViewModel accountViewModel4 = accountViewModel;
                                Object[] objArr4 = objArr;
                                accountViewModel4.resetPassword((String) objArr4[0], (String) objArr4[1], (String) objArr4[2]);
                            } else if (i == accountViewModel.PROCOTO_GET) {
                                accountViewModel.getJHLRegisterProtocol((String) objArr[0]);
                            } else if (i == accountViewModel.PROCOTO_USER_GET) {
                                accountViewModel.getJHLUserRegisterProtocol((String) objArr[0]);
                            } else if (i == accountViewModel.PROCOTO_REGISTER_UPDATE) {
                                AccountViewModel accountViewModel5 = accountViewModel;
                                Object[] objArr5 = objArr;
                                accountViewModel5.updateJHLUserRegisterProtocol((String) objArr5[0], (String) objArr5[1]);
                            } else if (i == accountViewModel.GET_LANG) {
                                accountViewModel.getRegionByLang((String) objArr[0], AppConfig.Companion.getAnonymousLoginToken());
                            } else if (i == accountViewModel.GET_VER_CODE) {
                                AccountViewModel accountViewModel6 = accountViewModel;
                                String accessToken = clientLoginInfo.getAccessToken();
                                Object[] objArr6 = objArr;
                                accountViewModel6.sendVerificationCode(accessToken, (String) objArr6[0], (String) objArr6[1]);
                            }
                        }
                    });
                    final AccountViewModel accountViewModel2 = accountViewModel;
                    hiSmartCallback.failure(new Function1<FailureBean, Unit>() {

                        @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
                        @DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.AccountViewModel$anonymousLogin$1$1$2$1", mo48701f = "AccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
                        /* renamed from: com.hisense.connect_life.app_account.viewmodel.AccountViewModel$anonymousLogin$1$1$2$1 */
                        /* compiled from: AccountViewModel.kt */
                        public static final class C84671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public int label;

                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C84671(continuation);
                            }

                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C84671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    ToastUtils.m9582A(SPUtils.INSTANCE.getContext().getString(R$string.failure), new Object[0]);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FailureBean) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FailureBean failureBean) {
                            Intrinsics.checkNotNullParameter(failureBean, LanguageConstKt.f15954it);
                            AppConfig.Companion.setAnonymousLoginToken("");
                            accountViewModel2.updateLoadingStatus(false);
                            if (failureBean.getResultCode() != -1) {
                                Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(accountViewModel2), Dispatchers.getMain(), (CoroutineStart) null, new C84671((Continuation<? super C84671>) null), 2, (Object) null);
                            } else {
                                accountViewModel2.getEmptyLoginData().postValue(Boolean.FALSE);
                            }
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("anonymousLogin failure: ", failureBean));
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
