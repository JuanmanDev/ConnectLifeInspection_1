package androidx.work;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, mo47991d2 = {"<anonymous>", "", "R", "it", ""}, mo47992k = 3, mo47993mv = {1, 5, 1}, mo47995xi = 48)
/* compiled from: ListenableFuture.kt */
public final class ListenableFutureKt$await$2$2 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ C6316e<R> $this_await;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(C6316e<R> eVar) {
        super(1);
        this.$this_await = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Throwable th) {
        this.$this_await.cancel(false);
    }
}
