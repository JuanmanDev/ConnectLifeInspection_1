package p040c.p200q.p201a.p219b.p224f0.p225r;

import androidx.annotation.Nullable;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.C2670c;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.f0.r.b */
/* compiled from: AmrExtractor */
public final class C2689b implements C2674g {

    /* renamed from: p */
    public static final int[] f3456p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q */
    public static final int[] f3457q = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: r */
    public static final byte[] f3458r = C3152e0.m7773M("#!AMR\n");

    /* renamed from: s */
    public static final byte[] f3459s = C3152e0.m7773M("#!AMR-WB\n");

    /* renamed from: t */
    public static final int f3460t = f3457q[8];

    /* renamed from: a */
    public final byte[] f3461a;

    /* renamed from: b */
    public final int f3462b;

    /* renamed from: c */
    public boolean f3463c;

    /* renamed from: d */
    public long f3464d;

    /* renamed from: e */
    public int f3465e;

    /* renamed from: f */
    public int f3466f;

    /* renamed from: g */
    public boolean f3467g;

    /* renamed from: h */
    public long f3468h;

    /* renamed from: i */
    public int f3469i;

    /* renamed from: j */
    public int f3470j;

    /* renamed from: k */
    public long f3471k;

    /* renamed from: l */
    public C2676i f3472l;

    /* renamed from: m */
    public C2686q f3473m;
    @Nullable

    /* renamed from: n */
    public C2682o f3474n;

    /* renamed from: o */
    public boolean f3475o;

    static {
        C2688a aVar = C2688a.f3455a;
    }

    public C2689b() {
        this(0);
    }

    /* renamed from: a */
    public static int m5303a(int i, long j) {
        return (int) ((((long) (i * 8)) * EventLoop_commonKt.MS_TO_NS) / j);
    }

    /* renamed from: k */
    public static /* synthetic */ C2674g[] m5304k() {
        return new C2674g[]{new C2689b()};
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        return mo18578p(hVar);
    }

    /* renamed from: c */
    public final C2682o mo18569c(long j) {
        return new C2670c(j, this.f3468h, m5303a(this.f3469i, 20000), this.f3469i);
    }

    /* renamed from: d */
    public final int mo18570d(int i) {
        if (mo18572i(i)) {
            return this.f3463c ? f3457q[i] : f3456p[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f3463c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw new ParserException(sb.toString());
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        if (hVar.getPosition() != 0 || mo18578p(hVar)) {
            mo18574l();
            int q = mo18579q(hVar);
            mo18575m(hVar.mo18526e(), q);
            return q;
        }
        throw new ParserException("Could not find AMR header.");
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f3472l = iVar;
        this.f3473m = iVar.mo18552a(0, 1);
        iVar.mo18554o();
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        this.f3464d = 0;
        this.f3465e = 0;
        this.f3466f = 0;
        if (j != 0) {
            C2682o oVar = this.f3474n;
            if (oVar instanceof C2670c) {
                this.f3471k = ((C2670c) oVar).mo18521e(j);
                return;
            }
        }
        this.f3471k = 0;
    }

    /* renamed from: h */
    public final boolean mo18571h(int i) {
        return !this.f3463c && (i < 12 || i > 14);
    }

    /* renamed from: i */
    public final boolean mo18572i(int i) {
        return i >= 0 && i <= 15 && (mo18573j(i) || mo18571h(i));
    }

    /* renamed from: j */
    public final boolean mo18573j(int i) {
        return this.f3463c && (i < 10 || i > 13);
    }

    /* renamed from: l */
    public final void mo18574l() {
        if (!this.f3475o) {
            this.f3475o = true;
            this.f3473m.mo18546d(Format.m10237k((String) null, this.f3463c ? "audio/amr-wb" : "audio/3gpp", (String) null, -1, f3460t, 1, this.f3463c ? 16000 : VideoCapture.Defaults.DEFAULT_AUDIO_SAMPLE_RATE, -1, (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
        }
    }

    /* renamed from: m */
    public final void mo18575m(long j, int i) {
        int i2;
        if (!this.f3467g) {
            if ((this.f3462b & 1) == 0 || j == -1 || !((i2 = this.f3469i) == -1 || i2 == this.f3465e)) {
                C2682o.C2684b bVar = new C2682o.C2684b(-9223372036854775807L);
                this.f3474n = bVar;
                this.f3472l.mo18553c(bVar);
                this.f3467g = true;
            } else if (this.f3470j >= 20 || i == -1) {
                C2682o c = mo18569c(j);
                this.f3474n = c;
                this.f3472l.mo18553c(c);
                this.f3467g = true;
            }
        }
    }

    /* renamed from: n */
    public final boolean mo18576n(C2675h hVar, byte[] bArr) {
        hVar.mo18527f();
        byte[] bArr2 = new byte[bArr.length];
        hVar.mo18531i(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: o */
    public final int mo18577o(C2675h hVar) {
        hVar.mo18527f();
        hVar.mo18531i(this.f3461a, 0, 1);
        byte b = this.f3461a[0];
        if ((b & 131) <= 0) {
            return mo18570d((b >> 3) & 15);
        }
        throw new ParserException("Invalid padding bits for frame header " + b);
    }

    /* renamed from: p */
    public final boolean mo18578p(C2675h hVar) {
        if (mo18576n(hVar, f3458r)) {
            this.f3463c = false;
            hVar.mo18528g(f3458r.length);
            return true;
        } else if (!mo18576n(hVar, f3459s)) {
            return false;
        } else {
            this.f3463c = true;
            hVar.mo18528g(f3459s.length);
            return true;
        }
    }

    /* renamed from: q */
    public final int mo18579q(C2675h hVar) {
        if (this.f3466f == 0) {
            try {
                int o = mo18577o(hVar);
                this.f3465e = o;
                this.f3466f = o;
                if (this.f3469i == -1) {
                    this.f3468h = hVar.getPosition();
                    this.f3469i = this.f3465e;
                }
                if (this.f3469i == this.f3465e) {
                    this.f3470j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a = this.f3473m.mo18543a(hVar, this.f3466f, true);
        if (a == -1) {
            return -1;
        }
        int i = this.f3466f - a;
        this.f3466f = i;
        if (i > 0) {
            return 0;
        }
        this.f3473m.mo18545c(this.f3471k + this.f3464d, 1, this.f3465e, 0, (C2686q.C2687a) null);
        this.f3464d += 20000;
        return 0;
    }

    public void release() {
    }

    public C2689b(int i) {
        this.f3462b = i;
        this.f3461a = new byte[1];
        this.f3469i = -1;
    }
}
