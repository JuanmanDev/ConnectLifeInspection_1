package p040c.p200q.p406e.p418o.p419r.p420g;

import androidx.core.location.GpsStatusWrapper;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7032a;
import p040c.p200q.p406e.p410l.p411l.C7043a;
import p040c.p200q.p406e.p418o.C7077k;
import p040c.p200q.p406e.p418o.p419r.C7084a;
import p040c.p200q.p406e.p418o.p419r.C7085b;
import p040c.p200q.p406e.p418o.p419r.C7086c;
import p040c.p200q.p406e.p418o.p419r.C7089f;
import p040c.p200q.p406e.p418o.p419r.p420g.p421e.C7103j;

/* renamed from: c.q.e.o.r.g.d */
/* compiled from: RSSExpandedReader */
public final class C7093d extends C7084a {

    /* renamed from: k */
    public static final int[] f13635k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    public static final int[] f13636l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    public static final int[] f13637m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    public static final int[][] f13638n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    public static final int[][] f13639o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{GpsStatusWrapper.QZSS_SVID_MIN, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    public static final int[][] f13640p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    public final List<C7091b> f13641g = new ArrayList(11);

    /* renamed from: h */
    public final List<C7092c> f13642h = new ArrayList();

    /* renamed from: i */
    public final int[] f13643i = new int[2];

    /* renamed from: j */
    public boolean f13644j;

    /* renamed from: A */
    public static boolean m21103A(C7086c cVar, boolean z, boolean z2) {
        return cVar.mo32677c() != 0 || !z || !z2;
    }

    /* renamed from: B */
    public static boolean m21104B(Iterable<C7091b> iterable, Iterable<C7092c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C7092c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C7092c next = it.next();
                Iterator<C7091b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C7091b next2 = it2.next();
                    Iterator<C7091b> it3 = next.mo32695a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: C */
    public static boolean m21105C(List<C7091b> list) {
        boolean z;
        for (int[] iArr : f13640p) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo32688b().mo32677c() != iArr[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public static void m21106E(List<C7091b> list, List<C7092c> list2) {
        boolean z;
        Iterator<C7092c> it = list2.iterator();
        while (it.hasNext()) {
            C7092c next = it.next();
            if (next.mo32695a().size() != list.size()) {
                Iterator<C7091b> it2 = next.mo32695a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    C7091b next2 = it2.next();
                    Iterator<C7091b> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: G */
    public static void m21107G(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: v */
    public static C7022h m21108v(List<C7091b> list) {
        String d = C7103j.m21140a(C7090a.m21093a(list)).mo32713d();
        C7023i[] a = list.get(0).mo32688b().mo32675a();
        C7023i[] a2 = list.get(list.size() - 1).mo32688b().mo32675a();
        return new C7022h(d, (byte[]) null, new C7023i[]{a[0], a[1], a2[0], a2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    /* renamed from: z */
    public static int m21109z(C7032a aVar, int i) {
        if (aVar.mo32517c(i)) {
            return aVar.mo32520e(aVar.mo32522f(i));
        }
        return aVar.mo32522f(aVar.mo32520e(i));
    }

    /* renamed from: D */
    public final C7086c mo32701D(C7032a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f13643i[0] - 1;
            while (i5 >= 0 && !aVar.mo32517c(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f13643i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f13643i;
            int i7 = iArr2[0];
            int f = aVar.mo32522f(iArr2[1] + 1);
            i2 = f;
            i3 = i7;
            i4 = f - this.f13643i[1];
        }
        int[] j = mo32665j();
        System.arraycopy(j, 0, j, 1, j.length - 1);
        j[0] = i4;
        try {
            return new C7086c(C7084a.m21066q(j, f13638n), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: F */
    public C7091b mo32702F(C7032a aVar, List<C7091b> list, int i) {
        C7086c D;
        C7085b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.f13644j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            mo32710y(aVar, list, i2);
            D = mo32701D(aVar, i, z);
            if (D == null) {
                i2 = m21109z(aVar, this.f13643i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C7085b w = mo32708w(aVar, D, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo32692f()) {
            try {
                bVar = mo32708w(aVar, D, z, false);
            } catch (NotFoundException unused) {
                bVar = null;
            }
            return new C7091b(w, bVar, D, true);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: H */
    public final void mo32703H(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f13642h.size()) {
                break;
            }
            C7092c cVar = this.f13642h.get(i2);
            if (cVar.mo32696b() > i) {
                z2 = cVar.mo32697c(this.f13641g);
                break;
            } else {
                z3 = cVar.mo32697c(this.f13641g);
                i2++;
            }
        }
        if (!z2 && !z3 && !m21104B(this.f13641g, this.f13642h)) {
            this.f13642h.add(i2, new C7092c(this.f13641g, i, z));
            m21106E(this.f13641g, this.f13642h);
        }
    }

    /* renamed from: a */
    public void mo32471a() {
        this.f13641g.clear();
        this.f13642h.clear();
    }

    /* renamed from: c */
    public C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map) {
        this.f13641g.clear();
        this.f13644j = false;
        try {
            return m21108v(mo32709x(i, aVar));
        } catch (NotFoundException unused) {
            this.f13641g.clear();
            this.f13644j = true;
            return m21108v(mo32709x(i, aVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32704r(int r11) {
        /*
            r10 = this;
            int[] r0 = r10.mo32668m()
            int r0 = p040c.p200q.p406e.p410l.p411l.C7043a.m20886d(r0)
            int[] r1 = r10.mo32666k()
            int r1 = p040c.p200q.p406e.p410l.p411l.C7043a.m20886d(r1)
            r2 = 4
            r3 = 13
            r4 = 0
            r5 = 1
            if (r0 <= r3) goto L_0x001a
            r6 = r4
            r7 = r5
            goto L_0x0021
        L_0x001a:
            if (r0 >= r2) goto L_0x001f
            r7 = r4
            r6 = r5
            goto L_0x0021
        L_0x001f:
            r6 = r4
            r7 = r6
        L_0x0021:
            if (r1 <= r3) goto L_0x0026
            r2 = r4
            r3 = r5
            goto L_0x002d
        L_0x0026:
            if (r1 >= r2) goto L_0x002b
            r3 = r4
            r2 = r5
            goto L_0x002d
        L_0x002b:
            r2 = r4
            r3 = r2
        L_0x002d:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r5) goto L_0x0036
            r11 = r5
            goto L_0x0037
        L_0x0036:
            r11 = r4
        L_0x0037:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x003c
            r4 = r5
        L_0x003c:
            if (r8 != r5) goto L_0x0053
            if (r11 == 0) goto L_0x0049
            if (r4 != 0) goto L_0x0044
            r7 = r5
            goto L_0x004c
        L_0x0044:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0049:
            if (r4 == 0) goto L_0x004e
            r3 = r5
        L_0x004c:
            r5 = r6
            goto L_0x007e
        L_0x004e:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0053:
            r9 = -1
            if (r8 != r9) goto L_0x0069
            if (r11 == 0) goto L_0x0060
            if (r4 != 0) goto L_0x005b
            goto L_0x007e
        L_0x005b:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0060:
            if (r4 == 0) goto L_0x0064
            r2 = r5
            goto L_0x004c
        L_0x0064:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0069:
            if (r8 != 0) goto L_0x00c8
            if (r11 == 0) goto L_0x007b
            if (r4 == 0) goto L_0x0076
            if (r0 >= r1) goto L_0x0073
            r3 = r5
            goto L_0x007e
        L_0x0073:
            r2 = r5
            r7 = r2
            goto L_0x004c
        L_0x0076:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x007b:
            if (r4 != 0) goto L_0x00c3
            goto L_0x004c
        L_0x007e:
            if (r5 == 0) goto L_0x0093
            if (r7 != 0) goto L_0x008e
            int[] r11 = r10.mo32668m()
            float[] r0 = r10.mo32669n()
            p040c.p200q.p406e.p418o.p419r.C7084a.m21064o(r11, r0)
            goto L_0x0093
        L_0x008e:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0093:
            if (r7 == 0) goto L_0x00a0
            int[] r11 = r10.mo32668m()
            float[] r0 = r10.mo32669n()
            p040c.p200q.p406e.p418o.p419r.C7084a.m21063h(r11, r0)
        L_0x00a0:
            if (r2 == 0) goto L_0x00b5
            if (r3 != 0) goto L_0x00b0
            int[] r11 = r10.mo32666k()
            float[] r0 = r10.mo32669n()
            p040c.p200q.p406e.p418o.p419r.C7084a.m21064o(r11, r0)
            goto L_0x00b5
        L_0x00b0:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x00b5:
            if (r3 == 0) goto L_0x00c2
            int[] r11 = r10.mo32666k()
            float[] r0 = r10.mo32667l()
            p040c.p200q.p406e.p418o.p419r.C7084a.m21063h(r11, r0)
        L_0x00c2:
            return
        L_0x00c3:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x00c8:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p418o.p419r.p420g.C7093d.mo32704r(int):void");
    }

    /* renamed from: s */
    public final boolean mo32705s() {
        C7091b bVar = this.f13641g.get(0);
        C7085b c = bVar.mo32689c();
        C7085b d = bVar.mo32690d();
        if (d == null) {
            return false;
        }
        int a = d.mo32670a();
        int i = 2;
        for (int i2 = 1; i2 < this.f13641g.size(); i2++) {
            C7091b bVar2 = this.f13641g.get(i2);
            a += bVar2.mo32689c().mo32670a();
            i++;
            C7085b d2 = bVar2.mo32690d();
            if (d2 != null) {
                a += d2.mo32670a();
                i++;
            }
        }
        if (((i - 4) * 211) + (a % 211) == c.mo32671b()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final List<C7091b> mo32706t(List<C7092c> list, int i) {
        while (i < this.f13642h.size()) {
            C7092c cVar = this.f13642h.get(i);
            this.f13641g.clear();
            for (C7092c a : list) {
                this.f13641g.addAll(a.mo32695a());
            }
            this.f13641g.addAll(cVar.mo32695a());
            if (!m21105C(this.f13641g)) {
                i++;
            } else if (mo32705s()) {
                return this.f13641g;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return mo32706t(arrayList, i + 1);
                } catch (NotFoundException unused) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: u */
    public final List<C7091b> mo32707u(boolean z) {
        List<C7091b> list = null;
        if (this.f13642h.size() > 25) {
            this.f13642h.clear();
            return null;
        }
        this.f13641g.clear();
        if (z) {
            Collections.reverse(this.f13642h);
        }
        try {
            list = mo32706t(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f13642h);
        }
        return list;
    }

    /* renamed from: w */
    public C7085b mo32708w(C7032a aVar, C7086c cVar, boolean z, boolean z2) {
        C7032a aVar2 = aVar;
        int[] i = mo32664i();
        i[0] = 0;
        i[1] = 0;
        i[2] = 0;
        i[3] = 0;
        i[4] = 0;
        i[5] = 0;
        i[6] = 0;
        i[7] = 0;
        if (z2) {
            C7077k.m21025g(aVar2, cVar.mo32676b()[0], i);
        } else {
            C7077k.m21024f(aVar2, cVar.mo32676b()[1], i);
            int i2 = 0;
            for (int length = i.length - 1; i2 < length; length--) {
                int i3 = i[i2];
                i[i2] = i[length];
                i[length] = i3;
                i2++;
            }
        }
        float d = ((float) C7043a.m20886d(i)) / 17.0f;
        float f = ((float) (cVar.mo32676b()[1] - cVar.mo32676b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] m = mo32668m();
            int[] k = mo32666k();
            float[] n = mo32669n();
            float[] l = mo32667l();
            for (int i4 = 0; i4 < i.length; i4++) {
                float f2 = (((float) i[i4]) * 1.0f) / d;
                int i5 = (int) (0.5f + f2);
                if (i5 <= 0) {
                    if (f2 >= 0.3f) {
                        i5 = 1;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else if (i5 > 8) {
                    if (f2 <= 8.7f) {
                        i5 = 8;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                int i6 = i4 / 2;
                if ((i4 & 1) == 0) {
                    m[i6] = i5;
                    n[i6] = f2 - ((float) i5);
                } else {
                    k[i6] = i5;
                    l[i6] = f2 - ((float) i5);
                }
            }
            mo32704r(17);
            int c = (((cVar.mo32677c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i7 = 0;
            int i8 = 0;
            for (int length2 = m.length - 1; length2 >= 0; length2--) {
                if (m21103A(cVar, z, z2)) {
                    i7 += m[length2] * f13639o[c][length2 * 2];
                }
                i8 += m[length2];
            }
            int i9 = 0;
            for (int length3 = k.length - 1; length3 >= 0; length3--) {
                if (m21103A(cVar, z, z2)) {
                    i9 += k[length3] * f13639o[c][(length3 * 2) + 1];
                }
            }
            int i10 = i7 + i9;
            if ((i8 & 1) != 0 || i8 > 13 || i8 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i11 = (13 - i8) / 2;
            int i12 = f13635k[i11];
            return new C7085b((C7089f.m21092b(m, i12, true) * f13636l[i11]) + C7089f.m21092b(k, 9 - i12, false) + f13637m[i11], i10);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: x */
    public List<C7091b> mo32709x(int i, C7032a aVar) {
        while (true) {
            try {
                this.f13641g.add(mo32702F(aVar, this.f13641g, i));
            } catch (NotFoundException e) {
                if (this.f13641g.isEmpty()) {
                    throw e;
                } else if (mo32705s()) {
                    return this.f13641g;
                } else {
                    boolean z = !this.f13642h.isEmpty();
                    mo32703H(i, false);
                    if (z) {
                        List<C7091b> u = mo32707u(false);
                        if (u != null) {
                            return u;
                        }
                        List<C7091b> u2 = mo32707u(true);
                        if (u2 != null) {
                            return u2;
                        }
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo32710y(C7032a aVar, List<C7091b> list, int i) {
        int[] j = mo32665j();
        j[0] = 0;
        j[1] = 0;
        j[2] = 0;
        j[3] = 0;
        int h = aVar.mo32523h();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = list.get(list.size() - 1).mo32688b().mo32676b()[1];
            }
        }
        boolean z = list.size() % 2 != 0;
        if (this.f13644j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < h) {
            z2 = !aVar.mo32517c(i);
            if (!z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        boolean z3 = z2;
        int i3 = i;
        while (i < h) {
            if (aVar.mo32517c(i) ^ z3) {
                j[i2] = j[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m21107G(j);
                    }
                    if (C7084a.m21065p(j)) {
                        int[] iArr = this.f13643i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m21107G(j);
                    }
                    i3 += j[0] + j[1];
                    j[0] = j[2];
                    j[1] = j[3];
                    j[2] = 0;
                    j[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                j[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
