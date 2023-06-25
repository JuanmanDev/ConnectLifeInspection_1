package p040c.p200q.p353b.p359f;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.f.d */
/* compiled from: TypeCapture */
public abstract class C6265d<T> {
    public final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C5850m.m16589j(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
