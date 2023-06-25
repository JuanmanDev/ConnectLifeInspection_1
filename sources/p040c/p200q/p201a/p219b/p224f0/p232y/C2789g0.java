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

/* renamed from: c.q.a.b.f0.y.g0 */
/* compiled from: UserDataReader */
public final class C2789g0 {

    /* renamed from: a */
    public final List<Format> f4133a;

    /* renamed from: b */
    public final C2686q[] f4134b;

    public C2789g0(List<Format> list) {
        this.f4133a = list;
        this.f4134b = new C2686q[list.size()];
    }

    /* renamed from: a */
    public void mo18777a(long j, C3173t tVar) {
        if (tVar.mo20008a() >= 9) {
            int j2 = tVar.mo20017j();
            int j3 = tVar.mo20017j();
            int y = tVar.mo20032y();
            if (j2 == 434 && j3 == C3055g.f5442a && y == 3) {
                C3055g.m7298b(j, tVar, this.f4134b);
            }
        }
    }

    /* renamed from: b */
    public void mo18778b(C2676i iVar, C2781e0.C2785d dVar) {
        for (int i = 0; i < this.f4134b.length; i++) {
            dVar.mo18761a();
            C2686q a = iVar.mo18552a(dVar.mo18763c(), 3);
            Format format = this.f4133a.get(i);
            String str = format.f7566q;
            C3151e.m7754b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            a.mo18546d(Format.m10247u(dVar.mo18762b(), str, (String) null, -1, format.f7556I, format.f7557J, format.f7558K, (DrmInitData) null, Long.MAX_VALUE, format.f7568s));
            this.f4134b[i] = a;
        }
    }
}
