package com.google.android.gms.internal.p527firebaseauthapi;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p040c.p200q.p201a.p264c.p294g.p333g.C4439g4;
import p040c.p200q.p201a.p264c.p294g.p333g.C4466h4;
import p040c.p200q.p201a.p264c.p294g.p333g.C4493i4;
import p040c.p200q.p201a.p264c.p294g.p333g.C4520j4;
import p040c.p200q.p201a.p264c.p294g.p333g.C4540jo;
import p040c.p200q.p201a.p264c.p294g.p333g.C4547k4;
import p040c.p200q.p201a.p264c.p294g.p333g.C4673om;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzal */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzal extends zzai implements List, RandomAccess {
    public static final C4547k4 zza = new C4439g4(C4493i4.f9287l, 0);

    public static zzal zzg() {
        return C4493i4.f9287l;
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
                        if (C4673om.m12741a(get(i), list.get(i))) {
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
                            if (!C4673om.m12741a(it.next(), it2.next())) {
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

    public final C4520j4 zzd() {
        return listIterator(0);
    }

    /* renamed from: zzf */
    public zzal subList(int i, int i2) {
        C4540jo.m12245c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C4493i4.f9287l;
        }
        return new C4466h4(this, i, i3);
    }

    /* renamed from: zzh */
    public final C4547k4 listIterator(int i) {
        C4540jo.m12244b(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new C4439g4(this, i);
    }
}
