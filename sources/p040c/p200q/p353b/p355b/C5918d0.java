package p040c.p200q.p353b.p355b;

import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p358e.C6247a;

/* renamed from: c.q.b.b.d0 */
/* compiled from: Cut */
public abstract class C5918d0<C extends Comparable> implements Comparable<C5918d0<C>>, Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: e */
    public final C f11456e;

    /* renamed from: c.q.b.b.d0$a */
    /* compiled from: Cut */
    public static /* synthetic */ class C5919a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11457a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11457a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11457a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p355b.C5918d0.C5919a.<clinit>():void");
        }
    }

    /* renamed from: c.q.b.b.d0$b */
    /* compiled from: Cut */
    public static final class C5920b extends C5918d0<Comparable<?>> {

        /* renamed from: l */
        public static final C5920b f11458l = new C5920b();
        public static final long serialVersionUID = 0;

        public C5920b() {
            super(null);
        }

        private Object readResolve() {
            return f11458l;
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        /* renamed from: i */
        public int compareTo(C5918d0<Comparable<?>> d0Var) {
            return d0Var == this ? 0 : 1;
        }

        /* renamed from: j */
        public void mo29178j(StringBuilder sb) {
            throw new AssertionError();
        }

        /* renamed from: m */
        public void mo29179m(StringBuilder sb) {
            sb.append("+∞)");
        }

        /* renamed from: n */
        public Comparable<?> mo29180n() {
            throw new IllegalStateException("range unbounded on this side");
        }

        /* renamed from: o */
        public Comparable<?> mo29181o(C5995i0<Comparable<?>> i0Var) {
            return i0Var.mo29525d();
        }

        /* renamed from: q */
        public boolean mo29182q(Comparable<?> comparable) {
            return false;
        }

        /* renamed from: r */
        public Comparable<?> mo29183r(C5995i0<Comparable<?>> i0Var) {
            throw new AssertionError();
        }

        /* renamed from: t */
        public BoundType mo29184t() {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "+∞";
        }

        /* renamed from: u */
        public BoundType mo29185u() {
            throw new IllegalStateException();
        }

        /* renamed from: w */
        public C5918d0<Comparable<?>> mo29186w(BoundType boundType, C5995i0<Comparable<?>> i0Var) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* renamed from: x */
        public C5918d0<Comparable<?>> mo29187x(BoundType boundType, C5995i0<Comparable<?>> i0Var) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: c.q.b.b.d0$c */
    /* compiled from: Cut */
    public static final class C5921c<C extends Comparable> extends C5918d0<C> {
        public static final long serialVersionUID = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5921c(C c) {
            super((Comparable) c);
            C5850m.m16594o(c);
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return C5918d0.super.compareTo((C5918d0) obj);
        }

        /* renamed from: h */
        public C5918d0<C> mo29175h(C5995i0<C> i0Var) {
            C r = mo29183r(i0Var);
            return r != null ? C5918d0.m16692g(r) : C5918d0.m16689c();
        }

        public int hashCode() {
            return ~this.f11456e.hashCode();
        }

        /* renamed from: j */
        public void mo29178j(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f11456e);
        }

        /* renamed from: m */
        public void mo29179m(StringBuilder sb) {
            sb.append(this.f11456e);
            sb.append(']');
        }

        /* renamed from: o */
        public C mo29181o(C5995i0<C> i0Var) {
            return this.f11456e;
        }

        /* renamed from: q */
        public boolean mo29182q(C c) {
            return Range.compareOrThrow(this.f11456e, c) < 0;
        }

        /* renamed from: r */
        public C mo29183r(C5995i0<C> i0Var) {
            return i0Var.mo29527f(this.f11456e);
        }

        /* renamed from: t */
        public BoundType mo29184t() {
            return BoundType.OPEN;
        }

        public String toString() {
            return "/" + this.f11456e + "\\";
        }

        /* renamed from: u */
        public BoundType mo29185u() {
            return BoundType.CLOSED;
        }

        /* renamed from: w */
        public C5918d0<C> mo29186w(BoundType boundType, C5995i0<C> i0Var) {
            int i = C5919a.f11457a[boundType.ordinal()];
            if (i == 1) {
                C f = i0Var.mo29527f(this.f11456e);
                return f == null ? C5918d0.m16691e() : C5918d0.m16692g(f);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: x */
        public C5918d0<C> mo29187x(BoundType boundType, C5995i0<C> i0Var) {
            int i = C5919a.f11457a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                C f = i0Var.mo29527f(this.f11456e);
                return f == null ? C5918d0.m16689c() : C5918d0.m16692g(f);
            }
            throw new AssertionError();
        }
    }

    /* renamed from: c.q.b.b.d0$d */
    /* compiled from: Cut */
    public static final class C5922d extends C5918d0<Comparable<?>> {

        /* renamed from: l */
        public static final C5922d f11459l = new C5922d();
        public static final long serialVersionUID = 0;

        public C5922d() {
            super(null);
        }

        private Object readResolve() {
            return f11459l;
        }

        /* renamed from: h */
        public C5918d0<Comparable<?>> mo29175h(C5995i0<Comparable<?>> i0Var) {
            try {
                return C5918d0.m16692g(i0Var.mo29526e());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        /* renamed from: i */
        public int compareTo(C5918d0<Comparable<?>> d0Var) {
            return d0Var == this ? 0 : -1;
        }

        /* renamed from: j */
        public void mo29178j(StringBuilder sb) {
            sb.append("(-∞");
        }

        /* renamed from: m */
        public void mo29179m(StringBuilder sb) {
            throw new AssertionError();
        }

        /* renamed from: n */
        public Comparable<?> mo29180n() {
            throw new IllegalStateException("range unbounded on this side");
        }

        /* renamed from: o */
        public Comparable<?> mo29181o(C5995i0<Comparable<?>> i0Var) {
            throw new AssertionError();
        }

        /* renamed from: q */
        public boolean mo29182q(Comparable<?> comparable) {
            return true;
        }

        /* renamed from: r */
        public Comparable<?> mo29183r(C5995i0<Comparable<?>> i0Var) {
            return i0Var.mo29526e();
        }

        /* renamed from: t */
        public BoundType mo29184t() {
            throw new IllegalStateException();
        }

        public String toString() {
            return "-∞";
        }

        /* renamed from: u */
        public BoundType mo29185u() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* renamed from: w */
        public C5918d0<Comparable<?>> mo29186w(BoundType boundType, C5995i0<Comparable<?>> i0Var) {
            throw new IllegalStateException();
        }

        /* renamed from: x */
        public C5918d0<Comparable<?>> mo29187x(BoundType boundType, C5995i0<Comparable<?>> i0Var) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* renamed from: c.q.b.b.d0$e */
    /* compiled from: Cut */
    public static final class C5923e<C extends Comparable> extends C5918d0<C> {
        public static final long serialVersionUID = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5923e(C c) {
            super((Comparable) c);
            C5850m.m16594o(c);
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return C5918d0.super.compareTo((C5918d0) obj);
        }

        public int hashCode() {
            return this.f11456e.hashCode();
        }

        /* renamed from: j */
        public void mo29178j(StringBuilder sb) {
            sb.append('[');
            sb.append(this.f11456e);
        }

        /* renamed from: m */
        public void mo29179m(StringBuilder sb) {
            sb.append(this.f11456e);
            sb.append(')');
        }

        /* renamed from: o */
        public C mo29181o(C5995i0<C> i0Var) {
            return i0Var.mo29529h(this.f11456e);
        }

        /* renamed from: q */
        public boolean mo29182q(C c) {
            return Range.compareOrThrow(this.f11456e, c) <= 0;
        }

        /* renamed from: r */
        public C mo29183r(C5995i0<C> i0Var) {
            return this.f11456e;
        }

        /* renamed from: t */
        public BoundType mo29184t() {
            return BoundType.CLOSED;
        }

        public String toString() {
            return "\\" + this.f11456e + "/";
        }

        /* renamed from: u */
        public BoundType mo29185u() {
            return BoundType.OPEN;
        }

        /* renamed from: w */
        public C5918d0<C> mo29186w(BoundType boundType, C5995i0<C> i0Var) {
            int i = C5919a.f11457a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                C h = i0Var.mo29529h(this.f11456e);
                return h == null ? C5918d0.m16691e() : new C5921c(h);
            }
            throw new AssertionError();
        }

        /* renamed from: x */
        public C5918d0<C> mo29187x(BoundType boundType, C5995i0<C> i0Var) {
            int i = C5919a.f11457a[boundType.ordinal()];
            if (i == 1) {
                C h = i0Var.mo29529h(this.f11456e);
                return h == null ? C5918d0.m16689c() : new C5921c(h);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }
    }

    public C5918d0(C c) {
        this.f11456e = c;
    }

    /* renamed from: c */
    public static <C extends Comparable> C5918d0<C> m16689c() {
        return C5920b.f11458l;
    }

    /* renamed from: d */
    public static <C extends Comparable> C5918d0<C> m16690d(C c) {
        return new C5921c(c);
    }

    /* renamed from: e */
    public static <C extends Comparable> C5918d0<C> m16691e() {
        return C5922d.f11459l;
    }

    /* renamed from: g */
    public static <C extends Comparable> C5918d0<C> m16692g(C c) {
        return new C5923e(c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5918d0)) {
            return false;
        }
        try {
            if (compareTo((C5918d0) obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public C5918d0<C> mo29175h(C5995i0<C> i0Var) {
        return this;
    }

    public abstract int hashCode();

    /* renamed from: i */
    public int compareTo(C5918d0<C> d0Var) {
        if (d0Var == m16691e()) {
            return 1;
        }
        if (d0Var == m16689c()) {
            return -1;
        }
        int compareOrThrow = Range.compareOrThrow(this.f11456e, d0Var.f11456e);
        if (compareOrThrow != 0) {
            return compareOrThrow;
        }
        return C6247a.m17555a(this instanceof C5921c, d0Var instanceof C5921c);
    }

    /* renamed from: j */
    public abstract void mo29178j(StringBuilder sb);

    /* renamed from: m */
    public abstract void mo29179m(StringBuilder sb);

    /* renamed from: n */
    public C mo29180n() {
        return this.f11456e;
    }

    /* renamed from: o */
    public abstract C mo29181o(C5995i0<C> i0Var);

    /* renamed from: q */
    public abstract boolean mo29182q(C c);

    /* renamed from: r */
    public abstract C mo29183r(C5995i0<C> i0Var);

    /* renamed from: t */
    public abstract BoundType mo29184t();

    /* renamed from: u */
    public abstract BoundType mo29185u();

    /* renamed from: w */
    public abstract C5918d0<C> mo29186w(BoundType boundType, C5995i0<C> i0Var);

    /* renamed from: x */
    public abstract C5918d0<C> mo29187x(BoundType boundType, C5995i0<C> i0Var);
}
