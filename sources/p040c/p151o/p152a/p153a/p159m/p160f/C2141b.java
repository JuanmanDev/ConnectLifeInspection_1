package p040c.p151o.p152a.p153a.p159m.p160f;

import p040c.p151o.p152a.p153a.C2101d;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p154i.p155d.C2109a;
import p040c.p151o.p152a.p153a.p156j.C2125e;
import p040c.p151o.p152a.p153a.p159m.C2139e;
import p040c.p151o.p152a.p153a.p159m.p160f.p161c.C2143a;
import p040c.p151o.p152a.p153a.p164n.C2148a;

/* renamed from: c.o.a.a.m.f.b */
/* compiled from: LinkAccountsResolver */
public class C2141b<A extends C2109a> extends C2139e<A> implements C2140a {

    /* renamed from: d */
    public C2143a f2110d;

    /* renamed from: c.o.a.a.m.f.b$a */
    /* compiled from: LinkAccountsResolver */
    public class C2142a extends C2101d<C2125e> {
        public C2142a() {
        }

        /* renamed from: a */
        public void mo16860a(C2148a aVar) {
            C2141b.this.f2107a.mo16860a(aVar);
        }

        /* renamed from: e */
        public void mo16863d(C2125e eVar) {
            if (eVar.mo16924d() == 0) {
                C2143a unused = C2141b.this.f2110d = (C2143a) eVar.mo16926f("conflictingAccount", C2143a.class);
                if (C2141b.this.f2110d == null) {
                    C2141b.this.f2107a.mo16860a(C2148a.m3193e());
                } else {
                    C2141b.this.f2107a.mo16866e(C2141b.this.f2108b, C2141b.this);
                }
            } else {
                C2141b.this.f2107a.mo16860a(C2148a.m3192d(eVar));
            }
        }
    }

    /* renamed from: j */
    public void mo16948j() {
        C2103f.m3056b("GigyaLinkAccountsResolver", "init: sending fetching conflicting accounts");
        this.f2109c.mo16900c(mo16947b(), new C2142a());
    }
}
