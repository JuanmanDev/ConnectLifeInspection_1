package p040c.p175p.p184b.p185a.p199k;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* renamed from: c.p.b.a.k.j */
/* compiled from: ViewPortHandler */
public class C2348j {

    /* renamed from: a */
    public final Matrix f2569a = new Matrix();

    /* renamed from: b */
    public RectF f2570b = new RectF();

    /* renamed from: c */
    public float f2571c = 0.0f;

    /* renamed from: d */
    public float f2572d = 0.0f;

    /* renamed from: e */
    public float f2573e = 1.0f;

    /* renamed from: f */
    public float f2574f = Float.MAX_VALUE;

    /* renamed from: g */
    public float f2575g = 1.0f;

    /* renamed from: h */
    public float f2576h = Float.MAX_VALUE;

    /* renamed from: i */
    public float f2577i = 1.0f;

    /* renamed from: j */
    public float f2578j = 1.0f;

    /* renamed from: k */
    public float f2579k = 0.0f;

    /* renamed from: l */
    public float f2580l = 0.0f;

    /* renamed from: m */
    public float f2581m = 0.0f;

    /* renamed from: n */
    public float f2582n = 0.0f;

    /* renamed from: o */
    public Matrix f2583o = new Matrix();

    /* renamed from: p */
    public final float[] f2584p = new float[9];

