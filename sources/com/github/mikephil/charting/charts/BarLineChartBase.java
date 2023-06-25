package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import p040c.p175p.p184b.p185a.p189d.C2260b;
import p040c.p175p.p184b.p185a.p191f.C2275b;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2285b;
import p040c.p175p.p184b.p185a.p192g.p194b.C2293b;
import p040c.p175p.p184b.p185a.p195h.C2303a;
import p040c.p175p.p184b.p185a.p195h.C2306d;
import p040c.p175p.p184b.p185a.p197j.C2318g;
import p040c.p175p.p184b.p185a.p197j.C2331q;
import p040c.p175p.p184b.p185a.p197j.C2334t;
import p040c.p175p.p184b.p185a.p199k.C2341d;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

@SuppressLint({"RtlHardcoded"})
public abstract class BarLineChartBase<T extends C2260b<? extends C2293b<? extends Entry>>> extends Chart<T> implements C2285b {

    /* renamed from: Q */
    public int f7363Q = 100;

    /* renamed from: R */
    public boolean f7364R = false;

    /* renamed from: S */
    public boolean f7365S = false;

    /* renamed from: T */
    public boolean f7366T = true;

    /* renamed from: U */
    public boolean f7367U = true;

    /* renamed from: V */
    public boolean f7368V = true;

    /* renamed from: W */
    public boolean f7369W = true;

    /* renamed from: a0 */
    public boolean f7370a0 = true;

    /* renamed from: b0 */
    public boolean f7371b0 = true;

    /* renamed from: c0 */
    public Paint f7372c0;

    /* renamed from: d0 */
    public Paint f7373d0;

    /* renamed from: e0 */
    public boolean f7374e0 = false;

    /* renamed from: f0 */
    public boolean f7375f0 = false;

    /* renamed from: g0 */
    public boolean f7376g0 = false;

    /* renamed from: h0 */
    public float f7377h0 = 15.0f;

    /* renamed from: i0 */
    public boolean f7378i0 = false;

    /* renamed from: j0 */
    public C2306d f7379j0;

    /* renamed from: k0 */
    public YAxis f7380k0;

    /* renamed from: l0 */
    public YAxis f7381l0;

    /* renamed from: m0 */
    public C2334t f7382m0;

    /* renamed from: n0 */
    public C2334t f7383n0;

    /* renamed from: o0 */
    public C2345g f7384o0;

    /* renamed from: p0 */
    public C2345g f7385p0;

    /* renamed from: q0 */
    public C2331q f7386q0;

    /* renamed from: r0 */
    public long f7387r0 = 0;

    /* renamed from: s0 */
    public long f7388s0 = 0;

    /* renamed from: t0 */
    public RectF f7389t0 = new RectF();

    /* renamed from: u0 */
    public Matrix f7390u0 = new Matrix();

    /* renamed from: v0 */
    public boolean f7391v0;

    /* renamed from: w0 */
    public C2341d f7392w0;

    /* renamed from: x0 */
    public C2341d f7393x0;

    /* renamed from: y0 */
    public float[] f7394y0;

