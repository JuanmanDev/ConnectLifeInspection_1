package p630io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.p602s.p614i.C9315c;

/* renamed from: io.reactivex.internal.util.AtomicThrowable */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    public static final long serialVersionUID = 3949248817947090603L;

    public boolean addThrowable(Throwable th) {
        return C9315c.m25138a(this, th);
    }

    public boolean isTerminated() {
        return get() == C9315c.f18266a;
    }

    public Throwable terminate() {
        return C9315c.m25139b(this);
    }
}
