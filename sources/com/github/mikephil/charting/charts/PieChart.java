package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.PieEntry;
import java.util.List;
import p040c.p175p.p184b.p185a.p189d.C2267i;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p191f.C2280g;
import p040c.p175p.p184b.p185a.p192g.p194b.C2300i;
import p040c.p175p.p184b.p185a.p197j.C2318g;
import p040c.p175p.p184b.p185a.p197j.C2327m;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2347i;

public class PieChart extends PieRadarChartBase<C2267i> {

    /* renamed from: U */
    public RectF f7436U = new RectF();

    /* renamed from: V */
    public boolean f7437V = true;

    /* renamed from: W */
    public float[] f7438W = new float[1];

    /* renamed from: a0 */
    public float[] f7439a0 = new float[1];

    /* renamed from: b0 */
    public boolean f7440b0 = true;

    /* renamed from: c0 */
    public boolean f7441c0 = false;

    /* renamed from: d0 */
    public boolean f7442d0 = false;

    /* renamed from: e0 */
    public boolean f7443e0 = false;

    /* renamed from: f0 */
    public CharSequence f7444f0 = "";

    /* renamed from: g0 */
    public C2342e f7445g0 = C2342e.m3925c(0.0f, 0.0f);

    /* renamed from: h0 */
    public float f7446h0 = 50.0f;

    /* renamed from: i0 */
    public float f7447i0 = 55.0f;

    /* renamed from: j0 */
    public boolean f7448j0 = true;

    /* renamed from: k0 */
    public float f7449k0 = 100.0f;

    /* renamed from: l0 */
    public float f7450l0 = 360.0f;

    /* renamed from: m0 */
    public float f7451m0 = 0.0f;

    public PieChart(Context context) {
        super(context);
    }

    /* renamed from: D */
    public final float mo23731D(float f, float f2) {
        return (f / f2) * this.f7450l0;
    }

