package p040c.p496x.p497a.p498a.p499a.p500a.p505g;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7669e;

/* renamed from: c.x.a.a.a.a.g.a */
public class C7685a {

    /* renamed from: a */
    public Map<String, C7669e> f14446a;

    /* renamed from: b */
    public Set<String> f14447b;

    /* renamed from: c.x.a.a.a.a.g.a$b */
    public static final class C7687b {

        /* renamed from: a */
        public static final C7685a f14448a = new C7685a();
    }

    /* renamed from: d */
    public static final C7685a m21759d() {
        return C7687b.f14448a;
    }

    /* renamed from: a */
    public void mo33194a(String str) {
        this.f14447b.add(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo33195b(java.lang.String r7, java.net.InetAddress r8, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map<java.lang.String, c.x.a.a.a.a.f.e> r8 = r6.f14446a     // Catch:{ all -> 0x0050 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x0050 }
            c.x.a.a.a.a.f.e r7 = (p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7669e) r7     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x004e
            int r8 = r7.mo33152l()     // Catch:{ all -> 0x0050 }
            r0 = 1
            if (r8 != r0) goto L_0x004e
            long r0 = r7.mo33151k()     // Catch:{ all -> 0x0050 }
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x001b
            goto L_0x004e
        L_0x001b:
            long r0 = r7.mo33151k()     // Catch:{ all -> 0x0050 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r4 = r7.mo33150j()     // Catch:{ all -> 0x0050 }
            long r0 = r0 + r4
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0050 }
            long r0 = r0 - r4
            long r2 = r2 * r9
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x004c
            java.util.Map<java.lang.String, c.x.a.a.a.a.f.e> r8 = r6.f14446a     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r7.mo33145e()     // Catch:{ all -> 0x0050 }
            c.x.a.a.a.a.f.e$b r7 = r7.mo33144d()     // Catch:{ all -> 0x0050 }
            r7.mo33159k(r9)     // Catch:{ all -> 0x0050 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0050 }
            r7.mo33157i(r9)     // Catch:{ all -> 0x0050 }
            c.x.a.a.a.a.f.e r7 = r7.mo33156h()     // Catch:{ all -> 0x0050 }
            r8.put(r0, r7)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r6)
            return
        L_0x004e:
            monitor-exit(r6)
            return
        L_0x0050:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p496x.p497a.p498a.p499a.p500a.p505g.C7685a.mo33195b(java.lang.String, java.net.InetAddress, long):void");
    }

    /* renamed from: c */
    public synchronized C7669e mo33196c(String str) {
        C7669e eVar = this.f14446a.get(str);
        if (eVar == null) {
            return null;
        }
        if (!mo33197e(eVar)) {
            return eVar;
        }
        this.f14446a.remove(str);
        return null;
    }

    /* renamed from: e */
    public final boolean mo33197e(C7669e eVar) {
        return SystemClock.elapsedRealtime() - eVar.mo33150j() > eVar.mo33151k() * 1000;
    }

    /* renamed from: f */
    public boolean mo33198f(String str) {
        return this.f14447b.contains(str);
    }

    /* renamed from: g */
    public synchronized void mo33199g(C7669e eVar) {
        this.f14446a.put(eVar.mo33145e(), eVar);
    }

    public C7685a() {
        this.f14446a = new HashMap();
        this.f14447b = new CopyOnWriteArraySet();
    }
}
