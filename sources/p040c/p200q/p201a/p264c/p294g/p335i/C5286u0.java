package p040c.p200q.p201a.p264c.p294g.p335i;

import android.annotation.TargetApi;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: c.q.a.c.g.i.u0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5286u0 {
    @Nullable

    /* renamed from: a */
    public static final Method f10164a;
    @Nullable

    /* renamed from: b */
    public static final Method f10165b;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 6
            java.lang.String r3 = "JobSchedulerCompat"
            r4 = 0
            r5 = 24
            r6 = 0
            if (r1 < r5) goto L_0x002c
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class<android.app.job.JobInfo> r7 = android.app.job.JobInfo.class
            r1[r4] = r7     // Catch:{ NoSuchMethodException -> 0x0028 }
            r7 = 1
            r1[r7] = r0     // Catch:{ NoSuchMethodException -> 0x0028 }
            r7 = 2
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0028 }
            r1[r7] = r8     // Catch:{ NoSuchMethodException -> 0x0028 }
            r7 = 3
            r1[r7] = r0     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.Class<android.app.job.JobScheduler> r0 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r7, r1)     // Catch:{ NoSuchMethodException -> 0x0028 }
            goto L_0x002d
        L_0x0028:
            boolean r0 = android.util.Log.isLoggable(r3, r2)
        L_0x002c:
            r0 = r6
        L_0x002d:
            f10164a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L_0x0042
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x003e }
            java.lang.reflect.Method r6 = r0.getDeclaredMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            boolean r0 = android.util.Log.isLoggable(r3, r2)
        L_0x0042:
            f10165b = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5286u0.<clinit>():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m15005a(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            if (r7 == 0) goto L_0x0066
            java.lang.reflect.Method r8 = f10164a
            if (r8 == 0) goto L_0x0061
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L_0x0017
            goto L_0x0061
        L_0x0017:
            java.lang.reflect.Method r5 = f10165b
            r8 = 0
            if (r5 == 0) goto L_0x0034
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002d }
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002d }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002d }
            if (r5 == 0) goto L_0x0034
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002d }
            goto L_0x0035
        L_0x002d:
            r5 = 6
            java.lang.String r0 = "JobSchedulerCompat"
            boolean r5 = android.util.Log.isLoggable(r0, r5)
        L_0x0034:
            r5 = r8
        L_0x0035:
            java.lang.reflect.Method r0 = f10164a
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r2 = "UploadAlarm"
            if (r0 == 0) goto L_0x005c
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            r3[r8] = r6     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            r4 = 1
            r3[r4] = r1     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            r1 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            r3[r1] = r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            r5 = 3
            r3[r5] = r2     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            java.lang.Object r5 = r0.invoke(r7, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            if (r5 == 0) goto L_0x0060
            int r8 = r5.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005c }
            goto L_0x0060
        L_0x005c:
            int r8 = r7.schedule(r6)
        L_0x0060:
            return r8
        L_0x0061:
            int r5 = r7.schedule(r6)
            return r5
        L_0x0066:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5286u0.m15005a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
