package p040c.p200q.p201a.p219b.p224f0.p232y;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Arrays;
import java.util.Collections;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3168q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.m */
/* compiled from: H262Reader */
public final class C2795m implements C2794l {

    /* renamed from: q */
    public static final double[] f4176q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f4177a;

    /* renamed from: b */
    public C2686q f4178b;

    /* renamed from: c */
    public boolean f4179c;

    /* renamed from: d */
    public long f4180d;

    /* renamed from: e */
    public final C2789g0 f4181e;

    /* renamed from: f */
    public final C3173t f4182f;

    /* renamed from: g */
    public final boolean[] f4183g;

    /* renamed from: h */
    public final C2796a f4184h;

    /* renamed from: i */
    public final C2806s f4185i;

    /* renamed from: j */
    public long f4186j;

    /* renamed from: k */
    public boolean f4187k;

    /* renamed from: l */
    public long f4188l;

    /* renamed from: m */
    public long f4189m;

    /* renamed from: n */
    public long f4190n;

    /* renamed from: o */
    public boolean f4191o;

    /* renamed from: p */
    public boolean f4192p;

    /* renamed from: c.q.a.b.f0.y.m$a */
    /* compiled from: H262Reader */
    public static final class C2796a {

        /* renamed from: e */
        public static final byte[] f4193e = {0, 0, 1};

        /* renamed from: a */
        public boolean f4194a;

        /* renamed from: b */
        public int f4195b;

        /* renamed from: c */
        public int f4196c;

        /* renamed from: d */
        public byte[] f4197d;

        public C2796a(int i) {
            this.f4197d = new byte[i];
        }

        /* renamed from: a */
        public void mo18803a(byte[] bArr, int i, int i2) {
            if (this.f4194a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f4197d;
                int length = bArr2.length;
                int i4 = this.f4195b;
                if (length < i4 + i3) {
                    this.f4197d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f4197d, this.f4195b, i3);
                this.f4195b += i3;
            }
        }

