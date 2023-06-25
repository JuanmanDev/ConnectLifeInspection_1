package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import p040c.p175p.p184b.p185a.p189d.C2266h;
import p040c.p175p.p184b.p185a.p192g.p193a.C2290g;
import p040c.p175p.p184b.p185a.p197j.C2318g;
import p040c.p175p.p184b.p185a.p197j.C2322j;

public class LineChart extends BarLineChartBase<C2266h> implements C2290g {
    public LineChart(Context context) {
        super(context);
    }

    public C2266h getLineData() {
        return (C2266h) this.f7415l;
    }

    /* renamed from: n */
    public void mo23580n() {
        super.mo23580n();
        this.f7399B = new C2322j(this, this.f7402E, this.f7401D);
    }

    public void onDetachedFromWindow() {
        C2318g gVar = this.f7399B;
        if (gVar != null && (gVar instanceof C2322j)) {
            ((C2322j) gVar).mo17529w();
        }
        super.onDetachedFromWindow();
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
