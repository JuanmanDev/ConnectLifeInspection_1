package p040c.p200q.p406e.p426q.p428c;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.C7024j;
import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.q.c.e */
/* compiled from: FinderPatternFinder */
public class C7157e {

    /* renamed from: a */
    public final C7033b f13778a;

    /* renamed from: b */
    public final List<C7156d> f13779b = new ArrayList();

    /* renamed from: c */
    public boolean f13780c;

    /* renamed from: d */
    public final int[] f13781d = new int[5];

    /* renamed from: e */
    public final C7024j f13782e;

    /* renamed from: c.q.e.q.c.e$b */
    /* compiled from: FinderPatternFinder */
    public static final class C7159b implements Serializable, Comparator<C7156d> {

        /* renamed from: e */
        public final float f13783e;

        /* renamed from: a */
        public int compare(C7156d dVar, C7156d dVar2) {
            if (dVar2.mo32891h() != dVar.mo32891h()) {
                return dVar2.mo32891h() - dVar.mo32891h();
            }
            float abs = Math.abs(dVar2.mo32892i() - this.f13783e);
            float abs2 = Math.abs(dVar.mo32892i() - this.f13783e);
            if (abs < abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }

        public C7159b(float f) {
            this.f13783e = f;
        }
    }

    /* renamed from: c.q.e.q.c.e$c */
    /* compiled from: FinderPatternFinder */
    public static final class C7160c implements Serializable, Comparator<C7156d> {

        /* renamed from: e */
        public final float f13784e;

        /* renamed from: a */
        public int compare(C7156d dVar, C7156d dVar2) {
            float abs = Math.abs(dVar2.mo32892i() - this.f13784e);
            float abs2 = Math.abs(dVar.mo32892i() - this.f13784e);
            if (abs < abs2) {
                return -1;
            }
            return abs == abs2 ? 0 : 1;
        }

        public C7160c(float f) {
            this.f13784e = f;
        }
    }

    public C7157e(C7033b bVar, C7024j jVar) {
        this.f13778a = bVar;
        this.f13782e = jVar;
    }

