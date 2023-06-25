package com.internationalwinecooler.p529ui;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.connect_life.hismart.networks.request.statistic.IStatisticService;
import com.hisense.connect_life.hismart.networks.request.statistic.model.HourlyStatistic;
import com.hisense.juconnect.connectlife.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1527w;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getStatisticHour$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getStatisticHour$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getStatisticHour$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $auid;
    public final /* synthetic */ double $defaultValue;
    public final /* synthetic */ String $endDate;
    public final /* synthetic */ String $startDate;
    public final /* synthetic */ String $zone;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getStatisticHour$1(String str, WineWebViewModel wineWebViewModel, String str2, String str3, String str4, double d, Continuation<? super WineWebViewModel$getStatisticHour$1> continuation) {
        super(2, continuation);
        this.$auid = str;
        this.this$0 = wineWebViewModel;
        this.$startDate = str2;
        this.$endDate = str3;
        this.$zone = str4;
        this.$defaultValue = d;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getStatisticHour$1(this.$auid, this.this$0, this.$startDate, this.$endDate, this.$zone, this.$defaultValue, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getStatisticHour$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(this.$auid);
            if (device != null) {
                String deviceId = device.getDeviceId();
                String wifiId = device.getWifiId();
                this.this$0.getLoadingData().postValue(Boxing.boxBoolean(true));
                IStatisticService statisticService = HiSmart.Companion.getInstance().statisticService();
                String str = this.$startDate;
                String str2 = this.$endDate;
                String str3 = this.$zone;
                final WineWebViewModel wineWebViewModel = this.this$0;
                final double d = this.$defaultValue;
                C86681 r6 = new Function1<List<? extends HourlyStatistic>, Unit>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((List<? extends HourlyStatistic>) (List) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull List<? extends HourlyStatistic> list) {
                        String str;
                        String str2;
                        String str3;
                        List<? extends HourlyStatistic> list2 = list;
                        Intrinsics.checkNotNullParameter(list2, "dataList");
                        wineWebViewModel.getLoadingData().postValue(Boolean.FALSE);
                        JsonObject jsonObject = new JsonObject();
                        JsonObject jsonObject2 = new JsonObject();
                        JsonArray jsonArray = new JsonArray();
                        JsonArray jsonArray2 = new JsonArray();
                        JsonArray jsonArray3 = new JsonArray();
                        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getStatisticHour dataList ", list2));
                        if (list.isEmpty()) {
                            wineWebViewModel.executeFailCallback("", WebActionEnum.GET_CHART_DATA_CALLBACK);
                        } else {
                            double d = d;
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                HourlyStatistic hourlyStatistic = (HourlyStatistic) it.next();
                                Double humidity = hourlyStatistic.getHumidity();
                                double doubleValue = humidity == null ? d : humidity.doubleValue();
                                Double temp = hourlyStatistic.getTemp();
                                double doubleValue2 = temp == null ? d : temp.doubleValue();
                                Double vibration = hourlyStatistic.getVibration();
                                double doubleValue3 = vibration == null ? d : vibration.doubleValue();
                                String hour = hourlyStatistic.getHour();
                                if (hour == null) {
                                    hour = "";
                                }
                                JsonObject jsonObject3 = new JsonObject();
                                Iterator<T> it2 = it;
                                jsonObject3.addProperty("date", hour);
                                boolean z = true;
                                if (!(doubleValue == d)) {
                                    str = String.valueOf(doubleValue);
                                } else {
                                    str = "";
                                }
                                jsonObject3.addProperty("value", str);
                                jsonArray.add((JsonElement) jsonObject3);
                                JsonObject jsonObject4 = new JsonObject();
                                jsonObject4.addProperty("date", hour);
                                if (!(doubleValue2 == d)) {
                                    str2 = String.valueOf(doubleValue2);
                                } else {
                                    str2 = "";
                                }
                                jsonObject4.addProperty("value", str2);
                                jsonArray2.add((JsonElement) jsonObject4);
                                JsonObject jsonObject5 = new JsonObject();
                                jsonObject5.addProperty("date", hour);
                                if (doubleValue3 != d) {
                                    z = false;
                                }
                                if (!z) {
                                    str3 = String.valueOf(doubleValue3);
                                } else {
                                    str3 = "";
                                }
                                jsonObject5.addProperty("value", str3);
                                jsonArray3.add((JsonElement) jsonObject5);
                                it = it2;
                            }
                        }
                        jsonObject2.add("humidityData", jsonArray);
                        jsonObject2.add("temperatureData", jsonArray2);
                        jsonObject2.add("vibrationData", jsonArray3);
                        jsonObject.addProperty("resultCode", (Number) 0);
                        jsonObject.add("data", jsonObject2);
                        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getStatistic data: ", jsonObject2));
                        wineWebViewModel.getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.GET_CHART_DATA_CALLBACK, jsonObject.toString()));
                    }
                };
                final WineWebViewModel wineWebViewModel2 = this.this$0;
                statisticService.statisticHourly(wifiId, deviceId, str, str2, str3, r6, new Function1<Throwable, Unit>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
                        wineWebViewModel2.getLoadingData().postValue(Boolean.FALSE);
                        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("getStatistic fail: ", th.getMessage()));
                        WineWebViewModel wineWebViewModel = wineWebViewModel2;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        wineWebViewModel.executeFailCallback(message, WebActionEnum.GET_CHART_DATA_CALLBACK);
                    }
                });
            } else {
                this.this$0.getLoadingData().postValue(Boxing.boxBoolean(false));
                WineWebViewModel wineWebViewModel3 = this.this$0;
                String b = C1527w.m1063b(R.string.unit_exception);
                Intrinsics.checkNotNullExpressionValue(b, "getString(R.string.unit_exception)");
                wineWebViewModel3.executeFailCallback(b, WebActionEnum.GET_CHART_DATA_CALLBACK);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
