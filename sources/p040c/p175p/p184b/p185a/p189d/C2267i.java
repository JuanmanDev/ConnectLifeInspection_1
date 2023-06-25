package p040c.p175p.p184b.p185a.p189d;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import p040c.p175p.p184b.p185a.p191f.C2277d;
import p040c.p175p.p184b.p185a.p192g.p194b.C2300i;

/* renamed from: c.p.b.a.d.i */
/* compiled from: PieData */
public class C2267i extends C2264f<C2300i> {
    /* renamed from: h */
    public Entry mo17281h(C2277d dVar) {
        return mo17299r().mo17392O((int) dVar.mo17333h());
    }

    /* renamed from: r */
    public C2300i mo17299r() {
        return (C2300i) this.f2372i.get(0);
    }

    /* renamed from: s */
    public C2300i mo17277d(int i) {
        if (i == 0) {
            return mo17299r();
        }
        return null;
    }

    /* renamed from: t */
    public float mo17301t() {
        float f = 0.0f;
        for (int i = 0; i < mo17299r().mo17385H0(); i++) {
            f += ((PieEntry) mo17299r().mo17392O(i)).mo17271c();
        }
        return f;
    }
}
