package p040c.p200q.p201a.p219b.p241k0.p246e0;

import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p241k0.C3027y;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.e0.m */
/* compiled from: HlsSampleStream */
public final class C2958m implements C3027y {

    /* renamed from: e */
    public final int f4939e;

    /* renamed from: l */
    public final C2959n f4940l;

    /* renamed from: m */
    public int f4941m = -1;

    public C2958m(C2959n nVar, int i) {
        this.f4940l = nVar;
        this.f4939e = i;
    }

    /* renamed from: a */
    public void mo19097a() {
        if (this.f4941m != -2) {
            this.f4940l.mo19366J();
            return;
        }
        throw new SampleQueueMappingException(this.f4940l.mo19386r().mo24210a(this.f4939e).mo24200a(0).f7566q);
    }

    /* renamed from: b */
    public void mo19357b() {
        C3151e.m7753a(this.f4941m == -1);
        this.f4941m = this.f4940l.mo19388u(this.f4939e);
    }

    /* renamed from: c */
    public boolean mo19099c() {
        return this.f4941m == -3 || (mo19358d() && this.f4940l.mo19363G(this.f4941m));
    }

    /* renamed from: d */
    public final boolean mo19358d() {
        int i = this.f4941m;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* renamed from: e */
    public void mo19359e() {
        if (this.f4941m != -1) {
            this.f4940l.mo19382Z(this.f4939e);
            this.f4941m = -1;
        }
    }

    /* renamed from: i */
    public int mo19105i(C3030l lVar, C2634e eVar, boolean z) {
        if (this.f4941m == -3) {
            eVar.mo18385h(4);
            return -4;
        } else if (mo19358d()) {
            return this.f4940l.mo19373Q(this.f4941m, lVar, eVar, z);
        } else {
            return -3;
        }
    }

    /* renamed from: o */
    public int mo19108o(long j) {
        if (mo19358d()) {
            return this.f4940l.mo19381Y(this.f4941m, j);
        }
        return 0;
    }
}
