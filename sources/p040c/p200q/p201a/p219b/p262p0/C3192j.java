package p040c.p200q.p201a.p219b.p262p0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.video.DummySurface;
import java.nio.ByteBuffer;
import java.util.List;
import p040c.p200q.p201a.p219b.C2589c;
import p040c.p200q.p201a.p219b.p222d0.C2633d;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p223e0.C2656m;
import p040c.p200q.p201a.p219b.p234g0.C2823a;
import p040c.p200q.p201a.p219b.p234g0.C2824b;
import p040c.p200q.p201a.p219b.p234g0.C2826c;
import p040c.p200q.p201a.p219b.p261o0.C3148c0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3166p;
import p040c.p200q.p201a.p219b.p262p0.C3201n;

@TargetApi(16)
/* renamed from: c.q.a.b.p0.j */
/* compiled from: MediaCodecVideoRenderer */
public class C3192j extends MediaCodecRenderer {

    /* renamed from: d1 */
    public static final int[] f5941d1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: e1 */
    public static boolean f5942e1;

    /* renamed from: f1 */
    public static boolean f5943f1;

    /* renamed from: A0 */
    public boolean f5944A0;

    /* renamed from: B0 */
    public Surface f5945B0;

    /* renamed from: C0 */
    public Surface f5946C0;

    /* renamed from: D0 */
    public int f5947D0 = 1;

    /* renamed from: E0 */
    public boolean f5948E0;

    /* renamed from: F0 */
    public long f5949F0;

    /* renamed from: G0 */
    public long f5950G0 = -9223372036854775807L;

    /* renamed from: H0 */
    public long f5951H0;

    /* renamed from: I0 */
    public int f5952I0;

    /* renamed from: J0 */
    public int f5953J0;

    /* renamed from: K0 */
    public int f5954K0;

    /* renamed from: L0 */
    public long f5955L0;

    /* renamed from: M0 */
    public int f5956M0;

    /* renamed from: N0 */
    public float f5957N0 = -1.0f;

    /* renamed from: O0 */
    public int f5958O0 = -1;

    /* renamed from: P0 */
    public int f5959P0 = -1;

    /* renamed from: Q0 */
    public int f5960Q0;

    /* renamed from: R0 */
    public float f5961R0 = -1.0f;

    /* renamed from: S0 */
    public int f5962S0;

    /* renamed from: T0 */
    public int f5963T0;

    /* renamed from: U0 */
    public int f5964U0;

    /* renamed from: V0 */
    public float f5965V0;

    /* renamed from: W0 */
    public boolean f5966W0;

    /* renamed from: X0 */
    public int f5967X0;

    /* renamed from: Y0 */
    public C3195c f5968Y0;

    /* renamed from: Z0 */
    public long f5969Z0 = -9223372036854775807L;

    /* renamed from: a1 */
    public long f5970a1 = -9223372036854775807L;

    /* renamed from: b1 */
    public int f5971b1;
    @Nullable

    /* renamed from: c1 */
    public C3196k f5972c1;

    /* renamed from: r0 */
    public final Context f5973r0;

    /* renamed from: s0 */
    public final C3197l f5974s0;

    /* renamed from: t0 */
    public final C3201n.C3202a f5975t0;

    /* renamed from: u0 */
    public final long f5976u0;

    /* renamed from: v0 */
    public final int f5977v0;

    /* renamed from: w0 */
    public final boolean f5978w0 = m8040L0();

    /* renamed from: x0 */
    public final long[] f5979x0 = new long[10];

    /* renamed from: y0 */
    public final long[] f5980y0 = new long[10];

    /* renamed from: z0 */
    public C3194b f5981z0;

    /* renamed from: c.q.a.b.p0.j$b */
    /* compiled from: MediaCodecVideoRenderer */
    public static final class C3194b {

        /* renamed from: a */
        public final int f5982a;

        /* renamed from: b */
        public final int f5983b;

        /* renamed from: c */
        public final int f5984c;

        public C3194b(int i, int i2, int i3) {
            this.f5982a = i;
            this.f5983b = i2;
            this.f5984c = i3;
        }
    }

    @TargetApi(23)
    /* renamed from: c.q.a.b.p0.j$c */
    /* compiled from: MediaCodecVideoRenderer */
    public final class C3195c implements MediaCodec.OnFrameRenderedListener {
        public void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
            C3192j jVar = C3192j.this;
            if (this == jVar.f5968Y0) {
                jVar.mo20107b1(j);
            }
        }

