package p040c.p200q.p201a.p264c.p275c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.c.u */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C3316u {

    /* renamed from: a */
    public final Context f6184a;

    /* renamed from: b */
    public int f6185b;

    /* renamed from: c */
    public int f6186c = 0;

    public C3316u(Context context) {
        this.f6184a = context;
    }

    /* renamed from: a */
    public final synchronized int mo20375a() {
        PackageInfo packageInfo;
        if (this.f6185b == 0) {
            try {
                packageInfo = C3573c.m9110a(this.f6184a).mo20847e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                sb.toString();
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f6185b = packageInfo.versionCode;
            }
        }
        return this.f6185b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo20376b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f6186c     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f6184a     // Catch:{ all -> 0x0071 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0071 }
            android.content.Context r1 = r5.f6184a     // Catch:{ all -> 0x0071 }
            c.q.a.c.d.o.b r1 = p040c.p200q.p201a.p264c.p276d.p291o.C3573c.m9110a(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r1 = r1.mo20844b(r2, r3)     // Catch:{ all -> 0x0071 }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0021
            monitor-exit(r5)
            return r3
        L_0x0021:
            boolean r1 = p040c.p200q.p201a.p264c.p276d.p289n.C3562m.m9087h()     // Catch:{ all -> 0x0071 }
            r2 = 1
            if (r1 != 0) goto L_0x0045
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0071 }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0045
            int r1 = r1.size()     // Catch:{ all -> 0x0071 }
            if (r1 > 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            r5.f6186c = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)
            return r2
        L_0x0045:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0071 }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x0071 }
            r1 = 2
            if (r0 == 0) goto L_0x0063
            int r0 = r0.size()     // Catch:{ all -> 0x0071 }
            if (r0 > 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            r5.f6186c = r1     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)
            return r1
        L_0x0063:
            boolean r0 = p040c.p200q.p201a.p264c.p276d.p289n.C3562m.m9087h()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006d
            r5.f6186c = r1     // Catch:{ all -> 0x0071 }
            r2 = r1
            goto L_0x006f
        L_0x006d:
            r5.f6186c = r2     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r5)
            return r2
        L_0x0071:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p275c.C3316u.mo20376b():int");
    }
}
