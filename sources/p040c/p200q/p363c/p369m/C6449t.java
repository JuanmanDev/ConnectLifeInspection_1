package p040c.p200q.p363c.p369m;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p363c.p384p.C6706a;
import p040c.p200q.p363c.p389r.C6738c;
import p040c.p200q.p363c.p389r.C6739d;
import p040c.p200q.p363c.p393u.C6755a;
import p040c.p200q.p363c.p393u.C6757b;

/* renamed from: c.q.c.m.t */
/* compiled from: ComponentRuntime */
public class C6449t extends C6438n implements C6706a {

    /* renamed from: h */
    public static final C6757b<Set<Object>> f12129h = C6437m.f12110a;

    /* renamed from: a */
    public final Map<C6439o<?>, C6757b<?>> f12130a;

    /* renamed from: b */
    public final Map<Class<?>, C6757b<?>> f12131b;

    /* renamed from: c */
    public final Map<Class<?>, C6459y<?>> f12132c;

    /* renamed from: d */
    public final List<C6757b<ComponentRegistrar>> f12133d;

    /* renamed from: e */
    public final C6457w f12134e;

    /* renamed from: f */
    public final AtomicReference<Boolean> f12135f;

    /* renamed from: g */
    public final C6448s f12136g;

    /* renamed from: c.q.c.m.t$b */
    /* compiled from: ComponentRuntime */
    public static final class C6451b {

        /* renamed from: a */
        public final Executor f12137a;

        /* renamed from: b */
        public final List<C6757b<ComponentRegistrar>> f12138b = new ArrayList();

        /* renamed from: c */
        public final List<C6439o<?>> f12139c = new ArrayList();

        /* renamed from: d */
        public C6448s f12140d = C6448s.f12128a;

        public C6451b(Executor executor) {
            this.f12137a = executor;
        }

        /* renamed from: e */
        public static /* synthetic */ ComponentRegistrar m18023e(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: a */
        public C6451b mo30571a(C6439o<?> oVar) {
            this.f12139c.add(oVar);
            return this;
        }

        /* renamed from: b */
        public C6451b mo30572b(ComponentRegistrar componentRegistrar) {
            this.f12138b.add(new C6428d(componentRegistrar));
            return this;
        }

        /* renamed from: c */
        public C6451b mo30573c(Collection<C6757b<ComponentRegistrar>> collection) {
            this.f12138b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public C6449t mo30574d() {
            return new C6449t(this.f12137a, this.f12138b, this.f12139c, this.f12140d);
        }

        /* renamed from: f */
        public C6451b mo30575f(C6448s sVar) {
            this.f12140d = sVar;
            return this;
        }
    }

    /* renamed from: f */
    public static C6451b m18008f(Executor executor) {
        return new C6451b(executor);
    }

    /* renamed from: j */
    public static <T> List<T> m18009j(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized <T> C6757b<T> mo30530b(Class<T> cls) {
        C6423a0.m17953c(cls, "Null interface requested.");
        return this.f12131b.get(cls);
    }

    /* renamed from: c */
    public synchronized <T> C6757b<Set<T>> mo30531c(Class<T> cls) {
        C6459y yVar = this.f12132c.get(cls);
        if (yVar != null) {
            return yVar;
        }
        return f12129h;
    }

    /* renamed from: e */
    public <T> C6755a<T> mo30533e(Class<T> cls) {
        C6757b<T> b = mo30530b(cls);
        if (b == null) {
            return C6460z.m18062b();
        }
        if (b instanceof C6460z) {
            return (C6460z) b;
        }
        return C6460z.m18066f(b);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30563g(java.util.List<p040c.p200q.p363c.p369m.C6439o<?>> r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r5)
            java.util.List<c.q.c.u.b<com.google.firebase.components.ComponentRegistrar>> r1 = r5.f12133d     // Catch:{ all -> 0x0098 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0098 }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0098 }
            c.q.c.u.b r2 = (p040c.p200q.p363c.p393u.C6757b) r2     // Catch:{ all -> 0x0098 }
            java.lang.Object r2 = r2.get()     // Catch:{ InvalidRegistrarException -> 0x002d }
            com.google.firebase.components.ComponentRegistrar r2 = (com.google.firebase.components.ComponentRegistrar) r2     // Catch:{ InvalidRegistrarException -> 0x002d }
            if (r2 == 0) goto L_0x000c
            c.q.c.m.s r3 = r5.f12136g     // Catch:{ InvalidRegistrarException -> 0x002d }
            java.util.List r2 = r3.mo30539a(r2)     // Catch:{ InvalidRegistrarException -> 0x002d }
            r6.addAll(r2)     // Catch:{ InvalidRegistrarException -> 0x002d }
            r1.remove()     // Catch:{ InvalidRegistrarException -> 0x002d }
            goto L_0x000c
        L_0x002d:
            r1.remove()     // Catch:{ all -> 0x0098 }
            goto L_0x000c
        L_0x0031:
            java.util.Map<c.q.c.m.o<?>, c.q.c.u.b<?>> r1 = r5.f12130a     // Catch:{ all -> 0x0098 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x003d
            p040c.p200q.p363c.p369m.C6452u.m18029a(r6)     // Catch:{ all -> 0x0098 }
            goto L_0x004e
        L_0x003d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0098 }
            java.util.Map<c.q.c.m.o<?>, c.q.c.u.b<?>> r2 = r5.f12130a     // Catch:{ all -> 0x0098 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0098 }
            r1.<init>(r2)     // Catch:{ all -> 0x0098 }
            r1.addAll(r6)     // Catch:{ all -> 0x0098 }
            p040c.p200q.p363c.p369m.C6452u.m18029a(r1)     // Catch:{ all -> 0x0098 }
        L_0x004e:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0098 }
        L_0x0052:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0098 }
            c.q.c.m.o r2 = (p040c.p200q.p363c.p369m.C6439o) r2     // Catch:{ all -> 0x0098 }
            c.q.c.m.x r3 = new c.q.c.m.x     // Catch:{ all -> 0x0098 }
            c.q.c.m.e r4 = new c.q.c.m.e     // Catch:{ all -> 0x0098 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0098 }
            r3.<init>(r4)     // Catch:{ all -> 0x0098 }
            java.util.Map<c.q.c.m.o<?>, c.q.c.u.b<?>> r4 = r5.f12130a     // Catch:{ all -> 0x0098 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0098 }
            goto L_0x0052
        L_0x006e:
            java.util.List r6 = r5.mo30569p(r6)     // Catch:{ all -> 0x0098 }
            r0.addAll(r6)     // Catch:{ all -> 0x0098 }
            java.util.List r6 = r5.mo30570q()     // Catch:{ all -> 0x0098 }
            r0.addAll(r6)     // Catch:{ all -> 0x0098 }
            r5.mo30568o()     // Catch:{ all -> 0x0098 }
            monitor-exit(r5)     // Catch:{ all -> 0x0098 }
            java.util.Iterator r6 = r0.iterator()
        L_0x0084:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r6.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0084
        L_0x0094:
            r5.mo30567n()
            return
        L_0x0098:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0098 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p369m.C6449t.mo30563g(java.util.List):void");
    }

