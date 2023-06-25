package p648m.p668e.p669j.p671e;

import java.util.Comparator;
import org.junit.runner.Description;
import p648m.p668e.p677l.C9746d;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p678g.C9756d;

/* renamed from: m.e.j.e.c */
/* compiled from: SortingRequest */
public class C9709c extends C9746d {

    /* renamed from: a */
    public final C9746d f18978a;

    /* renamed from: b */
    public final Comparator<Description> f18979b;

    public C9709c(C9746d dVar, Comparator<Description> comparator) {
        this.f18978a = dVar;
        this.f18979b = comparator;
    }

    public C9749f getRunner() {
        C9749f runner = this.f18978a.getRunner();
        new C9756d(this.f18979b).mo50577a(runner);
        return runner;
    }
}
