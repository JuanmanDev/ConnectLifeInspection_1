package p040c.p200q.p363c.p400x;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: c.q.c.x.t0 */
/* compiled from: ServiceStarter */
public class C6856t0 {

    /* renamed from: e */
    public static C6856t0 f13119e;
    @GuardedBy("this")
    @Nullable

    /* renamed from: a */
    public String f13120a = null;

    /* renamed from: b */
    public Boolean f13121b = null;

    /* renamed from: c */
    public Boolean f13122c = null;

    /* renamed from: d */
    public final Queue<Intent> f13123d = new ArrayDeque();

    /* renamed from: b */
    public static synchronized C6856t0 m19479b() {
        C6856t0 t0Var;
        synchronized (C6856t0.class) {
            if (f13119e == null) {
                f13119e = new C6856t0();
            }
            t0Var = f13119e;
        }
        return t0Var;
    }

    /* renamed from: a */
    public final int mo31675a(Context context, Intent intent) {
        ComponentName componentName;
        String f = mo31679f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                "Restricting intent to a specific service: " + f;
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (mo31678e(context)) {
                componentName = C6806b1.m19312g(context, intent);
            } else {
                componentName = context.startService(intent);
            }
            if (componentName == null) {
                return HttpStatus.HTTP_NOT_FOUND;
            }
            return -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException e) {
            "Failed to start service while in background: " + e;
            return 402;
        }
    }

    @MainThread
    /* renamed from: c */
    public Intent mo31676c() {
        return this.f13123d.poll();
    }

    /* renamed from: d */
    public boolean mo31677d(Context context) {
        if (this.f13122c == null) {
            this.f13122c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f13121b.booleanValue()) {
            boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f13122c.booleanValue();
    }

    /* renamed from: e */
    public boolean mo31678e(Context context) {
        if (this.f13121b == null) {
            this.f13121b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f13121b.booleanValue()) {
            boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f13121b.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo31679f(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.f13120a     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0009
            java.lang.String r4 = r3.f13120a     // Catch:{ all -> 0x0077 }
            monitor-exit(r3)
            return r4
        L_0x0009:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x0077 }
            r1 = 0
            android.content.pm.ResolveInfo r5 = r0.resolveService(r5, r1)     // Catch:{ all -> 0x0077 }
            r0 = 0
            if (r5 == 0) goto L_0x0075
            android.content.pm.ServiceInfo r1 = r5.serviceInfo     // Catch:{ all -> 0x0077 }
            if (r1 != 0) goto L_0x001a
            goto L_0x0075
        L_0x001a:
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r4.getPackageName()     // Catch:{ all -> 0x0077 }
            java.lang.String r2 = r5.packageName     // Catch:{ all -> 0x0077 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = r5.name     // Catch:{ all -> 0x0077 }
            if (r1 != 0) goto L_0x002d
            goto L_0x0057
        L_0x002d:
            java.lang.String r0 = r5.name     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "."
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x004f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r0.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0077 }
            r0.append(r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x0077 }
            r0.append(r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0077 }
            r3.f13120a = r4     // Catch:{ all -> 0x0077 }
            goto L_0x0053
        L_0x004f:
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x0077 }
            r3.f13120a = r4     // Catch:{ all -> 0x0077 }
        L_0x0053:
            java.lang.String r4 = r3.f13120a     // Catch:{ all -> 0x0077 }
            monitor-exit(r3)
            return r4
        L_0x0057:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r4.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r4.append(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r5.packageName     // Catch:{ all -> 0x0077 }
            r4.append(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x0077 }
            r4.append(r5)     // Catch:{ all -> 0x0077 }
            r4.toString()     // Catch:{ all -> 0x0077 }
            monitor-exit(r3)
            return r0
        L_0x0075:
            monitor-exit(r3)
            return r0
        L_0x0077:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p400x.C6856t0.mo31679f(android.content.Context, android.content.Intent):java.lang.String");
    }

    @MainThread
    /* renamed from: g */
    public int mo31680g(Context context, Intent intent) {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        this.f13123d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return mo31675a(context, intent2);
    }
}
