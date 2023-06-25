package p040c.p200q.p201a.p219b.p224f0.p232y;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3168q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;
import p040c.p200q.p201a.p219b.p261o0.C3174u;

/* renamed from: c.q.a.b.f0.y.o */
/* compiled from: H265Reader */
public final class C2801o implements C2794l {

    /* renamed from: a */
    public final C2816z f4247a;

    /* renamed from: b */
    public String f4248b;

    /* renamed from: c */
    public C2686q f4249c;

    /* renamed from: d */
    public C2802a f4250d;

    /* renamed from: e */
    public boolean f4251e;

    /* renamed from: f */
    public final boolean[] f4252f = new boolean[3];

    /* renamed from: g */
    public final C2806s f4253g = new C2806s(32, 128);

    /* renamed from: h */
    public final C2806s f4254h = new C2806s(33, 128);

    /* renamed from: i */
    public final C2806s f4255i = new C2806s(34, 128);

    /* renamed from: j */
    public final C2806s f4256j = new C2806s(39, 128);

    /* renamed from: k */
    public final C2806s f4257k = new C2806s(40, 128);

    /* renamed from: l */
    public long f4258l;

    /* renamed from: m */
    public long f4259m;

    /* renamed from: n */
    public final C3173t f4260n = new C3173t();

    /* renamed from: c.q.a.b.f0.y.o$a */
    /* compiled from: H265Reader */
    public static final class C2802a {

        /* renamed from: a */
        public final C2686q f4261a;

        /* renamed from: b */
        public long f4262b;

        /* renamed from: c */
        public boolean f4263c;

        /* renamed from: d */
        public int f4264d;

        /* renamed from: e */
        public long f4265e;

        /* renamed from: f */
        public boolean f4266f;

        /* renamed from: g */
        public boolean f4267g;

        /* renamed from: h */
        public boolean f4268h;

        /* renamed from: i */
        public boolean f4269i;

        /* renamed from: j */
        public boolean f4270j;

        /* renamed from: k */
        public long f4271k;

        /* renamed from: l */
        public long f4272l;

        /* renamed from: m */
        public boolean f4273m;

        public C2802a(C2686q qVar) {
            this.f4261a = qVar;
        }

        /* renamed from: a */
        public void mo18825a(long j, int i) {
            if (this.f4270j && this.f4267g) {
                this.f4273m = this.f4263c;
                this.f4270j = false;
            } else if (this.f4268h || this.f4267g) {
                if (this.f4269i) {
                    mo18826b(i + ((int) (j - this.f4262b)));
                }
                this.f4271k = this.f4262b;
                this.f4272l = this.f4265e;
                this.f4269i = true;
                this.f4273m = this.f4263c;
            }
        }

        /* renamed from: b */
        public final void mo18826b(int i) {
            boolean z = this.f4273m;
            int i2 = (int) (this.f4262b - this.f4271k);
            this.f4261a.mo18545c(this.f4272l, z ? 1 : 0, i2, i, (C2686q.C2687a) null);
        }

        /* renamed from: c */
        public void mo18827c(byte[] bArr, int i, int i2) {
            if (this.f4266f) {
                int i3 = this.f4264d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    this.f4267g = (bArr[i4] & ByteCompanionObject.MIN_VALUE) != 0;
                    this.f4266f = false;
                    return;
                }
                this.f4264d = i3 + (i2 - i);
            }
        }

        /* renamed from: d */
        public void mo18828d() {
            this.f4266f = false;
            this.f4267g = false;
            this.f4268h = false;
            this.f4269i = false;
            this.f4270j = false;
        }

