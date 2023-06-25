package p040c.p200q.p201a.p219b.p241k0.p243c0;

import p040c.p200q.p201a.p219b.p224f0.C2673f;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p241k0.C3024x;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2873e;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.k0.c0.c */
/* compiled from: BaseMediaChunkOutput */
public final class C2871c implements C2873e.C2875b {

    /* renamed from: a */
    public final int[] f4551a;

    /* renamed from: b */
    public final C3024x[] f4552b;

    public C2871c(int[] iArr, C3024x[] xVarArr) {
        this.f4551a = iArr;
        this.f4552b = xVarArr;
    }

    /* renamed from: a */
    public C2686q mo19069a(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f4551a;
            if (i3 >= iArr.length) {
                C3163m.m7877c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new C2673f();
            } else if (i2 == iArr[i3]) {
                return this.f4552b[i3];
            } else {
                i3++;
            }
        }
    }

    /* renamed from: b */
    public int[] mo19070b() {
        int[] iArr = new int[this.f4552b.length];
        int i = 0;
        while (true) {
            C3024x[] xVarArr = this.f4552b;
            if (i >= xVarArr.length) {
                return iArr;
            }
            if (xVarArr[i] != null) {
                iArr[i] = xVarArr[i].mo19601t();
            }
            i++;
        }
    }

    /* renamed from: c */
    public void mo19071c(long j) {
        for (C3024x xVar : this.f4552b) {
            if (xVar != null) {
                xVar.mo19583H(j);
            }
        }
    }
}
