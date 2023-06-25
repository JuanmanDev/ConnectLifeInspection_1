package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p187b.C2252b;
import p040c.p175p.p184b.p185a.p189d.C2259a;
import p040c.p175p.p184b.p185a.p190e.C2273d;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p191f.C2283j;
import p040c.p175p.p184b.p185a.p192g.p193a.C2284a;
import p040c.p175p.p184b.p185a.p192g.p194b.C2292a;
import p040c.p175p.p184b.p185a.p196i.C2309a;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.b */
/* compiled from: BarChartRenderer */
public class C2311b extends C2312c {

    /* renamed from: g */
    public C2284a f2425g;

    /* renamed from: h */
    public RectF f2426h = new RectF();

    /* renamed from: i */
    public C2252b[] f2427i;

    /* renamed from: j */
    public Paint f2428j;

    /* renamed from: k */
    public Paint f2429k;

    /* renamed from: l */
    public RectF f2430l = new RectF();

    public C2311b(C2284a aVar, C2250a aVar2, C2348j jVar) {
        super(aVar2, jVar);
        this.f2425g = aVar;
        Paint paint = new Paint(1);
        this.f2452d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2452d.setColor(Color.rgb(0, 0, 0));
        this.f2452d.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.f2428j = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.f2429k = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: b */
    public void mo17495b(Canvas canvas) {
        C2259a barData = this.f2425g.getBarData();
        for (int i = 0; i < barData.mo17278e(); i++) {
            C2292a aVar = (C2292a) barData.mo17277d(i);
            if (aVar.isVisible()) {
                mo17500j(canvas, aVar, i);
            }
        }
    }

    /* renamed from: c */
    public void mo17496c(Canvas canvas) {
    }

    /* renamed from: d */
    public void mo17497d(Canvas canvas, C2277d[] dVarArr) {
        float f;
        float f2;
        float f3;
        float f4;
        C2259a barData = this.f2425g.getBarData();
        for (C2277d dVar : dVarArr) {
            C2292a aVar = (C2292a) barData.mo17277d(dVar.mo17329d());
            if (aVar != null && aVar.mo17390L0()) {
                BarEntry barEntry = (BarEntry) aVar.mo17410t(dVar.mo17333h(), dVar.mo17335j());
                if (mo17504h(barEntry, aVar)) {
                    C2345g a = this.f2425g.mo17347a(aVar.mo17384F0());
                    this.f2452d.setColor(aVar.mo17366D0());
                    this.f2452d.setAlpha(aVar.mo17363r0());
                    if (!(dVar.mo17332g() >= 0 && barEntry.mo23869k())) {
                        f4 = barEntry.mo17271c();
                        f3 = 0.0f;
                    } else if (this.f2425g.mo17345d()) {
                        f4 = barEntry.mo23866h();
                        f3 = -barEntry.mo23865g();
                    } else {
                        C2283j jVar = barEntry.mo23867i()[dVar.mo17332g()];
                        f2 = jVar.f2396a;
                        f = jVar.f2397b;
                        mo17502l(barEntry.mo23876f(), f2, f, barData.mo17268r() / 2.0f, a);
                        mo17503m(dVar, this.f2426h);
                        canvas.drawRect(this.f2426h, this.f2452d);
                    }
                    f = f3;
                    f2 = f4;
                    mo17502l(barEntry.mo23876f(), f2, f, barData.mo17268r() / 2.0f, a);
                    mo17503m(dVar, this.f2426h);
                    canvas.drawRect(this.f2426h, this.f2452d);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo17498e(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        List list;
        boolean z2;
        C2342e eVar;
        int i;
        float f3;
        boolean z3;
        C2345g gVar;
        float[] fArr;
        float f4;
        int i2;
        int i3;
        BarEntry barEntry;
        float[] fArr2;
        float f5;
        float f6;
        float f7;
        BarEntry barEntry2;
        List list2;
        int i4;
        C2273d dVar;
        C2342e eVar2;
        float f8;
        BarEntry barEntry3;
        if (mo17514g(this.f2425g)) {
            List f9 = this.f2425g.getBarData().mo17279f();
            float e = C2347i.m3958e(4.5f);
            boolean c = this.f2425g.mo17344c();
            int i5 = 0;
            while (i5 < this.f2425g.getBarData().mo17278e()) {
                C2292a aVar = (C2292a) f9.get(i5);
                if (!mo17505i(aVar)) {
                    list = f9;
                    f2 = f;
                    z2 = z;
                } else {
                    mo17513a(aVar);
                    boolean e2 = this.f2425g.mo17348e(aVar.mo17384F0());
                    float a = (float) C2347i.m3954a(this.f2453e, "8");
                    float f10 = z ? -f : a + f;
                    float f11 = z ? a + f : -f;
                    if (e2) {
                        f10 = (-f10) - a;
                        f11 = (-f11) - a;
                    }
                    float f12 = f10;
                    float f13 = f11;
                    C2252b bVar = this.f2427i[i5];
                    float b = this.f2450b.mo17225b();
                    C2273d K = aVar.mo17389K();
                    C2342e d = C2342e.m3926d(aVar.mo17386I0());
                    d.f2538c = C2347i.m3958e(d.f2538c);
                    d.f2539d = C2347i.m3958e(d.f2539d);
                    if (!aVar.mo17365z0()) {
                        int i6 = 0;
                        while (((float) i6) < ((float) bVar.f2310b.length) * this.f2450b.mo17224a()) {
                            float[] fArr3 = bVar.f2310b;
                            float f14 = (fArr3[i6] + fArr3[i6 + 2]) / 2.0f;
                            if (!this.f2503a.mo17604A(f14)) {
                                break;
                            }
                            int i7 = i6 + 1;
                            if (!this.f2503a.mo17607D(bVar.f2310b[i7]) || !this.f2503a.mo17648z(f14)) {
                                i4 = i6;
                                dVar = K;
                                list2 = f9;
                                eVar2 = d;
                            } else {
                                int i8 = i6 / 4;
                                BarEntry barEntry4 = (BarEntry) aVar.mo17392O(i8);
                                float c2 = barEntry4.mo17271c();
                                if (aVar.mo17381A0()) {
                                    String b2 = K.mo17307b(barEntry4);
                                    int i9 = (c2 > 0.0f ? 1 : (c2 == 0.0f ? 0 : -1));
                                    float[] fArr4 = bVar.f2310b;
                                    barEntry3 = barEntry4;
                                    f8 = f14;
                                    String str = b2;
                                    i4 = i6;
                                    list2 = f9;
                                    eVar2 = d;
                                    float f15 = i9 >= 0 ? fArr4[i7] + f12 : fArr4[i6 + 3] + f13;
                                    dVar = K;
                                    mo17501k(canvas, str, f8, f15, aVar.mo17400g0(i8));
                                } else {
                                    barEntry3 = barEntry4;
                                    f8 = f14;
                                    i4 = i6;
                                    dVar = K;
                                    list2 = f9;
                                    eVar2 = d;
                                }
                                if (barEntry3.mo17270b() != null && aVar.mo17411w()) {
                                    Drawable b3 = barEntry3.mo17270b();
                                    C2347i.m3959f(canvas, b3, (int) (f8 + eVar2.f2538c), (int) ((c2 >= 0.0f ? bVar.f2310b[i7] + f12 : bVar.f2310b[i4 + 3] + f13) + eVar2.f2539d), b3.getIntrinsicWidth(), b3.getIntrinsicHeight());
                                }
                            }
                            i6 = i4 + 4;
                            d = eVar2;
                            K = dVar;
                            f9 = list2;
                        }
                        list = f9;
                        eVar = d;
                    } else {
                        C2273d dVar2 = K;
                        list = f9;
                        eVar = d;
                        C2345g a2 = this.f2425g.mo17347a(aVar.mo17384F0());
                        int i10 = 0;
                        int i11 = 0;
                        while (((float) i10) < ((float) aVar.mo17385H0()) * this.f2450b.mo17224a()) {
                            BarEntry barEntry5 = (BarEntry) aVar.mo17392O(i10);
                            float[] j = barEntry5.mo23868j();
                            float[] fArr5 = bVar.f2310b;
                            float f16 = (fArr5[i11] + fArr5[i11 + 2]) / 2.0f;
                            int g0 = aVar.mo17400g0(i10);
                            if (j != null) {
                                BarEntry barEntry6 = barEntry5;
                                i = i10;
                                f3 = f;
                                z3 = z;
                                fArr = j;
                                gVar = a2;
                                float f17 = f16;
                                int length = fArr.length * 2;
                                float[] fArr6 = new float[length];
                                float f18 = -barEntry6.mo23865g();
                                float f19 = 0.0f;
                                int i12 = 0;
                                int i13 = 0;
                                while (i12 < length) {
                                    float f20 = fArr[i13];
                                    int i14 = (f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1));
                                    if (i14 == 0 && (f19 == 0.0f || f18 == 0.0f)) {
                                        float f21 = f18;
                                        f18 = f20;
                                        f6 = f21;
                                    } else if (i14 >= 0) {
                                        f19 += f20;
                                        f6 = f18;
                                        f18 = f19;
                                    } else {
                                        f6 = f18 - f20;
                                    }
                                    fArr6[i12 + 1] = f18 * b;
                                    i12 += 2;
                                    i13++;
                                    f18 = f6;
                                }
                                gVar.mo17598k(fArr6);
                                int i15 = 0;
                                while (i15 < length) {
                                    float f22 = fArr[i15 / 2];
                                    float f23 = fArr6[i15 + 1] + (((f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1)) == 0 && (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1)) == 0 && (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1)) > 0) || (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1)) < 0 ? f13 : f12);
                                    int i16 = i15;
                                    if (!this.f2503a.mo17604A(f17)) {
                                        break;
                                    }
                                    if (!this.f2503a.mo17607D(f23) || !this.f2503a.mo17648z(f17)) {
                                        i2 = length;
                                        f4 = f17;
                                        i3 = i16;
                                        barEntry = barEntry6;
                                        fArr2 = fArr6;
                                    } else {
                                        if (aVar.mo17381A0()) {
                                            BarEntry barEntry7 = barEntry6;
                                            f5 = f23;
                                            i3 = i16;
                                            barEntry = barEntry7;
                                            fArr2 = fArr6;
                                            i2 = length;
                                            f4 = f17;
                                            mo17501k(canvas, dVar2.mo17308c(f22, barEntry7), f17, f5, g0);
                                        } else {
                                            f5 = f23;
                                            i2 = length;
                                            f4 = f17;
                                            i3 = i16;
                                            barEntry = barEntry6;
                                            fArr2 = fArr6;
                                        }
                                        if (barEntry.mo17270b() != null && aVar.mo17411w()) {
                                            Drawable b4 = barEntry.mo17270b();
                                            C2347i.m3959f(canvas, b4, (int) (f4 + eVar.f2538c), (int) (f5 + eVar.f2539d), b4.getIntrinsicWidth(), b4.getIntrinsicHeight());
                                        }
                                    }
                                    i15 = i3 + 2;
                                    fArr6 = fArr2;
                                    barEntry6 = barEntry;
                                    length = i2;
                                    f17 = f4;
                                }
                            } else if (!this.f2503a.mo17604A(f16)) {
                                break;
                            } else {
                                float[] fArr7 = j;
                                int i17 = i11 + 1;
                                if (!this.f2503a.mo17607D(bVar.f2310b[i17]) || !this.f2503a.mo17648z(f16)) {
                                    a2 = a2;
                                    z = z;
                                    f = f;
                                    i10 = i10;
                                } else {
                                    if (aVar.mo17381A0()) {
                                        f7 = f16;
                                        f3 = f;
                                        fArr = fArr7;
                                        barEntry2 = barEntry5;
                                        i = i10;
                                        z3 = z;
                                        gVar = a2;
                                        mo17501k(canvas, dVar2.mo17307b(barEntry5), f7, bVar.f2310b[i17] + (barEntry5.mo17271c() >= 0.0f ? f12 : f13), g0);
                                    } else {
                                        f7 = f16;
                                        i = i10;
                                        f3 = f;
                                        z3 = z;
                                        fArr = fArr7;
                                        barEntry2 = barEntry5;
                                        gVar = a2;
                                    }
                                    if (barEntry2.mo17270b() != null && aVar.mo17411w()) {
                                        Drawable b5 = barEntry2.mo17270b();
                                        C2347i.m3959f(canvas, b5, (int) (eVar.f2538c + f7), (int) (bVar.f2310b[i17] + (barEntry2.mo17271c() >= 0.0f ? f12 : f13) + eVar.f2539d), b5.getIntrinsicWidth(), b5.getIntrinsicHeight());
                                    }
                                }
                            }
                            if (fArr == null) {
                                i11 += 4;
                            } else {
                                i11 += fArr.length * 4;
                            }
                            i10 = i + 1;
                            a2 = gVar;
                            z = z3;
                            f = f3;
                        }
                    }
                    f2 = f;
                    z2 = z;
                    C2342e.m3927e(eVar);
                }
                i5++;
                c = z2;
                f9 = list;
                e = f2;
            }
        }
    }