        /* renamed from: e */
        public void mo18829e(long j, int i, int i2, long j2) {
            boolean z = false;
            this.f4267g = false;
            this.f4268h = false;
            this.f4265e = j2;
            this.f4264d = 0;
            this.f4262b = j;
            if (i2 >= 32) {
                if (!this.f4270j && this.f4269i) {
                    mo18826b(i);
                    this.f4269i = false;
                }
                if (i2 <= 34) {
                    this.f4268h = !this.f4270j;
                    this.f4270j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.f4263c = z2;
            if (z2 || i2 <= 9) {
                z = true;
            }
            this.f4266f = z;
        }
    }

    public C2801o(C2816z zVar) {
        this.f4247a = zVar;
    }

    /* renamed from: h */
    public static Format m5884h(String str, C2806s sVar, C2806s sVar2, C2806s sVar3) {
        float f;
        C2806s sVar4 = sVar;
        C2806s sVar5 = sVar2;
        C2806s sVar6 = sVar3;
        int i = sVar4.f4316e;
        byte[] bArr = new byte[(sVar5.f4316e + i + sVar6.f4316e)];
        System.arraycopy(sVar4.f4315d, 0, bArr, 0, i);
        System.arraycopy(sVar5.f4315d, 0, bArr, sVar4.f4316e, sVar5.f4316e);
        System.arraycopy(sVar6.f4315d, 0, bArr, sVar4.f4316e + sVar5.f4316e, sVar6.f4316e);
        C3174u uVar = new C3174u(sVar5.f4315d, 0, sVar5.f4316e);
        uVar.mo20045l(44);
        int e = uVar.mo20038e(3);
        uVar.mo20044k();
        uVar.mo20045l(88);
        uVar.mo20045l(8);
        int i2 = 0;
        for (int i3 = 0; i3 < e; i3++) {
            if (uVar.mo20037d()) {
                i2 += 89;
            }
            if (uVar.mo20037d()) {
                i2 += 8;
            }
        }
        uVar.mo20045l(i2);
        if (e > 0) {
            uVar.mo20045l((8 - e) * 2);
        }
        uVar.mo20041h();
        int h = uVar.mo20041h();
        if (h == 3) {
            uVar.mo20044k();
        }
        int h2 = uVar.mo20041h();
        int h3 = uVar.mo20041h();
        if (uVar.mo20037d()) {
            int h4 = uVar.mo20041h();
            int h5 = uVar.mo20041h();
            int h6 = uVar.mo20041h();
            int h7 = uVar.mo20041h();
            h2 -= ((h == 1 || h == 2) ? 2 : 1) * (h4 + h5);
            h3 -= (h == 1 ? 2 : 1) * (h6 + h7);
        }
        int i4 = h2;
        int i5 = h3;
        uVar.mo20041h();
        uVar.mo20041h();
        int h8 = uVar.mo20041h();
        for (int i6 = uVar.mo20037d() ? 0 : e; i6 <= e; i6++) {
            uVar.mo20041h();
            uVar.mo20041h();
            uVar.mo20041h();
        }
        uVar.mo20041h();
        uVar.mo20041h();
        uVar.mo20041h();
        uVar.mo20041h();
        uVar.mo20041h();
        uVar.mo20041h();
        if (uVar.mo20037d() && uVar.mo20037d()) {
            m5885i(uVar);
        }
        uVar.mo20045l(2);
        if (uVar.mo20037d()) {
            uVar.mo20045l(8);
            uVar.mo20041h();
            uVar.mo20041h();
            uVar.mo20044k();
        }
        m5886j(uVar);
        if (uVar.mo20037d()) {
            for (int i7 = 0; i7 < uVar.mo20041h(); i7++) {
                uVar.mo20045l(h8 + 4 + 1);
            }
        }
        uVar.mo20045l(2);
        float f2 = 1.0f;
        if (uVar.mo20037d() && uVar.mo20037d()) {
            int e2 = uVar.mo20038e(8);
            if (e2 == 255) {
                int e3 = uVar.mo20038e(16);
                int e4 = uVar.mo20038e(16);
                if (!(e3 == 0 || e4 == 0)) {
                    f2 = ((float) e3) / ((float) e4);
                }
            } else {
                float[] fArr = C3168q.f5854b;
                if (e2 < fArr.length) {
                    f = fArr[e2];
                    return Format.m10250x(str, "video/hevc", (String) null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, (DrmInitData) null);
                }
                C3163m.m7880f("H265Reader", "Unexpected aspect_ratio_idc value: " + e2);
            }
        }
        f = f2;
        return Format.m10250x(str, "video/hevc", (String) null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, (DrmInitData) null);
    }

    /* renamed from: i */
    public static void m5885i(C3174u uVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!uVar.mo20037d()) {
                    uVar.mo20041h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        uVar.mo20040g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        uVar.mo20040g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: j */
    public static void m5886j(C3174u uVar) {
        int h = uVar.mo20041h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            if (i2 != 0) {
                z = uVar.mo20037d();
            }
            if (z) {
                uVar.mo20044k();
                uVar.mo20041h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (uVar.mo20037d()) {
                        uVar.mo20044k();
                    }
                }
            } else {
                int h2 = uVar.mo20041h();
                int h3 = uVar.mo20041h();
                int i4 = h2 + h3;
                for (int i5 = 0; i5 < h2; i5++) {
                    uVar.mo20041h();
                    uVar.mo20044k();
                }
                for (int i6 = 0; i6 < h3; i6++) {
                    uVar.mo20041h();
                    uVar.mo20044k();
                }
                i = i4;
            }
        }
    }

