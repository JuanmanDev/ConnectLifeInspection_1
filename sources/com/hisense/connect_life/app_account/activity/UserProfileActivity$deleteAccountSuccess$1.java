package com.hisense.connect_life.app_account.activity;

import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.activity.UserProfileActivity$deleteAccountSuccess$1", mo48701f = "UserProfileActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: UserProfileActivity.kt */
public final class UserProfileActivity$deleteAccountSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;

    public UserProfileActivity$deleteAccountSuccess$1(Continuation<? super UserProfileActivity$deleteAccountSuccess$1> continuation) {
        super(2, continuation);
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UserProfileActivity$deleteAccountSuccess$1(continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UserProfileActivity$deleteAccountSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LoginInfo userInfo = AccountUtils.Companion.getUserInfo();
            if (userInfo != null) {
                AccountUtils.Companion.deleteUserEmail(userInfo.getEmail());
            }
            AccountUtils.Companion.deleteAllUserInfoFromDatabase();
            AccountUtils.Companion.clearLoginInfo();
            boolean z = false;
            try {
                ArrayList<LoginUserInfo> all = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll();
                i = (all == null ? null : Boxing.boxInt(all.size())).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                i = 0;
            }
            if (i == 0) {
                z = true;
            }
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
                a2.withInt("userNum", i);
                a2.navigation();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
