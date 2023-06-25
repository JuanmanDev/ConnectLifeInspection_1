package kotlinx.coroutines.tasks;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p040c.p200q.p201a.p264c.p347m.C5761e;
import p040c.p200q.p201a.p264c.p347m.C5771j;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, mo47991d2 = {"<anonymous>", "", "T", "it", "Lcom/google/android/gms/tasks/Task;", "kotlin.jvm.PlatformType", "onComplete"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Tasks.kt */
public final class TasksKt$awaitImpl$2$1<TResult> implements C5761e {
    public final /* synthetic */ CancellableContinuation<T> $cont;

    public TasksKt$awaitImpl$2$1(CancellableContinuation<? super T> cancellableContinuation) {
        this.$cont = cancellableContinuation;
    }

    public final void onComplete(@NotNull C5771j<T> jVar) {
        Exception l = jVar.mo28851l();
        if (l != null) {
            CancellableContinuation<T> cancellableContinuation = this.$cont;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m27299constructorimpl(ResultKt.createFailure(l)));
        } else if (jVar.mo28854o()) {
            CancellableContinuation.DefaultImpls.cancel$default(this.$cont, (Throwable) null, 1, (Object) null);
        } else {
            CancellableContinuation<T> cancellableContinuation2 = this.$cont;
            Result.Companion companion2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m27299constructorimpl(jVar.mo28852m()));
        }
    }
}