    /* renamed from: A */
    public boolean mo17604A(float f) {
        return this.f2570b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    /* renamed from: B */
    public boolean mo17605B(float f) {
        return this.f2570b.top <= f;
    }

    /* renamed from: C */
    public boolean mo17606C(float f) {
        return mo17648z(f) && mo17604A(f);
    }

    /* renamed from: D */
    public boolean mo17607D(float f) {
        return mo17605B(f) && mo17647y(f);
    }

    /* renamed from: E */
    public void mo17608E(Matrix matrix, RectF rectF) {
        float f;
        matrix.getValues(this.f2584p);
        float[] fArr = this.f2584p;
        float f2 = fArr[2];
        float f3 = fArr[0];
        float f4 = fArr[5];
        float f5 = fArr[4];
        this.f2577i = Math.min(Math.max(this.f2575g, f3), this.f2576h);
        this.f2578j = Math.min(Math.max(this.f2573e, f5), this.f2574f);
        float f6 = 0.0f;
        if (rectF != null) {
            f6 = rectF.width();
            f = rectF.height();
        } else {
            f = 0.0f;
        }
        this.f2579k = Math.min(Math.max(f2, ((-f6) * (this.f2577i - 1.0f)) - this.f2581m), this.f2581m);
        float max = Math.max(Math.min(f4, (f * (this.f2578j - 1.0f)) + this.f2582n), -this.f2582n);
        this.f2580l = max;
        float[] fArr2 = this.f2584p;
        fArr2[2] = this.f2579k;
        fArr2[0] = this.f2577i;
        fArr2[5] = max;
        fArr2[4] = this.f2578j;
        matrix.setValues(fArr2);
    }

    /* renamed from: F */
    public float mo17609F() {
        return this.f2572d - this.f2570b.bottom;
    }

    /* renamed from: G */
    public float mo17610G() {
        return this.f2570b.left;
    }

    /* renamed from: H */
    public float mo17611H() {
        return this.f2571c - this.f2570b.right;
    }

    /* renamed from: I */
    public float mo17612I() {
        return this.f2570b.top;
    }

    /* renamed from: J */
    public Matrix mo17613J(Matrix matrix, View view, boolean z) {
        this.f2569a.set(matrix);
        mo17608E(this.f2569a, this.f2570b);
        if (z) {
            view.invalidate();
        }
        matrix.set(this.f2569a);
        return matrix;
    }

    /* renamed from: K */
    public void mo17614K(float f, float f2, float f3, float f4) {
        this.f2570b.set(f, f2, this.f2571c - f3, this.f2572d - f4);
    }

    /* renamed from: L */
    public void mo17615L(float f, float f2) {
        float G = mo17610G();
        float I = mo17612I();
        float H = mo17611H();
        float F = mo17609F();
        this.f2572d = f2;
        this.f2571c = f;
        mo17614K(G, I, H, F);
    }

    /* renamed from: M */
    public void mo17616M(float f) {
        this.f2581m = C2347i.m3958e(f);
    }

    /* renamed from: N */
    public void mo17617N(float f) {
        this.f2582n = C2347i.m3958e(f);
    }

    /* renamed from: O */
    public void mo17618O(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.f2576h = f;
        mo17608E(this.f2569a, this.f2570b);
    }

    /* renamed from: P */
    public void mo17619P(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.f2574f = f;
        mo17608E(this.f2569a, this.f2570b);
    }

    /* renamed from: Q */
    public void mo17620Q(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.f2575g = f;
        mo17608E(this.f2569a, this.f2570b);
    }

    /* renamed from: R */
    public void mo17621R(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.f2573e = f;
        mo17608E(this.f2569a, this.f2570b);
    }

    /* renamed from: S */
    public void mo17622S(float f, float f2, float f3, float f4, Matrix matrix) {
        matrix.reset();
        matrix.set(this.f2569a);
        matrix.postScale(f, f2, f3, f4);
    }

    /* renamed from: a */
    public boolean mo17623a() {
        return this.f2577i < this.f2576h;
    }

    /* renamed from: b */
    public boolean mo17624b() {
        return this.f2578j < this.f2574f;
    }

    /* renamed from: c */
    public boolean mo17625c() {
        return this.f2577i > this.f2575g;
    }

    /* renamed from: d */
    public boolean mo17626d() {
        return this.f2578j > this.f2573e;
    }

    /* renamed from: e */
    public void mo17627e(float[] fArr, View view) {
        Matrix matrix = this.f2583o;
        matrix.reset();
        matrix.set(this.f2569a);
        matrix.postTranslate(-(fArr[0] - mo17610G()), -(fArr[1] - mo17612I()));
        mo17613J(matrix, view, true);
    }

    /* renamed from: f */
    public float mo17628f() {
        return this.f2570b.bottom;
    }

    /* renamed from: g */
    public float mo17629g() {
        return this.f2570b.height();
    }

    /* renamed from: h */
    public float mo17630h() {
        return this.f2570b.left;
    }

    /* renamed from: i */
    public float mo17631i() {
        return this.f2570b.right;
    }

    /* renamed from: j */
    public float mo17632j() {
        return this.f2570b.top;
    }

    /* renamed from: k */
    public float mo17633k() {
        return this.f2570b.width();
    }

    /* renamed from: l */
    public float mo17634l() {
        return this.f2572d;
    }

    /* renamed from: m */
    public float mo17635m() {
        return this.f2571c;
    }

    /* renamed from: n */
    public C2342e mo17636n() {
        return C2342e.m3925c(this.f2570b.centerX(), this.f2570b.centerY());
    }

    /* renamed from: o */
    public RectF mo17637o() {
        return this.f2570b;
    }

    /* renamed from: p */
    public Matrix mo17638p() {
        return this.f2569a;
    }

    /* renamed from: q */
    public float mo17639q() {
        return this.f2577i;
    }

    /* renamed from: r */
    public float mo17640r() {
        return this.f2578j;
    }

    /* renamed from: s */
    public float mo17641s() {
        return Math.min(this.f2570b.width(), this.f2570b.height());
    }

    /* renamed from: t */
    public boolean mo17642t() {
        return this.f2581m <= 0.0f && this.f2582n <= 0.0f;
    }

    /* renamed from: u */
    public boolean mo17643u() {
        return mo17644v() && mo17645w();
    }

    /* renamed from: v */
    public boolean mo17644v() {
        float f = this.f2577i;
        float f2 = this.f2575g;
        return f <= f2 && f2 <= 1.0f;
    }

    /* renamed from: w */
    public boolean mo17645w() {
        float f = this.f2578j;
        float f2 = this.f2573e;
        return f <= f2 && f2 <= 1.0f;
    }

    /* renamed from: x */
    public boolean mo17646x(float f, float f2) {
        return mo17606C(f) && mo17607D(f2);
    }

    /* renamed from: y */
    public boolean mo17647y(float f) {
        return this.f2570b.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    /* renamed from: z */
    public boolean mo17648z(float f) {
        return this.f2570b.left <= f + 1.0f;
    }
}
