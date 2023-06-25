package p040c.p200q.p201a.p219b.p241k0;

/* renamed from: c.q.a.b.k0.n */
/* compiled from: CompositeSequenceableLoader */
public class C2999n implements C3028z {

    /* renamed from: e */
    public final C3028z[] f5203e;

    public C2999n(C3028z[] zVarArr) {
        this.f5203e = zVarArr;
    }

    /* renamed from: b */
    public final long mo19098b() {
        long j = Long.MAX_VALUE;
        for (C3028z b : this.f5203e) {
            long b2 = b.mo19098b();
            if (b2 != Long.MIN_VALUE) {
                j = Math.min(j, b2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: d */
    public boolean mo19100d(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long b = mo19098b();
            if (b != Long.MIN_VALUE) {
                boolean z2 = false;
                for (C3028z zVar : this.f5203e) {
                    long b2 = zVar.mo19098b();
                    boolean z3 = b2 != Long.MIN_VALUE && b2 <= j2;
                    if (b2 == b || z3) {
                        z2 |= zVar.mo19100d(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final long mo19102f() {
        long j = Long.MAX_VALUE;
        for (C3028z f : this.f5203e) {
            long f2 = f.mo19102f();
            if (f2 != Long.MIN_VALUE) {
                j = Math.min(j, f2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: g */
    public final void mo19103g(long j) {
        for (C3028z g : this.f5203e) {
            g.mo19103g(j);
        }
    }
}
