package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.g.u */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4808u extends AbstractList implements C4679p1 {

    /* renamed from: e */
    public boolean f9651e = true;

    /* renamed from: a */
    public final void mo26496a() {
        this.f9651e = false;
    }

    public boolean add(Object obj) {
        mo26681c();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo26681c();
        return super.addAll(i, collection);
    }

    /* renamed from: b */
    public final boolean mo26497b() {
        return this.f9651e;
    }

    /* renamed from: c */
    public final void mo26681c() {
        if (!this.f9651e) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo26681c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        mo26681c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo26681c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo26681c();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection collection) {
        mo26681c();
        return super.addAll(collection);
    }
}
