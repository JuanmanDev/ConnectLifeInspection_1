package p040c.p200q.p201a.p219b.p224f0.p232y;

import p040c.p200q.p201a.p219b.p221c0.C2596g;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.e */
/* compiled from: Ac3Extractor */
public final class C2780e implements C2674g {

    /* renamed from: e */
    public static final int f4091e = C3152e0.m7764D("ID3");

    /* renamed from: a */
    public final long f4092a;

    /* renamed from: b */
    public final C2786f f4093b;

    /* renamed from: c */
    public final C3173t f4094c;

    /* renamed from: d */
    public boolean f4095d;

    static {
        C2769a aVar = C2769a.f4045a;
    }

    public C2780e() {
        this(0);
    }

    /* renamed from: a */
    public static /* synthetic */ C2674g[] m5769a() {
        return new C2674g[]{new C2780e()};
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        C3173t tVar = new C3173t(10);
        int i = 0;
        while (true) {
            hVar.mo18531i(tVar.f5877a, 0, 10);
            tVar.mo20006L(0);
            if (tVar.mo19996B() != f4091e) {
                break;
            }
            tVar.mo20007M(3);
            int x = tVar.mo20031x();
            i += x + 10;
            hVar.mo18525d(x);
        }
        hVar.mo18527f();
        hVar.mo18525d(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            hVar.mo18531i(tVar.f5877a, 0, 6);
            tVar.mo20006L(0);
            if (tVar.mo19999E() != 2935) {
                hVar.mo18527f();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                hVar.mo18525d(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int f = C2596g.m4819f(tVar.f5877a);
                if (f == -1) {
                    return false;
                }
                hVar.mo18525d(f - 6);
            }
        }
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        int read = hVar.read(this.f4094c.f5877a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f4094c.mo20006L(0);
        this.f4094c.mo20005K(read);
        if (!this.f4095d) {
            this.f4093b.mo18770f(this.f4092a, 4);
            this.f4095d = true;
        }
        this.f4093b.mo18766b(this.f4094c);
        return 0;
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f4093b.mo18769e(iVar, new C2781e0.C2785d(0, 1));
        iVar.mo18554o();
        iVar.mo18553c(new C2682o.C2684b(-9223372036854775807L));
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        this.f4095d = false;
        this.f4093b.mo18767c();
    }

    public void release() {
    }

    public C2780e(long j) {
        this.f4092a = j;
        this.f4093b = new C2786f();
        this.f4094c = new C3173t(2786);
    }
}
