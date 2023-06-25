package p040c.p200q.p405d;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: c.q.d.y0 */
/* compiled from: Protobuf */
public final class C7009y0 {

    /* renamed from: c */
    public static final C7009y0 f13394c = new C7009y0();

    /* renamed from: a */
    public final C6908e1 f13395a = new C6912f0();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C6903d1<?>> f13396b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C7009y0 m20722a() {
        return f13394c;
    }

    /* renamed from: b */
    public <T> void mo32430b(T t, C6890b1 b1Var, C6975p pVar) {
        mo32433e(t).mo31886e(t, b1Var, pVar);
    }

    /* renamed from: c */
    public C6903d1<?> mo32431c(Class<?> cls, C6903d1<?> d1Var) {
        C6999y.m20708b(cls, "messageType");
        C6999y.m20708b(d1Var, "schema");
        return this.f13396b.putIfAbsent(cls, d1Var);
    }

    /* renamed from: d */
    public <T> C6903d1<T> mo32432d(Class<T> cls) {
        C6999y.m20708b(cls, "messageType");
        C6903d1<T> d1Var = (C6903d1) this.f13396b.get(cls);
        if (d1Var != null) {
            return d1Var;
        }
        C6903d1<T> a = this.f13395a.mo31910a(cls);
        C6903d1<?> c = mo32431c(cls, a);
        return c != null ? c : a;
    }

    /* renamed from: e */
    public <T> C6903d1<T> mo32433e(T t) {
        return mo32432d(t.getClass());
    }
}
