package com.hisense.connect_life.app_account.viewmodel;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.networks.request.config.IConfigService;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
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
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.viewmodel.ConfigViewModel$getMac$1", mo48701f = "ConfigViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: ConfigViewModel.kt */
public final class ConfigViewModel$getMac$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ConfigParsCom $cmd;
    public int label;
    public final /* synthetic */ ConfigViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigViewModel$getMac$1(ConfigParsCom configParsCom, ConfigViewModel configViewModel, Continuation<? super ConfigViewModel$getMac$1> continuation) {
        super(2, continuation);
        this.$cmd = configParsCom;
        this.this$0 = configViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ConfigViewModel$getMac$1(this.$cmd, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ConfigViewModel$getMac$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IConfigService configService = HiSmart.Companion.getInstance().configService();
            ConfigParsCom configParsCom = this.$cmd;
            final ConfigViewModel configViewModel = this.this$0;
            configService.getMac(configParsCom, new Function1<HiSmartCallback<ConfigParsCom>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((HiSmartCallback<ConfigParsCom>) (HiSmartCallback) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull HiSmartCallback<ConfigParsCom> hiSmartCallback) {
                    Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$getMac");
                    final ConfigViewModel configViewModel = configViewModel;
                    hiSmartCallback.success(new Function1<ConfigParsCom, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((ConfigParsCom) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull ConfigParsCom configParsCom) {
                            Intrinsics.checkNotNullParameter(configParsCom, LanguageConstKt.f15954it);
                            configViewModel.writeLogToFile("获取到mac地址成功");
                            configViewModel.getMacLiveData().postValue(configParsCom);
                        }
                    });
                    final ConfigViewModel configViewModel2 = configViewModel;
                    hiSmartCallback.failure(new Function1<FailureBean, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FailureBean) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FailureBean failureBean) {
                            Intrinsics.checkNotNullParameter(failureBean, LanguageConstKt.f15954it);
                            configViewModel2.writeLogToFile(Intrinsics.stringPlus("获取mac地址失败：", failureBean.getErrorDesc()));
                            configViewModel2.getMacLiveData().postValue(null);
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
