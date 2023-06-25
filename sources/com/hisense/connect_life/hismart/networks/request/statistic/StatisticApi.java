package com.hisense.connect_life.hismart.networks.request.statistic;

import com.hisense.connect_life.hismart.networks.request.statistic.model.DailyStatistic;
import com.hisense.connect_life.hismart.networks.request.statistic.model.HourlyStatistic;
import com.hisense.connect_life.hismart.networks.request.statistic.model.MonthlyStatistic;
import com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResponse;
import com.hisense.connect_life.hismart.networks.request.statistic.model.StatisticResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9950f;
import p692o.p698x.C9954j;
import p692o.p698x.C9964t;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00040\u00032\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH'J6\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00050\u00040\u00032\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH'J6\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00050\u00040\u00032\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH'¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/statistic/StatisticApi;", "", "statisticMonthly", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/StatisticResult;", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/StatisticResponse;", "", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/MonthlyStatistic;", "params", "", "", "statisticsDaily", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/DailyStatistic;", "statisticsHourly", "Lcom/hisense/connect_life/hismart/networks/request/statistic/model/HourlyStatistic;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: StatisticApi.kt */
public interface StatisticApi {
    @NotNull
    @C9950f("data-statistics/monthly")
    C9185c<StatisticResult<StatisticResponse<List<MonthlyStatistic>>>> statisticMonthly(@NotNull @C9964t Map<String, String> map);

    @C9950f("data-statistics/daily")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<StatisticResult<StatisticResponse<List<DailyStatistic>>>> statisticsDaily(@NotNull @C9964t Map<String, String> map);

    @C9950f("data-statistics/hourly")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<StatisticResult<StatisticResponse<List<HourlyStatistic>>>> statisticsHourly(@NotNull @C9964t Map<String, String> map);
}
