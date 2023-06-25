package p040c.p175p.p184b.p185a.p191f;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import p040c.p175p.p184b.p185a.p189d.C2268j;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2347i;

/* renamed from: c.p.b.a.f.i */
/* compiled from: RadarHighlighter */
public class C2282i extends C2281h<RadarChart> {
    public C2282i(RadarChart radarChart) {
        super(radarChart);
    }

    /* renamed from: b */
    public C2277d mo17340b(int i, float f, float f2) {
        List<C2277d> c = mo17341c(i);
        float x = ((RadarChart) this.f2394a).mo23791x(f, f2) / ((RadarChart) this.f2394a).getFactor();
        C2277d dVar = null;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < c.size(); i2++) {
            C2277d dVar2 = c.get(i2);
            float abs = Math.abs(dVar2.mo17335j() - x);
            if (abs < f3) {
                dVar = dVar2;
                f3 = abs;
            }
        }
        return dVar;
    }

    /* renamed from: c */
    public List<C2277d> mo17341c(int i) {
        int i2 = i;
        this.f2395b.clear();
        float a = ((RadarChart) this.f2394a).getAnimator().mo17224a();
        float b = ((RadarChart) this.f2394a).getAnimator().mo17225b();
        float sliceAngle = ((RadarChart) this.f2394a).getSliceAngle();
        float factor = ((RadarChart) this.f2394a).getFactor();
        C2342e c = C2342e.m3925c(0.0f, 0.0f);
        int i3 = 0;
        while (i3 < ((C2268j) ((RadarChart) this.f2394a).getData()).mo17278e()) {
            C2296e d = ((C2268j) ((RadarChart) this.f2394a).getData()).mo17277d(i3);
            Entry O = d.mo17392O(i2);
            float f = (float) i2;
            C2347i.m3970q(((RadarChart) this.f2394a).getCenterOffsets(), (O.mo17271c() - ((RadarChart) this.f2394a).getYChartMin()) * factor * b, (sliceAngle * f * a) + ((RadarChart) this.f2394a).getRotationAngle(), c);
            List<C2277d> list = this.f2395b;
            C2277d dVar = r8;
            C2277d dVar2 = new C2277d(f, O.mo17271c(), c.f2538c, c.f2539d, i3, d.mo17384F0());
            list.add(dVar);
            i3++;
            i2 = i;
        }
        return this.f2395b;
    }
}
