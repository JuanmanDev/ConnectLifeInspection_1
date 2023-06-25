package p040c.p200q.p201a.p219b.p234g0;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

@TargetApi(16)
/* renamed from: c.q.a.b.g0.a */
/* compiled from: MediaCodecInfo */
public final class C2823a {

    /* renamed from: a */
    public final String f4388a;
    @Nullable

    /* renamed from: b */
    public final String f4389b;
    @Nullable

    /* renamed from: c */
    public final MediaCodecInfo.CodecCapabilities f4390c;

    /* renamed from: d */
    public final boolean f4391d;

    /* renamed from: e */
    public final boolean f4392e;

    /* renamed from: f */
    public final boolean f4393f;

    /* renamed from: g */
    public final boolean f4394g;

    /* renamed from: h */
    public final boolean f4395h;

    public C2823a(String str, @Nullable String str2, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        C3151e.m7757e(str);
        this.f4388a = str;
        this.f4389b = str2;
        this.f4390c = codecCapabilities;
        this.f4394g = z;
        boolean z4 = true;
        this.f4391d = !z2 && codecCapabilities != null && m6005e(codecCapabilities);
        this.f4392e = codecCapabilities != null && m6009o(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !m6007m(codecCapabilities))) {
            z4 = false;
        }
        this.f4393f = z4;
        this.f4395h = C3166p.m7901m(str2);
    }

    /* renamed from: a */
    public static int m6003a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((C3152e0.f5819a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || VideoCapture.AUDIO_MIME_TYPE.equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        C3163m.m7880f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    @TargetApi(21)
    /* renamed from: c */
    public static boolean m6004c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    /* renamed from: e */
    public static boolean m6005e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C3152e0.f5819a >= 19 && m6006f(codecCapabilities);
    }

    @TargetApi(19)
    /* renamed from: f */
    public static boolean m6006f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: m */
    public static boolean m6007m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C3152e0.f5819a >= 21 && m6008n(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: n */
    public static boolean m6008n(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: o */
    public static boolean m6009o(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C3152e0.f5819a >= 21 && m6010p(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: p */
    public static boolean m6010p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: t */
    public static C2823a m6011t(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C2823a(str, str2, codecCapabilities, false, z, z2);
    }

    /* renamed from: u */
    public static C2823a m6012u(String str) {
        return new C2823a(str, (String) null, (MediaCodecInfo.CodecCapabilities) null, true, false, false);
    }

    @TargetApi(21)
    /* renamed from: b */
    public Point mo18884b(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4390c;
        if (codecCapabilities == null) {
            mo18894s("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            mo18894s("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C3152e0.m7801h(i, widthAlignment) * widthAlignment, C3152e0.m7801h(i2, heightAlignment) * heightAlignment);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] mo18885d() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f4390c
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p234g0.C2823a.mo18885d():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    @TargetApi(21)
    /* renamed from: g */
    public boolean mo18886g(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4390c;
        if (codecCapabilities == null) {
            mo18894s("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            mo18894s("channelCount.aCaps");
            return false;
        } else if (m6003a(this.f4388a, this.f4389b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            mo18894s("channelCount.support, " + i);
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: h */
    public boolean mo18887h(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4390c;
        if (codecCapabilities == null) {
            mo18894s("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            mo18894s("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            mo18894s("sampleRate.support, " + i);
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo18888i(String str) {
        String d;
        if (str == null || this.f4389b == null || (d = C3166p.m7892d(str)) == null) {
            return true;
        }
        if (!this.f4389b.equals(d)) {
            mo18894s("codec.mime " + str + ", " + d);
            return false;
        }
        Pair<Integer, Integer> f = MediaCodecUtil.m10456f(str);
        if (f == null) {
            return true;
        }
        int intValue = ((Integer) f.first).intValue();
        int intValue2 = ((Integer) f.second).intValue();
        if (!this.f4395h && intValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo18885d()) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        mo18894s("codec.profileLevel, " + str + ", " + d);
        return false;
    }

    /* renamed from: j */
    public boolean mo18889j(Format format) {
        int i;
        boolean z = false;
        if (!mo18888i(format.f7563n)) {
            return false;
        }
        if (this.f4395h) {
            int i2 = format.f7571v;
            if (i2 <= 0 || (i = format.f7572w) <= 0) {
                return true;
            }
            if (C3152e0.f5819a >= 21) {
                return mo18892q(i2, i, (double) format.f7573x);
            }
            if (i2 * i <= MediaCodecUtil.m10463m()) {
                z = true;
            }
            if (!z) {
                mo18894s("legacyFrameSize, " + format.f7571v + "x" + format.f7572w);
            }
            return z;
        }
        if (C3152e0.f5819a >= 21) {
            int i3 = format.f7552E;
            if (i3 != -1 && !mo18887h(i3)) {
                return false;
            }
            int i4 = format.f7551D;
            if (i4 != -1 && !mo18886g(i4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo18890k(Format format) {
        if (this.f4395h) {
            return this.f4391d;
        }
        Pair<Integer, Integer> f = MediaCodecUtil.m10456f(format.f7563n);
        return f != null && ((Integer) f.first).intValue() == 42;
    }

    /* renamed from: l */
    public boolean mo18891l(Format format, Format format2, boolean z) {
        if (!this.f4395h) {
            if (VideoCapture.AUDIO_MIME_TYPE.equals(this.f4389b) && format.f7566q.equals(format2.f7566q) && format.f7551D == format2.f7551D && format.f7552E == format2.f7552E) {
                Pair<Integer, Integer> f = MediaCodecUtil.m10456f(format.f7563n);
                Pair<Integer, Integer> f2 = MediaCodecUtil.m10456f(format2.f7563n);
                if (!(f == null || f2 == null)) {
                    int intValue = ((Integer) f.first).intValue();
                    int intValue2 = ((Integer) f2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } else if (!format.f7566q.equals(format2.f7566q) || format.f7574y != format2.f7574y || ((!this.f4391d && (format.f7571v != format2.f7571v || format.f7572w != format2.f7572w)) || ((z || format2.f7550C != null) && !C3152e0.m7789b(format.f7550C, format2.f7550C)))) {
            return false;
        } else {
            return true;
        }
    }

    @TargetApi(21)
    /* renamed from: q */
    public boolean mo18892q(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4390c;
        if (codecCapabilities == null) {
            mo18894s("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            mo18894s("sizeAndRate.vCaps");
            return false;
        } else if (m6004c(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m6004c(videoCapabilities, i2, i, d)) {
                mo18894s("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            mo18893r("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
            return true;
        }
    }

    /* renamed from: r */
    public final void mo18893r(String str) {
        C3163m.m7876b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f4388a + ", " + this.f4389b + "] [" + C3152e0.f5823e + "]");
    }

    /* renamed from: s */
    public final void mo18894s(String str) {
        C3163m.m7876b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f4388a + ", " + this.f4389b + "] [" + C3152e0.f5823e + "]");
    }

    public String toString() {
        return this.f4388a;
    }
}
