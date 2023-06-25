package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;
import p040c.p175p.p184b.p185a.p199k.C2341d;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.t */
/* compiled from: YAxisRenderer */
public class C2334t extends C2310a {

    /* renamed from: h */
    public YAxis f2516h;

    /* renamed from: i */
    public Paint f2517i;

    /* renamed from: j */
    public Path f2518j = new Path();

    /* renamed from: k */
    public RectF f2519k = new RectF();

    /* renamed from: l */
    public float[] f2520l = new float[2];

    /* renamed from: m */
    public Path f2521m = new Path();

    /* renamed from: n */
    public RectF f2522n = new RectF();

    /* renamed from: o */
    public Path f2523o = new Path();

    /* renamed from: p */
    public float[] f2524p = new float[2];

    /* renamed from: q */
    public RectF f2525q = new RectF();

    public C2334t(C2348j jVar, YAxis yAxis, C2345g gVar) {
        super(jVar, gVar, yAxis);
        this.f2516h = yAxis;
        if (this.f2503a != null) {
            this.f2422e.setColor(ViewCompat.MEASURED_STATE_MASK);
            this.f2422e.setTextSize(C2347i.m3958e(10.0f));
            Paint paint = new Paint(1);
            this.f2517i = paint;
            paint.setColor(-7829368);
            this.f2517i.setStrokeWidth(1.0f);
            this.f2517i.setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: d */
    public void mo17567d(Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.f2516h.mo23861O() ? this.f2516h.f2332n : this.f2516h.f2332n - 1;
        for (int i2 = !this.f2516h.mo23860N(); i2 < i; i2++) {
            canvas.drawText(this.f2516h.mo17241k(i2), f, fArr[(i2 * 2) + 1] + f2, this.f2422e);
        }
    }

    /* renamed from: e */
    public void mo17568e(Canvas canvas) {
        int save = canvas.save();
        this.f2522n.set(this.f2503a.mo17637o());
        this.f2522n.inset(0.0f, -this.f2516h.mo23859M());
        canvas.clipRect(this.f2522n);
        C2341d e = this.f2420c.mo17592e(0.0f, 0.0f);
        this.f2517i.setColor(this.f2516h.mo23858L());
        this.f2517i.setStrokeWidth(this.f2516h.mo23859M());
        Path path = this.f2521m;
        path.reset();
        path.moveTo(this.f2503a.mo17630h(), (float) e.f2536d);
        path.lineTo(this.f2503a.mo17631i(), (float) e.f2536d);
        canvas.drawPath(path, this.f2517i);
        canvas.restoreToCount(save);
    }

    /* renamed from: f */
    public RectF mo17569f() {
        this.f2519k.set(this.f2503a.mo17637o());
        this.f2519k.inset(0.0f, -this.f2419b.mo17245o());
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
            fArr[i2 + 1] = this.f2516h.f2330l[i2 / 2];
        }
        this.f2420c.mo17598k(fArr);
        return fArr;
    }

    /* renamed from: h */
    public Path mo17571h(Path path, int i, float[] fArr) {
        int i2 = i + 1;
        path.moveTo(this.f2503a.mo17610G(), fArr[i2]);
        path.lineTo(this.f2503a.mo17631i(), fArr[i2]);
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
            float d = this.f2516h.mo17260d();
            float a = (((float) C2347i.m3954a(this.f2422e, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) / 2.5f) + this.f2516h.mo17261e();
            YAxis.AxisDependency D = this.f2516h.mo23850D();
            YAxis.YAxisLabelPosition E = this.f2516h.mo23851E();
            if (D == YAxis.AxisDependency.LEFT) {
                if (E == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    this.f2422e.setTextAlign(Paint.Align.RIGHT);
                    f2 = this.f2503a.mo17610G();
                    f = f2 - d;
                    mo17567d(canvas, f, g, a);
                }
                this.f2422e.setTextAlign(Paint.Align.LEFT);
                f3 = this.f2503a.mo17610G();
            } else if (E == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                this.f2422e.setTextAlign(Paint.Align.LEFT);
                f3 = this.f2503a.mo17631i();
            } else {
                this.f2422e.setTextAlign(Paint.Align.RIGHT);
                f2 = this.f2503a.mo17631i();
                f = f2 - d;
                mo17567d(canvas, f, g, a);
            }
            f = f3 + d;
            mo17567d(canvas, f, g, a);
        }
    }

    /* renamed from: j */
    public void mo17573j(Canvas canvas) {
        if (this.f2516h.mo17262f() && this.f2516h.mo17251u()) {
            this.f2423f.setColor(this.f2516h.mo17238h());
            this.f2423f.setStrokeWidth(this.f2516h.mo17240j());
            if (this.f2516h.mo23850D() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.f2503a.mo17630h(), this.f2503a.mo17632j(), this.f2503a.mo17630h(), this.f2503a.mo17628f(), this.f2423f);
                return;
            }
            canvas.drawLine(this.f2503a.mo17631i(), this.f2503a.mo17632j(), this.f2503a.mo17631i(), this.f2503a.mo17628f(), this.f2423f);
        }
    }

    /* renamed from: k */
    public void mo17574k(Canvas canvas) {
        if (this.f2516h.mo17262f()) {
            if (this.f2516h.mo17253w()) {
                int save = canvas.save();
                canvas.clipRect(mo17569f());
                float[] g = mo17570g();
                this.f2421d.setColor(this.f2516h.mo17243m());
                this.f2421d.setStrokeWidth(this.f2516h.mo17245o());
                this.f2421d.setPathEffect(this.f2516h.mo17244n());
                Path path = this.f2518j;
                path.reset();
                for (int i = 0; i < g.length; i += 2) {
                    canvas.drawPath(mo17571h(path, i, g), this.f2421d);
                    path.reset();
                }
                canvas.restoreToCount(save);
            }
            if (this.f2516h.mo23862P()) {
                mo17568e(canvas);
            }
        }
    }

    /* renamed from: l */
    public void mo17575l(Canvas canvas) {
        List<LimitLine> q = this.f2516h.mo17247q();
        if (q != null && q.size() > 0) {
            float[] fArr = this.f2524p;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.f2523o;
            path.reset();
            for (int i = 0; i < q.size(); i++) {
                LimitLine limitLine = q.get(i);
                if (limitLine.mo17262f()) {
                    int save = canvas.save();
                    this.f2525q.set(this.f2503a.mo17637o());
                    this.f2525q.inset(0.0f, -limitLine.mo23840l());
                    canvas.clipRect(this.f2525q);
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
                        this.f2424g.setTypeface(limitLine.mo17259c());
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
