package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.ra */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5251ra extends AbstractSet {

    /* renamed from: e */
    public final /* synthetic */ C5281ta f10113e;

    public /* synthetic */ C5251ra(C5281ta taVar, C5236qa qaVar) {
        this.f10113e = taVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f10113e.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f10113e.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f10113e.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C5221pa(this.f10113e, (C5206oa) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f10113e.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f10113e.size();
    }
}
