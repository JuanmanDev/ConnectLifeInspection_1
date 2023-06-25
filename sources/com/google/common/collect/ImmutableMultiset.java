package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5966f;
import p040c.p200q.p353b.p355b.C5971f1;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6012j1;
import p040c.p200q.p353b.p355b.C6014j2;
import p040c.p200q.p353b.p355b.C6148s2;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;
import p040c.p200q.p353b.p355b.C6184x1;

public abstract class ImmutableMultiset<E> extends C5971f1<E> implements C6153t1<E> {
    public transient ImmutableList<E> asList;
    public transient ImmutableSet<C6153t1.C6154a<E>> entrySet;

    /* renamed from: com.google.common.collect.ImmutableMultiset$a */
    public class C8122a extends C5991h3<E> {

        /* renamed from: e */
        public int f15091e;

        /* renamed from: l */
        public E f15092l;

        /* renamed from: m */
        public final /* synthetic */ Iterator f15093m;

        public C8122a(ImmutableMultiset immutableMultiset, Iterator it) {
            this.f15093m = it;
        }

        public boolean hasNext() {
            return this.f15091e > 0 || this.f15093m.hasNext();
        }

        public E next() {
            if (this.f15091e <= 0) {
                C6153t1.C6154a aVar = (C6153t1.C6154a) this.f15093m.next();
                this.f15092l = aVar.mo29977a();
                this.f15091e = aVar.getCount();
            }
            this.f15091e--;
            return this.f15092l;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultiset$b */
    public static class C8123b<E> extends ImmutableCollection.C8099b<E> {

        /* renamed from: a */
        public C6184x1<E> f15094a;

        /* renamed from: b */
        public boolean f15095b;

        /* renamed from: c */
        public boolean f15096c;

        public C8123b() {
            this(4);
        }

        /* renamed from: l */
        public static <T> C6184x1<T> m22223l(Iterable<T> iterable) {
            if (iterable instanceof C6014j2) {
                return ((C6014j2) iterable).f11577e;
            }
            if (iterable instanceof C5966f) {
                return ((C5966f) iterable).backingMap;
            }
            return null;
        }

        /* renamed from: f */
        public C8123b<E> mo36621a(E e) {
            return mo36700j(e, 1);
        }

        /* renamed from: g */
        public C8123b<E> mo36697g(E... eArr) {
            super.mo36618b(eArr);
            return this;
        }

        /* renamed from: h */
        public C8123b<E> mo36698h(Iterable<? extends E> iterable) {
            if (iterable instanceof C6153t1) {
                C6153t1<? extends E> d = C6158u1.m17260d(iterable);
                C6184x1<T> l = m22223l(d);
                if (l != null) {
                    C6184x1<E> x1Var = this.f15094a;
                    x1Var.mo30106d(Math.max(x1Var.mo30104C(), l.mo30104C()));
                    for (int e = l.mo30107e(); e >= 0; e = l.mo30117s(e)) {
                        mo36700j(l.mo30110i(e), l.mo30111k(e));
                    }
                } else {
                    Set<C6153t1.C6154a<? extends E>> entrySet = d.entrySet();
                    C6184x1<E> x1Var2 = this.f15094a;
                    x1Var2.mo30106d(Math.max(x1Var2.mo30104C(), entrySet.size()));
                    for (C6153t1.C6154a next : d.entrySet()) {
                        mo36700j(next.mo29977a(), next.getCount());
                    }
                }
            } else {
                super.mo36622c(iterable);
            }
            return this;
        }

        /* renamed from: i */
        public C8123b<E> mo36699i(Iterator<? extends E> it) {
            super.mo36623d(it);
            return this;
        }

        /* renamed from: j */
        public C8123b<E> mo36700j(E e, int i) {
            if (i == 0) {
                return this;
            }
            if (this.f15095b) {
                this.f15094a = new C6184x1<>(this.f15094a);
                this.f15096c = false;
            }
            this.f15095b = false;
            C5850m.m16594o(e);
            C6184x1<E> x1Var = this.f15094a;
            x1Var.mo30119u(e, i + x1Var.mo30108f(e));
            return this;
        }

        /* renamed from: k */
        public ImmutableMultiset<E> mo36701k() {
            if (this.f15094a.mo30104C() == 0) {
                return ImmutableMultiset.m22216of();
            }
            if (this.f15096c) {
                this.f15094a = new C6184x1<>(this.f15094a);
                this.f15096c = false;
            }
            this.f15095b = true;
            return new C6014j2(this.f15094a);
        }

        public C8123b(int i) {
            this.f15095b = false;
            this.f15096c = false;
            this.f15094a = C6184x1.m17355c(i);
        }

        public C8123b(boolean z) {
            this.f15095b = false;
            this.f15096c = false;
            this.f15094a = null;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultiset$c */
    public final class C8124c extends C6012j1<C6153t1.C6154a<E>> {
        public static final long serialVersionUID = 0;

        public C8124c() {
        }

        /* renamed from: c */
        public C6153t1.C6154a<E> get(int i) {
            return ImmutableMultiset.this.getEntry(i);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C6153t1.C6154a)) {
                return false;
            }
            C6153t1.C6154a aVar = (C6153t1.C6154a) obj;
            if (aVar.getCount() > 0 && ImmutableMultiset.this.count(aVar.mo29977a()) == aVar.getCount()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        public Object writeReplace() {
            return new C8125d(ImmutableMultiset.this);
        }

        public /* synthetic */ C8124c(ImmutableMultiset immutableMultiset, C8122a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultiset$d */
    public static class C8125d<E> implements Serializable {

        /* renamed from: e */
        public final ImmutableMultiset<E> f15098e;

        public C8125d(ImmutableMultiset<E> immutableMultiset) {
            this.f15098e = immutableMultiset;
        }

        public Object readResolve() {
            return this.f15098e.entrySet();
        }
    }

    public static <E> C8123b<E> builder() {
        return new C8123b<>();
    }

    public static <E> ImmutableMultiset<E> copyFromElements(E... eArr) {
        C8123b bVar = new C8123b();
        bVar.mo36697g(eArr);
        return bVar.mo36701k();
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends C6153t1.C6154a<? extends E>> collection) {
        C8123b bVar = new C8123b(collection.size());
        for (C6153t1.C6154a aVar : collection) {
            bVar.mo36700j(aVar.mo29977a(), aVar.getCount());
        }
        return bVar.mo36701k();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    private ImmutableSet<C6153t1.C6154a<E>> createEntrySet() {
        return isEmpty() ? ImmutableSet.m22254of() : new C8124c(this, (C8122a) null);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m22216of() {
        return C6014j2.f11576n;
    }

    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> asList2 = super.asList();
        this.asList = asList2;
        return asList2;
    }

    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        C5991h3 it = entrySet().iterator();
        while (it.hasNext()) {
            C6153t1.C6154a aVar = (C6153t1.C6154a) it.next();
            Arrays.fill(objArr, i, aVar.getCount() + i, aVar.mo29977a());
            i += aVar.getCount();
        }
        return i;
    }

    public abstract /* synthetic */ int count(Object obj);

    public abstract ImmutableSet<E> elementSet();

    public boolean equals(Object obj) {
        return C6158u1.m17262f(this, obj);
    }

    public abstract C6153t1.C6154a<E> getEntry(int i);

    public int hashCode() {
        return C6148s2.m17249b(entrySet());
    }

    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return entrySet().toString();
    }

    public abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        C8123b bVar = new C8123b(C6158u1.m17264h(iterable));
        bVar.mo36698h(iterable);
        return bVar.mo36701k();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m22217of(E e) {
        return copyFromElements(e);
    }

    public ImmutableSet<C6153t1.C6154a<E>> entrySet() {
        ImmutableSet<C6153t1.C6154a<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<C6153t1.C6154a<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public C5991h3<E> iterator() {
        return new C8122a(this, entrySet().iterator());
    }

    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m22218of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m22219of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m22220of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m22221of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m22222of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new C8123b().mo36621a(e).mo36621a(e2).mo36621a(e3).mo36621a(e4).mo36621a(e5).mo36621a(e6).mo36697g(eArr).mo36701k();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        C8123b bVar = new C8123b();
        bVar.mo36699i(it);
        return bVar.mo36701k();
    }
}
