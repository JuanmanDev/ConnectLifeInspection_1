package p040c.p200q.p201a.p219b.p241k0.p243c0;

import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.p224f0.C2671d;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.c0.n */
/* compiled from: SingleSampleMediaChunk */
public final class C2887n extends C2869a {

    /* renamed from: n */
    public final int f4621n;

    /* renamed from: o */
    public final Format f4622o;

    /* renamed from: p */
    public long f4623p;

    /* renamed from: q */
    public boolean f4624q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2887n(C3122h hVar, C3125j jVar, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(hVar, jVar, format, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f4621n = i2;
        this.f4622o = format2;
    }

    /* renamed from: a */
    public void mo19121a() {
    }

    /* renamed from: g */
    public boolean mo19123g() {
        return this.f4624q;
    }

    /* JADX INFO: finally extract failed */
    public void load() {
        try {
            long c = this.f4560h.mo19309c(this.f4553a.mo19893d(this.f4623p));
            if (c != -1) {
                c += this.f4623p;
            }
            C2671d dVar = new C2671d(this.f4560h, this.f4623p, c);
            C2871c i = mo19067i();
            i.mo19071c(0);
            C2686q a = i.mo19069a(0, this.f4621n);
            a.mo18546d(this.f4622o);
            for (int i2 = 0; i2 != -1; i2 = a.mo18543a(dVar, Integer.MAX_VALUE, true)) {
                this.f4623p += (long) i2;
            }
            a.mo18545c(this.f4558f, 1, (int) this.f4623p, 0, (C2686q.C2687a) null);
            C3152e0.m7805j(this.f4560h);
            this.f4624q = true;
        } catch (Throwable th) {
            C3152e0.m7805j(this.f4560h);
            throw th;
        }
    }
}
