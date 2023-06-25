package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.CandleEntry;
import java.util.List;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p189d.C2263e;
import p040c.p175p.p184b.p185a.p190e.C2273d;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2287d;
import p040c.p175p.p184b.p185a.p192g.p194b.C2295d;
import p040c.p175p.p184b.p185a.p197j.C2312c;
import p040c.p175p.p184b.p185a.p199k.C2341d;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.e */
/* compiled from: CandleStickChartRenderer */
public class C2315e extends C2326l {

    /* renamed from: h */
    public C2287d f2440h;

    /* renamed from: i */
    public float[] f2441i = new float[8];

    /* renamed from: j */
    public float[] f2442j = new float[4];

    /* renamed from: k */
    public float[] f2443k = new float[4];

    /* renamed from: l */
    public float[] f2444l = new float[4];

    /* renamed from: m */
    public float[] f2445m = new float[4];

    public C2315e(C2287d dVar, C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
        this.f2440h = dVar;
    }

    /* renamed from: b */
    public void mo17495b(Canvas canvas) {
        for (C2295d dVar : this.f2440h.getCandleData().mo17279f()) {
            if (dVar.isVisible()) {
                mo17510k(canvas, dVar);
            }
        }
    }

    /* renamed from: c */
    public void mo17496c(Canvas canvas) {
    }

