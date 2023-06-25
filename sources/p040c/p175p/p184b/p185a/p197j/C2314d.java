package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BubbleEntry;
import java.util.List;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p189d.C2262d;
import p040c.p175p.p184b.p185a.p190e.C2273d;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2286c;
import p040c.p175p.p184b.p185a.p192g.p194b.C2294c;
import p040c.p175p.p184b.p185a.p197j.C2312c;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.d */
/* compiled from: BubbleChartRenderer */
public class C2314d extends C2312c {

    /* renamed from: g */
    public C2286c f2436g;

    /* renamed from: h */
    public float[] f2437h = new float[4];

    /* renamed from: i */
    public float[] f2438i = new float[2];

    /* renamed from: j */
    public float[] f2439j = new float[3];

    public C2314d(C2286c cVar, C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
        this.f2436g = cVar;
        this.f2451c.setStyle(Paint.Style.FILL);
        this.f2452d.setStyle(Paint.Style.STROKE);
        this.f2452d.setStrokeWidth(C2347i.m3958e(1.5f));
    }

    /* renamed from: b */
    public void mo17495b(Canvas canvas) {
        for (C2294c cVar : this.f2436g.getBubbleData().mo17279f()) {
            if (cVar.isVisible()) {
                mo17507j(canvas, cVar);
            }
        }
    }

    /* renamed from: c */
    public void mo17496c(Canvas canvas) {
    }

    /* renamed from: d */
    public void mo17497d(Canvas canvas, C2277d[] dVarArr) {
        C2262d bubbleData = this.f2436g.getBubbleData();
        float b = this.f2450b.mo17225b();
        for (C2277d dVar : dVarArr) {
            C2294c cVar = (C2294c) bubbleData.mo17277d(dVar.mo17329d());
            if (cVar != null && cVar.mo17390L0()) {
                BubbleEntry bubbleEntry = (BubbleEntry) cVar.mo17410t(dVar.mo17333h(), dVar.mo17335j());
                if (bubbleEntry.mo17271c() == dVar.mo17335j() && mo17504h(bubbleEntry, cVar)) {
                    C2345g a = this.f2436g.mo17347a(cVar.mo17384F0());
                    float[] fArr = this.f2437h;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    a.mo17598k(fArr);
                    boolean c = cVar.mo17368c();
                    float[] fArr2 = this.f2437h;
                    float min = Math.min(Math.abs(this.f2503a.mo17628f() - this.f2503a.mo17632j()), Math.abs(fArr2[2] - fArr2[0]));
                    this.f2438i[0] = bubbleEntry.mo23876f();
                    this.f2438i[1] = bubbleEntry.mo17271c() * b;
                    a.mo17598k(this.f2438i);
                    float[] fArr3 = this.f2438i;
                    dVar.mo17338m(fArr3[0], fArr3[1]);
                    float l = mo17509l(bubbleEntry.mo23870g(), cVar.mo17367X(), min, c) / 2.0f;
                    if (this.f2503a.mo17605B(this.f2438i[1] + l) && this.f2503a.mo17647y(this.f2438i[1] - l) && this.f2503a.mo17648z(this.f2438i[0] + l)) {
                        if (this.f2503a.mo17604A(this.f2438i[0] - l)) {
                            int U = cVar.mo17395U((int) bubbleEntry.mo23876f());
                            Color.RGBToHSV(Color.red(U), Color.green(U), Color.blue(U), this.f2439j);
                            float[] fArr4 = this.f2439j;
                            fArr4[2] = fArr4[2] * 0.5f;
                            this.f2452d.setColor(Color.HSVToColor(Color.alpha(U), this.f2439j));
                            this.f2452d.setStrokeWidth(cVar.mo17369x0());
                            float[] fArr5 = this.f2438i;
                            canvas.drawCircle(fArr5[0], fArr5[1], l, this.f2452d);
                        } else {
                            return;
                        }
                    }
                }
            }
            Canvas canvas2 = canvas;
        }
    }

