package p040c.p200q.p201a.p264c.p294g.p335i;

import androidx.test.internal.runner.RunnerArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.n */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public class C5180n implements C5225q, C5165m {

    /* renamed from: e */
    public final Map f10008e = new HashMap();

    /* renamed from: a */
    public final List mo27439a() {
        return new ArrayList(this.f10008e.keySet());
    }

    /* renamed from: c */
    public final C5225q mo27205c() {
        C5180n nVar = new C5180n();
        for (Map.Entry entry : this.f10008e.entrySet()) {
            if (entry.getValue() instanceof C5165m) {
                nVar.f10008e.put((String) entry.getKey(), (C5225q) entry.getValue());
            } else {
                nVar.f10008e.put((String) entry.getKey(), ((C5225q) entry.getValue()).mo27205c());
            }
        }
        return nVar;
    }

    /* renamed from: e */
    public final Double mo27206e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5180n)) {
            return false;
        }
        return this.f10008e.equals(((C5180n) obj).f10008e);
    }

    /* renamed from: f */
    public final String mo27208f() {
        return "[object Object]";
    }

    /* renamed from: g */
    public final boolean mo27209g(String str) {
        return this.f10008e.containsKey(str);
    }

    public final int hashCode() {
        return this.f10008e.hashCode();
    }

    /* renamed from: k */
    public final Boolean mo27212k() {
        return Boolean.TRUE;
    }

    /* renamed from: l */
    public final Iterator mo27213l() {
        return C5134k.m14394b(this.f10008e);
    }

    /* renamed from: o */
    public final void mo27214o(String str, C5225q qVar) {
        if (qVar == null) {
            this.f10008e.remove(str);
        } else {
            this.f10008e.put(str, qVar);
        }
    }

    /* renamed from: p */
    public final C5225q mo27215p(String str) {
        return this.f10008e.containsKey(str) ? (C5225q) this.f10008e.get(str) : C5225q.f10068c;
    }

    /* renamed from: s */
    public C5225q mo27216s(String str, C5215p4 p4Var, List list) {
        if ("toString".equals(str)) {
            return new C5285u(toString());
        }
        return C5134k.m14393a(this, new C5285u(str), p4Var, list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f10008e.isEmpty()) {
            for (String str : this.f10008e.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f10008e.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(RunnerArgs.CLASS_SEPARATOR));
        }
        sb.append("}");
        return sb.toString();
    }
}
