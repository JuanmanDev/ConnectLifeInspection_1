package com.hisense.connect_life.third_account.viewmodel;

import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
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
@DebugMetadata(mo48700c = "com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel$thirdSignIn$1", mo48701f = "ThirdAccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: ThirdAccountViewModel.kt */
public final class ThirdAccountViewModel$thirdSignIn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $idToken;
    public final /* synthetic */ String $thirdClientId;
    public final /* synthetic */ String $thirdType;
    public int label;
    public final /* synthetic */ ThirdAccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdAccountViewModel$thirdSignIn$1(String str, String str2, String str3, ThirdAccountViewModel thirdAccountViewModel, Continuation<? super ThirdAccountViewModel$thirdSignIn$1> continuation) {
        super(2, continuation);
        this.$thirdType = str;
        this.$thirdClientId = str2;
        this.$idToken = str3;
        this.this$0 = thirdAccountViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ThirdAccountViewModel$thirdSignIn$1(this.$thirdType, this.$thirdClientId, this.$idToken, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ThirdAccountViewModel$thirdSignIn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            String str = this.$thirdType;
            String str2 = this.$thirdClientId;
            String str3 = this.$idToken;
            String jhlDevSerial = AppConfig.Companion.getJhlDevSerial();
            String anonymousLoginToken = AppConfig.Companion.getAnonymousLoginToken();
            final ThirdAccountViewModel thirdAccountViewModel = this.this$0;
            final String str4 = this.$thirdClientId;
            accountService.thirdSignIn(str, str2, str3, jhlDevSerial, anonymousLoginToken, new Function1<HiSmartCallback<ClientLoginInfo>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<ClientLoginInfo>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<ClientLoginInfo> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$thirdSignIn");
                    final ThirdAccountViewModel thirdAccountViewModel = thirdAccountViewModel;
                    final String str = str4;
                    hiSmartCallback.success(new Function1<ClientLoginInfo, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((ClientLoginInfo) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ClientLoginInfo clientLoginInfo) {
                            Intrinsics.checkNotNullParameter(clientLoginInfo, LanguageConstKt.f15954it);
                            thirdAccountViewModel.setLoginSuccInfo(clientLoginInfo, "", "", "1", str);
                            thirdAccountViewModel.getThirdLoginLiveData().postValue(new Pair(Boolean.TRUE, ""));
                        }
                    });
                    final ThirdAccountViewModel thirdAccountViewModel2 = thirdAccountViewModel;
                    hiSmartCallback.failure(new Function1<FailureBean, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FailureBean) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FailureBean failureBean) {
                            Intrinsics.checkNotNullParameter(failureBean, LanguageConstKt.f15954it);
                            thirdAccountViewModel2.updateLoadingStatus(false);
                            thirdAccountViewModel2.getThirdLoginLiveData().postValue(new Pair(Boolean.FALSE, String.valueOf(failureBean.getErrorCode())));
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
