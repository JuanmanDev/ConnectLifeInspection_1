package p040c.p200q.p201a.p219b.p261o0;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;

/* renamed from: c.q.a.b.o0.g */
/* compiled from: CodecSpecificDataUtil */
public final class C3155g {

    /* renamed from: a */
    public static final byte[] f5829a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final int[] f5830b = {96000, 88200, VideoCapture.Defaults.DEFAULT_AUDIO_BIT_RATE, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, VideoCapture.Defaults.DEFAULT_AUDIO_SAMPLE_RATE, 7350};

    /* renamed from: c */
    public static final int[] f5831c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static byte[] m7838a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: b */
    public static byte[] m7839b(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = f5830b;
            if (i4 >= iArr.length) {
                break;
            }
            if (i == iArr[i4]) {
                i5 = i4;
            }
            i4++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f5831c;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m7838a(2, i5, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    /* renamed from: c */
    public static String m7840c(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: d */
    public static byte[] m7841d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f5829a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f5829a.length, i2);
        return bArr3;
    }

    /* renamed from: e */
    public static int m7842e(byte[] bArr, int i) {
        int length = bArr.length - f5829a.length;
        while (i <= length) {
            if (m7845h(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    public static int m7843f(C3172s sVar) {
        int h = sVar.mo19985h(5);
        return h == 31 ? sVar.mo19985h(6) + 32 : h;
    }

    /* renamed from: g */
    public static int m7844g(C3172s sVar) {
        int h = sVar.mo19985h(4);
        if (h == 15) {
            return sVar.mo19985h(24);
        }
        C3151e.m7753a(h < 13);
        return f5830b[h];
    }

    /* renamed from: h */
    public static boolean m7845h(byte[] bArr, int i) {
        if (bArr.length - i <= f5829a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f5829a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: i */
    public static Pair<Integer, Integer> m7846i(C3172s sVar, boolean z) {
        int f = m7843f(sVar);
        int g = m7844g(sVar);
        int h = sVar.mo19985h(4);
        if (f == 5 || f == 29) {
            g = m7844g(sVar);
            f = m7843f(sVar);
            if (f == 22) {
                h = sVar.mo19985h(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(f == 1 || f == 2 || f == 3 || f == 4 || f == 6 || f == 7 || f == 17)) {
                switch (f) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException("Unsupported audio object type: " + f);
                }
            }
            m7848k(sVar, f, h);
            switch (f) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = sVar.mo19985h(2);
                    if (h2 == 2 || h2 == 3) {
                        throw new ParserException("Unsupported epConfig: " + h2);
                    }
            }
        }
        int i = f5831c[h];
        if (i == -1) {
            z2 = false;
        }
        C3151e.m7753a(z2);
        return Pair.create(Integer.valueOf(g), Integer.valueOf(i));
    }

    /* renamed from: j */
    public static Pair<Integer, Integer> m7847j(byte[] bArr) {
        return m7846i(new C3172s(bArr), false);
    }

    /* renamed from: k */
    public static void m7848k(C3172s sVar, int i, int i2) {
        sVar.mo19993p(1);
        if (sVar.mo19984g()) {
            sVar.mo19993p(14);
        }
        boolean g = sVar.mo19984g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                sVar.mo19993p(3);
            }
            if (g) {
                if (i == 22) {
                    sVar.mo19993p(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    sVar.mo19993p(3);
                }
                sVar.mo19993p(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Nullable
    /* renamed from: l */
    public static byte[][] m7849l(byte[] bArr) {
        if (!m7845h(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = m7842e(bArr, i + f5829a.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            int intValue2 = (i2 < arrayList.size() + -1 ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }
}
