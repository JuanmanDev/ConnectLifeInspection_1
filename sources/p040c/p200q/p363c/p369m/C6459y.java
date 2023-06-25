package p040c.p200q.p363c.p369m;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p040c.p200q.p363c.p393u.C6757b;

/* renamed from: c.q.c.m.y */
/* compiled from: LazySet */
public class C6459y<T> implements C6757b<Set<T>> {

    /* renamed from: a */
    public volatile Set<C6757b<T>> f12155a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    public volatile Set<T> f12156b = null;

    public C6459y(Collection<C6757b<T>> collection) {
        this.f12155a.addAll(collection);
    }

    /* renamed from: b */
    public static C6459y<?> m18058b(Collection<C6757b<?>> collection) {
        return new C6459y<>((Set) collection);
    }

    /* renamed from: a */
    public synchronized void mo30597a(C6757b<T> bVar) {
        if (this.f12156b == null) {
            this.f12155a.add(bVar);
        } else {
            this.f12156b.add(bVar.get());
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f12156b == null) {
            synchronized (this) {
                if (this.f12156b == null) {
                    this.f12156b = Collections.newSetFromMap(new ConcurrentHashMap());
                    mo30599d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f12156b);
    }

    /* renamed from: d */
    public final synchronized void mo30599d() {
        for (C6757b<T> bVar : this.f12155a) {
            this.f12156b.add(bVar.get());
        }
        this.f12155a = null;
    }
}
