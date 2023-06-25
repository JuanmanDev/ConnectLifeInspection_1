package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import p040c.p175p.p184b.p185a.p189d.C2264f;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;
import p040c.p175p.p184b.p185a.p195h.C2307e;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2347i;

public abstract class PieRadarChartBase<T extends C2264f<? extends C2296e<? extends Entry>>> extends Chart<T> {

    /* renamed from: Q */
    public float f7452Q = 270.0f;

    /* renamed from: R */
    public float f7453R = 270.0f;

    /* renamed from: S */
    public boolean f7454S = true;

    /* renamed from: T */
    public float f7455T = 0.0f;

    /* renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$a */
    public static /* synthetic */ class C3986a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7456a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7457b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f7458c;

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
                f7458c = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7458c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7457b = r2
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f7457b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = f7457b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7456a = r2
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f7456a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x005e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.C3986a.<clinit>():void");
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
    }

    /* renamed from: A */
    public C2342e mo23779A(C2342e eVar, float f, float f2) {
        C2342e c = C2342e.m3925c(0.0f, 0.0f);
        mo23780B(eVar, f, f2, c);
        return c;
    }

    /* renamed from: B */
    public void mo23780B(C2342e eVar, float f, float f2, C2342e eVar2) {
        double d = (double) f;
        double d2 = (double) f2;
        eVar2.f2538c = (float) (((double) eVar.f2538c) + (Math.cos(Math.toRadians(d2)) * d));
        eVar2.f2539d = (float) (((double) eVar.f2539d) + (d * Math.sin(Math.toRadians(d2))));
    }

    /* renamed from: C */
    public boolean mo23781C() {
        return this.f7454S;
    }

    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.f7427x;
        if (chartTouchListener instanceof C2307e) {
            ((C2307e) chartTouchListener).mo17480g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        if (r2 != 2) goto L_0x007d;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23604f() {
        /*
            r11 = this;
            com.github.mikephil.charting.components.Legend r0 = r11.f7425v
            r1 = 0
            if (r0 == 0) goto L_0x0196
            boolean r0 = r0.mo17262f()
            if (r0 == 0) goto L_0x0196
            com.github.mikephil.charting.components.Legend r0 = r11.f7425v
            boolean r0 = r0.mo23812B()
            if (r0 != 0) goto L_0x0196
            com.github.mikephil.charting.components.Legend r0 = r11.f7425v
            float r0 = r0.f7491x
            c.p.b.a.k.j r2 = r11.f7401D
            float r2 = r2.mo17635m()
            com.github.mikephil.charting.components.Legend r3 = r11.f7425v
            float r3 = r3.mo23828t()
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.C3986a.f7458c
            com.github.mikephil.charting.components.Legend r3 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendOrientation r3 = r3.mo23831w()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x008c
            if (r2 == r3) goto L_0x003d
            goto L_0x007d
        L_0x003d:
            com.github.mikephil.charting.components.Legend r0 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = r0.mo23833y()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
            if (r0 == r2) goto L_0x0051
            com.github.mikephil.charting.components.Legend r0 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = r0.mo23833y()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM
            if (r0 != r2) goto L_0x007d
        L_0x0051:
            float r0 = r11.getRequiredLegendOffset()
            com.github.mikephil.charting.components.Legend r2 = r11.f7425v
            float r2 = r2.f7492y
            float r2 = r2 + r0
            c.p.b.a.k.j r0 = r11.f7401D
            float r0 = r0.mo17634l()
            com.github.mikephil.charting.components.Legend r5 = r11.f7425v
            float r5 = r5.mo23828t()
            float r0 = r0 * r5
            float r0 = java.lang.Math.min(r2, r0)
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.C3986a.f7456a
            com.github.mikephil.charting.components.Legend r5 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r5 = r5.mo23833y()
            int r5 = r5.ordinal()
            r2 = r2[r5]
            if (r2 == r4) goto L_0x0087
            if (r2 == r3) goto L_0x0082
        L_0x007d:
            r0 = r1
            r2 = r0
        L_0x007f:
            r3 = r2
            goto L_0x0181
        L_0x0082:
            r2 = r0
            r0 = r1
            r3 = r0
            goto L_0x0181
        L_0x0087:
            r3 = r0
            r0 = r1
            r2 = r0
            goto L_0x0181
        L_0x008c:
            com.github.mikephil.charting.components.Legend r2 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = r2.mo23827s()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT
            if (r2 == r5) goto L_0x00a4
            com.github.mikephil.charting.components.Legend r2 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r2 = r2.mo23827s()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            if (r2 != r5) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r0 = r1
            goto L_0x0122
        L_0x00a4:
            com.github.mikephil.charting.components.Legend r2 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = r2.mo23833y()
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r5 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER
            if (r2 != r5) goto L_0x00b6
            r2 = 1095761920(0x41500000, float:13.0)
            float r2 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r2)
            float r0 = r0 + r2
            goto L_0x0122
        L_0x00b6:
            r2 = 1090519040(0x41000000, float:8.0)
            float r2 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r2)
            float r0 = r0 + r2
            com.github.mikephil.charting.components.Legend r2 = r11.f7425v
            float r5 = r2.f7492y
            float r2 = r2.f7493z
            float r5 = r5 + r2
            c.p.b.a.k.e r2 = r11.getCenter()
            com.github.mikephil.charting.components.Legend r6 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r6 = r6.mo23827s()
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r7 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            r8 = 1097859072(0x41700000, float:15.0)
            if (r6 != r7) goto L_0x00dc
            int r6 = r11.getWidth()
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = r6 + r8
            goto L_0x00de
        L_0x00dc:
            float r6 = r0 - r8
        L_0x00de:
            float r5 = r5 + r8
            float r7 = r11.mo23791x(r6, r5)
            float r8 = r11.getRadius()
            float r6 = r11.mo23792y(r6, r5)
            c.p.b.a.k.e r6 = r11.mo23779A(r2, r8, r6)
            float r8 = r6.f2538c
            float r9 = r6.f2539d
            float r8 = r11.mo23791x(r8, r9)
            r9 = 1084227584(0x40a00000, float:5.0)
            float r9 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r9)
            float r10 = r2.f2539d
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x0113
            int r5 = r11.getHeight()
            float r5 = (float) r5
            float r5 = r5 - r0
            int r10 = r11.getWidth()
            float r10 = (float) r10
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0113
            goto L_0x011c
        L_0x0113:
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x011b
            float r8 = r8 - r7
            float r9 = r9 + r8
            r0 = r9
            goto L_0x011c
        L_0x011b:
            r0 = r1
        L_0x011c:
            p040c.p175p.p184b.p185a.p199k.C2342e.m3927e(r2)
            p040c.p175p.p184b.p185a.p199k.C2342e.m3927e(r6)
        L_0x0122:
            int[] r2 = com.github.mikephil.charting.charts.PieRadarChartBase.C3986a.f7457b
            com.github.mikephil.charting.components.Legend r5 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r5 = r5.mo23827s()
            int r5 = r5.ordinal()
            r2 = r2[r5]
            if (r2 == r4) goto L_0x017d
            if (r2 == r3) goto L_0x017a
            r0 = 3
            if (r2 == r0) goto L_0x0138
            goto L_0x014a
        L_0x0138:
            int[] r0 = com.github.mikephil.charting.charts.PieRadarChartBase.C3986a.f7456a
            com.github.mikephil.charting.components.Legend r2 = r11.f7425v
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = r2.mo23833y()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            if (r0 == r4) goto L_0x0163
            if (r0 == r3) goto L_0x014c
        L_0x014a:
            goto L_0x007d
        L_0x014c:
            com.github.mikephil.charting.components.Legend r0 = r11.f7425v
            float r0 = r0.f7492y
            c.p.b.a.k.j r2 = r11.f7401D
            float r2 = r2.mo17634l()
            com.github.mikephil.charting.components.Legend r3 = r11.f7425v
            float r3 = r3.mo23828t()
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            goto L_0x0082
        L_0x0163:
            com.github.mikephil.charting.components.Legend r0 = r11.f7425v
            float r0 = r0.f7492y
            c.p.b.a.k.j r2 = r11.f7401D
            float r2 = r2.mo17634l()
            com.github.mikephil.charting.components.Legend r3 = r11.f7425v
            float r3 = r3.mo23828t()
            float r2 = r2 * r3
            float r0 = java.lang.Math.min(r0, r2)
            goto L_0x0087
        L_0x017a:
            r2 = r1
            goto L_0x007f
        L_0x017d:
            r2 = r1
            r3 = r2
            r1 = r0
            r0 = r3
        L_0x0181:
            float r4 = r11.getRequiredBaseOffset()
            float r1 = r1 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r0 = r0 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r3 = r3 + r4
            float r4 = r11.getRequiredBaseOffset()
            float r2 = r2 + r4
            goto L_0x0199
        L_0x0196:
            r0 = r1
            r2 = r0
            r3 = r2
        L_0x0199:
            float r4 = r11.f7455T
            float r4 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r4)
            boolean r5 = r11 instanceof com.github.mikephil.charting.charts.RadarChart
            if (r5 == 0) goto L_0x01ba
            com.github.mikephil.charting.components.XAxis r5 = r11.getXAxis()
            boolean r6 = r5.mo17262f()
            if (r6 == 0) goto L_0x01ba
            boolean r6 = r5.mo17254x()
            if (r6 == 0) goto L_0x01ba
            int r5 = r5.f7507L
            float r5 = (float) r5
            float r4 = java.lang.Math.max(r4, r5)
        L_0x01ba:
            float r5 = r11.getExtraTopOffset()
            float r3 = r3 + r5
            float r5 = r11.getExtraRightOffset()
            float r0 = r0 + r5
            float r5 = r11.getExtraBottomOffset()
            float r2 = r2 + r5
            float r5 = r11.getExtraLeftOffset()
            float r1 = r1 + r5
            float r1 = java.lang.Math.max(r4, r1)
            float r3 = java.lang.Math.max(r4, r3)
            float r0 = java.lang.Math.max(r4, r0)
            float r5 = r11.getRequiredBaseOffset()
            float r2 = java.lang.Math.max(r5, r2)
            float r2 = java.lang.Math.max(r4, r2)
            c.p.b.a.k.j r4 = r11.f7401D
            r4.mo17614K(r1, r3, r0, r2)
            boolean r4 = r11.f7414e
            if (r4 == 0) goto L_0x0217
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "offsetLeft: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = ", offsetTop: "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = ", offsetRight: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = ", offsetBottom: "
            r4.append(r0)
            r4.append(r2)
            r4.toString()
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.mo23604f():void");
    }

    public float getDiameter() {
        RectF o = this.f7401D.mo17637o();
        o.left += getExtraLeftOffset();
        o.top += getExtraTopOffset();
        o.right -= getExtraRightOffset();
        o.bottom -= getExtraBottomOffset();
        return Math.min(o.width(), o.height());
    }

    public int getMaxVisibleCount() {
        return this.f7415l.mo17280g();
    }

    public float getMinOffset() {
        return this.f7455T;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.f7453R;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.f7452Q;
    }

    public float getYChartMax() {
        return 0.0f;
    }

    public float getYChartMin() {
        return 0.0f;
    }

    /* renamed from: n */
    public void mo23580n() {
        super.mo23580n();
        this.f7427x = new C2307e(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        if (!this.f7423t || (chartTouchListener = this.f7427x) == null) {
            return super.onTouchEvent(motionEvent);
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    /* renamed from: s */
    public void mo23620s() {
        if (this.f7415l != null) {
            mo23777w();
            if (this.f7425v != null) {
                this.f7398A.mo17515a(this.f7415l);
            }
            mo23604f();
        }
    }

    public void setMinOffset(float f) {
        this.f7455T = f;
    }

    public void setRotationAngle(float f) {
        this.f7453R = f;
        this.f7452Q = C2347i.m3969p(f);
    }

    public void setRotationEnabled(boolean z) {
        this.f7454S = z;
    }

    /* renamed from: w */
    public void mo23777w() {
    }

    /* renamed from: x */
    public float mo23791x(float f, float f2) {
        C2342e centerOffsets = getCenterOffsets();
        float f3 = centerOffsets.f2538c;
        float f4 = f > f3 ? f - f3 : f3 - f;
        float f5 = centerOffsets.f2539d;
        float sqrt = (float) Math.sqrt(Math.pow((double) f4, 2.0d) + Math.pow((double) (f2 > f5 ? f2 - f5 : f5 - f2), 2.0d));
        C2342e.m3927e(centerOffsets);
        return sqrt;
    }

    /* renamed from: y */
    public float mo23792y(float f, float f2) {
        C2342e centerOffsets = getCenterOffsets();
        double d = (double) (f - centerOffsets.f2538c);
        double d2 = (double) (f2 - centerOffsets.f2539d);
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d * d) + (d2 * d2))));
        if (f > centerOffsets.f2538c) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        C2342e.m3927e(centerOffsets);
        return f3;
    }

    /* renamed from: z */
    public abstract int mo23778z(float f);

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
