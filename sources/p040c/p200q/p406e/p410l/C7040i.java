package p040c.p200q.p406e.p410l;

import p040c.p200q.p406e.C7017c;

/* renamed from: c.q.e.l.i */
/* compiled from: HybridBinarizer */
public final class C7040i extends C7038g {

    /* renamed from: e */
    public C7033b f13476e;

    public C7040i(C7017c cVar) {
        super(cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[][] m20871h(byte[] r17, int r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 1
            r3[r4] = r0
            r5 = 0
            r3[r5] = r1
            java.lang.Class<int> r6 = int.class
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r6, r3)
            int[][] r3 = (int[][]) r3
            r6 = r5
        L_0x0016:
            if (r6 >= r1) goto L_0x00a1
            int r7 = r6 << 3
            r8 = 8
            int r9 = r21 + -8
            if (r7 <= r9) goto L_0x0021
            r7 = r9
        L_0x0021:
            r9 = r5
        L_0x0022:
            if (r9 >= r0) goto L_0x0099
            int r10 = r9 << 3
            int r11 = r20 + -8
            if (r10 <= r11) goto L_0x002b
            r10 = r11
        L_0x002b:
            int r11 = r7 * r20
            int r11 = r11 + r10
            r10 = 255(0xff, float:3.57E-43)
            r12 = r5
            r13 = r12
            r14 = r13
            r15 = r10
        L_0x0034:
            r5 = 24
            if (r12 >= r8) goto L_0x0068
            r2 = 0
        L_0x0039:
            if (r2 >= r8) goto L_0x004b
            int r16 = r11 + r2
            byte r4 = r17[r16]
            r4 = r4 & r10
            int r13 = r13 + r4
            if (r4 >= r15) goto L_0x0044
            r15 = r4
        L_0x0044:
            if (r4 <= r14) goto L_0x0047
            r14 = r4
        L_0x0047:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0039
        L_0x004b:
            int r2 = r14 - r15
            if (r2 <= r5) goto L_0x0061
        L_0x004f:
            int r12 = r12 + 1
            int r11 = r11 + r20
            if (r12 >= r8) goto L_0x0061
            r2 = 0
        L_0x0056:
            if (r2 >= r8) goto L_0x004f
            int r4 = r11 + r2
            byte r4 = r17[r4]
            r4 = r4 & r10
            int r13 = r13 + r4
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0061:
            r2 = 1
            int r12 = r12 + r2
            int r11 = r11 + r20
            r4 = r2
            r2 = 2
            goto L_0x0034
        L_0x0068:
            r2 = r4
            int r4 = r13 >> 6
            int r14 = r14 - r15
            if (r14 > r5) goto L_0x008e
            int r4 = r15 / 2
            if (r6 <= 0) goto L_0x008e
            if (r9 <= 0) goto L_0x008e
            int r5 = r6 + -1
            r10 = r3[r5]
            r10 = r10[r9]
            r11 = r3[r6]
            int r12 = r9 + -1
            r11 = r11[r12]
            r13 = 2
            int r11 = r11 * r13
            int r10 = r10 + r11
            r5 = r3[r5]
            r5 = r5[r12]
            int r10 = r10 + r5
            int r5 = r10 / 4
            if (r15 >= r5) goto L_0x008f
            r4 = r5
            goto L_0x008f
        L_0x008e:
            r13 = 2
        L_0x008f:
            r5 = r3[r6]
            r5[r9] = r4
            int r9 = r9 + 1
            r4 = r2
            r2 = r13
            r5 = 0
            goto L_0x0022
        L_0x0099:
            r13 = r2
            r2 = r4
            int r6 = r6 + 1
            r2 = r13
            r5 = 0
            goto L_0x0016
        L_0x00a1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p410l.C7040i.m20871h(byte[], int, int, int, int):int[][]");
    }

    /* renamed from: i */
    public static void m20872i(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C7033b bVar) {
        int i5 = i;
        int i6 = i2;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 << 3;
            int i9 = i4 - 8;
            if (i8 > i9) {
                i8 = i9;
            }
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 << 3;
                int i12 = i3 - 8;
                if (i11 <= i12) {
                    i12 = i11;
                }
                int j = m20873j(i10, 2, i5 - 3);
                int j2 = m20873j(i7, 2, i6 - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[j2 + i14];
                    i13 += iArr2[j - 2] + iArr2[j - 1] + iArr2[j] + iArr2[j + 1] + iArr2[j + 2];
                }
                m20874k(bArr, i12, i8, i13 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: j */
    public static int m20873j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: k */
    public static void m20874k(byte[] bArr, int i, int i2, int i3, int i4, C7033b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo32544m(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    public C7033b mo32452a() {
        C7033b bVar = this.f13476e;
        if (bVar != null) {
            return bVar;
        }
        C7017c d = mo32455d();
        int d2 = d.mo32467d();
        int a = d.mo32464a();
        if (d2 < 40 || a < 40) {
            this.f13476e = super.mo32452a();
        } else {
            byte[] b = d.mo32465b();
            int i = d2 >> 3;
            if ((d2 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a >> 3;
            if ((a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] h = m20871h(b, i2, i4, d2, a);
            C7033b bVar2 = new C7033b(d2, a);
            m20872i(b, i2, i4, d2, a, h, bVar2);
            this.f13476e = bVar2;
        }
        return this.f13476e;
    }
}
