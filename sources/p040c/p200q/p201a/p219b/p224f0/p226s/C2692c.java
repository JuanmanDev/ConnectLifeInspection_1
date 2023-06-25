package p040c.p200q.p201a.p219b.p224f0.p226s;

import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.s.c */
/* compiled from: FlvExtractor */
public final class C2692c implements C2674g {

    /* renamed from: p */
    public static final int f3481p = C3152e0.m7764D("FLV");

    /* renamed from: a */
    public final C3173t f3482a = new C3173t(4);

    /* renamed from: b */
    public final C3173t f3483b = new C3173t(9);

    /* renamed from: c */
    public final C3173t f3484c = new C3173t(11);

    /* renamed from: d */
    public final C3173t f3485d = new C3173t();

    /* renamed from: e */
    public final C2693d f3486e = new C2693d();

    /* renamed from: f */
    public C2676i f3487f;

    /* renamed from: g */
    public int f3488g = 1;

    /* renamed from: h */
    public long f3489h = -9223372036854775807L;

    /* renamed from: i */
    public int f3490i;

    /* renamed from: j */
    public int f3491j;

    /* renamed from: k */
    public int f3492k;

    /* renamed from: l */
    public long f3493l;

    /* renamed from: m */
    public boolean f3494m;

    /* renamed from: n */
    public C2691b f3495n;

    /* renamed from: o */
    public C2694e f3496o;

    static {
        C2690a aVar = C2690a.f3476a;
    }

    /* renamed from: c */
    public static /* synthetic */ C2674g[] m5323c() {
        return new C2674g[]{new C2692c()};
    }

    /* renamed from: a */
    public final void mo18582a() {
        if (!this.f3494m) {
            this.f3487f.mo18553c(new C2682o.C2684b(-9223372036854775807L));
            this.f3494m = true;
        }
        if (this.f3489h == -9223372036854775807L) {
            this.f3489h = this.f3486e.mo18588d() == -9223372036854775807L ? -this.f3493l : 0;
        }
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        hVar.mo18531i(this.f3482a.f5877a, 0, 3);
        this.f3482a.mo20006L(0);
        if (this.f3482a.mo19996B() != f3481p) {
            return false;
        }
        hVar.mo18531i(this.f3482a.f5877a, 0, 2);
        this.f3482a.mo20006L(0);
        if ((this.f3482a.mo19999E() & 250) != 0) {
            return false;
        }
        hVar.mo18531i(this.f3482a.f5877a, 0, 4);
        this.f3482a.mo20006L(0);
        int j = this.f3482a.mo20017j();
        hVar.mo18527f();
        hVar.mo18525d(j);
        hVar.mo18531i(this.f3482a.f5877a, 0, 4);
        this.f3482a.mo20006L(0);
        if (this.f3482a.mo20017j() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C3173t mo18583d(C2675h hVar) {
        if (this.f3492k > this.f3485d.mo20009b()) {
            C3173t tVar = this.f3485d;
            tVar.mo20004J(new byte[Math.max(tVar.mo20009b() * 2, this.f3492k)], 0);
        } else {
            this.f3485d.mo20006L(0);
        }
        this.f3485d.mo20005K(this.f3492k);
        hVar.readFully(this.f3485d.f5877a, 0, this.f3492k);
        return this.f3485d;
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        while (true) {
            int i = this.f3488g;
            if (i != 1) {
                if (i == 2) {
                    mo18587k(hVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (mo18585i(hVar)) {
                        return 0;
                    }
                } else if (!mo18586j(hVar)) {
                    return -1;
                }
            } else if (!mo18584h(hVar)) {
                return -1;
            }
        }
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f3487f = iVar;
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        this.f3488g = 1;
        this.f3489h = -9223372036854775807L;
        this.f3490i = 0;
    }

    /* renamed from: h */
    public final boolean mo18584h(C2675h hVar) {
        boolean z = false;
        if (!hVar.mo18522a(this.f3483b.f5877a, 0, 9, true)) {
            return false;
        }
        this.f3483b.mo20006L(0);
        this.f3483b.mo20007M(4);
        int y = this.f3483b.mo20032y();
        boolean z2 = (y & 4) != 0;
        if ((y & 1) != 0) {
            z = true;
        }
        if (z2 && this.f3495n == null) {
            this.f3495n = new C2691b(this.f3487f.mo18552a(8, 1));
        }
        if (z && this.f3496o == null) {
            this.f3496o = new C2694e(this.f3487f.mo18552a(9, 2));
        }
        this.f3487f.mo18554o();
        this.f3490i = (this.f3483b.mo20017j() - 9) + 4;
        this.f3488g = 2;
        return true;
    }

    /* renamed from: i */
    public final boolean mo18585i(C2675h hVar) {
        boolean z = true;
        if (this.f3491j == 8 && this.f3495n != null) {
            mo18582a();
            this.f3495n.mo24005a(mo18583d(hVar), this.f3489h + this.f3493l);
        } else if (this.f3491j == 9 && this.f3496o != null) {
            mo18582a();
            this.f3496o.mo24005a(mo18583d(hVar), this.f3489h + this.f3493l);
        } else if (this.f3491j != 18 || this.f3494m) {
            hVar.mo18528g(this.f3492k);
            z = false;
        } else {
            this.f3486e.mo24005a(mo18583d(hVar), this.f3493l);
            long d = this.f3486e.mo18588d();
            if (d != -9223372036854775807L) {
                this.f3487f.mo18553c(new C2682o.C2684b(d));
                this.f3494m = true;
            }
        }
        this.f3490i = 4;
        this.f3488g = 2;
        return z;
    }

    /* renamed from: j */
    public final boolean mo18586j(C2675h hVar) {
        if (!hVar.mo18522a(this.f3484c.f5877a, 0, 11, true)) {
            return false;
        }
        this.f3484c.mo20006L(0);
        this.f3491j = this.f3484c.mo20032y();
        this.f3492k = this.f3484c.mo19996B();
        this.f3493l = (long) this.f3484c.mo19996B();
        this.f3493l = (((long) (this.f3484c.mo20032y() << 24)) | this.f3493l) * 1000;
        this.f3484c.mo20007M(3);
        this.f3488g = 4;
        return true;
    }

    /* renamed from: k */
    public final void mo18587k(C2675h hVar) {
        hVar.mo18528g(this.f3490i);
        this.f3490i = 0;
        this.f3488g = 3;
    }

    public void release() {
    }
}