    /* renamed from: h */
    public final void mo30564h(Map<C6439o<?>, C6757b<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            C6439o oVar = (C6439o) next.getKey();
            C6757b bVar = (C6757b) next.getValue();
            if (oVar.mo30545j() || (oVar.mo30546k() && z)) {
                bVar.get();
            }
        }
        this.f12134e.mo30595d();
    }

    /* renamed from: i */
    public void mo30565i(boolean z) {
        HashMap hashMap;
        if (this.f12135f.compareAndSet((Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f12130a);
            }
            mo30564h(hashMap, z);
        }
    }

    /* renamed from: k */
    public /* synthetic */ Object mo30566k(C6439o oVar) {
        return oVar.mo30541d().mo30442a(new C6425b0(oVar, this));
    }

    /* renamed from: n */
    public final void mo30567n() {
        Boolean bool = this.f12135f.get();
        if (bool != null) {
            mo30564h(this.f12130a, bool.booleanValue());
        }
    }

    /* renamed from: o */
    public final void mo30568o() {
        for (C6439o next : this.f12130a.keySet()) {
            Iterator<C6456v> it = next.mo30540c().iterator();
            while (true) {
                if (it.hasNext()) {
                    C6456v next2 = it.next();
                    if (next2.mo30590g() && !this.f12132c.containsKey(next2.mo30585c())) {
                        this.f12132c.put(next2.mo30585c(), C6459y.m18058b(Collections.emptySet()));
                    } else if (this.f12131b.containsKey(next2.mo30585c())) {
                        continue;
                    } else if (next2.mo30589f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo30585c()}));
                    } else if (!next2.mo30590g()) {
                        this.f12131b.put(next2.mo30585c(), C6460z.m18062b());
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public final List<Runnable> mo30569p(List<C6439o<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C6439o next : list) {
            if (next.mo30547l()) {
                C6757b bVar = this.f12130a.get(next);
                for (Class cls : next.mo30543f()) {
                    if (!this.f12131b.containsKey(cls)) {
                        this.f12131b.put(cls, bVar);
                    } else {
                        arrayList.add(new C6430f((C6460z) this.f12131b.get(cls), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public final List<Runnable> mo30570q() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f12130a.entrySet()) {
            C6439o oVar = (C6439o) next.getKey();
            if (!oVar.mo30547l()) {
                C6757b bVar = (C6757b) next.getValue();
                for (Class cls : oVar.mo30543f()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f12132c.containsKey(entry.getKey())) {
                this.f12132c.put((Class) entry.getKey(), C6459y.m18058b((Collection) entry.getValue()));
            } else {
                C6459y yVar = this.f12132c.get(entry.getKey());
                for (C6757b gVar : (Set) entry.getValue()) {
                    arrayList.add(new C6431g(yVar, gVar));
                }
            }
        }
        return arrayList;
    }

    public C6449t(Executor executor, Iterable<C6757b<ComponentRegistrar>> iterable, Collection<C6439o<?>> collection, C6448s sVar) {
        this.f12130a = new HashMap();
        this.f12131b = new HashMap();
        this.f12132c = new HashMap();
        this.f12135f = new AtomicReference<>();
        this.f12134e = new C6457w(executor);
        this.f12136g = sVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6439o.m17973o(this.f12134e, C6457w.class, C6739d.class, C6738c.class));
        arrayList.add(C6439o.m17973o(this, C6706a.class, new Class[0]));
        for (C6439o next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f12133d = m18009j(iterable);
        mo30563g(arrayList);
    }
}
