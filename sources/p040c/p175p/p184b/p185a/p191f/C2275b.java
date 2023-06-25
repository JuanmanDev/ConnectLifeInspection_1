package p040c.p175p.p184b.p185a.p191f;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet$Rounding;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import p040c.p175p.p184b.p185a.p189d.C2260b;
import p040c.p175p.p184b.p185a.p192g.p193a.C2285b;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;
import p040c.p175p.p184b.p185a.p199k.C2341d;

/* renamed from: c.p.b.a.f.b */
/* compiled from: ChartHighlighter */
public class C2275b<T extends C2285b> implements C2279f {

    /* renamed from: a */
    public T f2381a;

    /* renamed from: b */
    public List<C2277d> f2382b = new ArrayList();

    public C2275b(T t) {
        this.f2381a = t;
    }

    /* renamed from: a */
    public C2277d mo17314a(float f, float f2) {
        C2341d j = mo17325j(f, f2);
        C2341d.m3922c(j);
        return mo17321f((float) j.f2535c, f, f2);
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
            C2341d e = this.f2381a.mo17347a(eVar.mo17384F0()).mo17592e(entry.mo23876f(), entry.mo17271c());
            arrayList.add(new C2277d(entry.mo23876f(), entry.mo17271c(), (float) e.f2535c, (float) e.f2536d, i, eVar.mo17384F0()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public C2277d mo17320c(List<C2277d> list, float f, float f2, YAxis.AxisDependency axisDependency, float f3) {
        C2277d dVar = null;
        for (int i = 0; i < list.size(); i++) {
            C2277d dVar2 = list.get(i);
            if (axisDependency == null || dVar2.mo17327b() == axisDependency) {
                float e = mo17316e(f, f2, dVar2.mo17334i(), dVar2.mo17336k());
                if (e < f3) {
                    dVar = dVar2;
                    f3 = e;
                }
            }
        }
        return dVar;
    }

    /* renamed from: d */
    public C2260b mo17315d() {
        return this.f2381a.getData();
    }

    /* renamed from: e */
    public float mo17316e(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f - f3), (double) (f2 - f4));
    }

    /* renamed from: f */
    public C2277d mo17321f(float f, float f2, float f3) {
        List<C2277d> h = mo17323h(f, f2, f3);
        if (h.isEmpty()) {
            return null;
        }
        return mo17320c(h, f2, f3, mo17324i(h, f3, YAxis.AxisDependency.LEFT) < mo17324i(h, f3, YAxis.AxisDependency.RIGHT) ? YAxis.AxisDependency.LEFT : YAxis.AxisDependency.RIGHT, this.f2381a.getMaxHighlightDistance());
    }

    /* renamed from: g */
    public float mo17322g(C2277d dVar) {
        return dVar.mo17336k();
    }

    /* renamed from: h */
    public List<C2277d> mo17323h(float f, float f2, float f3) {
        this.f2382b.clear();
        C2260b d = mo17315d();
        if (d == null) {
            return this.f2382b;
        }
        int e = d.mo17278e();
        for (int i = 0; i < e; i++) {
            C2296e d2 = d.mo17277d(i);
            if (d2.mo17390L0()) {
                this.f2382b.addAll(mo17319b(d2, i, f, DataSet$Rounding.CLOSEST));
            }
        }
        return this.f2382b;
    }

    /* renamed from: i */
    public float mo17324i(List<C2277d> list, float f, YAxis.AxisDependency axisDependency) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            C2277d dVar = list.get(i);
            if (dVar.mo17327b() == axisDependency) {
                float abs = Math.abs(mo17322g(dVar) - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
        }
        return f2;
    }

    /* renamed from: j */
    public C2341d mo17325j(float f, float f2) {
        return this.f2381a.mo17347a(YAxis.AxisDependency.LEFT).mo17594g(f, f2);
    }
}
