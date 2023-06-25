package p040c.p200q.p406e.p418o.p419r;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.C7024j;
import p040c.p200q.p406e.p410l.C7032a;
import p040c.p200q.p406e.p410l.p411l.C7043a;
import p040c.p200q.p406e.p418o.C7077k;

/* renamed from: c.q.e.o.r.e */
/* compiled from: RSS14Reader */
public final class C7088e extends C7084a {

    /* renamed from: i */
    public static final int[] f13620i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    public static final int[] f13621j = {4, 20, 48, 81};

    /* renamed from: k */
    public static final int[] f13622k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    public static final int[] f13623l = {0, 336, 1036, 1516};

    /* renamed from: m */
    public static final int[] f13624m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    public static final int[] f13625n = {2, 4, 6, 8};

    /* renamed from: o */
    public static final int[][] f13626o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    public final List<C7087d> f13627g = new ArrayList();

    /* renamed from: h */
    public final List<C7087d> f13628h = new ArrayList();

    /* renamed from: r */
    public static void m21081r(Collection<C7087d> collection, C7087d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<C7087d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7087d next = it.next();
                if (next.mo32671b() == dVar.mo32671b()) {
                    next.mo32682e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* renamed from: t */
    public static boolean m21082t(C7087d dVar, C7087d dVar2) {
        int a = (dVar.mo32670a() + (dVar2.mo32670a() * 16)) % 79;
        int c = (dVar.mo32681d().mo32677c() * 9) + dVar2.mo32681d().mo32677c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: u */
    public static C7022h m21083u(C7087d dVar, C7087d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo32671b()) * 4537077) + ((long) dVar2.mo32671b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C7023i[] a = dVar.mo32681d().mo32675a();
        C7023i[] a2 = dVar2.mo32681d().mo32675a();
        return new C7022h(String.valueOf(sb.toString()), (byte[]) null, new C7023i[]{a[0], a[1], a2[0], a2[1]}, BarcodeFormat.RSS_14);
    }

    /* renamed from: a */
    public void mo32471a() {
        this.f13627g.clear();
        this.f13628h.clear();
    }

    /* renamed from: c */
    public C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map) {
        m21081r(this.f13627g, mo32685w(aVar, false, i, map));
        aVar.mo32526k();
        m21081r(this.f13628h, mo32685w(aVar, true, i, map));
        aVar.mo32526k();
        for (C7087d next : this.f13627g) {
            if (next.mo32680c() > 1) {
                for (C7087d next2 : this.f13628h) {
                    if (next2.mo32680c() > 1 && m21082t(next, next2)) {
                        return m21083u(next, next2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r5 = false;
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32683s(boolean r10, int r11) {
        /*
            r9 = this;
            int[] r0 = r9.mo32668m()
            int r0 = p040c.p200q.p406e.p410l.p411l.C7043a.m20886d(r0)
            int[] r1 = r9.mo32666k()
            int r1 = p040c.p200q.p406e.p410l.p411l.C7043a.m20886d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0029
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = r3
            r7 = r4
            goto L_0x0023
        L_0x001c:
            if (r0 >= r2) goto L_0x0021
            r7 = r3
            r6 = r4
            goto L_0x0023
        L_0x0021:
            r6 = r3
            r7 = r6
        L_0x0023:
            if (r1 <= r5) goto L_0x0026
            goto L_0x003c
        L_0x0026:
            if (r1 >= r2) goto L_0x0044
            goto L_0x0041
        L_0x0029:
            r5 = 11
            if (r0 <= r5) goto L_0x0030
            r6 = r3
            r7 = r4
            goto L_0x0038
        L_0x0030:
            r5 = 5
            if (r0 >= r5) goto L_0x0036
            r7 = r3
            r6 = r4
            goto L_0x0038
        L_0x0036:
            r6 = r3
            r7 = r6
        L_0x0038:
            r5 = 10
            if (r1 <= r5) goto L_0x003f
        L_0x003c:
            r2 = r3
            r5 = r4
            goto L_0x0046
        L_0x003f:
            if (r1 >= r2) goto L_0x0044
        L_0x0041:
            r5 = r3
            r2 = r4
            goto L_0x0046
        L_0x0044:
            r2 = r3
            r5 = r2
        L_0x0046:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004f
            r10 = r4
            goto L_0x0050
        L_0x004f:
            r10 = r3
        L_0x0050:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0055
            r3 = r4
        L_0x0055:
            if (r8 != r4) goto L_0x006c
            if (r10 == 0) goto L_0x0062
            if (r3 != 0) goto L_0x005d
            r7 = r4
            goto L_0x0065
        L_0x005d:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0062:
            if (r3 == 0) goto L_0x0067
            r5 = r4
        L_0x0065:
            r4 = r6
            goto L_0x0097
        L_0x0067:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x006c:
            r11 = -1
            if (r8 != r11) goto L_0x0082
            if (r10 == 0) goto L_0x0079
            if (r3 != 0) goto L_0x0074
            goto L_0x0097
        L_0x0074:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0079:
            if (r3 == 0) goto L_0x007d
            r2 = r4
            goto L_0x0065
        L_0x007d:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0082:
            if (r8 != 0) goto L_0x00e1
            if (r10 == 0) goto L_0x0094
            if (r3 == 0) goto L_0x008f
            if (r0 >= r1) goto L_0x008c
            r5 = r4
            goto L_0x0097
        L_0x008c:
            r2 = r4
            r7 = r2
            goto L_0x0065
        L_0x008f:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0094:
            if (r3 != 0) goto L_0x00dc
            goto L_0x0065
        L_0x0097:
            if (r4 == 0) goto L_0x00ac
            if (r7 != 0) goto L_0x00a7
            int[] r10 = r9.mo32668m()
            float[] r11 = r9.mo32669n()
            p040c.p200q.p406e.p418o.p419r.C7084a.m21064o(r10, r11)
            goto L_0x00ac
        L_0x00a7:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x00ac:
            if (r7 == 0) goto L_0x00b9
            int[] r10 = r9.mo32668m()
            float[] r11 = r9.mo32669n()
            p040c.p200q.p406e.p418o.p419r.C7084a.m21063h(r10, r11)
        L_0x00b9:
            if (r2 == 0) goto L_0x00ce
            if (r5 != 0) goto L_0x00c9
            int[] r10 = r9.mo32666k()
            float[] r11 = r9.mo32669n()
            p040c.p200q.p406e.p418o.p419r.C7084a.m21064o(r10, r11)
            goto L_0x00ce
        L_0x00c9:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x00ce:
            if (r5 == 0) goto L_0x00db
            int[] r10 = r9.mo32666k()
            float[] r11 = r9.mo32667l()
            p040c.p200q.p406e.p418o.p419r.C7084a.m21063h(r10, r11)
        L_0x00db:
            return
        L_0x00dc:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x00e1:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p418o.p419r.C7088e.mo32683s(boolean, int):void");
    }

    /* renamed from: v */
    public final C7085b mo32684v(C7032a aVar, C7086c cVar, boolean z) {
        C7032a aVar2 = aVar;
        boolean z2 = z;
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
            C7077k.m21024f(aVar2, cVar.mo32676b()[1] + 1, i);
            int i2 = 0;
            for (int length = i.length - 1; i2 < length; length--) {
                int i3 = i[i2];
                i[i2] = i[length];
                i[length] = i3;
                i2++;
            }
        }
        int i4 = z2 ? 16 : 15;
        float d = ((float) C7043a.m20886d(i)) / ((float) i4);
        int[] m = mo32668m();
        int[] k = mo32666k();
        float[] n = mo32669n();
        float[] l = mo32667l();
        for (int i5 = 0; i5 < i.length; i5++) {
            float f = ((float) i[i5]) / d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                m[i7] = i6;
                n[i7] = f - ((float) i6);
            } else {
                k[i7] = i6;
                l[i7] = f - ((float) i6);
            }
        }
        mo32683s(z2, i4);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = m.length - 1; length2 >= 0; length2--) {
            i8 = (i8 * 9) + m[length2];
            i9 += m[length2];
        }
        int i10 = 0;
        int i11 = 0;
        for (int length3 = k.length - 1; length3 >= 0; length3--) {
            i10 = (i10 * 9) + k[length3];
            i11 += k[length3];
        }
        int i12 = i8 + (i10 * 3);
        if (z2) {
            if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i13 = (12 - i9) / 2;
            int i14 = f13624m[i13];
            return new C7085b((C7089f.m21092b(m, i14, false) * f13620i[i13]) + C7089f.m21092b(k, 9 - i14, true) + f13622k[i13], i12);
        } else if ((i11 & 1) != 0 || i11 > 10 || i11 < 4) {
            throw NotFoundException.getNotFoundInstance();
        } else {
            int i15 = (10 - i11) / 2;
            int i16 = f13625n[i15];
            return new C7085b((C7089f.m21092b(k, 9 - i16, false) * f13621j[i15]) + C7089f.m21092b(m, i16, true) + f13623l[i15], i12);
        }
    }

    /* renamed from: w */
    public final C7087d mo32685w(C7032a aVar, boolean z, int i, Map<DecodeHintType, ?> map) {
        C7024j jVar;
        try {
            int[] x = mo32686x(aVar, 0, z);
            C7086c y = mo32687y(aVar, i, z, x);
            if (map == null) {
                jVar = null;
            } else {
                jVar = (C7024j) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            }
            if (jVar != null) {
                float f = ((float) (x[0] + x[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo32523h() - 1)) - f;
                }
                jVar.mo32491a(new C7023i(f, (float) i));
            }
            C7085b v = mo32684v(aVar, y, true);
            C7085b v2 = mo32684v(aVar, y, false);
            return new C7087d((v.mo32671b() * 1597) + v2.mo32671b(), v.mo32670a() + (v2.mo32670a() * 4), y);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: x */
    public final int[] mo32686x(C7032a aVar, int i, boolean z) {
        int[] j = mo32665j();
        j[0] = 0;
        j[1] = 0;
        j[2] = 0;
        j[3] = 0;
        int h = aVar.mo32523h();
        boolean z2 = false;
        while (i < h) {
            z2 = !aVar.mo32517c(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < h) {
            if (aVar.mo32517c(i) ^ z2) {
                j[i3] = j[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else if (C7084a.m21065p(j)) {
                    return new int[]{i2, i};
                } else {
                    i2 += j[0] + j[1];
                    j[0] = j[2];
                    j[1] = j[3];
                    j[2] = 0;
                    j[3] = 0;
                    i3--;
                }
                j[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: y */
    public final C7086c mo32687y(C7032a aVar, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean c = aVar.mo32517c(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (aVar.mo32517c(i4) ^ c)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] j = mo32665j();
        System.arraycopy(j, 0, j, 1, j.length - 1);
        j[0] = iArr[0] - i5;
        int q = C7084a.m21066q(j, f13626o);
        int i6 = iArr[1];
        if (z) {
            i2 = (aVar.mo32523h() - 1) - i6;
            i3 = (aVar.mo32523h() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C7086c(q, new int[]{i5, iArr[1]}, i3, i2, i);
    }
}
