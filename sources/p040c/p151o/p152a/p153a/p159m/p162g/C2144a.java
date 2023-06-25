package p040c.p151o.p152a.p153a.p159m.p162g;

import java.util.List;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.C2104g;
import p040c.p151o.p152a.p153a.p154i.p155d.C2109a;
import p040c.p151o.p152a.p153a.p156j.C2125e;
import p040c.p151o.p152a.p153a.p157k.C2130b;
import p040c.p151o.p152a.p153a.p159m.C2139e;
import p040c.p151o.p152a.p153a.p159m.p162g.p163c.C2147a;
import p040c.p151o.p152a.p153a.p164n.C2148a;

/* renamed from: c.o.a.a.m.g.a */
/* compiled from: TFAProviderResolver */
public class C2144a<A extends C2109a> extends C2139e {

    /* renamed from: d */
    public final C2130b f2112d;

    /* renamed from: c.o.a.a.m.g.a$a */
    /* compiled from: TFAProviderResolver */
    public class C2145a extends C2104g<C2147a> {
        public C2145a() {
        }

        /* renamed from: a */
        public void mo16860a(C2148a aVar) {
            C2144a.this.f2107a.mo16860a(aVar);
        }

        /* renamed from: k */
        public void mo16863d(C2147a aVar) {
            List<Object> b = aVar.mo16952b();
            List<Object> c = aVar.mo16953c();
            C2130b f = C2144a.this.f2112d;
            f.mo16929b(C2125e.class, C2144a.this.f2108b);
            f.mo16929b(C2104g.class, C2144a.this.f2107a);
            try {
                C2146b bVar = (C2146b) C2144a.this.f2112d.mo16932d(C2146b.class);
                if (C2144a.this.f2108b.mo16924d() == 403102) {
                    C2144a.this.f2107a.mo16869h(C2144a.this.f2108b, c, bVar);
                } else if (C2144a.this.f2108b.mo16924d() == 403101) {
                    C2144a.this.f2107a.mo16870i(C2144a.this.f2108b, b, bVar);
                }
            } catch (Exception e) {
                e.printStackTrace();
                C2144a.this.f2107a.mo16860a(C2148a.m3193e());
            } catch (Throwable th) {
                C2144a.this.f2112d.mo16934f();
                throw th;
            }
            C2144a.this.f2112d.mo16934f();
        }
    }

    /* renamed from: n */
    public void mo16950n() {
        C2103f.m3056b("TfaProviderResolver", "getProviders: ");
        try {
            this.f2109c.mo16904g(mo16947b(), new C2145a());
        } catch (Exception e) {
            e.printStackTrace();
            this.f2107a.mo16860a(C2148a.m3193e());
        }
    }
}
