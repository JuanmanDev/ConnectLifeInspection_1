package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.activity.LoginResetPswActivity$gotoLogin$1", mo48701f = "LoginResetPswActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: LoginResetPswActivity.kt */
public final class LoginResetPswActivity$gotoLogin$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.activity.LoginResetPswActivity$gotoLogin$1$1", mo48701f = "LoginResetPswActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.hisense.connect_life.app_account.activity.LoginResetPswActivity$gotoLogin$1$1 */
    /* compiled from: LoginResetPswActivity.kt */
    public static final class C84481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C84481(intRef, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C84481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HiSmart.Companion.getInstance().updateToken("");
                AppConfig.Companion.setAccessToken("");
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
                    Ref.IntRef intRef = intRef;
                    Postcard a2 = C1337a.m211c().mo15011a(str);
                    a2.withFlags(268468224);
                    a2.withInt("userNum", intRef.element);
                    a2.navigation();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LoginResetPswActivity$gotoLogin$1(Continuation<? super LoginResetPswActivity$gotoLogin$1> continuation) {
        super(2, continuation);
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        LoginResetPswActivity$gotoLogin$1 loginResetPswActivity$gotoLogin$1 = new LoginResetPswActivity$gotoLogin$1(continuation);
        loginResetPswActivity$gotoLogin$1.L$0 = obj;
        return loginResetPswActivity$gotoLogin$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LoginResetPswActivity$gotoLogin$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final Ref.IntRef intRef = new Ref.IntRef();
            try {
                intRef.element = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll().size();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), (CoroutineStart) null, new C84481((Continuation<? super C84481>) null), 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
