package p040c.p200q.p201a.p264c.p276d.p291o;

import android.content.Context;
import androidx.annotation.Nullable;

/* renamed from: c.q.a.c.d.o.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3571a {

    /* renamed from: a */
    public static Context f6554a;
    @Nullable

    /* renamed from: b */
    public static Boolean f6555b;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m9102a(@androidx.annotation.NonNull android.content.Context r4) {
        /*
            java.lang.Class<c.q.a.c.d.o.a> r0 = p040c.p200q.p201a.p264c.p276d.p291o.C3571a.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x004c }
            android.content.Context r2 = f6554a     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0018
            java.lang.Boolean r3 = f6555b     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0018
            if (r2 == r1) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x004c }
            monitor-exit(r0)
            return r4
        L_0x0018:
            r2 = 0
            f6555b = r2     // Catch:{ all -> 0x004c }
            boolean r2 = p040c.p200q.p201a.p264c.p276d.p289n.C3562m.m9087h()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0030
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x004c }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004c }
            f6555b = r4     // Catch:{ all -> 0x004c }
            goto L_0x0042
        L_0x0030:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x003e }
            f6555b = r4     // Catch:{ ClassNotFoundException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004c }
            f6555b = r4     // Catch:{ all -> 0x004c }
        L_0x0042:
            f6554a = r1     // Catch:{ all -> 0x004c }
            java.lang.Boolean r4 = f6555b     // Catch:{ all -> 0x004c }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004c }
            monitor-exit(r0)
            return r4
        L_0x004c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p291o.C3571a.m9102a(android.content.Context):boolean");
    }
}
