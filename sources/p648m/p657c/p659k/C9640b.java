package p648m.p657c.p659k;

import java.lang.reflect.Method;

/* renamed from: m.c.k.b */
/* compiled from: ReflectiveTypeFinder */
public class C9640b {

    /* renamed from: a */
    public final String f18869a;

    /* renamed from: b */
    public final int f18870b;

    /* renamed from: c */
    public final int f18871c;

    public C9640b(String str, int i, int i2) {
        this.f18869a = str;
        this.f18870b = i;
        this.f18871c = i2;
    }

    /* renamed from: a */
    public boolean mo50325a(Method method) {
        return method.getName().equals(this.f18869a) && method.getParameterTypes().length == this.f18870b && !method.isSynthetic();
    }

    /* renamed from: b */
    public Class<?> mo50326b(Method method) {
        return method.getParameterTypes()[this.f18871c];
    }

    /* renamed from: c */
    public Class<?> mo50327c(Class<?> cls) {
        while (true) {
            Class<? super Object> cls2 = cls;
            if (cls2 != Object.class) {
                for (Method method : cls2.getDeclaredMethods()) {
                    if (mo50325a(method)) {
                        return mo50326b(method);
                    }
                }
                cls2 = cls2.getSuperclass();
            } else {
                throw new Error("Cannot determine correct type for " + this.f18869a + "() method.");
            }
        }
    }
}
