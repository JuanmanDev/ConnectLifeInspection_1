package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;
import p040c.p175p.p184b.p185a.p188c.C2254a;
import p040c.p175p.p184b.p185a.p189d.C2268j;
import p040c.p175p.p184b.p185a.p192g.p194b.C2301j;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.v */
/* compiled from: YAxisRendererRadarChart */
public class C2336v extends C2334t {

    /* renamed from: r */
    public RadarChart f2529r;

    /* renamed from: s */
    public Path f2530s = new Path();

    public C2336v(C2348j jVar, YAxis yAxis, RadarChart radarChart) {
        super(jVar, yAxis, (C2345g) null);
        this.f2529r = radarChart;
    }

    /* renamed from: b */
    public void mo17493b(float f, float f2) {
        double d;
        double d2;
        boolean z;
        float f3 = f;
        float f4 = f2;
        int p = this.f2419b.mo17246p();
        double abs = (double) Math.abs(f4 - f3);
        if (p == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            C2254a aVar = this.f2419b;
            aVar.f2330l = new float[0];
            aVar.f2331m = new float[0];
            aVar.f2332n = 0;
            return;
        }
        double x = (double) C2347i.m3977x(abs / ((double) p));
        if (this.f2419b.mo17234A() && x < ((double) this.f2419b.mo17242l())) {
            x = (double) this.f2419b.mo17242l();
        }
        double x2 = (double) C2347i.m3977x(Math.pow(10.0d, (double) ((int) Math.log10(x))));
        if (((int) (x / x2)) > 5) {
            x = Math.floor(x2 * 10.0d);
        }
        boolean t = this.f2419b.mo17250t();
        if (this.f2419b.mo17256z()) {
            float f5 = ((float) abs) / ((float) (p - 1));
            C2254a aVar2 = this.f2419b;
            aVar2.f2332n = p;
            if (aVar2.f2330l.length < p) {
                aVar2.f2330l = new float[p];
            }
            for (int i = 0; i < p; i++) {
                this.f2419b.f2330l[i] = f3;
                f3 += f5;
            }
        } else {
            int i2 = (x > 0.0d ? 1 : (x == 0.0d ? 0 : -1));
            if (i2 == 0) {
                d = 0.0d;
            } else {
                d = Math.ceil(((double) f3) / x) * x;
            }
            if (t) {
                d -= x;
            }
            if (i2 == 0) {
                d2 = 0.0d;
            } else {
                d2 = C2347i.m3975v(Math.floor(((double) f4) / x) * x);
            }
            if (i2 != 0) {
                z = t;
                for (double d3 = d; d3 <= d2; d3 += x) {
                    z++;
                }
            } else {
                z = t;
            }
            int i3 = ((int) z) + 1;
            C2254a aVar3 = this.f2419b;
            aVar3.f2332n = i3;
            if (aVar3.f2330l.length < i3) {
                aVar3.f2330l = new float[i3];
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (d == 0.0d) {
                    d = 0.0d;
                }
                this.f2419b.f2330l[i4] = (float) d;
                d += x;
            }
            p = i3;
        }
        if (x < 1.0d) {
            this.f2419b.f2333o = (int) Math.ceil(-Math.log10(x));
        } else {
            this.f2419b.f2333o = 0;
        }
        if (t) {
            C2254a aVar4 = this.f2419b;
            if (aVar4.f2331m.length < p) {
                aVar4.f2331m = new float[p];
            }
            float[] fArr = this.f2419b.f2330l;
            float f6 = (fArr[1] - fArr[0]) / 2.0f;
            for (int i5 = 0; i5 < p; i5++) {
                C2254a aVar5 = this.f2419b;
                aVar5.f2331m[i5] = aVar5.f2330l[i5] + f6;
            }
        }
        C2254a aVar6 = this.f2419b;
        float[] fArr2 = aVar6.f2330l;
        float f7 = fArr2[0];
        aVar6.f2323H = f7;
        float f8 = fArr2[p - 1];
        aVar6.f2322G = f8;
        aVar6.f2324I = Math.abs(f8 - f7);
    }

    /* renamed from: i */
    public void mo17572i(Canvas canvas) {
        if (this.f2516h.mo17262f() && this.f2516h.mo17254x()) {
            this.f2422e.setTypeface(this.f2516h.mo17259c());
            this.f2422e.setTextSize(this.f2516h.mo17258b());
            this.f2422e.setColor(this.f2516h.mo17257a());
            C2342e centerOffsets = this.f2529r.getCenterOffsets();
            C2342e c = C2342e.m3925c(0.0f, 0.0f);
            float factor = this.f2529r.getFactor();
            int i = this.f2516h.mo23861O() ? this.f2516h.f2332n : this.f2516h.f2332n - 1;
            for (int i2 = !this.f2516h.mo23860N(); i2 < i; i2++) {
                YAxis yAxis = this.f2516h;
                C2347i.m3970q(centerOffsets, (yAxis.f2330l[i2] - yAxis.f2323H) * factor, this.f2529r.getRotationAngle(), c);
                canvas.drawText(this.f2516h.mo17241k(i2), c.f2538c + 10.0f, c.f2539d, this.f2422e);
            }
            C2342e.m3927e(centerOffsets);
            C2342e.m3927e(c);
        }
    }

    /* renamed from: l */
    public void mo17575l(Canvas canvas) {
        List<LimitLine> q = this.f2516h.mo17247q();
        if (q != null) {
            float sliceAngle = this.f2529r.getSliceAngle();
            float factor = this.f2529r.getFactor();
            C2342e centerOffsets = this.f2529r.getCenterOffsets();
            C2342e c = C2342e.m3925c(0.0f, 0.0f);
            for (int i = 0; i < q.size(); i++) {
                LimitLine limitLine = q.get(i);
                if (limitLine.mo17262f()) {
                    this.f2424g.setColor(limitLine.mo23839k());
                    this.f2424g.setPathEffect(limitLine.mo23835g());
                    this.f2424g.setStrokeWidth(limitLine.mo23840l());
                    float j = (limitLine.mo23838j() - this.f2529r.getYChartMin()) * factor;
                    Path path = this.f2530s;
                    path.reset();
                    for (int i2 = 0; i2 < ((C2301j) ((C2268j) this.f2529r.getData()).mo17284k()).mo17385H0(); i2++) {
                        C2347i.m3970q(centerOffsets, j, (((float) i2) * sliceAngle) + this.f2529r.getRotationAngle(), c);
                        if (i2 == 0) {
                            path.moveTo(c.f2538c, c.f2539d);
                        } else {
                            path.lineTo(c.f2538c, c.f2539d);
                        }
                    }
                    path.close();
                    canvas.drawPath(path, this.f2424g);
                }
            }
            C2342e.m3927e(centerOffsets);
            C2342e.m3927e(c);
        }
    }
}
