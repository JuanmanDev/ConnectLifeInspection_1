package p040c.p200q.p353b.p359f;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.f.c */
/* compiled from: Reflection */
public final class C6264c {
    /* renamed from: a */
    public static <T> T m17615a(Class<T> cls, InvocationHandler invocationHandler) {
        C5850m.m16594o(invocationHandler);
        C5850m.m16589j(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
