package p040c.p200q.p201a.p219b.p224f0.p232y;

import android.util.Pair;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Arrays;
import java.util.Collections;
import p040c.p200q.p201a.p219b.p224f0.C2673f;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3155g;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.h */
/* compiled from: AdtsReader */
public final class C2790h implements C2794l {

    /* renamed from: v */
    public static final byte[] f4135v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f4136a;

    /* renamed from: b */
    public final C3172s f4137b;

    /* renamed from: c */
    public final C3173t f4138c;

    /* renamed from: d */
    public final String f4139d;

    /* renamed from: e */
    public String f4140e;

    /* renamed from: f */
    public C2686q f4141f;

    /* renamed from: g */
    public C2686q f4142g;

    /* renamed from: h */
    public int f4143h;

    /* renamed from: i */
    public int f4144i;

    /* renamed from: j */
    public int f4145j;

    /* renamed from: k */
    public boolean f4146k;

    /* renamed from: l */
    public boolean f4147l;

    /* renamed from: m */
    public int f4148m;

    /* renamed from: n */
    public int f4149n;

    /* renamed from: o */
    public int f4150o;

    /* renamed from: p */
    public boolean f4151p;

    /* renamed from: q */
    public long f4152q;

    /* renamed from: r */
    public int f4153r;

    /* renamed from: s */
    public long f4154s;

    /* renamed from: t */
    public C2686q f4155t;

    /* renamed from: u */
    public long f4156u;

    public C2790h(boolean z) {
        this(z, (String) null);
    }

