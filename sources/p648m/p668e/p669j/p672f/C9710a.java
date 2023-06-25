package p648m.p668e.p669j.p672f;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runners.model.InitializationError;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p679h.C9759b;

/* renamed from: m.e.j.f.a */
/* compiled from: ErrorReportingRunner */
public class C9710a extends C9749f {

    /* renamed from: a */
    public final List<Throwable> f18980a;

    /* renamed from: b */
    public final Class<?> f18981b;

    public C9710a(Class<?> cls, Throwable th) {
        if (cls != null) {
            this.f18981b = cls;
            this.f18980a = mo50529b(th);
            return;
        }
        throw new NullPointerException("Test class cannot be null");
    }

    /* renamed from: a */
    public final Description mo50528a(Throwable th) {
        return Description.createTestDescription(this.f18981b, "initializationError");
    }

    /* renamed from: b */
    public final List<Throwable> mo50529b(Throwable th) {
        if (th instanceof InvocationTargetException) {
            return mo50529b(th.getCause());
        }
        if (th instanceof InitializationError) {
            return ((InitializationError) th).getCauses();
        }
        if (th instanceof org.junit.internal.runners.InitializationError) {
            return ((org.junit.internal.runners.InitializationError) th).getCauses();
        }
        return Arrays.asList(new Throwable[]{th});
    }

    /* renamed from: c */
    public final void mo50530c(Throwable th, C9759b bVar) {
        Description a = mo50528a(th);
        bVar.mo50589l(a);
        bVar.mo50583f(new Failure(a, th));
        bVar.mo50585h(a);
    }

    public Description getDescription() {
        Description createSuiteDescription = Description.createSuiteDescription(this.f18981b);
        for (Throwable a : this.f18980a) {
            createSuiteDescription.addChild(mo50528a(a));
        }
        return createSuiteDescription;
    }

    public void run(C9759b bVar) {
        for (Throwable c : this.f18980a) {
            mo50530c(c, bVar);
        }
    }
}
