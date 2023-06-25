package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import p040c.p175p.p184b.p185a.p189d.C2268j;
import p040c.p175p.p184b.p185a.p191f.C2282i;
import p040c.p175p.p184b.p185a.p192g.p194b.C2301j;
import p040c.p175p.p184b.p185a.p197j.C2328n;
import p040c.p175p.p184b.p185a.p197j.C2333s;
import p040c.p175p.p184b.p185a.p197j.C2336v;
import p040c.p175p.p184b.p185a.p199k.C2347i;

public class RadarChart extends PieRadarChartBase<C2268j> {

    /* renamed from: U */
    public float f7459U = 2.5f;

    /* renamed from: V */
    public float f7460V = 1.5f;

    /* renamed from: W */
    public int f7461W = Color.rgb(122, 122, 122);

    /* renamed from: a0 */
    public int f7462a0 = Color.rgb(122, 122, 122);

    /* renamed from: b0 */
    public int f7463b0 = 150;

    /* renamed from: c0 */
    public boolean f7464c0 = true;

    /* renamed from: d0 */
    public int f7465d0 = 0;

    /* renamed from: e0 */
    public YAxis f7466e0;

    /* renamed from: f0 */
    public C2336v f7467f0;

    /* renamed from: g0 */
    public C2333s f7468g0;

    public RadarChart(Context context) {
        super(context);
    }

    public float getFactor() {
        RectF o = this.f7401D.mo17637o();
        return Math.min(o.width() / 2.0f, o.height() / 2.0f) / this.f7466e0.f2324I;
    }

    public float getRadius() {
        RectF o = this.f7401D.mo17637o();
        return Math.min(o.width() / 2.0f, o.height() / 2.0f);
    }

    public float getRequiredBaseOffset() {
        if (!this.f7422s.mo17262f() || !this.f7422s.mo17254x()) {
            return C2347i.m3958e(10.0f);
        }
        return (float) this.f7422s.f7507L;
    }

    public float getRequiredLegendOffset() {
        return this.f7398A.mo17518d().getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.f7465d0;
    }

    public float getSliceAngle() {
        return 360.0f / ((float) ((C2301j) ((C2268j) this.f7415l).mo17284k()).mo17385H0());
    }

    public int getWebAlpha() {
        return this.f7463b0;
    }

    public int getWebColor() {
        return this.f7461W;
    }

    public int getWebColorInner() {
        return this.f7462a0;
    }

    public float getWebLineWidth() {
        return this.f7459U;
    }

    public float getWebLineWidthInner() {
        return this.f7460V;
    }

    public YAxis getYAxis() {
        return this.f7466e0;
    }

    public float getYChartMax() {
        return this.f7466e0.f2322G;
    }

    public float getYChartMin() {
        return this.f7466e0.f2323H;
    }

    public float getYRange() {
        return this.f7466e0.f2324I;
    }

    /* renamed from: n */
    public void mo23580n() {
        super.mo23580n();
        this.f7466e0 = new YAxis(YAxis.AxisDependency.LEFT);
        this.f7459U = C2347i.m3958e(1.5f);
        this.f7460V = C2347i.m3958e(0.75f);
        this.f7399B = new C2328n(this, this.f7402E, this.f7401D);
        this.f7467f0 = new C2336v(this.f7401D, this.f7466e0, this);
        this.f7468g0 = new C2333s(this.f7401D, this.f7422s, this);
        this.f7400C = new C2282i(this);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7415l != null) {
            if (this.f7422s.mo17262f()) {
                C2333s sVar = this.f7468g0;
                XAxis xAxis = this.f7422s;
                sVar.mo17492a(xAxis.f2323H, xAxis.f2322G, false);
            }
            this.f7468g0.mo17560i(canvas);
            if (this.f7464c0) {
                this.f7399B.mo17496c(canvas);
            }
            if (this.f7466e0.mo17262f() && this.f7466e0.mo17255y()) {
                this.f7467f0.mo17575l(canvas);
            }
            this.f7399B.mo17495b(canvas);
            if (mo23723v()) {
                this.f7399B.mo17497d(canvas, this.f7408K);
            }
            if (this.f7466e0.mo17262f() && !this.f7466e0.mo17255y()) {
                this.f7467f0.mo17575l(canvas);
            }
            this.f7467f0.mo17572i(canvas);
            this.f7399B.mo17498e(canvas);
            this.f7398A.mo17519e(canvas);
            mo23682h(canvas);
            mo23683i(canvas);
        }
    }

    /* renamed from: s */
    public void mo23620s() {
        if (this.f7415l != null) {
            mo23777w();
            C2336v vVar = this.f7467f0;
            YAxis yAxis = this.f7466e0;
            vVar.mo17492a(yAxis.f2323H, yAxis.f2322G, yAxis.mo23863Q());
            C2333s sVar = this.f7468g0;
            XAxis xAxis = this.f7422s;
            sVar.mo17492a(xAxis.f2323H, xAxis.f2322G, false);
            Legend legend = this.f7425v;
            if (legend != null && !legend.mo23813C()) {
                this.f7398A.mo17515a(this.f7415l);
            }
            mo23604f();
        }
    }

    public void setDrawWeb(boolean z) {
        this.f7464c0 = z;
    }

    public void setSkipWebLineCount(int i) {
        this.f7465d0 = Math.max(0, i);
    }

    public void setWebAlpha(int i) {
        this.f7463b0 = i;
    }

    public void setWebColor(int i) {
        this.f7461W = i;
    }

    public void setWebColorInner(int i) {
        this.f7462a0 = i;
    }

    public void setWebLineWidth(float f) {
        this.f7459U = C2347i.m3958e(f);
    }

    public void setWebLineWidthInner(float f) {
        this.f7460V = C2347i.m3958e(f);
    }

    /* renamed from: w */
    public void mo23777w() {
        super.mo23777w();
        this.f7466e0.mo17237g(((C2268j) this.f7415l).mo17290q(YAxis.AxisDependency.LEFT), ((C2268j) this.f7415l).mo17288o(YAxis.AxisDependency.LEFT));
        this.f7422s.mo17237g(0.0f, (float) ((C2301j) ((C2268j) this.f7415l).mo17284k()).mo17385H0());
    }

    /* renamed from: z */
    public int mo23778z(float f) {
        float p = C2347i.m3969p(f - getRotationAngle());
        float sliceAngle = getSliceAngle();
        int H0 = ((C2301j) ((C2268j) this.f7415l).mo17284k()).mo17385H0();
        int i = 0;
        while (i < H0) {
            int i2 = i + 1;
            if ((((float) i2) * sliceAngle) - (sliceAngle / 2.0f) > p) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
