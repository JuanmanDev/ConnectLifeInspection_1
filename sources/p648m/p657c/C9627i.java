package p648m.p657c;

import p648m.p657c.p659k.C9640b;

/* renamed from: m.c.i */
/* compiled from: TypeSafeMatcher */
public abstract class C9627i<T> extends C9619b<T> {
    public static final C9640b TYPE_FINDER = new C9640b("matchesSafely", 1, 0);
    public final Class<?> expectedType;

    public C9627i() {
        this(TYPE_FINDER);
    }

    public final void describeMismatch(Object obj, C9620c cVar) {
        if (obj == null) {
            super.describeMismatch(obj, cVar);
        } else if (!this.expectedType.isInstance(obj)) {
            cVar.mo50300c("was a ").mo50300c(obj.getClass().getName()).mo50300c(" (").mo50301d(obj).mo50300c(")");
        } else {
            describeMismatchSafely(obj, cVar);
        }
    }

    public void describeMismatchSafely(T t, C9620c cVar) {
        super.describeMismatch(t, cVar);
    }

    public final boolean matches(Object obj) {
        return obj != null && this.expectedType.isInstance(obj) && matchesSafely(obj);
    }

    public abstract boolean matchesSafely(T t);

    public C9627i(Class<?> cls) {
        this.expectedType = cls;
    }

    public C9627i(C9640b bVar) {
        this.expectedType = bVar.mo50327c(getClass());
    }
}
