package com.hisense.connect_life.app_account.activity;

import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.activity.DeleteAccountEmailCode$deleteAccountSuccess$1", mo48701f = "DeleteAccountEmailCode.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: DeleteAccountEmailCode.kt */
public final class DeleteAccountEmailCode$deleteAccountSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;

    public DeleteAccountEmailCode$deleteAccountSuccess$1(Continuation<? super DeleteAccountEmailCode$deleteAccountSuccess$1> continuation) {
        super(2, continuation);
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeleteAccountEmailCode$deleteAccountSuccess$1(continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeleteAccountEmailCode$deleteAccountSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LoginInfo userInfo = AccountUtils.Companion.getUserInfo();
            if (userInfo != null) {
                AccountUtils.Companion.deleteUserEmail(userInfo.getEmail());
            }
            AccountUtils.Companion.deleteAllUserInfoFromDatabase();
            AccountUtils.Companion.clearLoginInfo();
            EventBus.getDefault().post(KeyConst.DeleteAccount);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
