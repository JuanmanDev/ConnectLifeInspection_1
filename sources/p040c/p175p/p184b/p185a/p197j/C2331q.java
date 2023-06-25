package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
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

/* renamed from: c.p.b.a.j.q */
/* compiled from: XAxisRenderer */
public class C2331q extends C2310a {

    /* renamed from: h */
    public XAxis f2506h;

    /* renamed from: i */
    public Path f2507i = new Path();

    /* renamed from: j */
    public float[] f2508j = new float[2];

    /* renamed from: k */
    public RectF f2509k = new RectF();

    /* renamed from: l */
    public float[] f2510l = new float[2];

    /* renamed from: m */
    public RectF f2511m = new RectF();

    /* renamed from: n */
    public float[] f2512n = new float[4];

    /* renamed from: o */
    public Path f2513o = new Path();

    public C2331q(C2348j jVar, XAxis xAxis, C2345g gVar) {
        super(jVar, gVar, xAxis);
        this.f2506h = xAxis;
        this.f2422e.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f2422e.setTextAlign(Paint.Align.CENTER);
        this.f2422e.setTextSize(C2347i.m3958e(10.0f));
    }

    /* renamed from: a */
    public void mo17492a(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.f2503a.mo17633k() > 10.0f && !this.f2503a.mo17644v()) {
            C2341d g = this.f2420c.mo17594g(this.f2503a.mo17630h(), this.f2503a.mo17632j());
            C2341d g2 = this.f2420c.mo17594g(this.f2503a.mo17631i(), this.f2503a.mo17632j());
            if (z) {
                f3 = (float) g2.f2535c;
                d = g.f2535c;
            } else {
                f3 = (float) g.f2535c;
                d = g2.f2535c;
            }
            C2341d.m3922c(g);
            C2341d.m3922c(g2);
            f = f3;
            f2 = (float) d;
        }
        mo17493b(f, f2);
    }

    /* renamed from: b */
    public void mo17493b(float f, float f2) {
        super.mo17493b(f, f2);
        mo17555d();
    }

    /* renamed from: d */
    public void mo17555d() {
        String r = this.f2506h.mo17248r();
        this.f2422e.setTypeface(this.f2506h.mo17259c());
        this.f2422e.setTextSize(this.f2506h.mo17258b());
        C2339b b = C2347i.m3955b(this.f2422e, r);
        float f = b.f2532c;
        float a = (float) C2347i.m3954a(this.f2422e, "Q");
        C2339b s = C2347i.m3972s(f, a, this.f2506h.mo23847D());
        this.f2506h.f7505J = Math.round(f);
        this.f2506h.f7506K = Math.round(a);
        this.f2506h.f7507L = Math.round(s.f2532c);
        this.f2506h.f7508M = Math.round(s.f2533d);
        C2339b.m3919c(s);
        C2339b.m3919c(b);
    }

    /* renamed from: e */
    public void mo17556e(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(f, this.f2503a.mo17628f());
        path.lineTo(f, this.f2503a.mo17632j());
        canvas.drawPath(path, this.f2421d);
        path.reset();
    }

    /* renamed from: f */
    public void mo17557f(Canvas canvas, String str, float f, float f2, C2342e eVar, float f3) {
        C2347i.m3960g(canvas, str, f, f2, this.f2422e, eVar, f3);
    }

    /* renamed from: g */
    public void mo17558g(Canvas canvas, float f, C2342e eVar) {
        float D = this.f2506h.mo23847D();
        boolean t = this.f2506h.mo17250t();
        int i = this.f2506h.f2332n * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (t) {
                fArr[i2] = this.f2506h.f2331m[i2 / 2];
            } else {
                fArr[i2] = this.f2506h.f2330l[i2 / 2];
            }
        }
        this.f2420c.mo17598k(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3];
            if (this.f2503a.mo17606C(f2)) {
                C2273d s = this.f2506h.mo17249s();
                XAxis xAxis = this.f2506h;
                int i4 = i3 / 2;
                String a = s.mo17306a(xAxis.f2330l[i4], xAxis);
                if (this.f2506h.mo23849F()) {
                    int i5 = this.f2506h.f2332n;
                    if (i4 == i5 - 1 && i5 > 1) {
                        float d = (float) C2347i.m3957d(this.f2422e, a);
                        if (d > this.f2503a.mo17611H() * 2.0f && f2 + d > this.f2503a.mo17635m()) {
                            f2 -= d / 2.0f;
                        }
                    } else if (i3 == 0) {
                        f2 += ((float) C2347i.m3957d(this.f2422e, a)) / 2.0f;
                    }
                }
                mo17557f(canvas, a, f2, f, eVar, D);
            }
        }
    }

    /* renamed from: h */
    public RectF mo17559h() {
        this.f2509k.set(this.f2503a.mo17637o());
        this.f2509k.inset(-this.f2419b.mo17245o(), 0.0f);
        return this.f2509k;
    }

    /* renamed from: i */
    public void mo17560i(Canvas canvas) {
        if (this.f2506h.mo17262f() && this.f2506h.mo17254x()) {
            float e = this.f2506h.mo17261e();
            this.f2422e.setTypeface(this.f2506h.mo17259c());
            this.f2422e.setTextSize(this.f2506h.mo17258b());
            this.f2422e.setColor(this.f2506h.mo17257a());
            C2342e c = C2342e.m3925c(0.0f, 0.0f);
            if (this.f2506h.mo23848E() == XAxis.XAxisPosition.TOP) {
                c.f2538c = 0.5f;
                c.f2539d = 1.0f;
                mo17558g(canvas, this.f2503a.mo17632j() - e, c);
            } else if (this.f2506h.mo23848E() == XAxis.XAxisPosition.TOP_INSIDE) {
                c.f2538c = 0.5f;
                c.f2539d = 1.0f;
                mo17558g(canvas, this.f2503a.mo17632j() + e + ((float) this.f2506h.f7508M), c);
            } else if (this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTTOM) {
                c.f2538c = 0.5f;
                c.f2539d = 0.0f;
                mo17558g(canvas, this.f2503a.mo17628f() + e, c);
            } else if (this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                c.f2538c = 0.5f;
                c.f2539d = 0.0f;
                mo17558g(canvas, (this.f2503a.mo17628f() - e) - ((float) this.f2506h.f7508M), c);
            } else {
                c.f2538c = 0.5f;
                c.f2539d = 1.0f;
                mo17558g(canvas, this.f2503a.mo17632j() - e, c);
                c.f2538c = 0.5f;
                c.f2539d = 0.0f;
                mo17558g(canvas, this.f2503a.mo17628f() + e, c);
            }
            C2342e.m3927e(c);
        }
    }

    /* renamed from: j */
    public void mo17561j(Canvas canvas) {
        if (this.f2506h.mo17251u() && this.f2506h.mo17262f()) {
            this.f2423f.setColor(this.f2506h.mo17238h());
            this.f2423f.setStrokeWidth(this.f2506h.mo17240j());
            this.f2423f.setPathEffect(this.f2506h.mo17239i());
            if (this.f2506h.mo23848E() == XAxis.XAxisPosition.TOP || this.f2506h.mo23848E() == XAxis.XAxisPosition.TOP_INSIDE || this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.f2503a.mo17630h(), this.f2503a.mo17632j(), this.f2503a.mo17631i(), this.f2503a.mo17632j(), this.f2423f);
            }
            if (this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTTOM || this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.f2506h.mo23848E() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.f2503a.mo17630h(), this.f2503a.mo17628f(), this.f2503a.mo17631i(), this.f2503a.mo17628f(), this.f2423f);
            }
        }
    }

    /* renamed from: k */
    public void mo17562k(Canvas canvas) {
        if (this.f2506h.mo17253w() && this.f2506h.mo17262f()) {
            int save = canvas.save();
            canvas.clipRect(mo17559h());
            if (this.f2508j.length != this.f2419b.f2332n * 2) {
                this.f2508j = new float[(this.f2506h.f2332n * 2)];
            }
            float[] fArr = this.f2508j;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = this.f2506h.f2330l;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            this.f2420c.mo17598k(fArr);
            mo17566o();
            Path path = this.f2507i;
            path.reset();
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                mo17556e(canvas, fArr[i3], fArr[i3 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: l */
    public void mo17563l(Canvas canvas, LimitLine limitLine, float[] fArr, float f) {
        String h = limitLine.mo23836h();
        if (h != null && !h.equals("")) {
            this.f2424g.setStyle(limitLine.mo23841m());
            this.f2424g.setPathEffect((PathEffect) null);
            this.f2424g.setColor(limitLine.mo17257a());
            this.f2424g.setStrokeWidth(0.5f);
            this.f2424g.setTextSize(limitLine.mo17258b());
            float l = limitLine.mo23840l() + limitLine.mo17260d();
            LimitLine.LimitLabelPosition i = limitLine.mo23837i();
            if (i == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                this.f2424g.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(h, fArr[0] + l, this.f2503a.mo17632j() + f + ((float) C2347i.m3954a(this.f2424g, h)), this.f2424g);
            } else if (i == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                this.f2424g.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(h, fArr[0] + l, this.f2503a.mo17628f() - f, this.f2424g);
            } else if (i == LimitLine.LimitLabelPosition.LEFT_TOP) {
                this.f2424g.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(h, fArr[0] - l, this.f2503a.mo17632j() + f + ((float) C2347i.m3954a(this.f2424g, h)), this.f2424g);
            } else {
                this.f2424g.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(h, fArr[0] - l, this.f2503a.mo17628f() - f, this.f2424g);
            }
        }
    }

    /* renamed from: m */
    public void mo17564m(Canvas canvas, LimitLine limitLine, float[] fArr) {
        float[] fArr2 = this.f2512n;
        fArr2[0] = fArr[0];
        fArr2[1] = this.f2503a.mo17632j();
        float[] fArr3 = this.f2512n;
        fArr3[2] = fArr[0];
        fArr3[3] = this.f2503a.mo17628f();
        this.f2513o.reset();
        Path path = this.f2513o;
        float[] fArr4 = this.f2512n;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.f2513o;
        float[] fArr5 = this.f2512n;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.f2424g.setStyle(Paint.Style.STROKE);
        this.f2424g.setColor(limitLine.mo23839k());
        this.f2424g.setStrokeWidth(limitLine.mo23840l());
        this.f2424g.setPathEffect(limitLine.mo23835g());
        canvas.drawPath(this.f2513o, this.f2424g);
    }

    /* renamed from: n */
    public void mo17565n(Canvas canvas) {
        List<LimitLine> q = this.f2506h.mo17247q();
        if (q != null && q.size() > 0) {
            float[] fArr = this.f2510l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            for (int i = 0; i < q.size(); i++) {
                LimitLine limitLine = q.get(i);
                if (limitLine.mo17262f()) {
                    int save = canvas.save();
                    this.f2511m.set(this.f2503a.mo17637o());
                    this.f2511m.inset(-limitLine.mo23840l(), 0.0f);
                    canvas.clipRect(this.f2511m);
                    fArr[0] = limitLine.mo23838j();
                    fArr[1] = 0.0f;
                    this.f2420c.mo17598k(fArr);
                    mo17564m(canvas, limitLine, fArr);
                    mo17563l(canvas, limitLine, fArr, limitLine.mo17261e() + 2.0f);
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    /* renamed from: o */
    public void mo17566o() {
        this.f2421d.setColor(this.f2506h.mo17243m());
        this.f2421d.setStrokeWidth(this.f2506h.mo17245o());
        this.f2421d.setPathEffect(this.f2506h.mo17244n());
    }
}
