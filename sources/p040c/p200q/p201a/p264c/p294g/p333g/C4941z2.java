package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.z2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4941z2 {

    /* renamed from: a */
    public static final Class f9757a;

    /* renamed from: b */
    public static final C4654o3 f9758b = m13633C(false);

    /* renamed from: c */
    public static final C4654o3 f9759c = m13633C(true);

    /* renamed from: d */
    public static final C4654o3 f9760d = new C4708q3();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f9757a = cls;
    }

    /* renamed from: A */
    public static int m13631A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4783t0.m13103f(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m13632B(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26706k(i, list, z);
        }
    }

    /* renamed from: C */
    public static C4654o3 m13633C(boolean z) {
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
            return (C4654o3) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m13634D(List list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m13635E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C4783t0.m13102e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C4783t0.m13095E((zzacc) list.get(i2));
        }
        return e;
    }

    /* renamed from: F */
    public static int m13636F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13637G(list) + (size * C4783t0.m13102e(i));
    }

    /* renamed from: G */
    public static int m13637G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            i = 0;
            while (i2 < size) {
                i += C4783t0.m13097G(l1Var.mo26222f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4783t0.m13097G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m13638H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4783t0.m13103f(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m13639I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m13640J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4783t0.m13103f(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m13641K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m13642L(int i, List list, C4889x2 x2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C4783t0.m13096F(i, (C4572l2) list.get(i3), x2Var);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m13643M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13644N(list) + (size * C4783t0.m13102e(i));
    }

    /* renamed from: N */
    public static int m13644N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            i = 0;
            while (i2 < size) {
                i += C4783t0.m13097G(l1Var.mo26222f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4783t0.m13097G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m13645O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m13646P(list) + (list.size() * C4783t0.m13102e(i));
    }

    /* renamed from: P */
    public static int m13646P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4275a2) {
            C4275a2 a2Var = (C4275a2) list;
            i = 0;
            while (i2 < size) {
                i += C4783t0.m13104g(a2Var.mo25767f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4783t0.m13104g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m13647Q(int i, Object obj, C4889x2 x2Var) {
        if (!(obj instanceof C4732r1)) {
            return C4783t0.m13103f(i << 3) + C4783t0.m13099b((C4572l2) obj, x2Var);
        }
        int f = C4783t0.m13103f(i << 3);
        int a = ((C4732r1) obj).mo26591a();
        return f + C4783t0.m13103f(a) + a;
    }

    /* renamed from: R */
    public static int m13648R(int i, List list, C4889x2 x2Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C4783t0.m13102e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C4732r1) {
                i2 = C4783t0.m13098H((C4732r1) obj);
            } else {
                i2 = C4783t0.m13099b((C4572l2) obj, x2Var);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: S */
    public static int m13649S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13650T(list) + (size * C4783t0.m13102e(i));
    }

    /* renamed from: T */
    public static int m13650T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            i = 0;
            while (i2 < size) {
                int f = l1Var.mo26222f(i2);
                i += C4783t0.m13103f((f >> 31) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C4783t0.m13103f((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m13651U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13652V(list) + (size * C4783t0.m13102e(i));
    }

    /* renamed from: V */
    public static int m13652V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4275a2) {
            C4275a2 a2Var = (C4275a2) list;
            i = 0;
            while (i2 < size) {
                long f = a2Var.mo25767f(i2);
                i += C4783t0.m13104g((f >> 63) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C4783t0.m13104g((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m13653W(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C4783t0.m13102e(i) * size;
        if (list instanceof C4784t1) {
            C4784t1 t1Var = (C4784t1) list;
            while (i4 < size) {
                Object j = t1Var.mo26632j(i4);
                if (j instanceof zzacc) {
                    i3 = C4783t0.m13095E((zzacc) j);
                } else {
                    i3 = C4783t0.m13101d((String) j);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzacc) {
                    i2 = C4783t0.m13095E((zzacc) obj);
                } else {
                    i2 = C4783t0.m13101d((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: X */
    public static int m13654X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13655Y(list) + (size * C4783t0.m13102e(i));
    }

    /* renamed from: Y */
    public static int m13655Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            i = 0;
            while (i2 < size) {
                i += C4783t0.m13103f(l1Var.mo26222f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4783t0.m13103f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m13656Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13658a0(list) + (size * C4783t0.m13102e(i));
    }

    /* renamed from: a */
    public static C4654o3 m13657a() {
        return f9759c;
    }

    /* renamed from: a0 */
    public static int m13658a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4275a2) {
            C4275a2 a2Var = (C4275a2) list;
            i = 0;
            while (i2 < size) {
                i += C4783t0.m13104g(a2Var.mo25767f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4783t0.m13104g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C4654o3 m13659b() {
        return f9760d;
    }

    /* renamed from: b0 */
    public static C4654o3 m13660b0() {
        return f9758b;
    }

    /* renamed from: c */
    public static Object m13661c(Object obj, int i, List list, C4652o1 o1Var, Object obj2, C4654o3 o3Var) {
        if (o1Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (o1Var.zza()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = m13662d(obj, i, intValue, obj2, o3Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!o1Var.zza()) {
                    obj2 = m13662d(obj, i, intValue2, obj2, o3Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* renamed from: d */
    public static Object m13662d(Object obj, int i, int i2, Object obj2, C4654o3 o3Var) {
        if (obj2 == null) {
            obj2 = o3Var.mo26439c(obj);
        }
        o3Var.mo26448l(obj2, i, (long) i2);
        return obj2;
    }

    /* renamed from: e */
    public static void m13663e(C4939z0 z0Var, Object obj, Object obj2) {
        z0Var.mo25757a(obj2);
        throw null;
    }

    /* renamed from: f */
    public static void m13664f(C4654o3 o3Var, Object obj, Object obj2) {
        o3Var.mo26451o(obj, o3Var.mo26441e(o3Var.mo26440d(obj), o3Var.mo26440d(obj2)));
    }

    /* renamed from: g */
    public static void m13665g(Class cls) {
        Class cls2;
        if (!C4544k1.class.isAssignableFrom(cls) && (cls2 = f9757a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static boolean m13666h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    public static void m13667i(C4437g2 g2Var, Object obj, Object obj2, long j) {
        C4916y3.m13568x(obj, j, C4437g2.m12018c(C4916y3.m13555k(obj, j), C4916y3.m13555k(obj2, j)));
    }

    /* renamed from: j */
    public static void m13668j(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26708n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m13669k(int i, List list, C4809u0 u0Var) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26710p(i, list);
        }
    }

    /* renamed from: l */
    public static void m13670l(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26712r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m13671m(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26715u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m13672n(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26717w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m13673o(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26719y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m13674p(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26685A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m13675q(int i, List list, C4809u0 u0Var, C4889x2 x2Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                u0Var.mo26686B(i, list.get(i2), x2Var);
            }
        }
    }

    /* renamed from: r */
    public static void m13676r(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26688D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m13677s(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26690F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m13678t(int i, List list, C4809u0 u0Var, C4889x2 x2Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                u0Var.mo26691G(i, list.get(i2), x2Var);
            }
        }
    }

    /* renamed from: u */
    public static void m13679u(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26693I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m13680v(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26695K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m13681w(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26697b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m13682x(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26699d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m13683y(int i, List list, C4809u0 u0Var) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26702g(i, list);
        }
    }

    /* renamed from: z */
    public static void m13684z(int i, List list, C4809u0 u0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            u0Var.mo26704i(i, list, z);
        }
    }
}
