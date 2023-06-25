package p648m.p657c.p658j;

import p648m.p657c.C9619b;
import p648m.p657c.C9620c;
import p648m.p657c.C9623e;

/* renamed from: m.c.j.c */
/* compiled from: Is */
public class C9630c<T> extends C9619b<T> {

    /* renamed from: e */
    public final C9623e<T> f18860e;

    public C9630c(C9623e<T> eVar) {
        this.f18860e = eVar;
    }

    /* renamed from: a */
    public static <T> C9623e<T> m25859a(T t) {
        return m25860b(C9631d.m25865e(t));
    }

    /* renamed from: b */
    public static <T> C9623e<T> m25860b(C9623e<T> eVar) {
        return new C9630c(eVar);
    }

    public void describeMismatch(Object obj, C9620c cVar) {
        this.f18860e.describeMismatch(obj, cVar);
    }

    public void describeTo(C9620c cVar) {
        cVar.mo50300c("is ").mo50299b(this.f18860e);
    }

    public boolean matches(Object obj) {
        return this.f18860e.matches(obj);
    }
}
