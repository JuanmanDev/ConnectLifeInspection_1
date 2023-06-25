package p648m.p668e.p669j.p671e;

import org.junit.runner.manipulation.NoTestsRemainException;
import p648m.p668e.p669j.p672f.C9710a;
import p648m.p668e.p677l.C9746d;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p678g.C9750a;

/* renamed from: m.e.j.e.b */
/* compiled from: FilterRequest */
public final class C9708b extends C9746d {

    /* renamed from: a */
    public final C9746d f18976a;

    /* renamed from: b */
    public final C9750a f18977b;

    public C9708b(C9746d dVar, C9750a aVar) {
        this.f18976a = dVar;
        this.f18977b = aVar;
    }

    public C9749f getRunner() {
        try {
            C9749f runner = this.f18976a.getRunner();
            this.f18977b.apply(runner);
            return runner;
        } catch (NoTestsRemainException unused) {
            return new C9710a(C9750a.class, new Exception(String.format("No tests found matching %s from %s", new Object[]{this.f18977b.describe(), this.f18976a.toString()})));
        }
    }
}
