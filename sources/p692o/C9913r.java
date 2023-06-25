package p692o;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: o.r */
/* compiled from: ServiceMethod */
public abstract class C9913r<T> {
    /* renamed from: b */
    public static <T> C9913r<T> m26576b(C9910q qVar, Method method) {
        C9907o b = C9907o.m26541b(qVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C9916u.m26589k(genericReturnType)) {
            throw C9916u.m26592n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return C9874h.m26474f(qVar, method, b);
        } else {
            throw C9916u.m26592n(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract T mo51269a(Object[] objArr);
}
