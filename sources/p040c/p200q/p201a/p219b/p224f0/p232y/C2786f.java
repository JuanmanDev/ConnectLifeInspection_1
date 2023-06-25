package p040c.p200q.p201a.p219b.p224f0.p232y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p221c0.C2596g;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.f */
/* compiled from: Ac3Reader */
public final class C2786f implements C2794l {

    /* renamed from: a */
    public final C3172s f4107a;

    /* renamed from: b */
    public final C3173t f4108b;

    /* renamed from: c */
    public final String f4109c;

    /* renamed from: d */
    public String f4110d;

    /* renamed from: e */
    public C2686q f4111e;

    /* renamed from: f */
    public int f4112f;

    /* renamed from: g */
    public int f4113g;

    /* renamed from: h */
    public boolean f4114h;

    /* renamed from: i */
    public long f4115i;

    /* renamed from: j */
    public Format f4116j;

    /* renamed from: k */
    public int f4117k;

    /* renamed from: l */
    public long f4118l;

    public C2786f() {
        this((String) null);
    }

    /* renamed from: a */
    public final boolean mo18765a(C3173t tVar, byte[] bArr, int i) {
        int min = Math.min(tVar.mo20008a(), i - this.f4113g);
        tVar.mo20015h(bArr, this.f4113g, min);
        int i2 = this.f4113g + min;
        this.f4113g = i2;
        return i2 == i;
    }

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        while (tVar.mo20008a() > 0) {
            int i = this.f4112f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(tVar.mo20008a(), this.f4117k - this.f4113g);
                        this.f4111e.mo18544b(tVar, min);
                        int i2 = this.f4113g + min;
                        this.f4113g = i2;
                        int i3 = this.f4117k;
                        if (i2 == i3) {
                            this.f4111e.mo18545c(this.f4118l, 1, i3, 0, (C2686q.C2687a) null);
                            this.f4118l += this.f4115i;
                            this.f4112f = 0;
                        }
                    }
                } else if (mo18765a(tVar, this.f4108b.f5877a, 128)) {
                    mo18771g();
                    this.f4108b.mo20006L(0);
                    this.f4111e.mo18544b(this.f4108b, 128);
                    this.f4112f = 2;
                }
            } else if (mo18772h(tVar)) {
                this.f4112f = 1;
                byte[] bArr = this.f4108b.f5877a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.f4113g = 2;
            }
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        this.f4112f = 0;
        this.f4113g = 0;
        this.f4114h = false;
    }

    /* renamed from: d */
    public void mo18768d() {
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        dVar.mo18761a();
        this.f4110d = dVar.mo18762b();
        this.f4111e = iVar.mo18552a(dVar.mo18763c(), 1);
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        this.f4118l = j;
    }

    /* renamed from: g */
    public final void mo18771g() {
        this.f4107a.mo19991n(0);
        C2596g.C2598b e = C2596g.m4818e(this.f4107a);
        Format format = this.f4116j;
        if (!(format != null && e.f3106c == format.f7551D && e.f3105b == format.f7552E && e.f3104a == format.f7566q)) {
            Format l = Format.m10238l(this.f4110d, e.f3104a, (String) null, -1, -1, e.f3106c, e.f3105b, (List<byte[]>) null, (DrmInitData) null, 0, this.f4109c);
            this.f4116j = l;
            this.f4111e.mo18546d(l);
        }
        this.f4117k = e.f3107d;
        this.f4115i = (((long) e.f3108e) * EventLoop_commonKt.MS_TO_NS) / ((long) this.f4116j.f7552E);
    }

    /* renamed from: h */
    public final boolean mo18772h(C3173t tVar) {
        while (true) {
            boolean z = false;
            if (tVar.mo20008a() <= 0) {
                return false;
            }
            if (!this.f4114h) {
                if (tVar.mo20032y() == 11) {
                    z = true;
                }
                this.f4114h = z;
            } else {
                int y = tVar.mo20032y();
                if (y == 119) {
                    this.f4114h = false;
                    return true;
                }
                if (y == 11) {
                    z = true;
                }
                this.f4114h = z;
            }
        }
    }

    public C2786f(String str) {
        C3172s sVar = new C3172s(new byte[128]);
        this.f4107a = sVar;
        this.f4108b = new C3173t(sVar.f5873a);
        this.f4112f = 0;
        this.f4109c = str;
    }
}
