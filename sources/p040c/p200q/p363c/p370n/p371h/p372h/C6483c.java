package p040c.p200q.p363c.p370n.p371h.p372h;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: c.q.c.n.h.h.c */
/* compiled from: BlockingAnalyticsEventLogger */
public class C6483c implements C6482b, C6481a {

    /* renamed from: a */
    public final C6485e f12190a;

    /* renamed from: b */
    public final int f12191b;

    /* renamed from: c */
    public final TimeUnit f12192c;

    /* renamed from: d */
    public final Object f12193d = new Object();

    /* renamed from: e */
    public CountDownLatch f12194e;

    public C6483c(@NonNull C6485e eVar, int i, TimeUnit timeUnit) {
        this.f12190a = eVar;
        this.f12191b = i;
        this.f12192c = timeUnit;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        p040c.p200q.p363c.p370n.p371h.C6479f.m18125f().mo30643d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30602a(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f12193d
            monitor-enter(r0)
            c.q.c.n.h.f r1 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r2.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x0068 }
            r2.append(r5)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x0068 }
            r2.append(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0068 }
            r1.mo30647i(r2)     // Catch:{ all -> 0x0068 }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0068 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x0068 }
            r4.f12194e = r1     // Catch:{ all -> 0x0068 }
            c.q.c.n.h.h.e r1 = r4.f12190a     // Catch:{ all -> 0x0068 }
            r1.mo30602a(r5, r6)     // Catch:{ all -> 0x0068 }
            c.q.c.n.h.f r5 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()     // Catch:{ all -> 0x0068 }
            java.lang.String r6 = "Awaiting app exception callback from Analytics..."
            r5.mo30647i(r6)     // Catch:{ all -> 0x0068 }
            java.util.concurrent.CountDownLatch r5 = r4.f12194e     // Catch:{ InterruptedException -> 0x005a }
            int r6 = r4.f12191b     // Catch:{ InterruptedException -> 0x005a }
            long r1 = (long) r6     // Catch:{ InterruptedException -> 0x005a }
            java.util.concurrent.TimeUnit r6 = r4.f12192c     // Catch:{ InterruptedException -> 0x005a }
            boolean r5 = r5.await(r1, r6)     // Catch:{ InterruptedException -> 0x005a }
            if (r5 == 0) goto L_0x0050
            c.q.c.n.h.f r5 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r6 = "App exception callback received from Analytics listener."
            r5.mo30647i(r6)     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0063
        L_0x0050:
            c.q.c.n.h.f r5 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r6 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r5.mo30649k(r6)     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0063
        L_0x005a:
            c.q.c.n.h.f r5 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()     // Catch:{ all -> 0x0068 }
            java.lang.String r6 = "Interrupted while awaiting app exception callback from Analytics listener."
            r5.mo30643d(r6)     // Catch:{ all -> 0x0068 }
        L_0x0063:
            r5 = 0
            r4.f12194e = r5     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p370n.p371h.p372h.C6483c.mo30602a(java.lang.String, android.os.Bundle):void");
    }

    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f12194e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