    /* renamed from: d */
    public void mo17497d(Canvas canvas, C2277d[] dVarArr) {
        C2263e candleData = this.f2440h.getCandleData();
        for (C2277d dVar : dVarArr) {
            C2295d dVar2 = (C2295d) candleData.mo17277d(dVar.mo17329d());
            if (dVar2 != null && dVar2.mo17390L0()) {
                CandleEntry candleEntry = (CandleEntry) dVar2.mo17410t(dVar.mo17333h(), dVar.mo17335j());
                if (mo17504h(candleEntry, dVar2)) {
                    C2341d e = this.f2440h.mo17347a(dVar2.mo17384F0()).mo17592e(candleEntry.mo23876f(), ((candleEntry.mo23873i() * this.f2450b.mo17225b()) + (candleEntry.mo23872h() * this.f2450b.mo17225b())) / 2.0f);
                    dVar.mo17338m((float) e.f2535c, (float) e.f2536d);
                    mo17536j(canvas, (float) e.f2535c, (float) e.f2536d, dVar2);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo17498e(Canvas canvas) {
        C2295d dVar;
        float f;
        CandleEntry candleEntry;
        if (mo17514g(this.f2440h)) {
            List f2 = this.f2440h.getCandleData().mo17279f();
            for (int i = 0; i < f2.size(); i++) {
                C2295d dVar2 = (C2295d) f2.get(i);
                if (mo17505i(dVar2) && dVar2.mo17385H0() >= 1) {
                    mo17513a(dVar2);
                    C2345g a = this.f2440h.mo17347a(dVar2.mo17384F0());
                    this.f2431f.mo17506a(this.f2440h, dVar2);
                    float a2 = this.f2450b.mo17224a();
                    float b = this.f2450b.mo17225b();
                    C2312c.C2313a aVar = this.f2431f;
                    float[] b2 = a.mo17589b(dVar2, a2, b, aVar.f2432a, aVar.f2433b);
                    float e = C2347i.m3958e(5.0f);
                    C2273d K = dVar2.mo17389K();
                    C2342e d = C2342e.m3926d(dVar2.mo17386I0());
                    d.f2538c = C2347i.m3958e(d.f2538c);
                    d.f2539d = C2347i.m3958e(d.f2539d);
                    int i2 = 0;
                    while (i2 < b2.length) {
                        float f3 = b2[i2];
                        float f4 = b2[i2 + 1];
                        if (!this.f2503a.mo17604A(f3)) {
                            break;
                        }
                        if (!this.f2503a.mo17648z(f3) || !this.f2503a.mo17607D(f4)) {
                            dVar = dVar2;
                        } else {
                            int i3 = i2 / 2;
                            CandleEntry candleEntry2 = (CandleEntry) dVar2.mo17392O(this.f2431f.f2432a + i3);
                            if (dVar2.mo17381A0()) {
                                candleEntry = candleEntry2;
                                f = f4;
                                dVar = dVar2;
                                mo17511l(canvas, K.mo17310e(candleEntry2), f3, f4 - e, dVar2.mo17400g0(i3));
                            } else {
                                candleEntry = candleEntry2;
                                f = f4;
                                dVar = dVar2;
                            }
                            if (candleEntry.mo17270b() != null && dVar.mo17411w()) {
                                Drawable b3 = candleEntry.mo17270b();
                                C2347i.m3959f(canvas, b3, (int) (f3 + d.f2538c), (int) (f + d.f2539d), b3.getIntrinsicWidth(), b3.getIntrinsicHeight());
                            }
                        }
                        i2 += 2;
                        dVar2 = dVar;
                    }
                    C2342e.m3927e(d);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo17499f() {
    }

    /* renamed from: k */
    public void mo17510k(Canvas canvas, C2295d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C2295d dVar2 = dVar;
        C2345g a = this.f2440h.mo17347a(dVar.mo17384F0());
        float b = this.f2450b.mo17225b();
        float M = dVar.mo17373M();
        boolean G0 = dVar.mo17371G0();
        this.f2431f.mo17506a(this.f2440h, dVar2);
        this.f2451c.setStrokeWidth(dVar.mo17378n());
        int i6 = this.f2431f.f2432a;
        while (true) {
            C2312c.C2313a aVar = this.f2431f;
            if (i6 <= aVar.f2434c + aVar.f2432a) {
                CandleEntry candleEntry = (CandleEntry) dVar2.mo17392O(i6);
                if (candleEntry == null) {
                    Canvas canvas2 = canvas;
                } else {
                    float f = candleEntry.mo23876f();
                    float j = candleEntry.mo23874j();
                    float g = candleEntry.mo23871g();
                    float h = candleEntry.mo23872h();
                    float i7 = candleEntry.mo23873i();
                    if (G0) {
                        float[] fArr = this.f2441i;
                        fArr[0] = f;
                        fArr[2] = f;
                        fArr[4] = f;
                        fArr[6] = f;
                        int i8 = (j > g ? 1 : (j == g ? 0 : -1));
                        if (i8 > 0) {
                            fArr[1] = h * b;
                            fArr[3] = j * b;
                            fArr[5] = i7 * b;
                            fArr[7] = g * b;
                        } else if (j < g) {
                            fArr[1] = h * b;
                            fArr[3] = g * b;
                            fArr[5] = i7 * b;
                            fArr[7] = j * b;
                        } else {
                            fArr[1] = h * b;
                            fArr[3] = j * b;
                            fArr[5] = i7 * b;
                            fArr[7] = fArr[3];
                        }
                        a.mo17598k(this.f2441i);
                        if (!dVar.mo17377j0()) {
                            Paint paint = this.f2451c;
                            if (dVar.mo17379v0() == 1122867) {
                                i2 = dVar2.mo17395U(i6);
                            } else {
                                i2 = dVar.mo17379v0();
                            }
                            paint.setColor(i2);
                        } else if (i8 > 0) {
                            Paint paint2 = this.f2451c;
                            if (dVar.mo17374Q0() == 1122867) {
                                i5 = dVar2.mo17395U(i6);
                            } else {
                                i5 = dVar.mo17374Q0();
                            }
                            paint2.setColor(i5);
                        } else if (j < g) {
                            Paint paint3 = this.f2451c;
                            if (dVar.mo17370C0() == 1122867) {
                                i4 = dVar2.mo17395U(i6);
                            } else {
                                i4 = dVar.mo17370C0();
                            }
                            paint3.setColor(i4);
                        } else {
                            Paint paint4 = this.f2451c;
                            if (dVar.mo17376b() == 1122867) {
                                i3 = dVar2.mo17395U(i6);
                            } else {
                                i3 = dVar.mo17376b();
                            }
                            paint4.setColor(i3);
                        }
                        this.f2451c.setStyle(Paint.Style.STROKE);
                        canvas.drawLines(this.f2441i, this.f2451c);
                        float[] fArr2 = this.f2442j;
                        fArr2[0] = (f - 0.5f) + M;
                        fArr2[1] = g * b;
                        fArr2[2] = (f + 0.5f) - M;
                        fArr2[3] = j * b;
                        a.mo17598k(fArr2);
                        if (i8 > 0) {
                            if (dVar.mo17374Q0() == 1122867) {
                                this.f2451c.setColor(dVar2.mo17395U(i6));
                            } else {
                                this.f2451c.setColor(dVar.mo17374Q0());
                            }
                            this.f2451c.setStyle(dVar.mo17372I());
                            float[] fArr3 = this.f2442j;
                            canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.f2451c);
                        } else if (j < g) {
                            if (dVar.mo17370C0() == 1122867) {
                                this.f2451c.setColor(dVar2.mo17395U(i6));
                            } else {
                                this.f2451c.setColor(dVar.mo17370C0());
                            }
                            this.f2451c.setStyle(dVar.mo17375Z());
                            float[] fArr4 = this.f2442j;
                            canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.f2451c);
                        } else {
                            if (dVar.mo17376b() == 1122867) {
                                this.f2451c.setColor(dVar2.mo17395U(i6));
                            } else {
                                this.f2451c.setColor(dVar.mo17376b());
                            }
                            float[] fArr5 = this.f2442j;
                            canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.f2451c);
                        }
                    } else {
                        Canvas canvas3 = canvas;
                        float[] fArr6 = this.f2443k;
                        fArr6[0] = f;
                        fArr6[1] = h * b;
                        fArr6[2] = f;
                        fArr6[3] = i7 * b;
                        float[] fArr7 = this.f2444l;
                        fArr7[0] = (f - 0.5f) + M;
                        float f2 = j * b;
                        fArr7[1] = f2;
                        fArr7[2] = f;
                        fArr7[3] = f2;
                        float[] fArr8 = this.f2445m;
                        fArr8[0] = (0.5f + f) - M;
                        float f3 = g * b;
                        fArr8[1] = f3;
                        fArr8[2] = f;
                        fArr8[3] = f3;
                        a.mo17598k(fArr6);
                        a.mo17598k(this.f2444l);
                        a.mo17598k(this.f2445m);
                        if (j > g) {
                            if (dVar.mo17374Q0() == 1122867) {
                                i = dVar2.mo17395U(i6);
                            } else {
                                i = dVar.mo17374Q0();
                            }
                        } else if (j < g) {
                            if (dVar.mo17370C0() == 1122867) {
                                i = dVar2.mo17395U(i6);
                            } else {
                                i = dVar.mo17370C0();
                            }
                        } else if (dVar.mo17376b() == 1122867) {
                            i = dVar2.mo17395U(i6);
                        } else {
                            i = dVar.mo17376b();
                        }
                        this.f2451c.setColor(i);
                        float[] fArr9 = this.f2443k;
                        Canvas canvas4 = canvas;
                        canvas4.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.f2451c);
                        float[] fArr10 = this.f2444l;
                        canvas4.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.f2451c);
                        float[] fArr11 = this.f2445m;
                        canvas4.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.f2451c);
                    }
                }
                i6++;
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public void mo17511l(Canvas canvas, String str, float f, float f2, int i) {
        this.f2453e.setColor(i);
        canvas.drawText(str, f, f2, this.f2453e);
    }
}
