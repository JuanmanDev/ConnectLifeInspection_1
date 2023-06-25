package p040c.p200q.p363c.p400x;

import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p347m.C5771j;

/* renamed from: c.q.c.x.s0 */
/* compiled from: RequestDeduplicator */
public class C6853s0 {

    /* renamed from: a */
    public final Executor f13112a;
    @GuardedBy("this")

    /* renamed from: b */
    public final Map<String, C5771j<String>> f13113b = new ArrayMap();

    /* renamed from: c.q.c.x.s0$a */
    /* compiled from: RequestDeduplicator */
    public interface C6854a {
        C5771j<String> start();
    }

    public C6853s0(Executor executor) {
        this.f13112a = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p040c.p200q.p201a.p264c.p347m.C5771j<java.lang.String> mo31672a(java.lang.String r3, p040c.p200q.p363c.p400x.C6853s0.C6854a r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, c.q.a.c.m.j<java.lang.String>> r0 = r2.f13113b     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0054 }
            c.q.a.c.m.j r0 = (p040c.p200q.p201a.p264c.p347m.C5771j) r0     // Catch:{ all -> 0x0054 }
            r1 = 3
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = "FirebaseMessaging"
            boolean r4 = android.util.Log.isLoggable(r4, r1)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0024
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r4.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "Joining ongoing request for: "
            r4.append(r1)     // Catch:{ all -> 0x0054 }
            r4.append(r3)     // Catch:{ all -> 0x0054 }
            r4.toString()     // Catch:{ all -> 0x0054 }
        L_0x0024:
            monitor-exit(r2)
            return r0
        L_0x0026:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x003e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "Making new request for: "
            r0.append(r1)     // Catch:{ all -> 0x0054 }
            r0.append(r3)     // Catch:{ all -> 0x0054 }
            r0.toString()     // Catch:{ all -> 0x0054 }
        L_0x003e:
            c.q.a.c.m.j r4 = r4.start()     // Catch:{ all -> 0x0054 }
            java.util.concurrent.Executor r0 = r2.f13112a     // Catch:{ all -> 0x0054 }
            c.q.c.x.s r1 = new c.q.c.x.s     // Catch:{ all -> 0x0054 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0054 }
            c.q.a.c.m.j r4 = r4.mo28850k(r0, r1)     // Catch:{ all -> 0x0054 }
            java.util.Map<java.lang.String, c.q.a.c.m.j<java.lang.String>> r0 = r2.f13113b     // Catch:{ all -> 0x0054 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)
            return r4
        L_0x0054:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p400x.C6853s0.mo31672a(java.lang.String, c.q.c.x.s0$a):c.q.a.c.m.j");
    }

    /* renamed from: b */
    public /* synthetic */ C5771j mo31673b(String str, C5771j jVar) {
        synchronized (this) {
            this.f13113b.remove(str);
        }
        return jVar;
    }
}
