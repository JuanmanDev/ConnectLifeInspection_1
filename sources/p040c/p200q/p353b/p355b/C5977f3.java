package p040c.p200q.p353b.p355b;

import java.util.Iterator;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.f3 */
/* compiled from: TransformedIterator */
public abstract class C5977f3<F, T> implements Iterator<T> {

    /* renamed from: e */
    public final Iterator<? extends F> f11537e;

    public C5977f3(Iterator<? extends F> it) {
        C5850m.m16594o(it);
        this.f11537e = it;
    }

    /* renamed from: a */
    public abstract T mo29448a(F f);

    public final boolean hasNext() {
        return this.f11537e.hasNext();
    }

    public final T next() {
        return mo29448a(this.f11537e.next());
    }

    public final void remove() {
        this.f11537e.remove();
    }
}
