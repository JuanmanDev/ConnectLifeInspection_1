package p648m.p668e.p682n;

import java.util.Collections;
import java.util.List;
import p648m.p668e.p680m.p681d.C9786h;

/* renamed from: m.e.n.d */
/* compiled from: PublicClassValidator */
public class C9798d implements C9799e {

    /* renamed from: a */
    public static final List<Exception> f19061a = Collections.emptyList();

    /* renamed from: a */
    public List<Exception> mo50690a(C9786h hVar) {
        if (hVar.mo50680p()) {
            return f19061a;
        }
        return Collections.singletonList(new Exception("The class " + hVar.mo50677k() + " is not public."));
    }
}
