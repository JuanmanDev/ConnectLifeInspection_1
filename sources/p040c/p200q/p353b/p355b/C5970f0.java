package p040c.p200q.p353b.p355b;

import com.google.common.collect.BoundType;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import p040c.p200q.p353b.p355b.C6153t1;

/* renamed from: c.q.b.b.f0 */
/* compiled from: DescendingImmutableSortedMultiset */
public final class C5970f0<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: e */
    public final transient ImmutableSortedMultiset<E> f11528e;

    public C5970f0(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.f11528e = immutableSortedMultiset;
    }

    public int count(Object obj) {
        return this.f11528e.count(obj);
    }

    public C6153t1.C6154a<E> firstEntry() {
        return this.f11528e.lastEntry();
    }

    public C6153t1.C6154a<E> getEntry(int i) {
        return this.f11528e.entrySet().asList().reverse().get(i);
    }

    public boolean isPartialView() {
        return this.f11528e.isPartialView();
    }

    public C6153t1.C6154a<E> lastEntry() {
        return this.f11528e.firstEntry();
    }

    public int size() {
        return this.f11528e.size();
    }

    public ImmutableSortedMultiset<E> descendingMultiset() {
        return this.f11528e;
    }

    public ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return this.f11528e.tailMultiset((Object) e, boundType).descendingMultiset();
    }

    public ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return this.f11528e.headMultiset((Object) e, boundType).descendingMultiset();
    }

    public ImmutableSortedSet<E> elementSet() {
        return this.f11528e.elementSet().descendingSet();
    }
}
