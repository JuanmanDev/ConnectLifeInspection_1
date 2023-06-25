package p040c.p200q.p363c.p403y;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c.q.c.y.e */
/* compiled from: GlobalLibraryVersionRegistrar */
public class C6875e {

    /* renamed from: b */
    public static volatile C6875e f13169b;

    /* renamed from: a */
    public final Set<C6877g> f13170a = new HashSet();

    /* renamed from: a */
    public static C6875e m19542a() {
        C6875e eVar = f13169b;
        if (eVar == null) {
            synchronized (C6875e.class) {
                eVar = f13169b;
                if (eVar == null) {
                    eVar = new C6875e();
                    f13169b = eVar;
                }
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public Set<C6877g> mo31730b() {
        Set<C6877g> unmodifiableSet;
        synchronized (this.f13170a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f13170a);
        }
        return unmodifiableSet;
    }
}
