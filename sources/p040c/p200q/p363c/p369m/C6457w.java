package p040c.p200q.p363c.p369m;

import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p040c.p200q.p363c.p389r.C6736a;
import p040c.p200q.p363c.p389r.C6737b;
import p040c.p200q.p363c.p389r.C6738c;
import p040c.p200q.p363c.p389r.C6739d;

/* renamed from: c.q.c.m.w */
/* compiled from: EventBus */
public class C6457w implements C6739d, C6738c {
    @GuardedBy("this")

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<C6737b<Object>, Executor>> f12149a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b */
    public Queue<C6736a<?>> f12150b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f12151c;

    public C6457w(Executor executor) {
        this.f12151c = executor;
    }

    /* renamed from: a */
    public <T> void mo30593a(Class<T> cls, C6737b<? super T> bVar) {
        mo30594b(cls, this.f12151c, bVar);
    }

    /* renamed from: b */
    public synchronized <T> void mo30594b(Class<T> cls, Executor executor, C6737b<? super T> bVar) {
        C6423a0.m17952b(cls);
        C6423a0.m17952b(bVar);
        C6423a0.m17952b(executor);
        if (!this.f12149a.containsKey(cls)) {
            this.f12149a.put(cls, new ConcurrentHashMap());
        }
        this.f12149a.get(cls).put(bVar, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new p040c.p200q.p363c.p369m.C6432h(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = mo30596e(r5).iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30534c(p040c.p200q.p363c.p389r.C6736a<?> r5) {
        /*
            r4 = this;
            p040c.p200q.p363c.p369m.C6423a0.m17952b(r5)
            monitor-enter(r4)
            java.util.Queue<c.q.c.r.a<?>> r0 = r4.f12150b     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<c.q.c.r.a<?>> r0 = r4.f12150b     // Catch:{ all -> 0x0034 }
            r0.add(r5)     // Catch:{ all -> 0x0034 }
            monitor-exit(r4)     // Catch:{ all -> 0x0034 }
            return
        L_0x000f:
            monitor-exit(r4)     // Catch:{ all -> 0x0034 }
            java.util.Set r0 = r4.mo30596e(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            c.q.c.m.h r3 = new c.q.c.m.h
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0018
        L_0x0033:
            return
        L_0x0034:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0034 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p369m.C6457w.mo30534c(c.q.c.r.a):void");
    }

    /* renamed from: d */
    public void mo30595d() {
        Queue<C6736a<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.f12150b != null) {
                Queue<C6736a<?>> queue2 = this.f12150b;
                this.f12150b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (C6736a c : queue) {
                mo30534c(c);
            }
        }
    }

    /* renamed from: e */
    public final synchronized Set<Map.Entry<C6737b<Object>, Executor>> mo30596e(C6736a<?> aVar) {
        Map map;
        map = this.f12149a.get(aVar.mo31407b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }
}
