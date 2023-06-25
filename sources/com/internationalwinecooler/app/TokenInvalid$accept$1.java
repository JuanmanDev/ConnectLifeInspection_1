package com.internationalwinecooler.app;

import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.utils.SPUtils;
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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.app.TokenInvalid$accept$1", mo48701f = "TokenInvalid.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: TokenInvalid.kt */
public final class TokenInvalid$accept$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ TokenInvalid this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.app.TokenInvalid$accept$1$1", mo48701f = "TokenInvalid.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.app.TokenInvalid$accept$1$1 */
    /* compiled from: TokenInvalid.kt */
    public static final class C86491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C86491(intRef, tokenInvalid, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C86491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
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
                SPUtils.INSTANCE.put(KeyConst.KEY_TOKEN_INVALID_TURN, Boxing.boxBoolean(false));
                tokenInvalid.finish();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenInvalid$accept$1(TokenInvalid tokenInvalid, Continuation<? super TokenInvalid$accept$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenInvalid;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TokenInvalid$accept$1 tokenInvalid$accept$1 = new TokenInvalid$accept$1(this.this$0, continuation);
        tokenInvalid$accept$1.L$0 = obj;
        return tokenInvalid$accept$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TokenInvalid$accept$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final Ref.IntRef intRef = new Ref.IntRef();
            try {
                ArrayList<LoginUserInfo> all = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll();
                intRef.element = (all == null ? null : Boxing.boxInt(all.size())).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            final TokenInvalid tokenInvalid = this.this$0;
            Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, main, (CoroutineStart) null, new C86491((Continuation<? super C86491>) null), 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
