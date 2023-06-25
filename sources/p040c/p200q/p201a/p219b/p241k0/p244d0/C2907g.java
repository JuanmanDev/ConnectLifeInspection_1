package p040c.p200q.p201a.p219b.p241k0.p244d0;

import p040c.p200q.p201a.p219b.p224f0.C2669b;
import p040c.p200q.p201a.p219b.p241k0.p244d0.p245k.C2925h;

/* renamed from: c.q.a.b.k0.d0.g */
/* compiled from: DashWrappingSegmentIndex */
public final class C2907g implements C2906f {

    /* renamed from: a */
    public final C2669b f4715a;

    /* renamed from: b */
    public final long f4716b;

    public C2907g(C2669b bVar, long j) {
        this.f4715a = bVar;
        this.f4716b = j;
    }

    /* renamed from: a */
    public long mo19188a(long j) {
        return this.f4715a.f3400e[(int) j] - this.f4716b;
    }

    /* renamed from: b */
    public long mo19189b(long j, long j2) {
        return this.f4715a.f3399d[(int) j];
    }

    /* renamed from: c */
    public C2925h mo19190c(long j) {
        C2669b bVar = this.f4715a;
        int i = (int) j;
        return new C2925h((String) null, bVar.f3398c[i], (long) bVar.f3397b[i]);
    }

    /* renamed from: d */
    public long mo19191d(long j, long j2) {
        return (long) this.f4715a.mo18518b(j + this.f4716b);
    }

    /* renamed from: e */
    public boolean mo19192e() {
        return true;
    }

    /* renamed from: f */
    public long mo19193f() {
        return 0;
    }

    /* renamed from: g */
    public int mo19194g(long j) {
        return this.f4715a.f3396a;
    }
}
