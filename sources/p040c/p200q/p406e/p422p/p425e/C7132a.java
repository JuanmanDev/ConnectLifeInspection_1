package p040c.p200q.p406e.p422p.p425e;

import com.google.zxing.DecodeHintType;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p040c.p200q.p406e.C7016b;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.p.e.a */
/* compiled from: Detector */
public final class C7132a {

    /* renamed from: a */
    public static final int[] f13725a = {0, 4, 1, 5};

    /* renamed from: b */
    public static final int[] f13726b = {6, 2, 7, 3};

    /* renamed from: c */
    public static final int[] f13727c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    public static final int[] f13728d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    public static void m21316a(C7023i[] iVarArr, C7023i[] iVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iVarArr[iArr[i]] = iVarArr2[i];
        }
    }

    /* renamed from: b */
    public static C7133b m21317b(C7016b bVar, Map<DecodeHintType, ?> map, boolean z) {
        C7033b a = bVar.mo32457a();
        List<C7023i[]> c = m21318c(z, a);
        if (c.isEmpty()) {
            a = a.clone();
            a.mo32543l();
            c = m21318c(z, a);
        }
        return new C7133b(a, c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (p040c.p200q.p406e.C7023i[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5[1] == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].mo32487d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5[3] == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].mo32487d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == 0) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<p040c.p200q.p406e.C7023i[]> m21318c(boolean r8, p040c.p200q.p406e.p410l.C7033b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0009:
            r5 = r4
        L_0x000a:
            int r6 = r9.mo32538h()
            if (r3 >= r6) goto L_0x007d
            c.q.e.i[] r4 = m21321f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0053
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x0053
            if (r5 == 0) goto L_0x007d
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            c.q.e.i[] r5 = (p040c.p200q.p406e.C7023i[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x003f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.mo32487d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x003f:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0023
            r5 = r5[r6]
            float r5 = r5.mo32487d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0023
        L_0x004f:
            int r3 = r3 + 5
            r4 = r2
            goto L_0x0009
        L_0x0053:
            r0.add(r4)
            if (r8 == 0) goto L_0x007d
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x006b
            r5 = r4[r3]
            float r5 = r5.mo32486c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.mo32487d()
            goto L_0x0079
        L_0x006b:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.mo32486c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.mo32487d()
        L_0x0079:
            int r3 = (int) r3
            r4 = r5
            r5 = r1
            goto L_0x000a
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p422p.p425e.C7132a.m21318c(boolean, c.q.e.l.b):java.util.List");
    }

    /* renamed from: d */
    public static int[] m21319d(C7033b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bVar.mo32534d(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bVar.mo32534d(i, i2) ^ z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                int i8 = length - 1;
                if (i6 != i8) {
                    i6++;
                } else if (m21322g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i9 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m21322g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    public static C7023i[] m21320e(C7033b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        C7023i[] iVarArr = new C7023i[4];
        int[] iArr2 = new int[iArr.length];
        int i10 = i3;
        while (true) {
            if (i10 >= i9) {
                z = false;
                break;
            }
            int[] d = m21319d(bVar, i4, i10, i2, false, iArr, iArr2);
            if (d != null) {
                int i11 = i10;
                int[] iArr3 = d;
                int i12 = i11;
                while (true) {
                    if (i12 <= 0) {
                        i8 = i12;
                        break;
                    }
                    int i13 = i12 - 1;
                    int[] d2 = m21319d(bVar, i4, i13, i2, false, iArr, iArr2);
                    if (d2 == null) {
                        i8 = i13 + 1;
                        break;
                    }
                    iArr3 = d2;
                    i12 = i13;
                }
                float f = (float) i8;
                iVarArr[0] = new C7023i((float) iArr3[0], f);
                iVarArr[1] = new C7023i((float) iArr3[1], f);
                z = true;
                i10 = i8;
            } else {
                i10 += 5;
            }
        }
        int i14 = i10 + 1;
        if (z) {
            int[] iArr4 = {(int) iVarArr[0].mo32486c(), (int) iVarArr[1].mo32486c()};
            int i15 = i14;
            int i16 = 0;
            while (true) {
                if (i15 >= i9) {
                    i6 = i16;
                    i7 = i15;
                    break;
                }
                i6 = i16;
                i7 = i15;
                int[] d3 = m21319d(bVar, iArr4[0], i15, i2, false, iArr, iArr2);
                if (d3 == null || Math.abs(iArr4[0] - d3[0]) >= 5 || Math.abs(iArr4[1] - d3[1]) >= 5) {
                    if (i6 > 25) {
                        break;
                    }
                    i16 = i6 + 1;
                } else {
                    iArr4 = d3;
                    i16 = 0;
                }
                i15 = i7 + 1;
            }
            i14 = i7 - (i6 + 1);
            float f2 = (float) i14;
            iVarArr[2] = new C7023i((float) iArr4[0], f2);
            iVarArr[3] = new C7023i((float) iArr4[1], f2);
        }
        if (i14 - i10 < 10) {
            for (i5 = 0; i5 < 4; i5++) {
                iVarArr[i5] = null;
            }
        }
        return iVarArr;
    }

    /* renamed from: f */
    public static C7023i[] m21321f(C7033b bVar, int i, int i2) {
        int h = bVar.mo32538h();
        int k = bVar.mo32542k();
        C7023i[] iVarArr = new C7023i[8];
        m21316a(iVarArr, m21320e(bVar, h, k, i, i2, f13727c), f13725a);
        if (iVarArr[4] != null) {
            i2 = (int) iVarArr[4].mo32486c();
            i = (int) iVarArr[4].mo32487d();
        }
        m21316a(iVarArr, m21320e(bVar, h, k, i, i2, f13728d), f13726b);
        return iVarArr;
    }

    /* renamed from: g */
    public static float m21322g(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
