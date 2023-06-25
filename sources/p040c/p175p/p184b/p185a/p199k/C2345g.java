package p040c.p175p.p184b.p185a.p199k;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import p040c.p175p.p184b.p185a.p192g.p194b.C2294c;
import p040c.p175p.p184b.p185a.p192g.p194b.C2295d;
import p040c.p175p.p184b.p185a.p192g.p194b.C2297f;
import p040c.p175p.p184b.p185a.p192g.p194b.C2302k;

/* renamed from: c.p.b.a.k.g */
/* compiled from: Transformer */
public class C2345g {

    /* renamed from: a */
    public Matrix f2549a = new Matrix();

    /* renamed from: b */
    public Matrix f2550b = new Matrix();

    /* renamed from: c */
    public C2348j f2551c;

    /* renamed from: d */
    public float[] f2552d = new float[1];

    /* renamed from: e */
    public float[] f2553e = new float[1];

    /* renamed from: f */
    public float[] f2554f = new float[1];

    /* renamed from: g */
    public float[] f2555g = new float[1];

    /* renamed from: h */
    public Matrix f2556h = new Matrix();

    /* renamed from: i */
    public float[] f2557i = new float[2];

    /* renamed from: j */
    public Matrix f2558j = new Matrix();

    public C2345g(C2348j jVar) {
        new Matrix();
        this.f2551c = jVar;
    }

    /* renamed from: a */
    public float[] mo17588a(C2294c cVar, float f, int i, int i2) {
        int i3 = ((i2 - i) + 1) * 2;
        if (this.f2553e.length != i3) {
            this.f2553e = new float[i3];
        }
        float[] fArr = this.f2553e;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            Entry O = cVar.mo17392O((i4 / 2) + i);
            if (O != null) {
                fArr[i4] = O.mo23876f();
                fArr[i4 + 1] = O.mo17271c() * f;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        mo17593f().mapPoints(fArr);
        return fArr;
    }

    /* renamed from: b */
    public float[] mo17589b(C2295d dVar, float f, float f2, int i, int i2) {
        int i3 = ((int) ((((float) (i2 - i)) * f) + 1.0f)) * 2;
        if (this.f2555g.length != i3) {
            this.f2555g = new float[i3];
        }
        float[] fArr = this.f2555g;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            CandleEntry candleEntry = (CandleEntry) dVar.mo17392O((i4 / 2) + i);
            if (candleEntry != null) {
                fArr[i4] = candleEntry.mo23876f();
                fArr[i4 + 1] = candleEntry.mo23872h() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        mo17593f().mapPoints(fArr);
        return fArr;
    }

    /* renamed from: c */
    public float[] mo17590c(C2297f fVar, float f, float f2, int i, int i2) {
        int i3 = (((int) (((float) (i2 - i)) * f)) + 1) * 2;
        if (this.f2554f.length != i3) {
            this.f2554f = new float[i3];
        }
        float[] fArr = this.f2554f;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            Entry O = fVar.mo17392O((i4 / 2) + i);
            if (O != null) {
                fArr[i4] = O.mo23876f();
                fArr[i4 + 1] = O.mo17271c() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        mo17593f().mapPoints(fArr);
        return fArr;
    }

    /* renamed from: d */
    public float[] mo17591d(C2302k kVar, float f, float f2, int i, int i2) {
        int i3 = ((int) ((((float) (i2 - i)) * f) + 1.0f)) * 2;
        if (this.f2552d.length != i3) {
            this.f2552d = new float[i3];
        }
        float[] fArr = this.f2552d;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            Entry O = kVar.mo17392O((i4 / 2) + i);
            if (O != null) {
                fArr[i4] = O.mo23876f();
                fArr[i4 + 1] = O.mo17271c() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        mo17593f().mapPoints(fArr);
        return fArr;
    }

    /* renamed from: e */
    public C2341d mo17592e(float f, float f2) {
        float[] fArr = this.f2557i;
        fArr[0] = f;
        fArr[1] = f2;
        mo17598k(fArr);
        float[] fArr2 = this.f2557i;
        return C2341d.m3921b((double) fArr2[0], (double) fArr2[1]);
    }

    /* renamed from: f */
    public Matrix mo17593f() {
        this.f2558j.set(this.f2549a);
        this.f2558j.postConcat(this.f2551c.f2569a);
        this.f2558j.postConcat(this.f2550b);
        return this.f2558j;
    }

    /* renamed from: g */
    public C2341d mo17594g(float f, float f2) {
        C2341d b = C2341d.m3921b(0.0d, 0.0d);
        mo17595h(f, f2, b);
        return b;
    }

    /* renamed from: h */
    public void mo17595h(float f, float f2, C2341d dVar) {
        float[] fArr = this.f2557i;
        fArr[0] = f;
        fArr[1] = f2;
        mo17597j(fArr);
        float[] fArr2 = this.f2557i;
        dVar.f2535c = (double) fArr2[0];
        dVar.f2536d = (double) fArr2[1];
    }

    /* renamed from: i */
    public void mo17596i(Path path) {
        path.transform(this.f2549a);
        path.transform(this.f2551c.mo17638p());
        path.transform(this.f2550b);
    }

    /* renamed from: j */
    public void mo17597j(float[] fArr) {
        Matrix matrix = this.f2556h;
        matrix.reset();
        this.f2550b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f2551c.mo17638p().invert(matrix);
        matrix.mapPoints(fArr);
        this.f2549a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    /* renamed from: k */
    public void mo17598k(float[] fArr) {
        this.f2549a.mapPoints(fArr);
        this.f2551c.mo17638p().mapPoints(fArr);
        this.f2550b.mapPoints(fArr);
    }

    /* renamed from: l */
    public void mo17599l(boolean z) {
        this.f2550b.reset();
        if (!z) {
            this.f2550b.postTranslate(this.f2551c.mo17610G(), this.f2551c.mo17634l() - this.f2551c.mo17609F());
            return;
        }
        this.f2550b.setTranslate(this.f2551c.mo17610G(), -this.f2551c.mo17612I());
        this.f2550b.postScale(1.0f, -1.0f);
    }

    /* renamed from: m */
    public void mo17600m(float f, float f2, float f3, float f4) {
        float k = this.f2551c.mo17633k() / f2;
        float g = this.f2551c.mo17629g() / f3;
        if (Float.isInfinite(k)) {
            k = 0.0f;
        }
        if (Float.isInfinite(g)) {
            g = 0.0f;
        }
        this.f2549a.reset();
        this.f2549a.postTranslate(-f, -f4);
        this.f2549a.postScale(k, -g);
    }

    /* renamed from: n */
    public void mo17601n(RectF rectF, float f) {
        rectF.top *= f;
        rectF.bottom *= f;
        this.f2549a.mapRect(rectF);
        this.f2551c.mo17638p().mapRect(rectF);
        this.f2550b.mapRect(rectF);
    }

    /* renamed from: o */
    public void mo17602o(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.f2549a.mapRect(rectF);
        this.f2551c.mo17638p().mapRect(rectF);
        this.f2550b.mapRect(rectF);
    }

    /* renamed from: p */
    public void mo17603p(RectF rectF) {
        this.f2549a.mapRect(rectF);
        this.f2551c.mo17638p().mapRect(rectF);
        this.f2550b.mapRect(rectF);
    }
}
