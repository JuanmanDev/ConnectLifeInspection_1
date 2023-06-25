package p040c.p200q.p406e.p422p.p423d;

import java.util.Formatter;

/* renamed from: c.q.e.p.d.f */
/* compiled from: DetectionResult */
public final class C7124f {

    /* renamed from: a */
    public final C7117a f13707a;

    /* renamed from: b */
    public final C7125g[] f13708b;

    /* renamed from: c */
    public C7119c f13709c;

    /* renamed from: d */
    public final int f13710d;

    public C7124f(C7117a aVar, C7119c cVar) {
        this.f13707a = aVar;
        int a = aVar.mo32760a();
        this.f13710d = a;
        this.f13709c = cVar;
        this.f13708b = new C7125g[(a + 2)];
    }

    /* renamed from: b */
    public static boolean m21234b(C7120d dVar, C7120d dVar2) {
        if (dVar2 == null || !dVar2.mo32784g() || dVar2.mo32778a() != dVar.mo32778a()) {
            return false;
        }
        dVar.mo32786i(dVar2.mo32780c());
        return true;
    }

    /* renamed from: c */
    public static int m21235c(int i, int i2, C7120d dVar) {
        if (dVar == null || dVar.mo32784g()) {
            return i2;
        }
        if (!dVar.mo32785h(i)) {
            return i2 + 1;
        }
        dVar.mo32786i(i);
        return 0;
    }

    /* renamed from: a */
    public final void mo32789a(C7125g gVar) {
        if (gVar != null) {
            ((C7126h) gVar).mo32812g(this.f13707a);
        }
    }

    /* renamed from: d */
    public final int mo32790d() {
        int f = mo32792f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f13710d + 1; i++) {
            C7120d[] d = this.f13708b[i].mo32808d();
            for (int i2 = 0; i2 < d.length; i2++) {
                if (d[i2] != null && !d[i2].mo32784g()) {
                    mo32791e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    public final void mo32791e(int i, int i2, C7120d[] dVarArr) {
        C7120d dVar = dVarArr[i2];
        C7120d[] d = this.f13708b[i - 1].mo32808d();
        C7125g[] gVarArr = this.f13708b;
        int i3 = i + 1;
        C7120d[] d2 = gVarArr[i3] != null ? gVarArr[i3].mo32808d() : d;
        C7120d[] dVarArr2 = new C7120d[14];
        dVarArr2[2] = d[i2];
        dVarArr2[3] = d2[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            dVarArr2[0] = dVarArr[i5];
            dVarArr2[4] = d[i5];
            dVarArr2[5] = d2[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            dVarArr2[8] = dVarArr[i6];
            dVarArr2[10] = d[i6];
            dVarArr2[11] = d2[i6];
        }
        if (i2 < dVarArr.length - 1) {
            int i7 = i2 + 1;
            dVarArr2[1] = dVarArr[i7];
            dVarArr2[6] = d[i7];
            dVarArr2[7] = d2[i7];
        }
        if (i2 < dVarArr.length - 2) {
            int i8 = i2 + 2;
            dVarArr2[9] = dVarArr[i8];
            dVarArr2[12] = d[i8];
            dVarArr2[13] = d2[i8];
        }
        while (i4 < 14 && !m21234b(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    /* renamed from: f */
    public final int mo32792f() {
        mo32793g();
        return mo32794h() + mo32795i();
    }

    /* renamed from: g */
    public final void mo32793g() {
        C7125g[] gVarArr = this.f13708b;
        if (gVarArr[0] != null && gVarArr[this.f13710d + 1] != null) {
            C7120d[] d = gVarArr[0].mo32808d();
            C7120d[] d2 = this.f13708b[this.f13710d + 1].mo32808d();
            for (int i = 0; i < d.length; i++) {
                if (!(d[i] == null || d2[i] == null || d[i].mo32780c() != d2[i].mo32780c())) {
                    for (int i2 = 1; i2 <= this.f13710d; i2++) {
                        C7120d dVar = this.f13708b[i2].mo32808d()[i];
                        if (dVar != null) {
                            dVar.mo32786i(d[i].mo32780c());
                            if (!dVar.mo32784g()) {
                                this.f13708b[i2].mo32808d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final int mo32794h() {
        C7125g[] gVarArr = this.f13708b;
        if (gVarArr[0] == null) {
            return 0;
        }
        C7120d[] d = gVarArr[0].mo32808d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            if (d[i2] != null) {
                int c = d[i2].mo32780c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f13710d + 1 && i3 < 2; i4++) {
                    C7120d dVar = this.f13708b[i4].mo32808d()[i2];
                    if (dVar != null) {
                        i3 = m21235c(c, i3, dVar);
                        if (!dVar.mo32784g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    public final int mo32795i() {
        C7125g[] gVarArr = this.f13708b;
        int i = this.f13710d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        C7120d[] d = gVarArr[i + 1].mo32808d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            if (d[i3] != null) {
                int c = d[i3].mo32780c();
                int i4 = 0;
                for (int i5 = this.f13710d + 1; i5 > 0 && i4 < 2; i5--) {
                    C7120d dVar = this.f13708b[i5].mo32808d()[i3];
                    if (dVar != null) {
                        i4 = m21235c(c, i4, dVar);
                        if (!dVar.mo32784g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: j */
    public int mo32796j() {
        return this.f13710d;
    }

    /* renamed from: k */
    public int mo32797k() {
        return this.f13707a.mo32761b();
    }

    /* renamed from: l */
    public int mo32798l() {
        return this.f13707a.mo32762c();
    }

    /* renamed from: m */
    public C7119c mo32799m() {
        return this.f13709c;
    }

    /* renamed from: n */
    public C7125g mo32800n(int i) {
        return this.f13708b[i];
    }

    /* renamed from: o */
    public C7125g[] mo32801o() {
        mo32789a(this.f13708b[0]);
        mo32789a(this.f13708b[this.f13710d + 1]);
        int i = 928;
        while (true) {
            int d = mo32790d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f13708b;
    }

    /* renamed from: p */
    public void mo32802p(C7119c cVar) {
        this.f13709c = cVar;
    }

    /* renamed from: q */
    public void mo32803q(int i, C7125g gVar) {
        this.f13708b[i] = gVar;
    }

    public String toString() {
        C7125g[] gVarArr = this.f13708b;
        C7125g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f13710d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < gVar.mo32808d().length; i++) {
            formatter.format("CW %3d:", new Object[]{Integer.valueOf(i)});
            for (int i2 = 0; i2 < this.f13710d + 2; i2++) {
                C7125g[] gVarArr2 = this.f13708b;
                if (gVarArr2[i2] == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    C7120d dVar = gVarArr2[i2].mo32808d()[i];
                    if (dVar == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(dVar.mo32780c()), Integer.valueOf(dVar.mo32782e())});
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
