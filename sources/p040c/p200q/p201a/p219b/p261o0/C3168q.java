package p040c.p200q.p201a.p219b.p261o0;

import androidx.camera.core.VideoCapture;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: c.q.a.b.o0.q */
/* compiled from: NalUnitUtil */
public final class C3168q {

    /* renamed from: a */
    public static final byte[] f5853a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f5854b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f5855c = new Object();

    /* renamed from: d */
    public static int[] f5856d = new int[10];

    /* renamed from: c.q.a.b.o0.q$a */
    /* compiled from: NalUnitUtil */
    public static final class C3169a {

        /* renamed from: a */
        public final int f5857a;

        /* renamed from: b */
        public final int f5858b;

        /* renamed from: c */
        public final boolean f5859c;

        public C3169a(int i, int i2, boolean z) {
            this.f5857a = i;
            this.f5858b = i2;
            this.f5859c = z;
        }
    }

    /* renamed from: c.q.a.b.o0.q$b */
    /* compiled from: NalUnitUtil */
    public static final class C3170b {

        /* renamed from: a */
        public final int f5860a;

        /* renamed from: b */
        public final int f5861b;

        /* renamed from: c */
        public final int f5862c;

        /* renamed from: d */
        public final int f5863d;

        /* renamed from: e */
        public final int f5864e;

        /* renamed from: f */
        public final int f5865f;

        /* renamed from: g */
        public final float f5866g;

        /* renamed from: h */
        public final boolean f5867h;

        /* renamed from: i */
        public final boolean f5868i;

        /* renamed from: j */
        public final int f5869j;

        /* renamed from: k */
        public final int f5870k;

        /* renamed from: l */
        public final int f5871l;

        /* renamed from: m */
        public final boolean f5872m;

