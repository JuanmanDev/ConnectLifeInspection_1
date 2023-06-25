package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet$Mode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p189d.C2266h;
import p040c.p175p.p184b.p185a.p190e.C2273d;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2290g;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;
import p040c.p175p.p184b.p185a.p192g.p194b.C2297f;
import p040c.p175p.p184b.p185a.p197j.C2312c;
import p040c.p175p.p184b.p185a.p199k.C2341d;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.j */
/* compiled from: LineChartRenderer */
public class C2322j extends C2325k {

    /* renamed from: h */
    public C2290g f2465h;

    /* renamed from: i */
    public Paint f2466i;

    /* renamed from: j */
    public WeakReference<Bitmap> f2467j;

    /* renamed from: k */
    public Canvas f2468k;

    /* renamed from: l */
    public Bitmap.Config f2469l = Bitmap.Config.ARGB_8888;

    /* renamed from: m */
    public Path f2470m = new Path();

    /* renamed from: n */
    public Path f2471n = new Path();

    /* renamed from: o */
    public float[] f2472o = new float[4];

    /* renamed from: p */
    public Path f2473p = new Path();

    /* renamed from: q */
    public HashMap<C2296e, C2324b> f2474q = new HashMap<>();

    /* renamed from: r */
    public float[] f2475r = new float[2];

