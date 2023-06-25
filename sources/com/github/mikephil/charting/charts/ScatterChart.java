package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import p040c.p175p.p184b.p185a.p189d.C2269k;
import p040c.p175p.p184b.p185a.p192g.p193a.C2291h;
import p040c.p175p.p184b.p185a.p197j.C2330p;

public class ScatterChart extends BarLineChartBase<C2269k> implements C2291h {

    public enum ScatterShape {
        SQUARE("SQUARE"),
        CIRCLE("CIRCLE"),
        TRIANGLE("TRIANGLE"),
        CROSS("CROSS"),
        X("X"),
        CHEVRON_UP("CHEVRON_UP"),
        CHEVRON_DOWN("CHEVRON_DOWN");
        
        public final String shapeIdentifier;

        /* access modifiers changed from: public */
        ScatterShape(String str) {
            this.shapeIdentifier = str;
        }

        public static ScatterShape[] getAllDefaultShapes() {
            return new ScatterShape[]{SQUARE, CIRCLE, TRIANGLE, CROSS, X, CHEVRON_UP, CHEVRON_DOWN};
        }

        public String toString() {
            return this.shapeIdentifier;
        }
    }

    public ScatterChart(Context context) {
        super(context);
    }

    public C2269k getScatterData() {
        return (C2269k) this.f7415l;
    }

    /* renamed from: n */
    public void mo23580n() {
        super.mo23580n();
        this.f7399B = new C2330p(this, this.f7402E, this.f7401D);
        getXAxis().mo17236C(0.5f);
        getXAxis().mo17235B(0.5f);
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
