package p040c.p175p.p184b.p185a.p191f;

import com.github.mikephil.charting.data.DataSet$Rounding;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import p040c.p175p.p184b.p185a.p189d.C2259a;
import p040c.p175p.p184b.p185a.p192g.p193a.C2284a;
import p040c.p175p.p184b.p185a.p192g.p194b.C2292a;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;
import p040c.p175p.p184b.p185a.p199k.C2341d;

/* renamed from: c.p.b.a.f.e */
/* compiled from: HorizontalBarHighlighter */
public class C2278e extends C2274a {
    public C2278e(C2284a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public C2277d mo17314a(float f, float f2) {
        C2259a barData = ((C2284a) this.f2381a).getBarData();
        C2341d j = mo17325j(f2, f);
        C2277d f3 = mo17321f((float) j.f2536d, f2, f);
        if (f3 == null) {
            return null;
        }
        C2292a aVar = (C2292a) barData.mo17277d(f3.mo17329d());
        if (aVar.mo17365z0()) {
            return mo17318l(f3, aVar, (float) j.f2536d, (float) j.f2535c);
        }
        C2341d.m3922c(j);
        return f3;
    }

    /* renamed from: b */
    public List<C2277d> mo17319b(C2296e eVar, int i, float f, DataSet$Rounding dataSet$Rounding) {
        Entry f0;
        ArrayList arrayList = new ArrayList();
        List<Entry> p0 = eVar.mo17407p0(f);
        if (p0.size() == 0 && (f0 = eVar.mo17399f0(f, Float.NaN, dataSet$Rounding)) != null) {
            p0 = eVar.mo17407p0(f0.mo23876f());
        }
        if (p0.size() == 0) {
            return arrayList;
        }
        for (Entry entry : p0) {
            C2341d e = ((C2284a) this.f2381a).mo17347a(eVar.mo17384F0()).mo17592e(entry.mo17271c(), entry.mo23876f());
            arrayList.add(new C2277d(entry.mo23876f(), entry.mo17271c(), (float) e.f2535c, (float) e.f2536d, i, eVar.mo17384F0()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public float mo17316e(float f, float f2, float f3, float f4) {
        return Math.abs(f2 - f4);
    }
}
