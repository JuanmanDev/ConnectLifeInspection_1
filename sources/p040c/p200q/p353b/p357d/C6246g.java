package p040c.p200q.p353b.p357d;

import com.google.common.math.Stats;
import java.util.Iterator;
import p040c.p200q.p353b.p358e.C6248b;

/* renamed from: c.q.b.d.g */
/* compiled from: StatsAccumulator */
public final class C6246g {

    /* renamed from: a */
    public long f11859a = 0;

    /* renamed from: b */
    public double f11860b = 0.0d;

    /* renamed from: c */
    public double f11861c = 0.0d;

    /* renamed from: d */
    public double f11862d = Double.NaN;

    /* renamed from: e */
    public double f11863e = Double.NaN;

    /* renamed from: g */
    public static double m17547g(double d, double d2) {
        if (C6248b.m17561f(d)) {
            return d2;
        }
        if (C6248b.m17561f(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }

    /* renamed from: a */
    public void mo30229a(double d) {
        long j = this.f11859a;
        if (j == 0) {
            this.f11859a = 1;
            this.f11860b = d;
            this.f11862d = d;
            this.f11863e = d;
            if (!C6248b.m17561f(d)) {
                this.f11861c = Double.NaN;
                return;
            }
            return;
        }
        this.f11859a = j + 1;
        if (!C6248b.m17561f(d) || !C6248b.m17561f(this.f11860b)) {
            this.f11860b = m17547g(this.f11860b, d);
            this.f11861c = Double.NaN;
        } else {
            double d2 = this.f11860b;
            double d3 = d - d2;
            double d4 = d2 + (d3 / ((double) this.f11859a));
            this.f11860b = d4;
            this.f11861c += d3 * (d - d4);
        }
        this.f11862d = Math.min(this.f11862d, d);
        this.f11863e = Math.max(this.f11863e, d);
    }

    /* renamed from: b */
    public void mo30230b(Iterable<? extends Number> iterable) {
        for (Number doubleValue : iterable) {
            mo30229a(doubleValue.doubleValue());
        }
    }

    /* renamed from: c */
    public void mo30231c(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            mo30229a(((Number) it.next()).doubleValue());
        }
    }

    /* renamed from: d */
    public void mo30232d(double... dArr) {
        for (double a : dArr) {
            mo30229a(a);
        }
    }

    /* renamed from: e */
    public void mo30233e(int... iArr) {
        for (int i : iArr) {
            mo30229a((double) i);
        }
    }

    /* renamed from: f */
    public void mo30234f(long... jArr) {
        for (long j : jArr) {
            mo30229a((double) j);
        }
    }

    /* renamed from: h */
    public Stats mo30235h() {
        return new Stats(this.f11859a, this.f11860b, this.f11861c, this.f11862d, this.f11863e);
    }
}
