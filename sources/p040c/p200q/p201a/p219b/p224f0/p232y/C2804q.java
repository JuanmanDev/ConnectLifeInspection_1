package p040c.p200q.p201a.p219b.p224f0.p232y;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3155g;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.q */
/* compiled from: LatmReader */
public final class C2804q implements C2794l {

    /* renamed from: a */
    public final String f4280a;

    /* renamed from: b */
    public final C3173t f4281b;

    /* renamed from: c */
    public final C3172s f4282c;

    /* renamed from: d */
    public C2686q f4283d;

    /* renamed from: e */
    public Format f4284e;

    /* renamed from: f */
    public String f4285f;

    /* renamed from: g */
    public int f4286g;

    /* renamed from: h */
    public int f4287h;

    /* renamed from: i */
    public int f4288i;

    /* renamed from: j */
    public int f4289j;

    /* renamed from: k */
    public long f4290k;

    /* renamed from: l */
    public boolean f4291l;

    /* renamed from: m */
    public int f4292m;

    /* renamed from: n */
    public int f4293n;

    /* renamed from: o */
    public int f4294o;

    /* renamed from: p */
    public boolean f4295p;

    /* renamed from: q */
    public long f4296q;

    /* renamed from: r */
    public int f4297r;

    /* renamed from: s */
    public long f4298s;

    /* renamed from: t */
    public int f4299t;

    public C2804q(@Nullable String str) {
        this.f4280a = str;
        C3173t tVar = new C3173t(1024);
        this.f4281b = tVar;
        this.f4282c = new C3172s(tVar.f5877a);
    }

