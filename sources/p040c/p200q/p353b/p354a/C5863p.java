package p040c.p200q.p353b.p354a;

import com.google.common.base.Optional;
import java.util.Collections;
import java.util.Set;

/* renamed from: c.q.b.a.p */
/* compiled from: Present */
public final class C5863p<T> extends Optional<T> {
    public static final long serialVersionUID = 0;

    /* renamed from: e */
    public final T f11383e;

    public C5863p(T t) {
        this.f11383e = t;
    }

    public Set<T> asSet() {
        return Collections.singleton(this.f11383e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5863p) {
            return this.f11383e.equals(((C5863p) obj).f11383e);
        }
        return false;
    }

    public T get() {
        return this.f11383e;
    }

    public int hashCode() {
        return this.f11383e.hashCode() + 1502476572;
    }

    public boolean isPresent() {
        return true;
    }

    /* renamed from: or */
    public T mo28925or(T t) {
        C5850m.m16595p(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f11383e;
    }

    public T orNull() {
        return this.f11383e;
    }

    public String toString() {
        return "Optional.of(" + this.f11383e + ")";
    }

    public <V> Optional<V> transform(C5838g<? super T, V> gVar) {
        V apply = gVar.apply(this.f11383e);
        C5850m.m16595p(apply, "the Function passed to Optional.transform() must not return null.");
        return new C5863p(apply);
    }

    /* renamed from: or */
    public Optional<T> mo28923or(Optional<? extends T> optional) {
        C5850m.m16594o(optional);
        return this;
    }

    /* renamed from: or */
    public T mo28924or(C5865r<? extends T> rVar) {
        C5850m.m16594o(rVar);
        return this.f11383e;
    }
}