    /* renamed from: com.github.mikephil.charting.charts.BarLineChartBase$a */
    public static /* synthetic */ class C3984a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7395a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7396b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f7397c;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(2:13|14)|15|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7397c = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7397c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7396b = r2
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f7396b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = f7396b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7395a = r2
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f7395a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x005e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.BarLineChartBase.C3984a.<clinit>():void");
        }
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Matrix();
        this.f7391v0 = false;
        this.f7392w0 = C2341d.m3921b(0.0d, 0.0d);
        this.f7393x0 = C2341d.m3921b(0.0d, 0.0d);
        this.f7394y0 = new float[2];
    }

    /* renamed from: A */
    public YAxis mo23586A(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            return this.f7380k0;
        }
        return this.f7381l0;
    }

    /* renamed from: B */
    public C2293b mo23587B(float f, float f2) {
        C2277d k = mo23579k(f, f2);
        if (k != null) {
            return (C2293b) ((C2260b) this.f7415l).mo17277d(k.mo17329d());
        }
        return null;
    }

    /* renamed from: C */
    public boolean mo23588C() {
        return this.f7401D.mo17642t();
    }

    /* renamed from: D */
    public boolean mo23589D() {
        if (!this.f7380k0.mo23863Q() && !this.f7381l0.mo23863Q()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public boolean mo23590E() {
        return this.f7376g0;
    }

    /* renamed from: F */
    public boolean mo23591F() {
        return this.f7366T;
    }

    /* renamed from: G */
    public boolean mo23592G() {
        return this.f7368V || this.f7369W;
    }

    /* renamed from: H */
    public boolean mo23593H() {
        return this.f7368V;
    }

    /* renamed from: I */
    public boolean mo23594I() {
        return this.f7369W;
    }

    /* renamed from: J */
    public boolean mo23595J() {
        return this.f7401D.mo17643u();
    }

    /* renamed from: K */
    public boolean mo23596K() {
        return this.f7367U;
    }

    /* renamed from: L */
    public boolean mo23597L() {
        return this.f7365S;
    }

    /* renamed from: M */
    public boolean mo23598M() {
        return this.f7370a0;
    }

    /* renamed from: N */
    public boolean mo23599N() {
        return this.f7371b0;
    }

    /* renamed from: O */
    public void mo23600O() {
        this.f7385p0.mo17599l(this.f7381l0.mo23863Q());
        this.f7384o0.mo17599l(this.f7380k0.mo23863Q());
    }

    /* renamed from: P */
    public void mo23601P() {
        if (this.f7414e) {
            "Preparing Value-Px Matrix, xmin: " + this.f7422s.f2323H + ", xmax: " + this.f7422s.f2322G + ", xdelta: " + this.f7422s.f2324I;
        }
        C2345g gVar = this.f7385p0;
        XAxis xAxis = this.f7422s;
        float f = xAxis.f2323H;
        float f2 = xAxis.f2324I;
        YAxis yAxis = this.f7381l0;
        gVar.mo17600m(f, f2, yAxis.f2324I, yAxis.f2323H);
        C2345g gVar2 = this.f7384o0;
        XAxis xAxis2 = this.f7422s;
        float f3 = xAxis2.f2323H;
        float f4 = xAxis2.f2324I;
        YAxis yAxis2 = this.f7380k0;
        gVar2.mo17600m(f3, f4, yAxis2.f2324I, yAxis2.f2323H);
    }

    /* renamed from: Q */
    public void mo23602Q(float f, float f2, float f3, float f4) {
        this.f7401D.mo17622S(f, f2, f3, -f4, this.f7390u0);
        this.f7401D.mo17613J(this.f7390u0, this, false);
        mo23604f();
        postInvalidate();
    }

    /* renamed from: a */
    public C2345g mo17347a(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            return this.f7384o0;
        }
        return this.f7385p0;
    }

    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.f7427x;
        if (chartTouchListener instanceof C2303a) {
            ((C2303a) chartTouchListener).mo17456f();
        }
    }

    /* renamed from: e */
    public boolean mo17348e(YAxis.AxisDependency axisDependency) {
        return mo23586A(axisDependency).mo23863Q();
    }

    /* renamed from: f */
    public void mo23604f() {
        if (!this.f7391v0) {
            mo23649y(this.f7389t0);
            RectF rectF = this.f7389t0;
            float f = rectF.left + 0.0f;
            float f2 = rectF.top + 0.0f;
            float f3 = rectF.right + 0.0f;
            float f4 = rectF.bottom + 0.0f;
            if (this.f7380k0.mo23864R()) {
                f += this.f7380k0.mo23855I(this.f7382m0.mo17494c());
            }
            if (this.f7381l0.mo23864R()) {
                f3 += this.f7381l0.mo23855I(this.f7383n0.mo17494c());
            }
            if (this.f7422s.mo17262f() && this.f7422s.mo17254x()) {
                XAxis xAxis = this.f7422s;
                float e = ((float) xAxis.f7508M) + xAxis.mo17261e();
                if (this.f7422s.mo23848E() == XAxis.XAxisPosition.BOTTOM) {
                    f4 += e;
                } else {
                    if (this.f7422s.mo23848E() != XAxis.XAxisPosition.TOP) {
                        if (this.f7422s.mo23848E() == XAxis.XAxisPosition.BOTH_SIDED) {
                            f4 += e;
                        }
                    }
                    f2 += e;
                }
            }
            float extraTopOffset = f2 + getExtraTopOffset();
            float extraRightOffset = f3 + getExtraRightOffset();
            float extraBottomOffset = f4 + getExtraBottomOffset();
            float extraLeftOffset = f + getExtraLeftOffset();
            float e2 = C2347i.m3958e(this.f7377h0);
            this.f7401D.mo17614K(Math.max(e2, extraLeftOffset), Math.max(e2, extraTopOffset), Math.max(e2, extraRightOffset), Math.max(e2, extraBottomOffset));
            if (this.f7414e) {
                "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset;
                "Content: " + this.f7401D.mo17637o().toString();
            }
        }
        mo23600O();
        mo23601P();
    }

    public YAxis getAxisLeft() {
        return this.f7380k0;
    }

    public YAxis getAxisRight() {
        return this.f7381l0;
    }

    public /* bridge */ /* synthetic */ C2260b getData() {
        return (C2260b) super.getData();
    }

    public C2306d getDrawListener() {
        return this.f7379j0;
    }

    public float getHighestVisibleX() {
        mo17347a(YAxis.AxisDependency.LEFT).mo17595h(this.f7401D.mo17631i(), this.f7401D.mo17628f(), this.f7393x0);
        return (float) Math.min((double) this.f7422s.f2322G, this.f7393x0.f2535c);
    }

    public float getLowestVisibleX() {
        mo17347a(YAxis.AxisDependency.LEFT).mo17595h(this.f7401D.mo17630h(), this.f7401D.mo17628f(), this.f7392w0);
        return (float) Math.max((double) this.f7422s.f2323H, this.f7392w0.f2535c);
    }

    public int getMaxVisibleCount() {
        return this.f7363Q;
    }

    public float getMinOffset() {
        return this.f7377h0;
    }

    public C2334t getRendererLeftYAxis() {
        return this.f7382m0;
    }

    public C2334t getRendererRightYAxis() {
        return this.f7383n0;
    }

    public C2331q getRendererXAxis() {
        return this.f7386q0;
    }

    public float getScaleX() {
        C2348j jVar = this.f7401D;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.mo17639q();
    }

    public float getScaleY() {
        C2348j jVar = this.f7401D;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.mo17640r();
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    public float getYChartMax() {
        return Math.max(this.f7380k0.f2322G, this.f7381l0.f2322G);
    }

    public float getYChartMin() {
        return Math.min(this.f7380k0.f2323H, this.f7381l0.f2323H);
    }

    /* renamed from: n */
    public void mo23580n() {
        super.mo23580n();
        this.f7380k0 = new YAxis(YAxis.AxisDependency.LEFT);
        this.f7381l0 = new YAxis(YAxis.AxisDependency.RIGHT);
        this.f7384o0 = new C2345g(this.f7401D);
        this.f7385p0 = new C2345g(this.f7401D);
        this.f7382m0 = new C2334t(this.f7401D, this.f7380k0, this.f7384o0);
        this.f7383n0 = new C2334t(this.f7401D, this.f7381l0, this.f7385p0);
        this.f7386q0 = new C2331q(this.f7401D, this.f7422s, this.f7384o0);
        setHighlighter(new C2275b(this));
        this.f7427x = new C2303a(this, this.f7401D.mo17638p(), 3.0f);
        Paint paint = new Paint();
        this.f7372c0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f7372c0.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.f7373d0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f7373d0.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f7373d0.setStrokeWidth(C2347i.m3958e(1.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7415l != null) {
            long currentTimeMillis = System.currentTimeMillis();
            mo23650z(canvas);
            if (this.f7364R) {
                mo23648w();
            }
            if (this.f7380k0.mo17262f()) {
                C2334t tVar = this.f7382m0;
                YAxis yAxis = this.f7380k0;
                tVar.mo17492a(yAxis.f2323H, yAxis.f2322G, yAxis.mo23863Q());
            }
            if (this.f7381l0.mo17262f()) {
                C2334t tVar2 = this.f7383n0;
                YAxis yAxis2 = this.f7381l0;
                tVar2.mo17492a(yAxis2.f2323H, yAxis2.f2322G, yAxis2.mo23863Q());
            }
            if (this.f7422s.mo17262f()) {
                C2331q qVar = this.f7386q0;
                XAxis xAxis = this.f7422s;
                qVar.mo17492a(xAxis.f2323H, xAxis.f2322G, false);
            }
            this.f7386q0.mo17561j(canvas);
            this.f7382m0.mo17573j(canvas);
            this.f7383n0.mo17573j(canvas);
            if (this.f7422s.mo17252v()) {
                this.f7386q0.mo17562k(canvas);
            }
            if (this.f7380k0.mo17252v()) {
                this.f7382m0.mo17574k(canvas);
            }
            if (this.f7381l0.mo17252v()) {
                this.f7383n0.mo17574k(canvas);
            }
            if (this.f7422s.mo17262f() && this.f7422s.mo17255y()) {
                this.f7386q0.mo17565n(canvas);
            }
            if (this.f7380k0.mo17262f() && this.f7380k0.mo17255y()) {
                this.f7382m0.mo17575l(canvas);
            }
            if (this.f7381l0.mo17262f() && this.f7381l0.mo17255y()) {
                this.f7383n0.mo17575l(canvas);
            }
            int save = canvas.save();
            canvas.clipRect(this.f7401D.mo17637o());
            this.f7399B.mo17495b(canvas);
            if (!this.f7422s.mo17252v()) {
                this.f7386q0.mo17562k(canvas);
            }
            if (!this.f7380k0.mo17252v()) {
                this.f7382m0.mo17574k(canvas);
            }
            if (!this.f7381l0.mo17252v()) {
                this.f7383n0.mo17574k(canvas);
            }
            if (mo23723v()) {
                this.f7399B.mo17497d(canvas, this.f7408K);
            }
            canvas.restoreToCount(save);
            this.f7399B.mo17496c(canvas);
            if (this.f7422s.mo17262f() && !this.f7422s.mo17255y()) {
                this.f7386q0.mo17565n(canvas);
            }
            if (this.f7380k0.mo17262f() && !this.f7380k0.mo17255y()) {
                this.f7382m0.mo17575l(canvas);
            }
            if (this.f7381l0.mo17262f() && !this.f7381l0.mo17255y()) {
                this.f7383n0.mo17575l(canvas);
            }
            this.f7386q0.mo17560i(canvas);
            this.f7382m0.mo17572i(canvas);
            this.f7383n0.mo17572i(canvas);
            if (mo23590E()) {
                int save2 = canvas.save();
                canvas.clipRect(this.f7401D.mo17637o());
                this.f7399B.mo17498e(canvas);
                canvas.restoreToCount(save2);
            } else {
                this.f7399B.mo17498e(canvas);
            }
            this.f7398A.mo17519e(canvas);
            mo23682h(canvas);
            mo23683i(canvas);
            if (this.f7414e) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                long j = this.f7387r0 + currentTimeMillis2;
                this.f7387r0 = j;
                long j2 = this.f7388s0 + 1;
                this.f7388s0 = j2;
                "Drawtime: " + currentTimeMillis2 + " ms, average: " + (j / j2) + " ms, cycles: " + this.f7388s0;
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.f7394y0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.f7378i0) {
            fArr[0] = this.f7401D.mo17630h();
            this.f7394y0[1] = this.f7401D.mo17632j();
            mo17347a(YAxis.AxisDependency.LEFT).mo17597j(this.f7394y0);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f7378i0) {
            mo17347a(YAxis.AxisDependency.LEFT).mo17598k(this.f7394y0);
            this.f7401D.mo17627e(this.f7394y0, this);
            return;
        }
        C2348j jVar = this.f7401D;
        jVar.mo17613J(jVar.mo17638p(), this, true);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        ChartTouchListener chartTouchListener = this.f7427x;
        if (chartTouchListener == null || this.f7415l == null || !this.f7423t) {
            return false;
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    /* renamed from: s */
    public void mo23620s() {
        if (this.f7415l == null) {
            boolean z = this.f7414e;
            return;
        }
        boolean z2 = this.f7414e;
        C2318g gVar = this.f7399B;
        if (gVar != null) {
            gVar.mo17499f();
        }
        mo23585x();
        C2334t tVar = this.f7382m0;
        YAxis yAxis = this.f7380k0;
        tVar.mo17492a(yAxis.f2323H, yAxis.f2322G, yAxis.mo23863Q());
        C2334t tVar2 = this.f7383n0;
        YAxis yAxis2 = this.f7381l0;
        tVar2.mo17492a(yAxis2.f2323H, yAxis2.f2322G, yAxis2.mo23863Q());
        C2331q qVar = this.f7386q0;
        XAxis xAxis = this.f7422s;
        qVar.mo17492a(xAxis.f2323H, xAxis.f2322G, false);
        if (this.f7425v != null) {
            this.f7398A.mo17515a(this.f7415l);
        }
        mo23604f();
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.f7364R = z;
    }

    public void setBorderColor(int i) {
        this.f7373d0.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.f7373d0.setStrokeWidth(C2347i.m3958e(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.f7376g0 = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.f7366T = z;
    }

    public void setDragEnabled(boolean z) {
        this.f7368V = z;
        this.f7369W = z;
    }

    public void setDragOffsetX(float f) {
        this.f7401D.mo17616M(f);
    }

    public void setDragOffsetY(float f) {
        this.f7401D.mo17617N(f);
    }

    public void setDragXEnabled(boolean z) {
        this.f7368V = z;
    }

    public void setDragYEnabled(boolean z) {
        this.f7369W = z;
    }

    public void setDrawBorders(boolean z) {
        this.f7375f0 = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.f7374e0 = z;
    }

    public void setGridBackgroundColor(int i) {
        this.f7372c0.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.f7367U = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.f7378i0 = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.f7363Q = i;
    }

    public void setMinOffset(float f) {
        this.f7377h0 = f;
    }

    public void setOnDrawListener(C2306d dVar) {
        this.f7379j0 = dVar;
    }

    public void setPinchZoom(boolean z) {
        this.f7365S = z;
    }

    public void setRendererLeftYAxis(C2334t tVar) {
        this.f7382m0 = tVar;
    }

    public void setRendererRightYAxis(C2334t tVar) {
        this.f7383n0 = tVar;
    }

    public void setScaleEnabled(boolean z) {
        this.f7370a0 = z;
        this.f7371b0 = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.f7370a0 = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.f7371b0 = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        this.f7401D.mo17620Q(this.f7422s.f2324I / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.f7401D.mo17618O(this.f7422s.f2324I / f);
    }

    public void setXAxisRenderer(C2331q qVar) {
        this.f7386q0 = qVar;
    }

    /* renamed from: w */
    public void mo23648w() {
        ((C2260b) this.f7415l).mo17276c(getLowestVisibleX(), getHighestVisibleX());
        this.f7422s.mo17237g(((C2260b) this.f7415l).mo17286m(), ((C2260b) this.f7415l).mo17285l());
        if (this.f7380k0.mo17262f()) {
            this.f7380k0.mo17237g(((C2260b) this.f7415l).mo17290q(YAxis.AxisDependency.LEFT), ((C2260b) this.f7415l).mo17288o(YAxis.AxisDependency.LEFT));
        }
        if (this.f7381l0.mo17262f()) {
            this.f7381l0.mo17237g(((C2260b) this.f7415l).mo17290q(YAxis.AxisDependency.RIGHT), ((C2260b) this.f7415l).mo17288o(YAxis.AxisDependency.RIGHT));
        }
        mo23604f();
    }

    /* renamed from: x */
    public void mo23585x() {
        this.f7422s.mo17237g(((C2260b) this.f7415l).mo17286m(), ((C2260b) this.f7415l).mo17285l());
        this.f7380k0.mo17237g(((C2260b) this.f7415l).mo17290q(YAxis.AxisDependency.LEFT), ((C2260b) this.f7415l).mo17288o(YAxis.AxisDependency.LEFT));
        this.f7381l0.mo17237g(((C2260b) this.f7415l).mo17290q(YAxis.AxisDependency.RIGHT), ((C2260b) this.f7415l).mo17288o(YAxis.AxisDependency.RIGHT));
    }

    /* renamed from: y */
    public void mo23649y(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        Legend legend = this.f7425v;
        if (legend != null && legend.mo17262f() && !this.f7425v.mo23812B()) {
            int i = C3984a.f7397c[this.f7425v.mo23831w().ordinal()];
            if (i == 1) {
                int i2 = C3984a.f7396b[this.f7425v.mo23827s().ordinal()];
                if (i2 == 1) {
                    rectF.left += Math.min(this.f7425v.f7491x, this.f7401D.mo17635m() * this.f7425v.mo23828t()) + this.f7425v.mo17260d();
                } else if (i2 == 2) {
                    rectF.right += Math.min(this.f7425v.f7491x, this.f7401D.mo17635m() * this.f7425v.mo23828t()) + this.f7425v.mo17260d();
                } else if (i2 == 3) {
                    int i3 = C3984a.f7395a[this.f7425v.mo23833y().ordinal()];
                    if (i3 == 1) {
                        rectF.top += Math.min(this.f7425v.f7492y, this.f7401D.mo17634l() * this.f7425v.mo23828t()) + this.f7425v.mo17261e();
                    } else if (i3 == 2) {
                        rectF.bottom += Math.min(this.f7425v.f7492y, this.f7401D.mo17634l() * this.f7425v.mo23828t()) + this.f7425v.mo17261e();
                    }
                }
            } else if (i == 2) {
                int i4 = C3984a.f7395a[this.f7425v.mo23833y().ordinal()];
                if (i4 == 1) {
                    rectF.top += Math.min(this.f7425v.f7492y, this.f7401D.mo17634l() * this.f7425v.mo23828t()) + this.f7425v.mo17261e();
                } else if (i4 == 2) {
                    rectF.bottom += Math.min(this.f7425v.f7492y, this.f7401D.mo17634l() * this.f7425v.mo23828t()) + this.f7425v.mo17261e();
                }
            }
        }
    }

    /* renamed from: z */
    public void mo23650z(Canvas canvas) {
        if (this.f7374e0) {
            canvas.drawRect(this.f7401D.mo17637o(), this.f7372c0);
        }
        if (this.f7375f0) {
            canvas.drawRect(this.f7401D.mo17637o(), this.f7373d0);
        }
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Matrix();
        this.f7391v0 = false;
        this.f7392w0 = C2341d.m3921b(0.0d, 0.0d);
        this.f7393x0 = C2341d.m3921b(0.0d, 0.0d);
        this.f7394y0 = new float[2];
    }

    public BarLineChartBase(Context context) {
        super(context);
        new Matrix();
        this.f7391v0 = false;
        this.f7392w0 = C2341d.m3921b(0.0d, 0.0d);
        this.f7393x0 = C2341d.m3921b(0.0d, 0.0d);
        this.f7394y0 = new float[2];
    }
}