        public C3195c(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    public C3192j(Context context, C2824b bVar, long j, @Nullable C2650i<C2656m> iVar, boolean z, @Nullable Handler handler, @Nullable C3201n nVar, int i) {
        super(2, bVar, iVar, z, 30.0f);
        this.f5976u0 = j;
        this.f5977v0 = i;
        Context applicationContext = context.getApplicationContext();
        this.f5973r0 = applicationContext;
        this.f5974s0 = new C3197l(applicationContext);
        this.f5975t0 = new C3201n.C3202a(handler, nVar);
        mo20093I0();
    }

    @TargetApi(21)
    /* renamed from: K0 */
    public static void m8039K0(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: L0 */
    public static boolean m8040L0() {
        return "NVIDIA".equals(C3152e0.f5821c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8041N0(p040c.p200q.p201a.p219b.p234g0.C2823a r7, java.lang.String r8, int r9, int r10) {
        /*
            r0 = -1
            if (r9 == r0) goto L_0x00a3
            if (r10 != r0) goto L_0x0007
            goto L_0x00a3
        L_0x0007:
            int r1 = r8.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = r2
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = r5
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = r6
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = r3
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = r4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 0
            goto L_0x0051
        L_0x0050:
            r8 = r0
        L_0x0051:
            if (r8 == 0) goto L_0x009d
            if (r8 == r3) goto L_0x009d
            if (r8 == r6) goto L_0x0060
            if (r8 == r5) goto L_0x009d
            if (r8 == r4) goto L_0x005e
            if (r8 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r9 = r9 * r10
            goto L_0x009f
        L_0x0060:
            java.lang.String r8 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5822d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x009c
            java.lang.String r8 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5821c
            java.lang.String r1 = "Amazon"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x008d
            java.lang.String r8 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5822d
            java.lang.String r1 = "KFSOWI"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x009c
            java.lang.String r8 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5822d
            java.lang.String r1 = "AFTS"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x008d
            boolean r7 = r7.f4393f
            if (r7 == 0) goto L_0x008d
            goto L_0x009c
        L_0x008d:
            r7 = 16
            int r8 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7801h(r9, r7)
            int r9 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7801h(r10, r7)
            int r8 = r8 * r9
            int r8 = r8 * r7
            int r9 = r8 * 16
            goto L_0x009e
        L_0x009c:
            return r0
        L_0x009d:
            int r9 = r9 * r10
        L_0x009e:
            r4 = r6
        L_0x009f:
            int r9 = r9 * r5
            int r4 = r4 * r6
            int r9 = r9 / r4
            return r9
        L_0x00a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p262p0.C3192j.m8041N0(c.q.a.b.g0.a, java.lang.String, int, int):int");
    }

    /* renamed from: O0 */
    public static Point m8042O0(C2823a aVar, Format format) {
        boolean z = format.f7572w > format.f7571v;
        int i = z ? format.f7572w : format.f7571v;
        int i2 = z ? format.f7571v : format.f7572w;
        float f = ((float) i2) / ((float) i);
        for (int i3 : f5941d1) {
            int i4 = (int) (((float) i3) * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (C3152e0.f5819a >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point b = aVar.mo18884b(i5, i3);
                if (aVar.mo18892q(b.x, b.y, (double) format.f7573x)) {
                    return b;
                }
            } else {
                int h = C3152e0.m7801h(i3, 16) * 16;
                int h2 = C3152e0.m7801h(i4, 16) * 16;
                if (h * h2 <= MediaCodecUtil.m10463m()) {
                    int i6 = z ? h2 : h;
                    if (!z) {
                        h = h2;
                    }
                    return new Point(i6, h);
                }
            }
        }
        return null;
    }

    /* renamed from: Q0 */
    public static int m8043Q0(C2823a aVar, Format format) {
        if (format.f7567r == -1) {
            return m8041N0(aVar, format.f7566q, format.f7571v, format.f7572w);
        }
        int size = format.f7568s.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += format.f7568s.get(i2).length;
        }
        return format.f7567r + i;
    }

    /* renamed from: S0 */
    public static boolean m8044S0(long j) {
        return j < -30000;
    }

    /* renamed from: T0 */
    public static boolean m8045T0(long j) {
        return j < -500000;
    }

    @TargetApi(23)
    /* renamed from: g1 */
    public static void m8046g1(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    /* renamed from: A */
    public void mo18193A() {
        this.f5958O0 = -1;
        this.f5959P0 = -1;
        this.f5961R0 = -1.0f;
        this.f5957N0 = -1.0f;
        this.f5970a1 = -9223372036854775807L;
        this.f5969Z0 = -9223372036854775807L;
        this.f5971b1 = 0;
        mo20093I0();
        mo20092H0();
        this.f5974s0.mo20123d();
        this.f5968Y0 = null;
        this.f5966W0 = false;
        try {
            super.mo18193A();
        } finally {
            this.f7712p0.mo18403a();
            this.f5975t0.mo20141b(this.f7712p0);
        }
    }

    /* renamed from: B */
    public void mo18194B(boolean z) {
        super.mo18194B(z);
        int i = mo18219w().f6047a;
        this.f5967X0 = i;
        this.f5966W0 = i != 0;
        this.f5975t0.mo20143d(this.f7712p0);
        this.f5974s0.mo20124e();
    }

    /* renamed from: B0 */
    public boolean mo20091B0(C2823a aVar) {
        return this.f5945B0 != null || mo20116l1(aVar);
    }

    /* renamed from: C */
    public void mo18195C(long j, boolean z) {
        super.mo18195C(j, z);
        mo20092H0();
        this.f5949F0 = -9223372036854775807L;
        this.f5953J0 = 0;
        this.f5969Z0 = -9223372036854775807L;
        int i = this.f5971b1;
        if (i != 0) {
            this.f5970a1 = this.f5979x0[i - 1];
            this.f5971b1 = 0;
        }
        if (z) {
            mo20111f1();
        } else {
            this.f5950G0 = -9223372036854775807L;
        }
    }

    /* renamed from: D */
    public void mo18196D() {
        super.mo18196D();
        this.f5952I0 = 0;
        this.f5951H0 = SystemClock.elapsedRealtime();
        this.f5955L0 = SystemClock.elapsedRealtime() * 1000;
    }

    /* renamed from: E */
    public void mo18197E() {
        this.f5950G0 = -9223372036854775807L;
        mo20099V0();
        super.mo18197E();
    }

    /* renamed from: E0 */
    public int mo18318E0(C2824b bVar, C2650i<C2656m> iVar, Format format) {
        boolean z;
        int i = 0;
        if (!C3166p.m7901m(format.f7566q)) {
            return 0;
        }
        DrmInitData drmInitData = format.f7569t;
        if (drmInitData != null) {
            z = false;
            for (int i2 = 0; i2 < drmInitData.f7658n; i2++) {
                z |= drmInitData.mo23985e(i2).f7664p;
            }
        } else {
            z = false;
        }
        List<C2823a> b = bVar.mo18897b(format.f7566q, z);
        if (b.isEmpty()) {
            if (!z || bVar.mo18897b(format.f7566q, false).isEmpty()) {
                return 1;
            }
            return 2;
        } else if (!C2589c.m4787I(iVar, drmInitData)) {
            return 2;
        } else {
            C2823a aVar = b.get(0);
            boolean j = aVar.mo18889j(format);
            int i3 = aVar.mo18890k(format) ? 16 : 8;
            if (aVar.f4392e) {
                i = 32;
            }
            return (j ? 4 : 3) | i3 | i;
        }
    }

    /* renamed from: F */
    public void mo18198F(Format[] formatArr, long j) {
        if (this.f5970a1 == -9223372036854775807L) {
            this.f5970a1 = j;
        } else {
            int i = this.f5971b1;
            if (i == this.f5979x0.length) {
                C3163m.m7880f("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.f5979x0[this.f5971b1 - 1]);
            } else {
                this.f5971b1 = i + 1;
            }
            long[] jArr = this.f5979x0;
            int i2 = this.f5971b1;
            jArr[i2 - 1] = j;
            this.f5980y0[i2 - 1] = this.f5969Z0;
        }
        super.mo18198F(formatArr, j);
    }

    /* renamed from: H0 */
    public final void mo20092H0() {
        MediaCodec Y;
        this.f5948E0 = false;
        if (C3152e0.f5819a >= 23 && this.f5966W0 && (Y = mo24025Y()) != null) {
            this.f5968Y0 = new C3195c(Y);
        }
    }

    /* renamed from: I0 */
    public final void mo20093I0() {
        this.f5962S0 = -1;
        this.f5963T0 = -1;
        this.f5965V0 = -1.0f;
        this.f5964U0 = -1;
    }

    /* renamed from: J */
    public int mo18319J(MediaCodec mediaCodec, C2823a aVar, Format format, Format format2) {
        if (!aVar.mo18891l(format, format2, true)) {
            return 0;
        }
        int i = format2.f7571v;
        C3194b bVar = this.f5981z0;
        if (i > bVar.f5982a || format2.f7572w > bVar.f5983b || m8043Q0(aVar, format2) > this.f5981z0.f5984c) {
            return 0;
        }
        if (format.mo23912A(format2)) {
            return 1;
        }
        return 3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x05ff, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0600, code lost:
        switch(r2) {
            case 0: goto L_0x0604;
            case 1: goto L_0x0604;
            case 2: goto L_0x0604;
            case 3: goto L_0x0604;
            case 4: goto L_0x0604;
            case 5: goto L_0x0604;
            case 6: goto L_0x0604;
            case 7: goto L_0x0604;
            case 8: goto L_0x0604;
            case 9: goto L_0x0604;
            case 10: goto L_0x0604;
            case 11: goto L_0x0604;
            case 12: goto L_0x0604;
            case 13: goto L_0x0604;
            case 14: goto L_0x0604;
            case 15: goto L_0x0604;
            case 16: goto L_0x0604;
            case 17: goto L_0x0604;
            case 18: goto L_0x0604;
            case 19: goto L_0x0604;
            case 20: goto L_0x0604;
            case 21: goto L_0x0604;
            case 22: goto L_0x0604;
            case 23: goto L_0x0604;
            case 24: goto L_0x0604;
            case 25: goto L_0x0604;
            case 26: goto L_0x0604;
            case 27: goto L_0x0604;
            case 28: goto L_0x0604;
            case 29: goto L_0x0604;
            case 30: goto L_0x0604;
            case 31: goto L_0x0604;
            case 32: goto L_0x0604;
            case 33: goto L_0x0604;
            case 34: goto L_0x0604;
            case 35: goto L_0x0604;
            case 36: goto L_0x0604;
            case 37: goto L_0x0604;
            case 38: goto L_0x0604;
            case 39: goto L_0x0604;
            case 40: goto L_0x0604;
            case 41: goto L_0x0604;
            case 42: goto L_0x0604;
            case 43: goto L_0x0604;
            case 44: goto L_0x0604;
            case 45: goto L_0x0604;
            case 46: goto L_0x0604;
            case 47: goto L_0x0604;
            case 48: goto L_0x0604;
            case 49: goto L_0x0604;
            case 50: goto L_0x0604;
            case 51: goto L_0x0604;
            case 52: goto L_0x0604;
            case 53: goto L_0x0604;
            case 54: goto L_0x0604;
            case 55: goto L_0x0604;
            case 56: goto L_0x0604;
            case 57: goto L_0x0604;
            case 58: goto L_0x0604;
            case 59: goto L_0x0604;
            case 60: goto L_0x0604;
            case 61: goto L_0x0604;
            case 62: goto L_0x0604;
            case 63: goto L_0x0604;
            case 64: goto L_0x0604;
            case 65: goto L_0x0604;
            case 66: goto L_0x0604;
            case 67: goto L_0x0604;
            case 68: goto L_0x0604;
            case 69: goto L_0x0604;
            case 70: goto L_0x0604;
            case 71: goto L_0x0604;
            case 72: goto L_0x0604;
            case 73: goto L_0x0604;
            case 74: goto L_0x0604;
            case 75: goto L_0x0604;
            case 76: goto L_0x0604;
            case 77: goto L_0x0604;
            case 78: goto L_0x0604;
            case 79: goto L_0x0604;
            case 80: goto L_0x0604;
            case 81: goto L_0x0604;
            case 82: goto L_0x0604;
            case 83: goto L_0x0604;
            case 84: goto L_0x0604;
            case 85: goto L_0x0604;
            case 86: goto L_0x0604;
            case 87: goto L_0x0604;
            case 88: goto L_0x0604;
            case 89: goto L_0x0604;
            case 90: goto L_0x0604;
            case 91: goto L_0x0604;
            case 92: goto L_0x0604;
            case 93: goto L_0x0604;
            case 94: goto L_0x0604;
            case 95: goto L_0x0604;
            case 96: goto L_0x0604;
            case 97: goto L_0x0604;
            case 98: goto L_0x0604;
            case 99: goto L_0x0604;
            case 100: goto L_0x0604;
            case 101: goto L_0x0604;
            case 102: goto L_0x0604;
            case 103: goto L_0x0604;
            case 104: goto L_0x0604;
            case 105: goto L_0x0604;
            case 106: goto L_0x0604;
            case 107: goto L_0x0604;
            case 108: goto L_0x0604;
            case 109: goto L_0x0604;
            case 110: goto L_0x0604;
            case 111: goto L_0x0604;
            case 112: goto L_0x0604;
            case 113: goto L_0x0604;
            case 114: goto L_0x0604;
            case 115: goto L_0x0604;
            case 116: goto L_0x0604;
            case 117: goto L_0x0604;
            case 118: goto L_0x0604;
            case 119: goto L_0x0604;
            case 120: goto L_0x0604;
            case 121: goto L_0x0604;
            case 122: goto L_0x0604;
            case 123: goto L_0x0604;
            default: goto L_0x0603;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0604, code lost:
        f5943f1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0606, code lost:
        r1 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5822d;
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x060f, code lost:
        if (r2 == 2006354) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0614, code lost:
        if (r2 == 2006367) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x061d, code lost:
        if (r1.equals("AFTN") == false) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x061f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0627, code lost:
        if (r1.equals("AFTA") == false) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x062a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x062b, code lost:
        if (r0 == false) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x062d, code lost:
        if (r0 == true) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0630, code lost:
        f5943f1 = true;
     */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo20094J0(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "OMX.google"
            boolean r7 = r7.startsWith(r0)
            r0 = 0
            if (r7 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<c.q.a.b.p0.j> r7 = p040c.p200q.p201a.p219b.p262p0.C3192j.class
            monitor-enter(r7)
            boolean r1 = f5942e1     // Catch:{ all -> 0x0638 }
            if (r1 != 0) goto L_0x0634
            int r1 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5819a     // Catch:{ all -> 0x0638 }
            r2 = 27
            r3 = 1
            if (r1 > r2) goto L_0x0030
            java.lang.String r1 = "dangal"
            java.lang.String r4 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5820b     // Catch:{ all -> 0x0638 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0638 }
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = "HWEML"
            java.lang.String r4 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5820b     // Catch:{ all -> 0x0638 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x0030
        L_0x002c:
            f5943f1 = r3     // Catch:{ all -> 0x0638 }
            goto L_0x0632
        L_0x0030:
            int r1 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5819a     // Catch:{ all -> 0x0638 }
            if (r1 < r2) goto L_0x0036
            goto L_0x0632
        L_0x0036:
            java.lang.String r1 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5820b     // Catch:{ all -> 0x0638 }
            int r4 = r1.hashCode()     // Catch:{ all -> 0x0638 }
            r5 = -1
            switch(r4) {
                case -2144781245: goto L_0x05f4;
                case -2144781185: goto L_0x05e9;
                case -2144781160: goto L_0x05de;
                case -2097309513: goto L_0x05d3;
                case -2022874474: goto L_0x05c8;
                case -1978993182: goto L_0x05bd;
                case -1978990237: goto L_0x05b2;
                case -1936688988: goto L_0x05a7;
                case -1936688066: goto L_0x059c;
                case -1936688065: goto L_0x0590;
                case -1931988508: goto L_0x0584;
                case -1696512866: goto L_0x0578;
                case -1680025915: goto L_0x056c;
                case -1615810839: goto L_0x0560;
                case -1554255044: goto L_0x0554;
                case -1481772737: goto L_0x0548;
                case -1481772730: goto L_0x053c;
                case -1481772729: goto L_0x0530;
                case -1320080169: goto L_0x0524;
                case -1217592143: goto L_0x0518;
                case -1180384755: goto L_0x050c;
                case -1139198265: goto L_0x0500;
                case -1052835013: goto L_0x04f4;
                case -993250464: goto L_0x04e9;
                case -965403638: goto L_0x04dd;
                case -958336948: goto L_0x04d1;
                case -879245230: goto L_0x04c5;
                case -842500323: goto L_0x04b9;
                case -821392978: goto L_0x04ae;
                case -797483286: goto L_0x04a2;
                case -794946968: goto L_0x0496;
                case -788334647: goto L_0x048a;
                case -782144577: goto L_0x047e;
                case -575125681: goto L_0x0472;
                case -521118391: goto L_0x0466;
                case -430914369: goto L_0x045a;
                case -290434366: goto L_0x044e;
                case -282781963: goto L_0x0442;
                case -277133239: goto L_0x0436;
                case -173639913: goto L_0x042a;
                case -56598463: goto L_0x041e;
                case 2126: goto L_0x0412;
                case 2564: goto L_0x0406;
                case 2715: goto L_0x03fa;
                case 2719: goto L_0x03ee;
                case 3483: goto L_0x03e2;
                case 73405: goto L_0x03d6;
                case 75739: goto L_0x03ca;
                case 76779: goto L_0x03be;
                case 78669: goto L_0x03b2;
                case 79305: goto L_0x03a6;
                case 80618: goto L_0x039a;
                case 88274: goto L_0x038e;
                case 98846: goto L_0x0382;
                case 98848: goto L_0x0376;
                case 99329: goto L_0x036a;
                case 101481: goto L_0x035e;
                case 1513190: goto L_0x0353;
                case 1514184: goto L_0x0348;
                case 1514185: goto L_0x033d;
                case 2436959: goto L_0x0331;
                case 2463773: goto L_0x0325;
                case 2464648: goto L_0x0319;
                case 2689555: goto L_0x030d;
                case 3154429: goto L_0x0301;
                case 3284551: goto L_0x02f5;
                case 3351335: goto L_0x02e9;
                case 3386211: goto L_0x02dd;
                case 41325051: goto L_0x02d1;
                case 55178625: goto L_0x02c5;
                case 61542055: goto L_0x02ba;
                case 65355429: goto L_0x02ae;
                case 66214468: goto L_0x02a2;
                case 66214470: goto L_0x0296;
                case 66214473: goto L_0x028a;
                case 66215429: goto L_0x027e;
                case 66215431: goto L_0x0272;
                case 66215433: goto L_0x0266;
                case 66216390: goto L_0x025a;
                case 76402249: goto L_0x024e;
                case 76404105: goto L_0x0242;
                case 76404911: goto L_0x0236;
                case 80963634: goto L_0x022a;
                case 82882791: goto L_0x021e;
                case 98715550: goto L_0x0212;
                case 102844228: goto L_0x0206;
                case 165221241: goto L_0x01fb;
                case 182191441: goto L_0x01ef;
                case 245388979: goto L_0x01e3;
                case 287431619: goto L_0x01d7;
                case 307593612: goto L_0x01cb;
                case 308517133: goto L_0x01bf;
                case 316215098: goto L_0x01b3;
                case 316215116: goto L_0x01a7;
                case 316246811: goto L_0x019b;
                case 316246818: goto L_0x018f;
                case 407160593: goto L_0x0183;
                case 507412548: goto L_0x0177;
                case 793982701: goto L_0x016b;
                case 794038622: goto L_0x015f;
                case 794040393: goto L_0x0153;
                case 835649806: goto L_0x0147;
                case 917340916: goto L_0x013c;
                case 958008161: goto L_0x0130;
                case 1060579533: goto L_0x0124;
                case 1150207623: goto L_0x0118;
                case 1176899427: goto L_0x010c;
                case 1280332038: goto L_0x0100;
                case 1306947716: goto L_0x00f4;
                case 1349174697: goto L_0x00e8;
                case 1522194893: goto L_0x00dc;
                case 1691543273: goto L_0x00d0;
                case 1709443163: goto L_0x00c4;
                case 1865889110: goto L_0x00b8;
                case 1906253259: goto L_0x00ac;
                case 1977196784: goto L_0x00a0;
                case 2006372676: goto L_0x0094;
                case 2029784656: goto L_0x0088;
                case 2030379515: goto L_0x007c;
                case 2033393791: goto L_0x0070;
                case 2047190025: goto L_0x0064;
                case 2047252157: goto L_0x005a;
                case 2048319463: goto L_0x004e;
                case 2048855701: goto L_0x0042;
                default: goto L_0x0040;
            }     // Catch:{ all -> 0x0638 }
        L_0x0040:
            goto L_0x05ff
        L_0x0042:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 54
            goto L_0x0600
        L_0x004e:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 53
            goto L_0x0600
        L_0x005a:
            java.lang.String r4 = "ELUGA_Prim"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            goto L_0x0600
        L_0x0064:
            java.lang.String r2 = "ELUGA_Note"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 26
            goto L_0x0600
        L_0x0070:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 11
            goto L_0x0600
        L_0x007c:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 52
            goto L_0x0600
        L_0x0088:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 51
            goto L_0x0600
        L_0x0094:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 15
            goto L_0x0600
        L_0x00a0:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 57
            goto L_0x0600
        L_0x00ac:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 85
            goto L_0x0600
        L_0x00b8:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x0600
        L_0x00c4:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 56
            goto L_0x0600
        L_0x00d0:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 19
            goto L_0x0600
        L_0x00dc:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x0600
        L_0x00e8:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 49
            goto L_0x0600
        L_0x00f4:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 29
            goto L_0x0600
        L_0x0100:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 50
            goto L_0x0600
        L_0x010c:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 59
            goto L_0x0600
        L_0x0118:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 65
            goto L_0x0600
        L_0x0124:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 81
            goto L_0x0600
        L_0x0130:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 60
            goto L_0x0600
        L_0x013c:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 7
            goto L_0x0600
        L_0x0147:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 67
            goto L_0x0600
        L_0x0153:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 47
            goto L_0x0600
        L_0x015f:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 46
            goto L_0x0600
        L_0x016b:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 45
            goto L_0x0600
        L_0x0177:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 99
            goto L_0x0600
        L_0x0183:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 91
            goto L_0x0600
        L_0x018f:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x0600
        L_0x019b:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x0600
        L_0x01a7:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x0600
        L_0x01b3:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x0600
        L_0x01bf:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 9
            goto L_0x0600
        L_0x01cb:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 8
            goto L_0x0600
        L_0x01d7:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 48
            goto L_0x0600
        L_0x01e3:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 68
            goto L_0x0600
        L_0x01ef:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 20
            goto L_0x0600
        L_0x01fb:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 5
            goto L_0x0600
        L_0x0206:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 64
            goto L_0x0600
        L_0x0212:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 55
            goto L_0x0600
        L_0x021e:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x0600
        L_0x022a:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x0600
        L_0x0236:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 97
            goto L_0x0600
        L_0x0242:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 95
            goto L_0x0600
        L_0x024e:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 93
            goto L_0x0600
        L_0x025a:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 36
            goto L_0x0600
        L_0x0266:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 35
            goto L_0x0600
        L_0x0272:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 34
            goto L_0x0600
        L_0x027e:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 33
            goto L_0x0600
        L_0x028a:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 32
            goto L_0x0600
        L_0x0296:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 31
            goto L_0x0600
        L_0x02a2:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 30
            goto L_0x0600
        L_0x02ae:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 24
            goto L_0x0600
        L_0x02ba:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 4
            goto L_0x0600
        L_0x02c5:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 12
            goto L_0x0600
        L_0x02d1:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 69
            goto L_0x0600
        L_0x02dd:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 78
            goto L_0x0600
        L_0x02e9:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 71
            goto L_0x0600
        L_0x02f5:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 63
            goto L_0x0600
        L_0x0301:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 38
            goto L_0x0600
        L_0x030d:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x0600
        L_0x0319:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 96
            goto L_0x0600
        L_0x0325:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 94
            goto L_0x0600
        L_0x0331:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 79
            goto L_0x0600
        L_0x033d:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 2
            goto L_0x0600
        L_0x0348:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = r3
            goto L_0x0600
        L_0x0353:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = r0
            goto L_0x0600
        L_0x035e:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 37
            goto L_0x0600
        L_0x036a:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 23
            goto L_0x0600
        L_0x0376:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 22
            goto L_0x0600
        L_0x0382:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 21
            goto L_0x0600
        L_0x038e:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x0600
        L_0x039a:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 100
            goto L_0x0600
        L_0x03a6:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 92
            goto L_0x0600
        L_0x03b2:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 80
            goto L_0x0600
        L_0x03be:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 72
            goto L_0x0600
        L_0x03ca:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 66
            goto L_0x0600
        L_0x03d6:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 61
            goto L_0x0600
        L_0x03e2:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 70
            goto L_0x0600
        L_0x03ee:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x0600
        L_0x03fa:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x0600
        L_0x0406:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 98
            goto L_0x0600
        L_0x0412:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 16
            goto L_0x0600
        L_0x041e:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x0600
        L_0x042a:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 25
            goto L_0x0600
        L_0x0436:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x0600
        L_0x0442:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 13
            goto L_0x0600
        L_0x044e:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x0600
        L_0x045a:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 90
            goto L_0x0600
        L_0x0466:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 41
            goto L_0x0600
        L_0x0472:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 39
            goto L_0x0600
        L_0x047e:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 77
            goto L_0x0600
        L_0x048a:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x0600
        L_0x0496:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x0600
        L_0x04a2:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x0600
        L_0x04ae:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 6
            goto L_0x0600
        L_0x04b9:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 74
            goto L_0x0600
        L_0x04c5:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x0600
        L_0x04d1:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 28
            goto L_0x0600
        L_0x04dd:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x0600
        L_0x04e9:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 3
            goto L_0x0600
        L_0x04f4:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 73
            goto L_0x0600
        L_0x0500:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x0600
        L_0x050c:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 58
            goto L_0x0600
        L_0x0518:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 14
            goto L_0x0600
        L_0x0524:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 40
            goto L_0x0600
        L_0x0530:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 84
            goto L_0x0600
        L_0x053c:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 83
            goto L_0x0600
        L_0x0548:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 82
            goto L_0x0600
        L_0x0554:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x0600
        L_0x0560:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 89
            goto L_0x0600
        L_0x056c:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 17
            goto L_0x0600
        L_0x0578:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0600
        L_0x0584:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 10
            goto L_0x0600
        L_0x0590:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 88
            goto L_0x0600
        L_0x059c:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 87
            goto L_0x0600
        L_0x05a7:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 86
            goto L_0x0600
        L_0x05b2:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 76
            goto L_0x0600
        L_0x05bd:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 75
            goto L_0x0600
        L_0x05c8:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 18
            goto L_0x0600
        L_0x05d3:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 62
            goto L_0x0600
        L_0x05de:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 44
            goto L_0x0600
        L_0x05e9:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 43
            goto L_0x0600
        L_0x05f4:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x05ff
            r2 = 42
            goto L_0x0600
        L_0x05ff:
            r2 = r5
        L_0x0600:
            switch(r2) {
                case 0: goto L_0x0604;
                case 1: goto L_0x0604;
                case 2: goto L_0x0604;
                case 3: goto L_0x0604;
                case 4: goto L_0x0604;
                case 5: goto L_0x0604;
                case 6: goto L_0x0604;
                case 7: goto L_0x0604;
                case 8: goto L_0x0604;
                case 9: goto L_0x0604;
                case 10: goto L_0x0604;
                case 11: goto L_0x0604;
                case 12: goto L_0x0604;
                case 13: goto L_0x0604;
                case 14: goto L_0x0604;
                case 15: goto L_0x0604;
                case 16: goto L_0x0604;
                case 17: goto L_0x0604;
                case 18: goto L_0x0604;
                case 19: goto L_0x0604;
                case 20: goto L_0x0604;
                case 21: goto L_0x0604;
                case 22: goto L_0x0604;
                case 23: goto L_0x0604;
                case 24: goto L_0x0604;
                case 25: goto L_0x0604;
                case 26: goto L_0x0604;
                case 27: goto L_0x0604;
                case 28: goto L_0x0604;
                case 29: goto L_0x0604;
                case 30: goto L_0x0604;
                case 31: goto L_0x0604;
                case 32: goto L_0x0604;
                case 33: goto L_0x0604;
                case 34: goto L_0x0604;
                case 35: goto L_0x0604;
                case 36: goto L_0x0604;
                case 37: goto L_0x0604;
                case 38: goto L_0x0604;
                case 39: goto L_0x0604;
                case 40: goto L_0x0604;
                case 41: goto L_0x0604;
                case 42: goto L_0x0604;
                case 43: goto L_0x0604;
                case 44: goto L_0x0604;
                case 45: goto L_0x0604;
                case 46: goto L_0x0604;
                case 47: goto L_0x0604;
                case 48: goto L_0x0604;
                case 49: goto L_0x0604;
                case 50: goto L_0x0604;
                case 51: goto L_0x0604;
                case 52: goto L_0x0604;
                case 53: goto L_0x0604;
                case 54: goto L_0x0604;
                case 55: goto L_0x0604;
                case 56: goto L_0x0604;
                case 57: goto L_0x0604;
                case 58: goto L_0x0604;
                case 59: goto L_0x0604;
                case 60: goto L_0x0604;
                case 61: goto L_0x0604;
                case 62: goto L_0x0604;
                case 63: goto L_0x0604;
                case 64: goto L_0x0604;
                case 65: goto L_0x0604;
                case 66: goto L_0x0604;
                case 67: goto L_0x0604;
                case 68: goto L_0x0604;
                case 69: goto L_0x0604;
                case 70: goto L_0x0604;
                case 71: goto L_0x0604;
                case 72: goto L_0x0604;
                case 73: goto L_0x0604;
                case 74: goto L_0x0604;
                case 75: goto L_0x0604;
                case 76: goto L_0x0604;
                case 77: goto L_0x0604;
                case 78: goto L_0x0604;
                case 79: goto L_0x0604;
                case 80: goto L_0x0604;
                case 81: goto L_0x0604;
                case 82: goto L_0x0604;
                case 83: goto L_0x0604;
                case 84: goto L_0x0604;
                case 85: goto L_0x0604;
                case 86: goto L_0x0604;
                case 87: goto L_0x0604;
                case 88: goto L_0x0604;
                case 89: goto L_0x0604;
                case 90: goto L_0x0604;
                case 91: goto L_0x0604;
                case 92: goto L_0x0604;
                case 93: goto L_0x0604;
                case 94: goto L_0x0604;
                case 95: goto L_0x0604;
                case 96: goto L_0x0604;
                case 97: goto L_0x0604;
                case 98: goto L_0x0604;
                case 99: goto L_0x0604;
                case 100: goto L_0x0604;
                case 101: goto L_0x0604;
                case 102: goto L_0x0604;
                case 103: goto L_0x0604;
                case 104: goto L_0x0604;
                case 105: goto L_0x0604;
                case 106: goto L_0x0604;
                case 107: goto L_0x0604;
                case 108: goto L_0x0604;
                case 109: goto L_0x0604;
                case 110: goto L_0x0604;
                case 111: goto L_0x0604;
                case 112: goto L_0x0604;
                case 113: goto L_0x0604;
                case 114: goto L_0x0604;
                case 115: goto L_0x0604;
                case 116: goto L_0x0604;
                case 117: goto L_0x0604;
                case 118: goto L_0x0604;
                case 119: goto L_0x0604;
                case 120: goto L_0x0604;
                case 121: goto L_0x0604;
                case 122: goto L_0x0604;
                case 123: goto L_0x0604;
                default: goto L_0x0603;
            }     // Catch:{ all -> 0x0638 }
        L_0x0603:
            goto L_0x0606
        L_0x0604:
            f5943f1 = r3     // Catch:{ all -> 0x0638 }
        L_0x0606:
            java.lang.String r1 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5822d     // Catch:{ all -> 0x0638 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0638 }
            r4 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r4) goto L_0x0621
            r0 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r0) goto L_0x0617
            goto L_0x062a
        L_0x0617:
            java.lang.String r0 = "AFTN"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0638 }
            if (r0 == 0) goto L_0x062a
            r0 = r3
            goto L_0x062b
        L_0x0621:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x062a
            goto L_0x062b
        L_0x062a:
            r0 = r5
        L_0x062b:
            if (r0 == 0) goto L_0x0630
            if (r0 == r3) goto L_0x0630
            goto L_0x0632
        L_0x0630:
            f5943f1 = r3     // Catch:{ all -> 0x0638 }
        L_0x0632:
            f5942e1 = r3     // Catch:{ all -> 0x0638 }
        L_0x0634:
            monitor-exit(r7)     // Catch:{ all -> 0x0638 }
            boolean r7 = f5943f1
            return r7
        L_0x0638:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0638 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p262p0.C3192j.mo20094J0(java.lang.String):boolean");
    }

    /* renamed from: M0 */
    public void mo20095M0(MediaCodec mediaCodec, int i, long j) {
        C3148c0.m7745a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C3148c0.m7747c();
        mo20118n1(1);
    }

    /* renamed from: P0 */
    public C3194b mo20096P0(C2823a aVar, Format format, Format[] formatArr) {
        int N0;
        int i = format.f7571v;
        int i2 = format.f7572w;
        int Q0 = m8043Q0(aVar, format);
        if (formatArr.length == 1) {
            if (!(Q0 == -1 || (N0 = m8041N0(aVar, format.f7566q, format.f7571v, format.f7572w)) == -1)) {
                Q0 = Math.min((int) (((float) Q0) * 1.5f), N0);
            }
            return new C3194b(i, i2, Q0);
        }
        boolean z = false;
        for (Format format2 : formatArr) {
            if (aVar.mo18891l(format, format2, false)) {
                z |= format2.f7571v == -1 || format2.f7572w == -1;
                i = Math.max(i, format2.f7571v);
                i2 = Math.max(i2, format2.f7572w);
                Q0 = Math.max(Q0, m8043Q0(aVar, format2));
            }
        }
        if (z) {
            C3163m.m7880f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point O0 = m8042O0(aVar, format);
            if (O0 != null) {
                i = Math.max(i, O0.x);
                i2 = Math.max(i2, O0.y);
                Q0 = Math.max(Q0, m8041N0(aVar, format.f7566q, i, i2));
                C3163m.m7880f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new C3194b(i, i2, Q0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: R0 */
    public MediaFormat mo20097R0(Format format, C3194b bVar, float f, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.f7566q);
        mediaFormat.setInteger("width", format.f7571v);
        mediaFormat.setInteger("height", format.f7572w);
        C2826c.m6032e(mediaFormat, format.f7568s);
        C2826c.m6030c(mediaFormat, "frame-rate", format.f7573x);
        C2826c.m6031d(mediaFormat, "rotation-degrees", format.f7574y);
        C2826c.m6029b(mediaFormat, format.f7550C);
        mediaFormat.setInteger("max-width", bVar.f5982a);
        mediaFormat.setInteger("max-height", bVar.f5983b);
        C2826c.m6031d(mediaFormat, "max-input-size", bVar.f5984c);
        if (C3152e0.f5819a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m8039K0(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* renamed from: S */
    public void mo18327S(C2823a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f) {
        C3194b P0 = mo20096P0(aVar, format, mo18221y());
        this.f5981z0 = P0;
        MediaFormat R0 = mo20097R0(format, P0, f, this.f5978w0, this.f5967X0);
        if (this.f5945B0 == null) {
            C3151e.m7759g(mo20116l1(aVar));
            if (this.f5946C0 == null) {
                this.f5946C0 = DummySurface.m10713d(this.f5973r0, aVar.f4393f);
            }
            this.f5945B0 = this.f5946C0;
        }
        mediaCodec.configure(R0, this.f5945B0, mediaCrypto, 0);
        if (C3152e0.f5819a >= 23 && this.f5966W0) {
            this.f5968Y0 = new C3195c(mediaCodec);
        }
    }

    /* renamed from: U0 */
    public boolean mo20098U0(MediaCodec mediaCodec, int i, long j, long j2) {
        int H = mo18200H(j2);
        if (H == 0) {
            return false;
        }
        this.f7712p0.f3305i++;
        mo20118n1(this.f5954K0 + H);
        mo20100W();
        return true;
    }

    /* renamed from: V0 */
    public final void mo20099V0() {
        if (this.f5952I0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f5975t0.mo20142c(this.f5952I0, elapsedRealtime - this.f5951H0);
            this.f5952I0 = 0;
            this.f5951H0 = elapsedRealtime;
        }
    }

    @CallSuper
    /* renamed from: W */
    public void mo20100W() {
        super.mo20100W();
        this.f5954K0 = 0;
    }

    /* renamed from: W0 */
    public void mo20101W0() {
        if (!this.f5948E0) {
            this.f5948E0 = true;
            this.f5975t0.mo20152m(this.f5945B0);
        }
    }

    /* renamed from: X0 */
    public final void mo20102X0() {
        if (this.f5958O0 != -1 || this.f5959P0 != -1) {
            if (this.f5962S0 != this.f5958O0 || this.f5963T0 != this.f5959P0 || this.f5964U0 != this.f5960Q0 || this.f5965V0 != this.f5961R0) {
                this.f5975t0.mo20153n(this.f5958O0, this.f5959P0, this.f5960Q0, this.f5961R0);
                this.f5962S0 = this.f5958O0;
                this.f5963T0 = this.f5959P0;
                this.f5964U0 = this.f5960Q0;
                this.f5965V0 = this.f5961R0;
            }
        }
    }

    /* renamed from: Y0 */
    public final void mo20103Y0() {
        if (this.f5948E0) {
            this.f5975t0.mo20152m(this.f5945B0);
        }
    }

    /* renamed from: Z0 */
    public final void mo20104Z0() {
        if (this.f5962S0 != -1 || this.f5963T0 != -1) {
            this.f5975t0.mo20153n(this.f5962S0, this.f5963T0, this.f5964U0, this.f5965V0);
        }
    }

    /* renamed from: a1 */
    public final void mo20105a1(long j, long j2, Format format) {
        C3196k kVar = this.f5972c1;
        if (kVar != null) {
            kVar.mo20121a(j, j2, format);
        }
    }

    /* renamed from: b0 */
    public boolean mo20106b0() {
        return this.f5966W0;
    }

    /* renamed from: b1 */
    public void mo20107b1(long j) {
        Format G0 = mo24019G0(j);
        if (G0 != null) {
            mo20108c1(mo24025Y(), G0.f7571v, G0.f7572w);
        }
        mo20102X0();
        mo20101W0();
        mo18339p0(j);
    }

    /* renamed from: c */
    public boolean mo18330c() {
        Surface surface;
        if (super.mo18330c() && (this.f5948E0 || (((surface = this.f5946C0) != null && this.f5945B0 == surface) || mo24025Y() == null || this.f5966W0))) {
            this.f5950G0 = -9223372036854775807L;
            return true;
        } else if (this.f5950G0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f5950G0) {
                return true;
            }
            this.f5950G0 = -9223372036854775807L;
            return false;
        }
    }

    /* renamed from: c0 */
    public float mo18331c0(float f, Format format, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.f7573x;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* renamed from: c1 */
    public final void mo20108c1(MediaCodec mediaCodec, int i, int i2) {
        this.f5958O0 = i;
        this.f5959P0 = i2;
        this.f5961R0 = this.f5957N0;
        if (C3152e0.f5819a >= 21) {
            int i3 = this.f5956M0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f5958O0;
                this.f5958O0 = this.f5959P0;
                this.f5959P0 = i4;
                this.f5961R0 = 1.0f / this.f5961R0;
            }
        } else {
            this.f5960Q0 = this.f5956M0;
        }
        mediaCodec.setVideoScalingMode(this.f5947D0);
    }

    /* renamed from: d1 */
    public void mo20109d1(MediaCodec mediaCodec, int i, long j) {
        mo20102X0();
        C3148c0.m7745a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C3148c0.m7747c();
        this.f5955L0 = SystemClock.elapsedRealtime() * 1000;
        this.f7712p0.f3301e++;
        this.f5953J0 = 0;
        mo20101W0();
    }

    @TargetApi(21)
    /* renamed from: e1 */
    public void mo20110e1(MediaCodec mediaCodec, int i, long j, long j2) {
        mo20102X0();
        C3148c0.m7745a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C3148c0.m7747c();
        this.f5955L0 = SystemClock.elapsedRealtime() * 1000;
        this.f7712p0.f3301e++;
        this.f5953J0 = 0;
        mo20101W0();
    }

    /* renamed from: f1 */
    public final void mo20111f1() {
        this.f5950G0 = this.f5976u0 > 0 ? SystemClock.elapsedRealtime() + this.f5976u0 : -9223372036854775807L;
    }

    /* renamed from: h1 */
    public final void mo20112h1(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f5946C0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                C2823a a0 = mo24027a0();
                if (a0 != null && mo20116l1(a0)) {
                    surface = DummySurface.m10713d(this.f5973r0, a0.f4393f);
                    this.f5946C0 = surface;
                }
            }
        }
        if (this.f5945B0 != surface) {
            this.f5945B0 = surface;
            int state = getState();
            if (state == 1 || state == 2) {
                MediaCodec Y = mo24025Y();
                if (C3152e0.f5819a < 23 || Y == null || surface == null || this.f5944A0) {
                    mo20119w0();
                    mo24034l0();
                } else {
                    m8046g1(Y, surface);
                }
            }
            if (surface == null || surface == this.f5946C0) {
                mo20093I0();
                mo20092H0();
                return;
            }
            mo20104Z0();
            mo20092H0();
            if (state == 2) {
                mo20111f1();
            }
        } else if (surface != null && surface != this.f5946C0) {
            mo20104Z0();
            mo20103Y0();
        }
    }

    /* renamed from: i1 */
    public boolean mo20113i1(long j, long j2) {
        return m8045T0(j);
    }

    /* renamed from: j1 */
    public boolean mo20114j1(long j, long j2) {
        return m8044S0(j);
    }

    /* renamed from: k1 */
    public boolean mo20115k1(long j, long j2) {
        return m8044S0(j) && j2 > 100000;
    }

    /* renamed from: l1 */
    public final boolean mo20116l1(C2823a aVar) {
        return C3152e0.f5819a >= 23 && !this.f5966W0 && !mo20094J0(aVar.f4388a) && (!aVar.f4393f || DummySurface.m10712c(this.f5973r0));
    }

    /* renamed from: m0 */
    public void mo18336m0(String str, long j, long j2) {
        this.f5975t0.mo20140a(str, j, j2);
        this.f5944A0 = mo20094J0(str);
    }

    /* renamed from: m1 */
    public void mo20117m1(MediaCodec mediaCodec, int i, long j) {
        C3148c0.m7745a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C3148c0.m7747c();
        this.f7712p0.f3302f++;
    }

    /* renamed from: n0 */
    public void mo18337n0(Format format) {
        super.mo18337n0(format);
        this.f5975t0.mo20144e(format);
        this.f5957N0 = format.f7575z;
        this.f5956M0 = format.f7574y;
    }

    /* renamed from: n1 */
    public void mo20118n1(int i) {
        C2633d dVar = this.f7712p0;
        dVar.f3303g += i;
        this.f5952I0 += i;
        int i2 = this.f5953J0 + i;
        this.f5953J0 = i2;
        dVar.f3304h = Math.max(i2, dVar.f3304h);
        int i3 = this.f5977v0;
        if (i3 > 0 && this.f5952I0 >= i3) {
            mo20099V0();
        }
    }

    /* renamed from: o0 */
    public void mo18338o0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        mo20108c1(mediaCodec, i, i2);
    }

    /* renamed from: p */
    public void mo18210p(int i, @Nullable Object obj) {
        if (i == 1) {
            mo20112h1((Surface) obj);
        } else if (i == 4) {
            this.f5947D0 = ((Integer) obj).intValue();
            MediaCodec Y = mo24025Y();
            if (Y != null) {
                Y.setVideoScalingMode(this.f5947D0);
            }
        } else if (i == 6) {
            this.f5972c1 = (C3196k) obj;
        } else {
            super.mo18210p(i, obj);
        }
    }

    @CallSuper
    /* renamed from: p0 */
    public void mo18339p0(long j) {
        this.f5954K0--;
        while (true) {
            int i = this.f5971b1;
            if (i != 0 && j >= this.f5980y0[0]) {
                long[] jArr = this.f5979x0;
                this.f5970a1 = jArr[0];
                int i2 = i - 1;
                this.f5971b1 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f5980y0;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f5971b1);
            } else {
                return;
            }
        }
    }

    @CallSuper
    /* renamed from: q0 */
    public void mo18340q0(C2634e eVar) {
        this.f5954K0++;
        this.f5969Z0 = Math.max(eVar.f3308n, this.f5969Z0);
        if (C3152e0.f5819a < 23 && this.f5966W0) {
            mo20107b1(eVar.f3308n);
        }
    }

    /* renamed from: s0 */
    public boolean mo18341s0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, Format format) {
        long j4 = j;
        long j5 = j2;
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j6 = j3;
        if (this.f5949F0 == -9223372036854775807L) {
            this.f5949F0 = j4;
        }
        long j7 = j6 - this.f5970a1;
        if (z) {
            mo20117m1(mediaCodec2, i3, j7);
            return true;
        }
        long j8 = j6 - j4;
        if (this.f5945B0 != this.f5946C0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            boolean z2 = getState() == 2;
            if (!this.f5948E0 || (z2 && mo20115k1(j8, elapsedRealtime - this.f5955L0))) {
                long nanoTime = System.nanoTime();
                mo20105a1(j7, nanoTime, format);
                if (C3152e0.f5819a >= 21) {
                    mo20110e1(mediaCodec, i, j7, nanoTime);
                    return true;
                }
                mo20109d1(mediaCodec2, i3, j7);
                return true;
            }
            if (z2 && j4 != this.f5949F0) {
                long nanoTime2 = System.nanoTime();
                long b = this.f5974s0.mo20122b(j6, ((j8 - (elapsedRealtime - j5)) * 1000) + nanoTime2);
                long j9 = (b - nanoTime2) / 1000;
                if (mo20113i1(j9, j5) && mo20098U0(mediaCodec, i, j7, j)) {
                    return false;
                }
                if (mo20114j1(j9, j5)) {
                    mo20095M0(mediaCodec2, i3, j7);
                    return true;
                } else if (C3152e0.f5819a >= 21) {
                    if (j9 < 50000) {
                        mo20105a1(j7, b, format);
                        mo20110e1(mediaCodec, i, j7, b);
                        return true;
                    }
                } else if (j9 < 30000) {
                    if (j9 > 11000) {
                        try {
                            Thread.sleep((j9 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    mo20105a1(j7, b, format);
                    mo20109d1(mediaCodec2, i3, j7);
                    return true;
                }
            }
            return false;
        } else if (!m8044S0(j8)) {
            return false;
        } else {
            mo20117m1(mediaCodec2, i3, j7);
            return true;
        }
    }

    @CallSuper
    /* renamed from: w0 */
    public void mo20119w0() {
        try {
            super.mo20119w0();
        } finally {
            this.f5954K0 = 0;
            Surface surface = this.f5946C0;
            if (surface != null) {
                if (this.f5945B0 == surface) {
                    this.f5945B0 = null;
                }
                this.f5946C0.release();
                this.f5946C0 = null;
            }
        }
    }
}
