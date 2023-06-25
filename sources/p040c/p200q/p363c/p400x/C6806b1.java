package p040c.p200q.p363c.p400x;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p264c.p346l.C5747a;

/* renamed from: c.q.c.x.b1 */
/* compiled from: WakeLockHolder */
public final class C6806b1 {

    /* renamed from: a */
    public static final long f13036a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f13037b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")

    /* renamed from: c */
    public static C5747a f13038c;

    @GuardedBy("WakeLockHolder.syncObject")
    /* renamed from: a */
    public static void m19306a(Context context) {
        if (f13038c == null) {
            C5747a aVar = new C5747a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f13038c = aVar;
            aVar.mo28821d(true);
        }
    }

    /* renamed from: b */
    public static void m19307b(@NonNull Intent intent) {
        synchronized (f13037b) {
            if (f13038c != null && m19308c(intent)) {
                m19311f(intent, false);
                f13038c.mo28820c();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    public static boolean m19308c(@NonNull Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: e */
    public static void m19310e(Context context, C6815d1 d1Var, Intent intent) {
        synchronized (f13037b) {
            m19306a(context);
            boolean c = m19308c(intent);
            m19311f(intent, true);
            if (!c) {
                f13038c.mo28818a(f13036a);
            }
            d1Var.mo31587c(intent).mo28843d(C6867y.f13147e, new C6857u(intent));
        }
    }

    /* renamed from: f */
    public static void m19311f(@NonNull Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r3;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m19312g(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.content.Intent r4) {
        /*
            java.lang.Object r0 = f13037b
            monitor-enter(r0)
            m19306a(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = m19308c(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            m19311f(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            r3 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            c.q.a.c.l.a r4 = f13038c     // Catch:{ all -> 0x0022 }
            long r1 = f13036a     // Catch:{ all -> 0x0022 }
            r4.mo28818a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p400x.C6806b1.m19312g(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