    /* renamed from: a */
    public static long m5905a(C3172s sVar) {
        return (long) sVar.mo19985h((sVar.mo19985h(2) + 1) * 8);
    }

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        while (tVar.mo20008a() > 0) {
            int i = this.f4286g;
            if (i != 0) {
                if (i == 1) {
                    int y = tVar.mo20032y();
                    if ((y & 224) == 224) {
                        this.f4289j = y;
                        this.f4286g = 2;
                    } else if (y != 86) {
                        this.f4286g = 0;
                    }
                } else if (i == 2) {
                    int y2 = ((this.f4289j & -225) << 8) | tVar.mo20032y();
                    this.f4288i = y2;
                    if (y2 > this.f4281b.f5877a.length) {
                        mo18836m(y2);
                    }
                    this.f4287h = 0;
                    this.f4286g = 3;
                } else if (i == 3) {
                    int min = Math.min(tVar.mo20008a(), this.f4288i - this.f4287h);
                    tVar.mo20015h(this.f4282c.f5873a, this.f4287h, min);
                    int i2 = this.f4287h + min;
                    this.f4287h = i2;
                    if (i2 == this.f4288i) {
                        this.f4282c.mo19991n(0);
                        mo18830g(this.f4282c);
                        this.f4286g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (tVar.mo20032y() == 86) {
                this.f4286g = 1;
            }
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        this.f4286g = 0;
        this.f4291l = false;
    }

    /* renamed from: d */
    public void mo18768d() {
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        dVar.mo18761a();
        this.f4283d = iVar.mo18552a(dVar.mo18763c(), 1);
        this.f4285f = dVar.mo18762b();
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        this.f4290k = j;
    }

    /* renamed from: g */
    public final void mo18830g(C3172s sVar) {
        if (!sVar.mo19984g()) {
            this.f4291l = true;
            mo18835l(sVar);
        } else if (!this.f4291l) {
            return;
        }
        if (this.f4292m != 0) {
            throw new ParserException();
        } else if (this.f4293n == 0) {
            mo18834k(sVar, mo18833j(sVar));
            if (this.f4295p) {
                sVar.mo19993p((int) this.f4296q);
            }
        } else {
            throw new ParserException();
        }
    }

    /* renamed from: h */
    public final int mo18831h(C3172s sVar) {
        int b = sVar.mo19979b();
        Pair<Integer, Integer> i = C3155g.m7846i(sVar, true);
        this.f4297r = ((Integer) i.first).intValue();
        this.f4299t = ((Integer) i.second).intValue();
        return b - sVar.mo19979b();
    }

    /* renamed from: i */
    public final void mo18832i(C3172s sVar) {
        int h = sVar.mo19985h(3);
        this.f4294o = h;
        if (h == 0) {
            sVar.mo19993p(8);
        } else if (h == 1) {
            sVar.mo19993p(9);
        } else if (h == 3 || h == 4 || h == 5) {
            sVar.mo19993p(6);
        } else if (h == 6 || h == 7) {
            sVar.mo19993p(1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    public final int mo18833j(C3172s sVar) {
        int h;
        if (this.f4294o == 0) {
            int i = 0;
            do {
                h = sVar.mo19985h(8);
                i += h;
            } while (h == 255);
            return i;
        }
        throw new ParserException();
    }

    /* renamed from: k */
    public final void mo18834k(C3172s sVar, int i) {
        int e = sVar.mo19982e();
        if ((e & 7) == 0) {
            this.f4281b.mo20006L(e >> 3);
        } else {
            sVar.mo19986i(this.f4281b.f5877a, 0, i * 8);
            this.f4281b.mo20006L(0);
        }
        this.f4283d.mo18544b(this.f4281b, i);
        this.f4283d.mo18545c(this.f4290k, 1, i, 0, (C2686q.C2687a) null);
        this.f4290k += this.f4298s;
    }

    /* renamed from: l */
    public final void mo18835l(C3172s sVar) {
        boolean g;
        C3172s sVar2 = sVar;
        int h = sVar2.mo19985h(1);
        int h2 = h == 1 ? sVar2.mo19985h(1) : 0;
        this.f4292m = h2;
        if (h2 == 0) {
            if (h == 1) {
                m5905a(sVar);
            }
            if (sVar.mo19984g()) {
                this.f4293n = sVar2.mo19985h(6);
                int h3 = sVar2.mo19985h(4);
                int h4 = sVar2.mo19985h(3);
                if (h3 == 0 && h4 == 0) {
                    if (h == 0) {
                        int e = sVar.mo19982e();
                        int h5 = mo18831h(sVar);
                        sVar2.mo19991n(e);
                        byte[] bArr = new byte[((h5 + 7) / 8)];
                        sVar2.mo19986i(bArr, 0, h5);
                        Format l = Format.m10238l(this.f4285f, VideoCapture.AUDIO_MIME_TYPE, (String) null, -1, -1, this.f4299t, this.f4297r, Collections.singletonList(bArr), (DrmInitData) null, 0, this.f4280a);
                        if (!l.equals(this.f4284e)) {
                            this.f4284e = l;
                            this.f4298s = 1024000000 / ((long) l.f7552E);
                            this.f4283d.mo18546d(l);
                        }
                    } else {
                        sVar2.mo19993p(((int) m5905a(sVar)) - mo18831h(sVar));
                    }
                    mo18832i(sVar);
                    boolean g2 = sVar.mo19984g();
                    this.f4295p = g2;
                    this.f4296q = 0;
                    if (g2) {
                        if (h == 1) {
                            this.f4296q = m5905a(sVar);
                        } else {
                            do {
                                g = sVar.mo19984g();
                                this.f4296q = (this.f4296q << 8) + ((long) sVar2.mo19985h(8));
                            } while (g);
                        }
                    }
                    if (sVar.mo19984g()) {
                        sVar2.mo19993p(8);
                        return;
                    }
                    return;
                }
                throw new ParserException();
            }
            throw new ParserException();
        }
        throw new ParserException();
    }

    /* renamed from: m */
    public final void mo18836m(int i) {
        this.f4281b.mo20002H(i);
        this.f4282c.mo19989l(this.f4281b.f5877a);
    }
}
