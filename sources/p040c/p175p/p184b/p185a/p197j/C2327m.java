package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import java.lang.ref.WeakReference;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p189d.C2267i;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p194b.C2300i;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.m */
/* compiled from: PieChartRenderer */
public class C2327m extends C2318g {

    /* renamed from: f */
    public PieChart f2481f;

    /* renamed from: g */
    public Paint f2482g;

    /* renamed from: h */
    public Paint f2483h;

    /* renamed from: i */
    public Paint f2484i;

    /* renamed from: j */
    public TextPaint f2485j;

    /* renamed from: k */
    public Paint f2486k;

    /* renamed from: l */
    public StaticLayout f2487l;

    /* renamed from: m */
    public CharSequence f2488m;

    /* renamed from: n */
    public RectF f2489n = new RectF();

    /* renamed from: o */
    public RectF[] f2490o = {new RectF(), new RectF(), new RectF()};

    /* renamed from: p */
    public WeakReference<Bitmap> f2491p;

    /* renamed from: q */
    public Canvas f2492q;

    /* renamed from: r */
    public Path f2493r = new Path();

    /* renamed from: s */
    public RectF f2494s = new RectF();

    /* renamed from: t */
    public Path f2495t = new Path();

    /* renamed from: u */
    public Path f2496u = new Path();

    /* renamed from: v */
    public RectF f2497v = new RectF();