    /* renamed from: l */
    public static boolean m5806l(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: a */
    public final void mo18779a(C3173t tVar) {
        if (tVar.mo20008a() != 0) {
            this.f4137b.f5873a[0] = tVar.f5877a[tVar.mo20010c()];
            this.f4137b.mo19991n(2);
            int h = this.f4137b.mo19985h(4);
            int i = this.f4149n;
            if (i == -1 || h == i) {
                if (!this.f4147l) {
                    this.f4147l = true;
                    this.f4148m = this.f4150o;
                    this.f4149n = h;
                }
                mo18791s();
                return;
            }
            mo18788p();
        }
    }

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        while (tVar.mo20008a() > 0) {
            int i = this.f4143h;
            if (i == 0) {
                mo18782i(tVar);
            } else if (i == 1) {
                mo18779a(tVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (mo18781h(tVar, this.f4137b.f5873a, this.f4146k ? 7 : 5)) {
                        mo18785m();
                    }
                } else if (i == 4) {
                    mo18787o(tVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (mo18781h(tVar, this.f4138c.f5877a, 10)) {
                mo18786n();
            }
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        mo18788p();
    }

    /* renamed from: d */
    public void mo18768d() {
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        dVar.mo18761a();
        this.f4140e = dVar.mo18762b();
        this.f4141f = iVar.mo18552a(dVar.mo18763c(), 1);
        if (this.f4136a) {
            dVar.mo18761a();
            C2686q a = iVar.mo18552a(dVar.mo18763c(), 4);
            this.f4142g = a;
            a.mo18546d(Format.m10242p(dVar.mo18762b(), "application/id3", (String) null, -1, (DrmInitData) null));
            return;
        }
        this.f4142g = new C2673f();
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        this.f4154s = j;
    }

    /* renamed from: g */
    public final boolean mo18780g(C3173t tVar, int i) {
        tVar.mo20006L(i + 1);
        if (!mo18794v(tVar, this.f4137b.f5873a, 1)) {
            return false;
        }
        this.f4137b.mo19991n(4);
        int h = this.f4137b.mo19985h(1);
        int i2 = this.f4148m;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.f4149n != -1) {
            if (!mo18794v(tVar, this.f4137b.f5873a, 1)) {
                return true;
            }
            this.f4137b.mo19991n(2);
            if (this.f4137b.mo19985h(4) != this.f4149n) {
                return false;
            }
            tVar.mo20006L(i + 2);
        }
        if (!mo18794v(tVar, this.f4137b.f5873a, 4)) {
            return true;
        }
        this.f4137b.mo19991n(14);
        int h2 = this.f4137b.mo19985h(13);
        if (h2 <= 6) {
            return false;
        }
        int i3 = i + h2;
        int i4 = i3 + 1;
        if (i4 >= tVar.mo20011d()) {
            return true;
        }
        byte[] bArr = tVar.f5877a;
        if (!mo18784k(bArr[i3], bArr[i4]) || (this.f4148m != -1 && ((tVar.f5877a[i4] & 8) >> 3) != h)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo18781h(C3173t tVar, byte[] bArr, int i) {
        int min = Math.min(tVar.mo20008a(), i - this.f4144i);
        tVar.mo20015h(bArr, this.f4144i, min);
        int i2 = this.f4144i + min;
        this.f4144i = i2;
        return i2 == i;
    }

    /* renamed from: i */
    public final void mo18782i(C3173t tVar) {
        byte[] bArr = tVar.f5877a;
        int c = tVar.mo20010c();
        int d = tVar.mo20011d();
        while (c < d) {
            int i = c + 1;
            byte b = bArr[c] & 255;
            if (this.f4145j != 512 || !mo18784k((byte) -1, (byte) b) || (!this.f4147l && !mo18780g(tVar, i - 2))) {
                int i2 = this.f4145j;
                byte b2 = b | i2;
                if (b2 == 329) {
                    this.f4145j = 768;
                } else if (b2 == 511) {
                    this.f4145j = 512;
                } else if (b2 == 836) {
                    this.f4145j = 1024;
                } else if (b2 == 1075) {
                    mo18792t();
                    tVar.mo20006L(i);
                    return;
                } else if (i2 != 256) {
                    this.f4145j = 256;
                    i--;
                }
                c = i;
            } else {
                this.f4150o = (b & 8) >> 3;
                boolean z = true;
                if ((b & 1) != 0) {
                    z = false;
                }
                this.f4146k = z;
                if (!this.f4147l) {
                    mo18789q();
                } else {
                    mo18791s();
                }
                tVar.mo20006L(i);
                return;
            }
        }
        tVar.mo20006L(c);
    }

    /* renamed from: j */
    public long mo18783j() {
        return this.f4152q;
    }

    /* renamed from: k */
    public final boolean mo18784k(byte b, byte b2) {
        return m5806l(((b & 255) << 8) | (b2 & 255));
    }

    /* renamed from: m */
    public final void mo18785m() {
        this.f4137b.mo19991n(0);
        if (!this.f4151p) {
            int h = this.f4137b.mo19985h(2) + 1;
            if (h != 2) {
                C3163m.m7880f("AdtsReader", "Detected audio object type: " + h + ", but assuming AAC LC.");
                h = 2;
            }
            this.f4137b.mo19993p(5);
            byte[] a = C3155g.m7838a(h, this.f4149n, this.f4137b.mo19985h(3));
            Pair<Integer, Integer> j = C3155g.m7847j(a);
            Format l = Format.m10238l(this.f4140e, VideoCapture.AUDIO_MIME_TYPE, (String) null, -1, -1, ((Integer) j.second).intValue(), ((Integer) j.first).intValue(), Collections.singletonList(a), (DrmInitData) null, 0, this.f4139d);
            this.f4152q = 1024000000 / ((long) l.f7552E);
            this.f4141f.mo18546d(l);
            this.f4151p = true;
        } else {
            this.f4137b.mo19993p(10);
        }
        this.f4137b.mo19993p(4);
        int h2 = (this.f4137b.mo19985h(13) - 2) - 5;
        if (this.f4146k) {
            h2 -= 2;
        }
        mo18793u(this.f4141f, this.f4152q, 0, h2);
    }

    /* renamed from: n */
    public final void mo18786n() {
        this.f4142g.mo18544b(this.f4138c, 10);
        this.f4138c.mo20006L(6);
        mo18793u(this.f4142g, 0, 10, this.f4138c.mo20031x() + 10);
    }

    /* renamed from: o */
    public final void mo18787o(C3173t tVar) {
        int min = Math.min(tVar.mo20008a(), this.f4153r - this.f4144i);
        this.f4155t.mo18544b(tVar, min);
        int i = this.f4144i + min;
        this.f4144i = i;
        int i2 = this.f4153r;
        if (i == i2) {
            this.f4155t.mo18545c(this.f4154s, 1, i2, 0, (C2686q.C2687a) null);
            this.f4154s += this.f4156u;
            mo18790r();
        }
    }

    /* renamed from: p */
    public final void mo18788p() {
        this.f4147l = false;
        mo18790r();
    }

    /* renamed from: q */
    public final void mo18789q() {
        this.f4143h = 1;
        this.f4144i = 0;
    }

    /* renamed from: r */
    public final void mo18790r() {
        this.f4143h = 0;
        this.f4144i = 0;
        this.f4145j = 256;
    }

    /* renamed from: s */
    public final void mo18791s() {
        this.f4143h = 3;
        this.f4144i = 0;
    }

    /* renamed from: t */
    public final void mo18792t() {
        this.f4143h = 2;
        this.f4144i = f4135v.length;
        this.f4153r = 0;
        this.f4138c.mo20006L(0);
    }

    /* renamed from: u */
    public final void mo18793u(C2686q qVar, long j, int i, int i2) {
        this.f4143h = 4;
        this.f4144i = i;
        this.f4155t = qVar;
        this.f4156u = j;
        this.f4153r = i2;
    }

    /* renamed from: v */
    public final boolean mo18794v(C3173t tVar, byte[] bArr, int i) {
        if (tVar.mo20008a() < i) {
            return false;
        }
        tVar.mo20015h(bArr, 0, i);
        return true;
    }

    public C2790h(boolean z, String str) {
        this.f4137b = new C3172s(new byte[7]);
        this.f4138c = new C3173t(Arrays.copyOf(f4135v, 10));
        mo18790r();
        this.f4148m = -1;
        this.f4149n = -1;
        this.f4152q = -9223372036854775807L;
        this.f4136a = z;
        this.f4139d = str;
    }
}
