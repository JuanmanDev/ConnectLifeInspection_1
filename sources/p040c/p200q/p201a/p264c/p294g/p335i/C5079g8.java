package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.g8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5079g8 {

    /* renamed from: b */
    public static volatile C5079g8 f9906b;

    /* renamed from: c */
    public static final C5079g8 f9907c = new C5079g8(true);

    /* renamed from: a */
    public final Map f9908a;

    public C5079g8() {
        this.f9908a = new HashMap();
    }

    /* renamed from: a */
    public static C5079g8 m14135a() {
        Class<C5079g8> cls = C5079g8.class;
        C5079g8 g8Var = f9906b;
        if (g8Var != null) {
            return g8Var;
        }
        synchronized (cls) {
            C5079g8 g8Var2 = f9906b;
            if (g8Var2 != null) {
                return g8Var2;
            }
            C5079g8 b = C5189n8.m14537b(cls);
            f9906b = b;
            return b;
        }
    }

    /* renamed from: b */
    public final C5264s8 mo27273b(C5295u9 u9Var, int i) {
        return (C5264s8) this.f9908a.get(new C5063f8(u9Var, i));
    }

    public C5079g8(boolean z) {
        this.f9908a = Collections.emptyMap();
    }
}
