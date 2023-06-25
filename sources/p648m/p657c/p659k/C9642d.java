package p648m.p657c.p659k;

import java.util.Iterator;
import p648m.p657c.C9625g;

/* renamed from: m.c.k.d */
/* compiled from: SelfDescribingValueIterator */
public class C9642d<T> implements Iterator<C9625g> {

    /* renamed from: e */
    public Iterator<T> f18873e;

    public C9642d(Iterator<T> it) {
        this.f18873e = it;
    }

    /* renamed from: a */
    public C9625g next() {
        return new C9641c(this.f18873e.next());
    }

    public boolean hasNext() {
        return this.f18873e.hasNext();
    }

    public void remove() {
        this.f18873e.remove();
    }
}
