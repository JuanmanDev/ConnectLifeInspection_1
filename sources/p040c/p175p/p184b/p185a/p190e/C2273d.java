package p040c.p175p.p184b.p185a.p190e;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarEntry;
import p040c.p175p.p184b.p185a.p188c.C2254a;

/* renamed from: c.p.b.a.e.d */
/* compiled from: ValueFormatter */
public abstract class C2273d {
    /* renamed from: a */
    public String mo17306a(float f, C2254a aVar) {
        return mo17302f(f);
    }

    /* renamed from: b */
    public String mo17307b(BarEntry barEntry) {
        return mo17302f(barEntry.mo17271c());
    }

    /* renamed from: c */
    public String mo17308c(float f, BarEntry barEntry) {
        return mo17302f(f);
    }

    /* renamed from: d */
    public String mo17309d(BubbleEntry bubbleEntry) {
        return mo17302f(bubbleEntry.mo23870g());
    }

    /* renamed from: e */
    public String mo17310e(CandleEntry candleEntry) {
        return mo17302f(candleEntry.mo23872h());
    }

    /* renamed from: f */
    public abstract String mo17302f(float f);

    /* renamed from: g */
    public String mo17311g(float f, PieEntry pieEntry) {
        return mo17302f(f);
    }

    /* renamed from: h */
    public String mo17312h(Entry entry) {
        return mo17302f(entry.mo17271c());
    }

    /* renamed from: i */
    public String mo17313i(RadarEntry radarEntry) {
        return mo17302f(radarEntry.mo17271c());
    }
}
