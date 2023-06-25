package p630io.reactivex.internal.operators.maybe;

import p553f.p594c.C9189g;
import p553f.p594c.p601r.C9218f;
import p553f.p594c.p602s.p607e.p609b.C9276a;
import p648m.p683f.C9801a;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeToPublisher */
public enum MaybeToPublisher implements C9218f<C9189g<Object>, C9801a<Object>> {
    INSTANCE;

    public static <T> C9218f<C9189g<T>, C9801a<T>> instance() {
        return INSTANCE;
    }

    public C9801a<Object> apply(C9189g<Object> gVar) {
        return new C9276a(gVar);
    }
}
