package p040c.p200q.p363c.p403y;

import java.util.Iterator;
import java.util.Set;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6442p;
import p040c.p200q.p363c.p369m.C6456v;

/* renamed from: c.q.c.y.d */
/* compiled from: DefaultUserAgentPublisher */
public class C6874d implements C6880i {

    /* renamed from: a */
    public final String f13167a;

    /* renamed from: b */
    public final C6875e f13168b;

    public C6874d(Set<C6877g> set, C6875e eVar) {
        this.f13167a = m19540d(set);
        this.f13168b = eVar;
    }

    /* renamed from: b */
    public static C6439o<C6880i> m19538b() {
        C6439o.C6441b<C6880i> a = C6439o.m17967a(C6880i.class);
        a.mo30550b(C6456v.m18046l(C6877g.class));
        a.mo30554f(C6871a.f13162a);
        return a.mo30552d();
    }

    /* renamed from: c */
    public static /* synthetic */ C6880i m19539c(C6442p pVar) {
        return new C6874d(pVar.mo30532d(C6877g.class), C6875e.m19542a());
    }

    /* renamed from: d */
    public static String m19540d(Set<C6877g> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C6877g> it = set.iterator();
        while (it.hasNext()) {
            C6877g next = it.next();
            sb.append(next.mo31724b());
            sb.append('/');
            sb.append(next.mo31725c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo31729a() {
        if (this.f13168b.mo31730b().isEmpty()) {
            return this.f13167a;
        }
        return this.f13167a + ' ' + m19540d(this.f13168b.mo31730b());
    }
}
