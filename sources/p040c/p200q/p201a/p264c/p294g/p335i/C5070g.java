package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Iterator;
import java.util.List;

/* renamed from: c.q.a.c.g.i.g */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5070g implements C5225q {

    /* renamed from: e */
    public final boolean f9899e;

    public C5070g(Boolean bool) {
        this.f9899e = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: c */
    public final C5225q mo27205c() {
        return new C5070g(Boolean.valueOf(this.f9899e));
    }

    /* renamed from: e */
    public final Double mo27206e() {
        return Double.valueOf(true != this.f9899e ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5070g) && this.f9899e == ((C5070g) obj).f9899e;
    }

    /* renamed from: f */
    public final String mo27208f() {
        return Boolean.toString(this.f9899e);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f9899e).hashCode();
    }

    /* renamed from: k */
    public final Boolean mo27212k() {
        return Boolean.valueOf(this.f9899e);
    }

    /* renamed from: l */
    public final Iterator mo27213l() {
        return null;
    }

    /* renamed from: s */
    public final C5225q mo27216s(String str, C5215p4 p4Var, List list) {
        if ("toString".equals(str)) {
            return new C5285u(Boolean.toString(this.f9899e));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f9899e), str}));
    }

    public final String toString() {
        return String.valueOf(this.f9899e);
    }
}