    /* renamed from: c.p.b.a.j.j$a */
    /* compiled from: LineChartRenderer */
    public static /* synthetic */ class C2323a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2476a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.github.mikephil.charting.data.LineDataSet$Mode[] r0 = com.github.mikephil.charting.data.LineDataSet$Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2476a = r0
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet$Mode.LINEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2476a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet$Mode.STEPPED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2476a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet$Mode.CUBIC_BEZIER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2476a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet$Mode.HORIZONTAL_BEZIER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p184b.p185a.p197j.C2322j.C2323a.<clinit>():void");
        }
    }

    public C2322j(C2290g gVar, C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
        this.f2465h = gVar;
        Paint paint = new Paint(1);
        this.f2466i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2466i.setColor(-1);
    }

    /* renamed from: b */
    public void mo17495b(Canvas canvas) {
        int m = (int) this.f2503a.mo17635m();
        int l = (int) this.f2503a.mo17634l();
        WeakReference<Bitmap> weakReference = this.f2467j;
        Bitmap bitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (!(bitmap != null && bitmap.getWidth() == m && bitmap.getHeight() == l)) {
            if (m > 0 && l > 0) {
                bitmap = Bitmap.createBitmap(m, l, this.f2469l);
                this.f2467j = new WeakReference<>(bitmap);
                this.f2468k = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (C2297f fVar : this.f2465h.getLineData().mo17279f()) {
            if (fVar.isVisible()) {
                mo17523q(canvas, fVar);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f2451c);
    }

    /* renamed from: c */
    public void mo17496c(Canvas canvas) {
        mo17520n(canvas);
    }

    /* renamed from: d */
    public void mo17497d(Canvas canvas, C2277d[] dVarArr) {
        C2266h lineData = this.f2465h.getLineData();
        for (C2277d dVar : dVarArr) {
            C2297f fVar = (C2297f) lineData.mo17277d(dVar.mo17329d());
            if (fVar != null && fVar.mo17390L0()) {
                Entry t = fVar.mo17410t(dVar.mo17333h(), dVar.mo17335j());
                if (mo17504h(t, fVar)) {
                    C2341d e = this.f2465h.mo17347a(fVar.mo17384F0()).mo17592e(t.mo23876f(), t.mo17271c() * this.f2450b.mo17225b());
                    dVar.mo17338m((float) e.f2535c, (float) e.f2536d);
                    mo17536j(canvas, (float) e.f2535c, (float) e.f2536d, fVar);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo17498e(Canvas canvas) {
        int i;
        C2297f fVar;
        Entry entry;
        if (mo17514g(this.f2465h)) {
            List f = this.f2465h.getLineData().mo17279f();
            for (int i2 = 0; i2 < f.size(); i2++) {
                C2297f fVar2 = (C2297f) f.get(i2);
                if (mo17505i(fVar2) && fVar2.mo17385H0() >= 1) {
                    mo17513a(fVar2);
                    C2345g a = this.f2465h.mo17347a(fVar2.mo17384F0());
                    int P = (int) (fVar2.mo17419P() * 1.75f);
                    if (!fVar2.mo17417K0()) {
                        P /= 2;
                    }
                    int i3 = P;
                    this.f2431f.mo17506a(this.f2465h, fVar2);
                    float a2 = this.f2450b.mo17224a();
                    float b = this.f2450b.mo17225b();
                    C2312c.C2313a aVar = this.f2431f;
                    float[] c = a.mo17590c(fVar2, a2, b, aVar.f2432a, aVar.f2433b);
                    C2273d K = fVar2.mo17389K();
                    C2342e d = C2342e.m3926d(fVar2.mo17386I0());
                    d.f2538c = C2347i.m3958e(d.f2538c);
                    d.f2539d = C2347i.m3958e(d.f2539d);
                    int i4 = 0;
                    while (i4 < c.length) {
                        float f2 = c[i4];
                        float f3 = c[i4 + 1];
                        if (!this.f2503a.mo17604A(f2)) {
                            break;
                        }
                        if (!this.f2503a.mo17648z(f2) || !this.f2503a.mo17607D(f3)) {
                            i = i3;
                            fVar = fVar2;
                        } else {
                            int i5 = i4 / 2;
                            Entry O = fVar2.mo17392O(this.f2431f.f2432a + i5);
                            if (fVar2.mo17381A0()) {
                                entry = O;
                                i = i3;
                                fVar = fVar2;
                                mo17527u(canvas, K.mo17312h(O), f2, f3 - ((float) i3), fVar2.mo17400g0(i5));
                            } else {
                                entry = O;
                                i = i3;
                                fVar = fVar2;
                            }
                            if (entry.mo17270b() != null && fVar.mo17411w()) {
                                Drawable b2 = entry.mo17270b();
                                C2347i.m3959f(canvas, b2, (int) (f2 + d.f2538c), (int) (f3 + d.f2539d), b2.getIntrinsicWidth(), b2.getIntrinsicHeight());
                            }
                        }
                        i4 += 2;
                        fVar2 = fVar;
                        i3 = i;
                    }
                    C2342e.m3927e(d);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo17499f() {
    }

    /* renamed from: n */
    public void mo17520n(Canvas canvas) {
        C2324b bVar;
        Bitmap b;
        this.f2451c.setStyle(Paint.Style.FILL);
        float b2 = this.f2450b.mo17225b();
        float[] fArr = this.f2475r;
        boolean z = false;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List f2 = this.f2465h.getLineData().mo17279f();
        int i = 0;
        while (i < f2.size()) {
            C2297f fVar = (C2297f) f2.get(i);
            if (fVar.isVisible() && fVar.mo17417K0() && fVar.mo17385H0() != 0) {
                this.f2466i.setColor(fVar.mo17425y());
                C2345g a = this.f2465h.mo17347a(fVar.mo17384F0());
                this.f2431f.mo17506a(this.f2465h, fVar);
                float P = fVar.mo17419P();
                float N0 = fVar.mo17418N0();
                boolean z2 = (!fVar.mo17420R0() || N0 >= P || N0 <= f) ? z : true;
                boolean z3 = (!z2 || fVar.mo17425y() != 1122867) ? z : true;
                if (this.f2474q.containsKey(fVar)) {
                    bVar = this.f2474q.get(fVar);
                } else {
                    bVar = new C2324b(this, (C2323a) null);
                    this.f2474q.put(fVar, bVar);
                }
                if (bVar.mo17532c(fVar)) {
                    bVar.mo17530a(fVar, z2, z3);
                }
                C2312c.C2313a aVar = this.f2431f;
                int i2 = aVar.f2434c;
                int i3 = aVar.f2432a;
                int i4 = i2 + i3;
                char c = z;
                while (i3 <= i4) {
                    Entry O = fVar.mo17392O(i3);
                    if (O == null) {
                        break;
                    }
                    this.f2475r[c] = O.mo23876f();
                    this.f2475r[1] = O.mo17271c() * b2;
                    a.mo17598k(this.f2475r);
                    if (!this.f2503a.mo17604A(this.f2475r[c])) {
                        break;
                    }
                    if (!this.f2503a.mo17648z(this.f2475r[c]) || !this.f2503a.mo17607D(this.f2475r[1]) || (b = bVar.mo17531b(i3)) == null) {
                        Canvas canvas2 = canvas;
                    } else {
                        float[] fArr2 = this.f2475r;
                        canvas.drawBitmap(b, fArr2[c] - P, fArr2[1] - P, (Paint) null);
                    }
                    i3++;
                    c = 0;
                }
            }
            Canvas canvas3 = canvas;
            i++;
            z = false;
            f = 0.0f;
        }
    }

    /* renamed from: o */
    public void mo17521o(C2297f fVar) {
        C2297f fVar2 = fVar;
        float b = this.f2450b.mo17225b();
        C2345g a = this.f2465h.mo17347a(fVar.mo17384F0());
        this.f2431f.mo17506a(this.f2465h, fVar2);
        float E = fVar.mo17414E();
        this.f2470m.reset();
        C2312c.C2313a aVar = this.f2431f;
        if (aVar.f2434c >= 1) {
            int i = aVar.f2432a + 1;
            Entry O = fVar2.mo17392O(Math.max(i - 2, 0));
            Entry O2 = fVar2.mo17392O(Math.max(i - 1, 0));
            int i2 = -1;
            if (O2 != null) {
                this.f2470m.moveTo(O2.mo23876f(), O2.mo17271c() * b);
                int i3 = this.f2431f.f2432a + 1;
                Entry entry = O2;
                while (true) {
                    C2312c.C2313a aVar2 = this.f2431f;
                    if (i3 > aVar2.f2434c + aVar2.f2432a) {
                        break;
                    }
                    if (i2 != i3) {
                        O2 = fVar2.mo17392O(i3);
                    }
                    int i4 = i3 + 1;
                    if (i4 < fVar.mo17385H0()) {
                        i3 = i4;
                    }
                    Entry O3 = fVar2.mo17392O(i3);
                    this.f2470m.cubicTo(entry.mo23876f() + ((O2.mo23876f() - O.mo23876f()) * E), (entry.mo17271c() + ((O2.mo17271c() - O.mo17271c()) * E)) * b, O2.mo23876f() - ((O3.mo23876f() - entry.mo23876f()) * E), (O2.mo17271c() - ((O3.mo17271c() - entry.mo17271c()) * E)) * b, O2.mo23876f(), O2.mo17271c() * b);
                    O = entry;
                    entry = O2;
                    O2 = O3;
                    int i5 = i3;
                    i3 = i4;
                    i2 = i5;
                }
            } else {
                return;
            }
        }
        if (fVar.mo17427Q()) {
            this.f2471n.reset();
            this.f2471n.addPath(this.f2470m);
            mo17522p(this.f2468k, fVar, this.f2471n, a, this.f2431f);
        }
        this.f2451c.setColor(fVar.mo17388J0());
        this.f2451c.setStyle(Paint.Style.STROKE);
        a.mo17596i(this.f2470m);
        this.f2468k.drawPath(this.f2470m, this.f2451c);
        this.f2451c.setPathEffect((PathEffect) null);
    }

    /* renamed from: p */
    public void mo17522p(Canvas canvas, C2297f fVar, Path path, C2345g gVar, C2312c.C2313a aVar) {
        float a = fVar.mo17423l().mo17305a(fVar, this.f2465h);
        path.lineTo(fVar.mo17392O(aVar.f2432a + aVar.f2434c).mo23876f(), a);
        path.lineTo(fVar.mo17392O(aVar.f2432a).mo23876f(), a);
        path.close();
        gVar.mo17596i(path);
        Drawable H = fVar.mo17426H();
        if (H != null) {
            mo17535m(canvas, path, H);
        } else {
            mo17534l(canvas, path, fVar.mo17428e(), fVar.mo17429i());
        }
    }

    /* renamed from: q */
    public void mo17523q(Canvas canvas, C2297f fVar) {
        if (fVar.mo17385H0() >= 1) {
            this.f2451c.setStrokeWidth(fVar.mo17430q());
            this.f2451c.setPathEffect(fVar.mo17416G());
            int i = C2323a.f2476a[fVar.mo17421T().ordinal()];
            if (i == 3) {
                mo17521o(fVar);
            } else if (i != 4) {
                mo17525s(canvas, fVar);
            } else {
                mo17524r(fVar);
            }
            this.f2451c.setPathEffect((PathEffect) null);
        }
    }

    /* renamed from: r */
    public void mo17524r(C2297f fVar) {
        float b = this.f2450b.mo17225b();
        C2345g a = this.f2465h.mo17347a(fVar.mo17384F0());
        this.f2431f.mo17506a(this.f2465h, fVar);
        this.f2470m.reset();
        C2312c.C2313a aVar = this.f2431f;
        if (aVar.f2434c >= 1) {
            Entry O = fVar.mo17392O(aVar.f2432a);
            this.f2470m.moveTo(O.mo23876f(), O.mo17271c() * b);
            int i = this.f2431f.f2432a + 1;
            while (true) {
                C2312c.C2313a aVar2 = this.f2431f;
                if (i > aVar2.f2434c + aVar2.f2432a) {
                    break;
                }
                Entry O2 = fVar.mo17392O(i);
                float f = O.mo23876f() + ((O2.mo23876f() - O.mo23876f()) / 2.0f);
                this.f2470m.cubicTo(f, O.mo17271c() * b, f, O2.mo17271c() * b, O2.mo23876f(), O2.mo17271c() * b);
                i++;
                O = O2;
            }
        }
        if (fVar.mo17427Q()) {
            this.f2471n.reset();
            this.f2471n.addPath(this.f2470m);
            mo17522p(this.f2468k, fVar, this.f2471n, a, this.f2431f);
        }
        this.f2451c.setColor(fVar.mo17388J0());
        this.f2451c.setStyle(Paint.Style.STROKE);
        a.mo17596i(this.f2470m);
        this.f2468k.drawPath(this.f2470m, this.f2451c);
        this.f2451c.setPathEffect((PathEffect) null);
    }

    /* renamed from: s */
    public void mo17525s(Canvas canvas, C2297f fVar) {
        C2297f fVar2 = fVar;
        int H0 = fVar.mo17385H0();
        boolean z = fVar.mo17421T() == LineDataSet$Mode.STEPPED;
        int i = z ? 4 : 2;
        C2345g a = this.f2465h.mo17347a(fVar.mo17384F0());
        float b = this.f2450b.mo17225b();
        this.f2451c.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = fVar.mo17424v() ? this.f2468k : canvas;
        this.f2431f.mo17506a(this.f2465h, fVar2);
        if (fVar.mo17427Q() && H0 > 0) {
            mo17526t(canvas, fVar2, a, this.f2431f);
        }
        if (fVar.mo17403l0().size() > 1) {
            int i2 = i * 2;
            if (this.f2472o.length <= i2) {
                this.f2472o = new float[(i * 4)];
            }
            int i3 = this.f2431f.f2432a;
            while (true) {
                C2312c.C2313a aVar = this.f2431f;
                if (i3 > aVar.f2434c + aVar.f2432a) {
                    break;
                }
                Entry O = fVar2.mo17392O(i3);
                if (O != null) {
                    this.f2472o[0] = O.mo23876f();
                    this.f2472o[1] = O.mo17271c() * b;
                    if (i3 < this.f2431f.f2433b) {
                        Entry O2 = fVar2.mo17392O(i3 + 1);
                        if (O2 == null) {
                            break;
                        } else if (z) {
                            this.f2472o[2] = O2.mo23876f();
                            float[] fArr = this.f2472o;
                            fArr[3] = fArr[1];
                            fArr[4] = fArr[2];
                            fArr[5] = fArr[3];
                            fArr[6] = O2.mo23876f();
                            this.f2472o[7] = O2.mo17271c() * b;
                        } else {
                            this.f2472o[2] = O2.mo23876f();
                            this.f2472o[3] = O2.mo17271c() * b;
                        }
                    } else {
                        float[] fArr2 = this.f2472o;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    a.mo17598k(this.f2472o);
                    if (!this.f2503a.mo17604A(this.f2472o[0])) {
                        break;
                    } else if (this.f2503a.mo17648z(this.f2472o[2]) && (this.f2503a.mo17605B(this.f2472o[1]) || this.f2503a.mo17647y(this.f2472o[3]))) {
                        this.f2451c.setColor(fVar2.mo17395U(i3));
                        canvas2.drawLines(this.f2472o, 0, i2, this.f2451c);
                    }
                }
                i3++;
            }
        } else {
            int i4 = H0 * i;
            if (this.f2472o.length < Math.max(i4, i) * 2) {
                this.f2472o = new float[(Math.max(i4, i) * 4)];
            }
            if (fVar2.mo17392O(this.f2431f.f2432a) != null) {
                int i5 = this.f2431f.f2432a;
                int i6 = 0;
                while (true) {
                    C2312c.C2313a aVar2 = this.f2431f;
                    if (i5 > aVar2.f2434c + aVar2.f2432a) {
                        break;
                    }
                    Entry O3 = fVar2.mo17392O(i5 == 0 ? 0 : i5 - 1);
                    Entry O4 = fVar2.mo17392O(i5);
                    if (!(O3 == null || O4 == null)) {
                        int i7 = i6 + 1;
                        this.f2472o[i6] = O3.mo23876f();
                        int i8 = i7 + 1;
                        this.f2472o[i7] = O3.mo17271c() * b;
                        if (z) {
                            int i9 = i8 + 1;
                            this.f2472o[i8] = O4.mo23876f();
                            int i10 = i9 + 1;
                            this.f2472o[i9] = O3.mo17271c() * b;
                            int i11 = i10 + 1;
                            this.f2472o[i10] = O4.mo23876f();
                            i8 = i11 + 1;
                            this.f2472o[i11] = O3.mo17271c() * b;
                        }
                        int i12 = i8 + 1;
                        this.f2472o[i8] = O4.mo23876f();
                        this.f2472o[i12] = O4.mo17271c() * b;
                        i6 = i12 + 1;
                    }
                    i5++;
                }
                if (i6 > 0) {
                    a.mo17598k(this.f2472o);
                    this.f2451c.setColor(fVar.mo17388J0());
                    canvas2.drawLines(this.f2472o, 0, Math.max((this.f2431f.f2434c + 1) * i, i) * 2, this.f2451c);
                }
            }
        }
        this.f2451c.setPathEffect((PathEffect) null);
    }

    /* renamed from: t */
    public void mo17526t(Canvas canvas, C2297f fVar, C2345g gVar, C2312c.C2313a aVar) {
        int i;
        int i2;
        Path path = this.f2473p;
        int i3 = aVar.f2432a;
        int i4 = aVar.f2434c + i3;
        int i5 = 0;
        do {
            i = (i5 * 128) + i3;
            i2 = i + 128;
            if (i2 > i4) {
                i2 = i4;
            }
            if (i <= i2) {
                mo17528v(fVar, i, i2, path);
                gVar.mo17596i(path);
                Drawable H = fVar.mo17426H();
                if (H != null) {
                    mo17535m(canvas, path, H);
                } else {
                    mo17534l(canvas, path, fVar.mo17428e(), fVar.mo17429i());
                }
            }
            i5++;
        } while (i <= i2);
    }

    /* renamed from: u */
    public void mo17527u(Canvas canvas, String str, float f, float f2, int i) {
        this.f2453e.setColor(i);
        canvas.drawText(str, f, f2, this.f2453e);
    }

    /* renamed from: v */
    public final void mo17528v(C2297f fVar, int i, int i2, Path path) {
        float a = fVar.mo17423l().mo17305a(fVar, this.f2465h);
        float b = this.f2450b.mo17225b();
        boolean z = fVar.mo17421T() == LineDataSet$Mode.STEPPED;
        path.reset();
        Entry O = fVar.mo17392O(i);
        path.moveTo(O.mo23876f(), a);
        path.lineTo(O.mo23876f(), O.mo17271c() * b);
        Entry entry = null;
        int i3 = i + 1;
        while (i3 <= i2) {
            entry = fVar.mo17392O(i3);
            if (z) {
                path.lineTo(entry.mo23876f(), O.mo17271c() * b);
            }
            path.lineTo(entry.mo23876f(), entry.mo17271c() * b);
            i3++;
            O = entry;
        }
        if (entry != null) {
            path.lineTo(entry.mo23876f(), a);
        }
        path.close();
    }

    /* renamed from: w */
    public void mo17529w() {
        Canvas canvas = this.f2468k;
        if (canvas != null) {
            canvas.setBitmap((Bitmap) null);
            this.f2468k = null;
        }
        WeakReference<Bitmap> weakReference = this.f2467j;
        if (weakReference != null) {
            Bitmap bitmap = (Bitmap) weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f2467j.clear();
            this.f2467j = null;
        }
    }

    /* renamed from: c.p.b.a.j.j$b */
    /* compiled from: LineChartRenderer */
    public class C2324b {

        /* renamed from: a */
        public Path f2477a;

        /* renamed from: b */
        public Bitmap[] f2478b;

        public C2324b() {
            this.f2477a = new Path();
        }

        /* renamed from: a */
        public void mo17530a(C2297f fVar, boolean z, boolean z2) {
            int d = fVar.mo17422d();
            float P = fVar.mo17419P();
            float N0 = fVar.mo17418N0();
            for (int i = 0; i < d; i++) {
                int i2 = (int) (((double) P) * 2.1d);
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                this.f2478b[i] = createBitmap;
                C2322j.this.f2451c.setColor(fVar.mo17415E0(i));
                if (z2) {
                    this.f2477a.reset();
                    this.f2477a.addCircle(P, P, P, Path.Direction.CW);
                    this.f2477a.addCircle(P, P, N0, Path.Direction.CCW);
                    canvas.drawPath(this.f2477a, C2322j.this.f2451c);
                } else {
                    canvas.drawCircle(P, P, P, C2322j.this.f2451c);
                    if (z) {
                        canvas.drawCircle(P, P, N0, C2322j.this.f2466i);
                    }
                }
            }
        }

        /* renamed from: b */
        public Bitmap mo17531b(int i) {
            Bitmap[] bitmapArr = this.f2478b;
            return bitmapArr[i % bitmapArr.length];
        }

        /* renamed from: c */
        public boolean mo17532c(C2297f fVar) {
            int d = fVar.mo17422d();
            Bitmap[] bitmapArr = this.f2478b;
            if (bitmapArr == null) {
                this.f2478b = new Bitmap[d];
                return true;
            } else if (bitmapArr.length == d) {
                return false;
            } else {
                this.f2478b = new Bitmap[d];
                return true;
            }
        }

        public /* synthetic */ C2324b(C2322j jVar, C2323a aVar) {
            this();
        }
    }
}
