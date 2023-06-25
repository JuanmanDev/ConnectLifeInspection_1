package p040c.p175p.p184b.p185a.p189d;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p194b.C2293b;

/* renamed from: c.p.b.a.d.g */
/* compiled from: CombinedData */
public class C2265g extends C2260b<C2293b<? extends Entry>> {

    /* renamed from: j */
    public C2266h f2373j;

    /* renamed from: k */
    public C2259a f2374k;

    /* renamed from: l */
    public C2269k f2375l;

    /* renamed from: m */
    public C2263e f2376m;

    /* renamed from: n */
    public C2262d f2377n;

    /* renamed from: a */
    public void mo17274a() {
        if (this.f2372i == null) {
            this.f2372i = new ArrayList();
        }
        this.f2372i.clear();
        this.f2364a = -3.4028235E38f;
        this.f2365b = Float.MAX_VALUE;
        this.f2366c = -3.4028235E38f;
        this.f2367d = Float.MAX_VALUE;
        this.f2368e = -3.4028235E38f;
        this.f2369f = Float.MAX_VALUE;
        this.f2370g = -3.4028235E38f;
        this.f2371h = Float.MAX_VALUE;
        for (C2264f next : mo17291r()) {
            next.mo17274a();
            this.f2372i.addAll(next.mo17279f());
            if (next.mo17287n() > this.f2364a) {
                this.f2364a = next.mo17287n();
            }
            if (next.mo17289p() < this.f2365b) {
                this.f2365b = next.mo17289p();
            }
            if (next.mo17285l() > this.f2366c) {
                this.f2366c = next.mo17285l();
            }
            if (next.mo17286m() < this.f2367d) {
                this.f2367d = next.mo17286m();
            }
            float f = next.f2368e;
            if (f > this.f2368e) {
                this.f2368e = f;
            }
            float f2 = next.f2369f;
            if (f2 < this.f2369f) {
                this.f2369f = f2;
            }
            float f3 = next.f2370g;
            if (f3 > this.f2370g) {
                this.f2370g = f3;
            }
            float f4 = next.f2371h;
            if (f4 < this.f2371h) {
                this.f2371h = f4;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.github.mikephil.charting.data.Entry mo17281h(p040c.p175p.p184b.p185a.p191f.C2277d r6) {
        /*
            r5 = this;
            int r0 = r6.mo17328c()
            java.util.List r1 = r5.mo17291r()
            int r1 = r1.size()
            r2 = 0
            if (r0 < r1) goto L_0x0010
            return r2
        L_0x0010:
            int r0 = r6.mo17328c()
            c.p.b.a.d.b r0 = r5.mo17295v(r0)
            int r1 = r6.mo17329d()
            int r3 = r0.mo17278e()
            if (r1 < r3) goto L_0x0023
            return r2
        L_0x0023:
            int r1 = r6.mo17329d()
            c.p.b.a.g.b.e r0 = r0.mo17277d(r1)
            float r1 = r6.mo17333h()
            java.util.List r0 = r0.mo17407p0(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0037:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            com.github.mikephil.charting.data.Entry r1 = (com.github.mikephil.charting.data.Entry) r1
            float r3 = r1.mo17271c()
            float r4 = r6.mo17335j()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0059
            float r3 = r6.mo17335j()
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L_0x0037
        L_0x0059:
            return r1
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p184b.p185a.p189d.C2265g.mo17281h(c.p.b.a.f.d):com.github.mikephil.charting.data.Entry");
    }

    /* renamed from: r */
    public List<C2260b> mo17291r() {
        ArrayList arrayList = new ArrayList();
        C2266h hVar = this.f2373j;
        if (hVar != null) {
            arrayList.add(hVar);
        }
        C2259a aVar = this.f2374k;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        C2269k kVar = this.f2375l;
        if (kVar != null) {
            arrayList.add(kVar);
        }
        C2263e eVar = this.f2376m;
        if (eVar != null) {
            arrayList.add(eVar);
        }
        C2262d dVar = this.f2377n;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        return arrayList;
    }

    /* renamed from: s */
    public C2259a mo17292s() {
        return this.f2374k;
    }

    /* renamed from: t */
    public C2262d mo17293t() {
        return this.f2377n;
    }

    /* renamed from: u */
    public C2263e mo17294u() {
        return this.f2376m;
    }

    /* renamed from: v */
    public C2260b mo17295v(int i) {
        return mo17291r().get(i);
    }

    /* renamed from: w */
    public C2293b<? extends Entry> mo17296w(C2277d dVar) {
        if (dVar.mo17328c() >= mo17291r().size()) {
            return null;
        }
        C2260b v = mo17295v(dVar.mo17328c());
        if (dVar.mo17329d() >= v.mo17278e()) {
            return null;
        }
        return (C2293b) v.mo17279f().get(dVar.mo17329d());
    }

    /* renamed from: x */
    public C2266h mo17297x() {
        return this.f2373j;
    }

    /* renamed from: y */
    public C2269k mo17298y() {
        return this.f2375l;
    }
}
