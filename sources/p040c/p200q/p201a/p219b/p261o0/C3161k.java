package p040c.p200q.p201a.p219b.p261o0;

import kotlinx.coroutines.EventLoop_commonKt;

/* renamed from: c.q.a.b.o0.k */
/* compiled from: FlacStreamInfo */
public final class C3161k {

    /* renamed from: a */
    public final int f5841a;

    /* renamed from: b */
    public final int f5842b;

    /* renamed from: c */
    public final int f5843c;

    /* renamed from: d */
    public final long f5844d;

    public C3161k(byte[] bArr, int i) {
        C3172s sVar = new C3172s(bArr);
        sVar.mo19991n(i * 8);
        sVar.mo19985h(16);
        sVar.mo19985h(16);
        sVar.mo19985h(24);
        sVar.mo19985h(24);
        this.f5841a = sVar.mo19985h(20);
        this.f5842b = sVar.mo19985h(3) + 1;
        this.f5843c = sVar.mo19985h(5) + 1;
        this.f5844d = ((((long) sVar.mo19985h(4)) & 15) << 32) | (((long) sVar.mo19985h(32)) & 4294967295L);
    }

    /* renamed from: a */
    public int mo19965a() {
        return this.f5843c * this.f5841a;
    }

    /* renamed from: b */
    public long mo19966b() {
        return (this.f5844d * EventLoop_commonKt.MS_TO_NS) / ((long) this.f5841a);
    }
}