    /* renamed from: e */
    public void mo17498e(Canvas canvas) {
        int i;
        float f;
        BubbleEntry bubbleEntry;
        float f2;
        C2262d bubbleData = this.f2436g.getBubbleData();
        if (bubbleData != null && mo17514g(this.f2436g)) {
            List f3 = bubbleData.mo17279f();
            float a = (float) C2347i.m3954a(this.f2453e, "1");
            for (int i2 = 0; i2 < f3.size(); i2++) {
                C2294c cVar = (C2294c) f3.get(i2);
                if (mo17505i(cVar) && cVar.mo17385H0() >= 1) {
                    mo17513a(cVar);
                    float max = Math.max(0.0f, Math.min(1.0f, this.f2450b.mo17224a()));
                    float b = this.f2450b.mo17225b();
                    this.f2431f.mo17506a(this.f2436g, cVar);
                    C2345g a2 = this.f2436g.mo17347a(cVar.mo17384F0());
                    C2312c.C2313a aVar = this.f2431f;
                    float[] a3 = a2.mo17588a(cVar, b, aVar.f2432a, aVar.f2433b);
                    float f4 = max == 1.0f ? b : max;
                    C2273d K = cVar.mo17389K();
                    C2342e d = C2342e.m3926d(cVar.mo17386I0());
                    d.f2538c = C2347i.m3958e(d.f2538c);
                    d.f2539d = C2347i.m3958e(d.f2539d);
                    for (int i3 = 0; i3 < a3.length; i3 = i + 2) {
                        int i4 = i3 / 2;
                        int g0 = cVar.mo17400g0(this.f2431f.f2432a + i4);
                        int argb = Color.argb(Math.round(255.0f * f4), Color.red(g0), Color.green(g0), Color.blue(g0));
                        float f5 = a3[i3];
                        float f6 = a3[i3 + 1];
                        if (!this.f2503a.mo17604A(f5)) {
                            break;
                        }
                        if (!this.f2503a.mo17648z(f5) || !this.f2503a.mo17607D(f6)) {
                            i = i3;
                        } else {
                            BubbleEntry bubbleEntry2 = (BubbleEntry) cVar.mo17392O(i4 + this.f2431f.f2432a);
                            if (cVar.mo17381A0()) {
                                float f7 = f6 + (0.5f * a);
                                bubbleEntry = bubbleEntry2;
                                f2 = f6;
                                float f8 = f5;
                                f = f5;
                                float f9 = f7;
                                i = i3;
                                mo17508k(canvas, K.mo17309d(bubbleEntry2), f8, f9, argb);
                            } else {
                                bubbleEntry = bubbleEntry2;
                                f2 = f6;
                                f = f5;
                                i = i3;
                            }
                            if (bubbleEntry.mo17270b() != null && cVar.mo17411w()) {
                                Drawable b2 = bubbleEntry.mo17270b();
                                C2347i.m3959f(canvas, b2, (int) (f + d.f2538c), (int) (f2 + d.f2539d), b2.getIntrinsicWidth(), b2.getIntrinsicHeight());
                            }
                        }
                    }
                    C2342e.m3927e(d);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo17499f() {
    }

    /* renamed from: j */
    public void mo17507j(Canvas canvas, C2294c cVar) {
        if (cVar.mo17385H0() >= 1) {
            C2345g a = this.f2436g.mo17347a(cVar.mo17384F0());
            float b = this.f2450b.mo17225b();
            this.f2431f.mo17506a(this.f2436g, cVar);
            float[] fArr = this.f2437h;
            fArr[0] = 0.0f;
            fArr[2] = 1.0f;
            a.mo17598k(fArr);
            boolean c = cVar.mo17368c();
            float[] fArr2 = this.f2437h;
            float min = Math.min(Math.abs(this.f2503a.mo17628f() - this.f2503a.mo17632j()), Math.abs(fArr2[2] - fArr2[0]));
            int i = this.f2431f.f2432a;
            while (true) {
                C2312c.C2313a aVar = this.f2431f;
                if (i <= aVar.f2434c + aVar.f2432a) {
                    BubbleEntry bubbleEntry = (BubbleEntry) cVar.mo17392O(i);
                    this.f2438i[0] = bubbleEntry.mo23876f();
                    this.f2438i[1] = bubbleEntry.mo17271c() * b;
                    a.mo17598k(this.f2438i);
                    float l = mo17509l(bubbleEntry.mo23870g(), cVar.mo17367X(), min, c) / 2.0f;
                    if (this.f2503a.mo17605B(this.f2438i[1] + l) && this.f2503a.mo17647y(this.f2438i[1] - l) && this.f2503a.mo17648z(this.f2438i[0] + l)) {
                        if (this.f2503a.mo17604A(this.f2438i[0] - l)) {
                            this.f2451c.setColor(cVar.mo17395U((int) bubbleEntry.mo23876f()));
                            float[] fArr3 = this.f2438i;
                            canvas.drawCircle(fArr3[0], fArr3[1], l, this.f2451c);
                        } else {
                            return;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: k */
    public void mo17508k(Canvas canvas, String str, float f, float f2, int i) {
        this.f2453e.setColor(i);
        canvas.drawText(str, f, f2, this.f2453e);
    }

    /* renamed from: l */
    public float mo17509l(float f, float f2, float f3, boolean z) {
        if (z) {
            f = f2 == 0.0f ? 1.0f : (float) Math.sqrt((double) (f / f2));
        }
        return f3 * f;
    }
}
