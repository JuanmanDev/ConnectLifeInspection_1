package com.hisense.connect_life.core.utils;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/DateUtil;", "", "()V", "timesMonthmorning", "", "getTimesMonthmorning", "()J", "timesMonthnight", "getTimesMonthnight", "timesWeekmorning", "getTimesWeekmorning", "timesWeeknight", "getTimesWeeknight", "timesmorning", "getTimesmorning", "timesnight", "getTimesnight", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DateUtil.kt */
public final class DateUtil {
    @NotNull
    public static final DateUtil INSTANCE = new DateUtil();

    public final long getTimesMonthmorning() {
        Calendar instance = Calendar.getInstance();
        instance.set(instance.get(1), instance.get(2), instance.get(5), 0, 0, 0);
        instance.set(5, instance.getActualMinimum(5));
        return instance.getTime().getTime();
    }

    public final long getTimesMonthnight() {
        Calendar instance = Calendar.getInstance();
        instance.set(instance.get(1), instance.get(2), instance.get(5), 0, 0, 0);
        instance.set(5, instance.getActualMaximum(5));
        instance.set(11, 24);
        return instance.getTime().getTime();
    }

    public final long getTimesWeekmorning() {
        Calendar instance = Calendar.getInstance();
        instance.add(7, -1);
        instance.set(7, 2);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        return instance.getTime().getTime();
    }

    public final long getTimesWeeknight() {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(getTimesWeekmorning()));
        instance.add(7, 7);
        return instance.getTime().getTime();
    }

    public final long getTimesmorning() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(14, 0);
        return instance.getTime().getTime();
    }

    public final long getTimesnight() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 24);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(14, 0);
        return instance.getTime().getTime();
    }
}
