package com.hisense.connect_life.third_account.viewmodel;

import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import com.hisense.connect_life.hismart.networks.request.device.model.RegisterInfo;
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
@DebugMetadata(mo48700c = "com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel$thirdRegister$1", mo48701f = "ThirdAccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: ThirdAccountViewModel.kt */
public final class ThirdAccountViewModel$thirdRegister$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $authCode;
    public final /* synthetic */ String $idToken;
    public final /* synthetic */ String $mailbox;
    public final /* synthetic */ String $sourceId;
    public final /* synthetic */ String $thirdClientId;
    public final /* synthetic */ String $thirdType;
    public int label;
    public final /* synthetic */ ThirdAccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdAccountViewModel$thirdRegister$1(String str, String str2, String str3, String str4, String str5, String str6, ThirdAccountViewModel thirdAccountViewModel, Continuation<? super ThirdAccountViewModel$thirdRegister$1> continuation) {
        super(2, continuation);
        this.$thirdClientId = str;
        this.$thirdType = str2;
        this.$idToken = str3;
        this.$mailbox = str4;
        this.$authCode = str5;
        this.$sourceId = str6;
        this.this$0 = thirdAccountViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ThirdAccountViewModel$thirdRegister$1(this.$thirdClientId, this.$thirdType, this.$idToken, this.$mailbox, this.$authCode, this.$sourceId, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ThirdAccountViewModel$thirdRegister$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            String str = this.$thirdClientId;
            String str2 = this.$thirdType;
            String str3 = this.$idToken;
            String str4 = this.$mailbox;
            String str5 = this.$authCode;
            String str6 = this.$sourceId;
            String anonymousLoginToken = AppConfig.Companion.getAnonymousLoginToken();
            final String str7 = this.$mailbox;
            final ThirdAccountViewModel thirdAccountViewModel = this.this$0;
            accountService.thirdRegister(str, str2, str3, str4, str5, str6, anonymousLoginToken, new Function1<HiSmartCallback<RegisterInfo>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<RegisterInfo>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<RegisterInfo> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$thirdRegister");
                    final String str = str7;
                    final ThirdAccountViewModel thirdAccountViewModel = thirdAccountViewModel;
                    hiSmartCallback.success(new Function1<RegisterInfo, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((RegisterInfo) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull RegisterInfo registerInfo) {
                            Intrinsics.checkNotNullParameter(registerInfo, LanguageConstKt.f15954it);
                            if (registerInfo.getResultCode() == 0) {
                                HiSmart.Companion.getInstance().updateToken(registerInfo.getAccessToken());
                                AppConfig.Companion.setAccessToken(registerInfo.getAccessToken());
                                SPManagerKt.setEmail(str);
                                thirdAccountViewModel.getThirdRegisterLiveData().postValue(new Pair(Boolean.TRUE, ""));
                            } else {
                                thirdAccountViewModel.getThirdRegisterLiveData().postValue(new Pair(Boolean.FALSE, registerInfo.getErrorDesc()));
                            }
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("register success: ", registerInfo));
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
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("register fail: ", failureBean));
                            thirdAccountViewModel2.getThirdRegisterLiveData().postValue(new Pair(Boolean.FALSE, ""));
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
