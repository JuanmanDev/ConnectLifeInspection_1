package p648m.p657c.p658j;

import java.lang.reflect.Array;
import p648m.p657c.C9619b;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;

/* renamed from: m.c.j.d */
/* compiled from: IsEqual */
public class C9631d<T> extends C9619b<T> {

    /* renamed from: e */
    public final Object f18861e;

    public C9631d(T t) {
        this.f18861e = t;
    }

    /* renamed from: a */
    public static boolean m25861a(Object obj, Object obj2) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            if (!m25864d(Array.get(obj, i), Array.get(obj2, i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m25862b(Object obj, Object obj2) {
        return Array.getLength(obj) == Array.getLength(obj2);
    }

    /* renamed from: c */
    public static boolean m25863c(Object obj, Object obj2) {
        return m25862b(obj, obj2) && m25861a(obj, obj2);
    }

    /* renamed from: d */
    public static boolean m25864d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null || !m25866f(obj)) {
            return obj.equals(obj2);
        }
        if (!m25866f(obj2) || !m25863c(obj, obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static <T> C9623e<T> m25865e(T t) {
        return new C9631d(t);
    }

    /* renamed from: f */
    public static boolean m25866f(Object obj) {
        return obj.getClass().isArray();
    }

    public void describeTo(C9620c cVar) {
        cVar.mo50301d(this.f18861e);
    }

    public boolean matches(Object obj) {
        return m25864d(obj, this.f18861e);
    }
}
