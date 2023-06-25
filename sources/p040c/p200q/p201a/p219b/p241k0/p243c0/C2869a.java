package p040c.p200q.p201a.p219b.p241k0.p243c0;

import com.google.android.exoplayer2.Format;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;

/* renamed from: c.q.a.b.k0.c0.a */
/* compiled from: BaseMediaChunk */
public abstract class C2869a extends C2884l {

    /* renamed from: j */
    public final long f4547j;

    /* renamed from: k */
    public final long f4548k;

    /* renamed from: l */
    public C2871c f4549l;

    /* renamed from: m */
    public int[] f4550m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2869a(C3122h hVar, C3125j jVar, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(hVar, jVar, format, i, obj, j, j2, j5);
        this.f4547j = j3;
        this.f4548k = j4;
    }

    /* renamed from: h */
    public final int mo19066h(int i) {
        return this.f4550m[i];
    }

    /* renamed from: i */
    public final C2871c mo19067i() {
        return this.f4549l;
    }

    /* renamed from: j */
    public void mo19068j(C2871c cVar) {
        this.f4549l = cVar;
        this.f4550m = cVar.mo19070b();
    }
}
