package p040c.p200q.p201a.p219b.p250l0.p254n;

import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3034d;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.l0.n.b */
/* compiled from: SsaSubtitle */
public final class C3071b implements C3034d {

    /* renamed from: e */
    public final C3031a[] f5515e;

    /* renamed from: l */
    public final long[] f5516l;

    public C3071b(C3031a[] aVarArr, long[] jArr) {
        this.f5515e = aVarArr;
        this.f5516l = jArr;
    }

    /* renamed from: c */
    public int mo19618c(long j) {
        int c = C3152e0.m7791c(this.f5516l, j, false, false);
        if (c < this.f5516l.length) {
            return c;
        }
        return -1;
    }

    /* renamed from: d */
    public long mo19619d(int i) {
        boolean z = true;
        C3151e.m7753a(i >= 0);
        if (i >= this.f5516l.length) {
            z = false;
        }
        C3151e.m7753a(z);
        return this.f5516l[i];
    }

    /* renamed from: e */
    public List<C3031a> mo19620e(long j) {
        int e = C3152e0.m7795e(this.f5516l, j, true, false);
        if (e != -1) {
            C3031a[] aVarArr = this.f5515e;
            if (aVarArr[e] != null) {
                return Collections.singletonList(aVarArr[e]);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: g */
    public int mo19621g() {
        return this.f5516l.length;
    }
}
