package com.hisense.connect_life.third_account.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import com.hisense.connect_life.third_account.R$string;
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
@DebugMetadata(mo48700c = "com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel$anonymousLogin$1", mo48701f = "ThirdAccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: ThirdAccountViewModel.kt */
public final class ThirdAccountViewModel$anonymousLogin$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Object[] $arg;
    public final /* synthetic */ int $requestFun;
    public int label;
    public final /* synthetic */ ThirdAccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdAccountViewModel$anonymousLogin$1(int i, ThirdAccountViewModel thirdAccountViewModel, Object[] objArr, Continuation<? super ThirdAccountViewModel$anonymousLogin$1> continuation) {
        super(2, continuation);
        this.$requestFun = i;
        this.this$0 = thirdAccountViewModel;
        this.$arg = objArr;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ThirdAccountViewModel$anonymousLogin$1(this.$requestFun, this.this$0, this.$arg, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ThirdAccountViewModel$anonymousLogin$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            String jhlDevSerial = AppConfig.Companion.getJhlDevSerial();
            final int i = this.$requestFun;
            final ThirdAccountViewModel thirdAccountViewModel = this.this$0;
            final Object[] objArr = this.$arg;
            accountService.anonymousLogin(jhlDevSerial, new Function1<HiSmartCallback<ClientLoginInfo>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<ClientLoginInfo>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<ClientLoginInfo> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$anonymousLogin");
                    final int i = i;
                    final ThirdAccountViewModel thirdAccountViewModel = thirdAccountViewModel;
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
                            if (i == thirdAccountViewModel.CHECK_THIRD_LOGIN) {
                                ThirdAccountViewModel thirdAccountViewModel = thirdAccountViewModel;
                                Object[] objArr = objArr;
                                thirdAccountViewModel.thirdSignIn((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
                            } else if (i == thirdAccountViewModel.CHECK_THIRD_REGIEST) {
                                ThirdAccountViewModel thirdAccountViewModel2 = thirdAccountViewModel;
                                Object[] objArr2 = objArr;
                                thirdAccountViewModel2.thirdRegister((String) objArr2[0], (String) objArr2[1], (String) objArr2[2], (String) objArr2[3], (String) objArr2[4], (String) objArr2[5]);
                            } else if (i == thirdAccountViewModel.UNBIND_THIRD_ACCOUNT) {
                                thirdAccountViewModel.thirdUnbind((String) objArr[0]);
                            }
                        }
                    });
                    final ThirdAccountViewModel thirdAccountViewModel2 = thirdAccountViewModel;
                    hiSmartCallback.failure(new Function1<FailureBean, Unit>() {

                        @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
                        @DebugMetadata(mo48700c = "com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel$anonymousLogin$1$1$2$1", mo48701f = "ThirdAccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
                        /* renamed from: com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel$anonymousLogin$1$1$2$1 */
                        /* compiled from: ThirdAccountViewModel.kt */
                        public static final class C85771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public int label;

                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C85771(continuation);
                            }

                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C85771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                            thirdAccountViewModel2.updateLoadingStatus(false);
                            if (failureBean.getResultCode() == -99 || failureBean.getResultCode() != -1) {
                                Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(thirdAccountViewModel2), Dispatchers.getMain(), (CoroutineStart) null, new C85771((Continuation<? super C85771>) null), 2, (Object) null);
                            } else {
                                thirdAccountViewModel2.getEmptyLoginData().postValue(Boolean.FALSE);
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