    /* renamed from: a */
    public final void mo18822a(long j, int i, int i2, long j2) {
        if (this.f4251e) {
            this.f4250d.mo18825a(j, i);
        } else {
            this.f4253g.mo18841b(i2);
            this.f4254h.mo18841b(i2);
            this.f4255i.mo18841b(i2);
            if (this.f4253g.mo18842c() && this.f4254h.mo18842c() && this.f4255i.mo18842c()) {
                this.f4249c.mo18546d(m5884h(this.f4248b, this.f4253g, this.f4254h, this.f4255i));
                this.f4251e = true;
            }
        }
        if (this.f4256j.mo18841b(i2)) {
            C2806s sVar = this.f4256j;
            this.f4260n.mo20004J(this.f4256j.f4315d, C3168q.m7912k(sVar.f4315d, sVar.f4316e));
            this.f4260n.mo20007M(5);
            this.f4247a.mo18865a(j2, this.f4260n);
        }
        if (this.f4257k.mo18841b(i2)) {
            C2806s sVar2 = this.f4257k;
            this.f4260n.mo20004J(this.f4257k.f4315d, C3168q.m7912k(sVar2.f4315d, sVar2.f4316e));
            this.f4260n.mo20007M(5);
            this.f4247a.mo18865a(j2, this.f4260n);
        }
    }

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        C3173t tVar2 = tVar;
        while (tVar.mo20008a() > 0) {
            int c = tVar.mo20010c();
            int d = tVar.mo20011d();
            byte[] bArr = tVar2.f5877a;
            this.f4258l += (long) tVar.mo20008a();
            this.f4249c.mo18544b(tVar2, tVar.mo20008a());
            while (true) {
                if (c < d) {
                    int c2 = C3168q.m7904c(bArr, c, d, this.f4252f);
                    if (c2 == d) {
                        mo18823g(bArr, c, d);
                        return;
                    }
                    int e = C3168q.m7906e(bArr, c2);
                    int i = c2 - c;
                    if (i > 0) {
                        mo18823g(bArr, c, c2);
                    }
                    int i2 = d - c2;
                    long j = this.f4258l - ((long) i2);
                    int i3 = i < 0 ? -i : 0;
                    long j2 = j;
                    int i4 = i2;
                    mo18822a(j2, i4, i3, this.f4259m);
                    mo18824k(j2, i4, e, this.f4259m);
                    c = c2 + 3;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        C3168q.m7902a(this.f4252f);
        this.f4253g.mo18843d();
        this.f4254h.mo18843d();
        this.f4255i.mo18843d();
        this.f4256j.mo18843d();
        this.f4257k.mo18843d();
        this.f4250d.mo18828d();
        this.f4258l = 0;
    }

    /* renamed from: d */
    public void mo18768d() {
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        dVar.mo18761a();
        this.f4248b = dVar.mo18762b();
        C2686q a = iVar.mo18552a(dVar.mo18763c(), 2);
        this.f4249c = a;
        this.f4250d = new C2802a(a);
        this.f4247a.mo18866b(iVar, dVar);
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        this.f4259m = j;
    }

    /* renamed from: g */
    public final void mo18823g(byte[] bArr, int i, int i2) {
        if (this.f4251e) {
            this.f4250d.mo18827c(bArr, i, i2);
        } else {
            this.f4253g.mo18840a(bArr, i, i2);
            this.f4254h.mo18840a(bArr, i, i2);
            this.f4255i.mo18840a(bArr, i, i2);
        }
        this.f4256j.mo18840a(bArr, i, i2);
        this.f4257k.mo18840a(bArr, i, i2);
    }

    /* renamed from: k */
    public final void mo18824k(long j, int i, int i2, long j2) {
        if (this.f4251e) {
            this.f4250d.mo18829e(j, i, i2, j2);
        } else {
            this.f4253g.mo18844e(i2);
            this.f4254h.mo18844e(i2);
            this.f4255i.mo18844e(i2);
        }
        this.f4256j.mo18844e(i2);
        this.f4257k.mo18844e(i2);
    }
}
