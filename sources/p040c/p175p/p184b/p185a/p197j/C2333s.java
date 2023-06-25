package p040c.p175p.p184b.p185a.p197j;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import p040c.p175p.p184b.p185a.p189d.C2268j;
import p040c.p175p.p184b.p185a.p192g.p194b.C2301j;
import p040c.p175p.p184b.p185a.p199k.C2342e;
import p040c.p175p.p184b.p185a.p199k.C2345g;
import p040c.p175p.p184b.p185a.p199k.C2347i;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.s */
/* compiled from: XAxisRendererRadarChart */
public class C2333s extends C2331q {

    /* renamed from: p */
    public RadarChart f2515p;

    public C2333s(C2348j jVar, XAxis xAxis, RadarChart radarChart) {
        super(jVar, xAxis, (C2345g) null);
        this.f2515p = radarChart;
    }

    /* renamed from: i */
    public void mo17560i(Canvas canvas) {
        if (this.f2506h.mo17262f() && this.f2506h.mo17254x()) {
            float D = this.f2506h.mo23847D();
            C2342e c = C2342e.m3925c(0.5f, 0.25f);
            this.f2422e.setTypeface(this.f2506h.mo17259c());
            this.f2422e.setTextSize(this.f2506h.mo17258b());
            this.f2422e.setColor(this.f2506h.mo17257a());
            float sliceAngle = this.f2515p.getSliceAngle();
            float factor = this.f2515p.getFactor();
            C2342e centerOffsets = this.f2515p.getCenterOffsets();
            C2342e c2 = C2342e.m3925c(0.0f, 0.0f);
            for (int i = 0; i < ((C2301j) ((C2268j) this.f2515p.getData()).mo17284k()).mo17385H0(); i++) {
                float f = (float) i;
                String a = this.f2506h.mo17249s().mo17306a(f, this.f2506h);
                C2347i.m3970q(centerOffsets, (this.f2515p.getYRange() * factor) + (((float) this.f2506h.f7507L) / 2.0f), ((f * sliceAngle) + this.f2515p.getRotationAngle()) % 360.0f, c2);
                mo17557f(canvas, a, c2.f2538c, c2.f2539d - (((float) this.f2506h.f7508M) / 2.0f), c, D);
            }
            C2342e.m3927e(centerOffsets);
            C2342e.m3927e(c2);
            C2342e.m3927e(c);
        }
    }

    /* renamed from: n */
    public void mo17565n(Canvas canvas) {
    }
}
