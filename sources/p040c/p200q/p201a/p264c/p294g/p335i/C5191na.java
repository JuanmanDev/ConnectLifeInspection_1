package p040c.p200q.p201a.p264c.p294g.p335i;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.na */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5191na implements Map.Entry, Comparable {

    /* renamed from: e */
    public final Comparable f10017e;

    /* renamed from: l */
    public Object f10018l;

    /* renamed from: m */
    public final /* synthetic */ C5281ta f10019m;

    public C5191na(C5281ta taVar, Comparable comparable, Object obj) {
        this.f10019m = taVar;
        this.f10017e = comparable;
        this.f10018l = obj;
    }

    /* renamed from: d */
    public static final boolean m14541d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public final Comparable mo27461c() {
        return this.f10017e;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f10017e.compareTo(((C5191na) obj).f10017e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m14541d(this.f10017e, entry.getKey()) && m14541d(this.f10018l, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f10017e;
    }

    public final Object getValue() {
        return this.f10018l;
    }

    public final int hashCode() {
        Comparable comparable = this.f10017e;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f10018l;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f10019m.mo27742n();
        Object obj2 = this.f10018l;
        this.f10018l = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10017e);
        String valueOf2 = String.valueOf(this.f10018l);
        return valueOf + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + valueOf2;
    }
}
