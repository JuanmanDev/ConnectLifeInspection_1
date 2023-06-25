package p040c.p200q.p353b.p355b;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6206z2;

/* renamed from: c.q.b.b.o */
/* compiled from: AbstractSortedMultiset */
public abstract class C6058o<E> extends C5992i<E> implements C6202y2<E> {
    public final Comparator<? super E> comparator;
    public transient C6202y2<E> descendingMultiset;

    /* renamed from: c.q.b.b.o$a */
    /* compiled from: AbstractSortedMultiset */
    public class C6059a extends C5987h0<E> {
        public C6059a() {
        }

        /* renamed from: g */
        public Iterator<C6153t1.C6154a<E>> mo29493g() {
            return C6058o.this.descendingEntryIterator();
        }

        public Iterator<E> iterator() {
            return C6058o.this.descendingIterator();
        }

        /* renamed from: l */
        public C6202y2<E> mo29494l() {
            return C6058o.this;
        }
    }

    public C6058o() {
        this(C6205z1.m17455e());
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public C6202y2<E> createDescendingMultiset() {
        return new C6059a();
    }

    public abstract Iterator<C6153t1.C6154a<E>> descendingEntryIterator();

    /* JADX WARNING: type inference failed for: r0v0, types: [c.q.b.b.t1, c.q.b.b.y2] */
    public Iterator<E> descendingIterator() {
        return C6158u1.m17265i(descendingMultiset());
    }

    public C6202y2<E> descendingMultiset() {
        C6202y2<E> y2Var = this.descendingMultiset;
        if (y2Var != null) {
            return y2Var;
        }
        C6202y2<E> createDescendingMultiset = createDescendingMultiset();
        this.descendingMultiset = createDescendingMultiset;
        return createDescendingMultiset;
    }

    public C6153t1.C6154a<E> firstEntry() {
        Iterator entryIterator = entryIterator();
        if (entryIterator.hasNext()) {
            return (C6153t1.C6154a) entryIterator.next();
        }
        return null;
    }

    public C6153t1.C6154a<E> lastEntry() {
        Iterator descendingEntryIterator = descendingEntryIterator();
        if (descendingEntryIterator.hasNext()) {
            return (C6153t1.C6154a) descendingEntryIterator.next();
        }
        return null;
    }

    public C6153t1.C6154a<E> pollFirstEntry() {
        Iterator entryIterator = entryIterator();
        if (!entryIterator.hasNext()) {
            return null;
        }
        C6153t1.C6154a aVar = (C6153t1.C6154a) entryIterator.next();
        C6153t1.C6154a<E> g = C6158u1.m17263g(aVar.mo29977a(), aVar.getCount());
        entryIterator.remove();
        return g;
    }

    public C6153t1.C6154a<E> pollLastEntry() {
        Iterator descendingEntryIterator = descendingEntryIterator();
        if (!descendingEntryIterator.hasNext()) {
            return null;
        }
        C6153t1.C6154a aVar = (C6153t1.C6154a) descendingEntryIterator.next();
        C6153t1.C6154a<E> g = C6158u1.m17263g(aVar.mo29977a(), aVar.getCount());
        descendingEntryIterator.remove();
        return g;
    }

    public C6202y2<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        C5850m.m16594o(boundType);
        C5850m.m16594o(boundType2);
        return tailMultiset(e, boundType).headMultiset(e2, boundType2);
    }

    public C6058o(Comparator<? super E> comparator2) {
        C5850m.m16594o(comparator2);
        this.comparator = comparator2;
    }

    public NavigableSet<E> createElementSet() {
        return new C6206z2.C6208b(this);
    }

    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
