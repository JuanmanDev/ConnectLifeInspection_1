package p040c.p200q.p201a.p219b.p221c0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.material.internal.ManufacturerUtils;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.C2589c;
import p040c.p200q.p201a.p219b.C3206r;
import p040c.p200q.p201a.p219b.p221c0.C2608l;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p223e0.C2656m;
import p040c.p200q.p201a.p219b.p234g0.C2823a;
import p040c.p200q.p201a.p219b.p234g0.C2824b;
import p040c.p200q.p201a.p219b.p234g0.C2826c;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3165o;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

@TargetApi(16)
/* renamed from: c.q.a.b.c0.s */
/* compiled from: MediaCodecAudioRenderer */
public class C2618s extends MediaCodecRenderer implements C3165o {

    /* renamed from: A0 */
    public int f3188A0;

    /* renamed from: B0 */
    public int f3189B0;

    /* renamed from: C0 */
    public int f3190C0;

    /* renamed from: D0 */
    public int f3191D0;

    /* renamed from: E0 */
    public long f3192E0;

    /* renamed from: F0 */
    public boolean f3193F0;

    /* renamed from: G0 */
    public boolean f3194G0;

    /* renamed from: H0 */
    public long f3195H0;

    /* renamed from: I0 */
    public int f3196I0;

    /* renamed from: r0 */
    public final Context f3197r0;

    /* renamed from: s0 */
    public final C2608l.C2609a f3198s0;

    /* renamed from: t0 */
    public final AudioSink f3199t0;

    /* renamed from: u0 */
    public final long[] f3200u0;

    /* renamed from: v0 */
    public int f3201v0;

    /* renamed from: w0 */
    public boolean f3202w0;

    /* renamed from: x0 */
    public boolean f3203x0;

    /* renamed from: y0 */
    public boolean f3204y0;

    /* renamed from: z0 */
    public MediaFormat f3205z0;

    /* renamed from: c.q.a.b.c0.s$b */
    /* compiled from: MediaCodecAudioRenderer */
    public final class C2620b implements AudioSink.C3996a {
        public C2620b() {
        }

        /* renamed from: a */
        public void mo18343a(int i) {
            C2618s.this.f3198s0.mo18257a(i);
            C2618s.this.mo18324P0(i);
        }

        /* renamed from: b */
        public void mo18344b(int i, long j, long j2) {
            C2618s.this.f3198s0.mo18258b(i, j, j2);
            C2618s.this.mo18326R0(i, j, j2);
        }

