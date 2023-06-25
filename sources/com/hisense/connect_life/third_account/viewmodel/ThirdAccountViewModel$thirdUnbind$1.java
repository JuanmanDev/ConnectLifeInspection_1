package com.hisense.connect_life.third_account.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.model.JuResponse;
import com.hisense.connect_life.hismart.networks.request.account.IAccountService;
import kotlin.Metadata;
import kotlin.Pair;
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
@DebugMetadata(mo48700c = "com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel$thirdUnbind$1", mo48701f = "ThirdAccountViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: ThirdAccountViewModel.kt */
public final class ThirdAccountViewModel$thirdUnbind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $thirdType;
    public final /* synthetic */ String $token;
    public int label;
    public final /* synthetic */ ThirdAccountViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdAccountViewModel$thirdUnbind$1(String str, String str2, ThirdAccountViewModel thirdAccountViewModel, Continuation<? super ThirdAccountViewModel$thirdUnbind$1> continuation) {
        super(2, continuation);
        this.$thirdType = str;
        this.$token = str2;
        this.this$0 = thirdAccountViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ThirdAccountViewModel$thirdUnbind$1(this.$thirdType, this.$token, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ThirdAccountViewModel$thirdUnbind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IAccountService accountService = HiSmart.Companion.getInstance().accountService();
            String str = this.$thirdType;
            String str2 = this.$token;
            final ThirdAccountViewModel thirdAccountViewModel = this.this$0;
            accountService.thirdUnBind(str, str2, new Function1<HiSmartCallback<JuResponse>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<JuResponse>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<JuResponse> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$thirdUnBind");
                    final ThirdAccountViewModel thirdAccountViewModel = thirdAccountViewModel;
                    hiSmartCallback.success(new Function1<JuResponse, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((JuResponse) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull JuResponse juResponse) {
                            Intrinsics.checkNotNullParameter(juResponse, LanguageConstKt.f15954it);
                            boolean z = false;
                            thirdAccountViewModel.updateLoadingStatus(false);
                            MutableLiveData<Pair<Boolean, Integer>> thirdUnbindLiveData = thirdAccountViewModel.getThirdUnbindLiveData();
                            if (juResponse.getResultCode() == 0) {
                                z = true;
                            }
                            thirdUnbindLiveData.postValue(new Pair(Boolean.valueOf(z), Integer.valueOf(juResponse.getErrorCode())));
                        }
                    });
                    final ThirdAccountViewModel thirdAccountViewModel2 = thirdAccountViewModel;
                    hiSmartCallback.failure(new Function1<FailureBean, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FailureBean) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FailureBean failureBean) {
                            Intrinsics.checkNotNullParameter(failureBean, LanguageConstKt.f15954it);
                            thirdAccountViewModel2.updateLoadingStatus(false);
                            thirdAccountViewModel2.getThirdUnbindLiveData().postValue(new Pair(Boolean.FALSE, -1));
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
