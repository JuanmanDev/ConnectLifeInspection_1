package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.q.a.c.g.i.p */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5210p extends C5118j implements C5165m {

    /* renamed from: m */
    public final List f10047m;

    /* renamed from: n */
    public final List f10048n;

    /* renamed from: o */
    public C5215p4 f10049o;

    public C5210p(C5210p pVar) {
        super(pVar.f9952e);
        ArrayList arrayList = new ArrayList(pVar.f10047m.size());
        this.f10047m = arrayList;
        arrayList.addAll(pVar.f10047m);
        ArrayList arrayList2 = new ArrayList(pVar.f10048n.size());
        this.f10048n = arrayList2;
        arrayList2.addAll(pVar.f10048n);
        this.f10049o = pVar.f10049o;
    }

    /* renamed from: a */
    public final C5225q mo27025a(C5215p4 p4Var, List list) {
        C5215p4 a = this.f10049o.mo27495a();
        for (int i = 0; i < this.f10047m.size(); i++) {
            if (i < list.size()) {
                a.mo27499e((String) this.f10047m.get(i), p4Var.mo27496b((C5225q) list.get(i)));
            } else {
                a.mo27499e((String) this.f10047m.get(i), C5225q.f10068c);
            }
        }
        for (C5225q qVar : this.f10048n) {
            C5225q b = a.mo27496b(qVar);
            if (b instanceof C5240r) {
                b = a.mo27496b(qVar);
            }
            if (b instanceof C5086h) {
                return ((C5086h) b).mo27281a();
            }
        }
        return C5225q.f10068c;
    }

    /* renamed from: c */
    public final C5225q mo27205c() {
        return new C5210p(this);
    }

    public C5210p(String str, List list, List list2, C5215p4 p4Var) {
        super(str);
        this.f10047m = new ArrayList();
        this.f10049o = p4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f10047m.add(((C5225q) it.next()).mo27208f());
            }
        }
        this.f10048n = new ArrayList(list2);
    }
}
