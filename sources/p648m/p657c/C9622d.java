package p648m.p657c;

/* renamed from: m.c.d */
/* compiled from: DiagnosingMatcher */
public abstract class C9622d<T> extends C9619b<T> {
    /* renamed from: a */
    public abstract boolean mo50313a(Object obj, C9620c cVar);

    public final void describeMismatch(Object obj, C9620c cVar) {
        mo50313a(obj, cVar);
    }

    public final boolean matches(Object obj) {
        return mo50313a(obj, C9620c.f18857a);
    }
}
