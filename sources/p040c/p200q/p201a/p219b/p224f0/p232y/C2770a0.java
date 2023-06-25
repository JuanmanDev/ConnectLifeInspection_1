package p040c.p200q.p201a.p219b.p224f0.p232y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.a0 */
/* compiled from: SpliceInfoSectionReader */
public final class C2770a0 implements C2814x {

    /* renamed from: a */
    public C3146b0 f4046a;

    /* renamed from: b */
    public C2686q f4047b;

    /* renamed from: c */
    public boolean f4048c;

    /* renamed from: a */
    public void mo18738a(C3146b0 b0Var, C2676i iVar, C2781e0.C2785d dVar) {
        this.f4046a = b0Var;
        dVar.mo18761a();
        C2686q a = iVar.mo18552a(dVar.mo18763c(), 4);
        this.f4047b = a;
        a.mo18546d(Format.m10242p(dVar.mo18762b(), "application/x-scte35", (String) null, -1, (DrmInitData) null));
    }

    /* renamed from: b */
    public void mo18739b(C3173t tVar) {
        if (!this.f4048c) {
            if (this.f4046a.mo19947e() != -9223372036854775807L) {
                this.f4047b.mo18546d(Format.m10241o((String) null, "application/x-scte35", this.f4046a.mo19947e()));
                this.f4048c = true;
            } else {
                return;
            }
        }
        int a = tVar.mo20008a();
        this.f4047b.mo18544b(tVar, a);
        this.f4047b.mo18545c(this.f4046a.mo19946d(), 1, a, 0, (C2686q.C2687a) null);
    }
}
