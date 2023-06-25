package p040c.p077d.p078a.p081k.p084j;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import java.util.Map;
import p040c.p077d.p078a.C1543e;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p084j.C1646h;
import p040c.p077d.p078a.p081k.p084j.C1678p;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1609a;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1612b;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1622h;
import p040c.p077d.p078a.p081k.p084j.p086b0.C1632a;
import p040c.p077d.p078a.p101o.C1913g;
import p040c.p077d.p078a.p105q.C1945e;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.p106k.C1952a;

/* renamed from: c.d.a.k.j.k */
/* compiled from: Engine */
public class C1662k implements C1675m, C1622h.C1623a, C1678p.C1679a {

    /* renamed from: i */
    public static final boolean f1111i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C1681r f1112a;

    /* renamed from: b */
    public final C1677o f1113b;

    /* renamed from: c */
    public final C1622h f1114c;

    /* renamed from: d */
    public final C1665b f1115d;

    /* renamed from: e */
    public final C1688x f1116e;

    /* renamed from: f */
    public final C1667c f1117f;

    /* renamed from: g */
    public final C1663a f1118g;

    /* renamed from: h */
    public final C1603a f1119h;

    @VisibleForTesting
    /* renamed from: c.d.a.k.j.k$a */
    /* compiled from: Engine */
    public static class C1663a {

        /* renamed from: a */
        public final C1646h.C1651e f1120a;

        /* renamed from: b */
        public final Pools.Pool<C1646h<?>> f1121b = C1952a.m2588d(150, new C1664a());

        /* renamed from: c */
        public int f1122c;

        /* renamed from: c.d.a.k.j.k$a$a */
        /* compiled from: Engine */
        public class C1664a implements C1952a.C1956d<C1646h<?>> {
            public C1664a() {
            }

            /* renamed from: a */
            public C1646h<?> create() {
                C1663a aVar = C1663a.this;
                return new C1646h<>(aVar.f1120a, aVar.f1121b);
            }
        }

        public C1663a(C1646h.C1651e eVar) {
            this.f1120a = eVar;
        }

        /* renamed from: a */
        public <R> C1646h<R> mo15830a(C1543e eVar, Object obj, C1676n nVar, C1567c cVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C1657j jVar, Map<Class<?>, C1574h<?>> map, boolean z, boolean z2, boolean z3, C1571e eVar2, C1646h.C1648b<R> bVar) {
            C1646h<R> acquire = this.f1121b.acquire();
            C1949i.m2563d(acquire);
            C1646h<R> hVar = acquire;
            int i3 = this.f1122c;
            int i4 = i3;
            this.f1122c = i3 + 1;
            hVar.mo15793t(eVar, obj, nVar, cVar, i, i2, cls, cls2, priority, jVar, map, z, z2, z3, eVar2, bVar, i4);
            return hVar;
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.j.k$b */
    /* compiled from: Engine */
    public static class C1665b {

        /* renamed from: a */
        public final C1632a f1124a;

        /* renamed from: b */
        public final C1632a f1125b;

        /* renamed from: c */
        public final C1632a f1126c;

        /* renamed from: d */
        public final C1632a f1127d;

        /* renamed from: e */
        public final C1675m f1128e;

        /* renamed from: f */
        public final Pools.Pool<C1669l<?>> f1129f = C1952a.m2588d(150, new C1666a());

        /* renamed from: c.d.a.k.j.k$b$a */
        /* compiled from: Engine */
        public class C1666a implements C1952a.C1956d<C1669l<?>> {
            public C1666a() {
            }

            /* renamed from: a */
            public C1669l<?> create() {
                C1665b bVar = C1665b.this;
                return new C1669l(bVar.f1124a, bVar.f1125b, bVar.f1126c, bVar.f1127d, bVar.f1128e, bVar.f1129f);
            }
        }

        public C1665b(C1632a aVar, C1632a aVar2, C1632a aVar3, C1632a aVar4, C1675m mVar) {
            this.f1124a = aVar;
            this.f1125b = aVar2;
            this.f1126c = aVar3;
            this.f1127d = aVar4;
            this.f1128e = mVar;
        }

        /* renamed from: a */
        public <R> C1669l<R> mo15832a(C1567c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
            C1669l<R> acquire = this.f1129f.acquire();
            C1949i.m2563d(acquire);
            C1669l<R> lVar = acquire;
            lVar.mo15842l(cVar, z, z2, z3, z4);
            return lVar;
        }
    }

    /* renamed from: c.d.a.k.j.k$c */
    /* compiled from: Engine */
    public static class C1667c implements C1646h.C1651e {

        /* renamed from: a */
        public final C1609a.C1610a f1131a;

        /* renamed from: b */
        public volatile C1609a f1132b;

        public C1667c(C1609a.C1610a aVar) {
            this.f1131a = aVar;
        }

        /* renamed from: a */
        public C1609a mo15808a() {
            if (this.f1132b == null) {
                synchronized (this) {
                    if (this.f1132b == null) {
                        this.f1132b = this.f1131a.build();
                    }
                    if (this.f1132b == null) {
                        this.f1132b = new C1612b();
                    }
                }
            }
            return this.f1132b;
        }
    }

    /* renamed from: c.d.a.k.j.k$d */
    /* compiled from: Engine */
    public class C1668d {

        /* renamed from: a */
        public final C1669l<?> f1133a;

        /* renamed from: b */
        public final C1913g f1134b;

        public C1668d(C1913g gVar, C1669l<?> lVar) {
            this.f1134b = gVar;
            this.f1133a = lVar;
        }

        /* renamed from: a */
        public void mo15834a() {
            synchronized (C1662k.this) {
                this.f1133a.mo15848r(this.f1134b);
            }
        }
    }

    public C1662k(C1622h hVar, C1609a.C1610a aVar, C1632a aVar2, C1632a aVar3, C1632a aVar4, C1632a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (C1681r) null, (C1677o) null, (C1603a) null, (C1665b) null, (C1663a) null, (C1688x) null, z);
    }

