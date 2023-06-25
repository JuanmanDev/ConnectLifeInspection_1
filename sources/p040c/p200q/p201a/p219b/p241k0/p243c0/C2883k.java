package p040c.p200q.p201a.p219b.p241k0.p243c0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.p224f0.C2671d;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2873e;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.c0.k */
/* compiled from: InitializationChunk */
public final class C2883k extends C2872d {

    /* renamed from: l */
    public static final C2681n f4615l = new C2681n();

    /* renamed from: i */
    public final C2873e f4616i;

    /* renamed from: j */
    public long f4617j;

    /* renamed from: k */
    public volatile boolean f4618k;

    public C2883k(C3122h hVar, C3125j jVar, Format format, int i, @Nullable Object obj, C2873e eVar) {
        super(hVar, jVar, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f4616i = eVar;
    }

    /* renamed from: a */
    public void mo19121a() {
        this.f4618k = true;
    }

    public void load() {
        C2671d dVar;
        C3125j d = this.f4553a.mo19893d(this.f4617j);
        try {
            dVar = new C2671d(this.f4560h, d.f5723d, this.f4560h.mo19309c(d));
            if (this.f4617j == 0) {
                this.f4616i.mo19078e((C2873e.C2875b) null, -9223372036854775807L, -9223372036854775807L);
            }
            C2674g gVar = this.f4616i.f4561e;
            boolean z = false;
            int i = 0;
            while (i == 0 && !this.f4618k) {
                i = gVar.mo18548e(dVar, f4615l);
            }
            if (i != 1) {
                z = true;
            }
            C3151e.m7759g(z);
            this.f4617j = dVar.getPosition() - this.f4553a.f5723d;
            C3152e0.m7805j(this.f4560h);
        } catch (Throwable th) {
            C3152e0.m7805j(this.f4560h);
            throw th;
        }
    }
}
