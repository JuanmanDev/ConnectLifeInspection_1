package p648m.p668e.p669j;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import p648m.p668e.C9691g;

/* renamed from: m.e.j.a */
/* compiled from: MethodSorter */
public class C9694a {

    /* renamed from: a */
    public static final Comparator<Method> f18968a = new C9695a();

    /* renamed from: b */
    public static final Comparator<Method> f18969b = new C9696b();

    /* renamed from: m.e.j.a$a */
    /* compiled from: MethodSorter */
    public static class C9695a implements Comparator<Method> {
        /* renamed from: a */
        public int compare(Method method, Method method2) {
            int hashCode = method.getName().hashCode();
            int hashCode2 = method2.getName().hashCode();
            if (hashCode != hashCode2) {
                return hashCode < hashCode2 ? -1 : 1;
            }
            return C9694a.f18969b.compare(method, method2);
        }
    }

    /* renamed from: m.e.j.a$b */
    /* compiled from: MethodSorter */
    public static class C9696b implements Comparator<Method> {
        /* renamed from: a */
        public int compare(Method method, Method method2) {
            int compareTo = method.getName().compareTo(method2.getName());
            if (compareTo != 0) {
                return compareTo;
            }
            return method.toString().compareTo(method2.toString());
        }
    }

    /* renamed from: a */
    public static Method[] m26157a(Class<?> cls) {
        Comparator<Method> b = m26158b((C9691g) cls.getAnnotation(C9691g.class));
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (b != null) {
            Arrays.sort(declaredMethods, b);
        }
        return declaredMethods;
    }

    /* renamed from: b */
    public static Comparator<Method> m26158b(C9691g gVar) {
        if (gVar == null) {
            return f18968a;
        }
        return gVar.value().getComparator();
    }
}
