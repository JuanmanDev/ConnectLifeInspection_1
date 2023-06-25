package p648m.p668e.p676k;

import org.junit.runner.Description;
import p648m.p668e.p680m.p681d.C9785g;

/* renamed from: m.e.k.b */
/* compiled from: RunRules */
public class C9740b extends C9785g {

    /* renamed from: a */
    public final C9785g f19017a;

    public C9740b(C9785g gVar, Iterable<C9741c> iterable, Description description) {
        this.f19017a = m26226a(gVar, iterable, description);
    }

    /* renamed from: a */
    public static C9785g m26226a(C9785g gVar, Iterable<C9741c> iterable, Description description) {
        for (C9741c apply : iterable) {
            gVar = apply.apply(gVar, description);
        }
        return gVar;
    }

    public void evaluate() {
        this.f19017a.evaluate();
    }
}
