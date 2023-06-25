package com.hisense.juconnect.app_device.activity;

import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.juconnect.connectlife.ConnectLife;
import com.juconnect.connectlife.model.ConlManual;
import com.juconnect.connectlife.service.IConnectLifeService;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
@DebugMetadata(mo48700c = "com.hisense.juconnect.app_device.activity.ConnectLifeViewModel$queryWineCoolerManual$1", mo48701f = "ConnectLifeViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: ConnectLifeViewModel.kt */
public final class ConnectLifeViewModel$queryWineCoolerManual$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $auid;
    public final /* synthetic */ String $lang;
    public int label;
    public final /* synthetic */ ConnectLifeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectLifeViewModel$queryWineCoolerManual$1(String str, String str2, ConnectLifeViewModel connectLifeViewModel, Continuation<? super ConnectLifeViewModel$queryWineCoolerManual$1> continuation) {
        super(2, continuation);
        this.$auid = str;
        this.$lang = str2;
        this.this$0 = connectLifeViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ConnectLifeViewModel$queryWineCoolerManual$1(this.$auid, this.$lang, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ConnectLifeViewModel$queryWineCoolerManual$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IConnectLifeService connectLifeService = ConnectLife.Companion.connectLifeService();
            String accessToken = AppConfig.Companion.getAccessToken();
            String str = this.$auid;
            String str2 = this.$lang;
            final ConnectLifeViewModel connectLifeViewModel = this.this$0;
            C85911 r4 = new Function1<List<? extends ConlManual>, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<ConlManual>) (List) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull List<ConlManual> list) {
                    Intrinsics.checkNotNullParameter(list, "list");
                    if (list.isEmpty()) {
                        connectLifeViewModel.getManualLiveData().postValue(null);
                        connectLifeViewModel.getManualLiveDatas().postValue(null);
                        return;
                    }
                    connectLifeViewModel.getManualLiveData().postValue(CollectionsKt___CollectionsKt.first(list));
                    connectLifeViewModel.getManualLiveDatas().postValue(list);
                }
            };
            final ConnectLifeViewModel connectLifeViewModel2 = this.this$0;
            connectLifeService.queryManual(accessToken, str, str2, r4, new Function1<Throwable, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Throwable th) {
                    LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("queryConlManual fail ", th));
                    connectLifeViewModel2.getManualLiveData().postValue(null);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
