package p040c.p200q.p201a.p219b.p259m0;

import p040c.p200q.p201a.p219b.C3214w;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.m0.h */
/* compiled from: TrackSelectorResult */
public final class C3112h {

    /* renamed from: a */
    public final int f5682a;

    /* renamed from: b */
    public final C3214w[] f5683b;

    /* renamed from: c */
    public final C3109f f5684c;

    /* renamed from: d */
    public final Object f5685d;

    public C3112h(C3214w[] wVarArr, C3107e[] eVarArr, Object obj) {
        this.f5683b = wVarArr;
        this.f5684c = new C3109f(eVarArr);
        this.f5685d = obj;
        this.f5682a = wVarArr.length;
    }

    /* renamed from: a */
    public boolean mo19848a(C3112h hVar) {
        if (hVar == null || hVar.f5684c.f5678a != this.f5684c.f5678a) {
            return false;
        }
        for (int i = 0; i < this.f5684c.f5678a; i++) {
            if (!mo19849b(hVar, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo19849b(C3112h hVar, int i) {
        if (hVar != null && C3152e0.m7789b(this.f5683b[i], hVar.f5683b[i]) && C3152e0.m7789b(this.f5684c.mo19842a(i), hVar.f5684c.mo19842a(i))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo19850c(int i) {
        return this.f5683b[i] != null;
    }
}
