package com.hisense.connect_life.hismart.networks.request.statistic;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.request.statistic.model.DailyStatistic;
import com.hisense.connect_life.hismart.networks.request.statistic.model.HourlyStatistic;
import com.hisense.connect_life.hismart.networks.request.statistic.model.MonthlyStatistic;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import com.hisense.connect_life.hismart.utils.LoggerUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p429r.p430a.p439c.p440a.p441a.p450i.C7408a;
import p040c.p429r.p430a.p439c.p440a.p441a.p450i.C7409b;
import p040c.p429r.p430a.p439c.p440a.p441a.p450i.C7410c;
import p040c.p429r.p430a.p439c.p440a.p441a.p450i.C7411d;
import p040c.p429r.p430a.p439c.p440a.p441a.p450i.C7412e;
import p040c.p429r.p430a.p439c.p440a.p441a.p450i.C7413f;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J^\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u000fH\u0016J^\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0010\u0012\u0004\u0012\u00020\u00120\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u000fH\u0016J^\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0010\u0012\u0004\u0012\u00020\u00120\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u000fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/statistic/StatisticServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/statistic/IStatisticService;", "()V", "statisticApi", "Lcom/hisense/connect_life/hismart/networks/request/statistic/StatisticApi;", "kotlin.jvm.PlatformType", "statisticHourly", "Lio/reactivex/disposables/Disposable;", "wifiId", "", "deviceId", "startMonth", "endMonth", "zone", "success", "Lkotlin/Function1;", "", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/HourlyStatistic;", "", "failure", "", "statisticMonthly", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/MonthlyStatistic;", "statisticsDaily", "startDay", "endDay", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/DailyStatistic;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: StatisticServiceImpl.kt */
public final class StatisticServiceImpl implements IStatisticService {
    public final StatisticApi statisticApi = ((StatisticApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.STATISTIC)).mo51323b(StatisticApi.class));

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: statisticHourly$lambda-4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m27046statisticHourly$lambda4(kotlin.jvm.functions.Function1 r4, com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResult r5) {
        /*
            java.lang.String r0 = "$success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.hisense.connect_life.hismart.utils.LoggerUtil$Companion r0 = com.hisense.connect_life.hismart.utils.LoggerUtil.Companion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "statisticsHourly result code: "
            r1.append(r2)
            java.lang.Object r2 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse r2 = (com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse) r2
            r3 = 0
            if (r2 != 0) goto L_0x001c
            r2 = r3
            goto L_0x0024
        L_0x001c:
            int r2 = r2.getResultCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0024:
            r1.append(r2)
            java.lang.String r2 = ", data: "
            r1.append(r2)
            java.lang.Object r2 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse r2 = (com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse) r2
            if (r2 != 0) goto L_0x0036
            r2 = r3
            goto L_0x003c
        L_0x0036:
            java.lang.Object r2 = r2.getDataList()
            java.util.List r2 = (java.util.List) r2
        L_0x003c:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo41769e(r1)
            if (r5 != 0) goto L_0x0050
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r4.invoke(r5)
            goto L_0x0069
        L_0x0050:
            java.lang.Object r5 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse r5 = (com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse) r5
            if (r5 != 0) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            java.lang.Object r5 = r5.getDataList()
            r3 = r5
            java.util.List r3 = (java.util.List) r3
        L_0x0060:
            if (r3 != 0) goto L_0x0066
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x0066:
            r4.invoke(r3)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.statistic.StatisticServiceImpl.m27046statisticHourly$lambda4(kotlin.jvm.functions.Function1, com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResult):void");
    }

    /* renamed from: statisticHourly$lambda-5  reason: not valid java name */
    public static final void m27047statisticHourly$lambda5(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("statisticsMonthly result fail: ", th));
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: statisticMonthly$lambda-2  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m27048statisticMonthly$lambda2(kotlin.jvm.functions.Function1 r4, com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResult r5) {
        /*
            java.lang.String r0 = "$success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.hisense.connect_life.hismart.utils.LoggerUtil$Companion r0 = com.hisense.connect_life.hismart.utils.LoggerUtil.Companion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "statisticsMonthly result code: "
            r1.append(r2)
            java.lang.Object r2 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse r2 = (com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse) r2
            r3 = 0
            if (r2 != 0) goto L_0x001c
            r2 = r3
            goto L_0x0024
        L_0x001c:
            int r2 = r2.getResultCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0024:
            r1.append(r2)
            java.lang.String r2 = ", data: "
            r1.append(r2)
            java.lang.Object r2 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse r2 = (com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse) r2
            if (r2 != 0) goto L_0x0036
            r2 = r3
            goto L_0x003c
        L_0x0036:
            java.lang.Object r2 = r2.getDataList()
            java.util.List r2 = (java.util.List) r2
        L_0x003c:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo41769e(r1)
            if (r5 != 0) goto L_0x0050
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r4.invoke(r5)
            goto L_0x0069
        L_0x0050:
            java.lang.Object r5 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse r5 = (com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse) r5
            if (r5 != 0) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            java.lang.Object r5 = r5.getDataList()
            r3 = r5
            java.util.List r3 = (java.util.List) r3
        L_0x0060:
            if (r3 != 0) goto L_0x0066
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x0066:
            r4.invoke(r3)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.statistic.StatisticServiceImpl.m27048statisticMonthly$lambda2(kotlin.jvm.functions.Function1, com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResult):void");
    }

    /* renamed from: statisticMonthly$lambda-3  reason: not valid java name */
    public static final void m27049statisticMonthly$lambda3(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("statisticsMonthly result fail: ", th));
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: statisticsDaily$lambda-0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m27050statisticsDaily$lambda0(kotlin.jvm.functions.Function1 r4, com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResult r5) {
        /*
            java.lang.String r0 = "$success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.hisense.connect_life.hismart.utils.LoggerUtil$Companion r0 = com.hisense.connect_life.hismart.utils.LoggerUtil.Companion
            java.lang.Object r1 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse r1 = (com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse) r1
            r2 = 0
            if (r1 != 0) goto L_0x0012
            r1 = r2
            goto L_0x0018
        L_0x0012:
            java.lang.Object r1 = r1.getDataList()
            java.util.List r1 = (java.util.List) r1
        L_0x0018:
            java.lang.String r3 = "statisticsDaily result: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r1)
            r0.mo41769e(r1)
            if (r5 != 0) goto L_0x002b
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r4.invoke(r5)
            goto L_0x0044
        L_0x002b:
            java.lang.Object r5 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse r5 = (com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse) r5
            if (r5 != 0) goto L_0x0034
            goto L_0x003b
        L_0x0034:
            java.lang.Object r5 = r5.getDataList()
            r2 = r5
            java.util.List r2 = (java.util.List) r2
        L_0x003b:
            if (r2 != 0) goto L_0x0041
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x0041:
            r4.invoke(r2)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.request.statistic.StatisticServiceImpl.m27050statisticsDaily$lambda0(kotlin.jvm.functions.Function1, com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResult):void");
    }

    /* renamed from: statisticsDaily$lambda-1  reason: not valid java name */
    public static final void m27051statisticsDaily$lambda1(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("statisticsDaily result fail: ", th));
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    @NotNull
    public C9207b statisticHourly(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super List<? extends HourlyStatistic>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "startMonth");
        Intrinsics.checkNotNullParameter(str4, "endMonth");
        Intrinsics.checkNotNullParameter(str5, "zone");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.statisticApi.statisticsHourly(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str), TuplesKt.m25743to("deviceId", str2), TuplesKt.m25743to("startHour", str3), TuplesKt.m25743to("endHour", str4), TuplesKt.m25743to("zone", str5)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7410c(function1), new C7413f(function12));
        Intrinsics.checkNotNullExpressionValue(s, "statisticApi.statisticsH…)\n\t\t\t\t\tfailure(it)\n\t\t\t\t})");
        return s;
    }

    @NotNull
    public C9207b statisticMonthly(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super List<MonthlyStatistic>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "startMonth");
        Intrinsics.checkNotNullParameter(str4, "endMonth");
        Intrinsics.checkNotNullParameter(str5, "zone");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.statisticApi.statisticMonthly(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str), TuplesKt.m25743to("deviceId", str2), TuplesKt.m25743to("startMonth", str3), TuplesKt.m25743to("endMonth", str4), TuplesKt.m25743to("zone", str5)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7409b(function1), new C7412e(function12));
        Intrinsics.checkNotNullExpressionValue(s, "statisticApi.statisticMo…t\")\n\t\t\t\tfailure(it)\n\t\t\t})");
        return s;
    }

    @NotNull
    public C9207b statisticsDaily(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super List<? extends DailyStatistic>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.WIFIID);
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(str3, "startDay");
        Intrinsics.checkNotNullParameter(str4, "endDay");
        Intrinsics.checkNotNullParameter(str5, "zone");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.statisticApi.statisticsDaily(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.mapOf(TuplesKt.m25743to(EventBusConstKt.WIFIID, str), TuplesKt.m25743to("deviceId", str2), TuplesKt.m25743to("startDay", str3), TuplesKt.m25743to("endDay", str4), TuplesKt.m25743to("zone", str5)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7408a(function1), new C7411d(function12));
        Intrinsics.checkNotNullExpressionValue(s, "statisticApi.statisticsD…t\")\n\t\t\t\tfailure(it)\n\t\t\t})");
        return s;
    }
}