    /* renamed from: E */
    public final void mo23732E() {
        int g = ((C2267i) this.f7415l).mo17280g();
        if (this.f7438W.length != g) {
            this.f7438W = new float[g];
        } else {
            for (int i = 0; i < g; i++) {
                this.f7438W[i] = 0.0f;
            }
        }
        if (this.f7439a0.length != g) {
            this.f7439a0 = new float[g];
        } else {
            for (int i2 = 0; i2 < g; i2++) {
                this.f7439a0[i2] = 0.0f;
            }
        }
        float t = ((C2267i) this.f7415l).mo17301t();
        List f = ((C2267i) this.f7415l).mo17279f();
        float f2 = this.f7451m0;
        boolean z = f2 != 0.0f && ((float) g) * f2 <= this.f7450l0;
        float[] fArr = new float[g];
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < ((C2267i) this.f7415l).mo17278e(); i4++) {
            C2300i iVar = (C2300i) f.get(i4);
            for (int i5 = 0; i5 < iVar.mo17385H0(); i5++) {
                float D = mo23731D(Math.abs(((PieEntry) iVar.mo17392O(i5)).mo17271c()), t);
                if (z) {
                    float f5 = this.f7451m0;
                    float f6 = D - f5;
                    if (f6 <= 0.0f) {
                        fArr[i3] = f5;
                        f3 += -f6;
                    } else {
                        fArr[i3] = D;
                        f4 += f6;
                    }
                }
                float[] fArr2 = this.f7438W;
                fArr2[i3] = D;
                if (i3 == 0) {
                    this.f7439a0[i3] = fArr2[i3];
                } else {
                    float[] fArr3 = this.f7439a0;
                    fArr3[i3] = fArr3[i3 - 1] + fArr2[i3];
                }
                i3++;
            }
        }
        if (z) {
            for (int i6 = 0; i6 < g; i6++) {
                fArr[i6] = fArr[i6] - (((fArr[i6] - this.f7451m0) / f4) * f3);
                if (i6 == 0) {
                    this.f7439a0[0] = fArr[0];
                } else {
                    float[] fArr4 = this.f7439a0;
                    fArr4[i6] = fArr4[i6 - 1] + fArr[i6];
                }
            }
            this.f7438W = fArr;
        }
    }

    /* renamed from: F */
    public boolean mo23733F() {
        return this.f7448j0;
    }

    /* renamed from: G */
    public boolean mo23734G() {
        return this.f7437V;
    }

    /* renamed from: H */
    public boolean mo23735H() {
        return this.f7440b0;
    }

    /* renamed from: I */
    public boolean mo23736I() {
        return this.f7443e0;
    }

    /* renamed from: J */
    public boolean mo23737J() {
        return this.f7441c0;
    }

    /* renamed from: K */
    public boolean mo23738K() {
        return this.f7442d0;
    }

    /* renamed from: L */
    public boolean mo23739L(int i) {
        if (!mo23723v()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            C2277d[] dVarArr = this.f7408K;
            if (i2 >= dVarArr.length) {
                return false;
            }
            if (((int) dVarArr[i2].mo17333h()) == i) {
                return true;
            }
            i2++;
        }
    }

    /* renamed from: f */
    public void mo23604f() {
        super.mo23604f();
        if (this.f7415l != null) {
            float diameter = getDiameter() / 2.0f;
            C2342e centerOffsets = getCenterOffsets();
            float u0 = ((C2267i) this.f7415l).mo17299r().mo17445u0();
            RectF rectF = this.f7436U;
            float f = centerOffsets.f2538c;
            float f2 = centerOffsets.f2539d;
            rectF.set((f - diameter) + u0, (f2 - diameter) + u0, (f + diameter) - u0, (f2 + diameter) - u0);
            C2342e.m3927e(centerOffsets);
        }
    }

    public float[] getAbsoluteAngles() {
        return this.f7439a0;
    }

    public C2342e getCenterCircleBox() {
        return C2342e.m3925c(this.f7436U.centerX(), this.f7436U.centerY());
    }

    public CharSequence getCenterText() {
        return this.f7444f0;
    }

    public C2342e getCenterTextOffset() {
        C2342e eVar = this.f7445g0;
        return C2342e.m3925c(eVar.f2538c, eVar.f2539d);
    }

    public float getCenterTextRadiusPercent() {
        return this.f7449k0;
    }

    public RectF getCircleBox() {
        return this.f7436U;
    }

    public float[] getDrawAngles() {
        return this.f7438W;
    }

    public float getHoleRadius() {
        return this.f7446h0;
    }

    public float getMaxAngle() {
        return this.f7450l0;
    }

    public float getMinAngleForSlices() {
        return this.f7451m0;
    }

    public float getRadius() {
        RectF rectF = this.f7436U;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.f7436U.height() / 2.0f);
    }

    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    public float getRequiredLegendOffset() {
        return this.f7398A.mo17518d().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.f7447i0;
    }

    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    /* renamed from: l */
    public float[] mo23685l(C2277d dVar) {
        C2342e centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float f = (radius / 10.0f) * 3.6f;
        if (mo23735H()) {
            f = (radius - ((radius / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float f2 = radius - f;
        float rotationAngle = getRotationAngle();
        int h = (int) dVar.mo17333h();
        float f3 = this.f7438W[h] / 2.0f;
        double d = (double) f2;
        float cos = (float) ((Math.cos(Math.toRadians((double) (((this.f7439a0[h] + rotationAngle) - f3) * this.f7402E.mo17225b()))) * d) + ((double) centerCircleBox.f2538c));
        C2342e.m3927e(centerCircleBox);
        return new float[]{cos, (float) ((d * Math.sin(Math.toRadians((double) (((rotationAngle + this.f7439a0[h]) - f3) * this.f7402E.mo17225b())))) + ((double) centerCircleBox.f2539d))};
    }

    /* renamed from: n */
    public void mo23580n() {
        super.mo23580n();
        this.f7399B = new C2327m(this, this.f7402E, this.f7401D);
        this.f7422s = null;
        this.f7400C = new C2280g(this);
    }

    public void onDetachedFromWindow() {
        C2318g gVar = this.f7399B;
        if (gVar != null && (gVar instanceof C2327m)) {
            ((C2327m) gVar).mo17548s();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7415l != null) {
            this.f7399B.mo17495b(canvas);
            if (mo23723v()) {
                this.f7399B.mo17497d(canvas, this.f7408K);
            }
            this.f7399B.mo17496c(canvas);
            this.f7399B.mo17498e(canvas);
            this.f7398A.mo17519e(canvas);
            mo23682h(canvas);
            mo23683i(canvas);
        }
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.f7444f0 = "";
        } else {
            this.f7444f0 = charSequence;
        }
    }

    public void setCenterTextColor(int i) {
        ((C2327m) this.f7399B).mo17543n().setColor(i);
    }

    public void setCenterTextRadiusPercent(float f) {
        this.f7449k0 = f;
    }

    public void setCenterTextSize(float f) {
        ((C2327m) this.f7399B).mo17543n().setTextSize(C2347i.m3958e(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((C2327m) this.f7399B).mo17543n().setTextSize(f);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((C2327m) this.f7399B).mo17543n().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z) {
        this.f7448j0 = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.f7437V = z;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.f7440b0 = z;
    }

    public void setDrawRoundedSlices(boolean z) {
        this.f7443e0 = z;
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.f7437V = z;
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.f7441c0 = z;
    }

    public void setEntryLabelColor(int i) {
        ((C2327m) this.f7399B).mo17544o().setColor(i);
    }

    public void setEntryLabelTextSize(float f) {
        ((C2327m) this.f7399B).mo17544o().setTextSize(C2347i.m3958e(f));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((C2327m) this.f7399B).mo17544o().setTypeface(typeface);
    }

    public void setHoleColor(int i) {
        ((C2327m) this.f7399B).mo17545p().setColor(i);
    }

    public void setHoleRadius(float f) {
        this.f7446h0 = f;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.f7450l0 = f;
    }

    public void setMinAngleForSlices(float f) {
        float f2 = this.f7450l0;
        if (f > f2 / 2.0f) {
            f = f2 / 2.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.f7451m0 = f;
    }

    public void setTransparentCircleAlpha(int i) {
        ((C2327m) this.f7399B).mo17546q().setAlpha(i);
    }

    public void setTransparentCircleColor(int i) {
        Paint q = ((C2327m) this.f7399B).mo17546q();
        int alpha = q.getAlpha();
        q.setColor(i);
        q.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.f7447i0 = f;
    }

    public void setUsePercentValues(boolean z) {
        this.f7442d0 = z;
    }

    /* renamed from: w */
    public void mo23777w() {
        mo23732E();
    }

    /* renamed from: z */
    public int mo23778z(float f) {
        float p = C2347i.m3969p(f - getRotationAngle());
        int i = 0;
        while (true) {
            float[] fArr = this.f7439a0;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > p) {
                return i;
            }
            i++;
        }
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
