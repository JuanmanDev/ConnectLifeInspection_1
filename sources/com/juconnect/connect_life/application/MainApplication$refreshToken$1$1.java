package com.juconnect.connect_life.application;

import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.juconnect.connect_life.application.MainApplication$refreshToken$1$1", mo48701f = "MainApplication.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: MainApplication.kt */
public final class MainApplication$refreshToken$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LoginInfo $this_run;
    public final /* synthetic */ Ref.IntRef $userNum;
    public int label;
    public final /* synthetic */ MainApplication this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainApplication$refreshToken$1$1(LoginInfo loginInfo, MainApplication mainApplication, Ref.IntRef intRef, Continuation<? super MainApplication$refreshToken$1$1> continuation) {
        super(2, continuation);
        this.$this_run = loginInfo;
        this.this$0 = mainApplication;
        this.$userNum = intRef;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainApplication$refreshToken$1$1(this.$this_run, this.this$0, this.$userNum, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MainApplication$refreshToken$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            String refreshToken = this.$this_run.getRefreshToken();
            String jhkDeviceId = AppConfig.Companion.getJhkDeviceId();
            String jhlDevSerial = AppConfig.Companion.getJhlDevSerial();
            final MainApplication mainApplication = this.this$0;
            final LoginInfo loginInfo = this.$this_run;
            final Ref.IntRef intRef = this.$userNum;
            accountService.refreshToken(refreshToken, jhkDeviceId, jhlDevSerial, new Function1<HiSmartCallback<ClientLoginInfo>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<ClientLoginInfo>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<ClientLoginInfo> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$refreshToken");
                    final MainApplication mainApplication = mainApplication;
                    final LoginInfo loginInfo = loginInfo;
                    hiSmartCallback.success(new Function1<ClientLoginInfo, Unit>() {

                        @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
                        @DebugMetadata(mo48700c = "com.juconnect.connect_life.application.MainApplication$refreshToken$1$1$1$1$1", mo48701f = "MainApplication.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
                        /* renamed from: com.juconnect.connect_life.application.MainApplication$refreshToken$1$1$1$1$1 */
                        /* compiled from: MainApplication.kt */
                        public static final class C87301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public int label;

                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C87301(mainApplication, clientLoginInfo, loginInfo, continuation);
                            }

                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C87301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    mainApplication.setLoginSuccInfo(clientLoginInfo, loginInfo.getEmail(), loginInfo.getPassword(), loginInfo.getLoginSource(), loginInfo.getThirdPlatformId());
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((ClientLoginInfo) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull final ClientLoginInfo clientLoginInfo) {
                            Intrinsics.checkNotNullParameter(clientLoginInfo, LanguageConstKt.f15954it);
                            LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("refreshToken success = ", clientLoginInfo));
                            GlobalScope globalScope = GlobalScope.INSTANCE;
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            final MainApplication mainApplication = mainApplication;
                            final LoginInfo loginInfo = loginInfo;
                            Job unused = BuildersKt__Builders_commonKt.launch$default(globalScope, main, (CoroutineStart) null, new C87301((Continuation<? super C87301>) null), 2, (Object) null);
                        }
                    });
                    final Ref.IntRef intRef = intRef;
                    hiSmartCallback.failure(new Function1<FailureBean, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FailureBean) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FailureBean failureBean) {
                            Intrinsics.checkNotNullParameter(failureBean, LanguageConstKt.f15954it);
                            AppConfig.Companion.setAnonymousLoginToken("");
                            AppConfig.Companion.setAccessToken("");
                            HiSmart.Companion.getInstance().updateToken("");
                            LoginUserInfoRoom.Companion.loginUserInfoProvider().deleteAll();
                            boolean z = intRef.element == 0;
                            String str = Paths.Account.LoginEmailActivity;
                            if (z) {
                                if (AccountUtils.Companion.userEmails().isEmpty()) {
                                    str = Paths.Account.LoginFirstActivity;
                                }
                                Postcard a = C1337a.m211c().mo15011a(str);
                                a.withFlags(268468224);
                                a.navigation();
                            } else if (!z) {
                                Postcard a2 = C1337a.m211c().mo15011a(str);
                                a2.withFlags(268468224);
                                a2.navigation();
                            }
                            LoginActivityManager.Companion.get().removeAllActivity();
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
