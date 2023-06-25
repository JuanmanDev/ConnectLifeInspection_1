package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p219b.C2589c;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.p222d0.C2633d;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p223e0.C2656m;
import p040c.p200q.p201a.p219b.p234g0.C2823a;
import p040c.p200q.p201a.p219b.p234g0.C2824b;
import p040c.p200q.p201a.p219b.p261o0.C3144a0;
import p040c.p200q.p201a.p219b.p261o0.C3148c0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3168q;

@TargetApi(16)
public abstract class MediaCodecRenderer extends C2589c {

    /* renamed from: q0 */
    public static final byte[] f7670q0 = C3152e0.m7825y("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    public final C3144a0<Format> f7671A;

    /* renamed from: B */
    public final List<Long> f7672B;

    /* renamed from: C */
    public final MediaCodec.BufferInfo f7673C;

    /* renamed from: D */
    public Format f7674D;

    /* renamed from: E */
    public Format f7675E;

    /* renamed from: F */
    public Format f7676F;

    /* renamed from: G */
    public DrmSession<C2656m> f7677G;

    /* renamed from: H */
    public DrmSession<C2656m> f7678H;

    /* renamed from: I */
    public MediaCodec f7679I;

    /* renamed from: J */
    public float f7680J;

    /* renamed from: K */
    public float f7681K;

    /* renamed from: L */
    public boolean f7682L;
    @Nullable

    /* renamed from: M */
    public ArrayDeque<C2823a> f7683M;
    @Nullable

    /* renamed from: N */
    public DecoderInitializationException f7684N;
    @Nullable

    /* renamed from: O */
    public C2823a f7685O;

    /* renamed from: P */
    public int f7686P;

    /* renamed from: Q */
    public boolean f7687Q;

    /* renamed from: R */
    public boolean f7688R;

    /* renamed from: S */
    public boolean f7689S;

    /* renamed from: T */
    public boolean f7690T;

    /* renamed from: U */
    public boolean f7691U;

    /* renamed from: V */
    public boolean f7692V;

    /* renamed from: W */
    public boolean f7693W;

    /* renamed from: X */
    public boolean f7694X;

    /* renamed from: Y */
    public boolean f7695Y;

    /* renamed from: Z */
    public ByteBuffer[] f7696Z;

    /* renamed from: a0 */
    public ByteBuffer[] f7697a0;

    /* renamed from: b0 */
    public long f7698b0;

    /* renamed from: c0 */
    public int f7699c0;

    /* renamed from: d0 */
    public int f7700d0;

    /* renamed from: e0 */
    public ByteBuffer f7701e0;

    /* renamed from: f0 */
    public boolean f7702f0;

    /* renamed from: g0 */
    public boolean f7703g0;

    /* renamed from: h0 */
    public int f7704h0;

    /* renamed from: i0 */
    public int f7705i0;

    /* renamed from: j0 */
    public boolean f7706j0;

    /* renamed from: k0 */
    public boolean f7707k0;

    /* renamed from: l0 */
    public boolean f7708l0;

    /* renamed from: m0 */
    public boolean f7709m0;

    /* renamed from: n0 */
    public boolean f7710n0;

    /* renamed from: o0 */
    public boolean f7711o0;

    /* renamed from: p0 */
    public C2633d f7712p0;

    /* renamed from: t */
    public final C2824b f7713t;
    @Nullable

    /* renamed from: u */
    public final C2650i<C2656m> f7714u;

    /* renamed from: v */
    public final boolean f7715v;

    /* renamed from: w */
    public final float f7716w;

    /* renamed from: x */
    public final C2634e f7717x;

    /* renamed from: y */
    public final C2634e f7718y;

    /* renamed from: z */
    public final C3030l f7719z;

    public MediaCodecRenderer(int i, C2824b bVar, @Nullable C2650i<C2656m> iVar, boolean z, float f) {
        super(i);
        C3151e.m7759g(C3152e0.f5819a >= 16);
        C3151e.m7757e(bVar);
        this.f7713t = bVar;
        this.f7714u = iVar;
        this.f7715v = z;
        this.f7716w = f;
        this.f7717x = new C2634e(0);
        this.f7718y = C2634e.m5077x();
        this.f7719z = new C3030l();
        this.f7671A = new C3144a0<>();
        this.f7672B = new ArrayList();
        this.f7673C = new MediaCodec.BufferInfo();
        this.f7704h0 = 0;
        this.f7705i0 = 0;
        this.f7681K = -1.0f;
        this.f7680J = 1.0f;
    }

    /* renamed from: L */
    public static boolean m10390L(String str, Format format) {
        return C3152e0.f5819a < 21 && format.f7568s.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: M */
    public static boolean m10391M(String str) {
        return (C3152e0.f5819a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (C3152e0.f5819a <= 19 && (("hb2000".equals(C3152e0.f5820b) || "stvm8".equals(C3152e0.f5820b)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    /* renamed from: N */
    public static boolean m10392N(String str) {
        return C3152e0.f5819a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: O */
    public static boolean m10393O(C2823a aVar) {
        String str = aVar.f4388a;
        return (C3152e0.f5819a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) || ("Amazon".equals(C3152e0.f5821c) && "AFTS".equals(C3152e0.f5822d) && aVar.f4393f);
    }

    /* renamed from: P */
    public static boolean m10394P(String str) {
        int i = C3152e0.f5819a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (C3152e0.f5819a == 19 && C3152e0.f5822d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: Q */
    public static boolean m10395Q(String str, Format format) {
        if (C3152e0.f5819a > 18 || format.f7551D != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public static boolean m10396R(String str) {
        return C3152e0.f5822d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: f0 */
    public static MediaCodec.CryptoInfo m10397f0(C2634e eVar, int i) {
        MediaCodec.CryptoInfo a = eVar.f3306l.mo18393a();
        if (i == 0) {
            return a;
        }
        if (a.numBytesOfClearData == null) {
            a.numBytesOfClearData = new int[1];
        }
        int[] iArr = a.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return a;
    }

    /* renamed from: A */
    public void mo18193A() {
        this.f7674D = null;
        this.f7683M = null;
        try {
            mo20119w0();
            try {
                if (this.f7677G != null) {
                    this.f7714u.mo18471f(this.f7677G);
                }
                try {
                    if (!(this.f7678H == null || this.f7678H == this.f7677G)) {
                        this.f7714u.mo18471f(this.f7678H);
                    }
                } finally {
                    this.f7677G = null;
                    this.f7678H = null;
                }
            } catch (Throwable th) {
                if (!(this.f7678H == null || this.f7678H == this.f7677G)) {
                    this.f7714u.mo18471f(this.f7678H);
                }
                throw th;
            } finally {
                this.f7677G = null;
                this.f7678H = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.f7678H == null || this.f7678H == this.f7677G)) {
                    this.f7714u.mo18471f(this.f7678H);
                }
                throw th2;
            } finally {
                this.f7677G = null;
                this.f7678H = null;
            }
        } finally {
        }
    }

    /* renamed from: A0 */
    public final void mo24015A0() {
        this.f7700d0 = -1;
        this.f7701e0 = null;
    }

    /* renamed from: B */
    public void mo18194B(boolean z) {
        this.f7712p0 = new C2633d();
    }

    /* renamed from: B0 */
    public boolean mo20091B0(C2823a aVar) {
        return true;
    }

    /* renamed from: C */
    public void mo18195C(long j, boolean z) {
        this.f7708l0 = false;
        this.f7709m0 = false;
        if (this.f7679I != null) {
            mo20100W();
        }
        this.f7671A.mo19937c();
    }

    /* renamed from: C0 */
    public final boolean mo24016C0(long j) {
        int size = this.f7672B.size();
        for (int i = 0; i < size; i++) {
            if (this.f7672B.get(i).longValue() == j) {
                this.f7672B.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public void mo18196D() {
    }

    /* renamed from: D0 */
    public final boolean mo24017D0(boolean z) {
        if (this.f7677G == null || (!z && this.f7715v)) {
            return false;
        }
        int state = this.f7677G.getState();
        if (state == 1) {
            throw ExoPlaybackException.createForRenderer(this.f7677G.mo18441c(), mo18220x());
        } else if (state != 4) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: E */
    public void mo18197E() {
    }

    /* renamed from: E0 */
    public abstract int mo18318E0(C2824b bVar, C2650i<C2656m> iVar, Format format);

    /* renamed from: F0 */
    public final void mo24018F0() {
        Format format = this.f7674D;
        if (format != null && C3152e0.f5819a >= 23) {
            float c0 = mo18331c0(this.f7680J, format, mo18221y());
            if (this.f7681K != c0) {
                this.f7681K = c0;
                if (this.f7679I != null && this.f7705i0 == 0) {
                    int i = (c0 > -1.0f ? 1 : (c0 == -1.0f ? 0 : -1));
                    if (i == 0 && this.f7682L) {
                        mo24038v0();
                    } else if (i == 0) {
                    } else {
                        if (this.f7682L || c0 > this.f7716w) {
                            Bundle bundle = new Bundle();
                            bundle.putFloat("operating-rate", c0);
                            this.f7679I.setParameters(bundle);
                            this.f7682L = true;
                        }
                    }
                }
            }
        }
    }

    @Nullable
    /* renamed from: G0 */
    public final Format mo24019G0(long j) {
        Format h = this.f7671A.mo19941h(j);
        if (h != null) {
            this.f7676F = h;
        }
        return h;
    }

    /* renamed from: J */
    public abstract int mo18319J(MediaCodec mediaCodec, C2823a aVar, Format format, Format format2);

    /* renamed from: K */
    public final int mo24020K(String str) {
        if (C3152e0.f5819a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (C3152e0.f5822d.startsWith("SM-T585") || C3152e0.f5822d.startsWith("SM-A510") || C3152e0.f5822d.startsWith("SM-A520") || C3152e0.f5822d.startsWith("SM-J700"))) {
            return 2;
        }
        if (C3152e0.f5819a >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(C3152e0.f5820b) || "flounder_lte".equals(C3152e0.f5820b) || "grouper".equals(C3152e0.f5820b) || "tilapia".equals(C3152e0.f5820b)) ? 1 : 0;
        }
        return 0;
    }

    /* renamed from: S */
    public abstract void mo18327S(C2823a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f);

    /* renamed from: T */
    public final boolean mo24021T() {
        return "Amazon".equals(C3152e0.f5821c) && ("AFTM".equals(C3152e0.f5822d) || "AFTB".equals(C3152e0.f5822d));
    }

    /* renamed from: U */
    public final boolean mo24022U(long j, long j2) {
        boolean z;
        int i;
        if (!mo24031i0()) {
            if (!this.f7691U || !this.f7707k0) {
                i = this.f7679I.dequeueOutputBuffer(this.f7673C, mo24028e0());
            } else {
                try {
                    i = this.f7679I.dequeueOutputBuffer(this.f7673C, mo24028e0());
                } catch (IllegalStateException unused) {
                    mo24035r0();
                    if (this.f7709m0) {
                        mo20119w0();
                    }
                    return false;
                }
            }
            if (i < 0) {
                if (i == -2) {
                    mo24037u0();
                    return true;
                } else if (i == -3) {
                    mo24036t0();
                    return true;
                } else {
                    if (this.f7695Y && (this.f7708l0 || this.f7705i0 == 2)) {
                        mo24035r0();
                    }
                    return false;
                }
            } else if (this.f7694X) {
                this.f7694X = false;
                this.f7679I.releaseOutputBuffer(i, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.f7673C;
                if (bufferInfo.size != 0 || (bufferInfo.flags & 4) == 0) {
                    this.f7700d0 = i;
                    ByteBuffer h0 = mo24030h0(i);
                    this.f7701e0 = h0;
                    if (h0 != null) {
                        h0.position(this.f7673C.offset);
                        ByteBuffer byteBuffer = this.f7701e0;
                        MediaCodec.BufferInfo bufferInfo2 = this.f7673C;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                    }
                    this.f7702f0 = mo24016C0(this.f7673C.presentationTimeUs);
                    mo24019G0(this.f7673C.presentationTimeUs);
                } else {
                    mo24035r0();
                    return false;
                }
            }
        }
        if (!this.f7691U || !this.f7707k0) {
            MediaCodec mediaCodec = this.f7679I;
            ByteBuffer byteBuffer2 = this.f7701e0;
            int i2 = this.f7700d0;
            MediaCodec.BufferInfo bufferInfo3 = this.f7673C;
            z = mo18341s0(j, j2, mediaCodec, byteBuffer2, i2, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f7702f0, this.f7676F);
        } else {
            try {
                z = mo18341s0(j, j2, this.f7679I, this.f7701e0, this.f7700d0, this.f7673C.flags, this.f7673C.presentationTimeUs, this.f7702f0, this.f7676F);
            } catch (IllegalStateException unused2) {
                mo24035r0();
                if (this.f7709m0) {
                    mo20119w0();
                }
                return false;
            }
        }
        if (z) {
            mo18339p0(this.f7673C.presentationTimeUs);
            boolean z2 = (this.f7673C.flags & 4) != 0;
            mo24015A0();
            if (!z2) {
                return true;
            }
            mo24035r0();
        }
        return false;
    }

    /* renamed from: V */
    public final boolean mo24023V() {
        int i;
        int i2;
        MediaCodec mediaCodec = this.f7679I;
        if (mediaCodec == null || this.f7705i0 == 2 || this.f7708l0) {
            return false;
        }
        if (this.f7699c0 < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.f7699c0 = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.f7717x.f3307m = mo24029g0(dequeueInputBuffer);
            this.f7717x.mo18386i();
        }
        if (this.f7705i0 == 1) {
            if (!this.f7695Y) {
                this.f7707k0 = true;
                this.f7679I.queueInputBuffer(this.f7699c0, 0, 0, 0, 4);
                mo24040z0();
            }
            this.f7705i0 = 2;
            return false;
        } else if (this.f7693W) {
            this.f7693W = false;
            this.f7717x.f3307m.put(f7670q0);
            this.f7679I.queueInputBuffer(this.f7699c0, 0, f7670q0.length, 0, 0);
            mo24040z0();
            this.f7706j0 = true;
            return true;
        } else {
            if (this.f7710n0) {
                i2 = -4;
                i = 0;
            } else {
                if (this.f7704h0 == 1) {
                    for (int i3 = 0; i3 < this.f7674D.f7568s.size(); i3++) {
                        this.f7717x.f3307m.put(this.f7674D.f7568s.get(i3));
                    }
                    this.f7704h0 = 2;
                }
                i = this.f7717x.f3307m.position();
                i2 = mo18199G(this.f7719z, this.f7717x, false);
            }
            if (i2 == -3) {
                return false;
            }
            if (i2 == -5) {
                if (this.f7704h0 == 2) {
                    this.f7717x.mo18386i();
                    this.f7704h0 = 1;
                }
                mo18337n0(this.f7719z.f5333a);
                return true;
            } else if (this.f7717x.mo18390n()) {
                if (this.f7704h0 == 2) {
                    this.f7717x.mo18386i();
                    this.f7704h0 = 1;
                }
                this.f7708l0 = true;
                if (!this.f7706j0) {
                    mo24035r0();
                    return false;
                }
                try {
                    if (!this.f7695Y) {
                        this.f7707k0 = true;
                        this.f7679I.queueInputBuffer(this.f7699c0, 0, 0, 0, 4);
                        mo24040z0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw ExoPlaybackException.createForRenderer(e, mo18220x());
                }
            } else if (!this.f7711o0 || this.f7717x.mo18391o()) {
                this.f7711o0 = false;
                boolean v = this.f7717x.mo18407v();
                boolean D0 = mo24017D0(v);
                this.f7710n0 = D0;
                if (D0) {
                    return false;
                }
                if (this.f7688R && !v) {
                    C3168q.m7903b(this.f7717x.f3307m);
                    if (this.f7717x.f3307m.position() == 0) {
                        return true;
                    }
                    this.f7688R = false;
                }
                try {
                    long j = this.f7717x.f3308n;
                    if (this.f7717x.mo18389m()) {
                        this.f7672B.add(Long.valueOf(j));
                    }
                    if (this.f7675E != null) {
                        this.f7671A.mo19935a(j, this.f7675E);
                        this.f7675E = null;
                    }
                    this.f7717x.mo18406u();
                    mo18340q0(this.f7717x);
                    if (v) {
                        this.f7679I.queueSecureInputBuffer(this.f7699c0, 0, m10397f0(this.f7717x, i), j, 0);
                    } else {
                        this.f7679I.queueInputBuffer(this.f7699c0, 0, this.f7717x.f3307m.limit(), j, 0);
                    }
                    mo24040z0();
                    this.f7706j0 = true;
                    this.f7704h0 = 0;
                    this.f7712p0.f3299c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw ExoPlaybackException.createForRenderer(e2, mo18220x());
                }
            } else {
                this.f7717x.mo18386i();
                if (this.f7704h0 == 2) {
                    this.f7704h0 = 1;
                }
                return true;
            }
        }
    }

    /* renamed from: W */
    public void mo20100W() {
        this.f7698b0 = -9223372036854775807L;
        mo24040z0();
        mo24015A0();
        this.f7711o0 = true;
        this.f7710n0 = false;
        this.f7702f0 = false;
        this.f7672B.clear();
        this.f7693W = false;
        this.f7694X = false;
        if (this.f7689S || (this.f7690T && this.f7707k0)) {
            mo20119w0();
            mo24034l0();
        } else if (this.f7705i0 != 0) {
            mo20119w0();
            mo24034l0();
        } else {
            this.f7679I.flush();
            this.f7706j0 = false;
        }
        if (this.f7703g0 && this.f7674D != null) {
            this.f7704h0 = 1;
        }
    }

    /* renamed from: X */
    public final List<C2823a> mo24024X(boolean z) {
        List<C2823a> d0 = mo18332d0(this.f7713t, this.f7674D, z);
        if (d0.isEmpty() && z) {
            d0 = mo18332d0(this.f7713t, this.f7674D, false);
            if (!d0.isEmpty()) {
                C3163m.m7880f("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f7674D.f7566q + ", but no secure decoder available. Trying to proceed with " + d0 + MAPCookie.DOT);
            }
        }
        return d0;
    }

    /* renamed from: Y */
    public final MediaCodec mo24025Y() {
        return this.f7679I;
    }

    /* renamed from: Z */
    public final void mo24026Z(MediaCodec mediaCodec) {
        if (C3152e0.f5819a < 21) {
            this.f7696Z = mediaCodec.getInputBuffers();
            this.f7697a0 = mediaCodec.getOutputBuffers();
        }
    }

    /* renamed from: a */
    public final int mo18904a(Format format) {
        try {
            return mo18318E0(this.f7713t, this.f7714u, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw ExoPlaybackException.createForRenderer(e, mo18220x());
        }
    }

    @Nullable
    /* renamed from: a0 */
    public final C2823a mo24027a0() {
        return this.f7685O;
    }

    /* renamed from: b */
    public boolean mo18329b() {
        return this.f7709m0;
    }

    /* renamed from: b0 */
    public boolean mo20106b0() {
        return false;
    }

    /* renamed from: c */
    public boolean mo18330c() {
        return this.f7674D != null && !this.f7710n0 && (mo18222z() || mo24031i0() || (this.f7698b0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f7698b0));
    }

    /* renamed from: c0 */
    public abstract float mo18331c0(float f, Format format, Format[] formatArr);

    /* renamed from: d0 */
    public List<C2823a> mo18332d0(C2824b bVar, Format format, boolean z) {
        return bVar.mo18897b(format.f7566q, z);
    }

    /* renamed from: e0 */
    public long mo24028e0() {
        return 0;
    }

    /* renamed from: g0 */
    public final ByteBuffer mo24029g0(int i) {
        if (C3152e0.f5819a >= 21) {
            return this.f7679I.getInputBuffer(i);
        }
        return this.f7696Z[i];
    }

    /* renamed from: h0 */
    public final ByteBuffer mo24030h0(int i) {
        if (C3152e0.f5819a >= 21) {
            return this.f7679I.getOutputBuffer(i);
        }
        return this.f7697a0[i];
    }

    /* renamed from: i0 */
    public final boolean mo24031i0() {
        return this.f7700d0 >= 0;
    }

    /* renamed from: j0 */
    public final void mo24032j0(C2823a aVar, MediaCrypto mediaCrypto) {
        String str = aVar.f4388a;
        mo24018F0();
        boolean z = this.f7681K > this.f7716w;
        MediaCodec mediaCodec = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C3148c0.m7745a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C3148c0.m7747c();
            C3148c0.m7745a("configureCodec");
            mo18327S(aVar, createByCodecName, this.f7674D, mediaCrypto, z ? this.f7681K : -1.0f);
            this.f7682L = z;
            C3148c0.m7747c();
            C3148c0.m7745a("startCodec");
            createByCodecName.start();
            C3148c0.m7747c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            mo24026Z(createByCodecName);
            this.f7679I = createByCodecName;
            this.f7685O = aVar;
            mo18336m0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Exception e) {
            if (mediaCodec != null) {
                mo24039y0();
                mediaCodec.release();
            }
            throw e;
        }
    }

    /* renamed from: k0 */
    public final boolean mo24033k0(MediaCrypto mediaCrypto, boolean z) {
        if (this.f7683M == null) {
            try {
                this.f7683M = new ArrayDeque<>(mo24024X(z));
                this.f7684N = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.f7674D, (Throwable) e, z, (int) DecoderInitializationException.DECODER_QUERY_ERROR);
            }
        }
        if (!this.f7683M.isEmpty()) {
            do {
                C2823a peekFirst = this.f7683M.peekFirst();
                if (!mo20091B0(peekFirst)) {
                    return false;
                }
                try {
                    mo24032j0(peekFirst, mediaCrypto);
                    return true;
                } catch (Exception e2) {
                    C3163m.m7881g("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e2);
                    this.f7683M.removeFirst();
                    DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.f7674D, (Throwable) e2, z, peekFirst.f4388a);
                    DecoderInitializationException decoderInitializationException2 = this.f7684N;
                    if (decoderInitializationException2 == null) {
                        this.f7684N = decoderInitializationException;
                    } else {
                        this.f7684N = decoderInitializationException2.copyWithFallbackException(decoderInitializationException);
                    }
                    if (this.f7683M.isEmpty()) {
                        throw this.f7684N;
                    }
                }
            } while (this.f7683M.isEmpty());
            throw this.f7684N;
        }
        throw new DecoderInitializationException(this.f7674D, (Throwable) null, z, (int) DecoderInitializationException.NO_SUITABLE_DECODER_ERROR);
    }

    /* renamed from: l0 */
    public final void mo24034l0() {
        Format format;
        boolean z;
        if (this.f7679I == null && (format = this.f7674D) != null) {
            DrmSession<C2656m> drmSession = this.f7678H;
            this.f7677G = drmSession;
            String str = format.f7566q;
            MediaCrypto mediaCrypto = null;
            boolean z2 = false;
            if (drmSession != null) {
                C2656m b = drmSession.mo18440b();
                if (b != null) {
                    mediaCrypto = b.mo18481a();
                    z = b.mo18482b(str);
                } else if (this.f7677G.mo18441c() != null) {
                    z = false;
                } else {
                    return;
                }
                if (mo24021T()) {
                    int state = this.f7677G.getState();
                    if (state == 1) {
                        throw ExoPlaybackException.createForRenderer(this.f7677G.mo18441c(), mo18220x());
                    } else if (state != 4) {
                        return;
                    }
                }
            } else {
                z = false;
            }
            try {
                if (mo24033k0(mediaCrypto, z)) {
                    String str2 = this.f7685O.f4388a;
                    this.f7686P = mo24020K(str2);
                    this.f7687Q = m10396R(str2);
                    this.f7688R = m10390L(str2, this.f7674D);
                    this.f7689S = m10394P(str2);
                    this.f7690T = m10391M(str2);
                    this.f7691U = m10392N(str2);
                    this.f7692V = m10395Q(str2, this.f7674D);
                    if (m10393O(this.f7685O) || mo20106b0()) {
                        z2 = true;
                    }
                    this.f7695Y = z2;
                    this.f7698b0 = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    mo24040z0();
                    mo24015A0();
                    this.f7711o0 = true;
                    this.f7712p0.f3297a++;
                }
            } catch (DecoderInitializationException e) {
                throw ExoPlaybackException.createForRenderer(e, mo18220x());
            }
        }
    }

    /* renamed from: m0 */
    public abstract void mo18336m0(String str, long j, long j2);

    /* renamed from: n */
    public final int mo18209n() {
        return 8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r6.f7572w == r0.f7572w) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18337n0(com.google.android.exoplayer2.Format r6) {
        /*
            r5 = this;
            com.google.android.exoplayer2.Format r0 = r5.f7674D
            r5.f7674D = r6
            r5.f7675E = r6
            com.google.android.exoplayer2.drm.DrmInitData r6 = r6.f7569t
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r2 = r1
            goto L_0x000f
        L_0x000d:
            com.google.android.exoplayer2.drm.DrmInitData r2 = r0.f7569t
        L_0x000f:
            boolean r6 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7789b(r6, r2)
            r2 = 1
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x004b
            com.google.android.exoplayer2.Format r6 = r5.f7674D
            com.google.android.exoplayer2.drm.DrmInitData r6 = r6.f7569t
            if (r6 == 0) goto L_0x0049
            c.q.a.b.e0.i<c.q.a.b.e0.m> r6 = r5.f7714u
            if (r6 == 0) goto L_0x0039
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.exoplayer2.Format r3 = r5.f7674D
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.f7569t
            com.google.android.exoplayer2.drm.DrmSession r6 = r6.mo18469a(r1, r3)
            r5.f7678H = r6
            com.google.android.exoplayer2.drm.DrmSession<c.q.a.b.e0.m> r1 = r5.f7677G
            if (r6 != r1) goto L_0x004b
            c.q.a.b.e0.i<c.q.a.b.e0.m> r1 = r5.f7714u
            r1.mo18471f(r6)
            goto L_0x004b
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.mo18220x()
            com.google.android.exoplayer2.ExoPlaybackException r6 = com.google.android.exoplayer2.ExoPlaybackException.createForRenderer(r6, r0)
            throw r6
        L_0x0049:
            r5.f7678H = r1
        L_0x004b:
            com.google.android.exoplayer2.drm.DrmSession<c.q.a.b.e0.m> r6 = r5.f7678H
            com.google.android.exoplayer2.drm.DrmSession<c.q.a.b.e0.m> r1 = r5.f7677G
            r3 = 0
            if (r6 != r1) goto L_0x008c
            android.media.MediaCodec r6 = r5.f7679I
            if (r6 == 0) goto L_0x008c
            c.q.a.b.g0.a r1 = r5.f7685O
            com.google.android.exoplayer2.Format r4 = r5.f7674D
            int r6 = r5.mo18319J(r6, r1, r0, r4)
            if (r6 == 0) goto L_0x008c
            if (r6 == r2) goto L_0x008d
            r1 = 3
            if (r6 != r1) goto L_0x0086
            boolean r6 = r5.f7687Q
            if (r6 != 0) goto L_0x008c
            r5.f7703g0 = r2
            r5.f7704h0 = r2
            int r6 = r5.f7686P
            r1 = 2
            if (r6 == r1) goto L_0x0082
            if (r6 != r2) goto L_0x0083
            com.google.android.exoplayer2.Format r6 = r5.f7674D
            int r1 = r6.f7571v
            int r4 = r0.f7571v
            if (r1 != r4) goto L_0x0083
            int r6 = r6.f7572w
            int r0 = r0.f7572w
            if (r6 != r0) goto L_0x0083
        L_0x0082:
            r3 = r2
        L_0x0083:
            r5.f7693W = r3
            goto L_0x008d
        L_0x0086:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x008c:
            r2 = r3
        L_0x008d:
            if (r2 != 0) goto L_0x0093
            r5.mo24038v0()
            goto L_0x0096
        L_0x0093:
            r5.mo24018F0()
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo18337n0(com.google.android.exoplayer2.Format):void");
    }

    /* renamed from: o */
    public void mo18906o(long j, long j2) {
        if (this.f7709m0) {
            mo18342x0();
            return;
        }
        if (this.f7674D == null) {
            this.f7718y.mo18386i();
            int G = mo18199G(this.f7719z, this.f7718y, true);
            if (G == -5) {
                mo18337n0(this.f7719z.f5333a);
            } else if (G == -4) {
                C3151e.m7759g(this.f7718y.mo18390n());
                this.f7708l0 = true;
                mo24035r0();
                return;
            } else {
                return;
            }
        }
        mo24034l0();
        if (this.f7679I != null) {
            C3148c0.m7745a("drainAndFeed");
            do {
            } while (mo24022U(j, j2));
            do {
            } while (mo24023V());
            C3148c0.m7747c();
        } else {
            this.f7712p0.f3300d += mo18200H(j);
            this.f7718y.mo18386i();
            int G2 = mo18199G(this.f7719z, this.f7718y, false);
            if (G2 == -5) {
                mo18337n0(this.f7719z.f5333a);
            } else if (G2 == -4) {
                C3151e.m7759g(this.f7718y.mo18390n());
                this.f7708l0 = true;
                mo24035r0();
            }
        }
        this.f7712p0.mo18403a();
    }

    /* renamed from: o0 */
    public abstract void mo18338o0(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* renamed from: p0 */
    public abstract void mo18339p0(long j);

    /* renamed from: q */
    public final void mo20183q(float f) {
        this.f7680J = f;
        mo24018F0();
    }

    /* renamed from: q0 */
    public abstract void mo18340q0(C2634e eVar);

    /* renamed from: r0 */
    public final void mo24035r0() {
        if (this.f7705i0 == 2) {
            mo20119w0();
            mo24034l0();
            return;
        }
        this.f7709m0 = true;
        mo18342x0();
    }

    /* renamed from: s0 */
    public abstract boolean mo18341s0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, Format format);

    /* renamed from: t0 */
    public final void mo24036t0() {
        if (C3152e0.f5819a < 21) {
            this.f7697a0 = this.f7679I.getOutputBuffers();
        }
    }

    /* renamed from: u0 */
    public final void mo24037u0() {
        MediaFormat outputFormat = this.f7679I.getOutputFormat();
        if (this.f7686P != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f7694X = true;
            return;
        }
        if (this.f7692V) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo18338o0(this.f7679I, outputFormat);
    }

    /* renamed from: v0 */
    public final void mo24038v0() {
        this.f7683M = null;
        if (this.f7706j0) {
            this.f7705i0 = 1;
            return;
        }
        mo20119w0();
        mo24034l0();
    }

    /* renamed from: w0 */
    public void mo20119w0() {
        this.f7698b0 = -9223372036854775807L;
        mo24040z0();
        mo24015A0();
        this.f7710n0 = false;
        this.f7702f0 = false;
        this.f7672B.clear();
        mo24039y0();
        this.f7685O = null;
        this.f7703g0 = false;
        this.f7706j0 = false;
        this.f7688R = false;
        this.f7689S = false;
        this.f7686P = 0;
        this.f7687Q = false;
        this.f7690T = false;
        this.f7692V = false;
        this.f7693W = false;
        this.f7694X = false;
        this.f7695Y = false;
        this.f7707k0 = false;
        this.f7704h0 = 0;
        this.f7705i0 = 0;
        this.f7682L = false;
        MediaCodec mediaCodec = this.f7679I;
        if (mediaCodec != null) {
            this.f7712p0.f3298b++;
            try {
                mediaCodec.stop();
                try {
                    this.f7679I.release();
                    this.f7679I = null;
                    DrmSession<C2656m> drmSession = this.f7677G;
                    if (drmSession != null && this.f7678H != drmSession) {
                        try {
                            this.f7714u.mo18471f(drmSession);
                        } finally {
                            this.f7677G = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f7679I = null;
                    DrmSession<C2656m> drmSession2 = this.f7677G;
                    if (!(drmSession2 == null || this.f7678H == drmSession2)) {
                        this.f7714u.mo18471f(drmSession2);
                    }
                    throw th;
                } finally {
                    this.f7677G = null;
                }
            } catch (Throwable th2) {
                this.f7679I = null;
                DrmSession<C2656m> drmSession3 = this.f7677G;
                if (!(drmSession3 == null || this.f7678H == drmSession3)) {
                    try {
                        this.f7714u.mo18471f(drmSession3);
                    } finally {
                        this.f7677G = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: x0 */
    public void mo18342x0() {
    }

    /* renamed from: y0 */
    public final void mo24039y0() {
        if (C3152e0.f5819a < 21) {
            this.f7696Z = null;
            this.f7697a0 = null;
        }
    }

    /* renamed from: z0 */
    public final void mo24040z0() {
        this.f7699c0 = -1;
        this.f7717x.f3307m = null;
    }

    public static class DecoderInitializationException extends Exception {
        public static final int CUSTOM_ERROR_CODE_BASE = -50000;
        public static final int DECODER_QUERY_ERROR = -49998;
        public static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final String decoderName;
        public final String diagnosticInfo;
        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, th, format.f7566q, z, (String) null, buildCustomDiagnosticInfo(i), (DecoderInitializationException) null);
        }

        public static String buildCustomDiagnosticInfo(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        /* access modifiers changed from: private */
        @CheckResult
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.decoderName, this.diagnosticInfo, decoderInitializationException);
        }

        @TargetApi(21)
        public static String getDiagnosticInfoV21(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public DecoderInitializationException(Format format, Throwable th, boolean z, String str) {
            this("Decoder init failed: " + str + ", " + format, th, format.f7566q, z, str, C3152e0.f5819a >= 21 ? getDiagnosticInfoV21(th) : null, (DecoderInitializationException) null);
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z, @Nullable String str3, @Nullable String str4, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.decoderName = str3;
            this.diagnosticInfo = str4;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
