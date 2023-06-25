package p040c.p200q.p406e.p426q.p427b;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* renamed from: c.q.e.q.b.f */
/* compiled from: FormatInformation */
public final class C7148f {

    /* renamed from: c */
    public static final int[][] f13750c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final ErrorCorrectionLevel f13751a;

    /* renamed from: b */
    public final byte f13752b;

    public C7148f(int i) {
        this.f13751a = ErrorCorrectionLevel.forBits((i >> 3) & 3);
        this.f13752b = (byte) (i & 7);
    }

    /* renamed from: a */
    public static C7148f m21360a(int i, int i2) {
        C7148f b = m21361b(i, i2);
        if (b != null) {
            return b;
        }
        return m21361b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    public static C7148f m21361b(int i, int i2) {
        int e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : f13750c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C7148f(iArr[1]);
            }
            int e2 = m21362e(i, i5);
            if (e2 < i3) {
                i4 = iArr[1];
                i3 = e2;
            }
            if (i != i2 && (e = m21362e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C7148f(i4);
        }
        return null;
    }

    /* renamed from: e */
    public static int m21362e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* renamed from: c */
    public byte mo32860c() {
        return this.f13752b;
    }

    /* renamed from: d */
    public ErrorCorrectionLevel mo32861d() {
        return this.f13751a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7148f)) {
            return false;
        }
        C7148f fVar = (C7148f) obj;
        if (this.f13751a == fVar.f13751a && this.f13752b == fVar.f13752b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f13751a.ordinal() << 3) | this.f13752b;
    }
}
