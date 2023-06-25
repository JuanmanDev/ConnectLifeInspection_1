package p040c.p200q.p201a.p219b.p224f0.p233z;

import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2685p;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.f0.z.c */
/* compiled from: WavHeader */
public final class C2819c implements C2682o {

    /* renamed from: a */
    public final int f4372a;

    /* renamed from: b */
    public final int f4373b;

    /* renamed from: c */
    public final int f4374c;

    /* renamed from: d */
    public final int f4375d;

    /* renamed from: e */
    public final int f4376e;

    /* renamed from: f */
    public final int f4377f;

    /* renamed from: g */
    public long f4378g;

    /* renamed from: h */
    public long f4379h;

    public C2819c(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f4372a = i;
        this.f4373b = i2;
        this.f4374c = i3;
        this.f4375d = i4;
        this.f4376e = i5;
        this.f4377f = i6;
    }

    /* renamed from: a */
    public long mo18867a(long j) {
        return (Math.max(0, j - this.f4378g) * EventLoop_commonKt.MS_TO_NS) / ((long) this.f4374c);
    }

    /* renamed from: b */
    public int mo18868b() {
        return this.f4373b * this.f4376e * this.f4372a;
    }

    /* renamed from: d */
    public boolean mo18503d() {
        return true;
    }

    /* renamed from: e */
    public int mo18869e() {
        return this.f4375d;
    }

    /* renamed from: f */
    public long mo18870f() {
        if (mo18874l()) {
            return this.f4378g + this.f4379h;
        }
        return -1;
    }

    /* renamed from: g */
    public int mo18871g() {
        return this.f4377f;
    }

    /* renamed from: h */
    public C2682o.C2683a mo18504h(long j) {
        long j2 = (((long) this.f4374c) * j) / EventLoop_commonKt.MS_TO_NS;
        int i = this.f4375d;
        long o = C3152e0.m7815o((j2 / ((long) i)) * ((long) i), 0, this.f4379h - ((long) i));
        long j3 = this.f4378g + o;
        long a = mo18867a(j3);
        C2685p pVar = new C2685p(a, j3);
        if (a < j) {
            long j4 = this.f4379h;
            int i2 = this.f4375d;
            if (o != j4 - ((long) i2)) {
                long j5 = j3 + ((long) i2);
                return new C2682o.C2683a(pVar, new C2685p(mo18867a(j5), j5));
            }
        }
        return new C2682o.C2683a(pVar);
    }

    /* renamed from: i */
    public long mo18505i() {
        return ((this.f4379h / ((long) this.f4375d)) * EventLoop_commonKt.MS_TO_NS) / ((long) this.f4373b);
    }

    /* renamed from: j */
    public int mo18872j() {
        return this.f4372a;
    }

    /* renamed from: k */
    public int mo18873k() {
        return this.f4373b;
    }

    /* renamed from: l */
    public boolean mo18874l() {
        return (this.f4378g == 0 || this.f4379h == 0) ? false : true;
    }

    /* renamed from: m */
    public void mo18875m(long j, long j2) {
        this.f4378g = j;
        this.f4379h = j2;
    }
}
