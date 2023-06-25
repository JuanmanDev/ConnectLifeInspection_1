package p040c.p200q.p405d;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.q.d.c */
/* compiled from: AbstractProtobufList */
public abstract class C6891c<E> extends AbstractList<E> implements C6999y.C7008i<E> {

    /* renamed from: e */
    public boolean f13184e = true;

    /* renamed from: N */
    public boolean mo31823N() {
        return this.f13184e;
    }

    public boolean add(E e) {
        mo31825c();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo31825c();
        return super.addAll(collection);
    }

    /* renamed from: c */
    public void mo31825c() {
        if (!this.f13184e) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo31825c();
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

    /* renamed from: m */
    public final void mo31828m() {
        this.f13184e = false;
    }

    public boolean remove(Object obj) {
        mo31825c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo31825c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo31825c();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo31825c();
        return super.addAll(i, collection);
    }
}
