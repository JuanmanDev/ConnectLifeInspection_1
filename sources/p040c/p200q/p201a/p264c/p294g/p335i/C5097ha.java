package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.ha */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5097ha {

    /* renamed from: a */
    public static final Class f9929a;

    /* renamed from: b */
    public static final C5326wa f9930b = m14218C(false);

    /* renamed from: c */
    public static final C5326wa f9931c = m14218C(true);

    /* renamed from: d */
    public static final C5326wa f9932d = new C5356ya();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f9929a = cls;
    }

    /* renamed from: A */
    public static int m14216A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4999b8.m13822a(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m14217B(C5220p9 p9Var, Object obj, Object obj2, long j) {
        C5082gb.m14168x(obj, j, C5220p9.m14649b(C5082gb.m14155k(obj, j), C5082gb.m14155k(obj2, j)));
    }

    /* renamed from: C */
    public static C5326wa m14218C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C5326wa) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m14219D(List list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m14220E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * C4999b8.m13821D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += C4999b8.m13826x((zzje) list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    public static int m14221F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m14222G(list) + (size * C4999b8.m13821D(i));
    }

    /* renamed from: G */
    public static int m14222G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5294u8) {
            C5294u8 u8Var = (C5294u8) list;
            i = 0;
            while (i2 < size) {
                i += C4999b8.m13828z(u8Var.mo27777f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4999b8.m13828z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m14223H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4999b8.m13822a(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m14224I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m14225J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4999b8.m13822a(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m14226K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m14227L(int i, List list, C5065fa faVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C4999b8.m13827y(i, (C5295u9) list.get(i3), faVar);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m14228M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m14229N(list) + (size * C4999b8.m13821D(i));
    }

    /* renamed from: N */
    public static int m14229N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5294u8) {
            C5294u8 u8Var = (C5294u8) list;
            i = 0;
            while (i2 < size) {
                i += C4999b8.m13828z(u8Var.mo27777f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4999b8.m13828z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m14230O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m14231P(list) + (list.size() * C4999b8.m13821D(i));
    }

    /* renamed from: P */
    public static int m14231P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5144k9) {
            C5144k9 k9Var = (C5144k9) list;
            i = 0;
            while (i2 < size) {
                i += C4999b8.m13823b(k9Var.mo27365h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4999b8.m13823b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m14232Q(int i, Object obj, C5065fa faVar) {
        if (!(obj instanceof C4984a9)) {
            return C4999b8.m13822a(i << 3) + C4999b8.m13819B((C5295u9) obj, faVar);
        }
        int a = C4999b8.m13822a(i << 3);
        int a2 = ((C4984a9) obj).mo26938a();
        return a + C4999b8.m13822a(a2) + a2;
    }

    /* renamed from: R */
    public static int m14233R(int i, List list, C5065fa faVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = C4999b8.m13821D(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C4984a9) {
                i2 = C4999b8.m13818A((C4984a9) obj);
            } else {
                i2 = C4999b8.m13819B((C5295u9) obj, faVar);
            }
            D += i2;
        }
        return D;
    }

    /* renamed from: S */
    public static int m14234S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m14235T(list) + (size * C4999b8.m13821D(i));
    }

    /* renamed from: T */
    public static int m14235T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5294u8) {
            C5294u8 u8Var = (C5294u8) list;
            i = 0;
            while (i2 < size) {
                int f = u8Var.mo27777f(i2);
                i += C4999b8.m13822a((f >> 31) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C4999b8.m13822a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m14236U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m14237V(list) + (size * C4999b8.m13821D(i));
    }

    /* renamed from: V */
    public static int m14237V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5144k9) {
            C5144k9 k9Var = (C5144k9) list;
            i = 0;
            while (i2 < size) {
                long h = k9Var.mo27365h(i2);
                i += C4999b8.m13823b((h >> 63) ^ (h + h));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C4999b8.m13823b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m14238W(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = C4999b8.m13821D(i) * size;
        if (list instanceof C5016c9) {
            C5016c9 c9Var = (C5016c9) list;
            while (i4 < size) {
                Object j = c9Var.mo27014j(i4);
                if (j instanceof zzje) {
                    i3 = C4999b8.m13826x((zzje) j);
                } else {
                    i3 = C4999b8.m13820C((String) j);
                }
                D += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzje) {
                    i2 = C4999b8.m13826x((zzje) obj);
                } else {
                    i2 = C4999b8.m13820C((String) obj);
                }
                D += i2;
                i4++;
            }
        }
        return D;
    }

    /* renamed from: X */
    public static int m14239X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m14240Y(list) + (size * C4999b8.m13821D(i));
    }

    /* renamed from: Y */
    public static int m14240Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5294u8) {
            C5294u8 u8Var = (C5294u8) list;
            i = 0;
            while (i2 < size) {
                i += C4999b8.m13822a(u8Var.mo27777f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4999b8.m13822a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m14241Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m14243a0(list) + (size * C4999b8.m13821D(i));
    }

    /* renamed from: a */
    public static C5326wa m14242a() {
        return f9931c;
    }

    /* renamed from: a0 */
    public static int m14243a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5144k9) {
            C5144k9 k9Var = (C5144k9) list;
            i = 0;
            while (i2 < size) {
                i += C4999b8.m13823b(k9Var.mo27365h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4999b8.m13823b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C5326wa m14244b() {
        return f9932d;
    }

    /* renamed from: b0 */
    public static C5326wa m14245b0() {
        return f9930b;
    }

    /* renamed from: c */
    public static Object m14246c(Object obj, int i, List list, C5309v8 v8Var, Object obj2, C5326wa waVar) {
        Object obj3 = null;
        if (v8Var == null) {
            return null;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (v8Var.mo26929h(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj3 = m14247d(obj, i, intValue, obj3, waVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj3;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!v8Var.mo26929h(intValue2)) {
                    obj3 = m14247d(obj, i, intValue2, obj3, waVar);
                    it.remove();
                }
            }
        }
        return obj3;
    }

    /* renamed from: d */
    public static Object m14247d(Object obj, int i, int i2, Object obj2, C5326wa waVar) {
        if (obj2 == null) {
            obj2 = waVar.mo27866c(obj);
        }
        waVar.mo27869f(obj2, i, (long) i2);
        return obj2;
    }

    /* renamed from: e */
    public static void m14248e(C5095h8 h8Var, Object obj, Object obj2) {
        h8Var.mo27305a(obj2);
        throw null;
    }

    /* renamed from: f */
    public static void m14249f(C5326wa waVar, Object obj, Object obj2) {
        waVar.mo27871h(obj, waVar.mo27868e(waVar.mo27867d(obj), waVar.mo27867d(obj2)));
    }

    /* renamed from: g */
    public static void m14250g(Class cls) {
        Class cls2;
        if (!C5279t8.class.isAssignableFrom(cls) && (cls2 = f9929a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m14251h(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27115i(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m14252i(int i, List list, C5192nb nbVar) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27109c(i, list);
        }
    }

    /* renamed from: j */
    public static void m14253j(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27098B(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m14254k(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27123q(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m14255l(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27119m(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m14256m(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27127u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m14257n(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27101E(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m14258o(int i, List list, C5192nb nbVar, C5065fa faVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C5015c8) nbVar).mo27118l(i, list.get(i2), faVar);
            }
        }
    }

    /* renamed from: p */
    public static void m14259p(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27121o(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m14260q(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27131y(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m14261r(int i, List list, C5192nb nbVar, C5065fa faVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C5015c8) nbVar).mo27104H(i, list.get(i2), faVar);
            }
        }
    }

    /* renamed from: s */
    public static void m14262s(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27097A(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m14263t(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27108b(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m14264u(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27130x(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m14265v(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27103G(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m14266w(int i, List list, C5192nb nbVar) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27125s(i, list);
        }
    }

    /* renamed from: x */
    public static void m14267x(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27117k(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m14268y(int i, List list, C5192nb nbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            nbVar.mo27132z(i, list, z);
        }
    }

    /* renamed from: z */
    public static boolean m14269z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