        public C3170b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f5860a = i;
            this.f5861b = i2;
            this.f5862c = i3;
            this.f5863d = i4;
            this.f5864e = i5;
            this.f5865f = i6;
            this.f5866g = f;
            this.f5867h = z;
            this.f5868i = z2;
            this.f5869j = i7;
            this.f5870k = i8;
            this.f5871l = i9;
            this.f5872m = z3;
        }
    }

    /* renamed from: a */
    public static void m7902a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m7903b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0097, code lost:
        r8 = true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7904c(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = r2
            goto L_0x0009
        L_0x0008:
            r3 = r1
        L_0x0009:
            p040c.p200q.p201a.p219b.p261o0.C3151e.m7759g(r3)
            if (r0 != 0) goto L_0x000f
            return r9
        L_0x000f:
            r3 = 2
            if (r10 == 0) goto L_0x0040
            boolean r4 = r10[r1]
            if (r4 == 0) goto L_0x001c
            m7902a(r10)
            int r8 = r8 + -3
            return r8
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r7[r8]
            if (r4 != r2) goto L_0x002b
            m7902a(r10)
            int r8 = r8 - r3
            return r8
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r10[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r7[r8]
            if (r4 != 0) goto L_0x0040
            int r4 = r8 + 1
            byte r4 = r7[r4]
            if (r4 != r2) goto L_0x0040
            m7902a(r10)
            int r8 = r8 - r2
            return r8
        L_0x0040:
            int r4 = r9 + -1
            int r8 = r8 + r3
        L_0x0043:
            if (r8 >= r4) goto L_0x0067
            byte r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            int r5 = r8 + -2
            byte r6 = r7[r5]
            if (r6 != 0) goto L_0x0062
            int r6 = r8 + -1
            byte r6 = r7[r6]
            if (r6 != 0) goto L_0x0062
            byte r6 = r7[r8]
            if (r6 != r2) goto L_0x0062
            if (r10 == 0) goto L_0x0061
            m7902a(r10)
        L_0x0061:
            return r5
        L_0x0062:
            int r8 = r8 + -2
        L_0x0064:
            int r8 = r8 + 3
            goto L_0x0043
        L_0x0067:
            if (r10 == 0) goto L_0x00bb
            if (r0 <= r3) goto L_0x007e
            int r8 = r9 + -3
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
            goto L_0x0097
        L_0x007c:
            r8 = r1
            goto L_0x0098
        L_0x007e:
            if (r0 != r3) goto L_0x008f
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x007c
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
            goto L_0x0097
        L_0x008f:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
        L_0x0097:
            r8 = r2
        L_0x0098:
            r10[r1] = r8
            if (r0 <= r2) goto L_0x00a7
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
            goto L_0x00af
        L_0x00a7:
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
        L_0x00af:
            r8 = r2
            goto L_0x00b2
        L_0x00b1:
            r8 = r1
        L_0x00b2:
            r10[r2] = r8
            byte r7 = r7[r4]
            if (r7 != 0) goto L_0x00b9
            r1 = r2
        L_0x00b9:
            r10[r3] = r1
        L_0x00bb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p261o0.C3168q.m7904c(byte[], int, int, boolean[]):int");
    }

    /* renamed from: d */
    public static int m7905d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    public static int m7906e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m7907f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m7908g(String str, byte b) {
        if (VideoCapture.VIDEO_MIME_TYPE.equals(str) && (b & 31) == 6) {
            return true;
        }
        if (!"video/hevc".equals(str) || ((b & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static C3169a m7909h(byte[] bArr, int i, int i2) {
        C3174u uVar = new C3174u(bArr, i, i2);
        uVar.mo20045l(8);
        int h = uVar.mo20041h();
        int h2 = uVar.mo20041h();
        uVar.mo20044k();
        return new C3169a(h, h2, uVar.mo20037d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p201a.p219b.p261o0.C3168q.C3170b m7910i(byte[] r21, int r22, int r23) {
        /*
            c.q.a.b.o0.u r0 = new c.q.a.b.o0.u
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo20045l(r1)
            int r3 = r0.mo20038e(r1)
            int r4 = r0.mo20038e(r1)
            int r5 = r0.mo20038e(r1)
            int r6 = r0.mo20041h()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004e
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r10 = r9
            r11 = 0
            goto L_0x0086
        L_0x004e:
            int r10 = r0.mo20041h()
            if (r10 != r2) goto L_0x0059
            boolean r11 = r0.mo20037d()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.mo20041h()
            r0.mo20041h()
            r0.mo20044k()
            boolean r12 = r0.mo20037d()
            if (r12 == 0) goto L_0x0086
            if (r10 == r2) goto L_0x006d
            r12 = r1
            goto L_0x006f
        L_0x006d:
            r12 = 12
        L_0x006f:
            r13 = 0
        L_0x0070:
            if (r13 >= r12) goto L_0x0086
            boolean r14 = r0.mo20037d()
            if (r14 == 0) goto L_0x0083
            r14 = 6
            if (r13 >= r14) goto L_0x007e
            r14 = 16
            goto L_0x0080
        L_0x007e:
            r14 = 64
        L_0x0080:
            m7911j(r0, r14)
        L_0x0083:
            int r13 = r13 + 1
            goto L_0x0070
        L_0x0086:
            int r12 = r0.mo20041h()
            int r12 = r12 + 4
            int r13 = r0.mo20041h()
            if (r13 != 0) goto L_0x0099
            int r14 = r0.mo20041h()
            int r14 = r14 + 4
            goto L_0x00ba
        L_0x0099:
            if (r13 != r9) goto L_0x00b9
            boolean r14 = r0.mo20037d()
            r0.mo20040g()
            r0.mo20040g()
            int r15 = r0.mo20041h()
            long r1 = (long) r15
            r15 = 0
        L_0x00ab:
            long r7 = (long) r15
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b6
            r0.mo20041h()
            int r15 = r15 + 1
            goto L_0x00ab
        L_0x00b6:
            r15 = r14
            r14 = 0
            goto L_0x00bb
        L_0x00b9:
            r14 = 0
        L_0x00ba:
            r15 = 0
        L_0x00bb:
            r0.mo20041h()
            r0.mo20044k()
            int r1 = r0.mo20041h()
            int r1 = r1 + r9
            int r2 = r0.mo20041h()
            int r2 = r2 + r9
            boolean r16 = r0.mo20037d()
            int r7 = 2 - r16
            int r7 = r7 * r2
            if (r16 != 0) goto L_0x00d7
            r0.mo20044k()
        L_0x00d7:
            r0.mo20044k()
            r2 = 16
            int r1 = r1 * r2
            int r7 = r7 * r2
            boolean r2 = r0.mo20037d()
            if (r2 == 0) goto L_0x0117
            int r2 = r0.mo20041h()
            int r8 = r0.mo20041h()
            int r17 = r0.mo20041h()
            int r18 = r0.mo20041h()
            if (r10 != 0) goto L_0x00f9
            int r10 = 2 - r16
            goto L_0x010e
        L_0x00f9:
            r19 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0102
            r9 = 1
            r20 = 1
            goto L_0x0105
        L_0x0102:
            r20 = r19
            r9 = 1
        L_0x0105:
            if (r10 != r9) goto L_0x0109
            r9 = r19
        L_0x0109:
            int r10 = 2 - r16
            int r10 = r10 * r9
            r9 = r20
        L_0x010e:
            int r2 = r2 + r8
            int r2 = r2 * r9
            int r1 = r1 - r2
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r7 = r7 - r17
        L_0x0117:
            r8 = r7
            r7 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.mo20037d()
            if (r2 == 0) goto L_0x0162
            boolean r2 = r0.mo20037d()
            if (r2 == 0) goto L_0x0162
            r2 = 8
            int r2 = r0.mo20038e(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0143
            r9 = 16
            int r2 = r0.mo20038e(r9)
            int r0 = r0.mo20038e(r9)
            if (r2 == 0) goto L_0x0162
            if (r0 == 0) goto L_0x0162
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x0162
        L_0x0143:
            float[] r0 = f5854b
            int r9 = r0.length
            if (r2 >= r9) goto L_0x014c
            r0 = r0[r2]
            r9 = r0
            goto L_0x0163
        L_0x014c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r2, r0)
        L_0x0162:
            r9 = r1
        L_0x0163:
            c.q.a.b.o0.q$b r0 = new c.q.a.b.o0.q$b
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p261o0.C3168q.m7910i(byte[], int, int):c.q.a.b.o0.q$b");
    }

    /* renamed from: j */
    public static void m7911j(C3174u uVar, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((uVar.mo20040g() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: k */
    public static int m7912k(byte[] bArr, int i) {
        int i2;
        synchronized (f5855c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m7905d(bArr, i3, i);
                    if (i3 < i) {
                        if (f5856d.length <= i4) {
                            f5856d = Arrays.copyOf(f5856d, f5856d.length * 2);
                        }
                        f5856d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f5856d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
