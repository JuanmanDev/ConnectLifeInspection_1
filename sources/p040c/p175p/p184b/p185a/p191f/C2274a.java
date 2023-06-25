package p040c.p175p.p184b.p185a.p191f;

import com.github.mikephil.charting.data.BarEntry;
import p040c.p175p.p184b.p185a.p189d.C2260b;
import p040c.p175p.p184b.p185a.p192g.p193a.C2284a;
import p040c.p175p.p184b.p185a.p192g.p194b.C2292a;
import p040c.p175p.p184b.p185a.p199k.C2341d;

/* renamed from: c.p.b.a.f.a */
/* compiled from: BarHighlighter */
public class C2274a extends C2275b<C2284a> {
    public C2274a(C2284a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public C2277d mo17314a(float f, float f2) {
        C2277d a = super.mo17314a(f, f2);
        if (a == null) {
            return null;
        }
        C2341d j = mo17325j(f, f2);
        C2292a aVar = (C2292a) ((C2284a) this.f2381a).getBarData().mo17277d(a.mo17329d());
        if (aVar.mo17365z0()) {
            return mo17318l(a, aVar, (float) j.f2535c, (float) j.f2536d);
        }
        C2341d.m3922c(j);
        return a;
    }

    /* renamed from: d */
    public C2260b mo17315d() {
        return ((C2284a) this.f2381a).getBarData();
    }

    /* renamed from: e */
    public float mo17316e(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    /* renamed from: k */
    public int mo17317k(C2283j[] jVarArr, float f) {
        if (jVarArr == null || jVarArr.length == 0) {
            return 0;
        }
        int i = 0;
        for (C2283j a : jVarArr) {
            if (a.mo17342a(f)) {
                return i;
            }
            i++;
        }
        int max = Math.max(jVarArr.length - 1, 0);
        if (f > jVarArr[max].f2397b) {
            return max;
        }
        return 0;
    }

    /* renamed from: l */
    public C2277d mo17318l(C2277d dVar, C2292a aVar, float f, float f2) {
        BarEntry barEntry = (BarEntry) aVar.mo17410t(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.mo23868j() == null) {
            return dVar;
        }
        C2283j[] i = barEntry.mo23867i();
        if (i.length <= 0) {
            return null;
        }
        int k = mo17317k(i, f2);
        C2341d e = ((C2284a) this.f2381a).mo17347a(aVar.mo17384F0()).mo17592e(dVar.mo17333h(), i[k].f2397b);
        C2277d dVar2 = new C2277d(barEntry.mo23876f(), barEntry.mo17271c(), (float) e.f2535c, (float) e.f2536d, dVar.mo17329d(), k, dVar.mo17327b());
        C2341d.m3922c(e);
        return dVar2;
    }
}
