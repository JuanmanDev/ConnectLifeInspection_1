package com.hisense.connect_life.app_account.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.language.ILanguageService;
import com.hisense.connect_life.hismart.networks.request.language.model.Region;
import com.hisense.connect_life.hismart.networks.request.language.model.RegionResult;
import java.util.Locale;
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
import p040c.p429r.p430a.p431a.p434d.C7269a;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.AccountViewModel$getRegionByLang$1", mo48701f = "AccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$getRegionByLang$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $languageId;
    public final /* synthetic */ String $token;
    public int label;
    public final /* synthetic */ AccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$getRegionByLang$1(String str, String str2, AccountViewModel accountViewModel, Continuation<? super AccountViewModel$getRegionByLang$1> continuation) {
        super(2, continuation);
        this.$languageId = str;
        this.$token = str2;
        this.this$0 = accountViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AccountViewModel$getRegionByLang$1(this.$languageId, this.$token, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AccountViewModel$getRegionByLang$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ILanguageService languageService = HiSmart.Companion.getInstance().languageService();
            String str = this.$languageId;
            String str2 = this.$token;
            final AccountViewModel accountViewModel = this.this$0;
            C85051 r2 = new Function1<RegionResult, Unit>() {
                /* renamed from: invoke$lambda-0  reason: not valid java name */
                public static final boolean m26909invoke$lambda0(Region region) {
                    Intrinsics.checkNotNullParameter(region, "x");
                    String code = region.getCode();
                    Locale locale = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
                    String upperCase = code.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    return Intrinsics.areEqual((Object) upperCase, (Object) "CN");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((RegionResult) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull RegionResult regionResult) {
                    Intrinsics.checkNotNullParameter(regionResult, LanguageConstKt.f15954it);
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("signInAnonymously success: ", regionResult.getRegionList()));
                    if (!regionResult.getRegionList().isEmpty()) {
                        regionResult.getRegionList().removeIf(C7269a.f13896a);
                    }
                    accountViewModel.getRegionByLangLiveData().postValue(regionResult.getRegionList());
                }
            };
            final AccountViewModel accountViewModel2 = this.this$0;
            languageService.getRegionByLang(str, str2, r2, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("signInAnonymously failure: ", th));
                    accountViewModel2.getRegionByLangLiveData().postValue(null);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
