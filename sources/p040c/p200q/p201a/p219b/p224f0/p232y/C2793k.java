package p040c.p200q.p201a.p219b.p224f0.p232y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.k */
/* compiled from: DvbSubtitleReader */
public final class C2793k implements C2794l {

    /* renamed from: a */
    public final List<C2781e0.C2782a> f4170a;

    /* renamed from: b */
    public final C2686q[] f4171b;

    /* renamed from: c */
    public boolean f4172c;

    /* renamed from: d */
    public int f4173d;

    /* renamed from: e */
    public int f4174e;

    /* renamed from: f */
    public long f4175f;

    public C2793k(List<C2781e0.C2782a> list) {
        this.f4170a = list;
        this.f4171b = new C2686q[list.size()];
    }

    /* renamed from: a */
    public final boolean mo18802a(C3173t tVar, int i) {
        if (tVar.mo20008a() == 0) {
            return false;
        }
        if (tVar.mo20032y() != i) {
            this.f4172c = false;
        }
        this.f4173d--;
        return this.f4172c;
    }

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        if (!this.f4172c) {
            return;
        }
        if (this.f4173d != 2 || mo18802a(tVar, 32)) {
            if (this.f4173d != 1 || mo18802a(tVar, 0)) {
                int c = tVar.mo20010c();
                int a = tVar.mo20008a();
                for (C2686q b : this.f4171b) {
                    tVar.mo20006L(c);
                    b.mo18544b(tVar, a);
                }
                this.f4174e += a;
            }
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        this.f4172c = false;
    }

    /* renamed from: d */
    public void mo18768d() {
        if (this.f4172c) {
            for (C2686q c : this.f4171b) {
                c.mo18545c(this.f4175f, 1, this.f4174e, 0, (C2686q.C2687a) null);
            }
            this.f4172c = false;
        }
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        for (int i = 0; i < this.f4171b.length; i++) {
            C2781e0.C2782a aVar = this.f4170a.get(i);
            dVar.mo18761a();
            C2686q a = iVar.mo18552a(dVar.mo18763c(), 3);
            a.mo18546d(Format.m10240n(dVar.mo18762b(), "application/dvbsubs", (String) null, -1, 0, Collections.singletonList(aVar.f4097b), aVar.f4096a, (DrmInitData) null));
            this.f4171b[i] = a;
        }
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        if ((i & 4) != 0) {
            this.f4172c = true;
            this.f4175f = j;
            this.f4174e = 0;
            this.f4173d = 2;
        }
    }
}
