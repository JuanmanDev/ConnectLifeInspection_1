package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: c.q.a.c.m.i0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5770i0 {

    /* renamed from: a */
    public final Object f11263a = new Object();

    /* renamed from: b */
    public Queue f11264b;

    /* renamed from: c */
    public boolean f11265c;

    /* renamed from: a */
    public final void mo28838a(@NonNull C5768h0 h0Var) {
        synchronized (this.f11263a) {
            if (this.f11264b == null) {
                this.f11264b = new ArrayDeque();
            }
            this.f11264b.add(h0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f11263a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (p040c.p200q.p201a.p264c.p347m.C5768h0) r2.f11264b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f11265c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo28828c(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28839b(@androidx.annotation.NonNull p040c.p200q.p201a.p264c.p347m.C5771j r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11263a
            monitor-enter(r0)
            java.util.Queue r1 = r2.f11264b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f11265c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f11265c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f11263a
            monitor-enter(r1)
            java.util.Queue r0 = r2.f11264b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            c.q.a.c.m.h0 r0 = (p040c.p200q.p201a.p264c.p347m.C5768h0) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f11265c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo28828c(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p347m.C5770i0.mo28839b(c.q.a.c.m.j):void");
    }
}
