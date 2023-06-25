package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: c.q.a.c.g.g.l3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C4573l3 extends AbstractMap {

    /* renamed from: e */
    public final int f9371e;

    /* renamed from: l */
    public List f9372l = Collections.emptyList();

    /* renamed from: m */
    public Map f9373m = Collections.emptyMap();

    /* renamed from: n */
    public boolean f9374n;

    /* renamed from: o */
    public volatile C4519j3 f9375o;

    /* renamed from: p */
    public Map f9376p = Collections.emptyMap();

    public /* synthetic */ C4573l3(int i, C4546k3 k3Var) {
        this.f9371e = i;
    }

    /* renamed from: a */
    public void mo25779a() {
        Map map;
        Map map2;
        if (!this.f9374n) {
            if (this.f9373m.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f9373m);
            }
            this.f9373m = map;
            if (this.f9376p.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f9376p);
            }
            this.f9376p = map2;
            this.f9374n = true;
        }
    }

    /* renamed from: b */
    public final int mo26233b() {
        return this.f9372l.size();
    }

    /* renamed from: c */
    public final Iterable mo26234c() {
        if (this.f9373m.isEmpty()) {
            return C4384e3.m11881a();
        }
        return this.f9373m.entrySet();
    }

    public final void clear() {
        mo26247n();
        if (!this.f9372l.isEmpty()) {
            this.f9372l.clear();
        }
        if (!this.f9373m.isEmpty()) {
            this.f9373m.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo26244k(comparable) >= 0 || this.f9373m.containsKey(comparable);
    }

    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        mo26247n();
        int k = mo26244k(comparable);
        if (k >= 0) {
            return ((C4411f3) this.f9372l.get(k)).setValue(obj);
        }
        mo26247n();
        if (this.f9372l.isEmpty() && !(this.f9372l instanceof ArrayList)) {
            this.f9372l = new ArrayList(this.f9371e);
        }
        int i = -(k + 1);
        if (i >= this.f9371e) {
            return mo26246m().put(comparable, obj);
        }
        int size = this.f9372l.size();
        int i2 = this.f9371e;
        if (size == i2) {
            C4411f3 f3Var = (C4411f3) this.f9372l.remove(i2 - 1);
            mo26246m().put(f3Var.mo25958c(), f3Var.getValue());
        }
        this.f9372l.add(i, new C4411f3(this, comparable, obj));
        return null;
    }

    public final Set entrySet() {
        if (this.f9375o == null) {
            this.f9375o = new C4519j3(this, (C4492i3) null);
        }
        return this.f9375o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4573l3)) {
            return super.equals(obj);
        }
        C4573l3 l3Var = (C4573l3) obj;
        int size = size();
        if (size != l3Var.size()) {
            return false;
        }
        int b = mo26233b();
        if (b != l3Var.mo26233b()) {
            return entrySet().equals(l3Var.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo26240g(i).equals(l3Var.mo26240g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f9373m.equals(l3Var.f9373m);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry mo26240g(int i) {
        return (Map.Entry) this.f9372l.get(i);
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = mo26244k(comparable);
        if (k >= 0) {
            return ((C4411f3) this.f9372l.get(k)).getValue();
        }
        return this.f9373m.get(comparable);
    }

    public final int hashCode() {
        int b = mo26233b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((C4411f3) this.f9372l.get(i2)).hashCode();
        }
        return this.f9373m.size() > 0 ? i + this.f9373m.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo26243j() {
        return this.f9374n;
    }

    /* renamed from: k */
    public final int mo26244k(Comparable comparable) {
        int size = this.f9372l.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C4411f3) this.f9372l.get(size)).mo25958c());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C4411f3) this.f9372l.get(i2)).mo25958c());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: l */
    public final Object mo26245l(int i) {
        mo26247n();
        Object value = ((C4411f3) this.f9372l.remove(i)).getValue();
        if (!this.f9373m.isEmpty()) {
            Iterator it = mo26246m().entrySet().iterator();
            List list = this.f9372l;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C4411f3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final SortedMap mo26246m() {
        mo26247n();
        if (this.f9373m.isEmpty() && !(this.f9373m instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9373m = treeMap;
            this.f9376p = treeMap.descendingMap();
        }
        return (SortedMap) this.f9373m;
    }

    /* renamed from: n */
    public final void mo26247n() {
        if (this.f9374n) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object remove(Object obj) {
        mo26247n();
        Comparable comparable = (Comparable) obj;
        int k = mo26244k(comparable);
        if (k >= 0) {
            return mo26245l(k);
        }
        if (this.f9373m.isEmpty()) {
            return null;
        }
        return this.f9373m.remove(comparable);
    }

    public final int size() {
        return this.f9372l.size() + this.f9373m.size();
    }
}
