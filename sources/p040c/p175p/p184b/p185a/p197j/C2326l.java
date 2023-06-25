package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import android.graphics.Path;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p192g.p194b.C2299h;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.l */
/* compiled from: LineScatterCandleRadarRenderer */
public abstract class C2326l extends C2312c {

    /* renamed from: g */
    public Path f2480g = new Path();

    public C2326l(C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
    }

    /* renamed from: j */
    public void mo17536j(Canvas canvas, float f, float f2, C2299h hVar) {
        this.f2452d.setColor(hVar.mo17366D0());
        this.f2452d.setStrokeWidth(hVar.mo17431B());
        this.f2452d.setPathEffect(hVar.mo17434h0());
        if (hVar.mo17432M0()) {
            this.f2480g.reset();
            this.f2480g.moveTo(f, this.f2503a.mo17632j());
            this.f2480g.lineTo(f, this.f2503a.mo17628f());
            canvas.drawPath(this.f2480g, this.f2452d);
        }
        if (hVar.mo17433P0()) {
            this.f2480g.reset();
            this.f2480g.moveTo(this.f2503a.mo17630h(), f2);
            this.f2480g.lineTo(this.f2503a.mo17631i(), f2);
            canvas.drawPath(this.f2480g, this.f2452d);
        }
    }
}
