package p040c.p200q.p353b.p357d;

import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.d.d */
/* compiled from: LinearTransformation */
public abstract class C6237d {

    /* renamed from: c.q.b.d.d$b */
    /* compiled from: LinearTransformation */
    public static final class C6239b {

        /* renamed from: a */
        public final double f11852a;

        /* renamed from: b */
        public final double f11853b;

        /* renamed from: a */
        public C6237d mo30225a(double d) {
            C5850m.m16583d(!Double.isNaN(d));
            if (C6235b.m17535c(d)) {
                return new C6241d(d, this.f11853b - (this.f11852a * d));
            }
            return new C6242e(this.f11852a);
        }

        public C6239b(double d, double d2) {
            this.f11852a = d;
            this.f11853b = d2;
        }
    }

    /* renamed from: c.q.b.d.d$c */
    /* compiled from: LinearTransformation */
    public static final class C6240c extends C6237d {

        /* renamed from: a */
        public static final C6240c f11854a = new C6240c();

        public String toString() {
            return "NaN";
        }
    }

    /* renamed from: c.q.b.d.d$d */
    /* compiled from: LinearTransformation */
    public static final class C6241d extends C6237d {

        /* renamed from: a */
        public final double f11855a;

        /* renamed from: b */
        public final double f11856b;

        public C6241d(double d, double d2) {
            this.f11855a = d;
            this.f11856b = d2;
        }

        public String toString() {
            return String.format("y = %g * x + %g", new Object[]{Double.valueOf(this.f11855a), Double.valueOf(this.f11856b)});
        }
    }

    /* renamed from: c.q.b.d.d$e */
    /* compiled from: LinearTransformation */
    public static final class C6242e extends C6237d {

        /* renamed from: a */
        public final double f11857a;

        public C6242e(double d) {
            this.f11857a = d;
        }

        public String toString() {
            return String.format("x = %g", new Object[]{Double.valueOf(this.f11857a)});
        }
    }

    /* renamed from: a */
    public static C6237d m17538a() {
        return C6240c.f11854a;
    }

    /* renamed from: b */
    public static C6237d m17539b(double d) {
        C5850m.m16583d(C6235b.m17535c(d));
        return new C6241d(0.0d, d);
    }

    /* renamed from: c */
    public static C6239b m17540c(double d, double d2) {
        C5850m.m16583d(C6235b.m17535c(d) && C6235b.m17535c(d2));
        return new C6239b(d, d2);
    }

    /* renamed from: d */
    public static C6237d m17541d(double d) {
        C5850m.m16583d(C6235b.m17535c(d));
        return new C6242e(d);
    }
}
