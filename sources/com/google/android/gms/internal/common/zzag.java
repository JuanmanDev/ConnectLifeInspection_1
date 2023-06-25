package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jspecify.nullness.NullMarked;
import p040c.p200q.p201a.p264c.p294g.p300f.C3646d;
import p040c.p200q.p201a.p264c.p294g.p300f.C3647e;
import p040c.p200q.p201a.p264c.p294g.p300f.C3648f;
import p040c.p200q.p201a.p264c.p294g.p300f.C3649g;
import p040c.p200q.p201a.p264c.p294g.p300f.C3650h;
import p040c.p200q.p201a.p264c.p294g.p300f.C3651i;
import p040c.p200q.p201a.p264c.p294g.p300f.C3652j;
import p040c.p200q.p201a.p264c.p294g.p300f.C3658p;
import p040c.p200q.p201a.p264c.p294g.p300f.C3659q;

@NullMarked
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class zzag extends zzac implements List, RandomAccess {
    public static final C3652j zza = new C3647e(C3650h.f6597m, 0);

    public static zzag zzi(Object[] objArr, int i) {
        if (i == 0) {
            return C3650h.f6597m;
        }
        return new C3650h(objArr, i);
    }

    public static zzag zzj(Iterable iterable) {
        if (iterable == null) {
            throw null;
        } else if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        } else {
            Iterator it = iterable.iterator();
            if (!it.hasNext()) {
                return C3650h.f6597m;
            }
            Object next = it.next();
            if (!it.hasNext()) {
                return zzm(next);
            }
            C3646d dVar = new C3646d(4);
            dVar.mo20912c(next);
            dVar.mo20913d(it);
            dVar.f6592c = true;
            return zzi(dVar.f6590a, dVar.f6591b);
        }
    }

    public static zzag zzk(Collection collection) {
        if (collection instanceof zzac) {
            zzag zzd = ((zzac) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        C3649g.m9191a(array2, length);
        return zzi(array2, length);
    }

    public static zzag zzl() {
        return C3650h.f6597m;
    }

    public static zzag zzm(Object obj) {
        Object[] objArr = {obj};
        C3649g.m9191a(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzag zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C3649g.m9191a(objArr, 2);
        return zzi(objArr, 2);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C3658p.m9199a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C3658p.m9199a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Deprecated
    public final zzag zzd() {
        return this;
    }

    public final C3651i zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzag subList(int i, int i2) {
        C3659q.m9202c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C3650h.f6597m;
        }
        return new C3648f(this, i, i3);
    }

    /* renamed from: zzo */
    public final C3652j listIterator(int i) {
        C3659q.m9201b(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new C3647e(this, i);
    }
}
