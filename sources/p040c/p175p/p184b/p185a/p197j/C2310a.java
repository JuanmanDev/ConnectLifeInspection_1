package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import p040c.p175p.p184b.p185a.p188c.C2254a;
import p040c.p175p.p184b.p185a.p199k.C2341d;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.a */
/* compiled from: AxisRenderer */
public abstract class C2310a extends C2329o {

    /* renamed from: b */
    public C2254a f2419b;

    /* renamed from: c */
    public C2345g f2420c;

    /* renamed from: d */
    public Paint f2421d;

    /* renamed from: e */
    public Paint f2422e;

    /* renamed from: f */
    public Paint f2423f;

    /* renamed from: g */
    public Paint f2424g;

    public C2310a(C2348j jVar, C2345g gVar, C2254a aVar) {
        super(jVar);
        this.f2420c = gVar;
        this.f2419b = aVar;
        if (this.f2503a != null) {
            this.f2422e = new Paint(1);
            Paint paint = new Paint();
            this.f2421d = paint;
            paint.setColor(-7829368);
            this.f2421d.setStrokeWidth(1.0f);
            this.f2421d.setStyle(Paint.Style.STROKE);
            this.f2421d.setAlpha(90);
            Paint paint2 = new Paint();
            this.f2423f = paint2;
            paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
            this.f2423f.setStrokeWidth(1.0f);
            this.f2423f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.f2424g = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: a */
    public void mo17492a(float f, float f2, boolean z) {
        float f3;
        double d;
        C2348j jVar = this.f2503a;
        if (jVar != null && jVar.mo17633k() > 10.0f && !this.f2503a.mo17645w()) {
            C2341d g = this.f2420c.mo17594g(this.f2503a.mo17630h(), this.f2503a.mo17632j());
            C2341d g2 = this.f2420c.mo17594g(this.f2503a.mo17630h(), this.f2503a.mo17628f());
            if (!z) {
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

    /* renamed from: b */
    public void mo17493b(float f, float f2) {
        double d;
        double d2;
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
        int t = this.f2419b.mo17250t();
        if (this.f2419b.mo17256z()) {
            x = (double) (((float) abs) / ((float) (p - 1)));
            C2254a aVar2 = this.f2419b;
            aVar2.f2332n = p;
            if (aVar2.f2330l.length < p) {
                aVar2.f2330l = new float[p];
            }
            for (int i = 0; i < p; i++) {
                this.f2419b.f2330l[i] = f3;
                f3 = (float) (((double) f3) + x);
            }
        } else {
            int i2 = (x > 0.0d ? 1 : (x == 0.0d ? 0 : -1));
            if (i2 == 0) {
                d = 0.0d;
            } else {
                d = Math.ceil(((double) f3) / x) * x;
            }
            if (this.f2419b.mo17250t()) {
                d -= x;
            }
            if (i2 == 0) {
                d2 = 0.0d;
            } else {
                d2 = C2347i.m3975v(Math.floor(((double) f4) / x) * x);
            }
            if (i2 != 0) {
                for (double d3 = d; d3 <= d2; d3 += x) {
                    t++;
                }
            }
            C2254a aVar3 = this.f2419b;
            aVar3.f2332n = t;
            if (aVar3.f2330l.length < t) {
                aVar3.f2330l = new float[t];
            }
            for (int i3 = 0; i3 < t; i3++) {
                if (d == 0.0d) {
                    d = 0.0d;
                }
                this.f2419b.f2330l[i3] = (float) d;
                d += x;
            }
            p = t;
        }
        if (x < 1.0d) {
            this.f2419b.f2333o = (int) Math.ceil(-Math.log10(x));
        } else {
            this.f2419b.f2333o = 0;
        }
        if (this.f2419b.mo17250t()) {
            C2254a aVar4 = this.f2419b;
            if (aVar4.f2331m.length < p) {
                aVar4.f2331m = new float[p];
            }
            float f5 = ((float) x) / 2.0f;
            for (int i4 = 0; i4 < p; i4++) {
                C2254a aVar5 = this.f2419b;
                aVar5.f2331m[i4] = aVar5.f2330l[i4] + f5;
            }
        }
    }

    /* renamed from: c */
    public Paint mo17494c() {
        return this.f2422e;
    }
}
