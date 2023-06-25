package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: c.q.a.c.g.g.q5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4710q5 {

    /* renamed from: a */
    public final ConcurrentMap f9578a;

    /* renamed from: b */
    public final C4602m5 f9579b;

    /* renamed from: c */
    public final Class f9580c;

    /* renamed from: d */
    public final C4421fd f9581d;

    public /* synthetic */ C4710q5(ConcurrentMap concurrentMap, C4602m5 m5Var, C4421fd fdVar, Class cls, C4683p5 p5Var) {
        this.f9578a = concurrentMap;
        this.f9579b = m5Var;
        this.f9580c = cls;
        this.f9581d = fdVar;
    }

    /* renamed from: a */
    public final C4602m5 mo26567a() {
        return this.f9579b;
    }

    /* renamed from: b */
    public final C4421fd mo26568b() {
        return this.f9581d;
    }

    /* renamed from: c */
    public final Class mo26569c() {
        return this.f9580c;
    }

    /* renamed from: d */
    public final Collection mo26570d() {
        return this.f9578a.values();
    }

    /* renamed from: e */
    public final List mo26571e(byte[] bArr) {
        List list = (List) this.f9578a.get(new C4656o5(bArr, (C4629n5) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public final boolean mo26572f() {
        return !this.f9581d.mo25978a().isEmpty();
    }
}
