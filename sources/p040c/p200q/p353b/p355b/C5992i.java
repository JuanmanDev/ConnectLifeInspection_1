package p040c.p200q.p353b.p355b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;

/* renamed from: c.q.b.b.i */
/* compiled from: AbstractMultiset */
public abstract class C5992i<E> extends AbstractCollection<E> implements C6153t1<E> {
    public transient Set<E> elementSet;
    public transient Set<C6153t1.C6154a<E>> entrySet;

    /* renamed from: c.q.b.b.i$a */
    /* compiled from: AbstractMultiset */
    public class C5993a extends C6158u1.C6161c<E> {
        public C5993a() {
        }

        public Iterator<E> iterator() {
            return C5992i.this.elementIterator();
        }

        /* renamed from: k */
        public C6153t1<E> mo29521k() {
            return C5992i.this;
        }
    }

    /* renamed from: c.q.b.b.i$b */
    /* compiled from: AbstractMultiset */
    public class C5994b extends C6158u1.C6162d<E> {
        public C5994b() {
        }

        public Iterator<C6153t1.C6154a<E>> iterator() {
            return C5992i.this.entryIterator();
        }

        /* renamed from: k */
        public C6153t1<E> mo29499k() {
            return C5992i.this;
        }

        public int size() {
            return C5992i.this.distinctElements();
        }
    }

    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return C6158u1.m17259c(this, collection);
    }

    public abstract void clear();

    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public Set<E> createElementSet() {
        return new C5993a();
    }

    public Set<C6153t1.C6154a<E>> createEntrySet() {
        return new C5994b();
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set<E> createElementSet = createElementSet();
        this.elementSet = createElementSet;
        return createElementSet;
    }

    public abstract Iterator<C6153t1.C6154a<E>> entryIterator();

    public Set<C6153t1.C6154a<E>> entrySet() {
        Set<C6153t1.C6154a<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set<C6153t1.C6154a<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public final boolean equals(Object obj) {
        return C6158u1.m17262f(this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public final boolean removeAll(Collection<?> collection) {
        return C6158u1.m17266j(this, collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return C6158u1.m17267k(this, collection);
    }

    public int setCount(E e, int i) {
        return C6158u1.m17268l(this, e, i);
    }

    public final String toString() {
        return entrySet().toString();
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(E e, int i, int i2) {
        return C6158u1.m17269m(this, e, i, i2);
    }
}
