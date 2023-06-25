package com.hisense.connect_life.app_account.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.CheckUpgradeByPackageResponse;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.AccountViewModel$checkUpgradeByPackage$1", mo48701f = "AccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$checkUpgradeByPackage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $languageId;
    public final /* synthetic */ String $packageName;
    public final /* synthetic */ Function1<CheckUpgradeByPackageResponse, Unit> $responseCallback;
    public final /* synthetic */ int $versionCode;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$checkUpgradeByPackage$1(String str, int i, String str2, Function1<? super CheckUpgradeByPackageResponse, Unit> function1, Continuation<? super AccountViewModel$checkUpgradeByPackage$1> continuation) {
        super(2, continuation);
        this.$languageId = str;
        this.$versionCode = i;
        this.$packageName = str2;
        this.$responseCallback = function1;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AccountViewModel$checkUpgradeByPackage$1(this.$languageId, this.$versionCode, this.$packageName, this.$responseCallback, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AccountViewModel$checkUpgradeByPackage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            String str = this.$languageId;
            int i = this.$versionCode;
            String str2 = this.$packageName;
            final Function1<CheckUpgradeByPackageResponse, Unit> function1 = this.$responseCallback;
            accountService.checkUpgradeByPackage(str, i, str2, new Function1<HiSmartCallback<CheckUpgradeByPackageResponse>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<CheckUpgradeByPackageResponse>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<CheckUpgradeByPackageResponse> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$checkUpgradeByPackage");
                    final Function1<CheckUpgradeByPackageResponse, Unit> function1 = function1;
                    hiSmartCallback.success(new Function1<CheckUpgradeByPackageResponse, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((CheckUpgradeByPackageResponse) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull CheckUpgradeByPackageResponse checkUpgradeByPackageResponse) {
                            Intrinsics.checkNotNullParameter(checkUpgradeByPackageResponse, LanguageConstKt.f15954it);
                            function1.invoke(checkUpgradeByPackageResponse);
                        }
                    });
                    hiSmartCallback.failure(C84862.INSTANCE);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
