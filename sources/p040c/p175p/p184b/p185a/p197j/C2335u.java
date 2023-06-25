package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;
import p040c.p175p.p184b.p185a.p199k.C2341d;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.u */
/* compiled from: YAxisRendererHorizontalBarChart */
public class C2335u extends C2334t {

    /* renamed from: r */
    public Path f2526r = new Path();

    /* renamed from: s */
    public Path f2527s = new Path();

    /* renamed from: t */
    public float[] f2528t = new float[4];

    public C2335u(C2348j jVar, YAxis yAxis, C2345g gVar) {
        super(jVar, yAxis, gVar);
        this.f2424g.setTextAlign(Paint.Align.LEFT);
    }

    /* renamed from: a */
    public void mo17492a(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.f2503a.mo17629g() > 10.0f && !this.f2503a.mo17644v()) {
            C2341d g = this.f2420c.mo17594g(this.f2503a.mo17630h(), this.f2503a.mo17632j());
            C2341d g2 = this.f2420c.mo17594g(this.f2503a.mo17631i(), this.f2503a.mo17632j());
            if (!z) {
                f3 = (float) g.f2535c;
                d = g2.f2535c;
            } else {
                f3 = (float) g2.f2535c;
                d = g.f2535c;
            }
            C2341d.m3922c(g);
            C2341d.m3922c(g2);
            f = f3;
            f2 = (float) d;
        }
        mo17493b(f, f2);
    }

    /* renamed from: d */
    public void mo17567d(Canvas canvas, float f, float[] fArr, float f2) {
        this.f2422e.setTypeface(this.f2516h.mo17259c());
        this.f2422e.setTextSize(this.f2516h.mo17258b());
        this.f2422e.setColor(this.f2516h.mo17257a());
        int i = this.f2516h.mo23861O() ? this.f2516h.f2332n : this.f2516h.f2332n - 1;
        for (int i2 = !this.f2516h.mo23860N(); i2 < i; i2++) {
            canvas.drawText(this.f2516h.mo17241k(i2), fArr[i2 * 2], f - f2, this.f2422e);
        }
    }

    /* renamed from: e */
    public void mo17568e(Canvas canvas) {
        int save = canvas.save();
        this.f2522n.set(this.f2503a.mo17637o());
        this.f2522n.inset(-this.f2516h.mo23859M(), 0.0f);
        canvas.clipRect(this.f2525q);
        C2341d e = this.f2420c.mo17592e(0.0f, 0.0f);
        this.f2517i.setColor(this.f2516h.mo23858L());
        this.f2517i.setStrokeWidth(this.f2516h.mo23859M());
        Path path = this.f2526r;
        path.reset();
        path.moveTo(((float) e.f2535c) - 1.0f, this.f2503a.mo17632j());
        path.lineTo(((float) e.f2535c) - 1.0f, this.f2503a.mo17628f());
        canvas.drawPath(path, this.f2517i);
        canvas.restoreToCount(save);
    }

    /* renamed from: f */
    public RectF mo17569f() {
        this.f2519k.set(this.f2503a.mo17637o());
        this.f2519k.inset(-this.f2419b.mo17245o(), 0.0f);
        return this.f2519k;
    }

    /* renamed from: g */
    public float[] mo17570g() {
        int length = this.f2520l.length;
        int i = this.f2516h.f2332n;
        if (length != i * 2) {
            this.f2520l = new float[(i * 2)];
        }
        float[] fArr = this.f2520l;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2] = this.f2516h.f2330l[i2 / 2];
        }
        this.f2420c.mo17598k(fArr);
        return fArr;
    }

    /* renamed from: h */
    public Path mo17571h(Path path, int i, float[] fArr) {
        path.moveTo(fArr[i], this.f2503a.mo17632j());
        path.lineTo(fArr[i], this.f2503a.mo17628f());
        return path;
    }

    /* renamed from: i */
    public void mo17572i(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (this.f2516h.mo17262f() && this.f2516h.mo17254x()) {
            float[] g = mo17570g();
            this.f2422e.setTypeface(this.f2516h.mo17259c());
            this.f2422e.setTextSize(this.f2516h.mo17258b());
            this.f2422e.setColor(this.f2516h.mo17257a());
            this.f2422e.setTextAlign(Paint.Align.CENTER);
            float e = C2347i.m3958e(2.5f);
            float a = (float) C2347i.m3954a(this.f2422e, "Q");
            YAxis.AxisDependency D = this.f2516h.mo23850D();
            YAxis.YAxisLabelPosition E = this.f2516h.mo23851E();
            if (D == YAxis.AxisDependency.LEFT) {
                if (E == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    f3 = this.f2503a.mo17632j();
                } else {
                    f3 = this.f2503a.mo17632j();
                }
                f = f3 - e;
            } else {
                if (E == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    f2 = this.f2503a.mo17628f();
                } else {
                    f2 = this.f2503a.mo17628f();
                }
                f = f2 + a + e;
            }
            mo17567d(canvas, f, g, this.f2516h.mo17261e());
        }
    }

    /* renamed from: j */
    public void mo17573j(Canvas canvas) {
        if (this.f2516h.mo17262f() && this.f2516h.mo17251u()) {
            this.f2423f.setColor(this.f2516h.mo17238h());
            this.f2423f.setStrokeWidth(this.f2516h.mo17240j());
            if (this.f2516h.mo23850D() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.f2503a.mo17630h(), this.f2503a.mo17632j(), this.f2503a.mo17631i(), this.f2503a.mo17632j(), this.f2423f);
                return;
            }
            canvas.drawLine(this.f2503a.mo17630h(), this.f2503a.mo17628f(), this.f2503a.mo17631i(), this.f2503a.mo17628f(), this.f2423f);
        }
    }

    /* renamed from: l */
    public void mo17575l(Canvas canvas) {
        Canvas canvas2 = canvas;
        List<LimitLine> q = this.f2516h.mo17247q();
        if (q != null && q.size() > 0) {
            float[] fArr = this.f2528t;
            float f = 0.0f;
            fArr[0] = 0.0f;
            char c = 1;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            Path path = this.f2527s;
            path.reset();
            int i = 0;
            while (i < q.size()) {
                LimitLine limitLine = q.get(i);
                if (limitLine.mo17262f()) {
                    int save = canvas.save();
                    this.f2525q.set(this.f2503a.mo17637o());
                    this.f2525q.inset(-limitLine.mo23840l(), f);
                    canvas2.clipRect(this.f2525q);
                    fArr[0] = limitLine.mo23838j();
                    fArr[2] = limitLine.mo23838j();
                    this.f2420c.mo17598k(fArr);
                    fArr[c] = this.f2503a.mo17632j();
                    fArr[3] = this.f2503a.mo17628f();
                    path.moveTo(fArr[0], fArr[c]);
                    path.lineTo(fArr[2], fArr[3]);
                    this.f2424g.setStyle(Paint.Style.STROKE);
                    this.f2424g.setColor(limitLine.mo23839k());
                    this.f2424g.setPathEffect(limitLine.mo23835g());
                    this.f2424g.setStrokeWidth(limitLine.mo23840l());
                    canvas2.drawPath(path, this.f2424g);
                    path.reset();
                    String h = limitLine.mo23836h();
                    if (h != null && !h.equals("")) {
                        this.f2424g.setStyle(limitLine.mo23841m());
                        this.f2424g.setPathEffect((PathEffect) null);
                        this.f2424g.setColor(limitLine.mo17257a());
                        this.f2424g.setTypeface(limitLine.mo17259c());
                        this.f2424g.setStrokeWidth(0.5f);
                        this.f2424g.setTextSize(limitLine.mo17258b());
                        float l = limitLine.mo23840l() + limitLine.mo17260d();
                        float e = C2347i.m3958e(2.0f) + limitLine.mo17261e();
                        LimitLine.LimitLabelPosition i2 = limitLine.mo23837i();
                        if (i2 == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            this.f2424g.setTextAlign(Paint.Align.LEFT);
                            canvas2.drawText(h, fArr[0] + l, this.f2503a.mo17632j() + e + ((float) C2347i.m3954a(this.f2424g, h)), this.f2424g);
                        } else if (i2 == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                            this.f2424g.setTextAlign(Paint.Align.LEFT);
                            canvas2.drawText(h, fArr[0] + l, this.f2503a.mo17628f() - e, this.f2424g);
                        } else if (i2 == LimitLine.LimitLabelPosition.LEFT_TOP) {
                            this.f2424g.setTextAlign(Paint.Align.RIGHT);
                            canvas2.drawText(h, fArr[0] - l, this.f2503a.mo17632j() + e + ((float) C2347i.m3954a(this.f2424g, h)), this.f2424g);
                        } else {
                            this.f2424g.setTextAlign(Paint.Align.RIGHT);
                            canvas2.drawText(h, fArr[0] - l, this.f2503a.mo17628f() - e, this.f2424g);
                        }
                    }
                    canvas2.restoreToCount(save);
                }
                i++;
                f = 0.0f;
                c = 1;
            }
        }
    }
}
