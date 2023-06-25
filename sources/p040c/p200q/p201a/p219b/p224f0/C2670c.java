package p040c.p200q.p201a.p219b.p224f0;

import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.f0.c */
/* compiled from: ConstantBitrateSeekMap */
public class C2670c implements C2682o {

    /* renamed from: a */
    public final long f3402a;

    /* renamed from: b */
    public final long f3403b;

    /* renamed from: c */
    public final int f3404c;

    /* renamed from: d */
    public final long f3405d;

    /* renamed from: e */
    public final int f3406e;

    /* renamed from: f */
    public final long f3407f;

    public C2670c(long j, long j2, int i, int i2) {
        this.f3402a = j;
        this.f3403b = j2;
        this.f3404c = i2 == -1 ? 1 : i2;
        this.f3406e = i;
        if (j == -1) {
            this.f3405d = -1;
            this.f3407f = -9223372036854775807L;
            return;
        }
        this.f3405d = j - j2;
        this.f3407f = m5240f(j, j2, i);
    }

    /* renamed from: f */
    public static long m5240f(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * EventLoop_commonKt.MS_TO_NS) / ((long) i);
    }

    /* renamed from: b */
    public final long mo18520b(long j) {
        int i = this.f3404c;
        return this.f3403b + C3152e0.m7815o((((j * ((long) this.f3406e)) / 8000000) / ((long) i)) * ((long) i), 0, this.f3405d - ((long) i));
    }

    /* renamed from: d */
    public boolean mo18503d() {
        return this.f3405d != -1;
    }

    /* renamed from: e */
    public long mo18521e(long j) {
        return m5240f(j, this.f3403b, this.f3406e);
    }

    /* renamed from: h */
    public C2682o.C2683a mo18504h(long j) {
        if (this.f3405d == -1) {
            return new C2682o.C2683a(new C2685p(0, this.f3403b));
        }
        long b = mo18520b(j);
        long e = mo18521e(b);
        C2685p pVar = new C2685p(e, b);
        if (e < j) {
            int i = this.f3404c;
            if (((long) i) + b < this.f3402a) {
                long j2 = b + ((long) i);
                return new C2682o.C2683a(pVar, new C2685p(mo18521e(j2), j2));
            }
        }
        return new C2682o.C2683a(pVar);
    }

    /* renamed from: i */
    public long mo18505i() {
        return this.f3407f;
    }
}
