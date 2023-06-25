package p040c.p200q.p406e.p422p.p423d;

import java.lang.reflect.Array;
import p040c.p200q.p406e.p410l.p411l.C7043a;
import p040c.p200q.p406e.p422p.C7114a;

/* renamed from: c.q.e.p.d.i */
/* compiled from: PDF417CodewordDecoder */
public final class C7127i {

    /* renamed from: a */
    public static final float[][] f13714a;

    static {
        int i;
        int length = C7114a.f13673b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f13714a = (float[][]) Array.newInstance(float.class, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = C7114a.f13673b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f13714a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m21264a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    public static int m21265b(int[] iArr) {
        int d = C7043a.m20886d(iArr);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = ((float) iArr[i]) / ((float) d);
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f13714a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C7114a.f13673b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    public static int m21266c(int[] iArr) {
        int a = m21264a(iArr);
        if (C7114a.m21185a(a) == -1) {
            return -1;
        }
        return a;
    }

    /* renamed from: d */
    public static int m21267d(int[] iArr) {
        int c = m21266c(m21268e(iArr));
        if (c != -1) {
            return c;
        }
        return m21265b(iArr);
    }

    /* renamed from: e */
    public static int[] m21268e(int[] iArr) {
        float d = (float) C7043a.m20886d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (d / 34.0f) + ((((float) i3) * d) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