        /* renamed from: b */
        public boolean mo18804b(int i, int i2) {
            if (this.f4194a) {
                int i3 = this.f4195b - i2;
                this.f4195b = i3;
                if (this.f4196c == 0 && i == 181) {
                    this.f4196c = i3;
                } else {
                    this.f4194a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f4194a = true;
            }
            byte[] bArr = f4193e;
            mo18803a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void mo18805c() {
            this.f4194a = false;
            this.f4195b = 0;
            this.f4196c = 0;
        }
    }

    public C2795m() {
        this((C2789g0) null);
    }

    /* renamed from: a */
    public static Pair<Format, Long> m5853a(C2796a aVar, String str) {
        int i;
        float f;
        float f2;
        C2796a aVar2 = aVar;
        byte[] copyOf = Arrays.copyOf(aVar2.f4197d, aVar2.f4195b);
        byte b = copyOf[5] & 255;
        int i2 = ((copyOf[4] & 255) << 4) | (b >> 4);
        byte b2 = ((b & 15) << 8) | (copyOf[6] & 255);
        int i3 = (copyOf[7] & 240) >> 4;
        if (i3 != 2) {
            if (i3 == 3) {
                f = (float) (b2 * 16);
                i = i2 * 9;
            } else if (i3 != 4) {
                f2 = 1.0f;
            } else {
                f = (float) (b2 * 121);
                i = i2 * 100;
            }
            f2 = f / ((float) i);
        } else {
            f = (float) (b2 * 4);
            i = i2 * 3;
            f2 = f / ((float) i);
        }
        Format x = Format.m10250x(str, "video/mpeg2", (String) null, -1, -1, i2, b2, -1.0f, Collections.singletonList(copyOf), -1, f2, (DrmInitData) null);
        long j = 0;
        int i4 = (copyOf[7] & 15) - 1;
        if (i4 >= 0) {
            double[] dArr = f4176q;
            if (i4 < dArr.length) {
                double d = dArr[i4];
                int i5 = aVar2.f4196c + 9;
                int i6 = (copyOf[i5] & 96) >> 5;
                byte b3 = copyOf[i5] & 31;
                if (i6 != b3) {
                    d *= (((double) i6) + 1.0d) / ((double) (b3 + 1));
                }
                j = (long) (1000000.0d / d);
            }
        }
        return Pair.create(x, Long.valueOf(j));
    }

    /* renamed from: b */
    public void mo18766b(C3173t tVar) {
        int i;
        C3173t tVar2 = tVar;
        int c = tVar.mo20010c();
        int d = tVar.mo20011d();
        byte[] bArr = tVar2.f5877a;
        this.f4186j += (long) tVar.mo20008a();
        this.f4178b.mo18544b(tVar2, tVar.mo20008a());
        while (true) {
            int c2 = C3168q.m7904c(bArr, c, d, this.f4183g);
            if (c2 == d) {
                break;
            }
            int i2 = c2 + 3;
            byte b = tVar2.f5877a[i2] & 255;
            int i3 = c2 - c;
            boolean z = false;
            if (!this.f4179c) {
                if (i3 > 0) {
                    this.f4184h.mo18803a(bArr, c, c2);
                }
                if (this.f4184h.mo18804b(b, i3 < 0 ? -i3 : 0)) {
                    Pair<Format, Long> a = m5853a(this.f4184h, this.f4177a);
                    this.f4178b.mo18546d((Format) a.first);
                    this.f4180d = ((Long) a.second).longValue();
                    this.f4179c = true;
                }
            }
            if (this.f4181e != null) {
                if (i3 > 0) {
                    this.f4185i.mo18840a(bArr, c, c2);
                    i = 0;
                } else {
                    i = -i3;
                }
                if (this.f4185i.mo18841b(i)) {
                    C2806s sVar = this.f4185i;
                    this.f4182f.mo20004J(this.f4185i.f4315d, C3168q.m7912k(sVar.f4315d, sVar.f4316e));
                    this.f4181e.mo18777a(this.f4190n, this.f4182f);
                }
                if (b == 178 && tVar2.f5877a[c2 + 2] == 1) {
                    this.f4185i.mo18844e(b);
                }
            }
            if (b == 0 || b == 179) {
                int i4 = d - c2;
                if (this.f4187k && this.f4192p && this.f4179c) {
                    this.f4178b.mo18545c(this.f4190n, this.f4191o ? 1 : 0, ((int) (this.f4186j - this.f4189m)) - i4, i4, (C2686q.C2687a) null);
                }
                if (!this.f4187k || this.f4192p) {
                    this.f4189m = this.f4186j - ((long) i4);
                    long j = this.f4188l;
                    if (j == -9223372036854775807L) {
                        j = this.f4187k ? this.f4190n + this.f4180d : 0;
                    }
                    this.f4190n = j;
                    this.f4191o = false;
                    this.f4188l = -9223372036854775807L;
                    this.f4187k = true;
                }
                if (b == 0) {
                    z = true;
                }
                this.f4192p = z;
            } else if (b == 184) {
                this.f4191o = true;
            }
            c = i2;
        }
        if (!this.f4179c) {
            this.f4184h.mo18803a(bArr, c, d);
        }
        if (this.f4181e != null) {
            this.f4185i.mo18840a(bArr, c, d);
        }
    }

    /* renamed from: c */
    public void mo18767c() {
        C3168q.m7902a(this.f4183g);
        this.f4184h.mo18805c();
        if (this.f4181e != null) {
            this.f4185i.mo18843d();
        }
        this.f4186j = 0;
        this.f4187k = false;
    }

    /* renamed from: d */
    public void mo18768d() {
    }

    /* renamed from: e */
    public void mo18769e(C2676i iVar, C2781e0.C2785d dVar) {
        dVar.mo18761a();
        this.f4177a = dVar.mo18762b();
        this.f4178b = iVar.mo18552a(dVar.mo18763c(), 2);
        C2789g0 g0Var = this.f4181e;
        if (g0Var != null) {
            g0Var.mo18778b(iVar, dVar);
        }
    }

    /* renamed from: f */
    public void mo18770f(long j, int i) {
        this.f4188l = j;
    }

    public C2795m(C2789g0 g0Var) {
        this.f4181e = g0Var;
        this.f4183g = new boolean[4];
        this.f4184h = new C2796a(128);
        if (g0Var != null) {
            this.f4185i = new C2806s(178, 128);
            this.f4182f = new C3173t();
            return;
        }
        this.f4185i = null;
        this.f4182f = null;
    }
}
