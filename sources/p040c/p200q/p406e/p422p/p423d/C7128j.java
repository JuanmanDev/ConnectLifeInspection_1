package p040c.p200q.p406e.p422p.p423d;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7033b;
import p040c.p200q.p406e.p410l.C7035d;
import p040c.p200q.p406e.p422p.C7114a;
import p040c.p200q.p406e.p422p.p423d.p424k.C7129a;

/* renamed from: c.q.e.p.d.j */
/* compiled from: PDF417ScanningDecoder */
public final class C7128j {

    /* renamed from: a */
    public static final C7129a f13715a = new C7129a();

    /* renamed from: a */
    public static C7119c m21269a(C7126h hVar) {
        int[] j;
        if (hVar == null || (j = hVar.mo32815j()) == null) {
            return null;
        }
        int p = m21284p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C7120d[] d = hVar.mo32808d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            i += p - j[length];
            if (j[length] > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return hVar.mo32805a().mo32767a(i2, i, hVar.mo32816k());
    }

    /* renamed from: b */
    public static void m21270b(C7124f fVar, C7118b[][] bVarArr) {
        int[] a = bVarArr[0][1].mo32765a();
        int j = (fVar.mo32796j() * fVar.mo32798l()) - m21286r(fVar.mo32797k());
        if (a.length == 0) {
            if (j <= 0 || j > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            bVarArr[0][1].mo32766b(j);
        } else if (a[0] != j) {
            bVarArr[0][1].mo32766b(j);
        }
    }

    /* renamed from: c */
    public static int m21271c(C7033b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != bVar.mo32534d(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    public static boolean m21272d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    public static int m21273e(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f13715a.mo32819a(iArr, i, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* renamed from: f */
    public static C7118b[][] m21274f(C7124f fVar) {
        int c;
        int l = fVar.mo32798l();
        int[] iArr = new int[2];
        iArr[1] = fVar.mo32796j() + 2;
        iArr[0] = l;
        C7118b[][] bVarArr = (C7118b[][]) Array.newInstance(C7118b.class, iArr);
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new C7118b();
            }
        }
        int i3 = 0;
        for (C7125g gVar : fVar.mo32801o()) {
            if (gVar != null) {
                for (C7120d dVar : gVar.mo32808d()) {
                    if (dVar != null && (c = dVar.mo32780c()) >= 0 && c < bVarArr.length) {
                        bVarArr[c][i3].mo32766b(dVar.mo32782e());
                    }
                }
            }
            i3++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    public static C7035d m21275g(C7124f fVar) {
        C7118b[][] f = m21274f(fVar);
        m21270b(fVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.mo32798l() * fVar.mo32796j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.mo32798l(); i++) {
            int i2 = 0;
            while (i2 < fVar.mo32796j()) {
                int i3 = i2 + 1;
                int[] a = f[i][i3].mo32765a();
                int j = (fVar.mo32796j() * i) + i2;
                if (a.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a.length == 1) {
                    iArr[j] = a[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m21276h(fVar.mo32797k(), iArr, C7114a.m21186b(arrayList), C7114a.m21186b(arrayList3), iArr2);
    }

    /* renamed from: h */
    public static C7035d m21276h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m21278j(iArr, i, iArr2);
                } catch (ChecksumException unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != length - 1) {
                                    i5++;
                                } else {
                                    throw ChecksumException.getChecksumInstance();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
    }

    /* renamed from: i */
    public static C7035d m21277i(C7033b bVar, C7023i iVar, C7023i iVar2, C7023i iVar3, C7023i iVar4, int i, int i2) {
        C7125g gVar;
        int i3;
        int i4;
        int i5;
        int i6;
        C7126h hVar = null;
        C7126h hVar2 = null;
        C7124f fVar = null;
        int i7 = 0;
        C7119c cVar = new C7119c(bVar, iVar, iVar2, iVar3, iVar4);
        while (true) {
            if (i7 >= 2) {
                break;
            }
            if (iVar != null) {
                hVar = m21287s(bVar, cVar, iVar, true, i, i2);
            }
            if (iVar3 != null) {
                hVar2 = m21287s(bVar, cVar, iVar3, false, i, i2);
            }
            fVar = m21290v(hVar, hVar2);
            if (fVar == null) {
                throw NotFoundException.getNotFoundInstance();
            } else if (i7 != 0 || fVar.mo32799m() == null || (fVar.mo32799m().mo32774h() >= cVar.mo32774h() && fVar.mo32799m().mo32772f() <= cVar.mo32772f())) {
                fVar.mo32802p(cVar);
            } else {
                cVar = fVar.mo32799m();
                i7++;
            }
        }
        fVar.mo32802p(cVar);
        int j = fVar.mo32796j() + 1;
        fVar.mo32803q(0, hVar);
        fVar.mo32803q(j, hVar2);
        boolean z = hVar != null;
        int i8 = i;
        int i9 = i2;
        for (int i10 = 1; i10 <= j; i10++) {
            int i11 = z ? i10 : j - i10;
            if (fVar.mo32800n(i11) == null) {
                if (i11 == 0 || i11 == j) {
                    gVar = new C7126h(cVar, i11 == 0);
                } else {
                    gVar = new C7125g(cVar);
                }
                fVar.mo32803q(i11, gVar);
                int i12 = -1;
                int h = cVar.mo32774h();
                int i13 = -1;
                while (h <= cVar.mo32772f()) {
                    int t = m21288t(fVar, i11, h, z);
                    if (t >= 0 && t <= cVar.mo32771e()) {
                        i6 = t;
                    } else if (i13 != i12) {
                        i6 = i13;
                    } else {
                        i5 = i13;
                        i4 = h;
                        i3 = i12;
                        i13 = i5;
                        h = i4 + 1;
                        i12 = i3;
                    }
                    i5 = i13;
                    int i14 = h;
                    i3 = i12;
                    C7120d k = m21279k(bVar, cVar.mo32773g(), cVar.mo32771e(), z, i6, i14, i8, i9);
                    i4 = i14;
                    if (k != null) {
                        gVar.mo32810f(i4, k);
                        i8 = Math.min(i8, k.mo32783f());
                        i9 = Math.max(i9, k.mo32783f());
                        i13 = i6;
                        h = i4 + 1;
                        i12 = i3;
                    }
                    i13 = i5;
                    h = i4 + 1;
                    i12 = i3;
                }
            }
        }
        return m21275g(fVar);
    }

    /* renamed from: j */
    public static C7035d m21278j(int[] iArr, int i, int[] iArr2) {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m21273e(iArr, iArr2, i2);
            m21291w(iArr, i2);
            C7035d b = C7121e.m21228b(iArr, String.valueOf(i));
            b.mo32563k(Integer.valueOf(e));
            b.mo32562j(Integer.valueOf(iArr2.length));
            return b;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = p040c.p200q.p406e.p422p.p423d.C7127i.m21267d(r7);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p406e.p422p.p423d.C7120d m21279k(p040c.p200q.p406e.p410l.C7033b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m21271c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m21285q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = p040c.p200q.p406e.p410l.p411l.C7043a.m20886d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = m21272d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = p040c.p200q.p406e.p422p.p423d.C7127i.m21267d(r7)
            int r9 = p040c.p200q.p406e.p422p.C7114a.m21185a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            c.q.e.p.d.d r8 = new c.q.e.p.d.d
            int r7 = m21282n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p422p.p423d.C7128j.m21279k(c.q.e.l.b, int, int, boolean, int, int, int, int):c.q.e.p.d.d");
    }

    /* renamed from: l */
    public static C7117a m21280l(C7126h hVar, C7126h hVar2) {
        C7117a i;
        C7117a i2;
        if (hVar == null || (i = hVar.mo32814i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.mo32814i();
        } else if (hVar2 == null || (i2 = hVar2.mo32814i()) == null || i.mo32760a() == i2.mo32760a() || i.mo32761b() == i2.mo32761b() || i.mo32762c() == i2.mo32762c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    public static int[] m21281m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    public static int m21282n(int i) {
        return m21283o(m21281m(i));
    }

    /* renamed from: o */
    public static int m21283o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    public static int m21284p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: q */
    public static int[] m21285q(C7033b bVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (bVar.mo32534d(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: r */
    public static int m21286r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    public static C7126h m21287s(C7033b bVar, C7119c cVar, C7023i iVar, boolean z, int i, int i2) {
        int i3;
        boolean z2 = z;
        C7126h hVar = new C7126h(cVar, z2);
        int i4 = 0;
        while (i4 < 2) {
            int i5 = i4 == 0 ? 1 : -1;
            int c = (int) iVar.mo32486c();
            int d = (int) iVar.mo32487d();
            while (d <= cVar.mo32772f() && d >= cVar.mo32774h()) {
                C7120d k = m21279k(bVar, 0, bVar.mo32542k(), z, c, d, i, i2);
                if (k != null) {
                    hVar.mo32810f(d, k);
                    if (z2) {
                        i3 = k.mo32781d();
                    } else {
                        i3 = k.mo32779b();
                    }
                    c = i3;
                }
                d += i5;
            }
            i4++;
        }
        return hVar;
    }

    /* renamed from: t */
    public static int m21288t(C7124f fVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C7120d dVar = null;
        int i4 = i - i3;
        if (m21289u(fVar, i4)) {
            dVar = fVar.mo32800n(i4).mo32806b(i2);
        }
        if (dVar != null) {
            return z ? dVar.mo32779b() : dVar.mo32781d();
        }
        C7120d c = fVar.mo32800n(i).mo32807c(i2);
        if (c != null) {
            return z ? c.mo32781d() : c.mo32779b();
        }
        if (m21289u(fVar, i4)) {
            c = fVar.mo32800n(i4).mo32807c(i2);
        }
        if (c != null) {
            return z ? c.mo32779b() : c.mo32781d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m21289u(fVar, i)) {
                for (C7120d dVar2 : fVar.mo32800n(i).mo32808d()) {
                    if (dVar2 != null) {
                        return (z ? dVar2.mo32779b() : dVar2.mo32781d()) + (i3 * i5 * (dVar2.mo32779b() - dVar2.mo32781d()));
                    }
                }
                i5++;
            } else {
                C7119c m = fVar.mo32799m();
                return z ? m.mo32773g() : m.mo32771e();
            }
        }
    }

    /* renamed from: u */
    public static boolean m21289u(C7124f fVar, int i) {
        return i >= 0 && i <= fVar.mo32796j() + 1;
    }

    /* renamed from: v */
    public static C7124f m21290v(C7126h hVar, C7126h hVar2) {
        C7117a l;
        if ((hVar == null && hVar2 == null) || (l = m21280l(hVar, hVar2)) == null) {
            return null;
        }
        return new C7124f(l, C7119c.m21205l(m21269a(hVar), m21269a(hVar2)));
    }

    /* renamed from: w */
    public static void m21291w(int[] iArr, int i) {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw FormatException.getFormatInstance();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw FormatException.getFormatInstance();
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }
}
