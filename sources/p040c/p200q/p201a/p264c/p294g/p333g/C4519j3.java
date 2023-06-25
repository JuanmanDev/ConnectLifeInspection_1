package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.j3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4519j3 extends AbstractSet {

    /* renamed from: e */
    public final /* synthetic */ C4573l3 f9306e;

    public /* synthetic */ C4519j3(C4573l3 l3Var, C4492i3 i3Var) {
        this.f9306e = l3Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f9306e.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f9306e.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f9306e.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C4465h3(this.f9306e, (C4438g3) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f9306e.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f9306e.size();
    }
}
