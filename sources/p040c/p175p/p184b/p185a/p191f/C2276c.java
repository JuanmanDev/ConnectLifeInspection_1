package p040c.p175p.p184b.p185a.p191f;

import com.github.mikephil.charting.data.DataSet$Rounding;
import java.util.List;
import p040c.p175p.p184b.p185a.p189d.C2259a;
import p040c.p175p.p184b.p185a.p189d.C2260b;
import p040c.p175p.p184b.p185a.p189d.C2264f;
import p040c.p175p.p184b.p185a.p192g.p193a.C2284a;
import p040c.p175p.p184b.p185a.p192g.p193a.C2289f;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;

/* renamed from: c.p.b.a.f.c */
/* compiled from: CombinedHighlighter */
public class C2276c extends C2275b<C2289f> implements C2279f {

    /* renamed from: c */
    public C2274a f2383c;

    public C2276c(C2289f fVar, C2284a aVar) {
        super(fVar);
        this.f2383c = aVar.getBarData() == null ? null : new C2274a(aVar);
    }

    /* renamed from: h */
    public List<C2277d> mo17323h(float f, float f2, float f3) {
        this.f2382b.clear();
        List<C2260b> r = ((C2289f) this.f2381a).getCombinedData().mo17291r();
        for (int i = 0; i < r.size(); i++) {
            C2264f fVar = r.get(i);
            C2274a aVar = this.f2383c;
            if (aVar == null || !(fVar instanceof C2259a)) {
                int e = fVar.mo17278e();
                for (int i2 = 0; i2 < e; i2++) {
                    C2296e d = r.get(i).mo17277d(i2);
                    if (d.mo17390L0()) {
                        for (C2277d next : mo17319b(d, i2, f, DataSet$Rounding.CLOSEST)) {
                            next.mo17337l(i);
                            this.f2382b.add(next);
                        }
                    }
                }
            } else {
                C2277d a = aVar.mo17314a(f2, f3);
                if (a != null) {
                    a.mo17337l(i);
                    this.f2382b.add(a);
                }
            }
        }
        return this.f2382b;
    }
}
