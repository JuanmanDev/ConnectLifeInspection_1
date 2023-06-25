package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p189d.C2269k;
import p040c.p175p.p184b.p185a.p190e.C2273d;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2291h;
import p040c.p175p.p184b.p185a.p192g.p194b.C2302k;
import p040c.p175p.p184b.p185a.p197j.C2312c;
import p040c.p175p.p184b.p185a.p197j.p198w.C2337a;
import p040c.p175p.p184b.p185a.p199k.C2341d;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.p */
/* compiled from: ScatterChartRenderer */
public class C2330p extends C2326l {

    /* renamed from: h */
    public C2291h f2504h;

    /* renamed from: i */
    public float[] f2505i = new float[2];

    public C2330p(C2291h hVar, C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
        this.f2504h = hVar;
    }

    /* renamed from: b */
    public void mo17495b(Canvas canvas) {
        for (C2302k kVar : this.f2504h.getScatterData().mo17279f()) {
            if (kVar.isVisible()) {
                mo17553k(canvas, kVar);
            }
        }
    }

    /* renamed from: c */
    public void mo17496c(Canvas canvas) {
    }

    /* renamed from: d */
    public void mo17497d(Canvas canvas, C2277d[] dVarArr) {
        C2269k scatterData = this.f2504h.getScatterData();
        for (C2277d dVar : dVarArr) {
            C2302k kVar = (C2302k) scatterData.mo17277d(dVar.mo17329d());
            if (kVar != null && kVar.mo17390L0()) {
                Entry t = kVar.mo17410t(dVar.mo17333h(), dVar.mo17335j());
                if (mo17504h(t, kVar)) {
                    C2341d e = this.f2504h.mo17347a(kVar.mo17384F0()).mo17592e(t.mo23876f(), t.mo17271c() * this.f2450b.mo17225b());
                    dVar.mo17338m((float) e.f2535c, (float) e.f2536d);
                    mo17536j(canvas, (float) e.f2535c, (float) e.f2536d, kVar);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo17498e(Canvas canvas) {
        C2302k kVar;
        Entry entry;
        if (mo17514g(this.f2504h)) {
            List f = this.f2504h.getScatterData().mo17279f();
            for (int i = 0; i < this.f2504h.getScatterData().mo17278e(); i++) {
                C2302k kVar2 = (C2302k) f.get(i);
                if (mo17505i(kVar2) && kVar2.mo17385H0() >= 1) {
                    mo17513a(kVar2);
                    this.f2431f.mo17506a(this.f2504h, kVar2);
                    C2345g a = this.f2504h.mo17347a(kVar2.mo17384F0());
                    float a2 = this.f2450b.mo17224a();
                    float b = this.f2450b.mo17225b();
                    C2312c.C2313a aVar = this.f2431f;
                    float[] d = a.mo17591d(kVar2, a2, b, aVar.f2432a, aVar.f2433b);
                    float e = C2347i.m3958e(kVar2.mo17454d0());
                    C2273d K = kVar2.mo17389K();
                    C2342e d2 = C2342e.m3926d(kVar2.mo17386I0());
                    d2.f2538c = C2347i.m3958e(d2.f2538c);
                    d2.f2539d = C2347i.m3958e(d2.f2539d);
                    int i2 = 0;
                    while (i2 < d.length && this.f2503a.mo17604A(d[i2])) {
                        if (this.f2503a.mo17648z(d[i2])) {
                            int i3 = i2 + 1;
                            if (this.f2503a.mo17607D(d[i3])) {
                                int i4 = i2 / 2;
                                Entry O = kVar2.mo17392O(this.f2431f.f2432a + i4);
                                if (kVar2.mo17381A0()) {
                                    String h = K.mo17312h(O);
                                    float f2 = d[i2];
                                    entry = O;
                                    float f3 = d[i3] - e;
                                    kVar = kVar2;
                                    mo17554l(canvas, h, f2, f3, kVar2.mo17400g0(i4 + this.f2431f.f2432a));
                                } else {
                                    entry = O;
                                    kVar = kVar2;
                                }
                                if (entry.mo17270b() != null && kVar.mo17411w()) {
                                    Drawable b2 = entry.mo17270b();
                                    C2347i.m3959f(canvas, b2, (int) (d[i2] + d2.f2538c), (int) (d[i3] + d2.f2539d), b2.getIntrinsicWidth(), b2.getIntrinsicHeight());
                                }
                                i2 += 2;
                                kVar2 = kVar;
                            }
                        }
                        kVar = kVar2;
                        i2 += 2;
                        kVar2 = kVar;
                    }
                    C2342e.m3927e(d2);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo17499f() {
    }

    /* renamed from: k */
    public void mo17553k(Canvas canvas, C2302k kVar) {
        int i;
        C2302k kVar2 = kVar;
        if (kVar.mo17385H0() >= 1) {
            C2348j jVar = this.f2503a;
            C2345g a = this.f2504h.mo17347a(kVar.mo17384F0());
            float b = this.f2450b.mo17225b();
            C2337a t0 = kVar.mo17455t0();
            if (t0 != null) {
                int min = (int) Math.min(Math.ceil((double) (((float) kVar.mo17385H0()) * this.f2450b.mo17224a())), (double) ((float) kVar.mo17385H0()));
                int i2 = 0;
                while (i2 < min) {
                    Entry O = kVar2.mo17392O(i2);
                    this.f2505i[0] = O.mo23876f();
                    this.f2505i[1] = O.mo17271c() * b;
                    a.mo17598k(this.f2505i);
                    if (jVar.mo17604A(this.f2505i[0])) {
                        if (!jVar.mo17648z(this.f2505i[0]) || !jVar.mo17607D(this.f2505i[1])) {
                            i = i2;
                        } else {
                            this.f2451c.setColor(kVar2.mo17395U(i2 / 2));
                            C2348j jVar2 = this.f2503a;
                            float[] fArr = this.f2505i;
                            i = i2;
                            t0.mo17576a(canvas, kVar, jVar2, fArr[0], fArr[1], this.f2451c);
                        }
                        i2 = i + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public void mo17554l(Canvas canvas, String str, float f, float f2, int i) {
        this.f2453e.setColor(i);
        canvas.drawText(str, f, f2, this.f2453e);
    }
}
