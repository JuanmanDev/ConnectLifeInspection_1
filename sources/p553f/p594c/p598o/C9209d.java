package p553f.p594c.p598o;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.p602s.p604b.C9227b;

/* renamed from: f.c.o.d */
/* compiled from: ReferenceDisposable */
public abstract class C9209d<T> extends AtomicReference<T> implements C9207b {
    public static final long serialVersionUID = 6537757548749041217L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9209d(T t) {
        super(t);
        C9227b.m24985d(t, "value is null");
    }

    /* renamed from: a */
    public final boolean mo47032a() {
        return get() == null;
    }

    /* renamed from: b */
    public abstract void mo47033b(T t);

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            mo47033b(andSet);
        }
    }
}
