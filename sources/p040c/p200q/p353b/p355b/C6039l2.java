package p040c.p200q.p353b.p355b;

import com.google.common.collect.BoundType;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import java.util.Comparator;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p358e.C6250c;

/* renamed from: c.q.b.b.l2 */
/* compiled from: RegularImmutableSortedMultiset */
public final class C6039l2<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: o */
    public static final long[] f11620o = {0};

    /* renamed from: p */
    public static final ImmutableSortedMultiset<Comparable> f11621p = new C6039l2(C6205z1.m17455e());

    /* renamed from: e */
    public final transient C6046m2<E> f11622e;

    /* renamed from: l */
    public final transient long[] f11623l;

    /* renamed from: m */
    public final transient int f11624m;

    /* renamed from: n */
    public final transient int f11625n;

    public C6039l2(Comparator<? super E> comparator) {
        this.f11622e = ImmutableSortedSet.emptySet(comparator);
        this.f11623l = f11620o;
        this.f11624m = 0;
        this.f11625n = 0;
    }

    /* renamed from: c */
    public final int mo29628c(int i) {
        long[] jArr = this.f11623l;
        int i2 = this.f11624m;
        return (int) (jArr[(i2 + i) + 1] - jArr[i2 + i]);
    }

    public int count(Object obj) {
        int indexOf = this.f11622e.indexOf(obj);
        if (indexOf >= 0) {
            return mo29628c(indexOf);
        }
        return 0;
    }

    /* renamed from: f */
    public ImmutableSortedMultiset<E> mo29629f(int i, int i2) {
        C5850m.m16599t(i, i2, this.f11625n);
        if (i == i2) {
            return ImmutableSortedMultiset.emptyMultiset(comparator());
        }
        if (i == 0 && i2 == this.f11625n) {
            return this;
        }
        return new C6039l2(this.f11622e.mo29637c(i, i2), this.f11623l, this.f11624m + i, i2 - i);
    }

    public C6153t1.C6154a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    public C6153t1.C6154a<E> getEntry(int i) {
        return C6158u1.m17263g(this.f11622e.asList().get(i), mo29628c(i));
    }

    public boolean isPartialView() {
        return this.f11624m > 0 || this.f11625n < this.f11623l.length - 1;
    }

    public C6153t1.C6154a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.f11625n - 1);
    }

    public int size() {
        long[] jArr = this.f11623l;
        int i = this.f11624m;
        return C6250c.m17574h(jArr[this.f11625n + i] - jArr[i]);
    }

    public ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        C6046m2<E> m2Var = this.f11622e;
        C5850m.m16594o(boundType);
        return mo29629f(0, m2Var.mo29639f(e, boundType == BoundType.CLOSED));
    }

    public ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        C6046m2<E> m2Var = this.f11622e;
        C5850m.m16594o(boundType);
        return mo29629f(m2Var.mo29640g(e, boundType == BoundType.CLOSED), this.f11625n);
    }

    public ImmutableSortedSet<E> elementSet() {
        return this.f11622e;
    }

    public C6039l2(C6046m2<E> m2Var, long[] jArr, int i, int i2) {
        this.f11622e = m2Var;
        this.f11623l = jArr;
        this.f11624m = i;
        this.f11625n = i2;
    }
}
