package p040c.p200q.p201a.p264c.p294g.p333g;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.f3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4411f3 implements Map.Entry, Comparable {

    /* renamed from: e */
    public final Comparable f9204e;

    /* renamed from: l */
    public Object f9205l;

    /* renamed from: m */
    public final /* synthetic */ C4573l3 f9206m;

    public C4411f3(C4573l3 l3Var, Comparable comparable, Object obj) {
        this.f9206m = l3Var;
        this.f9204e = comparable;
        this.f9205l = obj;
    }

    /* renamed from: d */
    public static final boolean m11933d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public final Comparable mo25958c() {
        return this.f9204e;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f9204e.compareTo(((C4411f3) obj).f9204e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m11933d(this.f9204e, entry.getKey()) && m11933d(this.f9205l, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f9204e;
    }

    public final Object getValue() {
        return this.f9205l;
    }

    public final int hashCode() {
        Comparable comparable = this.f9204e;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9205l;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f9206m.mo26247n();
        Object obj2 = this.f9205l;
        this.f9205l = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9204e);
        String valueOf2 = String.valueOf(this.f9205l);
        return valueOf + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + valueOf2;
    }
}
