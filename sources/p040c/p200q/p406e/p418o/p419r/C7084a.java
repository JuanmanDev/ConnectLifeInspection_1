package p040c.p200q.p406e.p418o.p419r;

import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.p418o.C7077k;

/* renamed from: c.q.e.o.r.a */
/* compiled from: AbstractRSSReader */
public abstract class C7084a extends C7077k {

    /* renamed from: a */
    public final int[] f13607a = new int[4];

    /* renamed from: b */
    public final int[] f13608b;

    /* renamed from: c */
    public final float[] f13609c;

    /* renamed from: d */
    public final float[] f13610d;

    /* renamed from: e */
    public final int[] f13611e;

    /* renamed from: f */
    public final int[] f13612f;

    public C7084a() {
        int[] iArr = new int[8];
        this.f13608b = iArr;
        this.f13609c = new float[4];
        this.f13610d = new float[4];
        this.f13611e = new int[(iArr.length / 2)];
        this.f13612f = new int[(iArr.length / 2)];
    }

    /* renamed from: h */
    public static void m21063h(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: o */
    public static void m21064o(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: p */
    public static boolean m21065p(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public static int m21066q(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (C7077k.m21023e(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: i */
    public final int[] mo32664i() {
        return this.f13608b;
    }

    /* renamed from: j */
    public final int[] mo32665j() {
        return this.f13607a;
    }

    /* renamed from: k */
    public final int[] mo32666k() {
        return this.f13612f;
    }

    /* renamed from: l */
    public final float[] mo32667l() {
        return this.f13610d;
    }

    /* renamed from: m */
    public final int[] mo32668m() {
        return this.f13611e;
    }

    /* renamed from: n */
    public final float[] mo32669n() {
        return this.f13609c;
    }
}
