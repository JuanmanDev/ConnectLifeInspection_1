package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p191f.C2278e;
import p040c.p175p.p184b.p185a.p197j.C2319h;
import p040c.p175p.p184b.p185a.p197j.C2332r;
import p040c.p175p.p184b.p185a.p197j.C2335u;
import p040c.p175p.p184b.p185a.p199k.C2340c;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2346h;
import p040c.p175p.p184b.p185a.p199k.C2347i;

public class HorizontalBarChart extends BarChart {

    /* renamed from: D0 */
    public RectF f7435D0 = new RectF();

    public HorizontalBarChart(Context context) {
        super(context);
    }

    /* renamed from: P */
    public void mo23601P() {
        C2345g gVar = this.f7385p0;
        YAxis yAxis = this.f7381l0;
        float f = yAxis.f2323H;
        float f2 = yAxis.f2324I;
        XAxis xAxis = this.f7422s;
        gVar.mo17600m(f, f2, xAxis.f2324I, xAxis.f2323H);
        C2345g gVar2 = this.f7384o0;
        YAxis yAxis2 = this.f7380k0;
        float f3 = yAxis2.f2323H;
        float f4 = yAxis2.f2324I;
        XAxis xAxis2 = this.f7422s;
        gVar2.mo17600m(f3, f4, xAxis2.f2324I, xAxis2.f2323H);
    }

    /* renamed from: f */
    public void mo23604f() {
        mo23649y(this.f7435D0);
        RectF rectF = this.f7435D0;
        float f = rectF.left + 0.0f;
        float f2 = rectF.top + 0.0f;
        float f3 = rectF.right + 0.0f;
        float f4 = rectF.bottom + 0.0f;
        if (this.f7380k0.mo23864R()) {
            f2 += this.f7380k0.mo23854H(this.f7382m0.mo17494c());
        }
        if (this.f7381l0.mo23864R()) {
            f4 += this.f7381l0.mo23854H(this.f7383n0.mo17494c());
        }
        XAxis xAxis = this.f7422s;
        float f5 = (float) xAxis.f7507L;
        if (xAxis.mo17262f()) {
            if (this.f7422s.mo23848E() == XAxis.XAxisPosition.BOTTOM) {
                f += f5;
            } else {
                if (this.f7422s.mo23848E() != XAxis.XAxisPosition.TOP) {
                    if (this.f7422s.mo23848E() == XAxis.XAxisPosition.BOTH_SIDED) {
                        f += f5;
                    }
                }
                f3 += f5;
            }
        }
        float extraTopOffset = f2 + getExtraTopOffset();
        float extraRightOffset = f3 + getExtraRightOffset();
        float extraBottomOffset = f4 + getExtraBottomOffset();
        float extraLeftOffset = f + getExtraLeftOffset();
        float e = C2347i.m3958e(this.f7377h0);
        this.f7401D.mo17614K(Math.max(e, extraLeftOffset), Math.max(e, extraTopOffset), Math.max(e, extraRightOffset), Math.max(e, extraBottomOffset));
        if (this.f7414e) {
            "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset;
            "Content: " + this.f7401D.mo17637o().toString();
        }
        mo23600O();
        mo23601P();
    }

    public float getHighestVisibleX() {
        mo17347a(YAxis.AxisDependency.LEFT).mo17595h(this.f7401D.mo17630h(), this.f7401D.mo17632j(), this.f7393x0);
        return (float) Math.min((double) this.f7422s.f2322G, this.f7393x0.f2536d);
    }

    public float getLowestVisibleX() {
        mo17347a(YAxis.AxisDependency.LEFT).mo17595h(this.f7401D.mo17630h(), this.f7401D.mo17628f(), this.f7392w0);
        return (float) Math.max((double) this.f7422s.f2323H, this.f7392w0.f2536d);
    }

    /* renamed from: k */
    public C2277d mo23579k(float f, float f2) {
        if (this.f7415l != null) {
            return getHighlighter().mo17314a(f2, f);
        }
        boolean z = this.f7414e;
        return null;
    }

    /* renamed from: l */
    public float[] mo23685l(C2277d dVar) {
        return new float[]{dVar.mo17331f(), dVar.mo17330e()};
    }

    /* renamed from: n */
    public void mo23580n() {
        this.f7401D = new C2340c();
        super.mo23580n();
        this.f7384o0 = new C2346h(this.f7401D);
        this.f7385p0 = new C2346h(this.f7401D);
        this.f7399B = new C2319h(this, this.f7402E, this.f7401D);
        setHighlighter(new C2278e(this));
        this.f7382m0 = new C2335u(this.f7401D, this.f7380k0, this.f7384o0);
        this.f7383n0 = new C2335u(this.f7401D, this.f7381l0, this.f7385p0);
        this.f7386q0 = new C2332r(this.f7401D, this.f7422s, this.f7384o0, this);
    }

    public void setVisibleXRangeMaximum(float f) {
        this.f7401D.mo17621R(this.f7422s.f2324I / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.f7401D.mo17619P(this.f7422s.f2324I / f);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
