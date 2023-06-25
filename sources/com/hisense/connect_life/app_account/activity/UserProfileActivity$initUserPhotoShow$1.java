package com.hisense.connect_life.app_account.activity;

import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.activity.UserProfileActivity$initUserPhotoShow$1", mo48701f = "UserProfileActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: UserProfileActivity.kt */
public final class UserProfileActivity$initUserPhotoShow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LoginInfo $loginInfo;
    public int label;
    public final /* synthetic */ UserProfileActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserProfileActivity$initUserPhotoShow$1(LoginInfo loginInfo, UserProfileActivity userProfileActivity, Continuation<? super UserProfileActivity$initUserPhotoShow$1> continuation) {
        super(2, continuation);
        this.$loginInfo = loginInfo;
        this.this$0 = userProfileActivity;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UserProfileActivity$initUserPhotoShow$1(this.$loginInfo, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UserProfileActivity$initUserPhotoShow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LoginInfo loginInfo = this.$loginInfo;
            if (loginInfo != null) {
                UserProfileActivity userProfileActivity = this.this$0;
                LoginUserInfo userInfoById = LoginUserInfoRoom.Companion.loginUserInfoProvider().getUserInfoById(loginInfo.getCustomerId());
                if (userInfoById != null) {
                    userProfileActivity.setUserPhoto(userInfoById.getPhoto_url(), userInfoById.getFirst_name(), userInfoById.getLast_name());
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
