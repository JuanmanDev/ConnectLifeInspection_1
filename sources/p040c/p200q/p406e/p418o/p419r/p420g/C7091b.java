package p040c.p200q.p406e.p418o.p419r.p420g;

import p040c.p200q.p406e.p418o.p419r.C7085b;
import p040c.p200q.p406e.p418o.p419r.C7086c;

/* renamed from: c.q.e.o.r.g.b */
/* compiled from: ExpandedPair */
public final class C7091b {

    /* renamed from: a */
    public final C7085b f13629a;

    /* renamed from: b */
    public final C7085b f13630b;

    /* renamed from: c */
    public final C7086c f13631c;

    public C7091b(C7085b bVar, C7085b bVar2, C7086c cVar, boolean z) {
        this.f13629a = bVar;
        this.f13630b = bVar2;
        this.f13631c = cVar;
    }

    /* renamed from: a */
    public static boolean m21094a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: e */
    public static int m21095e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: b */
    public C7086c mo32688b() {
        return this.f13631c;
    }

    /* renamed from: c */
    public C7085b mo32689c() {
        return this.f13629a;
    }

    /* renamed from: d */
    public C7085b mo32690d() {
        return this.f13630b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7091b)) {
            return false;
        }
        C7091b bVar = (C7091b) obj;
        if (!m21094a(this.f13629a, bVar.f13629a) || !m21094a(this.f13630b, bVar.f13630b) || !m21094a(this.f13631c, bVar.f13631c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo32692f() {
        return this.f13630b == null;
    }

    public int hashCode() {
        return (m21095e(this.f13629a) ^ m21095e(this.f13630b)) ^ m21095e(this.f13631c);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f13629a);
        sb.append(" , ");
        sb.append(this.f13630b);
        sb.append(" : ");
        C7086c cVar = this.f13631c;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.mo32677c());
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }
}
