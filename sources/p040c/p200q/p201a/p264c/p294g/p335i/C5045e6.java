package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzig;

/* renamed from: c.q.a.c.g.i.e6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5045e6 {

    /* renamed from: a */
    public static volatile zzig f9875a;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        throw r14;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0148 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzig m14013a(android.content.Context r14) {
        /*
            java.lang.Class<c.q.a.c.g.i.e6> r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5045e6.class
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzig r1 = f9875a     // Catch:{ all -> 0x0163 }
            if (r1 != 0) goto L_0x0161
            java.lang.String r1 = android.os.Build.TYPE     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = android.os.Build.TAGS     // Catch:{ all -> 0x0163 }
            java.lang.String r3 = "eng"
            boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x0163 }
            if (r3 != 0) goto L_0x001b
            java.lang.String r3 = "userdebug"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "dev-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0163 }
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = "test-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            com.google.android.gms.internal.measurement.zzig r14 = com.google.android.gms.internal.measurement.zzig.zzc()     // Catch:{ all -> 0x0163 }
        L_0x0030:
            r1 = r14
            goto L_0x0159
        L_0x0033:
            boolean r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5246r5.m14718b()     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r14.isDeviceProtectedStorage()     // Catch:{ all -> 0x0163 }
            if (r1 != 0) goto L_0x0043
            android.content.Context r14 = r14.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0163 }
        L_0x0043:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0163 }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x015c }
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r4 = r14.getDir(r4, r2)     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r5 = "overrides.txt"
            r3.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x0068 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x015c }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.measurement.zzig r3 = com.google.android.gms.internal.measurement.zzig.zzd(r3)     // Catch:{ all -> 0x015c }
            goto L_0x006c
        L_0x0063:
            com.google.android.gms.internal.measurement.zzig r3 = com.google.android.gms.internal.measurement.zzig.zzc()     // Catch:{ all -> 0x015c }
            goto L_0x006c
        L_0x0068:
            com.google.android.gms.internal.measurement.zzig r3 = com.google.android.gms.internal.measurement.zzig.zzc()     // Catch:{ all -> 0x015c }
        L_0x006c:
            boolean r4 = r3.zzb()     // Catch:{ all -> 0x015c }
            if (r4 == 0) goto L_0x0150
            java.lang.Object r3 = r3.zza()     // Catch:{ all -> 0x015c }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x015c }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0149 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0149 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0149 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0149 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0149 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0149 }
            r5 = 1
            androidx.collection.SimpleArrayMap r6 = new androidx.collection.SimpleArrayMap     // Catch:{ all -> 0x012d }
            r6.<init>()     // Catch:{ all -> 0x012d }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x012d }
            r7.<init>()     // Catch:{ all -> 0x012d }
        L_0x0092:
            java.lang.String r8 = r4.readLine()     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x0100
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch:{ all -> 0x012d }
            int r11 = r9.length     // Catch:{ all -> 0x012d }
            if (r11 == r10) goto L_0x00b3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r9.<init>()     // Catch:{ all -> 0x012d }
            java.lang.String r10 = "Invalid: "
            r9.append(r10)     // Catch:{ all -> 0x012d }
            r9.append(r8)     // Catch:{ all -> 0x012d }
            r9.toString()     // Catch:{ all -> 0x012d }
            goto L_0x0092
        L_0x00b3:
            r8 = r9[r2]     // Catch:{ all -> 0x012d }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x012d }
            r10.<init>(r8)     // Catch:{ all -> 0x012d }
            r8 = r9[r5]     // Catch:{ all -> 0x012d }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x012d }
            r11.<init>(r8)     // Catch:{ all -> 0x012d }
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x012d }
            r11 = 2
            r12 = r9[r11]     // Catch:{ all -> 0x012d }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x012d }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x012d }
            if (r12 != 0) goto L_0x00e8
            r9 = r9[r11]     // Catch:{ all -> 0x012d }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x012d }
            r11.<init>(r9)     // Catch:{ all -> 0x012d }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x012d }
            int r9 = r12.length()     // Catch:{ all -> 0x012d }
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto L_0x00e5
            if (r12 != r11) goto L_0x00e8
        L_0x00e5:
            r7.put(r11, r12)     // Catch:{ all -> 0x012d }
        L_0x00e8:
            boolean r9 = r6.containsKey(r10)     // Catch:{ all -> 0x012d }
            if (r9 != 0) goto L_0x00f6
            androidx.collection.SimpleArrayMap r9 = new androidx.collection.SimpleArrayMap     // Catch:{ all -> 0x012d }
            r9.<init>()     // Catch:{ all -> 0x012d }
            r6.put(r10, r9)     // Catch:{ all -> 0x012d }
        L_0x00f6:
            java.lang.Object r9 = r6.get(r10)     // Catch:{ all -> 0x012d }
            androidx.collection.SimpleArrayMap r9 = (androidx.collection.SimpleArrayMap) r9     // Catch:{ all -> 0x012d }
            r9.put(r8, r12)     // Catch:{ all -> 0x012d }
            goto L_0x0092
        L_0x0100:
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012d }
            java.lang.String r14 = r14.getPackageName()     // Catch:{ all -> 0x012d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            r7.<init>()     // Catch:{ all -> 0x012d }
            java.lang.String r8 = "Parsed "
            r7.append(r8)     // Catch:{ all -> 0x012d }
            r7.append(r3)     // Catch:{ all -> 0x012d }
            java.lang.String r3 = " for Android package "
            r7.append(r3)     // Catch:{ all -> 0x012d }
            r7.append(r14)     // Catch:{ all -> 0x012d }
            r7.toString()     // Catch:{ all -> 0x012d }
            c.q.a.c.g.i.x5 r14 = new c.q.a.c.g.i.x5     // Catch:{ all -> 0x012d }
            r14.<init>(r6)     // Catch:{ all -> 0x012d }
            r4.close()     // Catch:{ IOException -> 0x0149 }
            com.google.android.gms.internal.measurement.zzig r14 = com.google.android.gms.internal.measurement.zzig.zzd(r14)     // Catch:{ all -> 0x015c }
            goto L_0x0154
        L_0x012d:
            r14 = move-exception
            r4.close()     // Catch:{ all -> 0x0132 }
            goto L_0x0148
        L_0x0132:
            r3 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0148 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r4[r2] = r6     // Catch:{ Exception -> 0x0148 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r7, r4)     // Catch:{ Exception -> 0x0148 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0148 }
            r5[r2] = r3     // Catch:{ Exception -> 0x0148 }
            r4.invoke(r14, r5)     // Catch:{ Exception -> 0x0148 }
        L_0x0148:
            throw r14     // Catch:{ IOException -> 0x0149 }
        L_0x0149:
            r14 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x015c }
            r2.<init>(r14)     // Catch:{ all -> 0x015c }
            throw r2     // Catch:{ all -> 0x015c }
        L_0x0150:
            com.google.android.gms.internal.measurement.zzig r14 = com.google.android.gms.internal.measurement.zzig.zzc()     // Catch:{ all -> 0x015c }
        L_0x0154:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0163 }
            goto L_0x0030
        L_0x0159:
            f9875a = r1     // Catch:{ all -> 0x0163 }
            goto L_0x0161
        L_0x015c:
            r14 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0163 }
            throw r14     // Catch:{ all -> 0x0163 }
        L_0x0161:
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
            return r1
        L_0x0163:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5045e6.m14013a(android.content.Context):com.google.android.gms.internal.measurement.zzig");
    }
}
