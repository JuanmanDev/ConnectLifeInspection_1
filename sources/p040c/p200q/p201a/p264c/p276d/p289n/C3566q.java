package p040c.p200q.p201a.p264c.p276d.p289n;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.d.n.q */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3566q {

    /* renamed from: a */
    public static final Method f6549a;

    /* renamed from: b */
    public static final Method f6550b;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d A[SYNTHETIC, Splitter:B:18:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            android.os.Process.myUid()
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0017 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0017 }
            r5[r4] = r6     // Catch:{ Exception -> 0x0017 }
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r5 = r6.getMethod(r1, r5)     // Catch:{ Exception -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r5 = r2
        L_0x0018:
            f6549a = r5
            boolean r5 = p040c.p200q.p201a.p264c.p276d.p289n.C3562m.m9082c()
            r6 = 2
            if (r5 == 0) goto L_0x002f
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x002f }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x002f }
            r5[r4] = r7     // Catch:{ Exception -> 0x002f }
            r5[r3] = r0     // Catch:{ Exception -> 0x002f }
            java.lang.Class<android.os.WorkSource> r7 = android.os.WorkSource.class
            java.lang.reflect.Method r2 = r7.getMethod(r1, r5)     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            f6550b = r2
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r2 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x003a }
            r1.getMethod(r2, r5)     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0047 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0047 }
            r1[r4] = r2     // Catch:{ Exception -> 0x0047 }
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r5 = "get"
            r2.getMethod(r5, r1)     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            boolean r1 = p040c.p200q.p201a.p264c.p276d.p289n.C3562m.m9082c()
            if (r1 == 0) goto L_0x005a
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x005a }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x005a }
            r1[r4] = r2     // Catch:{ Exception -> 0x005a }
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r5 = "getName"
            r2.getMethod(r5, r1)     // Catch:{ Exception -> 0x005a }
        L_0x005a:
            boolean r1 = p040c.p200q.p201a.p264c.p276d.p289n.C3562m.m9088i()
            if (r1 == 0) goto L_0x0069
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r2 = "createWorkChain"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0069 }
            r1.getMethod(r2, r5)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            boolean r1 = p040c.p200q.p201a.p264c.p276d.p289n.C3562m.m9088i()
            if (r1 == 0) goto L_0x0082
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0082 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0082 }
            r2[r4] = r5     // Catch:{ Exception -> 0x0082 }
            r2[r3] = r0     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = "addNode"
            r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            boolean r0 = p040c.p200q.p201a.p264c.p276d.p289n.C3562m.m9088i()
            if (r0 == 0) goto L_0x0095
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0095 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ Exception -> 0x0095 }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x0095 }
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p289n.C3566q.<clinit>():void");
    }

    /* renamed from: a */
    public static void m9097a(@NonNull WorkSource workSource, int i, @NonNull String str) {
        Method method = f6550b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = f6549a;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    @NonNull
    /* renamed from: b */
    public static WorkSource m9098b(@NonNull Context context, @NonNull String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c = C3573c.m9110a(context).mo20845c(str, 0);
                if (c == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i = c.uid;
                WorkSource workSource = new WorkSource();
                m9097a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m9099c(@NonNull Context context) {
        if (context == null || context.getPackageManager() == null || C3573c.m9110a(context).mo20844b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
