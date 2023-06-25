package p648m.p668e.p669j.p672f.p674e;

import java.lang.annotation.Annotation;
import p648m.p668e.p680m.p681d.C9780c;

/* renamed from: m.e.j.f.e.b */
/* compiled from: ValidationError */
public class C9729b extends Exception {
    public C9729b(C9780c<?> cVar, Class<? extends Annotation> cls, String str) {
        super(String.format("The @%s '%s' %s", new Object[]{cls.getSimpleName(), cVar.mo50642c(), str}));
    }
}
