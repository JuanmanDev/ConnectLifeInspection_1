package p648m.p657c.p658j;

import p648m.p657c.C9619b;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;

/* renamed from: m.c.j.f */
/* compiled from: IsNot */
public class C9633f<T> extends C9619b<T> {

    /* renamed from: e */
    public final C9623e<T> f18864e;

    public C9633f(C9623e<T> eVar) {
        this.f18864e = eVar;
    }

    /* renamed from: a */
    public static <T> C9623e<T> m25870a(C9623e<T> eVar) {
        return new C9633f(eVar);
    }

    public void describeTo(C9620c cVar) {
        cVar.mo50300c("not ").mo50299b(this.f18864e);
    }

    public boolean matches(Object obj) {
        return !this.f18864e.matches(obj);
    }
}
