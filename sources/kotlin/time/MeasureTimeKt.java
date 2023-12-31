package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\f\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0002\u000b\n\u0005\b20\u0001\n\u0002\b\u0019¨\u0006\r"}, mo47991d2 = {"measureTime", "Lkotlin/time/Duration;", "block", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)J", "measureTimedValue", "Lkotlin/time/TimedValue;", "T", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource$Monotonic;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)J", "kotlin-stdlib"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: measureTime.kt */
public final class MeasureTimeKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final long measureTime(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        long r0 = TimeSource.Monotonic.INSTANCE.m28751markNowz9LOYto();
        function0.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m28754elapsedNowUwyO8pc(r0);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    @ExperimentalTime
    public static final <T> TimedValue<T> measureTimedValue(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        return new TimedValue<>(function0.invoke(), TimeSource.Monotonic.ValueTimeMark.m28754elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m28751markNowz9LOYto()), (DefaultConstructorMarker) null);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final long measureTime(@NotNull TimeSource timeSource, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        Intrinsics.checkNotNullParameter(function0, "block");
        TimeMark markNow = timeSource.markNow();
        function0.invoke();
        return markNow.m28746elapsedNowUwyO8pc();
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    @ExperimentalTime
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource timeSource, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        Intrinsics.checkNotNullParameter(function0, "block");
        return new TimedValue<>(function0.invoke(), timeSource.markNow().m28746elapsedNowUwyO8pc(), (DefaultConstructorMarker) null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalTime
    public static final long measureTime(@NotNull TimeSource.Monotonic monotonic, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(monotonic, "<this>");
        Intrinsics.checkNotNullParameter(function0, "block");
        long r0 = monotonic.m28751markNowz9LOYto();
        function0.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m28754elapsedNowUwyO8pc(r0);
    }

    @SinceKotlin(version = "1.7")
    @NotNull
    @ExperimentalTime
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource.Monotonic monotonic, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(monotonic, "<this>");
        Intrinsics.checkNotNullParameter(function0, "block");
        return new TimedValue<>(function0.invoke(), TimeSource.Monotonic.ValueTimeMark.m28754elapsedNowUwyO8pc(monotonic.m28751markNowz9LOYto()), (DefaultConstructorMarker) null);
    }
}
