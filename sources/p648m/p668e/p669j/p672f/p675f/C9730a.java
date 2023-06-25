package p648m.p668e.p669j.p672f.p675f;

import org.junit.internal.AssumptionViolatedException;
import p648m.p668e.p680m.p681d.C9785g;

/* renamed from: m.e.j.f.f.a */
/* compiled from: ExpectException */
public class C9730a extends C9785g {

    /* renamed from: a */
    public final C9785g f18996a;

    /* renamed from: b */
    public final Class<? extends Throwable> f18997b;

    public C9730a(C9785g gVar, Class<? extends Throwable> cls) {
        this.f18996a = gVar;
        this.f18997b = cls;
    }

    public void evaluate() {
        boolean z;
        try {
            this.f18996a.evaluate();
            z = true;
        } catch (AssumptionViolatedException e) {
            throw e;
        } catch (Throwable th) {
            if (this.f18997b.isAssignableFrom(th.getClass())) {
                z = false;
            } else {
                throw new Exception("Unexpected exception, expected<" + this.f18997b.getName() + "> but was<" + th.getClass().getName() + ">", th);
            }
        }
        if (z) {
            throw new AssertionError("Expected exception: " + this.f18997b.getName());
        }
    }
}
