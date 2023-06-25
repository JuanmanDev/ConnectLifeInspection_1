package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.p084j.C1646h;
import p040c.p077d.p078a.p081k.p084j.p086b0.C1632a;
import p040c.p077d.p078a.p101o.C1913g;
import p040c.p077d.p078a.p105q.C1942d;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.p106k.C1952a;
import p040c.p077d.p078a.p105q.p106k.C1961c;

/* renamed from: c.d.a.k.j.l */
/* compiled from: EngineJob */
public class C1669l<R> implements C1646h.C1648b<R>, C1952a.C1958f {

    /* renamed from: H */
    public static final C1672c f1136H = new C1672c();

    /* renamed from: A */
    public DataSource f1137A;

    /* renamed from: B */
    public boolean f1138B;

    /* renamed from: C */
    public GlideException f1139C;

    /* renamed from: D */
    public boolean f1140D;

    /* renamed from: E */
    public C1678p<?> f1141E;

    /* renamed from: F */
    public C1646h<R> f1142F;

    /* renamed from: G */
    public volatile boolean f1143G;

    /* renamed from: e */
    public final C1674e f1144e;

    /* renamed from: l */
    public final C1961c f1145l;

    /* renamed from: m */
    public final Pools.Pool<C1669l<?>> f1146m;

    /* renamed from: n */
    public final C1672c f1147n;

    /* renamed from: o */
    public final C1675m f1148o;

    /* renamed from: p */
    public final C1632a f1149p;

    /* renamed from: q */
    public final C1632a f1150q;

    /* renamed from: r */
    public final C1632a f1151r;

    /* renamed from: s */
    public final C1632a f1152s;

    /* renamed from: t */
    public final AtomicInteger f1153t;

    /* renamed from: u */
    public C1567c f1154u;

    /* renamed from: v */
    public boolean f1155v;

    /* renamed from: w */
    public boolean f1156w;

    /* renamed from: x */
    public boolean f1157x;

    /* renamed from: y */
    public boolean f1158y;

    /* renamed from: z */
    public C1685u<?> f1159z;

    /* renamed from: c.d.a.k.j.l$a */
    /* compiled from: EngineJob */
    public class C1670a implements Runnable {

        /* renamed from: e */
        public final C1913g f1160e;

        public C1670a(C1913g gVar) {
            this.f1160e = gVar;
        }

        public void run() {
            synchronized (C1669l.this) {
                if (C1669l.this.f1144e.mo15857f(this.f1160e)) {
                    C1669l.this.mo15836e(this.f1160e);
                }
                C1669l.this.mo15839h();
            }
        }
    }

    /* renamed from: c.d.a.k.j.l$b */
    /* compiled from: EngineJob */
    public class C1671b implements Runnable {

        /* renamed from: e */
        public final C1913g f1162e;

        public C1671b(C1913g gVar) {
            this.f1162e = gVar;
        }

