package p040c.p200q.p201a.p219b.p241k0.p243c0;

import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.p224f0.C2671d;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.c0.i */
/* compiled from: ContainerMediaChunk */
public class C2881i extends C2869a {

    /* renamed from: t */
    public static final C2681n f4606t = new C2681n();

    /* renamed from: n */
    public final int f4607n;

    /* renamed from: o */
    public final long f4608o;

    /* renamed from: p */
    public final C2873e f4609p;

    /* renamed from: q */
    public long f4610q;

    /* renamed from: r */
    public volatile boolean f4611r;

    /* renamed from: s */
    public boolean f4612s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2881i(C3122h hVar, C3125j jVar, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, C2873e eVar) {
        super(hVar, jVar, format, i, obj, j, j2, j3, j4, j5);
        this.f4607n = i2;
        this.f4608o = j6;
        this.f4609p = eVar;
    }

    /* renamed from: a */
    public final void mo19121a() {
        this.f4611r = true;
    }

    /* renamed from: f */
    public long mo19122f() {
        return this.f4619i + ((long) this.f4607n);
    }

    /* renamed from: g */
    public boolean mo19123g() {
        return this.f4612s;
    }

    public final void load() {
        C2671d dVar;
        C3125j d = this.f4553a.mo19893d(this.f4610q);
        try {
            dVar = new C2671d(this.f4560h, d.f5723d, this.f4560h.mo19309c(d));
            if (this.f4610q == 0) {
                C2871c i = mo19067i();
                i.mo19071c(this.f4608o);
                C2873e eVar = this.f4609p;
                long j = -9223372036854775807L;
                long j2 = this.f4547j == -9223372036854775807L ? -9223372036854775807L : this.f4547j - this.f4608o;
                if (this.f4548k != -9223372036854775807L) {
                    j = this.f4548k - this.f4608o;
                }
                eVar.mo19078e(i, j2, j);
            }
            C2674g gVar = this.f4609p.f4561e;
            boolean z = false;
            int i2 = 0;
            while (i2 == 0 && !this.f4611r) {
                i2 = gVar.mo18548e(dVar, f4606t);
            }
            if (i2 != 1) {
                z = true;
            }
            C3151e.m7759g(z);
            this.f4610q = dVar.getPosition() - this.f4553a.f5723d;
            C3152e0.m7805j(this.f4560h);
            this.f4612s = true;
        } catch (Throwable th) {
            C3152e0.m7805j(this.f4560h);
            throw th;
        }
    }
}
