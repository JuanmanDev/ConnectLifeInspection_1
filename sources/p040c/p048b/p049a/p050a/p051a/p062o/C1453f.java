package p040c.p048b.p049a.p050a.p051a.p062o;

import java.util.WeakHashMap;
import p040c.p048b.p049a.p050a.p051a.p052h.p054c.C1373a;

/* renamed from: c.b.a.a.a.o.f */
/* compiled from: InteractiveRequestMap */
public final class C1453f {

    /* renamed from: b */
    public static C1453f f627b;

    /* renamed from: a */
    public final WeakHashMap<Object, C1373a> f628a = new WeakHashMap<>();

    /* renamed from: a */
    public static synchronized C1453f m744a() {
        C1453f fVar;
        synchronized (C1453f.class) {
            if (f627b == null) {
                f627b = new C1453f();
            }
            fVar = f627b;
        }
        return fVar;
    }

    /* renamed from: b */
    public C1373a mo15311b(Object obj) {
        return this.f628a.get(obj);
    }

    /* renamed from: c */
    public void mo15312c(Object obj, C1373a aVar) {
        this.f628a.put(obj, aVar);
    }
}
