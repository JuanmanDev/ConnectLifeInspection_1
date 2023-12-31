package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J6\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00070\nH\u0001¢\u0006\u0002\u0010\fJ(\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0003¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0001J\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0003R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo47991d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "Lkotlin/coroutines/CoroutineContext;", "e", "", "originalContext", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "kotlinx-coroutines-core"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SafeCollector.kt */
public final class DownstreamExceptionContext implements CoroutineContext {
    public final /* synthetic */ CoroutineContext $$delegate_0;
    @NotNull
    @JvmField

    /* renamed from: e */
    public final Throwable f18819e;

    public DownstreamExceptionContext(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        this.f18819e = th;
        this.$$delegate_0 = coroutineContext;
    }

    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return this.$$delegate_0.fold(r, function2);
    }

    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return this.$$delegate_0.get(key);
    }

    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return this.$$delegate_0.minusKey(key);
    }

    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return this.$$delegate_0.plus(coroutineContext);
    }
}
