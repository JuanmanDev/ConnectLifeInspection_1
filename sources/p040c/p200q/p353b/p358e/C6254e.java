package p040c.p200q.p353b.p358e;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.e.e */
/* compiled from: Primitives */
public final class C6254e {

    /* renamed from: a */
    public static final Map<Class<?>, Class<?>> f11873a;

    /* renamed from: b */
    public static final Map<Class<?>, Class<?>> f11874b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        m17590a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        m17590a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        m17590a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        m17590a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        m17590a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        m17590a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        m17590a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        m17590a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        m17590a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f11873a = Collections.unmodifiableMap(linkedHashMap);
        f11874b = Collections.unmodifiableMap(linkedHashMap2);
    }

    /* renamed from: a */
    public static void m17590a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: b */
    public static Set<Class<?>> m17591b() {
        return f11874b.keySet();
    }

    /* renamed from: c */
    public static <T> Class<T> m17592c(Class<T> cls) {
        C5850m.m16594o(cls);
        Class<T> cls2 = f11874b.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: d */
    public static <T> Class<T> m17593d(Class<T> cls) {
        C5850m.m16594o(cls);
        Class<T> cls2 = f11873a.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
