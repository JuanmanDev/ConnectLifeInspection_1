package p040c.p200q.p353b.p354a;

import com.google.common.base.Optional;
import java.util.Collections;
import java.util.Set;

/* renamed from: c.q.b.a.a */
/* compiled from: Absent */
public final class C5827a<T> extends Optional<T> {

    /* renamed from: e */
    public static final C5827a<Object> f11350e = new C5827a<>();
    public static final long serialVersionUID = 0;

    /* renamed from: a */
    public static <T> Optional<T> m16531a() {
        return f11350e;
    }

    private Object readResolve() {
        return f11350e;
    }

    public Set<T> asSet() {
        return Collections.emptySet();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode() {
        return 2040732332;
    }

    public boolean isPresent() {
        return false;
    }

    /* renamed from: or */
    public T mo28925or(T t) {
        C5850m.m16595p(t, "use Optional.orNull() instead of Optional.or(null)");
        return t;
    }

    public T orNull() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }

    public <V> Optional<V> transform(C5838g<? super T, V> gVar) {
        C5850m.m16594o(gVar);
        return Optional.absent();
    }

    /* renamed from: or */
    public Optional<T> mo28923or(Optional<? extends T> optional) {
        C5850m.m16594o(optional);
        return optional;
    }

    /* renamed from: or */
    public T mo28924or(C5865r<? extends T> rVar) {
        T t = rVar.get();
        C5850m.m16595p(t, "use Optional.orNull() instead of a Supplier that returns null");
        return t;
    }
}
