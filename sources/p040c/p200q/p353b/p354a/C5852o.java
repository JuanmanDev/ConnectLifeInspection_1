package p040c.p200q.p353b.p354a;

import java.io.Serializable;
import java.util.Collection;

/* renamed from: c.q.b.a.o */
/* compiled from: Predicates */
public final class C5852o {

    /* renamed from: c.q.b.a.o$b */
    /* compiled from: Predicates */
    public static class C5854b<A, B> implements C5851n<A>, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final C5851n<B> f11373e;

        /* renamed from: l */
        public final C5838g<A, ? extends B> f11374l;

        public boolean apply(A a) {
            return this.f11373e.apply(this.f11374l.apply(a));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5854b)) {
                return false;
            }
            C5854b bVar = (C5854b) obj;
            if (!this.f11374l.equals(bVar.f11374l) || !this.f11373e.equals(bVar.f11373e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f11374l.hashCode() ^ this.f11373e.hashCode();
        }

        public String toString() {
            return this.f11373e + "(" + this.f11374l + ")";
        }

        public C5854b(C5851n<B> nVar, C5838g<A, ? extends B> gVar) {
            C5850m.m16594o(nVar);
            this.f11373e = nVar;
            C5850m.m16594o(gVar);
            this.f11374l = gVar;
        }
    }

    /* renamed from: c.q.b.a.o$c */
    /* compiled from: Predicates */
    public static class C5855c<T> implements C5851n<T>, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Collection<?> f11375e;

        public boolean apply(T t) {
            try {
                return this.f11375e.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5855c) {
                return this.f11375e.equals(((C5855c) obj).f11375e);
            }
            return false;
        }

        public int hashCode() {
            return this.f11375e.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f11375e + ")";
        }

        public C5855c(Collection<?> collection) {
            C5850m.m16594o(collection);
            this.f11375e = collection;
        }
    }

    /* renamed from: c.q.b.a.o$d */
    /* compiled from: Predicates */
    public static class C5856d<T> implements C5851n<T>, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final T f11376e;

        public boolean apply(T t) {
            return this.f11376e.equals(t);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5856d) {
                return this.f11376e.equals(((C5856d) obj).f11376e);
            }
            return false;
        }

        public int hashCode() {
            return this.f11376e.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f11376e + ")";
        }

        public C5856d(T t) {
            this.f11376e = t;
        }
    }

    /* renamed from: c.q.b.a.o$e */
    /* compiled from: Predicates */
    public static class C5857e<T> implements C5851n<T>, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final C5851n<T> f11377e;

        public C5857e(C5851n<T> nVar) {
            C5850m.m16594o(nVar);
            this.f11377e = nVar;
        }

        public boolean apply(T t) {
            return !this.f11377e.apply(t);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5857e) {
                return this.f11377e.equals(((C5857e) obj).f11377e);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f11377e.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f11377e + ")";
        }
    }

    /* renamed from: c.q.b.a.o$f */
    /* compiled from: Predicates */
    public enum C5858f implements C5851n<Object> {
        ALWAYS_TRUE {
            public boolean apply(Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        /* renamed from: c */
        public <T> C5851n<T> mo28971c() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> C5851n<T> m16604a() {
        C5858f fVar = C5858f.ALWAYS_TRUE;
        fVar.mo28971c();
        return fVar;
    }

    /* renamed from: b */
    public static <A, B> C5851n<A> m16605b(C5851n<B> nVar, C5838g<A, ? extends B> gVar) {
        return new C5854b(nVar, gVar);
    }

    /* renamed from: c */
    public static <T> C5851n<T> m16606c(T t) {
        return t == null ? m16608e() : new C5856d(t);
    }

    /* renamed from: d */
    public static <T> C5851n<T> m16607d(Collection<? extends T> collection) {
        return new C5855c(collection);
    }

    /* renamed from: e */
    public static <T> C5851n<T> m16608e() {
        C5858f fVar = C5858f.IS_NULL;
        fVar.mo28971c();
        return fVar;
    }

    /* renamed from: f */
    public static <T> C5851n<T> m16609f(C5851n<T> nVar) {
        return new C5857e(nVar);
    }
}
