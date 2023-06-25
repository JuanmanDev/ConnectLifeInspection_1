package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p040c.p200q.p201a.p264c.p276d.C3326c;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p293f.C3592d;
import p040c.p200q.p201a.p264c.p293f.C3593e;
import p040c.p200q.p201a.p264c.p293f.C3594f;
import p040c.p200q.p201a.p264c.p293f.C3595g;
import p040c.p200q.p201a.p264c.p293f.C3597i;
import p040c.p200q.p201a.p264c.p293f.C3599k;
import p040c.p200q.p201a.p264c.p293f.C3600l;
import p040c.p200q.p201a.p264c.p293f.C3601m;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class DynamiteModule {
    @NonNull

    /* renamed from: b */
    public static final C4074a f8367b = new C3594f();
    @NonNull

    /* renamed from: c */
    public static final C4074a f8368c = new C3595g();
    @Nullable

    /* renamed from: d */
    public static Boolean f8369d = null;
    @Nullable

    /* renamed from: e */
    public static String f8370e = null;

    /* renamed from: f */
    public static boolean f8371f = false;

    /* renamed from: g */
    public static int f8372g = -1;
    @Nullable

    /* renamed from: h */
    public static Boolean f8373h;

    /* renamed from: i */
    public static final ThreadLocal f8374i = new ThreadLocal();

    /* renamed from: j */
    public static final ThreadLocal f8375j = new C3592d();

    /* renamed from: k */
    public static final C4074a.C4075a f8376k = new C3593e();
    @Nullable

    /* renamed from: l */
    public static C3600l f8377l;
    @Nullable

    /* renamed from: m */
    public static C3601m f8378m;

    /* renamed from: a */
    public final Context f8379a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class DynamiteLoaderClassLoader {
        @Nullable
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, C3599k kVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, C3599k kVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C4074a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public interface C4075a {
            /* renamed from: a */
            int mo20862a(@NonNull Context context, @NonNull String str, boolean z);

            /* renamed from: b */
            int mo20863b(@NonNull Context context, @NonNull String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public static class C4076b {

            /* renamed from: a */
            public int f8380a = 0;

            /* renamed from: b */
            public int f8381b = 0;

            /* renamed from: c */
            public int f8382c = 0;
        }

        @NonNull
        /* renamed from: a */
        C4076b mo20864a(@NonNull Context context, @NonNull String str, @NonNull C4075a aVar);
    }

    public DynamiteModule(Context context) {
        C3495o.m8908j(context);
        this.f8379a = context;
    }

    /* renamed from: a */
    public static int m11030a(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C3487m.m8886a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            "Module descriptor id '" + String.valueOf(declaredField.get((Object) null)) + "' didn't match expected id '" + str + "'";
            return 0;
        } catch (ClassNotFoundException unused) {
            "Local module descriptor class for " + str + " not found.";
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    /* renamed from: b */
    public static int m11031b(@NonNull Context context, @NonNull String str) {
        return m11033e(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x024f, code lost:
        if (r1 != null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        if (r1 != null) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02bf  */
    @androidx.annotation.NonNull
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m11032d(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.NonNull com.google.android.gms.dynamite.DynamiteModule.C4074a r18, @androidx.annotation.NonNull java.lang.String r19) {
        /*
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            java.lang.ThreadLocal r0 = f8374i
            java.lang.Object r0 = r0.get()
            r5 = r0
            c.q.a.c.f.i r5 = (p040c.p200q.p201a.p264c.p293f.C3597i) r5
            c.q.a.c.f.i r6 = new c.q.a.c.f.i
            r7 = 0
            r6.<init>(r7)
            java.lang.ThreadLocal r0 = f8374i
            r0.set(r6)
            java.lang.ThreadLocal r0 = f8375j
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            long r8 = r0.longValue()
            r10 = 0
            java.lang.ThreadLocal r0 = f8375j     // Catch:{ all -> 0x02a6 }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02a6 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x02a6 }
            r0.set(r12)     // Catch:{ all -> 0x02a6 }
            com.google.android.gms.dynamite.DynamiteModule$a$a r0 = f8376k     // Catch:{ all -> 0x02a6 }
            com.google.android.gms.dynamite.DynamiteModule$a$b r12 = r2.mo20864a(r1, r3, r0)     // Catch:{ all -> 0x02a6 }
            int r0 = r12.f8380a     // Catch:{ all -> 0x02a6 }
            int r13 = r12.f8381b     // Catch:{ all -> 0x02a6 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a6 }
            r14.<init>()     // Catch:{ all -> 0x02a6 }
            java.lang.String r15 = "Considering local module "
            r14.append(r15)     // Catch:{ all -> 0x02a6 }
            r14.append(r3)     // Catch:{ all -> 0x02a6 }
            java.lang.String r15 = ":"
            r14.append(r15)     // Catch:{ all -> 0x02a6 }
            r14.append(r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r0 = " and remote module "
            r14.append(r0)     // Catch:{ all -> 0x02a6 }
            r14.append(r3)     // Catch:{ all -> 0x02a6 }
            java.lang.String r0 = ":"
            r14.append(r0)     // Catch:{ all -> 0x02a6 }
            r14.append(r13)     // Catch:{ all -> 0x02a6 }
            r14.toString()     // Catch:{ all -> 0x02a6 }
            int r0 = r12.f8382c     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0272
            r13 = -1
            if (r0 != r13) goto L_0x0075
            int r0 = r12.f8380a     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0272
            r0 = r13
        L_0x0075:
            r14 = 1
            if (r0 != r14) goto L_0x007c
            int r15 = r12.f8381b     // Catch:{ all -> 0x02a6 }
            if (r15 == 0) goto L_0x0272
        L_0x007c:
            if (r0 != r13) goto L_0x00a2
            com.google.android.gms.dynamite.DynamiteModule r0 = m11035g(r1, r3)     // Catch:{ all -> 0x02a6 }
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x008c
            java.lang.ThreadLocal r1 = f8375j
            r1.remove()
            goto L_0x0095
        L_0x008c:
            java.lang.ThreadLocal r1 = f8375j
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x0095:
            android.database.Cursor r1 = r6.f6569a
            if (r1 == 0) goto L_0x009c
        L_0x0099:
            r1.close()
        L_0x009c:
            java.lang.ThreadLocal r1 = f8374i
            r1.set(r5)
            return r0
        L_0x00a2:
            if (r0 != r14) goto L_0x025b
            int r0 = r12.f8381b     // Catch:{ LoadingException -> 0x020c }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            boolean r16 = m11038j(r17)     // Catch:{ all -> 0x01ef }
            if (r16 == 0) goto L_0x01e7
            java.lang.Boolean r16 = f8369d     // Catch:{ all -> 0x01ef }
            monitor-exit(r4)     // Catch:{ all -> 0x01ef }
            if (r16 == 0) goto L_0x01df
            boolean r16 = r16.booleanValue()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r14 = 2
            if (r16 == 0) goto L_0x0147
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r13.<init>()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r15 = "Selected remote version of "
            r13.append(r15)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r13.append(r3)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r15 = ", version >= "
            r13.append(r15)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r13.append(r0)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r13.toString()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.f.m r13 = f8378m     // Catch:{ all -> 0x0144 }
            monitor-exit(r4)     // Catch:{ all -> 0x0144 }
            if (r13 == 0) goto L_0x013c
            java.lang.ThreadLocal r15 = f8374i     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.Object r15 = r15.get()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.f.i r15 = (p040c.p200q.p201a.p264c.p293f.C3597i) r15     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            if (r15 == 0) goto L_0x0134
            android.database.Cursor r10 = r15.f6569a     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            if (r10 == 0) goto L_0x0134
            android.content.Context r10 = r17.getApplicationContext()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            android.database.Cursor r11 = r15.f6569a     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r7)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            int r15 = f8372g     // Catch:{ all -> 0x0131 }
            if (r15 < r14) goto L_0x00f5
            r14 = 1
            goto L_0x00f6
        L_0x00f5:
            r14 = 0
        L_0x00f6:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x0131 }
            monitor-exit(r4)     // Catch:{ all -> 0x0131 }
            boolean r4 = r14.booleanValue()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            if (r4 == 0) goto L_0x010e
            c.q.a.c.e.a r4 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r10)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.e.a r10 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r11)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.e.a r0 = r13.mo20873k(r4, r3, r0, r10)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            goto L_0x011a
        L_0x010e:
            c.q.a.c.e.a r4 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r10)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.e.a r10 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r11)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.e.a r0 = r13.mo20872g(r4, r3, r0, r10)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x011a:
            java.lang.Object r0 = p040c.p200q.p201a.p264c.p292e.C3587b.m9123g(r0)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r4.<init>(r0)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            goto L_0x01ad
        L_0x0129:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r4 = "Failed to get module context"
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x0131:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0131 }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x0134:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r4 = "No result cursor"
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x013c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x0144:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x0147:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r4.<init>()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r10 = "Selected remote version of "
            r4.append(r10)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r4.append(r3)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r10 = ", version >= "
            r4.append(r10)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r4.append(r0)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r4.toString()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.f.l r4 = m11039k(r17)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            if (r4 == 0) goto L_0x01d7
            int r10 = r4.mo20869g()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r11 = 3
            if (r10 < r11) goto L_0x018d
            java.lang.ThreadLocal r10 = f8374i     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.Object r10 = r10.get()     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.f.i r10 = (p040c.p200q.p201a.p264c.p293f.C3597i) r10     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            if (r10 == 0) goto L_0x0185
            c.q.a.c.e.a r11 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r17)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            android.database.Cursor r10 = r10.f6569a     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.e.a r10 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r10)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.e.a r0 = r4.mo20866a0(r11, r3, r0, r10)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            goto L_0x01a0
        L_0x0185:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r4 = "No cached result cursor holder"
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x018d:
            if (r10 != r14) goto L_0x0198
            c.q.a.c.e.a r10 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r17)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.e.a r0 = r4.mo20867b0(r10, r3, r0)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            goto L_0x01a0
        L_0x0198:
            c.q.a.c.e.a r10 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r17)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            c.q.a.c.e.a r0 = r4.mo20865Z(r10, r3, r0)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x01a0:
            java.lang.Object r0 = p040c.p200q.p201a.p264c.p292e.C3587b.m9123g(r0)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            if (r0 == 0) goto L_0x01cf
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            r4.<init>(r0)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x01ad:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01b9
            java.lang.ThreadLocal r0 = f8375j
            r0.remove()
            goto L_0x01c2
        L_0x01b9:
            java.lang.ThreadLocal r0 = f8375j
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.set(r1)
        L_0x01c2:
            android.database.Cursor r0 = r6.f6569a
            if (r0 == 0) goto L_0x01c9
            r0.close()
        L_0x01c9:
            java.lang.ThreadLocal r0 = f8374i
            r0.set(r5)
            return r4
        L_0x01cf:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r4 = "Failed to load remote module."
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x01d7:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x01df:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            java.lang.String r4 = "Failed to determine which loading route to use."
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x01e7:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x01ef }
            java.lang.String r10 = "Remote loading disabled"
            r0.<init>(r10, r7)     // Catch:{ all -> 0x01ef }
            throw r0     // Catch:{ all -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ef }
            throw r0     // Catch:{ RemoteException -> 0x01f6, LoadingException -> 0x01f4, all -> 0x01f2 }
        L_0x01f2:
            r0 = move-exception
            goto L_0x01f8
        L_0x01f4:
            r0 = move-exception
            goto L_0x0203
        L_0x01f6:
            r0 = move-exception
            goto L_0x0204
        L_0x01f8:
            p040c.p200q.p201a.p264c.p276d.p289n.C3555f.m9064a(r1, r0)     // Catch:{ all -> 0x02a2 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x02a2 }
            java.lang.String r10 = "Failed to load remote module."
            r4.<init>(r10, r0, r7)     // Catch:{ all -> 0x02a2 }
            throw r4     // Catch:{ all -> 0x02a2 }
        L_0x0203:
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x0204:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x02a2 }
            java.lang.String r10 = "Failed to load remote module."
            r4.<init>(r10, r0, r7)     // Catch:{ all -> 0x02a2 }
            throw r4     // Catch:{ all -> 0x02a2 }
        L_0x020c:
            r0 = move-exception
            java.lang.String r4 = r0.getMessage()     // Catch:{  }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{  }
            r10.<init>()     // Catch:{  }
            java.lang.String r11 = "Failed to load remote module: "
            r10.append(r11)     // Catch:{  }
            r10.append(r4)     // Catch:{  }
            r10.toString()     // Catch:{  }
            int r4 = r12.f8380a     // Catch:{  }
            if (r4 == 0) goto L_0x0253
            c.q.a.c.f.j r10 = new c.q.a.c.f.j     // Catch:{  }
            r11 = 0
            r10.<init>(r4, r11)     // Catch:{  }
            com.google.android.gms.dynamite.DynamiteModule$a$b r2 = r2.mo20864a(r1, r3, r10)     // Catch:{  }
            int r2 = r2.f8382c     // Catch:{  }
            r4 = -1
            if (r2 != r4) goto L_0x0253
            com.google.android.gms.dynamite.DynamiteModule r0 = m11035g(r1, r3)     // Catch:{  }
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0244
            java.lang.ThreadLocal r1 = f8375j
            r1.remove()
            goto L_0x024d
        L_0x0244:
            java.lang.ThreadLocal r1 = f8375j
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x024d:
            android.database.Cursor r1 = r6.f6569a
            if (r1 == 0) goto L_0x009c
            goto L_0x0099
        L_0x0253:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r1.<init>(r2, r0, r7)     // Catch:{  }
            throw r1     // Catch:{  }
        L_0x025b:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
            r2.<init>()     // Catch:{  }
            java.lang.String r3 = "VersionPolicy returned invalid code:"
            r2.append(r3)     // Catch:{  }
            r2.append(r0)     // Catch:{  }
            java.lang.String r0 = r2.toString()     // Catch:{  }
            r1.<init>(r0, r7)     // Catch:{  }
            throw r1     // Catch:{  }
        L_0x0272:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            int r1 = r12.f8380a     // Catch:{  }
            int r2 = r12.f8381b     // Catch:{  }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{  }
            r4.<init>()     // Catch:{  }
            java.lang.String r10 = "No acceptable module "
            r4.append(r10)     // Catch:{  }
            r4.append(r3)     // Catch:{  }
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch:{  }
            r4.append(r1)     // Catch:{  }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{  }
            r4.append(r2)     // Catch:{  }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{  }
            java.lang.String r1 = r4.toString()     // Catch:{  }
            r0.<init>(r1, r7)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x02a2:
            r0 = move-exception
            r1 = 0
            goto L_0x02a8
        L_0x02a6:
            r0 = move-exception
            r1 = r10
        L_0x02a8:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x02b2
            java.lang.ThreadLocal r1 = f8375j
            r1.remove()
            goto L_0x02bb
        L_0x02b2:
            java.lang.ThreadLocal r1 = f8375j
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x02bb:
            android.database.Cursor r1 = r6.f6569a
            if (r1 == 0) goto L_0x02c2
            r1.close()
        L_0x02c2:
            java.lang.ThreadLocal r1 = f8374i
            r1.set(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m11032d(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$a, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:17:0x003b=Splitter:B:17:0x003b, B:50:0x009c=Splitter:B:50:0x009c} */
    /* renamed from: e */
    public static int m11033e(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x019d }
            java.lang.Boolean r1 = f8369d     // Catch:{ all -> 0x019a }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00d4
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b4 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            m11036h(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x003f:
            boolean r5 = m11038j(r10)     // Catch:{ all -> 0x00b4 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x019a }
            return r3
        L_0x0048:
            boolean r5 = f8371f     // Catch:{ all -> 0x00b4 }
            if (r5 != 0) goto L_0x00a9
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b4 }
            boolean r5 = r5.equals(r2)     // Catch:{ all -> 0x00b4 }
            if (r5 == 0) goto L_0x0055
            goto L_0x00a9
        L_0x0055:
            r5 = 1
            int r5 = m11034f(r10, r11, r12, r5)     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r6 = f8370e     // Catch:{ LoadingException -> 0x009f }
            if (r6 == 0) goto L_0x009c
            boolean r6 = r6.isEmpty()     // Catch:{ LoadingException -> 0x009f }
            if (r6 == 0) goto L_0x0065
            goto L_0x009c
        L_0x0065:
            java.lang.ClassLoader r6 = p040c.p200q.p201a.p264c.p293f.C3590b.m9125a()     // Catch:{ LoadingException -> 0x009f }
            if (r6 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009f }
            r7 = 29
            if (r6 < r7) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r6 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r7 = f8370e     // Catch:{ LoadingException -> 0x009f }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r7)     // Catch:{ LoadingException -> 0x009f }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009f }
            r6.<init>(r7, r8)     // Catch:{ LoadingException -> 0x009f }
            goto L_0x008f
        L_0x0081:
            c.q.a.c.f.c r6 = new c.q.a.c.f.c     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r7 = f8370e     // Catch:{ LoadingException -> 0x009f }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r7)     // Catch:{ LoadingException -> 0x009f }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009f }
            r6.<init>(r7, r8)     // Catch:{ LoadingException -> 0x009f }
        L_0x008f:
            m11036h(r6)     // Catch:{ LoadingException -> 0x009f }
            r1.set(r2, r6)     // Catch:{ LoadingException -> 0x009f }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x009f }
            f8369d = r6     // Catch:{ LoadingException -> 0x009f }
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x019a }
            return r5
        L_0x009c:
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x019a }
            return r5
        L_0x009f:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x00a9:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            goto L_0x00d2
        L_0x00b4:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            goto L_0x00bc
        L_0x00b9:
            r1 = move-exception
            goto L_0x00bc
        L_0x00bb:
            r1 = move-exception
        L_0x00bc:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x019a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r4.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x019a }
            r4.append(r1)     // Catch:{ all -> 0x019a }
            r4.toString()     // Catch:{ all -> 0x019a }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x019a }
        L_0x00d2:
            f8369d = r1     // Catch:{ all -> 0x019a }
        L_0x00d4:
            monitor-exit(r0)     // Catch:{ all -> 0x019a }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x00f6
            int r10 = m11034f(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00e0 }
            return r10
        L_0x00e0:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x019d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x019d }
            r12.<init>()     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x019d }
            r12.append(r11)     // Catch:{ all -> 0x019d }
            r12.toString()     // Catch:{ all -> 0x019d }
            return r3
        L_0x00f6:
            c.q.a.c.f.l r4 = m11039k(r10)     // Catch:{ all -> 0x019d }
            if (r4 != 0) goto L_0x00fe
            goto L_0x0191
        L_0x00fe:
            int r0 = r4.mo20869g()     // Catch:{ RemoteException -> 0x0176 }
            r1 = 3
            if (r0 < r1) goto L_0x015f
            java.lang.ThreadLocal r0 = f8374i     // Catch:{ RemoteException -> 0x0176 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0176 }
            c.q.a.c.f.i r0 = (p040c.p200q.p201a.p264c.p293f.C3597i) r0     // Catch:{ RemoteException -> 0x0176 }
            if (r0 == 0) goto L_0x0119
            android.database.Cursor r0 = r0.f6569a     // Catch:{ RemoteException -> 0x0176 }
            if (r0 == 0) goto L_0x0119
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0176 }
            goto L_0x0191
        L_0x0119:
            c.q.a.c.e.a r5 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r10)     // Catch:{ RemoteException -> 0x0176 }
            java.lang.ThreadLocal r0 = f8375j     // Catch:{ RemoteException -> 0x0176 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0176 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0176 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0176 }
            r6 = r11
            r7 = r12
            c.q.a.c.e.a r11 = r4.mo20868c0(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0176 }
            java.lang.Object r11 = p040c.p200q.p201a.p264c.p292e.C3587b.m9123g(r11)     // Catch:{ RemoteException -> 0x0176 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0176 }
            if (r11 == 0) goto L_0x0159
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x0156, all -> 0x0153 }
            if (r12 != 0) goto L_0x013e
            goto L_0x0159
        L_0x013e:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x0156, all -> 0x0153 }
            if (r12 <= 0) goto L_0x014b
            boolean r0 = m11037i(r11)     // Catch:{ RemoteException -> 0x0156, all -> 0x0153 }
            if (r0 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r2 = r11
        L_0x014c:
            if (r2 == 0) goto L_0x0151
            r2.close()     // Catch:{ all -> 0x019d }
        L_0x0151:
            r3 = r12
            goto L_0x0191
        L_0x0153:
            r12 = move-exception
            r2 = r11
            goto L_0x0194
        L_0x0156:
            r12 = move-exception
            r2 = r11
            goto L_0x0178
        L_0x0159:
            if (r11 == 0) goto L_0x0191
            r11.close()     // Catch:{ all -> 0x019d }
            goto L_0x0191
        L_0x015f:
            r1 = 2
            if (r0 != r1) goto L_0x016b
            c.q.a.c.e.a r0 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r10)     // Catch:{ RemoteException -> 0x0176 }
            int r3 = r4.mo20871v(r0, r11, r12)     // Catch:{ RemoteException -> 0x0176 }
            goto L_0x0191
        L_0x016b:
            c.q.a.c.e.a r0 = p040c.p200q.p201a.p264c.p292e.C3587b.m9124k(r10)     // Catch:{ RemoteException -> 0x0176 }
            int r3 = r4.mo20870k(r0, r11, r12)     // Catch:{ RemoteException -> 0x0176 }
            goto L_0x0191
        L_0x0174:
            r12 = r11
            goto L_0x0194
        L_0x0176:
            r11 = move-exception
            r12 = r11
        L_0x0178:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x0192 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
            r12.<init>()     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x0192 }
            r12.append(r11)     // Catch:{ all -> 0x0192 }
            r12.toString()     // Catch:{ all -> 0x0192 }
            if (r2 == 0) goto L_0x0191
            r2.close()     // Catch:{ all -> 0x019d }
        L_0x0191:
            return r3
        L_0x0192:
            r11 = move-exception
            goto L_0x0174
        L_0x0194:
            if (r2 == 0) goto L_0x0199
            r2.close()     // Catch:{ all -> 0x019d }
        L_0x0199:
            throw r12     // Catch:{ all -> 0x019d }
        L_0x019a:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x019a }
            throw r11     // Catch:{ all -> 0x019d }
        L_0x019d:
            r11 = move-exception
            p040c.p200q.p201a.p264c.p276d.p289n.C3555f.m9064a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m11033e(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c2  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m11034f(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f8375j     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r12.<init>()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f8370e = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f8372g = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = r11
        L_0x007f:
            f8371f = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = m11037i(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b1
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00ab:
            r10 = move-exception
            r11 = r10
            goto L_0x00c0
        L_0x00ae:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b1:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00be }
            if (r12 == 0) goto L_0x00b6
            throw r11     // Catch:{ all -> 0x00be }
        L_0x00b6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00be }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00be }
            throw r12     // Catch:{ all -> 0x00be }
        L_0x00be:
            r11 = move-exception
            r0 = r10
        L_0x00c0:
            if (r0 == 0) goto L_0x00c5
            r0.close()
        L_0x00c5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m11034f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: g */
    public static DynamiteModule m11035g(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: h */
    public static void m11036h(ClassLoader classLoader) {
        C3601m mVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                mVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C3601m) {
                    mVar = (C3601m) queryLocalInterface;
                } else {
                    mVar = new C3601m(iBinder);
                }
            }
            f8378m = mVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (C3599k) null);
        }
    }

    /* renamed from: i */
    public static boolean m11037i(Cursor cursor) {
        C3597i iVar = (C3597i) f8374i.get();
        if (iVar == null || iVar.f6569a != null) {
            return false;
        }
        iVar.f6569a = cursor;
        return true;
    }

    /* renamed from: j */
    public static boolean m11038j(Context context) {
        ApplicationInfo applicationInfo;
        if (Boolean.TRUE.equals((Object) null) || Boolean.TRUE.equals(f8373h)) {
            return true;
        }
        boolean z = false;
        if (f8373h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C3326c.m8424f().mo20389h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f8373h = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f8371f = true;
            }
        }
        return z;
    }

    @Nullable
    /* renamed from: k */
    public static C3600l m11039k(Context context) {
        C3600l lVar;
        synchronized (DynamiteModule.class) {
            C3600l lVar2 = f8377l;
            if (lVar2 != null) {
                return lVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    lVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    lVar = queryLocalInterface instanceof C3600l ? (C3600l) queryLocalInterface : new C3600l(iBinder);
                }
                if (lVar != null) {
                    f8377l = lVar;
                    return lVar;
                }
            } catch (Exception e) {
                "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage();
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: c */
    public IBinder mo24664c(@NonNull String str) {
        try {
            return (IBinder) this.f8379a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, (C3599k) null);
        }
    }
}
