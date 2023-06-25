package com.hisense.connect_life.app_account.activity;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.third_account.util.RefreshTokenUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.activity.ChangeEmailSuccessActivity$initWidgets$1", mo48701f = "ChangeEmailSuccessActivity.kt", mo48702i = {}, mo48703l = {43}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: ChangeEmailSuccessActivity.kt */
public final class ChangeEmailSuccessActivity$initWidgets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;

    public ChangeEmailSuccessActivity$initWidgets$1(Continuation<? super ChangeEmailSuccessActivity$initWidgets$1> continuation) {
        super(2, continuation);
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChangeEmailSuccessActivity$initWidgets$1(continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChangeEmailSuccessActivity$initWidgets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AccountUtils.Companion companion = AccountUtils.Companion;
        companion.deleteAllUserInfoFromDatabase();
        companion.clearLoginInfo();
        AppConfig.Companion.setAccessToken("");
        HiSmart.Companion.getInstance().updateToken("");
        RefreshTokenUtils.Companion.getInstance().stopTimer();
        EventBus.getDefault().post(KeyConst.LOGIN_OUT);
        return Unit.INSTANCE;
    }
}
