package p040c.p151o.p152a.p153a.p159m;

import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.C2104g;
import p040c.p151o.p152a.p153a.p156j.C2125e;
import p040c.p151o.p152a.p153a.p157k.C2130b;
import p040c.p151o.p152a.p153a.p159m.p160f.C2141b;
import p040c.p151o.p152a.p153a.p159m.p162g.C2144a;
import p040c.p151o.p152a.p153a.p164n.C2148a;

/* renamed from: c.o.a.a.m.c */
/* compiled from: InterruptionResolverFactory */
public class C2137c implements C2135a {

    /* renamed from: a */
    public final C2130b f2105a;

    /* renamed from: b */
    public boolean f2106b;

    /* renamed from: a */
    public void mo16943a(C2125e eVar, C2104g gVar) {
        if (!this.f2106b) {
            gVar.mo16860a(C2148a.m3192d(eVar));
            return;
        }
        C2130b c = this.f2105a.clone();
        c.mo16929b(C2125e.class, eVar);
        c.mo16929b(C2104g.class, gVar);
        int d = eVar.mo16924d();
        C2103f.m3056b("InterruptionResolverFactory", "resolve: with errorCode = " + d + " callID: " + eVar.mo16923c());
        switch (d) {
            case 200009:
                ((C2139e) c.mo16932d(C2139e.class)).mo16946a((Runnable) null);
                break;
            case 206001:
                gVar.mo16868g(eVar, (C2138d) c.mo16932d(C2138d.class));
                break;
            case 206002:
                gVar.mo16871j(eVar, mo16944b(eVar));
                break;
            case 403043:
                ((C2141b) c.mo16932d(C2141b.class)).mo16948j();
                break;
            case 403100:
                gVar.mo16867f(eVar);
                break;
            case 403101:
            case 403102:
                ((C2144a) c.mo16932d(C2144a.class)).mo16950n();
                break;
            default:
                try {
                    mo16945c(eVar, gVar);
                    break;
                } catch (Exception e) {
                    C2103f.m3057c("InterruptionResolverFactory", e.getMessage());
                    mo16945c(eVar, gVar);
                    break;
                } catch (Throwable th) {
                    c.mo16934f();
                    throw th;
                }
        }
        c.mo16934f();
    }

    /* renamed from: b */
    public final String mo16944b(C2125e eVar) {
        return (String) eVar.mo16926f("regToken", String.class);
    }

    /* renamed from: c */
    public final void mo16945c(C2125e eVar, C2104g gVar) {
        gVar.mo16860a(C2148a.m3192d(eVar));
    }
}
