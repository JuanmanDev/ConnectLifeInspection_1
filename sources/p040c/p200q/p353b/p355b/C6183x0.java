package p040c.p200q.p353b.p355b;

import androidx.test.internal.runner.RunnerArgs;
import com.google.common.collect.BoundType;
import java.io.Serializable;
import java.util.Comparator;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.x0 */
/* compiled from: GeneralRange */
public final class C6183x0<T> implements Serializable {

    /* renamed from: e */
    public final Comparator<? super T> f11778e;

    /* renamed from: l */
    public final boolean f11779l;

    /* renamed from: m */
    public final T f11780m;

    /* renamed from: n */
    public final BoundType f11781n;

    /* renamed from: o */
    public final boolean f11782o;

    /* renamed from: p */
    public final T f11783p;

    /* renamed from: q */
    public final BoundType f11784q;

    public C6183x0(Comparator<? super T> comparator, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        C5850m.m16594o(comparator);
        this.f11778e = comparator;
        this.f11779l = z;
        this.f11782o = z2;
        this.f11780m = t;
        C5850m.m16594o(boundType);
        this.f11781n = boundType;
        this.f11783p = t2;
        C5850m.m16594o(boundType2);
        this.f11784q = boundType2;
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator.compare(t, t2);
            boolean z3 = true;
            C5850m.m16590k(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                C5850m.m16583d((boundType != BoundType.OPEN) | (boundType2 == BoundType.OPEN ? false : z3));
            }
        }
    }

    /* renamed from: a */
    public static <T> C6183x0<T> m17339a(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new C6183x0(comparator, false, (Object) null, boundType, false, (Object) null, boundType);
    }

    /* renamed from: d */
    public static <T> C6183x0<T> m17340d(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new C6183x0(comparator, true, t, boundType, false, (T) null, BoundType.OPEN);
    }

    /* renamed from: o */
    public static <T> C6183x0<T> m17341o(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new C6183x0(comparator, false, (Object) null, BoundType.OPEN, true, t, boundType);
    }

    /* renamed from: b */
    public Comparator<? super T> mo30088b() {
        return this.f11778e;
    }

    /* renamed from: c */
    public boolean mo30089c(T t) {
        return !mo30100n(t) && !mo30099m(t);
    }

    /* renamed from: e */
    public BoundType mo30090e() {
        return this.f11781n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6183x0)) {
            return false;
        }
        C6183x0 x0Var = (C6183x0) obj;
        if (!this.f11778e.equals(x0Var.f11778e) || this.f11779l != x0Var.f11779l || this.f11782o != x0Var.f11782o || !mo30090e().equals(x0Var.mo30090e()) || !mo30093g().equals(x0Var.mo30093g()) || !C5845j.m16576a(mo30092f(), x0Var.mo30092f()) || !C5845j.m16576a(mo30094h(), x0Var.mo30094h())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public T mo30092f() {
        return this.f11780m;
    }

    /* renamed from: g */
    public BoundType mo30093g() {
        return this.f11784q;
    }

    /* renamed from: h */
    public T mo30094h() {
        return this.f11783p;
    }

    public int hashCode() {
        return C5845j.m16577b(this.f11778e, mo30092f(), mo30090e(), mo30094h(), mo30093g());
    }

    /* renamed from: i */
    public boolean mo30096i() {
        return this.f11779l;
    }

    /* renamed from: j */
    public boolean mo30097j() {
        return this.f11782o;
    }

    /* renamed from: l */
    public C6183x0<T> mo30098l(C6183x0<T> x0Var) {
        BoundType boundType;
        BoundType boundType2;
        T t;
        int compare;
        BoundType boundType3;
        int compare2;
        int compare3;
        C5850m.m16594o(x0Var);
        C5850m.m16583d(this.f11778e.equals(x0Var.f11778e));
        boolean z = this.f11779l;
        T f = mo30092f();
        BoundType e = mo30090e();
        if (!mo30096i()) {
            z = x0Var.f11779l;
            f = x0Var.mo30092f();
            e = x0Var.mo30090e();
        } else if (x0Var.mo30096i() && ((compare3 = this.f11778e.compare(mo30092f(), x0Var.mo30092f())) < 0 || (compare3 == 0 && x0Var.mo30090e() == BoundType.OPEN))) {
            f = x0Var.mo30092f();
            e = x0Var.mo30090e();
        }
        boolean z2 = z;
        boolean z3 = this.f11782o;
        T h = mo30094h();
        BoundType g = mo30093g();
        if (!mo30097j()) {
            z3 = x0Var.f11782o;
            h = x0Var.mo30094h();
            g = x0Var.mo30093g();
        } else if (x0Var.mo30097j() && ((compare2 = this.f11778e.compare(mo30094h(), x0Var.mo30094h())) > 0 || (compare2 == 0 && x0Var.mo30093g() == BoundType.OPEN))) {
            h = x0Var.mo30094h();
            g = x0Var.mo30093g();
        }
        boolean z4 = z3;
        T t2 = h;
        if (!z2 || !z4 || ((compare = this.f11778e.compare(f, t2)) <= 0 && !(compare == 0 && e == (boundType3 = BoundType.OPEN) && g == boundType3))) {
            t = f;
            boundType2 = e;
            boundType = g;
        } else {
            boundType2 = BoundType.OPEN;
            boundType = BoundType.CLOSED;
            t = t2;
        }
        return new C6183x0(this.f11778e, z2, t, boundType2, z4, t2, boundType);
    }

    /* renamed from: m */
    public boolean mo30099m(T t) {
        boolean z = false;
        if (!mo30097j()) {
            return false;
        }
        int compare = this.f11778e.compare(t, mo30094h());
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (mo30093g() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    /* renamed from: n */
    public boolean mo30100n(T t) {
        boolean z = false;
        if (!mo30096i()) {
            return false;
        }
        int compare = this.f11778e.compare(t, mo30092f());
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (mo30090e() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11778e);
        sb.append(RunnerArgs.CLASSPATH_SEPARATOR);
        sb.append(this.f11781n == BoundType.CLOSED ? '[' : '(');
        sb.append(this.f11779l ? this.f11780m : "-∞");
        sb.append(',');
        sb.append(this.f11782o ? this.f11783p : "∞");
        sb.append(this.f11784q == BoundType.CLOSED ? ']' : ')');
        return sb.toString();
    }
}
