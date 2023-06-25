package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import java.lang.Comparable;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p358e.C6250c;

/* renamed from: c.q.b.b.i0 */
/* compiled from: DiscreteDomain */
public abstract class C5995i0<C extends Comparable> {

    /* renamed from: e */
    public final boolean f11556e;

    /* renamed from: c.q.b.b.i0$b */
    /* compiled from: DiscreteDomain */
    public static final class C5997b extends C5995i0<Integer> implements Serializable {

        /* renamed from: l */
        public static final C5997b f11557l = new C5997b();
        public static final long serialVersionUID = 0;

        public C5997b() {
            super(true);
        }

        private Object readResolve() {
            return f11557l;
        }

        /* renamed from: j */
        public long mo29524a(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        /* renamed from: l */
        public Integer mo29525d() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: m */
        public Integer mo29526e() {
            return Integer.MIN_VALUE;
        }

        /* renamed from: n */
        public Integer mo29527f(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        /* renamed from: o */
        public Integer mo29528g(Integer num, long j) {
            C6166v.m17277c(j, "distance");
            return Integer.valueOf(C6250c.m17569c(num.longValue() + j));
        }

        /* renamed from: p */
        public Integer mo29529h(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    /* renamed from: c.q.b.b.i0$c */
    /* compiled from: DiscreteDomain */
    public static final class C5998c extends C5995i0<Long> implements Serializable {

        /* renamed from: l */
        public static final C5998c f11558l = new C5998c();
        public static final long serialVersionUID = 0;

        public C5998c() {
            super(true);
        }

        private Object readResolve() {
            return f11558l;
        }

        /* renamed from: j */
        public long mo29524a(Long l, Long l2) {
            long longValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() >= l.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        /* renamed from: l */
        public Long mo29525d() {
            return Long.MAX_VALUE;
        }

        /* renamed from: m */
        public Long mo29526e() {
            return Long.MIN_VALUE;
        }

        /* renamed from: n */
        public Long mo29527f(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        /* renamed from: o */
        public Long mo29528g(Long l, long j) {
            C6166v.m17277c(j, "distance");
            long longValue = l.longValue() + j;
            if (longValue < 0) {
                C5850m.m16584e(l.longValue() < 0, "overflow");
            }
            return Long.valueOf(longValue);
        }

        /* renamed from: p */
        public Long mo29529h(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    /* renamed from: b */
    public static C5995i0<Integer> m16861b() {
        return C5997b.f11557l;
    }

    /* renamed from: c */
    public static C5995i0<Long> m16862c() {
        return C5998c.f11558l;
    }

    /* renamed from: a */
    public abstract long mo29524a(C c, C c2);

    /* renamed from: d */
    public abstract C mo29525d();

    /* renamed from: e */
    public abstract C mo29526e();

    /* renamed from: f */
    public abstract C mo29527f(C c);

    /* renamed from: g */
    public abstract C mo29528g(C c, long j);

    /* renamed from: h */
    public abstract C mo29529h(C c);

    public C5995i0() {
        this(false);
    }

    public C5995i0(boolean z) {
        this.f11556e = z;
    }
}
