package com.internationalwinecooler.p529ui;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.SplashActivity$initWidgets$1", mo48701f = "SplashActivity.kt", mo48702i = {0, 0}, mo48703l = {45}, mo48704m = "invokeSuspend", mo48705n = {"$this$launch", "userNum"}, mo48706s = {"L$0", "L$1"})
/* renamed from: com.internationalwinecooler.ui.SplashActivity$initWidgets$1 */
/* compiled from: SplashActivity.kt */
public final class SplashActivity$initWidgets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SplashActivity this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.ui.SplashActivity$initWidgets$1$1", mo48701f = "SplashActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.ui.SplashActivity$initWidgets$1$1 */
    /* compiled from: SplashActivity.kt */
    public static final class C86521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C86521(intRef, splashActivity, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C86521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = intRef.element == 0;
                if (z) {
                    JuConnectExtKt.navigation(Paths.Account.LoginFirstActivity);
                } else if (!z) {
                    Ref.IntRef intRef = intRef;
                    Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginEmailActivity);
                    a.withInt("userNum", intRef.element);
                    a.navigation();
                }
                splashActivity.finish();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashActivity$initWidgets$1(SplashActivity splashActivity, Continuation<? super SplashActivity$initWidgets$1> continuation) {
        super(2, continuation);
        this.this$0 = splashActivity;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SplashActivity$initWidgets$1 splashActivity$initWidgets$1 = new SplashActivity$initWidgets$1(this.this$0, continuation);
        splashActivity$initWidgets$1.L$0 = obj;
        return splashActivity$initWidgets$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SplashActivity$initWidgets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        final Ref.IntRef intRef;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            Ref.IntRef intRef2 = new Ref.IntRef();
            try {
                ArrayList<LoginUserInfo> all = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll();
                intRef2.element = (all == null ? null : Boxing.boxInt(all.size())).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.L$0 = coroutineScope;
            this.L$1 = intRef2;
            this.label = 1;
            if (DelayKt.delay(ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef = intRef2;
        } else if (i == 1) {
            intRef = (Ref.IntRef) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CoroutineScope coroutineScope2 = coroutineScope;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        final SplashActivity splashActivity = this.this$0;
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, main, (CoroutineStart) null, new C86521((Continuation<? super C86521>) null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
