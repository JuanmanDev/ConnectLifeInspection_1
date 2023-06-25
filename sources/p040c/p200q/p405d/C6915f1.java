package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p040c.p200q.p405d.C6988u;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.q.d.f1 */
/* compiled from: SchemaUtil */
public final class C6915f1 {

    /* renamed from: a */
    public static final Class<?> f13227a = m19819B();

    /* renamed from: b */
    public static final C6944j1<?, ?> f13228b = m19820C(false);

    /* renamed from: c */
    public static final C6944j1<?, ?> f13229c = m19820C(true);

    /* renamed from: d */
    public static final C6944j1<?, ?> f13230d = new C6952l1();

    /* renamed from: A */
    public static <UT, UB> UB m19818A(int i, List<Integer> list, C6999y.C7004e eVar, UB ub, C6944j1<UT, UB> j1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo32429a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m19829L(i, intValue, ub, j1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo32429a(intValue2)) {
                    ub = m19829L(i, intValue2, ub, j1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    public static Class<?> m19819B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static C6944j1<?, ?> m19820C(boolean z) {
        try {
            Class<?> D = m19821D();
            if (D == null) {
                return null;
            }
            return (C6944j1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class<?> m19821D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static <T, FT extends C6988u.C6990b<FT>> void m19822E(C6979q<FT> qVar, T t, T t2) {
        C6988u<FT> c = qVar.mo32330c(t2);
        if (!c.mo32365n()) {
            qVar.mo32331d(t).mo32370u(c);
        }
    }

    /* renamed from: F */
    public static <T> void m19823F(C6930h0 h0Var, T t, T t2, long j) {
        C6961n1.m20345T(t, j, h0Var.mo32009a(C6961n1.m20330E(t, j), C6961n1.m20330E(t2, j)));
    }

    /* renamed from: G */
    public static <T, UT, UB> void m19824G(C6944j1<UT, UB> j1Var, T t, T t2) {
        j1Var.mo32110p(t, j1Var.mo32105k(j1Var.mo32101g(t), j1Var.mo32101g(t2)));
    }

    /* renamed from: H */
    public static C6944j1<?, ?> m19825H() {
        return f13228b;
    }

    /* renamed from: I */
    public static C6944j1<?, ?> m19826I() {
        return f13229c;
    }

    /* renamed from: J */
    public static void m19827J(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f13227a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    public static boolean m19828K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    public static <UT, UB> UB m19829L(int i, int i2, UB ub, C6944j1<UT, UB> j1Var) {
        if (ub == null) {
            ub = j1Var.mo32108n();
        }
        j1Var.mo32099e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: M */
    public static C6944j1<?, ?> m19830M() {
        return f13230d;
    }

    /* renamed from: N */
    public static void m19831N(int i, List<Boolean> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32135B(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m19832O(int i, List<ByteString> list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.mo32148O(i, list);
        }
    }

    /* renamed from: P */
    public static void m19833P(int i, List<Double> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32146M(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m19834Q(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32145L(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m19835R(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32134A(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m19836S(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32178x(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m19837T(int i, List<Float> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32157c(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m19838U(int i, List<?> list, Writer writer, C6903d1 d1Var) {
        if (list != null && !list.isEmpty()) {
            writer.mo32156b(i, list, d1Var);
        }
    }

    /* renamed from: V */
    public static void m19839V(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32170p(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m19840W(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32144K(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m19841X(int i, List<?> list, Writer writer, C6903d1 d1Var) {
        if (list != null && !list.isEmpty()) {
            writer.mo32155a(i, list, d1Var);
        }
    }

    /* renamed from: Y */
    public static void m19842Y(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32179y(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m19843Z(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32162h(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m19844a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(size);
        }
        return size * CodedOutputStream.m23121e(i, true);
    }

    /* renamed from: a0 */
    public static void m19845a0(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32142I(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m19846b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m19847b0(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32138E(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m19848c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * CodedOutputStream.m23113V(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            V += CodedOutputStream.m23127i(list.get(i2));
        }
        return V;
    }

    /* renamed from: c0 */
    public static void m19849c0(int i, List<String> list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.mo32167m(i, list);
        }
    }

    /* renamed from: d */
    public static int m19850d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m19852e(list);
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(e);
        }
        return e + (size * CodedOutputStream.m23113V(i));
    }

    /* renamed from: d0 */
    public static void m19851d0(int i, List<Integer> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32137D(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m19852e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m23131m(xVar.mo32419s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m23131m(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m19853e0(int i, List<Long> list, Writer writer, boolean z) {
        if (list != null && !list.isEmpty()) {
            writer.mo32163i(i, list, z);
        }
    }

    /* renamed from: f */
    public static int m19854f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(size * 4);
        }
        return size * CodedOutputStream.m23132n(i, 0);
    }

    /* renamed from: g */
    public static int m19855g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m19856h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(size * 8);
        }
        return size * CodedOutputStream.m23134p(i, 0);
    }

    /* renamed from: i */
    public static int m19857i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m19858j(int i, List<C6954m0> list, C6903d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m23138t(i, list.get(i3), d1Var);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m19859k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m19860l(list);
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(l);
        }
        return l + (size * CodedOutputStream.m23113V(i));
    }

    /* renamed from: l */
    public static int m19860l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m23142x(xVar.mo32419s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m23142x(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m19861m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m19862n(list);
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(n);
        }
        return n + (list.size() * CodedOutputStream.m23113V(i));
    }

    /* renamed from: n */
    public static int m19862n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6907e0) {
            C6907e0 e0Var = (C6907e0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m23144z(e0Var.mo31902s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m23144z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m19863o(int i, Object obj, C6903d1 d1Var) {
        if (obj instanceof C6886a0) {
            return CodedOutputStream.m23093B(i, (C6886a0) obj);
        }
        return CodedOutputStream.m23098G(i, (C6954m0) obj, d1Var);
    }

    /* renamed from: p */
    public static int m19864p(int i, List<?> list, C6903d1 d1Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.m23113V(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C6886a0) {
                i2 = CodedOutputStream.m23094C((C6886a0) obj);
            } else {
                i2 = CodedOutputStream.m23100I((C6954m0) obj, d1Var);
            }
            V += i2;
        }
        return V;
    }

    /* renamed from: q */
    public static int m19865q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m19866r(list);
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(r);
        }
        return r + (size * CodedOutputStream.m23113V(i));
    }

    /* renamed from: r */
    public static int m19866r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m23108Q(xVar.mo32419s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m23108Q(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m19867s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m19868t(list);
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(t);
        }
        return t + (size * CodedOutputStream.m23113V(i));
    }

    /* renamed from: t */
    public static int m19868t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6907e0) {
            C6907e0 e0Var = (C6907e0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m23110S(e0Var.mo31902s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m23110S(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m19869u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.m23113V(i) * size;
        if (list instanceof C6892c0) {
            C6892c0 c0Var = (C6892c0) list;
            while (i4 < size) {
                Object K = c0Var.mo31762K(i4);
                if (K instanceof ByteString) {
                    i3 = CodedOutputStream.m23127i((ByteString) K);
                } else {
                    i3 = CodedOutputStream.m23112U((String) K);
                }
                V += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    i2 = CodedOutputStream.m23127i((ByteString) obj);
                } else {
                    i2 = CodedOutputStream.m23112U((String) obj);
                }
                V += i2;
                i4++;
            }
        }
        return V;
    }

    /* renamed from: v */
    public static int m19870v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m19871w(list);
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(w);
        }
        return w + (size * CodedOutputStream.m23113V(i));
    }

    /* renamed from: w */
    public static int m19871w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m23115X(xVar.mo32419s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m23115X(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m19872x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m19873y(list);
        if (z) {
            return CodedOutputStream.m23113V(i) + CodedOutputStream.m23095D(y);
        }
        return y + (size * CodedOutputStream.m23113V(i));
    }

    /* renamed from: y */
    public static int m19873y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6907e0) {
            C6907e0 e0Var = (C6907e0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m23117Z(e0Var.mo31902s(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m23117Z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m19874z(int i, List<Integer> list, C6999y.C7003d<?> dVar, UB ub, C6944j1<UT, UB> j1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.mo32428a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m19829L(i, intValue, ub, j1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo32428a(intValue2) == null) {
                    ub = m19829L(i, intValue2, ub, j1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
