package p040c.p200q.p353b.p355b;

import androidx.test.internal.runner.RunnerArgs;
import java.io.Serializable;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p355b.C5927d3;

/* renamed from: c.q.b.b.e3 */
/* compiled from: Tables */
public final class C5963e3 {

    /* renamed from: c.q.b.b.e3$a */
    /* compiled from: Tables */
    public static abstract class C5964a<R, C, V> implements C5927d3.C5928a<R, C, V> {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5927d3.C5928a)) {
                return false;
            }
            C5927d3.C5928a aVar = (C5927d3.C5928a) obj;
            if (!C5845j.m16576a(mo29198b(), aVar.mo29198b()) || !C5845j.m16576a(mo29197a(), aVar.mo29197a()) || !C5845j.m16576a(getValue(), aVar.getValue())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C5845j.m16577b(mo29198b(), mo29197a(), getValue());
        }

        public String toString() {
            return "(" + mo29198b() + RunnerArgs.CLASS_SEPARATOR + mo29197a() + ")=" + getValue();
        }
    }

    /* renamed from: c.q.b.b.e3$b */
    /* compiled from: Tables */
    public static final class C5965b<R, C, V> extends C5964a<R, C, V> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final R f11519e;

        /* renamed from: l */
        public final C f11520l;

        /* renamed from: m */
        public final V f11521m;

        public C5965b(R r, C c, V v) {
            this.f11519e = r;
            this.f11520l = c;
            this.f11521m = v;
        }

        /* renamed from: a */
        public C mo29197a() {
            return this.f11520l;
        }

        /* renamed from: b */
        public R mo29198b() {
            return this.f11519e;
        }

        public V getValue() {
            return this.f11521m;
        }
    }

    /* renamed from: a */
    public static boolean m16819a(C5927d3<?, ?, ?> d3Var, Object obj) {
        if (obj == d3Var) {
            return true;
        }
        if (obj instanceof C5927d3) {
            return d3Var.cellSet().equals(((C5927d3) obj).cellSet());
        }
        return false;
    }

    /* renamed from: b */
    public static <R, C, V> C5927d3.C5928a<R, C, V> m16820b(R r, C c, V v) {
        return new C5965b(r, c, v);
    }
}
