package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;
import p040c.p175p.p184b.p185a.p190e.C2273d;
import p040c.p175p.p184b.p185a.p199k.C2339b;
import p040c.p175p.p184b.p185a.p199k.C2341d;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.r */
/* compiled from: XAxisRendererHorizontalBarChart */
public class C2332r extends C2331q {

    /* renamed from: p */
    public Path f2514p = new Path();

    public C2332r(C2348j jVar, XAxis xAxis, C2345g gVar, BarChart barChart) {
        super(jVar, xAxis, gVar);
    }

    /* renamed from: a */
    public void mo17492a(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.f2503a.mo17633k() > 10.0f && !this.f2503a.mo17645w()) {
            C2341d g = this.f2420c.mo17594g(this.f2503a.mo17630h(), this.f2503a.mo17628f());
            C2341d g2 = this.f2420c.mo17594g(this.f2503a.mo17630h(), this.f2503a.mo17632j());
            if (z) {
                f3 = (float) g2.f2536d;
                d = g.f2536d;
            } else {
                f3 = (float) g.f2536d;
                d = g2.f2536d;
            }
            C2341d.m3922c(g);
            C2341d.m3922c(g2);
            f = f3;
            f2 = (float) d;
        }
        mo17493b(f, f2);
    }

    /* renamed from: d */
    public void mo17555d() {
        this.f2422e.setTypeface(this.f2506h.mo17259c());
        this.f2422e.setTextSize(this.f2506h.mo17258b());
        C2339b b = C2347i.m3955b(this.f2422e, this.f2506h.mo17248r());
        float f = b.f2533d;
        C2339b s = C2347i.m3972s(b.f2532c, f, this.f2506h.mo23847D());
        this.f2506h.f7505J = Math.round((float) ((int) (b.f2532c + (this.f2506h.mo17260d() * 3.5f))));
        this.f2506h.f7506K = Math.round(f);
        XAxis xAxis = this.f2506h;
        xAxis.f7507L = (int) (s.f2532c + (xAxis.mo17260d() * 3.5f));
        this.f2506h.f7508M = Math.round(s.f2533d);
        C2339b.m3919c(s);
    }

    /* renamed from: e */
    public void mo17556e(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(this.f2503a.mo17631i(), f2);
        path.lineTo(this.f2503a.mo17630h(), f2);
        canvas.drawPath(path, this.f2421d);
        path.reset();
    }

    /* renamed from: g */
    public void mo17558g(Canvas canvas, float f, C2342e eVar) {
        float D = this.f2506h.mo23847D();
        boolean t = this.f2506h.mo17250t();
        int i = this.f2506h.f2332n * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (t) {
                fArr[i2 + 1] = this.f2506h.f2331m[i2 / 2];
            } else {
                fArr[i2 + 1] = this.f2506h.f2330l[i2 / 2];
            }
        }
        this.f2420c.mo17598k(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3 + 1];
            if (this.f2503a.mo17607D(f2)) {
                C2273d s = this.f2506h.mo17249s();
                XAxis xAxis = this.f2506h;
                mo17557f(canvas, s.mo17306a(xAxis.f2330l[i3 / 2], xAxis), f, f2, eVar, D);
            }
        }
    }

    /* renamed from: h */
    public RectF mo17559h() {
        this.f2509k.set(this.f2503a.mo17637o());
        this.f2509k.inset(0.0f, -this.f2419b.mo17245o());
        return this.f2509k;
    }

    /* renamed from: i */
    public void mo17560i(Canvas canvas) {
        if (this.f2506h.mo17262f() && this.f2506h.mo17254x()) {
            float d = this.f2506h.mo17260d();
            this.f2422e.setTypeface(this.f2506h.mo17259c());
            this.f2422e.setTextSize(this.f2506h.mo17258b());
            this.f2422e.setColor(this.f2506h.mo17257a());
            C2342e c = C2342e.m3925c(0.0f, 0.0f);
            if (this.f2506h.mo23848E() == XAxis.XAxisPosition.TOP) {
                c.f2538c = 0.0f;
                c.f2539d = 0.5f;
                mo17558g(canvas, this.f2503a.mo17631i() + d, c);
            } else if (this.f2506h.mo23848E() == XAxis.XAxisPosition.TOP_INSIDE) {
                c.f2538c = 1.0f;
                c.f2539d = 0.5f;
                mo17558g(canvas, this.f2503a.mo17631i() - d, c);
            } else if (this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTTOM) {
                c.f2538c = 1.0f;
                c.f2539d = 0.5f;
                mo17558g(canvas, this.f2503a.mo17630h() - d, c);
            } else if (this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                c.f2538c = 1.0f;
                c.f2539d = 0.5f;
                mo17558g(canvas, this.f2503a.mo17630h() + d, c);
            } else {
                c.f2538c = 0.0f;
                c.f2539d = 0.5f;
                mo17558g(canvas, this.f2503a.mo17631i() + d, c);
                c.f2538c = 1.0f;
                c.f2539d = 0.5f;
                mo17558g(canvas, this.f2503a.mo17630h() - d, c);
            }
            C2342e.m3927e(c);
        }
    }

    /* renamed from: j */
    public void mo17561j(Canvas canvas) {
        if (this.f2506h.mo17251u() && this.f2506h.mo17262f()) {
            this.f2423f.setColor(this.f2506h.mo17238h());
            this.f2423f.setStrokeWidth(this.f2506h.mo17240j());
            if (this.f2506h.mo23848E() == XAxis.XAxisPosition.TOP || this.f2506h.mo23848E() == XAxis.XAxisPosition.TOP_INSIDE || this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.f2503a.mo17631i(), this.f2503a.mo17632j(), this.f2503a.mo17631i(), this.f2503a.mo17628f(), this.f2423f);
            }
            if (this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTTOM || this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.f2503a.mo17630h(), this.f2503a.mo17632j(), this.f2503a.mo17630h(), this.f2503a.mo17628f(), this.f2423f);
            }
        }
    }

    /* renamed from: n */
    public void mo17565n(Canvas canvas) {
        List<LimitLine> q = this.f2506h.mo17247q();
        if (q != null && q.size() > 0) {
            float[] fArr = this.f2510l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.f2514p;
            path.reset();
            for (int i = 0; i < q.size(); i++) {
                LimitLine limitLine = q.get(i);
                if (limitLine.mo17262f()) {
                    int save = canvas.save();
                    this.f2511m.set(this.f2503a.mo17637o());
                    this.f2511m.inset(0.0f, -limitLine.mo23840l());
                    canvas.clipRect(this.f2511m);
                    this.f2424g.setStyle(Paint.Style.STROKE);
                    this.f2424g.setColor(limitLine.mo23839k());
                    this.f2424g.setStrokeWidth(limitLine.mo23840l());
                    this.f2424g.setPathEffect(limitLine.mo23835g());
                    fArr[1] = limitLine.mo23838j();
                    this.f2420c.mo17598k(fArr);
                    path.moveTo(this.f2503a.mo17630h(), fArr[1]);
                    path.lineTo(this.f2503a.mo17631i(), fArr[1]);
                    canvas.drawPath(path, this.f2424g);
                    path.reset();
                    String h = limitLine.mo23836h();
                    if (h != null && !h.equals("")) {
                        this.f2424g.setStyle(limitLine.mo23841m());
                        this.f2424g.setPathEffect((PathEffect) null);
                        this.f2424g.setColor(limitLine.mo17257a());
                        this.f2424g.setStrokeWidth(0.5f);
                        this.f2424g.setTextSize(limitLine.mo17258b());
                        float a = (float) C2347i.m3954a(this.f2424g, h);
                        float e = C2347i.m3958e(4.0f) + limitLine.mo17260d();
                        float l = limitLine.mo23840l() + a + limitLine.mo17261e();
                        LimitLine.LimitLabelPosition i2 = limitLine.mo23837i();
                        if (i2 == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            this.f2424g.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(h, this.f2503a.mo17631i() - e, (fArr[1] - l) + a, this.f2424g);
                        } else if (i2 == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                            this.f2424g.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(h, this.f2503a.mo17631i() - e, fArr[1] + l, this.f2424g);
                        } else if (i2 == LimitLine.LimitLabelPosition.LEFT_TOP) {
                            this.f2424g.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(h, this.f2503a.mo17630h() + e, (fArr[1] - l) + a, this.f2424g);
                        } else {
                            this.f2424g.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(h, this.f2503a.mo17610G() + e, fArr[1] + l, this.f2424g);
                        }
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
