package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarEntry;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p189d.C2268j;
import p040c.p175p.p184b.p185a.p190e.C2273d;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p194b.C2301j;
import p040c.p175p.p184b.p185a.p199k.C2338a;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.n */
/* compiled from: RadarChartRenderer */
public class C2328n extends C2325k {

    /* renamed from: h */
    public RadarChart f2498h;

    /* renamed from: i */
    public Paint f2499i;

    /* renamed from: j */
    public Paint f2500j;

    /* renamed from: k */
    public Path f2501k = new Path();

    /* renamed from: l */
    public Path f2502l = new Path();

    public C2328n(RadarChart radarChart, C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
        this.f2498h = radarChart;
        Paint paint = new Paint(1);
        this.f2452d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f2452d.setStrokeWidth(2.0f);
        this.f2452d.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.f2499i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f2500j = new Paint(1);
    }

    /* renamed from: b */
    public void mo17495b(Canvas canvas) {
        C2268j jVar = (C2268j) this.f2498h.getData();
        int H0 = ((C2301j) jVar.mo17284k()).mo17385H0();
        for (C2301j jVar2 : jVar.mo17279f()) {
            if (jVar2.isVisible()) {
                mo17549n(canvas, jVar2, H0);
            }
        }
    }

    /* renamed from: c */
    public void mo17496c(Canvas canvas) {
        mo17552q(canvas);
    }

