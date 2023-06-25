package com.internationalwinecooler.p529ui;

import com.hisense.connect_life.core.utils.LoggerUtil;
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
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getChartData$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getChartData$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getChartData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $auid;
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getChartData$1(String str, String str2, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getChartData$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.$auid = str2;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getChartData$1(this.$model, this.$auid, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getChartData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                JSONObject jSONObject = new JSONObject(this.$model);
                JSONObject jSONObject2 = new JSONObject(this.$auid);
                int i = jSONObject.getInt("type");
                String string = jSONObject.getString("startDate");
                String string2 = jSONObject.getString("endDate");
                String string3 = jSONObject.getString("zone");
                String string4 = jSONObject2.getString("deviceId");
                if (i == 1) {
                    WineWebViewModel wineWebViewModel = this.this$0;
                    Intrinsics.checkNotNullExpressionValue(string4, "auidParam");
                    Intrinsics.checkNotNullExpressionValue(string, "startDate");
                    Intrinsics.checkNotNullExpressionValue(string2, "endDate");
                    Intrinsics.checkNotNullExpressionValue(string3, "zone");
                    wineWebViewModel.getStatisticWeek(string4, string, string2, string3);
                } else if (i == 2) {
                    WineWebViewModel wineWebViewModel2 = this.this$0;
                    Intrinsics.checkNotNullExpressionValue(string4, "auidParam");
                    Intrinsics.checkNotNullExpressionValue(string, "startDate");
                    Intrinsics.checkNotNullExpressionValue(string2, "endDate");
                    Intrinsics.checkNotNullExpressionValue(string3, "zone");
                    wineWebViewModel2.getStatisticMonth(string4, string, string2, string3);
                } else if (i == 3) {
                    WineWebViewModel wineWebViewModel3 = this.this$0;
                    Intrinsics.checkNotNullExpressionValue(string4, "auidParam");
                    Intrinsics.checkNotNullExpressionValue(string, "startDate");
                    Intrinsics.checkNotNullExpressionValue(string2, "endDate");
                    Intrinsics.checkNotNullExpressionValue(string3, "zone");
                    wineWebViewModel3.getStatisticYear(string4, string, string2, string3);
                } else if (i == 4) {
                    WineWebViewModel wineWebViewModel4 = this.this$0;
                    Intrinsics.checkNotNullExpressionValue(string4, "auidParam");
                    Intrinsics.checkNotNullExpressionValue(string, "startDate");
                    Intrinsics.checkNotNullExpressionValue(string2, "endDate");
                    Intrinsics.checkNotNullExpressionValue(string3, "zone");
                    wineWebViewModel4.getStatisticHour(string4, string, string2, string3);
                }
            } catch (Exception e) {
                e.printStackTrace();
                LoggerUtil.Companion.mo39146e("getCharData - error");
                WineWebViewModel wineWebViewModel5 = this.this$0;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                wineWebViewModel5.executeFailCallback(message, WebActionEnum.GET_CHART_DATA_CALLBACK);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