    public C2327m(PieChart pieChart, C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
        this.f2481f = pieChart;
        Paint paint = new Paint(1);
        this.f2482g = paint;
        paint.setColor(-1);
        this.f2482g.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f2483h = paint2;
        paint2.setColor(-1);
        this.f2483h.setStyle(Paint.Style.FILL);
        this.f2483h.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.f2485j = textPaint;
        textPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f2485j.setTextSize(C2347i.m3958e(12.0f));
        this.f2453e.setTextSize(C2347i.m3958e(13.0f));
        this.f2453e.setColor(-1);
        this.f2453e.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.f2486k = paint3;
        paint3.setColor(-1);
        this.f2486k.setTextAlign(Paint.Align.CENTER);
        this.f2486k.setTextSize(C2347i.m3958e(13.0f));
        Paint paint4 = new Paint(1);
        this.f2484i = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: b */
    public void mo17495b(Canvas canvas) {
        int m = (int) this.f2503a.mo17635m();
        int l = (int) this.f2503a.mo17634l();
        WeakReference<Bitmap> weakReference = this.f2491p;
        Bitmap bitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (!(bitmap != null && bitmap.getWidth() == m && bitmap.getHeight() == l)) {
            if (m > 0 && l > 0) {
                bitmap = Bitmap.createBitmap(m, l, Bitmap.Config.ARGB_4444);
                this.f2491p = new WeakReference<>(bitmap);
                this.f2492q = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (C2300i iVar : ((C2267i) this.f2481f.getData()).mo17279f()) {
            if (iVar.isVisible() && iVar.mo17385H0() > 0) {
                mo17539j(canvas, iVar);
            }
        }
    }

    /* renamed from: c */
    public void mo17496c(Canvas canvas) {
        mo17541l(canvas);
        canvas.drawBitmap((Bitmap) this.f2491p.get(), 0.0f, 0.0f, (Paint) null);
        mo17538i(canvas);
    }

    /* renamed from: d */
    public void mo17497d(Canvas canvas, C2277d[] dVarArr) {
        boolean z;
        float[] fArr;
        float f;
        C2342e eVar;
        float f2;
        int i;
        RectF rectF;
        float f3;
        C2300i s;
        float f4;
        int i2;
        float f5;
        int i3;
        float f6;
        float[] fArr2;
        float f7;
        float f8;
        C2277d[] dVarArr2 = dVarArr;
        boolean z2 = this.f2481f.mo23735H() && !this.f2481f.mo23737J();
        if (!z2 || !this.f2481f.mo23736I()) {
            float a = this.f2450b.mo17224a();
            float b = this.f2450b.mo17225b();
            float rotationAngle = this.f2481f.getRotationAngle();
            float[] drawAngles = this.f2481f.getDrawAngles();
            float[] absoluteAngles = this.f2481f.getAbsoluteAngles();
            C2342e centerCircleBox = this.f2481f.getCenterCircleBox();
            float radius = this.f2481f.getRadius();
            float holeRadius = z2 ? (this.f2481f.getHoleRadius() / 100.0f) * radius : 0.0f;
            RectF rectF2 = this.f2497v;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i4 = 0;
            while (i4 < dVarArr2.length) {
                int h = (int) dVarArr2[i4].mo17333h();
                if (h < drawAngles.length && (s = ((C2267i) this.f2481f.getData()).mo17277d(dVarArr2[i4].mo17329d())) != null && s.mo17390L0()) {
                    int H0 = s.mo17385H0();
                    int i5 = 0;
                    for (int i6 = 0; i6 < H0; i6++) {
                        if (Math.abs(((PieEntry) s.mo17392O(i6)).mo17271c()) > C2347i.f2562d) {
                            i5++;
                        }
                    }
                    if (h == 0) {
                        i2 = 1;
                        f4 = 0.0f;
                    } else {
                        f4 = absoluteAngles[h - 1] * a;
                        i2 = 1;
                    }
                    if (i5 <= i2) {
                        f5 = 0.0f;
                    } else {
                        f5 = s.mo17440g();
                    }
                    float f9 = drawAngles[h];
                    float u0 = s.mo17445u0();
                    int i7 = i4;
                    float f10 = radius + u0;
                    float f11 = holeRadius;
                    rectF2.set(this.f2481f.getCircleBox());
                    float f12 = -u0;
                    rectF2.inset(f12, f12);
                    boolean z3 = f5 > 0.0f && f9 <= 180.0f;
                    this.f2451c.setColor(s.mo17395U(h));
                    float f13 = i5 == 1 ? 0.0f : f5 / (radius * 0.017453292f);
                    float f14 = i5 == 1 ? 0.0f : f5 / (f10 * 0.017453292f);
                    float f15 = rotationAngle + (((f13 / 2.0f) + f4) * b);
                    float f16 = (f9 - f13) * b;
                    float f17 = f16 < 0.0f ? 0.0f : f16;
                    float f18 = (((f14 / 2.0f) + f4) * b) + rotationAngle;
                    float f19 = (f9 - f14) * b;
                    if (f19 < 0.0f) {
                        f19 = 0.0f;
                    }
                    this.f2493r.reset();
                    int i8 = (f17 > 360.0f ? 1 : (f17 == 360.0f ? 0 : -1));
                    if (i8 < 0 || f17 % 360.0f > C2347i.f2562d) {
                        fArr2 = drawAngles;
                        f6 = f4;
                        double d = (double) (f18 * 0.017453292f);
                        i3 = i5;
                        z = z2;
                        this.f2493r.moveTo(centerCircleBox.f2538c + (((float) Math.cos(d)) * f10), centerCircleBox.f2539d + (f10 * ((float) Math.sin(d))));
                        this.f2493r.arcTo(rectF2, f18, f19);
                    } else {
                        this.f2493r.addCircle(centerCircleBox.f2538c, centerCircleBox.f2539d, f10, Path.Direction.CW);
                        fArr2 = drawAngles;
                        f6 = f4;
                        i3 = i5;
                        z = z2;
                    }
                    if (z3) {
                        double d2 = (double) (f15 * 0.017453292f);
                        i = i7;
                        rectF = rectF2;
                        f2 = f11;
                        eVar = centerCircleBox;
                        fArr = fArr2;
                        f7 = mo17537h(centerCircleBox, radius, f9 * b, (((float) Math.cos(d2)) * radius) + centerCircleBox.f2538c, centerCircleBox.f2539d + (((float) Math.sin(d2)) * radius), f15, f17);
                    } else {
                        rectF = rectF2;
                        eVar = centerCircleBox;
                        i = i7;
                        f2 = f11;
                        fArr = fArr2;
                        f7 = 0.0f;
                    }
                    RectF rectF3 = this.f2494s;
                    float f20 = eVar.f2538c;
                    float f21 = eVar.f2539d;
                    rectF3.set(f20 - f2, f21 - f2, f20 + f2, f21 + f2);
                    if (!z || (f2 <= 0.0f && !z3)) {
                        f3 = a;
                        f = b;
                        if (f17 % 360.0f > C2347i.f2562d) {
                            if (z3) {
                                double d3 = (double) ((f15 + (f17 / 2.0f)) * 0.017453292f);
                                this.f2493r.lineTo(eVar.f2538c + (((float) Math.cos(d3)) * f7), eVar.f2539d + (f7 * ((float) Math.sin(d3))));
                            } else {
                                this.f2493r.lineTo(eVar.f2538c, eVar.f2539d);
                            }
                        }
                    } else {
                        if (z3) {
                            if (f7 < 0.0f) {
                                f7 = -f7;
                            }
                            f8 = Math.max(f2, f7);
                        } else {
                            f8 = f2;
                        }
                        float f22 = (i3 == 1 || f8 == 0.0f) ? 0.0f : f5 / (f8 * 0.017453292f);
                        float f23 = ((f6 + (f22 / 2.0f)) * b) + rotationAngle;
                        float f24 = (f9 - f22) * b;
                        if (f24 < 0.0f) {
                            f24 = 0.0f;
                        }
                        float f25 = f23 + f24;
                        if (i8 < 0 || f17 % 360.0f > C2347i.f2562d) {
                            double d4 = (double) (f25 * 0.017453292f);
                            f3 = a;
                            f = b;
                            this.f2493r.lineTo(eVar.f2538c + (((float) Math.cos(d4)) * f8), eVar.f2539d + (f8 * ((float) Math.sin(d4))));
                            this.f2493r.arcTo(this.f2494s, f25, -f24);
                        } else {
                            this.f2493r.addCircle(eVar.f2538c, eVar.f2539d, f8, Path.Direction.CCW);
                            f3 = a;
                            f = b;
                        }
                    }
                    this.f2493r.close();
                    this.f2492q.drawPath(this.f2493r, this.f2451c);
                } else {
                    i = i4;
                    rectF = rectF2;
                    f2 = holeRadius;
                    fArr = drawAngles;
                    z = z2;
                    f3 = a;
                    f = b;
                    eVar = centerCircleBox;
                }
                i4 = i + 1;
                a = f3;
                rectF2 = rectF;
                holeRadius = f2;
                centerCircleBox = eVar;
                b = f;
                drawAngles = fArr;
                z2 = z;
                dVarArr2 = dVarArr;
            }
            C2342e.m3927e(centerCircleBox);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03da  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17498e(android.graphics.Canvas r54) {
        /*
            r53 = this;
            r6 = r53
            r7 = r54
            com.github.mikephil.charting.charts.PieChart r0 = r6.f2481f
            c.p.b.a.k.e r8 = r0.getCenterCircleBox()
            com.github.mikephil.charting.charts.PieChart r0 = r6.f2481f
            float r9 = r0.getRadius()
            com.github.mikephil.charting.charts.PieChart r0 = r6.f2481f
            float r0 = r0.getRotationAngle()
            com.github.mikephil.charting.charts.PieChart r1 = r6.f2481f
            float[] r10 = r1.getDrawAngles()
            com.github.mikephil.charting.charts.PieChart r1 = r6.f2481f
            float[] r11 = r1.getAbsoluteAngles()
            c.p.b.a.a.a r1 = r6.f2450b
            float r12 = r1.mo17224a()
            c.p.b.a.a.a r1 = r6.f2450b
            float r13 = r1.mo17225b()
            com.github.mikephil.charting.charts.PieChart r1 = r6.f2481f
            float r1 = r1.getHoleRadius()
            float r1 = r1 * r9
            r14 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r14
            float r1 = r9 - r1
            r15 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r15
            com.github.mikephil.charting.charts.PieChart r2 = r6.f2481f
            float r2 = r2.getHoleRadius()
            float r16 = r2 / r14
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = r9 / r2
            r3 = 1080452710(0x40666666, float:3.6)
            float r2 = r2 * r3
            com.github.mikephil.charting.charts.PieChart r3 = r6.f2481f
            boolean r3 = r3.mo23735H()
            if (r3 == 0) goto L_0x007a
            float r2 = r9 * r16
            float r2 = r9 - r2
            float r2 = r2 / r15
            com.github.mikephil.charting.charts.PieChart r3 = r6.f2481f
            boolean r3 = r3.mo23737J()
            if (r3 != 0) goto L_0x007a
            com.github.mikephil.charting.charts.PieChart r3 = r6.f2481f
            boolean r3 = r3.mo23736I()
            if (r3 == 0) goto L_0x007a
            double r3 = (double) r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 * r0
            double r0 = (double) r1
            r17 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r14 = (double) r9
            double r14 = r14 * r17
            double r0 = r0 / r14
            double r3 = r3 + r0
            float r0 = (float) r3
        L_0x007a:
            r14 = r0
            float r15 = r9 - r2
            com.github.mikephil.charting.charts.PieChart r0 = r6.f2481f
            c.p.b.a.d.f r0 = r0.getData()
            r17 = r0
            c.p.b.a.d.i r17 = (p040c.p175p.p184b.p185a.p189d.C2267i) r17
            java.util.List r5 = r17.mo17279f()
            float r18 = r17.mo17301t()
            com.github.mikephil.charting.charts.PieChart r0 = r6.f2481f
            boolean r21 = r0.mo23734G()
            r54.save()
            r0 = 1084227584(0x40a00000, float:5.0)
            float r22 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r0)
            r23 = 0
            r0 = r23
            r4 = r0
        L_0x00a3:
            int r1 = r5.size()
            if (r4 >= r1) goto L_0x042e
            java.lang.Object r1 = r5.get(r4)
            r3 = r1
            c.p.b.a.g.b.i r3 = (p040c.p175p.p184b.p185a.p192g.p194b.C2300i) r3
            boolean r24 = r3.mo17381A0()
            if (r24 != 0) goto L_0x00d0
            if (r21 != 0) goto L_0x00d0
            r26 = r4
            r33 = r5
            r29 = r9
            r34 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r40 = r14
            r10 = 1073741824(0x40000000, float:2.0)
            r19 = 1120403456(0x42c80000, float:100.0)
            r9 = r7
            r13 = r8
            goto L_0x041a
        L_0x00d0:
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r2 = r3.mo17439Y()
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r1 = r3.mo17441i0()
            r6.mo17513a(r3)
            r25 = r0
            android.graphics.Paint r0 = r6.f2453e
            r26 = r4
            java.lang.String r4 = "Q"
            int r0 = p040c.p175p.p184b.p185a.p199k.C2347i.m3954a(r0, r4)
            float r0 = (float) r0
            r4 = 1082130432(0x40800000, float:4.0)
            float r4 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r4)
            float r27 = r0 + r4
            c.p.b.a.e.d r4 = r3.mo17389K()
            int r0 = r3.mo17385H0()
            r28 = r5
            android.graphics.Paint r5 = r6.f2484i
            int r7 = r3.mo17436R()
            r5.setColor(r7)
            android.graphics.Paint r5 = r6.f2484i
            float r7 = r3.mo17437V()
            float r7 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r7)
            r5.setStrokeWidth(r7)
            float r7 = r6.mo17547r(r3)
            c.p.b.a.k.e r5 = r3.mo17386I0()
            c.p.b.a.k.e r5 = p040c.p175p.p184b.p185a.p199k.C2342e.m3926d(r5)
            r29 = r8
            float r8 = r5.f2538c
            float r8 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r8)
            r5.f2538c = r8
            float r8 = r5.f2539d
            float r8 = p040c.p175p.p184b.p185a.p199k.C2347i.m3958e(r8)
            r5.f2539d = r8
            r8 = r23
        L_0x0130:
            if (r8 >= r0) goto L_0x03fe
            com.github.mikephil.charting.data.Entry r30 = r3.mo17392O(r8)
            r31 = r5
            r5 = r30
            com.github.mikephil.charting.data.PieEntry r5 = (com.github.mikephil.charting.data.PieEntry) r5
            if (r25 != 0) goto L_0x0141
            r30 = 0
            goto L_0x0147
        L_0x0141:
            int r30 = r25 + -1
            r30 = r11[r30]
            float r30 = r30 * r12
        L_0x0147:
            r32 = r10[r25]
            r33 = 1016003125(0x3c8efa35, float:0.017453292)
            float r34 = r15 * r33
            float r34 = r7 / r34
            r20 = 1073741824(0x40000000, float:2.0)
            float r34 = r34 / r20
            float r32 = r32 - r34
            float r32 = r32 / r20
            float r30 = r30 + r32
            float r30 = r30 * r13
            r32 = r0
            float r0 = r14 + r30
            r30 = r7
            com.github.mikephil.charting.charts.PieChart r7 = r6.f2481f
            boolean r7 = r7.mo23738K()
            if (r7 == 0) goto L_0x0175
            float r7 = r5.mo17271c()
            float r7 = r7 / r18
            r19 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r19
            goto L_0x0179
        L_0x0175:
            float r7 = r5.mo17271c()
        L_0x0179:
            java.lang.String r7 = r4.mo17311g(r7, r5)
            r34 = r10
            java.lang.String r10 = r5.mo23883g()
            r35 = r4
            float r4 = r0 * r33
            r33 = r5
            double r4 = (double) r4
            r36 = r11
            r37 = r12
            double r11 = java.lang.Math.cos(r4)
            float r11 = (float) r11
            r38 = r13
            double r12 = java.lang.Math.sin(r4)
            float r12 = (float) r12
            if (r21 == 0) goto L_0x01a2
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r13 = com.github.mikephil.charting.data.PieDataSet$ValuePosition.OUTSIDE_SLICE
            if (r2 != r13) goto L_0x01a2
            r13 = 1
            goto L_0x01a4
        L_0x01a2:
            r13 = r23
        L_0x01a4:
            r40 = r14
            if (r24 == 0) goto L_0x01ae
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r14 = com.github.mikephil.charting.data.PieDataSet$ValuePosition.OUTSIDE_SLICE
            if (r1 != r14) goto L_0x01ae
            r14 = 1
            goto L_0x01b0
        L_0x01ae:
            r14 = r23
        L_0x01b0:
            r41 = r10
            if (r21 == 0) goto L_0x01ba
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r10 = com.github.mikephil.charting.data.PieDataSet$ValuePosition.INSIDE_SLICE
            if (r2 != r10) goto L_0x01ba
            r10 = 1
            goto L_0x01bc
        L_0x01ba:
            r10 = r23
        L_0x01bc:
            r42 = r2
            if (r24 == 0) goto L_0x01c7
            com.github.mikephil.charting.data.PieDataSet$ValuePosition r2 = com.github.mikephil.charting.data.PieDataSet$ValuePosition.INSIDE_SLICE
            if (r1 != r2) goto L_0x01c7
            r39 = 1
            goto L_0x01c9
        L_0x01c7:
            r39 = r23
        L_0x01c9:
            if (r13 != 0) goto L_0x01e9
            if (r14 == 0) goto L_0x01ce
            goto L_0x01e9
        L_0x01ce:
            r45 = r1
            r44 = r12
            r50 = r29
            r51 = r31
            r48 = r35
            r14 = r41
            r19 = 1120403456(0x42c80000, float:100.0)
            r12 = r3
            r29 = r9
            r9 = r54
            r52 = r33
            r33 = r28
            r28 = r52
            goto L_0x033b
        L_0x01e9:
            float r2 = r3.mo17438W()
            float r43 = r3.mo17443n0()
            float r44 = r3.mo17446y0()
            r19 = 1120403456(0x42c80000, float:100.0)
            float r44 = r44 / r19
            r45 = r1
            com.github.mikephil.charting.charts.PieChart r1 = r6.f2481f
            boolean r1 = r1.mo23735H()
            if (r1 == 0) goto L_0x020c
            float r1 = r9 * r16
            float r46 = r9 - r1
            float r46 = r46 * r44
            float r46 = r46 + r1
            goto L_0x020e
        L_0x020c:
            float r46 = r9 * r44
        L_0x020e:
            boolean r1 = r3.mo17442k0()
            if (r1 == 0) goto L_0x0222
            float r43 = r43 * r15
            double r4 = java.lang.Math.sin(r4)
            double r4 = java.lang.Math.abs(r4)
            float r1 = (float) r4
            float r43 = r43 * r1
            goto L_0x0224
        L_0x0222:
            float r43 = r43 * r15
        L_0x0224:
            float r1 = r46 * r11
            r5 = r29
            float r4 = r5.f2538c
            float r1 = r1 + r4
            float r46 = r46 * r12
            r29 = r9
            float r9 = r5.f2539d
            float r44 = r46 + r9
            r46 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r46
            float r2 = r2 * r15
            float r46 = r2 * r11
            float r46 = r46 + r4
            float r2 = r2 * r12
            float r9 = r9 + r2
            r47 = r5
            double r4 = (double) r0
            r48 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r4 = r4 % r48
            r48 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r0 = (r4 > r48 ? 1 : (r4 == r48 ? 0 : -1))
            if (r0 < 0) goto L_0x0272
            r48 = 4643457506423603200(0x4070e00000000000, double:270.0)
            int r0 = (r4 > r48 ? 1 : (r4 == r48 ? 0 : -1))
            if (r0 > 0) goto L_0x0272
            float r0 = r46 - r43
            android.graphics.Paint r2 = r6.f2453e
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.RIGHT
            r2.setTextAlign(r4)
            if (r13 == 0) goto L_0x026c
            android.graphics.Paint r2 = r6.f2486k
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.RIGHT
            r2.setTextAlign(r4)
        L_0x026c:
            float r2 = r0 - r22
            r43 = r0
            r5 = r2
            goto L_0x0287
        L_0x0272:
            float r43 = r46 + r43
            android.graphics.Paint r0 = r6.f2453e
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r2)
            if (r13 == 0) goto L_0x0284
            android.graphics.Paint r0 = r6.f2486k
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r2)
        L_0x0284:
            float r0 = r43 + r22
            r5 = r0
        L_0x0287:
            int r0 = r3.mo17436R()
            r2 = 1122867(0x112233, float:1.573472E-39)
            if (r0 == r2) goto L_0x02cb
            boolean r0 = r3.mo17444q0()
            if (r0 == 0) goto L_0x029f
            android.graphics.Paint r0 = r6.f2484i
            int r2 = r3.mo17395U(r8)
            r0.setColor(r2)
        L_0x029f:
            android.graphics.Paint r4 = r6.f2484i
            r0 = r54
            r2 = r44
            r44 = r12
            r12 = r3
            r3 = r46
            r48 = r35
            r35 = r4
            r4 = r9
            r51 = r31
            r50 = r47
            r31 = r5
            r52 = r33
            r33 = r28
            r28 = r52
            r5 = r35
            r0.drawLine(r1, r2, r3, r4, r5)
            android.graphics.Paint r5 = r6.f2484i
            r1 = r46
            r2 = r9
            r3 = r43
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L_0x02dc
        L_0x02cb:
            r44 = r12
            r51 = r31
            r48 = r35
            r50 = r47
            r12 = r3
            r31 = r5
            r52 = r33
            r33 = r28
            r28 = r52
        L_0x02dc:
            if (r13 == 0) goto L_0x0308
            if (r14 == 0) goto L_0x0308
            int r5 = r12.mo17400g0(r8)
            r0 = r53
            r1 = r54
            r2 = r7
            r3 = r31
            r4 = r9
            r0.mo17542m(r1, r2, r3, r4, r5)
            int r0 = r17.mo17280g()
            if (r8 >= r0) goto L_0x0303
            if (r41 == 0) goto L_0x0303
            float r9 = r9 + r27
            r5 = r54
            r3 = r31
            r4 = r41
            r6.mo17540k(r5, r4, r3, r9)
            goto L_0x0339
        L_0x0303:
            r9 = r54
            r14 = r41
            goto L_0x033b
        L_0x0308:
            r5 = r54
            r3 = r31
            r4 = r41
            if (r13 == 0) goto L_0x0321
            int r0 = r17.mo17280g()
            if (r8 >= r0) goto L_0x0339
            if (r4 == 0) goto L_0x0339
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r27 / r0
            float r9 = r9 + r1
            r6.mo17540k(r5, r4, r3, r9)
            goto L_0x0339
        L_0x0321:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r14 == 0) goto L_0x0339
            float r1 = r27 / r0
            float r9 = r9 + r1
            int r13 = r12.mo17400g0(r8)
            r0 = r53
            r1 = r54
            r2 = r7
            r14 = r4
            r4 = r9
            r9 = r5
            r5 = r13
            r0.mo17542m(r1, r2, r3, r4, r5)
            goto L_0x033b
        L_0x0339:
            r14 = r4
            r9 = r5
        L_0x033b:
            if (r10 != 0) goto L_0x0346
            if (r39 == 0) goto L_0x0340
            goto L_0x0346
        L_0x0340:
            r13 = r50
        L_0x0342:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x03a7
        L_0x0346:
            float r0 = r15 * r11
            r13 = r50
            float r1 = r13.f2538c
            float r5 = r0 + r1
            float r0 = r15 * r44
            float r1 = r13.f2539d
            float r31 = r0 + r1
            android.graphics.Paint r0 = r6.f2453e
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            if (r10 == 0) goto L_0x037e
            if (r39 == 0) goto L_0x037e
            int r10 = r12.mo17400g0(r8)
            r0 = r53
            r1 = r54
            r2 = r7
            r3 = r5
            r4 = r31
            r7 = r5
            r5 = r10
            r0.mo17542m(r1, r2, r3, r4, r5)
            int r0 = r17.mo17280g()
            if (r8 >= r0) goto L_0x0342
            if (r14 == 0) goto L_0x0342
            float r0 = r31 + r27
            r6.mo17540k(r9, r14, r7, r0)
            goto L_0x0342
        L_0x037e:
            r3 = r5
            if (r10 == 0) goto L_0x0393
            int r0 = r17.mo17280g()
            if (r8 >= r0) goto L_0x0342
            if (r14 == 0) goto L_0x0342
            r10 = 1073741824(0x40000000, float:2.0)
            float r0 = r27 / r10
            float r0 = r31 + r0
            r6.mo17540k(r9, r14, r3, r0)
            goto L_0x03a7
        L_0x0393:
            r10 = 1073741824(0x40000000, float:2.0)
            if (r39 == 0) goto L_0x03a7
            float r0 = r27 / r10
            float r4 = r31 + r0
            int r5 = r12.mo17400g0(r8)
            r0 = r53
            r1 = r54
            r2 = r7
            r0.mo17542m(r1, r2, r3, r4, r5)
        L_0x03a7:
            android.graphics.drawable.Drawable r0 = r28.mo17270b()
            if (r0 == 0) goto L_0x03da
            boolean r0 = r12.mo17411w()
            if (r0 == 0) goto L_0x03da
            android.graphics.drawable.Drawable r1 = r28.mo17270b()
            r7 = r51
            float r0 = r7.f2539d
            float r2 = r15 + r0
            float r2 = r2 * r11
            float r3 = r13.f2538c
            float r2 = r2 + r3
            float r0 = r0 + r15
            float r0 = r0 * r44
            float r3 = r13.f2539d
            float r0 = r0 + r3
            float r3 = r7.f2538c
            float r0 = r0 + r3
            int r2 = (int) r2
            int r3 = (int) r0
            int r4 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            r0 = r54
            p040c.p175p.p184b.p185a.p199k.C2347i.m3959f(r0, r1, r2, r3, r4, r5)
            goto L_0x03dc
        L_0x03da:
            r7 = r51
        L_0x03dc:
            int r25 = r25 + 1
            int r8 = r8 + 1
            r5 = r7
            r3 = r12
            r9 = r29
            r7 = r30
            r0 = r32
            r28 = r33
            r10 = r34
            r11 = r36
            r12 = r37
            r14 = r40
            r2 = r42
            r1 = r45
            r4 = r48
            r29 = r13
            r13 = r38
            goto L_0x0130
        L_0x03fe:
            r7 = r5
            r34 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r40 = r14
            r33 = r28
            r13 = r29
            r10 = 1073741824(0x40000000, float:2.0)
            r19 = 1120403456(0x42c80000, float:100.0)
            r29 = r9
            r9 = r54
            p040c.p175p.p184b.p185a.p199k.C2342e.m3927e(r7)
            r0 = r25
        L_0x041a:
            int r4 = r26 + 1
            r7 = r9
            r8 = r13
            r9 = r29
            r5 = r33
            r10 = r34
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r40
            goto L_0x00a3
        L_0x042e:
            r9 = r7
            r13 = r8
            p040c.p175p.p184b.p185a.p199k.C2342e.m3927e(r13)
            r54.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p184b.p185a.p197j.C2327m.mo17498e(android.graphics.Canvas):void");
    }

    /* renamed from: f */
    public void mo17499f() {
    }

    /* renamed from: h */
    public float mo17537h(C2342e eVar, float f, float f2, float f3, float f4, float f5, float f6) {
        C2342e eVar2 = eVar;
        double d = (double) ((f5 + f6) * 0.017453292f);
        float cos = eVar2.f2538c + (((float) Math.cos(d)) * f);
        float sin = eVar2.f2539d + (((float) Math.sin(d)) * f);
        double d2 = (double) ((f5 + (f6 / 2.0f)) * 0.017453292f);
        return (float) (((double) (f - ((float) ((Math.sqrt(Math.pow((double) (cos - f3), 2.0d) + Math.pow((double) (sin - f4), 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((double) ((eVar2.f2538c + (((float) Math.cos(d2)) * f)) - ((cos + f3) / 2.0f)), 2.0d) + Math.pow((double) ((eVar2.f2539d + (((float) Math.sin(d2)) * f)) - ((sin + f4) / 2.0f)), 2.0d)));
    }

    /* renamed from: i */
    public void mo17538i(Canvas canvas) {
        float f;
        C2342e eVar;
        Canvas canvas2 = canvas;
        CharSequence centerText = this.f2481f.getCenterText();
        if (this.f2481f.mo23733F() && centerText != null) {
            C2342e centerCircleBox = this.f2481f.getCenterCircleBox();
            C2342e centerTextOffset = this.f2481f.getCenterTextOffset();
            float f2 = centerCircleBox.f2538c + centerTextOffset.f2538c;
            float f3 = centerCircleBox.f2539d + centerTextOffset.f2539d;
            if (!this.f2481f.mo23735H() || this.f2481f.mo23737J()) {
                f = this.f2481f.getRadius();
            } else {
                f = this.f2481f.getRadius() * (this.f2481f.getHoleRadius() / 100.0f);
            }
            RectF[] rectFArr = this.f2490o;
            RectF rectF = rectFArr[0];
            rectF.left = f2 - f;
            rectF.top = f3 - f;
            rectF.right = f2 + f;
            rectF.bottom = f3 + f;
            RectF rectF2 = rectFArr[1];
            rectF2.set(rectF);
            float centerTextRadiusPercent = this.f2481f.getCenterTextRadiusPercent() / 100.0f;
            if (((double) centerTextRadiusPercent) > 0.0d) {
                rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
            }
            if (!centerText.equals(this.f2488m) || !rectF2.equals(this.f2489n)) {
                this.f2489n.set(rectF2);
                this.f2488m = centerText;
                eVar = centerTextOffset;
                StaticLayout staticLayout = r3;
                StaticLayout staticLayout2 = new StaticLayout(centerText, 0, centerText.length(), this.f2485j, (int) Math.max(Math.ceil((double) this.f2489n.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                this.f2487l = staticLayout;
            } else {
                eVar = centerTextOffset;
            }
            float height = (float) this.f2487l.getHeight();
            canvas.save();
            if (Build.VERSION.SDK_INT >= 18) {
                Path path = this.f2496u;
                path.reset();
                path.addOval(rectF, Path.Direction.CW);
                canvas2.clipPath(path);
            }
            canvas2.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
            this.f2487l.draw(canvas2);
            canvas.restore();
            C2342e.m3927e(centerCircleBox);
            C2342e.m3927e(eVar);
        }
    }

    /* renamed from: j */
    public void mo17539j(Canvas canvas, C2300i iVar) {
        float f;
        float[] fArr;
        float f2;
        float f3;
        int i;
        RectF rectF;
        int i2;
        float f4;
        int i3;
        C2342e eVar;
        RectF rectF2;
        float f5;
        int i4;
        float f6;
        float f7;
        float f8;
        int i5;
        RectF rectF3;
        RectF rectF4;
        C2342e eVar2;
        int i6;
        float f9;
        C2342e eVar3;
        C2300i iVar2 = iVar;
        float rotationAngle = this.f2481f.getRotationAngle();
        float a = this.f2450b.mo17224a();
        float b = this.f2450b.mo17225b();
        RectF circleBox = this.f2481f.getCircleBox();
        int H0 = iVar.mo17385H0();
        float[] drawAngles = this.f2481f.getDrawAngles();
        C2342e centerCircleBox = this.f2481f.getCenterCircleBox();
        float radius = this.f2481f.getRadius();
        boolean z = this.f2481f.mo23735H() && !this.f2481f.mo23737J();
        float holeRadius = z ? (this.f2481f.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((this.f2481f.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF5 = new RectF();
        boolean z2 = z && this.f2481f.mo23736I();
        int i7 = 0;
        for (int i8 = 0; i8 < H0; i8++) {
            if (Math.abs(((PieEntry) iVar2.mo17392O(i8)).mo17271c()) > C2347i.f2562d) {
                i7++;
            }
        }
        if (i7 <= 1) {
            f = 0.0f;
        } else {
            f = mo17547r(iVar2);
        }
        int i9 = 0;
        float f10 = 0.0f;
        while (i9 < H0) {
            float f11 = drawAngles[i9];
            if (Math.abs(iVar2.mo17392O(i9).mo17271c()) > C2347i.f2562d && (!this.f2481f.mo23739L(i9) || z2)) {
                boolean z3 = f > 0.0f && f11 <= 180.0f;
                i2 = H0;
                this.f2451c.setColor(iVar2.mo17395U(i9));
                float f12 = i7 == 1 ? 0.0f : f / (radius * 0.017453292f);
                float f13 = rotationAngle + ((f10 + (f12 / 2.0f)) * b);
                float f14 = (f11 - f12) * b;
                float f15 = f14 < 0.0f ? 0.0f : f14;
                this.f2493r.reset();
                if (z2) {
                    float f16 = radius - holeRadius2;
                    i = i9;
                    i4 = i7;
                    double d = (double) (f13 * 0.017453292f);
                    f3 = rotationAngle;
                    f2 = a;
                    float cos = centerCircleBox.f2538c + (((float) Math.cos(d)) * f16);
                    float sin = centerCircleBox.f2539d + (f16 * ((float) Math.sin(d)));
                    rectF5.set(cos - holeRadius2, sin - holeRadius2, cos + holeRadius2, sin + holeRadius2);
                } else {
                    i = i9;
                    i4 = i7;
                    f3 = rotationAngle;
                    f2 = a;
                }
                double d2 = (double) (f13 * 0.017453292f);
                float f17 = holeRadius;
                float cos2 = centerCircleBox.f2538c + (((float) Math.cos(d2)) * radius);
                float sin2 = centerCircleBox.f2539d + (((float) Math.sin(d2)) * radius);
                int i10 = (f15 > 360.0f ? 1 : (f15 == 360.0f ? 0 : -1));
                if (i10 < 0 || f15 % 360.0f > C2347i.f2562d) {
                    fArr = drawAngles;
                    if (z2) {
                        this.f2493r.arcTo(rectF5, f13 + 180.0f, -180.0f);
                    }
                    this.f2493r.arcTo(circleBox, f13, f15);
                } else {
                    fArr = drawAngles;
                    this.f2493r.addCircle(centerCircleBox.f2538c, centerCircleBox.f2539d, radius, Path.Direction.CW);
                }
                RectF rectF6 = this.f2494s;
                float f18 = centerCircleBox.f2538c;
                float f19 = centerCircleBox.f2539d;
                RectF rectF7 = rectF5;
                rectF6.set(f18 - f17, f19 - f17, f18 + f17, f19 + f17);
                if (!z) {
                    f7 = radius;
                    f8 = f17;
                    i5 = i4;
                    rectF3 = rectF7;
                    rectF4 = circleBox;
                    eVar = centerCircleBox;
                    f6 = 360.0f;
                } else if (f17 > 0.0f || z3) {
                    if (z3) {
                        int i11 = i;
                        i3 = i4;
                        float f20 = radius;
                        rectF = circleBox;
                        RectF rectF8 = rectF7;
                        f5 = f17;
                        i6 = 1;
                        f4 = radius;
                        float f21 = f13;
                        eVar2 = centerCircleBox;
                        float h = mo17537h(centerCircleBox, f20, f11 * b, cos2, sin2, f21, f15);
                        if (h < 0.0f) {
                            h = -h;
                        }
                        f9 = Math.max(f5, h);
                    } else {
                        f4 = radius;
                        eVar2 = centerCircleBox;
                        f5 = f17;
                        i3 = i4;
                        rectF = circleBox;
                        i6 = 1;
                        f9 = f5;
                    }
                    float f22 = (i3 == i6 || f9 == 0.0f) ? 0.0f : f / (f9 * 0.017453292f);
                    float f23 = f3 + ((f10 + (f22 / 2.0f)) * b);
                    float f24 = (f11 - f22) * b;
                    if (f24 < 0.0f) {
                        f24 = 0.0f;
                    }
                    float f25 = f23 + f24;
                    if (i10 < 0 || f15 % 360.0f > C2347i.f2562d) {
                        if (z2) {
                            float f26 = f4 - holeRadius2;
                            double d3 = (double) (0.017453292f * f25);
                            eVar3 = eVar2;
                            float cos3 = eVar2.f2538c + (((float) Math.cos(d3)) * f26);
                            float sin3 = eVar3.f2539d + (f26 * ((float) Math.sin(d3)));
                            rectF2 = rectF7;
                            rectF2.set(cos3 - holeRadius2, sin3 - holeRadius2, cos3 + holeRadius2, sin3 + holeRadius2);
                            this.f2493r.arcTo(rectF2, f25, 180.0f);
                        } else {
                            eVar3 = eVar2;
                            rectF2 = rectF7;
                            double d4 = (double) (f25 * 0.017453292f);
                            this.f2493r.lineTo(eVar3.f2538c + (((float) Math.cos(d4)) * f9), eVar3.f2539d + (f9 * ((float) Math.sin(d4))));
                        }
                        this.f2493r.arcTo(this.f2494s, f25, -f24);
                    } else {
                        this.f2493r.addCircle(eVar2.f2538c, eVar2.f2539d, f9, Path.Direction.CCW);
                        eVar3 = eVar2;
                        rectF2 = rectF7;
                    }
                    eVar = eVar3;
                    this.f2493r.close();
                    this.f2492q.drawPath(this.f2493r, this.f2451c);
                    f10 += f11 * f2;
                } else {
                    f7 = radius;
                    f8 = f17;
                    i5 = i4;
                    rectF3 = rectF7;
                    f6 = 360.0f;
                    rectF4 = circleBox;
                    eVar = centerCircleBox;
                }
                if (f15 % f6 > C2347i.f2562d) {
                    if (z3) {
                        float h2 = mo17537h(eVar, f4, f11 * b, cos2, sin2, f13, f15);
                        double d5 = (double) (0.017453292f * (f13 + (f15 / 2.0f)));
                        this.f2493r.lineTo(eVar.f2538c + (((float) Math.cos(d5)) * h2), eVar.f2539d + (h2 * ((float) Math.sin(d5))));
                    } else {
                        this.f2493r.lineTo(eVar.f2538c, eVar.f2539d);
                    }
                }
                this.f2493r.close();
                this.f2492q.drawPath(this.f2493r, this.f2451c);
                f10 += f11 * f2;
            } else {
                f10 += f11 * a;
                i = i9;
                f4 = radius;
                f3 = rotationAngle;
                f2 = a;
                rectF = circleBox;
                i2 = H0;
                fArr = drawAngles;
                i3 = i7;
                rectF2 = rectF5;
                f5 = holeRadius;
                eVar = centerCircleBox;
            }
            i9 = i + 1;
            iVar2 = iVar;
            holeRadius = f5;
            rectF5 = rectF2;
            centerCircleBox = eVar;
            i7 = i3;
            radius = f4;
            H0 = i2;
            circleBox = rectF;
            rotationAngle = f3;
            a = f2;
            drawAngles = fArr;
        }
        C2342e.m3927e(centerCircleBox);
    }

    /* renamed from: k */
    public void mo17540k(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.f2486k);
    }

    /* renamed from: l */
    public void mo17541l(Canvas canvas) {
        if (this.f2481f.mo23735H() && this.f2492q != null) {
            float radius = this.f2481f.getRadius();
            float holeRadius = (this.f2481f.getHoleRadius() / 100.0f) * radius;
            C2342e centerCircleBox = this.f2481f.getCenterCircleBox();
            if (Color.alpha(this.f2482g.getColor()) > 0) {
                this.f2492q.drawCircle(centerCircleBox.f2538c, centerCircleBox.f2539d, holeRadius, this.f2482g);
            }
            if (Color.alpha(this.f2483h.getColor()) > 0 && this.f2481f.getTransparentCircleRadius() > this.f2481f.getHoleRadius()) {
                int alpha = this.f2483h.getAlpha();
                float transparentCircleRadius = radius * (this.f2481f.getTransparentCircleRadius() / 100.0f);
                this.f2483h.setAlpha((int) (((float) alpha) * this.f2450b.mo17224a() * this.f2450b.mo17225b()));
                this.f2495t.reset();
                this.f2495t.addCircle(centerCircleBox.f2538c, centerCircleBox.f2539d, transparentCircleRadius, Path.Direction.CW);
                this.f2495t.addCircle(centerCircleBox.f2538c, centerCircleBox.f2539d, holeRadius, Path.Direction.CCW);
                this.f2492q.drawPath(this.f2495t, this.f2483h);
                this.f2483h.setAlpha(alpha);
            }
            C2342e.m3927e(centerCircleBox);
        }
    }

    /* renamed from: m */
    public void mo17542m(Canvas canvas, String str, float f, float f2, int i) {
        this.f2453e.setColor(i);
        canvas.drawText(str, f, f2, this.f2453e);
    }

    /* renamed from: n */
    public TextPaint mo17543n() {
        return this.f2485j;
    }

    /* renamed from: o */
    public Paint mo17544o() {
        return this.f2486k;
    }

    /* renamed from: p */
    public Paint mo17545p() {
        return this.f2482g;
    }

    /* renamed from: q */
    public Paint mo17546q() {
        return this.f2483h;
    }

    /* renamed from: r */
    public float mo17547r(C2300i iVar) {
        if (!iVar.mo17435L()) {
            return iVar.mo17440g();
        }
        if (iVar.mo17440g() / this.f2503a.mo17641s() > (iVar.mo17382C() / ((C2267i) this.f2481f.getData()).mo17301t()) * 2.0f) {
            return 0.0f;
        }
        return iVar.mo17440g();
    }

    /* renamed from: s */
    public void mo17548s() {
        Canvas canvas = this.f2492q;
        if (canvas != null) {
            canvas.setBitmap((Bitmap) null);
            this.f2492q = null;
        }
        WeakReference<Bitmap> weakReference = this.f2491p;
        if (weakReference != null) {
            Bitmap bitmap = (Bitmap) weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f2491p.clear();
            this.f2491p = null;
        }
    }
}