    /* renamed from: a */
    public static float m21401a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: g */
    public static boolean m21402g(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b7 A[LOOP:4: B:41:0x00a2->B:49:0x00b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf A[ADDED_TO_REGION, EDGE_INSN: B:87:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:88:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:89:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:90:0x00bf->B:50:0x00bf ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00df A[LOOP:5: B:55:0x00ca->B:63:0x00df, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e7 A[EDGE_INSN: B:91:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:92:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:93:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:94:0x00e7->B:64:0x00e7 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32893b(int r17, int r18, int r19, int r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int[] r4 = r16.mo32898h()
            r5 = 0
            r6 = r5
        L_0x000e:
            r7 = 2
            r8 = 1
            if (r1 < r6) goto L_0x0028
            if (r2 < r6) goto L_0x0028
            c.q.e.l.b r9 = r0.f13778a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo32534d(r10, r11)
            if (r9 == 0) goto L_0x0028
            r9 = r4[r7]
            int r9 = r9 + r8
            r4[r7] = r9
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0028:
            if (r1 < r6) goto L_0x010b
            if (r2 >= r6) goto L_0x002e
            goto L_0x010b
        L_0x002e:
            if (r1 < r6) goto L_0x004a
            if (r2 < r6) goto L_0x004a
            c.q.e.l.b r9 = r0.f13778a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo32534d(r10, r11)
            if (r9 != 0) goto L_0x004a
            r9 = r4[r8]
            if (r9 > r3) goto L_0x004a
            r9 = r4[r8]
            int r9 = r9 + r8
            r4[r8] = r9
            int r6 = r6 + 1
            goto L_0x002e
        L_0x004a:
            if (r1 < r6) goto L_0x010b
            if (r2 < r6) goto L_0x010b
            r9 = r4[r8]
            if (r9 <= r3) goto L_0x0054
            goto L_0x010b
        L_0x0054:
            if (r1 < r6) goto L_0x0070
            if (r2 < r6) goto L_0x0070
            c.q.e.l.b r9 = r0.f13778a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo32534d(r10, r11)
            if (r9 == 0) goto L_0x0070
            r9 = r4[r5]
            if (r9 > r3) goto L_0x0070
            r9 = r4[r5]
            int r9 = r9 + r8
            r4[r5] = r9
            int r6 = r6 + 1
            goto L_0x0054
        L_0x0070:
            r6 = r4[r5]
            if (r6 <= r3) goto L_0x0075
            return r5
        L_0x0075:
            c.q.e.l.b r6 = r0.f13778a
            int r6 = r6.mo32538h()
            c.q.e.l.b r9 = r0.f13778a
            int r9 = r9.mo32542k()
            r10 = r8
        L_0x0082:
            int r11 = r1 + r10
            if (r11 >= r6) goto L_0x009a
            int r12 = r2 + r10
            if (r12 >= r9) goto L_0x009a
            c.q.e.l.b r13 = r0.f13778a
            boolean r12 = r13.mo32534d(r12, r11)
            if (r12 == 0) goto L_0x009a
            r11 = r4[r7]
            int r11 = r11 + r8
            r4[r7] = r11
            int r10 = r10 + 1
            goto L_0x0082
        L_0x009a:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 < r9) goto L_0x00a2
            goto L_0x010b
        L_0x00a2:
            int r11 = r1 + r10
            r12 = 3
            if (r11 >= r6) goto L_0x00bf
            int r13 = r2 + r10
            if (r13 >= r9) goto L_0x00bf
            c.q.e.l.b r14 = r0.f13778a
            boolean r13 = r14.mo32534d(r13, r11)
            if (r13 != 0) goto L_0x00bf
            r13 = r4[r12]
            if (r13 >= r3) goto L_0x00bf
            r11 = r4[r12]
            int r11 = r11 + r8
            r4[r12] = r11
            int r10 = r10 + 1
            goto L_0x00a2
        L_0x00bf:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 >= r9) goto L_0x010b
            r11 = r4[r12]
            if (r11 < r3) goto L_0x00ca
            goto L_0x010b
        L_0x00ca:
            int r11 = r1 + r10
            r13 = 4
            if (r11 >= r6) goto L_0x00e7
            int r14 = r2 + r10
            if (r14 >= r9) goto L_0x00e7
            c.q.e.l.b r15 = r0.f13778a
            boolean r11 = r15.mo32534d(r14, r11)
            if (r11 == 0) goto L_0x00e7
            r11 = r4[r13]
            if (r11 >= r3) goto L_0x00e7
            r11 = r4[r13]
            int r11 = r11 + r8
            r4[r13] = r11
            int r10 = r10 + 1
            goto L_0x00ca
        L_0x00e7:
            r1 = r4[r13]
            if (r1 < r3) goto L_0x00ec
            return r5
        L_0x00ec:
            r1 = r4[r5]
            r2 = r4[r8]
            int r1 = r1 + r2
            r2 = r4[r7]
            int r1 = r1 + r2
            r2 = r4[r12]
            int r1 = r1 + r2
            r2 = r4[r13]
            int r1 = r1 + r2
            int r1 = r1 - r20
            int r1 = java.lang.Math.abs(r1)
            int r2 = r20 * 2
            if (r1 >= r2) goto L_0x010b
            boolean r1 = m21402g(r4)
            if (r1 == 0) goto L_0x010b
            return r8
        L_0x010b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p426q.p428c.C7157e.mo32893b(int, int, int, int):boolean");
    }

    /* renamed from: c */
    public final float mo32894c(int i, int i2, int i3, int i4) {
        C7033b bVar = this.f13778a;
        int k = bVar.mo32542k();
        int[] h = mo32898h();
        int i5 = i;
        while (i5 >= 0 && bVar.mo32534d(i5, i2)) {
            h[2] = h[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo32534d(i5, i2) && h[1] <= i3) {
            h[1] = h[1] + 1;
            i5--;
        }
        if (i5 >= 0 && h[1] <= i3) {
            while (i5 >= 0 && bVar.mo32534d(i5, i2) && h[0] <= i3) {
                h[0] = h[0] + 1;
                i5--;
            }
            if (h[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < k && bVar.mo32534d(i6, i2)) {
                h[2] = h[2] + 1;
                i6++;
            }
            if (i6 == k) {
                return Float.NaN;
            }
            while (i6 < k && !bVar.mo32534d(i6, i2) && h[3] < i3) {
                h[3] = h[3] + 1;
                i6++;
            }
            if (i6 != k && h[3] < i3) {
                while (i6 < k && bVar.mo32534d(i6, i2) && h[4] < i3) {
                    h[4] = h[4] + 1;
                    i6++;
                }
                if (h[4] < i3 && Math.abs(((((h[0] + h[1]) + h[2]) + h[3]) + h[4]) - i4) * 5 < i4 && m21402g(h)) {
                    return m21401a(h, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    public final float mo32895d(int i, int i2, int i3, int i4) {
        C7033b bVar = this.f13778a;
        int h = bVar.mo32538h();
        int[] h2 = mo32898h();
        int i5 = i;
        while (i5 >= 0 && bVar.mo32534d(i2, i5)) {
            h2[2] = h2[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo32534d(i2, i5) && h2[1] <= i3) {
            h2[1] = h2[1] + 1;
            i5--;
        }
        if (i5 >= 0 && h2[1] <= i3) {
            while (i5 >= 0 && bVar.mo32534d(i2, i5) && h2[0] <= i3) {
                h2[0] = h2[0] + 1;
                i5--;
            }
            if (h2[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < h && bVar.mo32534d(i2, i6)) {
                h2[2] = h2[2] + 1;
                i6++;
            }
            if (i6 == h) {
                return Float.NaN;
            }
            while (i6 < h && !bVar.mo32534d(i2, i6) && h2[3] < i3) {
                h2[3] = h2[3] + 1;
                i6++;
            }
            if (i6 != h && h2[3] < i3) {
                while (i6 < h && bVar.mo32534d(i2, i6) && h2[4] < i3) {
                    h2[4] = h2[4] + 1;
                    i6++;
                }
                if (h2[4] < i3 && Math.abs(((((h2[0] + h2[1]) + h2[2]) + h2[3]) + h2[4]) - i4) * 5 < i4 * 2 && m21402g(h2)) {
                    return m21401a(h2, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: e */
    public final C7161f mo32896e(Map<DecodeHintType, ?> map) {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        boolean z2 = map != null && map.containsKey(DecodeHintType.PURE_BARCODE);
        int h = this.f13778a.mo32538h();
        int k = this.f13778a.mo32542k();
        int i = (h * 3) / 228;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z3 = false;
        while (i2 < h && !z3) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < k) {
                if (this.f13778a.mo32534d(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!m21402g(iArr)) {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    } else if (mo32899i(iArr, i2, i3, z2)) {
                        if (this.f13780c) {
                            z3 = mo32900j();
                        } else {
                            int f = mo32897f();
                            if (f > iArr[2]) {
                                i2 += (f - iArr[2]) - 2;
                                i3 = k - 1;
                            }
                        }
                        iArr[0] = 0;
                        iArr[1] = 0;
                        iArr[2] = 0;
                        iArr[3] = 0;
                        iArr[4] = 0;
                        i4 = 0;
                        i = 2;
                    } else {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m21402g(iArr) && mo32899i(iArr, i2, k, z2)) {
                i = iArr[0];
                if (this.f13780c) {
                    z3 = mo32900j();
                }
            }
            i2 += i;
        }
        C7156d[] k2 = mo32901k();
        C7023i.m20775e(k2);
        return new C7161f(k2);
    }

    /* renamed from: f */
    public final int mo32897f() {
        if (this.f13779b.size() <= 1) {
            return 0;
        }
        C7156d dVar = null;
        for (C7156d next : this.f13779b) {
            if (next.mo32891h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f13780c = true;
                    return ((int) (Math.abs(dVar.mo32486c() - next.mo32486c()) - Math.abs(dVar.mo32487d() - next.mo32487d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: h */
    public final int[] mo32898h() {
        int[] iArr = this.f13781d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    /* renamed from: i */
    public final boolean mo32899i(int[] iArr, int i, int i2, boolean z) {
        boolean z2 = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m21401a(iArr, i2);
        float d = mo32895d(i, a, iArr[2], i3);
        if (!Float.isNaN(d)) {
            int i4 = (int) d;
            float c = mo32894c(a, i4, iArr[2], i3);
            if (!Float.isNaN(c) && (!z || mo32893b(i4, (int) c, iArr[2], i3))) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f13779b.size()) {
                        break;
                    }
                    C7156d dVar = this.f13779b.get(i5);
                    if (dVar.mo32889f(f, d, c)) {
                        this.f13779b.set(i5, dVar.mo32890g(d, c, f));
                        z2 = true;
                        break;
                    }
                    i5++;
                }
                if (!z2) {
                    C7156d dVar2 = new C7156d(c, d, f);
                    this.f13779b.add(dVar2);
                    C7024j jVar = this.f13782e;
                    if (jVar != null) {
                        jVar.mo32491a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo32900j() {
        int size = this.f13779b.size();
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        for (C7156d next : this.f13779b) {
            if (next.mo32891h() >= 2) {
                i++;
                f2 += next.mo32892i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C7156d i2 : this.f13779b) {
            f += Math.abs(i2.mo32892i() - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final C7156d[] mo32901k() {
        int size = this.f13779b.size();
        if (size >= 3) {
            float f = 0.0f;
            if (size > 3) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (C7156d i : this.f13779b) {
                    float i2 = i.mo32892i();
                    f2 += i2;
                    f3 += i2 * i2;
                }
                float f4 = (float) size;
                float f5 = f2 / f4;
                float sqrt = (float) Math.sqrt((double) ((f3 / f4) - (f5 * f5)));
                Collections.sort(this.f13779b, new C7160c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i3 = 0;
                while (i3 < this.f13779b.size() && this.f13779b.size() > 3) {
                    if (Math.abs(this.f13779b.get(i3).mo32892i() - f5) > max) {
                        this.f13779b.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            if (this.f13779b.size() > 3) {
                for (C7156d i4 : this.f13779b) {
                    f += i4.mo32892i();
                }
                Collections.sort(this.f13779b, new C7159b(f / ((float) this.f13779b.size())));
                List<C7156d> list = this.f13779b;
                list.subList(3, list.size()).clear();
            }
            return new C7156d[]{this.f13779b.get(0), this.f13779b.get(1), this.f13779b.get(2)};
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
