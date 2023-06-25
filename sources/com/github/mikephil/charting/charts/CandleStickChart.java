package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import p040c.p175p.p184b.p185a.p189d.C2263e;
import p040c.p175p.p184b.p185a.p192g.p193a.C2287d;
import p040c.p175p.p184b.p185a.p197j.C2315e;

public class CandleStickChart extends BarLineChartBase<C2263e> implements C2287d {
    public CandleStickChart(Context context) {
        super(context);
    }

    public C2263e getCandleData() {
        return (C2263e) this.f7415l;
    }

    /* renamed from: n */
    public void mo23580n() {
        super.mo23580n();
        this.f7399B = new C2315e(this, this.f7402E, this.f7401D);
        getXAxis().mo17236C(0.5f);
        getXAxis().mo17235B(0.5f);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
