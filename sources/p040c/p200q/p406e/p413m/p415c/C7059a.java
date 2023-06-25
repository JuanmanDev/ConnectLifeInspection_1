package p040c.p200q.p406e.p413m.p415c;

import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7033b;
import p040c.p200q.p406e.p410l.C7037f;
import p040c.p200q.p406e.p410l.C7039h;
import p040c.p200q.p406e.p410l.p411l.C7043a;
import p040c.p200q.p406e.p410l.p411l.C7044b;

/* renamed from: c.q.e.m.c.a */
/* compiled from: Detector */
public final class C7059a {

    /* renamed from: a */
    public final C7033b f13547a;

    /* renamed from: b */
    public final C7044b f13548b;

    /* renamed from: c.q.e.m.c.a$b */
    /* compiled from: Detector */
    public static final class C7061b {

        /* renamed from: a */
        public final C7023i f13549a;

        /* renamed from: b */
        public final C7023i f13550b;

        /* renamed from: c */
        public final int f13551c;

        /* renamed from: a */
        public C7023i mo32631a() {
            return this.f13549a;
        }

        /* renamed from: b */
        public C7023i mo32632b() {
            return this.f13550b;
        }

        /* renamed from: c */
        public int mo32633c() {
            return this.f13551c;
        }

        public String toString() {
            return this.f13549a + "/" + this.f13550b + '/' + this.f13551c;
        }

        public C7061b(C7023i iVar, C7023i iVar2, int i) {
            this.f13549a = iVar;
            this.f13550b = iVar2;
            this.f13551c = i;
        }
    }

    /* renamed from: c.q.e.m.c.a$c */
    /* compiled from: Detector */
    public static final class C7062c implements Serializable, Comparator<C7061b> {
        public C7062c() {
        }

        /* renamed from: a */
        public int compare(C7061b bVar, C7061b bVar2) {
            return bVar.mo32633c() - bVar2.mo32633c();
        }
    }

    public C7059a(C7033b bVar) {
        this.f13547a = bVar;
        this.f13548b = new C7044b(bVar);
    }

    /* renamed from: d */
    public static int m20954d(C7023i iVar, C7023i iVar2) {
        return C7043a.m20885c(C7023i.m20774b(iVar, iVar2));
    }

    /* renamed from: e */
    public static void m20955e(Map<C7023i, Integer> map, C7023i iVar) {
        Integer num = map.get(iVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(iVar, Integer.valueOf(i));
    }

    /* renamed from: g */
    public static C7033b m20956g(C7033b bVar, C7023i iVar, C7023i iVar2, C7023i iVar3, C7023i iVar4, int i, int i2) {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C7039h.m20868b().mo32566c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, iVar.mo32486c(), iVar.mo32487d(), iVar4.mo32486c(), iVar4.mo32487d(), iVar3.mo32486c(), iVar3.mo32487d(), iVar2.mo32486c(), iVar2.mo32487d());
    }

    /* renamed from: a */
    public final C7023i mo32626a(C7023i iVar, C7023i iVar2, C7023i iVar3, C7023i iVar4, int i) {
        float f = (float) i;
        float d = ((float) m20954d(iVar, iVar2)) / f;
        float d2 = (float) m20954d(iVar3, iVar4);
        C7023i iVar5 = new C7023i(iVar4.mo32486c() + (((iVar4.mo32486c() - iVar3.mo32486c()) / d2) * d), iVar4.mo32487d() + (d * ((iVar4.mo32487d() - iVar3.mo32487d()) / d2)));
        float d3 = ((float) m20954d(iVar, iVar3)) / f;
        float d4 = (float) m20954d(iVar2, iVar4);
        C7023i iVar6 = new C7023i(iVar4.mo32486c() + (((iVar4.mo32486c() - iVar2.mo32486c()) / d4) * d3), iVar4.mo32487d() + (d3 * ((iVar4.mo32487d() - iVar2.mo32487d()) / d4)));
        if (mo32629f(iVar5)) {
            return (mo32629f(iVar6) && Math.abs(mo32630h(iVar3, iVar5).mo32633c() - mo32630h(iVar2, iVar5).mo32633c()) > Math.abs(mo32630h(iVar3, iVar6).mo32633c() - mo32630h(iVar2, iVar6).mo32633c())) ? iVar6 : iVar5;
        }
        if (mo32629f(iVar6)) {
            return iVar6;
        }
        return null;
    }

    /* renamed from: b */
    public final C7023i mo32627b(C7023i iVar, C7023i iVar2, C7023i iVar3, C7023i iVar4, int i, int i2) {
        float d = ((float) m20954d(iVar, iVar2)) / ((float) i);
        float d2 = (float) m20954d(iVar3, iVar4);
        C7023i iVar5 = new C7023i(iVar4.mo32486c() + (((iVar4.mo32486c() - iVar3.mo32486c()) / d2) * d), iVar4.mo32487d() + (d * ((iVar4.mo32487d() - iVar3.mo32487d()) / d2)));
        float d3 = ((float) m20954d(iVar, iVar3)) / ((float) i2);
        float d4 = (float) m20954d(iVar2, iVar4);
        C7023i iVar6 = new C7023i(iVar4.mo32486c() + (((iVar4.mo32486c() - iVar2.mo32486c()) / d4) * d3), iVar4.mo32487d() + (d3 * ((iVar4.mo32487d() - iVar2.mo32487d()) / d4)));
        if (mo32629f(iVar5)) {
            return (mo32629f(iVar6) && Math.abs(i - mo32630h(iVar3, iVar5).mo32633c()) + Math.abs(i2 - mo32630h(iVar2, iVar5).mo32633c()) > Math.abs(i - mo32630h(iVar3, iVar6).mo32633c()) + Math.abs(i2 - mo32630h(iVar2, iVar6).mo32633c())) ? iVar6 : iVar5;
        }
        if (mo32629f(iVar6)) {
            return iVar6;
        }
        return null;
    }

