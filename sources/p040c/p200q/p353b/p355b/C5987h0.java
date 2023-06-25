package p040c.p200q.p353b.p355b;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;
import p040c.p200q.p353b.p355b.C6206z2;

/* renamed from: c.q.b.b.h0 */
/* compiled from: DescendingMultiset */
public abstract class C5987h0<E> extends C6139s0<E> implements C6202y2<E> {

    /* renamed from: e */
    public transient Comparator<? super E> f11547e;

    /* renamed from: l */
    public transient NavigableSet<E> f11548l;

    /* renamed from: m */
    public transient Set<C6153t1.C6154a<E>> f11549m;

    /* renamed from: c.q.b.b.h0$a */
    /* compiled from: DescendingMultiset */
    public class C5988a extends C6158u1.C6162d<E> {
        public C5988a() {
        }

        public Iterator<C6153t1.C6154a<E>> iterator() {
            return C5987h0.this.mo29493g();
        }

        /* renamed from: k */
        public C6153t1<E> mo29499k() {
            return C5987h0.this;
        }

        public int size() {
            return C5987h0.this.mo29494l().entrySet().size();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [c.q.b.b.y2, c.q.b.b.t1<E>] */
    /* renamed from: c */
    public C6153t1<E> delegate() {
        return mo29494l();
    }

    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f11547e;
        if (comparator != null) {
            return comparator;
        }
        C6205z1 h = C6205z1.m17454a(mo29494l().comparator()).mo29701h();
        this.f11547e = h;
        return h;
    }

    public C6202y2<E> descendingMultiset() {
        return mo29494l();
    }

    public Set<C6153t1.C6154a<E>> entrySet() {
        Set<C6153t1.C6154a<E>> set = this.f11549m;
        if (set != null) {
            return set;
        }
        Set<C6153t1.C6154a<E>> f = mo29492f();
        this.f11549m = f;
        return f;
    }

    /* renamed from: f */
    public Set<C6153t1.C6154a<E>> mo29492f() {
        return new C5988a();
    }

    public C6153t1.C6154a<E> firstEntry() {
        return mo29494l().lastEntry();
    }

    /* renamed from: g */
    public abstract Iterator<C6153t1.C6154a<E>> mo29493g();

    public C6202y2<E> headMultiset(E e, BoundType boundType) {
        return mo29494l().tailMultiset(e, boundType).descendingMultiset();
    }

    /* renamed from: l */
    public abstract C6202y2<E> mo29494l();

    public C6153t1.C6154a<E> lastEntry() {
        return mo29494l().firstEntry();
    }

    public C6153t1.C6154a<E> pollFirstEntry() {
        return mo29494l().pollLastEntry();
    }

    public C6153t1.C6154a<E> pollLastEntry() {
        return mo29494l().pollFirstEntry();
    }

    public C6202y2<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return mo29494l().subMultiset(e2, boundType2, e, boundType).descendingMultiset();
    }

    public C6202y2<E> tailMultiset(E e, BoundType boundType) {
        return mo29494l().headMultiset(e, boundType).descendingMultiset();
    }

    public Object[] toArray() {
        return standardToArray();
    }

    public String toString() {
        return entrySet().toString();
    }

    public NavigableSet<E> elementSet() {
        NavigableSet<E> navigableSet = this.f11548l;
        if (navigableSet != null) {
            return navigableSet;
        }
        C6206z2.C6208b bVar = new C6206z2.C6208b(this);
        this.f11548l = bVar;
        return bVar;
    }

    public <T> T[] toArray(T[] tArr) {
        return standardToArray(tArr);
    }
}
