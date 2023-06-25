package p040c.p200q.p201a.p219b.p224f0;

import androidx.camera.core.VideoCapture;

/* renamed from: c.q.a.b.f0.m */
/* compiled from: MpegAudioHeader */
public final class C2680m {

    /* renamed from: h */
    public static final String[] f3429h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    public static final int[] f3430i = {44100, 48000, 32000};

    /* renamed from: j */
    public static final int[] f3431j = {32000, VideoCapture.Defaults.DEFAULT_AUDIO_BIT_RATE, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: k */
    public static final int[] f3432k = {32000, 48000, 56000, VideoCapture.Defaults.DEFAULT_AUDIO_BIT_RATE, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: l */
    public static final int[] f3433l = {32000, 48000, 56000, VideoCapture.Defaults.DEFAULT_AUDIO_BIT_RATE, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: m */
    public static final int[] f3434m = {32000, 40000, 48000, 56000, VideoCapture.Defaults.DEFAULT_AUDIO_BIT_RATE, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: n */
    public static final int[] f3435n = {VideoCapture.Defaults.DEFAULT_AUDIO_SAMPLE_RATE, 16000, 24000, 32000, 40000, 48000, 56000, VideoCapture.Defaults.DEFAULT_AUDIO_BIT_RATE, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: a */
    public int f3436a;

    /* renamed from: b */
    public String f3437b;

    /* renamed from: c */
    public int f3438c;

    /* renamed from: d */
    public int f3439d;

    /* renamed from: e */
    public int f3440e;

    /* renamed from: f */
    public int f3441f;

    /* renamed from: g */
    public int f3442g;

    /* renamed from: a */
    public static int m5289a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f3430i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f3431j[i4 - 1] : f3432k[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f3433l[i4 - 1] : f3434m[i4 - 1];
        } else {
            i6 = f3435n[i4 - 1];
        }
        int i9 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i6) / i7) + i8;
    }

    /* renamed from: b */
    public static boolean m5290b(int i, C2680m mVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i8 = f3430i[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = i8;
        int i10 = (i >>> 9) & 1;
        int i11 = 1152;
        if (i3 == 3) {
            i6 = 384;
            i7 = ((((i2 == 3 ? f3431j[i4 - 1] : f3432k[i4 - 1]) * 12) / i9) + i10) * 4;
        } else {
            int i12 = 144;
            if (i2 == 3) {
                i7 = (((i3 == 2 ? f3433l[i4 - 1] : f3434m[i4 - 1]) * 144) / i9) + i10;
            } else {
                int i13 = f3435n[i4 - 1];
                if (i3 == 1) {
                    i11 = 576;
                }
                if (i3 == 1) {
                    i12 = 72;
                }
                i7 = ((i12 * i13) / i9) + i10;
            }
            i6 = i11;
        }
        mVar.mo18560c(i2, f3429h[3 - i3], i7, i9, ((i >> 6) & 3) == 3 ? 1 : 2, ((i7 * 8) * i9) / i6, i6);
        return true;
    }

    /* renamed from: c */
    public final void mo18560c(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.f3436a = i;
        this.f3437b = str;
        this.f3438c = i2;
        this.f3439d = i3;
        this.f3440e = i4;
        this.f3441f = i5;
        this.f3442g = i6;
    }
}
