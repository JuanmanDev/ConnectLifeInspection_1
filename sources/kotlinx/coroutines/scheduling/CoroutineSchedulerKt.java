package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0005"}, mo47991d2 = {"isSchedulerWorker", "", "thread", "Ljava/lang/Thread;", "mayNotBlock", "kotlinx-coroutines-core"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CoroutineScheduler.kt */
public final class CoroutineSchedulerKt {
    @JvmName(name = "isSchedulerWorker")
    public static final boolean isSchedulerWorker(@NotNull Thread thread) {
        return thread instanceof CoroutineScheduler.Worker;
    }

    @JvmName(name = "mayNotBlock")
    public static final boolean mayNotBlock(@NotNull Thread thread) {
        return (thread instanceof CoroutineScheduler.Worker) && ((CoroutineScheduler.Worker) thread).state == CoroutineScheduler.WorkerState.CPU_ACQUIRED;
    }
}
