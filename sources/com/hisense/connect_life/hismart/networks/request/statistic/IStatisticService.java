package com.hisense.connect_life.hismart.networks.request.statistic;

import com.hisense.connect_life.hismart.networks.request.statistic.model.DailyStatistic;
import com.hisense.connect_life.hismart.networks.request.statistic.model.HourlyStatistic;
import com.hisense.connect_life.hismart.networks.request.statistic.model.MonthlyStatistic;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J^\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH&J^\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH&J^\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH&¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/statistic/IStatisticService;", "", "statisticHourly", "Lio/reactivex/disposables/Disposable;", "wifiId", "", "deviceId", "startMonth", "endMonth", "zone", "success", "Lkotlin/Function1;", "", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/HourlyStatistic;", "", "failure", "", "statisticMonthly", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/MonthlyStatistic;", "statisticsDaily", "startDay", "endDay", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/DailyStatistic;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IStatisticService.kt */
public interface IStatisticService {
    @NotNull
    C9207b statisticHourly(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super List<? extends HourlyStatistic>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b statisticMonthly(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super List<MonthlyStatistic>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b statisticsDaily(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super List<? extends DailyStatistic>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
