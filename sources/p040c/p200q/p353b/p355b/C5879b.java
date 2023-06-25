package p040c.p200q.p353b.p355b;

import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.b */
/* compiled from: AbstractIndexedListIterator */
public abstract class C5879b<E> extends C6005i3<E> {

    /* renamed from: e */
    public final int f11405e;

    /* renamed from: l */
    public int f11406l;

    public C5879b(int i) {
        this(i, 0);
    }

    /* renamed from: a */
    public abstract E mo29041a(int i);

    public final boolean hasNext() {
        return this.f11406l < this.f11405e;
    }

    public final boolean hasPrevious() {
        return this.f11406l > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f11406l;
            this.f11406l = i + 1;
            return mo29041a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f11406l;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f11406l - 1;
            this.f11406l = i;
            return mo29041a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f11406l - 1;
    }

    public C5879b(int i, int i2) {
        C5850m.m16597r(i2, i);
        this.f11405e = i;
        this.f11406l = i2;
    }
}
