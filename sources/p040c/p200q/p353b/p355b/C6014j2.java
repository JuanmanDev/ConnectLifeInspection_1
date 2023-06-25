package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p358e.C6250c;

/* renamed from: c.q.b.b.j2 */
/* compiled from: RegularImmutableMultiset */
public class C6014j2<E> extends ImmutableMultiset<E> {

    /* renamed from: n */
    public static final C6014j2<Object> f11576n = new C6014j2<>(C6184x1.m17354b());

    /* renamed from: e */
    public final transient C6184x1<E> f11577e;

    /* renamed from: l */
    public final transient int f11578l;

    /* renamed from: m */
    public transient ImmutableSet<E> f11579m;

    /* renamed from: c.q.b.b.j2$b */
    /* compiled from: RegularImmutableMultiset */
    public final class C6016b extends C6012j1<E> {
        public C6016b() {
        }

        public boolean contains(Object obj) {
            return C6014j2.this.contains(obj);
        }

        public E get(int i) {
            return C6014j2.this.f11577e.mo30110i(i);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return C6014j2.this.f11577e.mo30104C();
        }
    }

    /* renamed from: c.q.b.b.j2$c */
    /* compiled from: RegularImmutableMultiset */
    public static class C6017c implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Object[] f11581e;

        /* renamed from: l */
        public final int[] f11582l;

        public C6017c(C6153t1<?> t1Var) {
            int size = t1Var.entrySet().size();
            this.f11581e = new Object[size];
            this.f11582l = new int[size];
            int i = 0;
            for (C6153t1.C6154a next : t1Var.entrySet()) {
                this.f11581e[i] = next.mo29977a();
                this.f11582l[i] = next.getCount();
                i++;
            }
        }

        public Object readResolve() {
            ImmutableMultiset.C8123b bVar = new ImmutableMultiset.C8123b(this.f11581e.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.f11581e;
                if (i >= objArr.length) {
                    return bVar.mo36701k();
                }
                bVar.mo36700j(objArr[i], this.f11582l[i]);
                i++;
            }
        }
    }

    public C6014j2(C6184x1<E> x1Var) {
        this.f11577e = x1Var;
        long j = 0;
        for (int i = 0; i < x1Var.mo30104C(); i++) {
            j += (long) x1Var.mo30111k(i);
        }
        this.f11578l = C6250c.m17574h(j);
    }

    public int count(Object obj) {
        return this.f11577e.mo30108f(obj);
    }

    public C6153t1.C6154a<E> getEntry(int i) {
        return this.f11577e.mo30109g(i);
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f11578l;
    }

    public Object writeReplace() {
        return new C6017c(this);
    }

    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f11579m;
        if (immutableSet != null) {
            return immutableSet;
        }
        C6016b bVar = new C6016b();
        this.f11579m = bVar;
        return bVar;
    }
}
