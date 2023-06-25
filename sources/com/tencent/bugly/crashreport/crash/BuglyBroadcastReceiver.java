package com.tencent.bugly.crashreport.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p040c.p325e0.p326a.p332c.C4270g;

/* compiled from: BUGLY */
public class BuglyBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public Context f16965a;

    /* renamed from: b */
    public String f16966b;

    /* renamed from: c */
    public boolean f16967c = true;

    public BuglyBroadcastReceiver() {
        new IntentFilter();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo45946a(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            if (r7 == 0) goto L_0x0097
            if (r8 == 0) goto L_0x0097
            java.lang.String r8 = r8.getAction()     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r8 = r8.equals(r1)     // Catch:{ all -> 0x0094 }
            if (r8 != 0) goto L_0x0014
            goto L_0x0097
        L_0x0014:
            boolean r8 = r6.f16967c     // Catch:{ all -> 0x0094 }
            r1 = 1
            if (r8 == 0) goto L_0x001d
            r6.f16967c = r0     // Catch:{ all -> 0x0094 }
            monitor-exit(r6)
            return r1
        L_0x001d:
            android.content.Context r8 = r6.f16965a     // Catch:{ all -> 0x0094 }
            java.lang.String r8 = p040c.p325e0.p326a.p327b.p328a.p329a.C4261c.m11612d(r8)     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "is Connect BC "
            r2.<init>(r3)     // Catch:{ all -> 0x0094 }
            r2.append(r8)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0094 }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x0094 }
            p040c.p325e0.p326a.p332c.C4270g.m11651d(r2, r3)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "network %s changed to %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r4.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = r6.f16966b     // Catch:{ all -> 0x0094 }
            r4.append(r5)     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0094 }
            r3[r0] = r4     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r4.<init>()     // Catch:{ all -> 0x0094 }
            r4.append(r8)     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0094 }
            r3[r1] = r4     // Catch:{ all -> 0x0094 }
            p040c.p325e0.p326a.p332c.C4270g.m11649b(r2, r3)     // Catch:{ all -> 0x0094 }
            r2 = 0
            if (r8 != 0) goto L_0x0063
            r6.f16966b = r2     // Catch:{ all -> 0x0094 }
            monitor-exit(r6)
            return r1
        L_0x0063:
            java.lang.String r3 = r6.f16966b     // Catch:{ all -> 0x0094 }
            r6.f16966b = r8     // Catch:{ all -> 0x0094 }
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0094 }
            c.e0.a.b.a.b.a r4 = p040c.p325e0.p326a.p327b.p328a.p330b.C4262a.m11614a()     // Catch:{ all -> 0x0094 }
            c.e0.a.c.f r5 = p040c.p325e0.p326a.p332c.C4269f.m11646b()     // Catch:{ all -> 0x0094 }
            c.e0.a.b.a.a.b r7 = p040c.p325e0.p326a.p327b.p328a.p329a.C4260b.m11607a(r7)     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x008b
            if (r5 == 0) goto L_0x008b
            if (r7 != 0) goto L_0x007d
            goto L_0x008b
        L_0x007d:
            boolean r7 = r8.equals(r3)     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x0085
            monitor-exit(r6)
            return r1
        L_0x0085:
            int r7 = p040c.p325e0.p326a.p327b.p331b.C4263a.f9101a     // Catch:{ all -> 0x0094 }
            r5.mo25753a(r7)     // Catch:{ all -> 0x0094 }
            throw r2
        L_0x008b:
            java.lang.String r7 = "not inited BC not work"
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ all -> 0x0094 }
            p040c.p325e0.p326a.p332c.C4270g.m11652e(r7, r8)     // Catch:{ all -> 0x0094 }
            monitor-exit(r6)
            return r1
        L_0x0094:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0097:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.BuglyBroadcastReceiver.mo45946a(android.content.Context, android.content.Intent):boolean");
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            mo45946a(context, intent);
        } catch (Throwable th) {
            if (!C4270g.m11650c(th)) {
                th.printStackTrace();
            }
        }
    }
}
