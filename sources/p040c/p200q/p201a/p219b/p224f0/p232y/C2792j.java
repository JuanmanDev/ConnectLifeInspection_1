package p040c.p200q.p201a.p219b.p224f0.p232y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p221c0.C2616q;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.j */
/* compiled from: DtsReader */
public final class C2792j implements C2794l {

    /* renamed from: a */
    public final C3173t f4159a = new C3173t(new byte[18]);

    /* renamed from: b */
    public final String f4160b;

    /* renamed from: c */
    public String f4161c;

    /* renamed from: d */
    public C2686q f4162d;

    /* renamed from: e */
    public int f4163e = 0;

    /* renamed from: f */
    public int f4164f;

    /* renamed from: g */
    public int f4165g;

    /* renamed from: h */
    public long f4166h;

    /* renamed from: i */
    public Format f4167i;

    /* renamed from: j */
    public int f4168j;

    /* renamed from: k */
    public long f4169k;

    public C2792j(String str) {
        this.f4160b = str;
    }

    /* renamed from: a */
    public final boolean mo18799a(C3173t tVar, byte[] bArr, int i) {
        int min = Math.min(tVar.mo20008a(), i - this.f4164f);
        tVar.mo20015h(bArr, this.f4164f, min);
        int i2 = this.f4164f + min;
        this.f4164f = i2;
        return i2 == i;
    }

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        while (tVar.mo20008a() > 0) {
            int i = this.f4163e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(tVar.mo20008a(), this.f4168j - this.f4164f);
                        this.f4162d.mo18544b(tVar, min);
                        int i2 = this.f4164f + min;
                        this.f4164f = i2;
                        int i3 = this.f4168j;
                        if (i2 == i3) {
                            this.f4162d.mo18545c(this.f4169k, 1, i3, 0, (C2686q.C2687a) null);
                            this.f4169k += this.f4166h;
                            this.f4163e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (mo18799a(tVar, this.f4159a.f5877a, 18)) {
                    mo18800g();
                    this.f4159a.mo20006L(0);
                    this.f4162d.mo18544b(this.f4159a, 18);
                    this.f4163e = 2;
                }
            } else if (mo18801h(tVar)) {
                this.f4163e = 1;
            }
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        this.f4163e = 0;
        this.f4164f = 0;
        this.f4165g = 0;
    }

    /* renamed from: d */
    public void mo18768d() {
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        dVar.mo18761a();
        this.f4161c = dVar.mo18762b();
        this.f4162d = iVar.mo18552a(dVar.mo18763c(), 1);
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        this.f4169k = j;
    }

    /* renamed from: g */
    public final void mo18800g() {
        byte[] bArr = this.f4159a.f5877a;
        if (this.f4167i == null) {
            Format g = C2616q.m4929g(bArr, this.f4161c, this.f4160b, (DrmInitData) null);
            this.f4167i = g;
            this.f4162d.mo18546d(g);
        }
        this.f4168j = C2616q.m4923a(bArr);
        this.f4166h = (long) ((int) ((((long) C2616q.m4928f(bArr)) * EventLoop_commonKt.MS_TO_NS) / ((long) this.f4167i.f7552E)));
    }

    /* renamed from: h */
    public final boolean mo18801h(C3173t tVar) {
        while (tVar.mo20008a() > 0) {
            int i = this.f4165g << 8;
            this.f4165g = i;
            int y = i | tVar.mo20032y();
            this.f4165g = y;
            if (C2616q.m4926d(y)) {
                byte[] bArr = this.f4159a.f5877a;
                int i2 = this.f4165g;
                bArr[0] = (byte) ((i2 >> 24) & 255);
                bArr[1] = (byte) ((i2 >> 16) & 255);
                bArr[2] = (byte) ((i2 >> 8) & 255);
                bArr[3] = (byte) (i2 & 255);
                this.f4164f = 4;
                this.f4165g = 0;
                return true;
            }
        }
        return false;
    }
}
