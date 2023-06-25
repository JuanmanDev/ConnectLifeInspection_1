package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.b */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C4990b {

    /* renamed from: a */
    public String f9809a;

    /* renamed from: b */
    public final long f9810b;

    /* renamed from: c */
    public final Map f9811c;

    public C4990b(String str, long j, Map map) {
        this.f9809a = str;
        this.f9810b = j;
        HashMap hashMap = new HashMap();
        this.f9811c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo26953a() {
        return this.f9810b;
    }

    /* renamed from: b */
    public final C4990b clone() {
        return new C4990b(this.f9809a, this.f9810b, new HashMap(this.f9811c));
    }

    /* renamed from: c */
    public final Object mo26955c(String str) {
        if (this.f9811c.containsKey(str)) {
            return this.f9811c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo26957d() {
        return this.f9809a;
    }

    /* renamed from: e */
    public final Map mo26958e() {
        return this.f9811c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4990b)) {
            return false;
        }
        C4990b bVar = (C4990b) obj;
        if (this.f9810b == bVar.f9810b && this.f9809a.equals(bVar.f9809a)) {
            return this.f9811c.equals(bVar.f9811c);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo26960f(String str) {
        this.f9809a = str;
    }

    /* renamed from: g */
    public final void mo26961g(String str, Object obj) {
        if (obj == null) {
            this.f9811c.remove(str);
        } else {
            this.f9811c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f9809a.hashCode();
        long j = this.f9810b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f9811c.hashCode();
    }

    public final String toString() {
        String str = this.f9809a;
        long j = this.f9810b;
        String obj = this.f9811c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
