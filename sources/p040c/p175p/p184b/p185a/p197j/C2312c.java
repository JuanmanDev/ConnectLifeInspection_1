package p040c.p175p.p184b.p185a.p197j;

import com.github.mikephil.charting.data.DataSet$Rounding;
import com.github.mikephil.charting.data.Entry;
import p040c.p175p.p184b.p185a.p186a.C2250a;
import p040c.p175p.p184b.p185a.p192g.p193a.C2285b;
import p040c.p175p.p184b.p185a.p192g.p194b.C2293b;
import p040c.p175p.p184b.p185a.p192g.p194b.C2296e;
import p040c.p175p.p184b.p185a.p199k.C2348j;

/* renamed from: c.p.b.a.j.c */
/* compiled from: BarLineScatterCandleBubbleRenderer */
public abstract class C2312c extends C2318g {

    /* renamed from: f */
    public C2313a f2431f = new C2313a();

    /* renamed from: c.p.b.a.j.c$a */
    /* compiled from: BarLineScatterCandleBubbleRenderer */
    public class C2313a {

        /* renamed from: a */
        public int f2432a;

        /* renamed from: b */
        public int f2433b;

        /* renamed from: c */
        public int f2434c;

        public C2313a() {
        }

        /* renamed from: a */
        public void mo17506a(C2285b bVar, C2293b bVar2) {
            int i;
            float max = Math.max(0.0f, Math.min(1.0f, C2312c.this.f2450b.mo17224a()));
            float lowestVisibleX = bVar.getLowestVisibleX();
            float highestVisibleX = bVar.getHighestVisibleX();
            Entry f0 = bVar2.mo17399f0(lowestVisibleX, Float.NaN, DataSet$Rounding.DOWN);
            Entry f02 = bVar2.mo17399f0(highestVisibleX, Float.NaN, DataSet$Rounding.UP);
            int i2 = 0;
            if (f0 == null) {
                i = 0;
            } else {
                i = bVar2.mo17405o(f0);
            }
            this.f2432a = i;
            if (f02 != null) {
                i2 = bVar2.mo17405o(f02);
            }
            this.f2433b = i2;
            this.f2434c = (int) (((float) (i2 - this.f2432a)) * max);
        }
    }

    public C2312c(C2250a aVar, C2348j jVar) {
        super(aVar, jVar);
    }

    /* renamed from: h */
    public boolean mo17504h(Entry entry, C2293b bVar) {
        if (entry == null) {
            return false;
        }
        float o = (float) bVar.mo17405o(entry);
        if (entry == null || o >= ((float) bVar.mo17385H0()) * this.f2450b.mo17224a()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo17505i(C2296e eVar) {
        return eVar.isVisible() && (eVar.mo17381A0() || eVar.mo17411w());
    }
}
