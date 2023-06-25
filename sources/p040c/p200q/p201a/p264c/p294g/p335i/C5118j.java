package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.j */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class C5118j implements C5225q, C5165m {

    /* renamed from: e */
    public final String f9952e;

    /* renamed from: l */
    public final Map f9953l = new HashMap();

    public C5118j(String str) {
        this.f9952e = str;
    }

    /* renamed from: a */
    public abstract C5225q mo27025a(C5215p4 p4Var, List list);

    /* renamed from: b */
    public final String mo27337b() {
        return this.f9952e;
    }

    /* renamed from: c */
    public C5225q mo27205c() {
        return this;
    }

    /* renamed from: e */
    public final Double mo27206e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5118j)) {
            return false;
        }
        C5118j jVar = (C5118j) obj;
        String str = this.f9952e;
        if (str != null) {
            return str.equals(jVar.f9952e);
        }
        return false;
    }

    /* renamed from: f */
    public final String mo27208f() {
        return this.f9952e;
    }

    /* renamed from: g */
    public final boolean mo27209g(String str) {
        return this.f9953l.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f9952e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: k */
    public final Boolean mo27212k() {
        return Boolean.TRUE;
    }

    /* renamed from: l */
    public final Iterator mo27213l() {
        return C5134k.m14394b(this.f9953l);
    }

    /* renamed from: o */
    public final void mo27214o(String str, C5225q qVar) {
        if (qVar == null) {
            this.f9953l.remove(str);
        } else {
            this.f9953l.put(str, qVar);
        }
    }

    /* renamed from: p */
    public final C5225q mo27215p(String str) {
        return this.f9953l.containsKey(str) ? (C5225q) this.f9953l.get(str) : C5225q.f10068c;
    }

    /* renamed from: s */
    public final C5225q mo27216s(String str, C5215p4 p4Var, List list) {
        if ("toString".equals(str)) {
            return new C5285u(this.f9952e);
        }
        return C5134k.m14393a(this, new C5285u(str), p4Var, list);
    }
}
