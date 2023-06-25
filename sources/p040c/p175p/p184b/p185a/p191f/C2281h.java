package p040c.p175p.p184b.p185a.p191f;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.p.b.a.f.h */
/* compiled from: PieRadarHighlighter */
public abstract class C2281h<T extends PieRadarChartBase> implements C2279f {

    /* renamed from: a */
    public T f2394a;

    /* renamed from: b */
    public List<C2277d> f2395b = new ArrayList();

    public C2281h(T t) {
        this.f2394a = t;
    }

    /* renamed from: a */
    public C2277d mo17314a(float f, float f2) {
        if (this.f2394a.mo23791x(f, f2) > this.f2394a.getRadius()) {
            return null;
        }
        float y = this.f2394a.mo23792y(f, f2);
        T t = this.f2394a;
        if (t instanceof PieChart) {
            y /= t.getAnimator().mo17225b();
        }
        int z = this.f2394a.mo23778z(y);
        if (z < 0 || z >= this.f2394a.getData().mo17284k().mo17385H0()) {
            return null;
        }
        return mo17340b(z, f, f2);
    }

    /* renamed from: b */
    public abstract C2277d mo17340b(int i, float f, float f2);
}
