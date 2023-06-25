package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p201a.p264c.p347m.C5755b;
import p040c.p200q.p201a.p264c.p347m.C5773k;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, mo47991d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Tasks.kt */
public final class TasksKt$asTask$1 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ C5755b $cancellation;
    public final /* synthetic */ C5773k<T> $source;
    public final /* synthetic */ Deferred<T> $this_asTask;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TasksKt$asTask$1(C5755b bVar, Deferred<? extends T> deferred, C5773k<T> kVar) {
        super(1);
        this.$cancellation = bVar;
        this.$this_asTask = deferred;
        this.$source = kVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        if (th instanceof CancellationException) {
            this.$cancellation.mo28829a();
            return;
        }
        Throwable completionExceptionOrNull = this.$this_asTask.getCompletionExceptionOrNull();
        if (completionExceptionOrNull == null) {
            this.$source.mo28861c(this.$this_asTask.getCompleted());
            return;
        }
        C5773k<T> kVar = this.$source;
        Exception exc = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
        if (exc == null) {
            exc = new RuntimeExecutionException(completionExceptionOrNull);
        }
        kVar.mo28860b(exc);
    }
}
