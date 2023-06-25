package p040c.p200q.p353b.p355b;

import java.util.ListIterator;

/* renamed from: c.q.b.b.g3 */
/* compiled from: TransformedListIterator */
public abstract class C5982g3<F, T> extends C5977f3<F, T> implements ListIterator<T> {
    public C5982g3(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final ListIterator<? extends F> mo29465b() {
        return C6028l1.m16931c(this.f11537e);
    }

    public final boolean hasPrevious() {
        return mo29465b().hasPrevious();
    }

    public final int nextIndex() {
        return mo29465b().nextIndex();
    }

    public final T previous() {
        return mo29448a(mo29465b().previous());
    }

    public final int previousIndex() {
        return mo29465b().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
