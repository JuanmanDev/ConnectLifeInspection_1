package p648m.p668e.p669j.p672f.p675f;

import java.util.List;
import p648m.p668e.p680m.p681d.C9781d;
import p648m.p668e.p680m.p681d.C9785g;

/* renamed from: m.e.j.f.f.f */
/* compiled from: RunBefores */
public class C9738f extends C9785g {

    /* renamed from: a */
    public final C9785g f19014a;

    /* renamed from: b */
    public final Object f19015b;

    /* renamed from: c */
    public final List<C9781d> f19016c;

    public C9738f(C9785g gVar, List<C9781d> list, Object obj) {
        this.f19014a = gVar;
        this.f19016c = list;
        this.f19015b = obj;
    }

    public void evaluate() {
        for (C9781d m : this.f19016c) {
            m.mo50657m(this.f19015b, new Object[0]);
        }
        this.f19014a.evaluate();
    }
}
