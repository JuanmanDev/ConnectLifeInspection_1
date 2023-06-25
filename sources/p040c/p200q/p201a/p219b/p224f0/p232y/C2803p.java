package p040c.p200q.p201a.p219b.p224f0.p232y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.p */
/* compiled from: Id3Reader */
public final class C2803p implements C2794l {

    /* renamed from: a */
    public final C3173t f4274a = new C3173t(10);

    /* renamed from: b */
    public C2686q f4275b;

    /* renamed from: c */
    public boolean f4276c;

    /* renamed from: d */
    public long f4277d;

    /* renamed from: e */
    public int f4278e;

    /* renamed from: f */
    public int f4279f;

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        if (this.f4276c) {
            int a = tVar.mo20008a();
            int i = this.f4279f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(tVar.f5877a, tVar.mo20010c(), this.f4274a.f5877a, this.f4279f, min);
                if (this.f4279f + min == 10) {
                    this.f4274a.mo20006L(0);
                    if (73 == this.f4274a.mo20032y() && 68 == this.f4274a.mo20032y() && 51 == this.f4274a.mo20032y()) {
                        this.f4274a.mo20007M(3);
                        this.f4278e = this.f4274a.mo20031x() + 10;
                    } else {
                        C3163m.m7880f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f4276c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f4278e - this.f4279f);
            this.f4275b.mo18544b(tVar, min2);
            this.f4279f += min2;
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        this.f4276c = false;
    }

    /* renamed from: d */
    public void mo18768d() {
        int i;
        if (this.f4276c && (i = this.f4278e) != 0 && this.f4279f == i) {
            this.f4275b.mo18545c(this.f4277d, 1, i, 0, (C2686q.C2687a) null);
            this.f4276c = false;
        }
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        dVar.mo18761a();
        C2686q a = iVar.mo18552a(dVar.mo18763c(), 4);
        this.f4275b = a;
        a.mo18546d(Format.m10242p(dVar.mo18762b(), "application/id3", (String) null, -1, (DrmInitData) null));
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        if ((i & 4) != 0) {
            this.f4276c = true;
            this.f4277d = j;
            this.f4278e = 0;
            this.f4279f = 0;
        }
    }
}
