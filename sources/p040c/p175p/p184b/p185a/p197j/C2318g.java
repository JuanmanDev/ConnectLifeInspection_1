package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p193a.C2288e;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.g */
/* compiled from: DataRenderer */
public abstract class C2318g extends C2329o {

    /* renamed from: b */
    public C2250a f2450b;

    /* renamed from: c */
    public Paint f2451c;

    /* renamed from: d */
    public Paint f2452d;

    /* renamed from: e */
    public Paint f2453e;

    public C2318g(C2250a aVar, C2348j jVar) {
        super(jVar);
        this.f2450b = aVar;
        Paint paint = new Paint(1);
        this.f2451c = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f2453e = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.f2453e.setTextAlign(Paint.Align.CENTER);
        this.f2453e.setTextSize(C2347i.m3958e(9.0f));
        Paint paint3 = new Paint(1);
        this.f2452d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f2452d.setStrokeWidth(2.0f);
        this.f2452d.setColor(Color.rgb(255, 187, 115));
    }

    /* renamed from: a */
    public void mo17513a(C2296e eVar) {
        this.f2453e.setTypeface(eVar.mo17396a0());
        this.f2453e.setTextSize(eVar.mo17387J());
    }

    /* renamed from: b */
    public abstract void mo17495b(Canvas canvas);

    /* renamed from: c */
    public abstract void mo17496c(Canvas canvas);

    /* renamed from: d */
    public abstract void mo17497d(Canvas canvas, C2277d[] dVarArr);

    /* renamed from: e */
    public abstract void mo17498e(Canvas canvas);

    /* renamed from: f */
    public abstract void mo17499f();

    /* renamed from: g */
    public boolean mo17514g(C2288e eVar) {
        return ((float) eVar.getData().mo17280g()) < ((float) eVar.getMaxVisibleCount()) * this.f2503a.mo17639q();
    }
}
