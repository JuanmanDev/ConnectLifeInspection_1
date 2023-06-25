package p040c.p200q.p201a.p219b.p224f0.p228u;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import java.io.EOFException;
import java.util.List;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2678k;
import p040c.p200q.p201a.p219b.p224f0.C2679l;
import p040c.p200q.p201a.p219b.p224f0.C2680m;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p235h0.p237g.C2837b;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.u.e */
/* compiled from: Mp3Extractor */
public final class C2712e implements C2674g {

    /* renamed from: o */
    public static final C2837b.C2838a f3636o = C2709b.f3632a;

    /* renamed from: p */
    public static final int f3637p = C3152e0.m7764D("Xing");

    /* renamed from: q */
    public static final int f3638q = C3152e0.m7764D("Info");

    /* renamed from: r */
    public static final int f3639r = C3152e0.m7764D("VBRI");

    /* renamed from: a */
    public final int f3640a;

    /* renamed from: b */
    public final long f3641b;

    /* renamed from: c */
    public final C3173t f3642c;

    /* renamed from: d */
    public final C2680m f3643d;

    /* renamed from: e */
    public final C2678k f3644e;

    /* renamed from: f */
    public final C2679l f3645f;

    /* renamed from: g */
    public C2676i f3646g;

    /* renamed from: h */
    public C2686q f3647h;

    /* renamed from: i */
    public int f3648i;

    /* renamed from: j */
    public Metadata f3649j;

    /* renamed from: k */
    public C2713a f3650k;

    /* renamed from: l */
    public long f3651l;

    /* renamed from: m */
    public long f3652m;

    /* renamed from: n */
    public int f3653n;

    /* renamed from: c.q.a.b.f0.u.e$a */
    /* compiled from: Mp3Extractor */
    public interface C2713a extends C2682o {
        /* renamed from: a */
        long mo18635a(long j);

        /* renamed from: c */
        long mo18636c();
    }

    static {
        C2708a aVar = C2708a.f3631a;
    }

    public C2712e() {
        this(0);
    }