    /* renamed from: f */
    public void mo17499f() {
        C2259a barData = this.f2425g.getBarData();
        this.f2427i = new C2252b[barData.mo17278e()];
        for (int i = 0; i < this.f2427i.length; i++) {
            C2292a aVar = (C2292a) barData.mo17277d(i);
            this.f2427i[i] = new C2252b(aVar.mo17385H0() * 4 * (aVar.mo17365z0() ? aVar.mo17361m0() : 1), barData.mo17278e(), aVar.mo17365z0());
        }
    }

    /* renamed from: j */
    public void mo17500j(Canvas canvas, C2292a aVar, int i) {
        C2292a aVar2 = aVar;
        int i2 = i;
        C2345g a = this.f2425g.mo17347a(aVar.mo17384F0());
        this.f2429k.setColor(aVar.mo17362r());
        this.f2429k.setStrokeWidth(C2347i.m3958e(aVar.mo17364z()));
        int i3 = 0;
        boolean z = true;
        boolean z2 = aVar.mo17364z() > 0.0f;
        float a2 = this.f2450b.mo17224a();
        float b = this.f2450b.mo17225b();
        if (this.f2425g.mo17343b()) {
            this.f2428j.setColor(aVar.mo17360b0());
            float r = this.f2425g.getBarData().mo17268r() / 2.0f;
            int min = Math.min((int) Math.ceil((double) (((float) aVar.mo17385H0()) * a2)), aVar.mo17385H0());
            for (int i4 = 0; i4 < min; i4++) {
                float f = ((BarEntry) aVar2.mo17392O(i4)).mo23876f();
                RectF rectF = this.f2430l;
                rectF.left = f - r;
                rectF.right = f + r;
                a.mo17603p(rectF);
                if (!this.f2503a.mo17648z(this.f2430l.right)) {
                    Canvas canvas2 = canvas;
                } else if (!this.f2503a.mo17604A(this.f2430l.left)) {
                    break;
                } else {
                    this.f2430l.top = this.f2503a.mo17632j();
                    this.f2430l.bottom = this.f2503a.mo17628f();
                    canvas.drawRect(this.f2430l, this.f2428j);
                }
            }
        }
        Canvas canvas3 = canvas;
        C2252b bVar = this.f2427i[i2];
        bVar.mo17227b(a2, b);
        bVar.mo17232g(i2);
        bVar.mo17233h(this.f2425g.mo17348e(aVar.mo17384F0()));
        bVar.mo17231f(this.f2425g.getBarData().mo17268r());
        bVar.mo17230e(aVar2);
        a.mo17598k(bVar.f2310b);
        if (aVar.mo17403l0().size() != 1) {
            z = false;
        }
        if (z) {
            this.f2451c.setColor(aVar.mo17388J0());
        }
        while (i3 < bVar.mo17228c()) {
            int i5 = i3 + 2;
            if (this.f2503a.mo17648z(bVar.f2310b[i5])) {
                if (this.f2503a.mo17604A(bVar.f2310b[i3])) {
                    if (!z) {
                        this.f2451c.setColor(aVar2.mo17395U(i3 / 4));
                    }
                    if (aVar.mo17383F() != null) {
                        C2309a F = aVar.mo17383F();
                        Paint paint = this.f2451c;
                        float[] fArr = bVar.f2310b;
                        paint.setShader(new LinearGradient(fArr[i3], fArr[i3 + 3], fArr[i3], fArr[i3 + 1], F.mo17491b(), F.mo17490a(), Shader.TileMode.MIRROR));
                    }
                    if (aVar.mo17409s0() != null) {
                        Paint paint2 = this.f2451c;
                        float[] fArr2 = bVar.f2310b;
                        float f2 = fArr2[i3];
                        float f3 = fArr2[i3 + 3];
                        float f4 = fArr2[i3];
                        float f5 = fArr2[i3 + 1];
                        int i6 = i3 / 4;
                        paint2.setShader(new LinearGradient(f2, f3, f4, f5, aVar2.mo17393O0(i6).mo17491b(), aVar2.mo17393O0(i6).mo17490a(), Shader.TileMode.MIRROR));
                    }
                    float[] fArr3 = bVar.f2310b;
                    int i7 = i3 + 1;
                    int i8 = i3 + 3;
                    canvas.drawRect(fArr3[i3], fArr3[i7], fArr3[i5], fArr3[i8], this.f2451c);
                    if (z2) {
                        float[] fArr4 = bVar.f2310b;
                        canvas.drawRect(fArr4[i3], fArr4[i7], fArr4[i5], fArr4[i8], this.f2429k);
                    }
                } else {
                    return;
                }
            }
            i3 += 4;
            Canvas canvas4 = canvas;
        }
    }

    /* renamed from: k */
    public void mo17501k(Canvas canvas, String str, float f, float f2, int i) {
        this.f2453e.setColor(i);
        canvas.drawText(str, f, f2, this.f2453e);
    }

    /* renamed from: l */
    public void mo17502l(float f, float f2, float f3, float f4, C2345g gVar) {
        this.f2426h.set(f - f4, f2, f + f4, f3);
        gVar.mo17601n(this.f2426h, this.f2450b.mo17225b());
    }

    /* renamed from: m */
    public void mo17503m(C2277d dVar, RectF rectF) {
        dVar.mo17338m(rectF.centerX(), rectF.top);
    }
}
