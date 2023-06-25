package p040c.p200q.p201a.p219b.p224f0.p232y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p250l0.p251k.C3055g;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.z */
/* compiled from: SeiReader */
public final class C2816z {

    /* renamed from: a */
    public final List<Format> f4364a;

    /* renamed from: b */
    public final C2686q[] f4365b;

    public C2816z(List<Format> list) {
        this.f4364a = list;
        this.f4365b = new C2686q[list.size()];
    }

    /* renamed from: a */
    public void mo18865a(long j, C3173t tVar) {
        C3055g.m7297a(j, tVar, this.f4365b);
    }

    /* renamed from: b */
    public void mo18866b(C2676i iVar, C2781e0.C2785d dVar) {
        for (int i = 0; i < this.f4365b.length; i++) {
            dVar.mo18761a();
            C2686q a = iVar.mo18552a(dVar.mo18763c(), 3);
            Format format = this.f4364a.get(i);
            String str = format.f7566q;
            C3151e.m7754b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = format.f7560e;
            if (str2 == null) {
                str2 = dVar.mo18762b();
            }
            a.mo18546d(Format.m10247u(str2, str, (String) null, -1, format.f7556I, format.f7557J, format.f7558K, (DrmInitData) null, Long.MAX_VALUE, format.f7568s));
            this.f4365b[i] = a;
        }
    }
}
