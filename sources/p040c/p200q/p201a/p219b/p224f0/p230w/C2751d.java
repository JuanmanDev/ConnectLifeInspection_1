package p040c.p200q.p201a.p219b.p224f0.p230w;

import com.google.android.exoplayer2.ParserException;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.w.d */
/* compiled from: OggExtractor */
public class C2751d implements C2674g {

    /* renamed from: a */
    public C2676i f3981a;

    /* renamed from: b */
    public C2756i f3982b;

    /* renamed from: c */
    public boolean f3983c;

    static {
        C2745a aVar = C2745a.f3960a;
    }

    /* renamed from: a */
    public static /* synthetic */ C2674g[] m5648a() {
        return new C2674g[]{new C2751d()};
    }

    /* renamed from: c */
    public static C3173t m5649c(C3173t tVar) {
        tVar.mo20006L(0);
        return tVar;
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        try {
            return mo18710d(hVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo18710d(C2675h hVar) {
        C2753f fVar = new C2753f();
        if (fVar.mo18717a(hVar, true) && (fVar.f3991b & 2) == 2) {
            int min = Math.min(fVar.f3995f, 8);
            C3173t tVar = new C3173t(min);
            hVar.mo18531i(tVar.f5877a, 0, min);
            m5649c(tVar);
            if (C2749c.m5635o(tVar)) {
                this.f3982b = new C2749c();
            } else {
                m5649c(tVar);
                if (C2761k.m5694p(tVar)) {
                    this.f3982b = new C2761k();
                } else {
                    m5649c(tVar);
                    if (C2755h.m5666n(tVar)) {
                        this.f3982b = new C2755h();
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        if (this.f3982b == null) {
            if (mo18710d(hVar)) {
                hVar.mo18527f();
            } else {
                throw new ParserException("Failed to determine bitstream type");
            }
        }
        if (!this.f3983c) {
            C2686q a = this.f3981a.mo18552a(0, 1);
            this.f3981a.mo18554o();
            this.f3982b.mo18723c(this.f3981a, a);
            this.f3983c = true;
        }
        return this.f3982b.mo18725f(hVar, nVar);
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f3981a = iVar;
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        C2756i iVar = this.f3982b;
        if (iVar != null) {
            iVar.mo18728k(j, j2);
        }
    }

    public void release() {
    }
}
