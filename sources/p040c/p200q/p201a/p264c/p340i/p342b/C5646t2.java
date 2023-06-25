package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.GuardedBy;

/* renamed from: c.q.a.c.i.b.t2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5646t2 {

    /* renamed from: h */
    public static final Object f10876h = new Object();

    /* renamed from: a */
    public final String f10877a;

    /* renamed from: b */
    public final C5610q2 f10878b;

    /* renamed from: c */
    public final Object f10879c;

    /* renamed from: d */
    public final Object f10880d;

    /* renamed from: e */
    public final Object f10881e = new Object();
    @GuardedBy("overrideLock")

    /* renamed from: f */
    public volatile Object f10882f = null;
    @GuardedBy("cachingLock")

    /* renamed from: g */
    public volatile Object f10883g = null;

    public /* synthetic */ C5646t2(String str, Object obj, Object obj2, C5610q2 q2Var, C5634s2 s2Var) {
        this.f10877a = str;
        this.f10879c = obj;
        this.f10880d = obj2;
        this.f10878b = q2Var;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0046 */
    /* renamed from: a */
    public final java.lang.Object mo28613a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10881e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            c.q.a.c.i.b.c r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5622r2.f10812a
            if (r4 != 0) goto L_0x000e
            java.lang.Object r4 = r3.f10879c
            return r4
        L_0x000e:
            java.lang.Object r4 = f10876h
            monitor-enter(r4)
            boolean r0 = p040c.p200q.p201a.p264c.p340i.p342b.C5439c.m15559a()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r3.f10883g     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r3.f10879c     // Catch:{ all -> 0x006a }
            goto L_0x0020
        L_0x001e:
            java.lang.Object r0 = r3.f10883g     // Catch:{ all -> 0x006a }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            java.util.List r4 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10963a     // Catch:{ SecurityException -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0058 }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0058 }
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0058 }
            c.q.a.c.i.b.t2 r0 = (p040c.p200q.p201a.p264c.p340i.p342b.C5646t2) r0     // Catch:{ SecurityException -> 0x0058 }
            boolean r1 = p040c.p200q.p201a.p264c.p340i.p342b.C5439c.m15559a()     // Catch:{ SecurityException -> 0x0058 }
            if (r1 != 0) goto L_0x0050
            r1 = 0
            c.q.a.c.i.b.q2 r2 = r0.f10878b     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            java.lang.Object r2 = f10876h     // Catch:{ SecurityException -> 0x0058 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0058 }
            r0.f10883g = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x002b
        L_0x004d:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0058 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0058 }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0058:
            c.q.a.c.i.b.q2 r4 = r3.f10878b
            if (r4 != 0) goto L_0x005f
            java.lang.Object r4 = r3.f10879c
            return r4
        L_0x005f:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0067, IllegalStateException -> 0x0064 }
            return r4
        L_0x0064:
            java.lang.Object r4 = r3.f10879c
            return r4
        L_0x0067:
            java.lang.Object r4 = r3.f10879c
            return r4
        L_0x006a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            throw r0
        L_0x006d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5646t2.mo28613a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final String mo28614b() {
        return this.f10877a;
    }
}
