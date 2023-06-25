package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.YAxis;
import p040c.p175p.p184b.p185a.p189d.C2259a;
import p040c.p175p.p184b.p185a.p191f.C2274a;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2284a;
import p040c.p175p.p184b.p185a.p197j.C2311b;

public class BarChart extends BarLineChartBase<C2259a> implements C2284a {

    /* renamed from: A0 */
    public boolean f7359A0 = true;

    /* renamed from: B0 */
    public boolean f7360B0 = false;

    /* renamed from: C0 */
    public boolean f7361C0 = false;

    /* renamed from: z0 */
    public boolean f7362z0 = false;

    public BarChart(Context context) {
        super(context);
    }

    /* renamed from: b */
    public boolean mo17343b() {
        return this.f7360B0;
    }

    /* renamed from: c */
    public boolean mo17344c() {
        return this.f7359A0;
    }

    /* renamed from: d */
    public boolean mo17345d() {
        return this.f7362z0;
    }

    public C2259a getBarData() {
        return (C2259a) this.f7415l;
    }

    /* renamed from: k */
    public C2277d mo23579k(float f, float f2) {
        if (this.f7415l == null) {
            return null;
        }
        C2277d a = getHighlighter().mo17314a(f, f2);
        return (a == null || !mo17345d()) ? a : new C2277d(a.mo17333h(), a.mo17335j(), a.mo17334i(), a.mo17336k(), a.mo17329d(), -1, a.mo17327b());
    }

    /* renamed from: n */
    public void mo23580n() {
        super.mo23580n();
        this.f7399B = new C2311b(this, this.f7402E, this.f7401D);
        setHighlighter(new C2274a(this));
        getXAxis().mo17236C(0.5f);
        getXAxis().mo17235B(0.5f);
    }

    public void setDrawBarShadow(boolean z) {
        this.f7360B0 = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.f7359A0 = z;
    }

    public void setFitBars(boolean z) {
        this.f7361C0 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.f7362z0 = z;
    }

    /* renamed from: x */
    public void mo23585x() {
        if (this.f7361C0) {
            this.f7422s.mo17237g(((C2259a) this.f7415l).mo17286m() - (((C2259a) this.f7415l).mo17268r() / 2.0f), ((C2259a) this.f7415l).mo17285l() + (((C2259a) this.f7415l).mo17268r() / 2.0f));
        } else {
            this.f7422s.mo17237g(((C2259a) this.f7415l).mo17286m(), ((C2259a) this.f7415l).mo17285l());
        }
        this.f7380k0.mo17237g(((C2259a) this.f7415l).mo17290q(YAxis.AxisDependency.LEFT), ((C2259a) this.f7415l).mo17288o(YAxis.AxisDependency.LEFT));
        this.f7381l0.mo17237g(((C2259a) this.f7415l).mo17290q(YAxis.AxisDependency.RIGHT), ((C2259a) this.f7415l).mo17288o(YAxis.AxisDependency.RIGHT));
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
