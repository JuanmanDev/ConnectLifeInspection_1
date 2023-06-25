package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.Entry;
import p040c.p175p.p184b.p185a.p189d.C2259a;
import p040c.p175p.p184b.p185a.p189d.C2262d;
import p040c.p175p.p184b.p185a.p189d.C2263e;
import p040c.p175p.p184b.p185a.p189d.C2265g;
import p040c.p175p.p184b.p185a.p189d.C2266h;
import p040c.p175p.p184b.p185a.p189d.C2269k;
import p040c.p175p.p184b.p185a.p191f.C2276c;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2289f;
import p040c.p175p.p184b.p185a.p192g.p194b.C2293b;
import p040c.p175p.p184b.p185a.p197j.C2316f;

public class CombinedChart extends BarLineChartBase<C2265g> implements C2289f {

    /* renamed from: A0 */
    public boolean f7431A0 = false;

    /* renamed from: B0 */
    public boolean f7432B0 = false;

    /* renamed from: C0 */
    public DrawOrder[] f7433C0;

    /* renamed from: z0 */
    public boolean f7434z0 = true;

    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
    }

    /* renamed from: b */
    public boolean mo17343b() {
        return this.f7432B0;
    }

    /* renamed from: c */
    public boolean mo17344c() {
        return this.f7434z0;
    }

    /* renamed from: d */
    public boolean mo17345d() {
        return this.f7431A0;
    }

    public C2259a getBarData() {
        T t = this.f7415l;
        if (t == null) {
            return null;
        }
        return ((C2265g) t).mo17292s();
    }

    public C2262d getBubbleData() {
        T t = this.f7415l;
        if (t == null) {
            return null;
        }
        return ((C2265g) t).mo17293t();
    }

    public C2263e getCandleData() {
        T t = this.f7415l;
        if (t == null) {
            return null;
        }
        return ((C2265g) t).mo17294u();
    }

    public C2265g getCombinedData() {
        return (C2265g) this.f7415l;
    }

    public DrawOrder[] getDrawOrder() {
        return this.f7433C0;
    }

    public C2266h getLineData() {
        T t = this.f7415l;
        if (t == null) {
            return null;
        }
        return ((C2265g) t).mo17297x();
    }

    public C2269k getScatterData() {
        T t = this.f7415l;
        if (t == null) {
            return null;
        }
        return ((C2265g) t).mo17298y();
    }

    /* renamed from: i */
    public void mo23683i(Canvas canvas) {
        if (this.f7411N != null && mo23691p() && mo23723v()) {
            int i = 0;
            while (true) {
                C2277d[] dVarArr = this.f7408K;
                if (i < dVarArr.length) {
                    C2277d dVar = dVarArr[i];
                    C2293b<? extends Entry> w = ((C2265g) this.f7415l).mo17296w(dVar);
                    Entry h = ((C2265g) this.f7415l).mo17281h(dVar);
                    if (h != null && ((float) w.mo17405o(h)) <= ((float) w.mo17385H0()) * this.f7402E.mo17224a()) {
                        float[] l = mo23685l(dVar);
                        if (this.f7401D.mo17646x(l[0], l[1])) {
                            this.f7411N.mo17266a(h, dVar);
                            this.f7411N.mo17267b(canvas, l[0], l[1]);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
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
        this.f7433C0 = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
        setHighlighter(new C2276c(this, this));
        setHighlightFullBarEnabled(true);
        this.f7399B = new C2316f(this, this.f7402E, this.f7401D);
    }

    public void setDrawBarShadow(boolean z) {
        this.f7432B0 = z;
    }

    public void setDrawOrder(DrawOrder[] drawOrderArr) {
        if (drawOrderArr != null && drawOrderArr.length > 0) {
            this.f7433C0 = drawOrderArr;
        }
    }

    public void setDrawValueAboveBar(boolean z) {
        this.f7434z0 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.f7431A0 = z;
    }

    public void setData(C2265g gVar) {
        super.setData(gVar);
        setHighlighter(new C2276c(this, this));
        ((C2316f) this.f7399B).mo17512h();
        this.f7399B.mo17499f();
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
