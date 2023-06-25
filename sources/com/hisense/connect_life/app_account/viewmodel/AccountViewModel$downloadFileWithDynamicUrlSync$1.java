package com.hisense.connect_life.app_account.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.FileUtils;
import com.hisense.connect_life.hismart.core.HiSmart;
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
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.AccountViewModel$downloadFileWithDynamicUrlSync$1", mo48701f = "AccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$downloadFileWithDynamicUrlSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ String $fileUrl;
    public int label;
    public final /* synthetic */ AccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$downloadFileWithDynamicUrlSync$1(String str, AccountViewModel accountViewModel, String str2, Continuation<? super AccountViewModel$downloadFileWithDynamicUrlSync$1> continuation) {
        super(2, continuation);
        this.$fileUrl = str;
        this.this$0 = accountViewModel;
        this.$fileName = str2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AccountViewModel$downloadFileWithDynamicUrlSync$1(this.$fileUrl, this.this$0, this.$fileName, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AccountViewModel$downloadFileWithDynamicUrlSync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            String str = this.$fileUrl;
            final AccountViewModel accountViewModel = this.this$0;
            final String str2 = this.$fileName;
            C84911 r1 = new Function1<ResponseBody, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ResponseBody) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ResponseBody responseBody) {
                    Intrinsics.checkNotNullParameter(responseBody, LanguageConstKt.f15954it);
                    accountViewModel.getDownloadFileLiveData().postValue(Boolean.TRUE);
                    FileUtils.Companion.writeFileToSDCard(str2, responseBody);
                }
            };
            final AccountViewModel accountViewModel2 = this.this$0;
            accountService.downloadFileWithDynamicUrlSync(str, r1, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                    accountViewModel2.getDownloadFileLiveData().postValue(Boolean.FALSE);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
