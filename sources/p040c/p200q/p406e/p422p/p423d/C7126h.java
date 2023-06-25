package p040c.p200q.p406e.p422p.p423d;

import p040c.p200q.p406e.C7023i;

/* renamed from: c.q.e.p.d.h */
/* compiled from: DetectionResultRowIndicatorColumn */
public final class C7126h extends C7125g {

    /* renamed from: c */
    public final boolean f13713c;

    public C7126h(C7119c cVar, boolean z) {
        super(cVar);
        this.f13713c = z;
    }

    /* renamed from: g */
    public void mo32812g(C7117a aVar) {
        C7120d[] d = mo32808d();
        mo32818m();
        mo32817l(d, aVar);
        C7119c a = mo32805a();
        C7023i i = this.f13713c ? a.mo32775i() : a.mo32776j();
        C7023i c = this.f13713c ? a.mo32769c() : a.mo32770d();
        int e = mo32809e((int) i.mo32487d());
        int e2 = mo32809e((int) c.mo32487d());
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        while (e < e2) {
            if (d[e] != null) {
                C7120d dVar = d[e];
                int c2 = dVar.mo32780c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                        i2 = dVar.mo32780c();
                    } else if (c2 < 0 || dVar.mo32780c() >= aVar.mo32762c() || c2 > e) {
                        d[e] = null;
                    } else {
                        if (i4 > 2) {
                            c2 *= i4 - 2;
                        }
                        boolean z = c2 >= e;
                        for (int i5 = 1; i5 <= c2 && !z; i5++) {
                            z = d[e - i5] != null;
                        }
                        if (z) {
                            d[e] = null;
                        } else {
                            i2 = dVar.mo32780c();
                        }
                    }
                    i3 = 1;
                }
            }
            e++;
        }
    }

    /* renamed from: h */
    public final void mo32813h(C7117a aVar) {
        C7119c a = mo32805a();
        C7023i i = this.f13713c ? a.mo32775i() : a.mo32776j();
        C7023i c = this.f13713c ? a.mo32769c() : a.mo32770d();
        int e = mo32809e((int) c.mo32487d());
        C7120d[] d = mo32808d();
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        for (int e2 = mo32809e((int) i.mo32487d()); e2 < e; e2++) {
            if (d[e2] != null) {
                C7120d dVar = d[e2];
                dVar.mo32787j();
                int c2 = dVar.mo32780c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                        i2 = dVar.mo32780c();
                    } else if (dVar.mo32780c() >= aVar.mo32762c()) {
                        d[e2] = null;
                    } else {
                        i2 = dVar.mo32780c();
                    }
                    i3 = 1;
                }
            }
        }
    }

    /* renamed from: i */
    public C7117a mo32814i() {
        C7120d[] d = mo32808d();
        C7118b bVar = new C7118b();
        C7118b bVar2 = new C7118b();
        C7118b bVar3 = new C7118b();
        C7118b bVar4 = new C7118b();
        for (C7120d dVar : d) {
            if (dVar != null) {
                dVar.mo32787j();
                int e = dVar.mo32782e() % 30;
                int c = dVar.mo32780c();
                if (!this.f13713c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo32766b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo32766b(e / 3);
                    bVar3.mo32766b(e % 3);
                } else if (i == 2) {
                    bVar.mo32766b(e + 1);
                }
            }
        }
        if (bVar.mo32765a().length == 0 || bVar2.mo32765a().length == 0 || bVar3.mo32765a().length == 0 || bVar4.mo32765a().length == 0 || bVar.mo32765a()[0] <= 0 || bVar2.mo32765a()[0] + bVar3.mo32765a()[0] < 3 || bVar2.mo32765a()[0] + bVar3.mo32765a()[0] > 90) {
            return null;
        }
        C7117a aVar = new C7117a(bVar.mo32765a()[0], bVar2.mo32765a()[0], bVar3.mo32765a()[0], bVar4.mo32765a()[0]);
        mo32817l(d, aVar);
        return aVar;
    }

    /* renamed from: j */
    public int[] mo32815j() {
        int c;
        C7117a i = mo32814i();
        if (i == null) {
            return null;
        }
        mo32813h(i);
        int c2 = i.mo32762c();
        int[] iArr = new int[c2];
        for (C7120d dVar : mo32808d()) {
            if (dVar != null && (c = dVar.mo32780c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean mo32816k() {
        return this.f13713c;
    }

    /* renamed from: l */
    public final void mo32817l(C7120d[] dVarArr, C7117a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C7120d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e = dVar.mo32782e() % 30;
                int c = dVar.mo32780c();
                if (c > aVar.mo32762c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f13713c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo32760a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo32761b() || e % 3 != aVar.mo32763d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo32764e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo32818m() {
        for (C7120d dVar : mo32808d()) {
            if (dVar != null) {
                dVar.mo32787j();
            }
        }
    }

    public String toString() {
        return "IsLeft: " + this.f13713c + 10 + super.toString();
    }
}