    /* renamed from: c */
    public static int m5434c(C3173t tVar, int i) {
        if (tVar.mo20011d() >= i + 4) {
            tVar.mo20006L(i);
            int j = tVar.mo20017j();
            if (j == f3637p || j == f3638q) {
                return j;
            }
        }
        if (tVar.mo20011d() < 40) {
            return 0;
        }
        tVar.mo20006L(36);
        int j2 = tVar.mo20017j();
        int i2 = f3639r;
        if (j2 == i2) {
            return i2;
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m5435d(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: h */
    public static /* synthetic */ C2674g[] m5436h() {
        return new C2674g[]{new C2712e()};
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m5437i(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Nullable
    /* renamed from: j */
    public static C2711d m5438j(Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int b = metadata.mo24053b();
        for (int i = 0; i < b; i++) {
            Metadata.Entry a = metadata.mo24052a(i);
            if (a instanceof MlltFrame) {
                return C2711d.m5427b(j, (MlltFrame) a);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C2713a mo18637a(C2675h hVar) {
        hVar.mo18531i(this.f3642c.f5877a, 0, 4);
        this.f3642c.mo20006L(0);
        C2680m.m5290b(this.f3642c.mo20017j(), this.f3643d);
        return new C2710c(hVar.mo18526e(), hVar.getPosition(), this.f3643d);
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        return mo18641n(hVar, true);
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        if (this.f3648i == 0) {
            try {
                mo18641n(hVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        } else {
            C2675h hVar2 = hVar;
        }
        if (this.f3650k == null) {
            C2713a k = mo18638k(hVar);
            C2711d j = m5438j(this.f3649j, hVar.getPosition());
            if (j != null) {
                this.f3650k = j;
            } else if (k != null) {
                this.f3650k = k;
            }
            C2713a aVar = this.f3650k;
            if (aVar == null || (!aVar.mo18503d() && (this.f3640a & 1) != 0)) {
                this.f3650k = mo18637a(hVar);
            }
            this.f3646g.mo18553c(this.f3650k);
            C2686q qVar = this.f3647h;
            C2680m mVar = this.f3643d;
            String str = mVar.f3437b;
            int i = mVar.f3440e;
            int i2 = mVar.f3439d;
            C2678k kVar = this.f3644e;
            qVar.mo18546d(Format.m10236j((String) null, str, (String) null, -1, 4096, i, i2, -1, kVar.f3426a, kVar.f3427b, (List<byte[]>) null, (DrmInitData) null, 0, (String) null, (this.f3640a & 2) != 0 ? null : this.f3649j));
        }
        return mo18640m(hVar);
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f3646g = iVar;
        this.f3647h = iVar.mo18552a(0, 1);
        this.f3646g.mo18554o();
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        this.f3648i = 0;
        this.f3651l = -9223372036854775807L;
        this.f3652m = 0;
        this.f3653n = 0;
    }

    /* renamed from: k */
    public final C2713a mo18638k(C2675h hVar) {
        C3173t tVar = new C3173t(this.f3643d.f3438c);
        hVar.mo18531i(tVar.f5877a, 0, this.f3643d.f3438c);
        C2680m mVar = this.f3643d;
        int i = mVar.f3436a & 1;
        int i2 = 21;
        int i3 = mVar.f3440e;
        if (i != 0) {
            if (i3 != 1) {
                i2 = 36;
            }
        } else if (i3 == 1) {
            i2 = 13;
        }
        int i4 = i2;
        int c = m5434c(tVar, i4);
        if (c == f3637p || c == f3638q) {
            C2715g b = C2715g.m5456b(hVar.mo18526e(), hVar.getPosition(), this.f3643d, tVar);
            if (b != null && !this.f3644e.mo18555a()) {
                hVar.mo18527f();
                hVar.mo18525d(i4 + 141);
                hVar.mo18531i(this.f3642c.f5877a, 0, 3);
                this.f3642c.mo20006L(0);
                this.f3644e.mo18558d(this.f3642c.mo19996B());
            }
            hVar.mo18528g(this.f3643d.f3438c);
            return (b == null || b.mo18503d() || c != f3638q) ? b : mo18637a(hVar);
        } else if (c == f3639r) {
            C2714f b2 = C2714f.m5450b(hVar.mo18526e(), hVar.getPosition(), this.f3643d, tVar);
            hVar.mo18528g(this.f3643d.f3438c);
            return b2;
        } else {
            hVar.mo18527f();
            return null;
        }
    }

    /* renamed from: l */
    public final boolean mo18639l(C2675h hVar) {
        if ((this.f3650k == null || hVar.mo18524c() != this.f3650k.mo18636c()) && hVar.mo18523b(this.f3642c.f5877a, 0, 4, true)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final int mo18640m(C2675h hVar) {
        if (this.f3653n == 0) {
            hVar.mo18527f();
            if (mo18639l(hVar)) {
                return -1;
            }
            this.f3642c.mo20006L(0);
            int j = this.f3642c.mo20017j();
            if (!m5435d(j, (long) this.f3648i) || C2680m.m5289a(j) == -1) {
                hVar.mo18528g(1);
                this.f3648i = 0;
                return 0;
            }
            C2680m.m5290b(j, this.f3643d);
            if (this.f3651l == -9223372036854775807L) {
                this.f3651l = this.f3650k.mo18635a(hVar.getPosition());
                if (this.f3641b != -9223372036854775807L) {
                    this.f3651l += this.f3641b - this.f3650k.mo18635a(0);
                }
            }
            this.f3653n = this.f3643d.f3438c;
        }
        int a = this.f3647h.mo18543a(hVar, this.f3653n, true);
        if (a == -1) {
            return -1;
        }
        int i = this.f3653n - a;
        this.f3653n = i;
        if (i > 0) {
            return 0;
        }
        long j2 = this.f3651l;
        long j3 = this.f3652m * EventLoop_commonKt.MS_TO_NS;
        C2680m mVar = this.f3643d;
        this.f3647h.mo18545c(j2 + (j3 / ((long) mVar.f3439d)), 1, mVar.f3438c, 0, (C2686q.C2687a) null);
        this.f3652m += (long) this.f3643d.f3442g;
        this.f3653n = 0;
        return 0;
    }

    /* renamed from: n */
    public final boolean mo18641n(C2675h hVar, boolean z) {
        int i;
        int i2;
        int a;
        C2837b.C2838a aVar;
        int i3 = z ? 16384 : 131072;
        hVar.mo18527f();
        if (hVar.getPosition() == 0) {
            if ((this.f3640a & 2) == 0) {
                aVar = null;
            } else {
                aVar = f3636o;
            }
            Metadata a2 = this.f3645f.mo18559a(hVar, aVar);
            this.f3649j = a2;
            if (a2 != null) {
                this.f3644e.mo18557c(a2);
            }
            i2 = (int) hVar.mo18524c();
            if (!z) {
                hVar.mo18528g(i2);
            }
            i = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = i;
        int i5 = i4;
        while (true) {
            if (!mo18639l(hVar)) {
                this.f3642c.mo20006L(0);
                int j = this.f3642c.mo20017j();
                if ((i == 0 || m5435d(j, (long) i)) && (a = C2680m.m5289a(j)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        C2680m.m5290b(j, this.f3643d);
                        i = j;
                    }
                    hVar.mo18525d(a - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            hVar.mo18527f();
                            hVar.mo18525d(i2 + i6);
                        } else {
                            hVar.mo18528g(1);
                        }
                        i4 = 0;
                        i5 = i6;
                        i = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw new ParserException("Searched too many bytes.");
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            hVar.mo18528g(i2 + i5);
        } else {
            hVar.mo18527f();
        }
        this.f3648i = i;
        return true;
    }

    public void release() {
    }

    public C2712e(int i) {
        this(i, -9223372036854775807L);
    }

    public C2712e(int i, long j) {
        this.f3640a = i;
        this.f3641b = j;
        this.f3642c = new C3173t(10);
        this.f3643d = new C2680m();
        this.f3644e = new C2678k();
        this.f3651l = -9223372036854775807L;
        this.f3645f = new C2679l();
    }
}
