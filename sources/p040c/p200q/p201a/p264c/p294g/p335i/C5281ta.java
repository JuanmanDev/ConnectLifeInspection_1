package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: c.q.a.c.g.i.ta */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C5281ta extends AbstractMap {

    /* renamed from: e */
    public final int f10154e;

    /* renamed from: l */
    public List f10155l = Collections.emptyList();

    /* renamed from: m */
    public Map f10156m = Collections.emptyMap();

    /* renamed from: n */
    public boolean f10157n;

    /* renamed from: o */
    public volatile C5251ra f10158o;

    /* renamed from: p */
    public Map f10159p = Collections.emptyMap();

    public /* synthetic */ C5281ta(int i, C5266sa saVar) {
        this.f10154e = i;
    }

    /* renamed from: a */
    public void mo27352a() {
        Map map;
        Map map2;
        if (!this.f10157n) {
            if (this.f10156m.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f10156m);
            }
            this.f10156m = map;
            if (this.f10159p.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f10159p);
            }
            this.f10159p = map2;
            this.f10157n = true;
        }
    }

    /* renamed from: b */
    public final int mo27728b() {
        return this.f10155l.size();
    }

    /* renamed from: c */
    public final Iterable mo27729c() {
        if (this.f10156m.isEmpty()) {
            return C5176ma.m14496a();
        }
        return this.f10156m.entrySet();
    }

    public final void clear() {
        mo27742n();
        if (!this.f10155l.isEmpty()) {
            this.f10155l.clear();
        }
        if (!this.f10156m.isEmpty()) {
            this.f10156m.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo27739k(comparable) >= 0 || this.f10156m.containsKey(comparable);
    }

    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        mo27742n();
        int k = mo27739k(comparable);
        if (k >= 0) {
            return ((C5191na) this.f10155l.get(k)).setValue(obj);
        }
        mo27742n();
        if (this.f10155l.isEmpty() && !(this.f10155l instanceof ArrayList)) {
            this.f10155l = new ArrayList(this.f10154e);
        }
        int i = -(k + 1);
        if (i >= this.f10154e) {
            return mo27741m().put(comparable, obj);
        }
        int size = this.f10155l.size();
        int i2 = this.f10154e;
        if (size == i2) {
            C5191na naVar = (C5191na) this.f10155l.remove(i2 - 1);
            mo27741m().put(naVar.mo27461c(), naVar.getValue());
        }
        this.f10155l.add(i, new C5191na(this, comparable, obj));
        return null;
    }

    public final Set entrySet() {
        if (this.f10158o == null) {
            this.f10158o = new C5251ra(this, (C5236qa) null);
        }
        return this.f10158o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5281ta)) {
            return super.equals(obj);
        }
        C5281ta taVar = (C5281ta) obj;
        int size = size();
        if (size != taVar.size()) {
            return false;
        }
        int b = mo27728b();
        if (b != taVar.mo27728b()) {
            return entrySet().equals(taVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo27735g(i).equals(taVar.mo27735g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f10156m.equals(taVar.f10156m);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry mo27735g(int i) {
        return (Map.Entry) this.f10155l.get(i);
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = mo27739k(comparable);
        if (k >= 0) {
            return ((C5191na) this.f10155l.get(k)).getValue();
        }
        return this.f10156m.get(comparable);
    }

    public final int hashCode() {
        int b = mo27728b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((C5191na) this.f10155l.get(i2)).hashCode();
        }
        return this.f10156m.size() > 0 ? i + this.f10156m.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo27738j() {
        return this.f10157n;
    }

    /* renamed from: k */
    public final int mo27739k(Comparable comparable) {
        int size = this.f10155l.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C5191na) this.f10155l.get(size)).mo27461c());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C5191na) this.f10155l.get(i2)).mo27461c());
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
    public final Object mo27740l(int i) {
        mo27742n();
        Object value = ((C5191na) this.f10155l.remove(i)).getValue();
        if (!this.f10156m.isEmpty()) {
            Iterator it = mo27741m().entrySet().iterator();
            List list = this.f10155l;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C5191na(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final SortedMap mo27741m() {
        mo27742n();
        if (this.f10156m.isEmpty() && !(this.f10156m instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10156m = treeMap;
            this.f10159p = treeMap.descendingMap();
        }
        return (SortedMap) this.f10156m;
    }

    /* renamed from: n */
    public final void mo27742n() {
        if (this.f10157n) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object remove(Object obj) {
        mo27742n();
        Comparable comparable = (Comparable) obj;
        int k = mo27739k(comparable);
        if (k >= 0) {
            return mo27740l(k);
        }
        if (this.f10156m.isEmpty()) {
            return null;
        }
        return this.f10156m.remove(comparable);
    }

    public final int size() {
        return this.f10155l.size() + this.f10156m.size();
    }
}
