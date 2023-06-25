package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.q.a.c.g.i.f7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C5062f7 extends AbstractList implements C5354y8 {

    /* renamed from: e */
    public boolean f9891e = true;

    /* renamed from: a */
    public final void mo27229a() {
        this.f9891e = false;
    }

    public boolean add(Object obj) {
        mo27231c();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo27231c();
        return super.addAll(i, collection);
    }

    /* renamed from: b */
    public final boolean mo27230b() {
        return this.f9891e;
    }

    /* renamed from: c */
    public final void mo27231c() {
        if (!this.f9891e) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo27231c();
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
        mo27231c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo27231c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo27231c();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection collection) {
        mo27231c();
        return super.addAll(collection);
    }
}
