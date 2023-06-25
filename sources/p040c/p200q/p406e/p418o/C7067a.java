package p040c.p200q.p406e.p418o;

import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.a */
/* compiled from: CodaBarReader */
public final class C7067a extends C7077k {

    /* renamed from: d */
    public static final char[] f13558d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    public static final int[] f13559e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    public static final char[] f13560f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    public final StringBuilder f13561a = new StringBuilder(20);

    /* renamed from: b */
    public int[] f13562b = new int[80];

    /* renamed from: c */
    public int f13563c = 0;

    /* renamed from: h */
    public static boolean m20981h(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0103 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040c.p200q.p406e.C7022h mo32640c(int r11, p040c.p200q.p406e.p410l.C7032a r12, java.util.Map<com.google.zxing.DecodeHintType, ?> r13) {
        /*
            r10 = this;
            int[] r0 = r10.f13562b
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.mo32643k(r12)
            int r12 = r10.mo32642j()
            java.lang.StringBuilder r0 = r10.f13561a
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.mo32644l(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0103
            java.lang.StringBuilder r4 = r10.f13561a
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f13561a
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0037
            char[] r4 = f13560f
            char[] r6 = f13558d
            char r2 = r6[r2]
            boolean r2 = m20981h(r4, r2)
            if (r2 != 0) goto L_0x003b
        L_0x0037:
            int r2 = r10.f13563c
            if (r0 < r2) goto L_0x0013
        L_0x003b:
            int[] r2 = r10.f13562b
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = r1
        L_0x0043:
            if (r6 >= r3) goto L_0x004f
            int[] r8 = r10.f13562b
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004f:
            int r3 = r10.f13563c
            r6 = 2
            if (r0 >= r3) goto L_0x005d
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x005d:
            r10.mo32645m(r12)
            r0 = r1
        L_0x0061:
            java.lang.StringBuilder r2 = r10.f13561a
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x0079
            java.lang.StringBuilder r2 = r10.f13561a
            char[] r3 = f13558d
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0079:
            java.lang.StringBuilder r0 = r10.f13561a
            char r0 = r0.charAt(r1)
            char[] r2 = f13560f
            boolean r0 = m20981h(r2, r0)
            if (r0 == 0) goto L_0x00fe
            java.lang.StringBuilder r0 = r10.f13561a
            int r2 = r0.length()
            int r2 = r2 - r5
            char r0 = r0.charAt(r2)
            char[] r2 = f13560f
            boolean r0 = m20981h(r2, r0)
            if (r0 == 0) goto L_0x00f9
            java.lang.StringBuilder r0 = r10.f13561a
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00f4
            if (r13 == 0) goto L_0x00ad
            com.google.zxing.DecodeHintType r0 = com.google.zxing.DecodeHintType.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00bc
        L_0x00ad:
            java.lang.StringBuilder r13 = r10.f13561a
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f13561a
            r13.deleteCharAt(r1)
        L_0x00bc:
            r13 = r1
            r0 = r13
        L_0x00be:
            if (r13 >= r12) goto L_0x00c8
            int[] r2 = r10.f13562b
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00be
        L_0x00c8:
            float r13 = (float) r0
        L_0x00c9:
            if (r12 >= r4) goto L_0x00d3
            int[] r2 = r10.f13562b
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c9
        L_0x00d3:
            float r12 = (float) r0
            c.q.e.h r0 = new c.q.e.h
            java.lang.StringBuilder r2 = r10.f13561a
            java.lang.String r2 = r2.toString()
            r3 = 0
            c.q.e.i[] r4 = new p040c.p200q.p406e.C7023i[r6]
            c.q.e.i r6 = new c.q.e.i
            float r11 = (float) r11
            r6.<init>(r13, r11)
            r4[r1] = r6
            c.q.e.i r13 = new c.q.e.i
            r13.<init>(r12, r11)
            r4[r5] = r13
            com.google.zxing.BarcodeFormat r11 = com.google.zxing.BarcodeFormat.CODABAR
            r0.<init>(r2, r3, r4, r11)
            return r0
        L_0x00f4:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x00f9:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x00fe:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0103:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p418o.C7067a.mo32640c(int, c.q.e.l.a, java.util.Map):c.q.e.h");
    }

    /* renamed from: i */
    public final void mo32641i(int i) {
        int[] iArr = this.f13562b;
        int i2 = this.f13563c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f13563c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f13562b = iArr2;
        }
    }

    /* renamed from: j */
    public final int mo32642j() {
        for (int i = 1; i < this.f13563c; i += 2) {
            int l = mo32644l(i);
            if (l != -1 && m20981h(f13560f, f13558d[l])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f13562b[i3];
                }
                if (i == 1 || this.f13562b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: k */
    public final void mo32643k(C7032a aVar) {
        int i = 0;
        this.f13563c = 0;
        int f = aVar.mo32522f(0);
        int h = aVar.mo32523h();
        if (f < h) {
            boolean z = true;
            while (f < h) {
                if (aVar.mo32517c(f) ^ z) {
                    i++;
                } else {
                    mo32641i(i);
                    z = !z;
                    i = 1;
                }
                f++;
            }
            mo32641i(i);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: l */
    public final int mo32644l(int i) {
        int i2 = i + 7;
        if (i2 >= this.f13563c) {
            return -1;
        }
        int[] iArr = this.f13562b;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f13559e;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    /* renamed from: m */
    public final void mo32645m(int i) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f13561a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f13559e[this.f13561a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f13562b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            fArr2[i9] = ((((float) iArr[i8]) / ((float) iArr2[i8])) + (((float) iArr[i9]) / ((float) iArr2[i9]))) / 2.0f;
            fArr[i8] = fArr2[i9];
            fArr[i9] = ((((float) iArr[i9]) * 2.0f) + 1.5f) / ((float) iArr2[i9]);
        }
        loop3:
        while (true) {
            int i10 = f13559e[this.f13561a.charAt(i2)];
            int i11 = 6;
            while (i11 >= 0) {
                int i12 = (i11 & 1) + ((i10 & 1) << 1);
                float f = (float) this.f13562b[i + i11];
                if (f >= fArr2[i12] && f <= fArr[i12]) {
                    i10 >>= 1;
                    i11--;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
