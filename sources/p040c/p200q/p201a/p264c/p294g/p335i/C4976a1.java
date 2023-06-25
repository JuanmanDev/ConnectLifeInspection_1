package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.q.a.c.g.i.a1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C4976a1 extends C5072g1 {

    /* renamed from: e */
    public final AtomicReference f9792e = new AtomicReference();

    /* renamed from: l */
    public boolean f9793l;

    /* renamed from: v */
    public static final Object m13744v(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()});
            throw e;
        }
    }

    /* renamed from: D */
    public final void mo26910D(Bundle bundle) {
        synchronized (this.f9792e) {
            try {
                this.f9792e.set(bundle);
                this.f9793l = true;
                this.f9792e.notify();
            } catch (Throwable th) {
                this.f9792e.notify();
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo26911e(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f9792e
            monitor-enter(r0)
            boolean r1 = r2.f9793l     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f9792e     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f9792e     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C4976a1.mo26911e(long):android.os.Bundle");
    }

    /* renamed from: g */
    public final Long mo26912g(long j) {
        return (Long) m13744v(mo26911e(j), Long.class);
    }

    /* renamed from: k */
    public final String mo26913k(long j) {
        return (String) m13744v(mo26911e(j), String.class);
    }
}
