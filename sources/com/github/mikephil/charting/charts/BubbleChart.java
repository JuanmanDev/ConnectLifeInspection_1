package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import p040c.p175p.p184b.p185a.p189d.C2262d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2286c;
import p040c.p175p.p184b.p185a.p197j.C2314d;

public class BubbleChart extends BarLineChartBase<C2262d> implements C2286c {
    public BubbleChart(Context context) {
        super(context);
    }

    public C2262d getBubbleData() {
        return (C2262d) this.f7415l;
    }

    /* renamed from: n */
    public void mo23580n() {
        super.mo23580n();
        this.f7399B = new C2314d(this, this.f7402E, this.f7401D);
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
