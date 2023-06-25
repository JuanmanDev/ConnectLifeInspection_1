package p040c.p200q.p201a.p219b.p224f0.p232y;

import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.t */
/* compiled from: PesReader */
public final class C2807t implements C2781e0 {

    /* renamed from: a */
    public final C2794l f4317a;

    /* renamed from: b */
    public final C3172s f4318b = new C3172s(new byte[10]);

    /* renamed from: c */
    public int f4319c = 0;

    /* renamed from: d */
    public int f4320d;

    /* renamed from: e */
    public C3146b0 f4321e;

    /* renamed from: f */
    public boolean f4322f;

    /* renamed from: g */
    public boolean f4323g;

    /* renamed from: h */
    public boolean f4324h;

    /* renamed from: i */
    public int f4325i;

    /* renamed from: j */
    public int f4326j;

    /* renamed from: k */
    public boolean f4327k;

    /* renamed from: l */
    public long f4328l;

    public C2807t(C2794l lVar) {
        this.f4317a = lVar;
    }

    /* renamed from: a */
    public void mo18756a(C3146b0 b0Var, C2676i iVar, C2781e0.C2785d dVar) {
        this.f4321e = b0Var;
        this.f4317a.mo18769e(iVar, dVar);
    }

    /* renamed from: b */
    public final void mo18757b(C3173t tVar, int i) {
        if ((i & 1) != 0) {
            int i2 = this.f4319c;
            if (!(i2 == 0 || i2 == 1)) {
                if (i2 == 2) {
                    C3163m.m7880f("PesReader", "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.f4326j != -1) {
                        C3163m.m7880f("PesReader", "Unexpected start indicator: expected " + this.f4326j + " more bytes");
                    }
                    this.f4317a.mo18768d();
                } else {
                    throw new IllegalStateException();
                }
            }
            mo18848g(1);
        }
        while (tVar.mo20008a() > 0) {
            int i3 = this.f4319c;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (mo18845d(tVar, this.f4318b.f5873a, Math.min(10, this.f4325i)) && mo18845d(tVar, (byte[]) null, this.f4325i)) {
                            mo18847f();
                            if (this.f4327k) {
                                i4 = 4;
                            }
                            i |= i4;
                            this.f4317a.mo18770f(this.f4328l, i);
                            mo18848g(3);
                        }
                    } else if (i3 == 3) {
                        int a = tVar.mo20008a();
                        int i5 = this.f4326j;
                        if (i5 != -1) {
                            i4 = a - i5;
                        }
                        if (i4 > 0) {
                            a -= i4;
                            tVar.mo20005K(tVar.mo20010c() + a);
                        }
                        this.f4317a.mo18766b(tVar);
                        int i6 = this.f4326j;
                        if (i6 != -1) {
                            int i7 = i6 - a;
                            this.f4326j = i7;
                            if (i7 == 0) {
                                this.f4317a.mo18768d();
                                mo18848g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (mo18845d(tVar, this.f4318b.f5873a, 9)) {
                    if (mo18846e()) {
                        i4 = 2;
                    }
                    mo18848g(i4);
                }
            } else {
                tVar.mo20007M(tVar.mo20008a());
            }
        }
    }

    /* renamed from: c */
    public final void mo18758c() {
        this.f4319c = 0;
        this.f4320d = 0;
        this.f4324h = false;
        this.f4317a.mo18767c();
    }

    /* renamed from: d */
    public final boolean mo18845d(C3173t tVar, byte[] bArr, int i) {
        int min = Math.min(tVar.mo20008a(), i - this.f4320d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            tVar.mo20007M(min);
        } else {
            tVar.mo20015h(bArr, this.f4320d, min);
        }
        int i2 = this.f4320d + min;
        this.f4320d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo18846e() {
        this.f4318b.mo19991n(0);
        int h = this.f4318b.mo19985h(24);
        if (h != 1) {
            C3163m.m7880f("PesReader", "Unexpected start code prefix: " + h);
            this.f4326j = -1;
            return false;
        }
        this.f4318b.mo19993p(8);
        int h2 = this.f4318b.mo19985h(16);
        this.f4318b.mo19993p(5);
        this.f4327k = this.f4318b.mo19984g();
        this.f4318b.mo19993p(2);
        this.f4322f = this.f4318b.mo19984g();
        this.f4323g = this.f4318b.mo19984g();
        this.f4318b.mo19993p(6);
        int h3 = this.f4318b.mo19985h(8);
        this.f4325i = h3;
        if (h2 == 0) {
            this.f4326j = -1;
        } else {
            this.f4326j = ((h2 + 6) - 9) - h3;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo18847f() {
        this.f4318b.mo19991n(0);
        this.f4328l = -9223372036854775807L;
        if (this.f4322f) {
            this.f4318b.mo19993p(4);
            this.f4318b.mo19993p(1);
            this.f4318b.mo19993p(1);
            long h = (((long) this.f4318b.mo19985h(3)) << 30) | ((long) (this.f4318b.mo19985h(15) << 15)) | ((long) this.f4318b.mo19985h(15));
            this.f4318b.mo19993p(1);
            if (!this.f4324h && this.f4323g) {
                this.f4318b.mo19993p(4);
                this.f4318b.mo19993p(1);
                this.f4318b.mo19993p(1);
                this.f4318b.mo19993p(1);
                this.f4321e.mo19944b((((long) this.f4318b.mo19985h(3)) << 30) | ((long) (this.f4318b.mo19985h(15) << 15)) | ((long) this.f4318b.mo19985h(15)));
                this.f4324h = true;
            }
            this.f4328l = this.f4321e.mo19944b(h);
        }
    }

    /* renamed from: g */
    public final void mo18848g(int i) {
        this.f4319c = i;
        this.f4320d = 0;
    }
}
