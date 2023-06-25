package com.hisense.connect_life.app_account.viewmodel;

import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.AccountViewModel$saveUserProfileToSql$1", mo48701f = "AccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$saveUserProfileToSql$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ UserProfile $userProfile;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$saveUserProfileToSql$1(UserProfile userProfile, Continuation<? super AccountViewModel$saveUserProfileToSql$1> continuation) {
        super(2, continuation);
        this.$userProfile = userProfile;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AccountViewModel$saveUserProfileToSql$1(this.$userProfile, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AccountViewModel$saveUserProfileToSql$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        String str2;
        String lastName;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            UserProfile userProfile = this.$userProfile;
            if (userProfile != null) {
                LoggerUtil.Companion.mo39146e(String.valueOf(userProfile));
                String str3 = "";
                if (userProfile == null || (str = userProfile.getFirstName()) == null) {
                    str = str3;
                }
                if (!(userProfile == null || (lastName = userProfile.getLastName()) == null)) {
                    str3 = lastName;
                }
                if (userProfile == null) {
                    str2 = null;
                } else {
                    str2 = userProfile.getPhotoUrl();
                }
                String valueOf = String.valueOf(str2);
                LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getUserProfileToInsertSql success: ", userProfile));
                AccountUtils.Companion.saveLoginUserInfoDatabase(str, str3, valueOf);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