    /* renamed from: i */
    public static void m1557i(String str, long j, C1567c cVar) {
        str + " in " + C1945e.m2546a(j) + "ms, key: " + cVar;
    }

    /* renamed from: a */
    public void mo15711a(@NonNull C1685u<?> uVar) {
        this.f1116e.mo15890a(uVar);
    }

    /* renamed from: b */
    public synchronized void mo15822b(C1669l<?> lVar, C1567c cVar, C1678p<?> pVar) {
        if (pVar != null) {
            pVar.mo15873h(cVar, this);
            if (pVar.mo15870f()) {
                this.f1119h.mo15681a(cVar, pVar);
            }
        }
        this.f1112a.mo15879d(cVar, lVar);
    }

    /* renamed from: c */
    public synchronized void mo15823c(C1669l<?> lVar, C1567c cVar) {
        this.f1112a.mo15879d(cVar, lVar);
    }

    /* renamed from: d */
    public synchronized void mo15824d(C1567c cVar, C1678p<?> pVar) {
        this.f1119h.mo15684d(cVar);
        if (pVar.mo15870f()) {
            this.f1114c.mo15703c(cVar, pVar);
        } else {
            this.f1116e.mo15890a(pVar);
        }
    }

    /* renamed from: e */
    public final C1678p<?> mo15825e(C1567c cVar) {
        C1685u<?> d = this.f1114c.mo15704d(cVar);
        if (d == null) {
            return null;
        }
        if (d instanceof C1678p) {
            return (C1678p) d;
        }
        return new C1678p<>(d, true, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        return null;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <R> p040c.p077d.p078a.p081k.p084j.C1662k.C1668d mo15826f(p040c.p077d.p078a.C1543e r31, java.lang.Object r32, p040c.p077d.p078a.p081k.C1567c r33, int r34, int r35, java.lang.Class<?> r36, java.lang.Class<R> r37, com.bumptech.glide.Priority r38, p040c.p077d.p078a.p081k.p084j.C1657j r39, java.util.Map<java.lang.Class<?>, p040c.p077d.p078a.p081k.C1574h<?>> r40, boolean r41, boolean r42, p040c.p077d.p078a.p081k.C1571e r43, boolean r44, boolean r45, boolean r46, boolean r47, p040c.p077d.p078a.p101o.C1913g r48, java.util.concurrent.Executor r49) {
        /*
            r30 = this;
            r1 = r30
            r0 = r44
            r8 = r48
            r9 = r49
            monitor-enter(r30)
            boolean r2 = f1111i     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0012
            long r2 = p040c.p077d.p078a.p105q.C1945e.m2547b()     // Catch:{ all -> 0x00c5 }
            goto L_0x0014
        L_0x0012:
            r2 = 0
        L_0x0014:
            r10 = r2
            c.d.a.k.j.o r12 = r1.f1113b     // Catch:{ all -> 0x00c5 }
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r40
            r18 = r36
            r19 = r37
            r20 = r43
            c.d.a.k.j.n r12 = r12.mo15864a(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00c5 }
            c.d.a.k.j.p r2 = r1.mo15827g(r12, r0)     // Catch:{ all -> 0x00c5 }
            r3 = 0
            if (r2 == 0) goto L_0x0042
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x00c5 }
            r8.mo16345b(r2, r0)     // Catch:{ all -> 0x00c5 }
            boolean r0 = f1111i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "Loaded resource from active resources"
            m1557i(r0, r10, r12)     // Catch:{ all -> 0x00c5 }
        L_0x0040:
            monitor-exit(r30)
            return r3
        L_0x0042:
            c.d.a.k.j.p r2 = r1.mo15828h(r12, r0)     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0058
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x00c5 }
            r8.mo16345b(r2, r0)     // Catch:{ all -> 0x00c5 }
            boolean r0 = f1111i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "Loaded resource from cache"
            m1557i(r0, r10, r12)     // Catch:{ all -> 0x00c5 }
        L_0x0056:
            monitor-exit(r30)
            return r3
        L_0x0058:
            c.d.a.k.j.r r2 = r1.f1112a     // Catch:{ all -> 0x00c5 }
            r15 = r47
            c.d.a.k.j.l r2 = r2.mo15876a(r12, r15)     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0075
            r2.mo15835d(r8, r9)     // Catch:{ all -> 0x00c5 }
            boolean r0 = f1111i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "Added to existing load"
            m1557i(r0, r10, r12)     // Catch:{ all -> 0x00c5 }
        L_0x006e:
            c.d.a.k.j.k$d r0 = new c.d.a.k.j.k$d     // Catch:{ all -> 0x00c5 }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r30)
            return r0
        L_0x0075:
            c.d.a.k.j.k$b r2 = r1.f1115d     // Catch:{ all -> 0x00c5 }
            r3 = r12
            r4 = r44
            r5 = r45
            r6 = r46
            r7 = r47
            c.d.a.k.j.l r0 = r2.mo15832a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c5 }
            c.d.a.k.j.k$a r13 = r1.f1118g     // Catch:{ all -> 0x00c5 }
            r14 = r31
            r15 = r32
            r16 = r12
            r17 = r33
            r18 = r34
            r19 = r35
            r20 = r36
            r21 = r37
            r22 = r38
            r23 = r39
            r24 = r40
            r25 = r41
            r26 = r42
            r27 = r47
            r28 = r43
            r29 = r0
            c.d.a.k.j.h r2 = r13.mo15830a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x00c5 }
            c.d.a.k.j.r r3 = r1.f1112a     // Catch:{ all -> 0x00c5 }
            r3.mo15878c(r12, r0)     // Catch:{ all -> 0x00c5 }
            r0.mo15835d(r8, r9)     // Catch:{ all -> 0x00c5 }
            r0.mo15849s(r2)     // Catch:{ all -> 0x00c5 }
            boolean r2 = f1111i     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = "Started new load"
            m1557i(r2, r10, r12)     // Catch:{ all -> 0x00c5 }
        L_0x00be:
            c.d.a.k.j.k$d r2 = new c.d.a.k.j.k$d     // Catch:{ all -> 0x00c5 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r30)
            return r2
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r30)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p084j.C1662k.mo15826f(c.d.a.e, java.lang.Object, c.d.a.k.c, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.Priority, c.d.a.k.j.j, java.util.Map, boolean, boolean, c.d.a.k.e, boolean, boolean, boolean, boolean, c.d.a.o.g, java.util.concurrent.Executor):c.d.a.k.j.k$d");
    }

    @Nullable
    /* renamed from: g */
    public final C1678p<?> mo15827g(C1567c cVar, boolean z) {
        if (!z) {
            return null;
        }
        C1678p<?> e = this.f1119h.mo15685e(cVar);
        if (e != null) {
            e.mo15865a();
        }
        return e;
    }

    /* renamed from: h */
    public final C1678p<?> mo15828h(C1567c cVar, boolean z) {
        if (!z) {
            return null;
        }
        C1678p<?> e = mo15825e(cVar);
        if (e != null) {
            e.mo15865a();
            this.f1119h.mo15681a(cVar, e);
        }
        return e;
    }

    /* renamed from: j */
    public void mo15829j(C1685u<?> uVar) {
        if (uVar instanceof C1678p) {
            ((C1678p) uVar).mo15871g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @VisibleForTesting
    public C1662k(C1622h hVar, C1609a.C1610a aVar, C1632a aVar2, C1632a aVar3, C1632a aVar4, C1632a aVar5, C1681r rVar, C1677o oVar, C1603a aVar6, C1665b bVar, C1663a aVar7, C1688x xVar, boolean z) {
        this.f1114c = hVar;
        C1609a.C1610a aVar8 = aVar;
        this.f1117f = new C1667c(aVar);
        C1603a aVar9 = aVar6 == null ? new C1603a(z) : aVar6;
        this.f1119h = aVar9;
        aVar9.mo15686f(this);
        this.f1113b = oVar == null ? new C1677o() : oVar;
        this.f1112a = rVar == null ? new C1681r() : rVar;
        this.f1115d = bVar == null ? new C1665b(aVar2, aVar3, aVar4, aVar5, this) : bVar;
        this.f1118g = aVar7 == null ? new C1663a(this.f1117f) : aVar7;
        this.f1116e = xVar == null ? new C1688x() : xVar;
        hVar.mo15705e(this);
    }
}
