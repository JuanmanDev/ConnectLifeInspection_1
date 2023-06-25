package com.google.common.base;

import java.io.Serializable;
import p040c.p200q.p353b.p354a.C5850m;

public abstract class Equivalence<T> {

    public static final class Wrapper<T> implements Serializable {
        public static final long serialVersionUID = 0;
        public final Equivalence<? super T> equivalence;
        public final T reference;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.mo36448d(this.reference, wrapper.reference);
            }
            return false;
        }

        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.mo36449e(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }

        public Wrapper(Equivalence<? super T> equivalence2, T t) {
            C5850m.m16594o(equivalence2);
            this.equivalence = equivalence2;
            this.reference = t;
        }
    }

    /* renamed from: com.google.common.base.Equivalence$b */
    public static final class C8056b extends Equivalence<Object> implements Serializable {

        /* renamed from: e */
        public static final C8056b f15000e = new C8056b();
        public static final long serialVersionUID = 1;

        private Object readResolve() {
            return f15000e;
        }

        /* renamed from: a */
        public boolean mo36446a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* renamed from: b */
        public int mo36447b(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: com.google.common.base.Equivalence$c */
    public static final class C8057c extends Equivalence<Object> implements Serializable {

        /* renamed from: e */
        public static final C8057c f15001e = new C8057c();
        public static final long serialVersionUID = 1;

        private Object readResolve() {
            return f15001e;
        }

        /* renamed from: a */
        public boolean mo36446a(Object obj, Object obj2) {
            return false;
        }

        /* renamed from: b */
        public int mo36447b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* renamed from: c */
    public static Equivalence<Object> m22050c() {
        return C8056b.f15000e;
    }

    /* renamed from: f */
    public static Equivalence<Object> m22051f() {
        return C8057c.f15001e;
    }

    /* renamed from: a */
    public abstract boolean mo36446a(T t, T t2);

    /* renamed from: b */
    public abstract int mo36447b(T t);

    /* renamed from: d */
    public final boolean mo36448d(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo36446a(t, t2);
    }

    /* renamed from: e */
    public final int mo36449e(T t) {
        if (t == null) {
            return 0;
        }
        return mo36447b(t);
    }
}
