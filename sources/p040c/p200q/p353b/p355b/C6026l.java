package p040c.p200q.p353b.p355b;

import java.util.NoSuchElementException;

/* renamed from: c.q.b.b.l */
/* compiled from: AbstractSequentialIterator */
public abstract class C6026l<T> extends C5991h3<T> {

    /* renamed from: e */
    public T f11598e;

    public C6026l(T t) {
        this.f11598e = t;
    }

    /* renamed from: a */
    public abstract T mo29442a(T t);

    public final boolean hasNext() {
        return this.f11598e != null;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.f11598e;
            } finally {
                this.f11598e = mo29442a(this.f11598e);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
