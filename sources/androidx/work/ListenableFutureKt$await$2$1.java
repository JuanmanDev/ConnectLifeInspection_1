package androidx.work;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, mo47991d2 = {"<anonymous>", "", "R"}, mo47992k = 3, mo47993mv = {1, 5, 1}, mo47995xi = 48)
/* compiled from: ListenableFuture.kt */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    public final /* synthetic */ CancellableContinuation<R> $cancellableContinuation;
    public final /* synthetic */ C6316e<R> $this_await;

    public ListenableFutureKt$await$2$1(CancellableContinuation<? super R> cancellableContinuation, C6316e<R> eVar) {
        this.$cancellableContinuation = cancellableContinuation;
        this.$this_await = eVar;
    }

    public final void run() {
        try {
            CancellableContinuation<R> cancellableContinuation = this.$cancellableContinuation;
            R r = this.$this_await.get();
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m27299constructorimpl(r));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.cancel(cause);
                return;
            }
            CancellableContinuation<R> cancellableContinuation2 = this.$cancellableContinuation;
            Result.Companion companion2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m27299constructorimpl(ResultKt.createFailure(cause)));
        }
    }
}