    /* renamed from: c */
    public C7037f mo32628c() {
        C7023i iVar;
        C7023i iVar2;
        C7033b bVar;
        C7023i[] c = this.f13548b.mo32576c();
        C7023i iVar3 = c[0];
        C7023i iVar4 = c[1];
        C7023i iVar5 = c[2];
        C7023i iVar6 = c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(mo32630h(iVar3, iVar4));
        arrayList.add(mo32630h(iVar3, iVar5));
        arrayList.add(mo32630h(iVar4, iVar6));
        arrayList.add(mo32630h(iVar5, iVar6));
        C7023i iVar7 = null;
        Collections.sort(arrayList, new C7062c());
        C7061b bVar2 = (C7061b) arrayList.get(0);
        C7061b bVar3 = (C7061b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m20955e(hashMap, bVar2.mo32631a());
        m20955e(hashMap, bVar2.mo32632b());
        m20955e(hashMap, bVar3.mo32631a());
        m20955e(hashMap, bVar3.mo32632b());
        C7023i iVar8 = null;
        C7023i iVar9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C7023i iVar10 = (C7023i) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                iVar8 = iVar10;
            } else if (iVar7 == null) {
                iVar7 = iVar10;
            } else {
                iVar9 = iVar10;
            }
        }
        if (iVar7 == null || iVar8 == null || iVar9 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        C7023i[] iVarArr = {iVar7, iVar8, iVar9};
        C7023i.m20775e(iVarArr);
        C7023i iVar11 = iVarArr[0];
        C7023i iVar12 = iVarArr[1];
        C7023i iVar13 = iVarArr[2];
        if (!hashMap.containsKey(iVar3)) {
            iVar = iVar3;
        } else if (!hashMap.containsKey(iVar4)) {
            iVar = iVar4;
        } else {
            iVar = !hashMap.containsKey(iVar5) ? iVar5 : iVar6;
        }
        int c2 = mo32630h(iVar13, iVar).mo32633c();
        int c3 = mo32630h(iVar11, iVar).mo32633c();
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i = c2 + 2;
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i2 = c3 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            iVar2 = iVar13;
            C7023i b = mo32627b(iVar12, iVar11, iVar13, iVar, i, i2);
            if (b != null) {
                iVar = b;
            }
            int c4 = mo32630h(iVar2, iVar).mo32633c();
            int c5 = mo32630h(iVar11, iVar).mo32633c();
            if ((c4 & 1) == 1) {
                c4++;
            }
            int i3 = c4;
            if ((c5 & 1) == 1) {
                c5++;
            }
            bVar = m20956g(this.f13547a, iVar2, iVar12, iVar11, iVar, i3, c5);
        } else {
            C7023i a = mo32626a(iVar12, iVar11, iVar13, iVar, Math.min(i2, i));
            if (a != null) {
                iVar = a;
            }
            int max = Math.max(mo32630h(iVar13, iVar).mo32633c(), mo32630h(iVar11, iVar).mo32633c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            bVar = m20956g(this.f13547a, iVar13, iVar12, iVar11, iVar, i4, i4);
            iVar2 = iVar13;
        }
        return new C7037f(bVar, new C7023i[]{iVar2, iVar12, iVar11, iVar});
    }

    /* renamed from: f */
    public final boolean mo32629f(C7023i iVar) {
        return iVar.mo32486c() >= 0.0f && iVar.mo32486c() < ((float) this.f13547a.mo32542k()) && iVar.mo32487d() > 0.0f && iVar.mo32487d() < ((float) this.f13547a.mo32538h());
    }

    /* renamed from: h */
    public final C7061b mo32630h(C7023i iVar, C7023i iVar2) {
        int c = (int) iVar.mo32486c();
        int d = (int) iVar.mo32487d();
        int c2 = (int) iVar2.mo32486c();
        int d2 = (int) iVar2.mo32487d();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(d2 - d) > Math.abs(c2 - c);
        if (z) {
            int i3 = d;
            d = c;
            c = i3;
            int i4 = d2;
            d2 = c2;
            c2 = i4;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i5 = (-abs) / 2;
        int i6 = d < d2 ? 1 : -1;
        if (c >= c2) {
            i2 = -1;
        }
        boolean d3 = this.f13547a.mo32534d(z ? d : c, z ? c : d);
        while (c != c2) {
            boolean d4 = this.f13547a.mo32534d(z ? d : c, z ? c : d);
            if (d4 != d3) {
                i++;
                d3 = d4;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (d == d2) {
                    break;
                }
                d += i6;
                i5 -= abs;
            }
            c += i2;
        }
        return new C7061b(iVar, iVar2, i);
    }
}