        /* renamed from: c */
        public void mo18345c() {
            C2618s.this.mo18325Q0();
            boolean unused = C2618s.this.f3194G0 = true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2618s(Context context, C2824b bVar, @Nullable C2650i<C2656m> iVar, boolean z, @Nullable Handler handler, @Nullable C2608l lVar, @Nullable C2602i iVar2, AudioProcessor... audioProcessorArr) {
        this(context, bVar, iVar, z, handler, lVar, new DefaultAudioSink(iVar2, audioProcessorArr));
        C2602i iVar3 = iVar2;
    }

    /* renamed from: K0 */
    public static boolean m4942K0(String str) {
        return C3152e0.f5819a < 24 && "OMX.SEC.aac.dec".equals(str) && ManufacturerUtils.SAMSUNG.equals(C3152e0.f5821c) && (C3152e0.f5820b.startsWith("zeroflte") || C3152e0.f5820b.startsWith("herolte") || C3152e0.f5820b.startsWith("heroqlte"));
    }

    /* renamed from: L0 */
    public static boolean m4943L0(String str) {
        return C3152e0.f5819a < 21 && "OMX.SEC.mp3.dec".equals(str) && ManufacturerUtils.SAMSUNG.equals(C3152e0.f5821c) && (C3152e0.f5820b.startsWith("baffin") || C3152e0.f5820b.startsWith("grand") || C3152e0.f5820b.startsWith("fortuna") || C3152e0.f5820b.startsWith("gprimelte") || C3152e0.f5820b.startsWith("j2y18lte") || C3152e0.f5820b.startsWith("ms01"));
    }

    /* renamed from: A */
    public void mo18193A() {
        try {
            this.f3195H0 = -9223372036854775807L;
            this.f3196I0 = 0;
            this.f3199t0.release();
            try {
                super.mo18193A();
            } finally {
                this.f7712p0.mo18403a();
                this.f3198s0.mo18260d(this.f7712p0);
            }
        } catch (Throwable th) {
            super.mo18193A();
            throw th;
        } finally {
            this.f7712p0.mo18403a();
            this.f3198s0.mo18260d(this.f7712p0);
        }
    }

    /* renamed from: B */
    public void mo18194B(boolean z) {
        super.mo18194B(z);
        this.f3198s0.mo18261e(this.f7712p0);
        int i = mo18219w().f6047a;
        if (i != 0) {
            this.f3199t0.mo23947r(i);
        } else {
            this.f3199t0.mo23940m();
        }
    }

    /* renamed from: C */
    public void mo18195C(long j, boolean z) {
        super.mo18195C(j, z);
        this.f3199t0.mo23931a();
        this.f3192E0 = j;
        this.f3193F0 = true;
        this.f3194G0 = true;
        this.f3195H0 = -9223372036854775807L;
        this.f3196I0 = 0;
    }

    /* renamed from: D */
    public void mo18196D() {
        super.mo18196D();
        this.f3199t0.play();
    }

    /* renamed from: E */
    public void mo18197E() {
        mo18328S0();
        this.f3199t0.pause();
        super.mo18197E();
    }

    /* renamed from: E0 */
    public int mo18318E0(C2824b bVar, C2650i<C2656m> iVar, Format format) {
        boolean z;
        String str = format.f7566q;
        if (!C3166p.m7899k(str)) {
            return 0;
        }
        int i = C3152e0.f5819a >= 21 ? 32 : 0;
        boolean I = C2589c.m4787I(iVar, format.f7569t);
        int i2 = 4;
        int i3 = 8;
        if (I && mo18320J0(format.f7551D, str) && bVar.mo18896a() != null) {
            return i | 8 | 4;
        }
        if (("audio/raw".equals(str) && !this.f3199t0.mo23935h(format.f7551D, format.f7553F)) || !this.f3199t0.mo23935h(format.f7551D, 2)) {
            return 1;
        }
        DrmInitData drmInitData = format.f7569t;
        if (drmInitData != null) {
            z = false;
            for (int i4 = 0; i4 < drmInitData.f7658n; i4++) {
                z |= drmInitData.mo23985e(i4).f7664p;
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
        } else if (!I) {
            return 2;
        } else {
            C2823a aVar = b.get(0);
            boolean j = aVar.mo18889j(format);
            if (j && aVar.mo18890k(format)) {
                i3 = 16;
            }
            if (!j) {
                i2 = 3;
            }
            return i3 | i | i2;
        }
    }

    /* renamed from: F */
    public void mo18198F(Format[] formatArr, long j) {
        super.mo18198F(formatArr, j);
        if (this.f3195H0 != -9223372036854775807L) {
            int i = this.f3196I0;
            if (i == this.f3200u0.length) {
                C3163m.m7880f("MediaCodecAudioRenderer", "Too many stream changes, so dropping change at " + this.f3200u0[this.f3196I0 - 1]);
            } else {
                this.f3196I0 = i + 1;
            }
            this.f3200u0[this.f3196I0 - 1] = this.f3195H0;
        }
    }

    /* renamed from: J */
    public int mo18319J(MediaCodec mediaCodec, C2823a aVar, Format format, Format format2) {
        if (mo18321M0(aVar, format2) <= this.f3201v0 && aVar.mo18891l(format, format2, true) && format.f7554G == 0 && format.f7555H == 0 && format2.f7554G == 0 && format2.f7555H == 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: J0 */
    public boolean mo18320J0(int i, String str) {
        return this.f3199t0.mo23935h(i, C3166p.m7891c(str));
    }

    /* renamed from: M0 */
    public final int mo18321M0(C2823a aVar, Format format) {
        PackageManager packageManager;
        if (C3152e0.f5819a < 24 && "OMX.google.raw.decoder".equals(aVar.f4388a)) {
            boolean z = true;
            if (C3152e0.f5819a == 23 && (packageManager = this.f3197r0.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            if (z) {
                return -1;
            }
        }
        return format.f7567r;
    }

    /* renamed from: N0 */
    public int mo18322N0(C2823a aVar, Format format, Format[] formatArr) {
        int M0 = mo18321M0(aVar, format);
        if (formatArr.length == 1) {
            return M0;
        }
        for (Format format2 : formatArr) {
            if (aVar.mo18891l(format, format2, false)) {
                M0 = Math.max(M0, mo18321M0(aVar, format2));
            }
        }
        return M0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: O0 */
    public MediaFormat mo18323O0(Format format, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.f7551D);
        mediaFormat.setInteger("sample-rate", format.f7552E);
        C2826c.m6032e(mediaFormat, format.f7568s);
        C2826c.m6031d(mediaFormat, "max-input-size", i);
        if (C3152e0.f5819a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        return mediaFormat;
    }

    /* renamed from: P0 */
    public void mo18324P0(int i) {
    }

    /* renamed from: Q0 */
    public void mo18325Q0() {
    }

    /* renamed from: R0 */
    public void mo18326R0(int i, long j, long j2) {
    }

    /* renamed from: S */
    public void mo18327S(C2823a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f) {
        this.f3201v0 = mo18322N0(aVar, format, mo18221y());
        this.f3203x0 = m4942K0(aVar.f4388a);
        this.f3204y0 = m4943L0(aVar.f4388a);
        this.f3202w0 = aVar.f4394g;
        String str = aVar.f4389b;
        if (str == null) {
            str = "audio/raw";
        }
        MediaFormat O0 = mo18323O0(format, str, this.f3201v0, f);
        mediaCodec.configure(O0, (Surface) null, mediaCrypto, 0);
        if (this.f3202w0) {
            this.f3205z0 = O0;
            O0.setString("mime", format.f7566q);
            return;
        }
        this.f3205z0 = null;
    }

    /* renamed from: S0 */
    public final void mo18328S0() {
        long l = this.f3199t0.mo23939l(mo18329b());
        if (l != Long.MIN_VALUE) {
            if (!this.f3194G0) {
                l = Math.max(this.f3192E0, l);
            }
            this.f3192E0 = l;
            this.f3194G0 = false;
        }
    }

    /* renamed from: b */
    public boolean mo18329b() {
        return super.mo18329b() && this.f3199t0.mo23932b();
    }

    /* renamed from: c */
    public boolean mo18330c() {
        return this.f3199t0.mo23938k() || super.mo18330c();
    }

    /* renamed from: c0 */
    public float mo18331c0(float f, Format format, Format[] formatArr) {
        int i = -1;
        for (Format format2 : formatArr) {
            int i2 = format2.f7552E;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* renamed from: d0 */
    public List<C2823a> mo18332d0(C2824b bVar, Format format, boolean z) {
        C2823a a;
        if (!mo18320J0(format.f7551D, format.f7566q) || (a = bVar.mo18896a()) == null) {
            return super.mo18332d0(bVar, format, z);
        }
        return Collections.singletonList(a);
    }

    /* renamed from: f */
    public C3206r mo18333f() {
        return this.f3199t0.mo23933f();
    }

    /* renamed from: g */
    public C3206r mo18334g(C3206r rVar) {
        return this.f3199t0.mo23934g(rVar);
    }

    /* renamed from: m */
    public long mo18335m() {
        if (getState() == 2) {
            mo18328S0();
        }
        return this.f3192E0;
    }

    /* renamed from: m0 */
    public void mo18336m0(String str, long j, long j2) {
        this.f3198s0.mo18259c(str, j, j2);
    }

    /* renamed from: n0 */
    public void mo18337n0(Format format) {
        super.mo18337n0(format);
        this.f3198s0.mo18262f(format);
        this.f3188A0 = "audio/raw".equals(format.f7566q) ? format.f7553F : 2;
        this.f3189B0 = format.f7551D;
        this.f3190C0 = format.f7554G;
        this.f3191D0 = format.f7555H;
    }

    /* renamed from: o0 */
    public void mo18338o0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.f3205z0;
        if (mediaFormat2 != null) {
            i = C3166p.m7891c(mediaFormat2.getString("mime"));
            mediaFormat = this.f3205z0;
        } else {
            i = this.f3188A0;
        }
        int i3 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f3203x0 || integer != 6 || (i2 = this.f3189B0) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i2];
            for (int i4 = 0; i4 < this.f3189B0; i4++) {
                iArr[i4] = i4;
            }
        }
        try {
            this.f3199t0.mo23936i(i3, integer, integer2, 0, iArr, this.f3190C0, this.f3191D0);
        } catch (AudioSink.ConfigurationException e) {
            throw ExoPlaybackException.createForRenderer(e, mo18220x());
        }
    }

    /* renamed from: p */
    public void mo18210p(int i, @Nullable Object obj) {
        if (i == 2) {
            this.f3199t0.mo23943p(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f3199t0.mo23941n((C2599h) obj);
        } else if (i != 5) {
            super.mo18210p(i, obj);
        } else {
            this.f3199t0.mo23950t((C2614o) obj);
        }
    }

    @CallSuper
    /* renamed from: p0 */
    public void mo18339p0(long j) {
        while (this.f3196I0 != 0 && j >= this.f3200u0[0]) {
            this.f3199t0.mo23942o();
            int i = this.f3196I0 - 1;
            this.f3196I0 = i;
            long[] jArr = this.f3200u0;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    /* renamed from: q0 */
    public void mo18340q0(C2634e eVar) {
        if (this.f3193F0 && !eVar.mo18389m()) {
            if (Math.abs(eVar.f3308n - this.f3192E0) > 500000) {
                this.f3192E0 = eVar.f3308n;
            }
            this.f3193F0 = false;
        }
        this.f3195H0 = Math.max(eVar.f3308n, this.f3195H0);
    }

    /* renamed from: s0 */
    public boolean mo18341s0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, Format format) {
        if (this.f3204y0 && j3 == 0 && (i2 & 4) != 0) {
            long j4 = this.f3195H0;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
        }
        if (this.f3202w0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f7712p0.f3302f++;
            this.f3199t0.mo23942o();
            return true;
        } else {
            try {
                if (!this.f3199t0.mo23946q(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f7712p0.f3301e++;
                return true;
            } catch (AudioSink.InitializationException | AudioSink.WriteException e) {
                throw ExoPlaybackException.createForRenderer(e, mo18220x());
            }
        }
    }

    /* renamed from: u */
    public C3165o mo18217u() {
        return this;
    }

    /* renamed from: x0 */
    public void mo18342x0() {
        try {
            this.f3199t0.mo23937j();
        } catch (AudioSink.WriteException e) {
            throw ExoPlaybackException.createForRenderer(e, mo18220x());
        }
    }

    public C2618s(Context context, C2824b bVar, @Nullable C2650i<C2656m> iVar, boolean z, @Nullable Handler handler, @Nullable C2608l lVar, AudioSink audioSink) {
        super(1, bVar, iVar, z, 44100.0f);
        this.f3197r0 = context.getApplicationContext();
        this.f3199t0 = audioSink;
        this.f3195H0 = -9223372036854775807L;
        this.f3200u0 = new long[10];
        this.f3198s0 = new C2608l.C2609a(handler, lVar);
        audioSink.mo23949s(new C2620b());
    }
}
