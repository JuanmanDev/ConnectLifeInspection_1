package p040c.p200q.p406e.p422p.p423d;

import java.util.Formatter;

/* renamed from: c.q.e.p.d.g */
/* compiled from: DetectionResultColumn */
public class C7125g {

    /* renamed from: a */
    public final C7119c f13711a;

    /* renamed from: b */
    public final C7120d[] f13712b;

    public C7125g(C7119c cVar) {
        this.f13711a = new C7119c(cVar);
        this.f13712b = new C7120d[((cVar.mo32772f() - cVar.mo32774h()) + 1)];
    }

    /* renamed from: a */
    public final C7119c mo32805a() {
        return this.f13711a;
    }

    /* renamed from: b */
    public final C7120d mo32806b(int i) {
        return this.f13712b[mo32809e(i)];
    }

    /* renamed from: c */
    public final C7120d mo32807c(int i) {
        C7120d dVar;
        C7120d dVar2;
        C7120d b = mo32806b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo32809e(i) - i2;
            if (e >= 0 && (dVar2 = this.f13712b[e]) != null) {
                return dVar2;
            }
            int e2 = mo32809e(i) + i2;
            C7120d[] dVarArr = this.f13712b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C7120d[] mo32808d() {
        return this.f13712b;
    }

    /* renamed from: e */
    public final int mo32809e(int i) {
        return i - this.f13711a.mo32774h();
    }

    /* renamed from: f */
    public final void mo32810f(int i, C7120d dVar) {
        this.f13712b[mo32809e(i)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i = 0;
        for (C7120d dVar : this.f13712b) {
            if (dVar == null) {
                formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i)});
                i++;
            } else {
                formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i), Integer.valueOf(dVar.mo32780c()), Integer.valueOf(dVar.mo32782e())});
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
