package p040c.p200q.p201a.p219b.p224f0.p232y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2680m;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.r */
/* compiled from: MpegAudioReader */
public final class C2805r implements C2794l {

    /* renamed from: a */
    public final C3173t f4300a;

    /* renamed from: b */
    public final C2680m f4301b;

    /* renamed from: c */
    public final String f4302c;

    /* renamed from: d */
    public String f4303d;

    /* renamed from: e */
    public C2686q f4304e;

    /* renamed from: f */
    public int f4305f;

    /* renamed from: g */
    public int f4306g;

    /* renamed from: h */
    public boolean f4307h;

    /* renamed from: i */
    public boolean f4308i;

    /* renamed from: j */
    public long f4309j;

    /* renamed from: k */
    public int f4310k;

    /* renamed from: l */
    public long f4311l;

    public C2805r() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo18837a(C3173t tVar) {
        byte[] bArr = tVar.f5877a;
        int d = tVar.mo20011d();
        for (int c = tVar.mo20010c(); c < d; c++) {
            boolean z = (bArr[c] & 255) == 255;
            boolean z2 = this.f4308i && (bArr[c] & 224) == 224;
            this.f4308i = z;
            if (z2) {
                tVar.mo20006L(c + 1);
                this.f4308i = false;
                this.f4300a.f5877a[1] = bArr[c];
                this.f4306g = 2;
                this.f4305f = 1;
                return;
            }
        }
        tVar.mo20006L(d);
    }

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        while (tVar.mo20008a() > 0) {
            int i = this.f4305f;
            if (i == 0) {
                mo18837a(tVar);
            } else if (i == 1) {
                mo18839h(tVar);
            } else if (i == 2) {
                mo18838g(tVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        this.f4305f = 0;
        this.f4306g = 0;
        this.f4308i = false;
    }

    /* renamed from: d */
    public void mo18768d() {
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        dVar.mo18761a();
        this.f4303d = dVar.mo18762b();
        this.f4304e = iVar.mo18552a(dVar.mo18763c(), 1);
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        this.f4311l = j;
    }

    /* renamed from: g */
    public final void mo18838g(C3173t tVar) {
        int min = Math.min(tVar.mo20008a(), this.f4310k - this.f4306g);
        this.f4304e.mo18544b(tVar, min);
        int i = this.f4306g + min;
        this.f4306g = i;
        int i2 = this.f4310k;
        if (i >= i2) {
            this.f4304e.mo18545c(this.f4311l, 1, i2, 0, (C2686q.C2687a) null);
            this.f4311l += this.f4309j;
            this.f4306g = 0;
            this.f4305f = 0;
        }
    }

    /* renamed from: h */
    public final void mo18839h(C3173t tVar) {
        int min = Math.min(tVar.mo20008a(), 4 - this.f4306g);
        tVar.mo20015h(this.f4300a.f5877a, this.f4306g, min);
        int i = this.f4306g + min;
        this.f4306g = i;
        if (i >= 4) {
            this.f4300a.mo20006L(0);
            if (!C2680m.m5290b(this.f4300a.mo20017j(), this.f4301b)) {
                this.f4306g = 0;
                this.f4305f = 1;
                return;
            }
            C2680m mVar = this.f4301b;
            this.f4310k = mVar.f3438c;
            if (!this.f4307h) {
                long j = ((long) mVar.f3442g) * EventLoop_commonKt.MS_TO_NS;
                int i2 = mVar.f3439d;
                this.f4309j = j / ((long) i2);
                this.f4304e.mo18546d(Format.m10238l(this.f4303d, mVar.f3437b, (String) null, -1, 4096, mVar.f3440e, i2, (List<byte[]>) null, (DrmInitData) null, 0, this.f4302c));
                this.f4307h = true;
            }
            this.f4300a.mo20006L(0);
            this.f4304e.mo18544b(this.f4300a, 4);
            this.f4305f = 2;
        }
    }

    public C2805r(String str) {
        this.f4305f = 0;
        C3173t tVar = new C3173t(4);
        this.f4300a = tVar;
        tVar.f5877a[0] = -1;
        this.f4301b = new C2680m();
        this.f4302c = str;
    }
}