        public void run() {
            synchronized (C1669l.this) {
                if (C1669l.this.f1144e.mo15857f(this.f1162e)) {
                    C1669l.this.f1141E.mo15865a();
                    C1669l.this.mo15837f(this.f1162e);
                    C1669l.this.mo15848r(this.f1162e);
                }
                C1669l.this.mo15839h();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.j.l$c */
    /* compiled from: EngineJob */
    public static class C1672c {
        /* renamed from: a */
        public <R> C1678p<R> mo15852a(C1685u<R> uVar, boolean z) {
            return new C1678p<>(uVar, z, true);
        }
    }

    /* renamed from: c.d.a.k.j.l$d */
    /* compiled from: EngineJob */
    public static final class C1673d {

        /* renamed from: a */
        public final C1913g f1164a;

        /* renamed from: b */
        public final Executor f1165b;

        public C1673d(C1913g gVar, Executor executor) {
            this.f1164a = gVar;
            this.f1165b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1673d) {
                return this.f1164a.equals(((C1673d) obj).f1164a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1164a.hashCode();
        }
    }

    /* renamed from: c.d.a.k.j.l$e */
    /* compiled from: EngineJob */
    public static final class C1674e implements Iterable<C1673d> {

        /* renamed from: e */
        public final List<C1673d> f1166e;

        public C1674e() {
            this(new ArrayList(2));
        }

        /* renamed from: k */
        public static C1673d m1593k(C1913g gVar) {
            return new C1673d(gVar, C1942d.m2544a());
        }

        /* renamed from: c */
        public void mo15855c(C1913g gVar, Executor executor) {
            this.f1166e.add(new C1673d(gVar, executor));
        }

        public void clear() {
            this.f1166e.clear();
        }

        /* renamed from: f */
        public boolean mo15857f(C1913g gVar) {
            return this.f1166e.contains(m1593k(gVar));
        }

        /* renamed from: g */
        public C1674e mo15858g() {
            return new C1674e(new ArrayList(this.f1166e));
        }

        public boolean isEmpty() {
            return this.f1166e.isEmpty();
        }

        @NonNull
        public Iterator<C1673d> iterator() {
            return this.f1166e.iterator();
        }

        /* renamed from: l */
        public void mo15861l(C1913g gVar) {
            this.f1166e.remove(m1593k(gVar));
        }

        public int size() {
            return this.f1166e.size();
        }

        public C1674e(List<C1673d> list) {
            this.f1166e = list;
        }
    }

    public C1669l(C1632a aVar, C1632a aVar2, C1632a aVar3, C1632a aVar4, C1675m mVar, Pools.Pool<C1669l<?>> pool) {
        this(aVar, aVar2, aVar3, aVar4, mVar, pool, f1136H);
    }

    /* renamed from: a */
    public void mo15800a(GlideException glideException) {
        synchronized (this) {
            this.f1139C = glideException;
        }
        mo15844n();
    }

    /* renamed from: b */
    public void mo15801b(C1685u<R> uVar, DataSource dataSource) {
        synchronized (this) {
            this.f1159z = uVar;
            this.f1137A = dataSource;
        }
        mo15845o();
    }

    /* renamed from: c */
    public void mo15802c(C1646h<?> hVar) {
        mo15840j().execute(hVar);
    }

    /* renamed from: d */
    public synchronized void mo15835d(C1913g gVar, Executor executor) {
        this.f1145l.mo16455c();
        this.f1144e.mo15855c(gVar, executor);
        boolean z = true;
        if (this.f1138B) {
            mo15841k(1);
            executor.execute(new C1671b(gVar));
        } else if (this.f1140D) {
            mo15841k(1);
            executor.execute(new C1670a(gVar));
        } else {
            if (this.f1143G) {
                z = false;
            }
            C1949i.m2560a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* renamed from: e */
    public synchronized void mo15836e(C1913g gVar) {
        try {
            gVar.mo16344a(this.f1139C);
        } catch (Throwable th) {
            throw new C1631b(th);
        }
    }

    /* renamed from: f */
    public synchronized void mo15837f(C1913g gVar) {
        try {
            gVar.mo16345b(this.f1141E, this.f1137A);
        } catch (Throwable th) {
            throw new C1631b(th);
        }
    }

    /* renamed from: g */
    public void mo15838g() {
        if (!mo15843m()) {
            this.f1143G = true;
            this.f1142F.mo15783d();
            this.f1148o.mo15823c(this, this.f1154u);
        }
    }

    /* renamed from: h */
    public synchronized void mo15839h() {
        this.f1145l.mo16455c();
        C1949i.m2560a(mo15843m(), "Not yet complete!");
        int decrementAndGet = this.f1153t.decrementAndGet();
        C1949i.m2560a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            if (this.f1141E != null) {
                this.f1141E.mo15871g();
            }
            mo15847q();
        }
    }

    @NonNull
    /* renamed from: i */
    public C1961c mo15723i() {
        return this.f1145l;
    }

    /* renamed from: j */
    public final C1632a mo15840j() {
        if (this.f1156w) {
            return this.f1151r;
        }
        return this.f1157x ? this.f1152s : this.f1150q;
    }

    /* renamed from: k */
    public synchronized void mo15841k(int i) {
        C1949i.m2560a(mo15843m(), "Not yet complete!");
        if (this.f1153t.getAndAdd(i) == 0 && this.f1141E != null) {
            this.f1141E.mo15865a();
        }
    }

    @VisibleForTesting
    /* renamed from: l */
    public synchronized C1669l<R> mo15842l(C1567c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f1154u = cVar;
        this.f1155v = z;
        this.f1156w = z2;
        this.f1157x = z3;
        this.f1158y = z4;
        return this;
    }

    /* renamed from: m */
    public final boolean mo15843m() {
        return this.f1140D || this.f1138B || this.f1143G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f1148o.mo15822b(r4, r1, (p040c.p077d.p078a.p081k.p084j.C1678p<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f1165b.execute(new p040c.p077d.p078a.p081k.p084j.C1669l.C1670a(r4, r1.f1164a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo15839h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15844n() {
        /*
            r4 = this;
            monitor-enter(r4)
            c.d.a.q.k.c r0 = r4.f1145l     // Catch:{ all -> 0x0066 }
            r0.mo16455c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f1143G     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.mo15847q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            c.d.a.k.j.l$e r0 = r4.f1144e     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f1140D     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f1140D = r0     // Catch:{ all -> 0x0066 }
            c.d.a.k.c r1 = r4.f1154u     // Catch:{ all -> 0x0066 }
            c.d.a.k.j.l$e r2 = r4.f1144e     // Catch:{ all -> 0x0066 }
            c.d.a.k.j.l$e r2 = r2.mo15858g()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo15841k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            c.d.a.k.j.m r0 = r4.f1148o
            r3 = 0
            r0.mo15822b(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            c.d.a.k.j.l$d r1 = (p040c.p077d.p078a.p081k.p084j.C1669l.C1673d) r1
            java.util.concurrent.Executor r2 = r1.f1165b
            c.d.a.k.j.l$a r3 = new c.d.a.k.j.l$a
            c.d.a.o.g r1 = r1.f1164a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo15839h()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p084j.C1669l.mo15844n():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r4.f1148o.mo15822b(r4, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r0.hasNext() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r1 = r0.next();
        r1.f1165b.execute(new p040c.p077d.p078a.p081k.p084j.C1669l.C1671b(r4, r1.f1164a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        mo15839h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15845o() {
        /*
            r4 = this;
            monitor-enter(r4)
            c.d.a.q.k.c r0 = r4.f1145l     // Catch:{ all -> 0x0078 }
            r0.mo16455c()     // Catch:{ all -> 0x0078 }
            boolean r0 = r4.f1143G     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0014
            c.d.a.k.j.u<?> r0 = r4.f1159z     // Catch:{ all -> 0x0078 }
            r0.mo15867c()     // Catch:{ all -> 0x0078 }
            r4.mo15847q()     // Catch:{ all -> 0x0078 }
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            return
        L_0x0014:
            c.d.a.k.j.l$e r0 = r4.f1144e     // Catch:{ all -> 0x0078 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0070
            boolean r0 = r4.f1138B     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0068
            c.d.a.k.j.l$c r0 = r4.f1147n     // Catch:{ all -> 0x0078 }
            c.d.a.k.j.u<?> r1 = r4.f1159z     // Catch:{ all -> 0x0078 }
            boolean r2 = r4.f1155v     // Catch:{ all -> 0x0078 }
            c.d.a.k.j.p r0 = r0.mo15852a(r1, r2)     // Catch:{ all -> 0x0078 }
            r4.f1141E = r0     // Catch:{ all -> 0x0078 }
            r0 = 1
            r4.f1138B = r0     // Catch:{ all -> 0x0078 }
            c.d.a.k.j.l$e r1 = r4.f1144e     // Catch:{ all -> 0x0078 }
            c.d.a.k.j.l$e r1 = r1.mo15858g()     // Catch:{ all -> 0x0078 }
            int r2 = r1.size()     // Catch:{ all -> 0x0078 }
            int r2 = r2 + r0
            r4.mo15841k(r2)     // Catch:{ all -> 0x0078 }
            c.d.a.k.c r0 = r4.f1154u     // Catch:{ all -> 0x0078 }
            c.d.a.k.j.p<?> r2 = r4.f1141E     // Catch:{ all -> 0x0078 }
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            c.d.a.k.j.m r3 = r4.f1148o
            r3.mo15822b(r4, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            c.d.a.k.j.l$d r1 = (p040c.p077d.p078a.p081k.p084j.C1669l.C1673d) r1
            java.util.concurrent.Executor r2 = r1.f1165b
            c.d.a.k.j.l$b r3 = new c.d.a.k.j.l$b
            c.d.a.o.g r1 = r1.f1164a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004b
        L_0x0064:
            r4.mo15839h()
            return
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p084j.C1669l.mo15845o():void");
    }

    /* renamed from: p */
    public boolean mo15846p() {
        return this.f1158y;
    }

    /* renamed from: q */
    public final synchronized void mo15847q() {
        if (this.f1154u != null) {
            this.f1144e.clear();
            this.f1154u = null;
            this.f1141E = null;
            this.f1159z = null;
            this.f1140D = false;
            this.f1143G = false;
            this.f1138B = false;
            this.f1142F.mo15775C(false);
            this.f1142F = null;
            this.f1139C = null;
            this.f1137A = null;
            this.f1146m.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: r */
    public synchronized void mo15848r(C1913g gVar) {
        boolean z;
        this.f1145l.mo16455c();
        this.f1144e.mo15861l(gVar);
        if (this.f1144e.isEmpty()) {
            mo15838g();
            if (!this.f1138B) {
                if (!this.f1140D) {
                    z = false;
                    if (z && this.f1153t.get() == 0) {
                        mo15847q();
                    }
                }
            }
            z = true;
            mo15847q();
        }
    }

    /* renamed from: s */
    public synchronized void mo15849s(C1646h<R> hVar) {
        C1632a aVar;
        this.f1142F = hVar;
        if (hVar.mo15781I()) {
            aVar = this.f1149p;
        } else {
            aVar = mo15840j();
        }
        aVar.execute(hVar);
    }

    @VisibleForTesting
    public C1669l(C1632a aVar, C1632a aVar2, C1632a aVar3, C1632a aVar4, C1675m mVar, Pools.Pool<C1669l<?>> pool, C1672c cVar) {
        this.f1144e = new C1674e();
        this.f1145l = C1961c.m2601a();
        this.f1153t = new AtomicInteger();
        this.f1149p = aVar;
        this.f1150q = aVar2;
        this.f1151r = aVar3;
        this.f1152s = aVar4;
        this.f1148o = mVar;
        this.f1146m = pool;
        this.f1147n = cVar;
    }
}
