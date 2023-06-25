package com.hisense.connect_life.app_account.activity;

import android.widget.LinearLayout;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$id;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.activity.LoginUsersActivity$onStart$1", mo48701f = "LoginUsersActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: LoginUsersActivity.kt */
public final class LoginUsersActivity$onStart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LoginUsersActivity this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.activity.LoginUsersActivity$onStart$1$1", mo48701f = "LoginUsersActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.hisense.connect_life.app_account.activity.LoginUsersActivity$onStart$1$1 */
    /* compiled from: LoginUsersActivity.kt */
    public static final class C84521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C84521(loginUsersActivity, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C84521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                LinearLayout linearLayout = (LinearLayout) loginUsersActivity._$_findCachedViewById(R$id.more_than_one_user_layout);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "more_than_one_user_layout");
                linearLayout.setVisibility(0);
                LinearLayout linearLayout2 = (LinearLayout) loginUsersActivity._$_findCachedViewById(R$id.one_user_layout);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "one_user_layout");
                linearLayout2.setVisibility(8);
                loginUsersActivity.userIconBgColor = R$color.user_bg_1;
                LoginUsersActivity loginUsersActivity = loginUsersActivity;
                int i = 1;
                if (loginUsersActivity.loginUserInfoList.size() > 1) {
                    i = 2;
                }
                loginUsersActivity.spanCount = i;
                loginUsersActivity.initMoreThanOneUserView();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginUsersActivity$onStart$1(LoginUsersActivity loginUsersActivity, Continuation<? super LoginUsersActivity$onStart$1> continuation) {
        super(2, continuation);
        this.this$0 = loginUsersActivity;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        LoginUsersActivity$onStart$1 loginUsersActivity$onStart$1 = new LoginUsersActivity$onStart$1(this.this$0, continuation);
        loginUsersActivity$onStart$1.L$0 = obj;
        return loginUsersActivity$onStart$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LoginUsersActivity$onStart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getLoginUserInfoList();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            final LoginUsersActivity loginUsersActivity = this.this$0;
            Job unused = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, main, (CoroutineStart) null, new C84521((Continuation<? super C84521>) null), 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