    /* renamed from: d */
    public void mo17497d(Canvas canvas, C2277d[] dVarArr) {
        int i;
        int i2;
        C2277d[] dVarArr2 = dVarArr;
        float sliceAngle = this.f2498h.getSliceAngle();
        float factor = this.f2498h.getFactor();
        C2342e centerOffsets = this.f2498h.getCenterOffsets();
        C2342e c = C2342e.m3925c(0.0f, 0.0f);
        C2268j jVar = (C2268j) this.f2498h.getData();
        int length = dVarArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            C2277d dVar = dVarArr2[i4];
            C2301j jVar2 = (C2301j) jVar.mo17277d(dVar.mo17329d());
            if (jVar2 != null && jVar2.mo17390L0()) {
                RadarEntry radarEntry = (RadarEntry) jVar2.mo17392O((int) dVar.mo17333h());
                if (mo17504h(radarEntry, jVar2)) {
                    C2347i.m3970q(centerOffsets, (radarEntry.mo17271c() - this.f2498h.getYChartMin()) * factor * this.f2450b.mo17225b(), (dVar.mo17333h() * sliceAngle * this.f2450b.mo17224a()) + this.f2498h.getRotationAngle(), c);
                    dVar.mo17338m(c.f2538c, c.f2539d);
                    mo17536j(canvas, c.f2538c, c.f2539d, jVar2);
                    if (jVar2.mo17453u() && !Float.isNaN(c.f2538c) && !Float.isNaN(c.f2539d)) {
                        int p = jVar2.mo17452p();
                        if (p == 1122867) {
                            p = jVar2.mo17395U(i3);
                        }
                        if (jVar2.mo17451j() < 255) {
                            p = C2338a.m3916a(p, jVar2.mo17451j());
                        }
                        float h = jVar2.mo17450h();
                        float D = jVar2.mo17447D();
                        int f = jVar2.mo17449f();
                        i = i4;
                        i2 = i3;
                        mo17550o(canvas, c, h, D, f, p, jVar2.mo17448a());
                        i4 = i + 1;
                        i3 = i2;
                    }
                }
            }
            i = i4;
            i2 = i3;
            i4 = i + 1;
            i3 = i2;
        }
        C2342e.m3927e(centerOffsets);
        C2342e.m3927e(c);
    }

    /* renamed from: e */
    public void mo17498e(Canvas canvas) {
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        RadarEntry radarEntry;
        C2273d dVar;
        C2301j jVar;
        C2342e eVar;
        float a = this.f2450b.mo17224a();
        float b = this.f2450b.mo17225b();
        float sliceAngle = this.f2498h.getSliceAngle();
        float factor = this.f2498h.getFactor();
        C2342e centerOffsets = this.f2498h.getCenterOffsets();
        C2342e c = C2342e.m3925c(0.0f, 0.0f);
        C2342e c2 = C2342e.m3925c(0.0f, 0.0f);
        float e = C2347i.m3958e(5.0f);
        int i4 = 0;
        while (i4 < ((C2268j) this.f2498h.getData()).mo17278e()) {
            C2301j jVar2 = (C2301j) ((C2268j) this.f2498h.getData()).mo17277d(i4);
            if (!mo17505i(jVar2)) {
                i = i4;
                f = a;
            } else {
                mo17513a(jVar2);
                C2273d K = jVar2.mo17389K();
                C2342e d = C2342e.m3926d(jVar2.mo17386I0());
                d.f2538c = C2347i.m3958e(d.f2538c);
                d.f2539d = C2347i.m3958e(d.f2539d);
                int i5 = 0;
                while (i5 < jVar2.mo17385H0()) {
                    RadarEntry radarEntry2 = (RadarEntry) jVar2.mo17392O(i5);
                    C2342e eVar2 = d;
                    float f3 = ((float) i5) * sliceAngle * a;
                    C2347i.m3970q(centerOffsets, (radarEntry2.mo17271c() - this.f2498h.getYChartMin()) * factor * b, f3 + this.f2498h.getRotationAngle(), c);
                    if (jVar2.mo17381A0()) {
                        String i6 = K.mo17313i(radarEntry2);
                        float f4 = c.f2538c;
                        radarEntry = radarEntry2;
                        float f5 = c.f2539d - e;
                        int g0 = jVar2.mo17400g0(i5);
                        i2 = i5;
                        f2 = a;
                        eVar = eVar2;
                        dVar = K;
                        float f6 = f4;
                        jVar = jVar2;
                        float f7 = f5;
                        i3 = i4;
                        mo17551p(canvas, i6, f6, f7, g0);
                    } else {
                        radarEntry = radarEntry2;
                        i2 = i5;
                        jVar = jVar2;
                        i3 = i4;
                        f2 = a;
                        eVar = eVar2;
                        dVar = K;
                    }
                    if (radarEntry.mo17270b() != null && jVar.mo17411w()) {
                        Drawable b2 = radarEntry.mo17270b();
                        C2347i.m3970q(centerOffsets, (radarEntry.mo17271c() * factor * b) + eVar.f2539d, f3 + this.f2498h.getRotationAngle(), c2);
                        float f8 = c2.f2539d + eVar.f2538c;
                        c2.f2539d = f8;
                        C2347i.m3959f(canvas, b2, (int) c2.f2538c, (int) f8, b2.getIntrinsicWidth(), b2.getIntrinsicHeight());
                    }
                    i5 = i2 + 1;
                    d = eVar;
                    jVar2 = jVar;
                    K = dVar;
                    i4 = i3;
                    a = f2;
                }
                i = i4;
                f = a;
                C2342e.m3927e(d);
            }
            i4 = i + 1;
            a = f;
        }
        C2342e.m3927e(centerOffsets);
        C2342e.m3927e(c);
        C2342e.m3927e(c2);
    }

    /* renamed from: f */
    public void mo17499f() {
    }

    /* renamed from: n */
    public void mo17549n(Canvas canvas, C2301j jVar, int i) {
        float a = this.f2450b.mo17224a();
        float b = this.f2450b.mo17225b();
        float sliceAngle = this.f2498h.getSliceAngle();
        float factor = this.f2498h.getFactor();
        C2342e centerOffsets = this.f2498h.getCenterOffsets();
        C2342e c = C2342e.m3925c(0.0f, 0.0f);
        Path path = this.f2501k;
        path.reset();
        boolean z = false;
        for (int i2 = 0; i2 < jVar.mo17385H0(); i2++) {
            this.f2451c.setColor(jVar.mo17395U(i2));
            C2347i.m3970q(centerOffsets, (((RadarEntry) jVar.mo17392O(i2)).mo17271c() - this.f2498h.getYChartMin()) * factor * b, (((float) i2) * sliceAngle * a) + this.f2498h.getRotationAngle(), c);
            if (!Float.isNaN(c.f2538c)) {
                if (!z) {
                    path.moveTo(c.f2538c, c.f2539d);
                    z = true;
                } else {
                    path.lineTo(c.f2538c, c.f2539d);
                }
            }
        }
        if (jVar.mo17385H0() > i) {
            path.lineTo(centerOffsets.f2538c, centerOffsets.f2539d);
        }
        path.close();
        if (jVar.mo17427Q()) {
            Drawable H = jVar.mo17426H();
            if (H != null) {
                mo17535m(canvas, path, H);
            } else {
                mo17534l(canvas, path, jVar.mo17428e(), jVar.mo17429i());
            }
        }
        this.f2451c.setStrokeWidth(jVar.mo17430q());
        this.f2451c.setStyle(Paint.Style.STROKE);
        if (!jVar.mo17427Q() || jVar.mo17429i() < 255) {
            canvas.drawPath(path, this.f2451c);
        }
        C2342e.m3927e(centerOffsets);
        C2342e.m3927e(c);
    }

    /* renamed from: o */
    public void mo17550o(Canvas canvas, C2342e eVar, float f, float f2, int i, int i2, float f3) {
        canvas.save();
        float e = C2347i.m3958e(f2);
        float e2 = C2347i.m3958e(f);
        if (i != 1122867) {
            Path path = this.f2502l;
            path.reset();
            path.addCircle(eVar.f2538c, eVar.f2539d, e, Path.Direction.CW);
            if (e2 > 0.0f) {
                path.addCircle(eVar.f2538c, eVar.f2539d, e2, Path.Direction.CCW);
            }
            this.f2500j.setColor(i);
            this.f2500j.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.f2500j);
        }
        if (i2 != 1122867) {
            this.f2500j.setColor(i2);
            this.f2500j.setStyle(Paint.Style.STROKE);
            this.f2500j.setStrokeWidth(C2347i.m3958e(f3));
            canvas.drawCircle(eVar.f2538c, eVar.f2539d, e, this.f2500j);
        }
        canvas.restore();
    }

    /* renamed from: p */
    public void mo17551p(Canvas canvas, String str, float f, float f2, int i) {
        this.f2453e.setColor(i);
        canvas.drawText(str, f, f2, this.f2453e);
    }

    /* renamed from: q */
    public void mo17552q(Canvas canvas) {
        float sliceAngle = this.f2498h.getSliceAngle();
        float factor = this.f2498h.getFactor();
        float rotationAngle = this.f2498h.getRotationAngle();
        C2342e centerOffsets = this.f2498h.getCenterOffsets();
        this.f2499i.setStrokeWidth(this.f2498h.getWebLineWidth());
        this.f2499i.setColor(this.f2498h.getWebColor());
        this.f2499i.setAlpha(this.f2498h.getWebAlpha());
        int skipWebLineCount = this.f2498h.getSkipWebLineCount() + 1;
        int H0 = ((C2301j) ((C2268j) this.f2498h.getData()).mo17284k()).mo17385H0();
        C2342e c = C2342e.m3925c(0.0f, 0.0f);
        for (int i = 0; i < H0; i += skipWebLineCount) {
            C2347i.m3970q(centerOffsets, this.f2498h.getYRange() * factor, (((float) i) * sliceAngle) + rotationAngle, c);
            canvas.drawLine(centerOffsets.f2538c, centerOffsets.f2539d, c.f2538c, c.f2539d, this.f2499i);
        }
        C2342e.m3927e(c);
        this.f2499i.setStrokeWidth(this.f2498h.getWebLineWidthInner());
        this.f2499i.setColor(this.f2498h.getWebColorInner());
        this.f2499i.setAlpha(this.f2498h.getWebAlpha());
        int i2 = this.f2498h.getYAxis().f2332n;
        C2342e c2 = C2342e.m3925c(0.0f, 0.0f);
        C2342e c3 = C2342e.m3925c(0.0f, 0.0f);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (i4 < ((C2268j) this.f2498h.getData()).mo17280g()) {
                float yChartMin = (this.f2498h.getYAxis().f2330l[i3] - this.f2498h.getYChartMin()) * factor;
                C2347i.m3970q(centerOffsets, yChartMin, (((float) i4) * sliceAngle) + rotationAngle, c2);
                i4++;
                C2347i.m3970q(centerOffsets, yChartMin, (((float) i4) * sliceAngle) + rotationAngle, c3);
                canvas.drawLine(c2.f2538c, c2.f2539d, c3.f2538c, c3.f2539d, this.f2499i);
            }
        }
        C2342e.m3927e(c2);
        C2342e.m3927e(c3);
    }
}
