package p648m.p668e.p677l;

import java.util.Comparator;
import org.junit.runner.Description;
import org.junit.runners.model.InitializationError;
import p648m.p668e.p669j.p670d.C9699a;
import p648m.p668e.p669j.p671e.C9707a;
import p648m.p668e.p669j.p671e.C9708b;
import p648m.p668e.p669j.p671e.C9709c;
import p648m.p668e.p669j.p672f.C9710a;
import p648m.p668e.p677l.p678g.C9750a;

/* renamed from: m.e.l.d */
/* compiled from: Request */
public abstract class C9746d {

    /* renamed from: m.e.l.d$a */
    /* compiled from: Request */
    public static class C9747a extends C9746d {

        /* renamed from: a */
        public final /* synthetic */ C9749f f19021a;

        public C9747a(C9749f fVar) {
            this.f19021a = fVar;
        }

        public C9749f getRunner() {
            return this.f19021a;
        }
    }

    public static C9746d aClass(Class<?> cls) {
        return new C9707a(cls);
    }

    public static C9746d classWithoutSuiteMethod(Class<?> cls) {
        return new C9707a(cls, false);
    }

    public static C9746d classes(C9742a aVar, Class<?>... clsArr) {
        try {
            return runner(aVar.mo50565b(new C9699a(true), clsArr));
        } catch (InitializationError unused) {
            throw new RuntimeException("Bug in saff's brain: Suite constructor, called as above, should always complete");
        }
    }

    public static C9746d errorReport(Class<?> cls, Throwable th) {
        return runner(new C9710a(cls, th));
    }

    public static C9746d method(Class<?> cls, String str) {
        return aClass(cls).filterWith(Description.createTestDescription(cls, str));
    }

    public static C9746d runner(C9749f fVar) {
        return new C9747a(fVar);
    }

    public C9746d filterWith(C9750a aVar) {
        return new C9708b(this, aVar);
    }

    public abstract C9749f getRunner();

    public C9746d sortWith(Comparator<Description> comparator) {
        return new C9709c(this, comparator);
    }

    public C9746d filterWith(Description description) {
        return filterWith(C9750a.matchMethodDescription(description));
    }

    public static C9746d classes(Class<?>... clsArr) {
        return classes(C9745c.m26229b(), clsArr);
    }
}
