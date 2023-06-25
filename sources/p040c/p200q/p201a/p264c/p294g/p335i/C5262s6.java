package p040c.p200q.p201a.p264c.p294g.p335i;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.q.a.c.g.i.s6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class C5262s6 {

    /* renamed from: g */
    public static final Object f10126g = new Object();

    /* renamed from: h */
    public static volatile C5217p6 f10127h;

    /* renamed from: i */
    public static final AtomicInteger f10128i = new AtomicInteger();

    /* renamed from: j */
    public static final /* synthetic */ int f10129j = 0;

    /* renamed from: a */
    public final C5202o6 f10130a;

    /* renamed from: b */
    public final String f10131b;

    /* renamed from: c */
    public final Object f10132c;

    /* renamed from: d */
    public volatile int f10133d = -1;

    /* renamed from: e */
    public volatile Object f10134e;

    /* renamed from: f */
    public final boolean f10135f;

    static {
        new AtomicReference();
        new C5292u6(C5125j6.f9959a, (byte[]) null);
    }

    public /* synthetic */ C5262s6(C5202o6 o6Var, String str, Object obj, boolean z, C5247r6 r6Var) {
        if (o6Var.f10031b != null) {
            this.f10130a = o6Var;
            this.f10131b = str;
            this.f10132c = obj;
            this.f10135f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    public static void m14809d() {
        f10128i.incrementAndGet();
    }

    /* renamed from: e */
    public static void m14810e(Context context) {
        if (f10127h == null) {
            synchronized (f10126g) {
                if (f10127h == null) {
                    synchronized (f10126g) {
                        C5217p6 p6Var = f10127h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (p6Var == null || p6Var.mo27503a() != context) {
                            C5306v5.m15122e();
                            C5277t6.m14952b();
                            C5029d6.m13968e();
                            f10127h = new C5261s5(context, C5014c7.m13908a(new C5109i6(context)));
                            f10128i.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo27357a(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r2 = r2.mo26935d(mo27634c());
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo27633b() {
        /*
            r6 = this;
            boolean r0 = r6.f10135f
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r6.f10131b
            if (r0 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "flagName must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = f10128i
            int r0 = r0.get()
            int r1 = r6.f10133d
            if (r1 >= r0) goto L_0x00e2
            monitor-enter(r6)
            int r1 = r6.f10133d     // Catch:{ all -> 0x00df }
            if (r1 >= r0) goto L_0x00dd
            c.q.a.c.g.i.p6 r1 = f10127h     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00d7
            c.q.a.c.g.i.o6 r2 = r6.f10130a     // Catch:{ all -> 0x00df }
            boolean r3 = r2.f10035f     // Catch:{ all -> 0x00df }
            android.net.Uri r2 = r2.f10031b     // Catch:{ all -> 0x00df }
            r3 = 0
            if (r2 == 0) goto L_0x0056
            android.content.Context r2 = r1.mo27503a()     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.o6 r4 = r6.f10130a     // Catch:{ all -> 0x00df }
            android.net.Uri r4 = r4.f10031b     // Catch:{ all -> 0x00df }
            boolean r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5061f6.m14065a(r2, r4)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x0054
            c.q.a.c.g.i.o6 r2 = r6.f10130a     // Catch:{ all -> 0x00df }
            boolean r2 = r2.f10037h     // Catch:{ all -> 0x00df }
            android.content.Context r2 = r1.mo27503a()     // Catch:{ all -> 0x00df }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.o6 r4 = r6.f10130a     // Catch:{ all -> 0x00df }
            android.net.Uri r4 = r4.f10031b     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.h6 r5 = p040c.p200q.p201a.p264c.p294g.p335i.C5093h6.f9924e     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.v5 r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5306v5.m15121a(r2, r4, r5)     // Catch:{ all -> 0x00df }
            goto L_0x0064
        L_0x0054:
            r2 = r3
            goto L_0x0064
        L_0x0056:
            android.content.Context r2 = r1.mo27503a()     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.o6 r4 = r6.f10130a     // Catch:{ all -> 0x00df }
            java.lang.String r4 = r4.f10030a     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.h6 r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5093h6.f9924e     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.t6 r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5277t6.m14951a(r2, r3, r4)     // Catch:{ all -> 0x00df }
        L_0x0064:
            if (r2 == 0) goto L_0x0075
            java.lang.String r4 = r6.mo27634c()     // Catch:{ all -> 0x00df }
            java.lang.Object r2 = r2.mo26935d(r4)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x0075
            java.lang.Object r2 = r6.mo27357a(r2)     // Catch:{ all -> 0x00df }
            goto L_0x0076
        L_0x0075:
            r2 = r3
        L_0x0076:
            if (r2 == 0) goto L_0x0079
            goto L_0x00a5
        L_0x0079:
            c.q.a.c.g.i.o6 r2 = r6.f10130a     // Catch:{ all -> 0x00df }
            boolean r4 = r2.f10034e     // Catch:{ all -> 0x00df }
            if (r4 != 0) goto L_0x00a0
            c.q.a.c.g.i.w6 r2 = r2.f10038i     // Catch:{ all -> 0x00df }
            android.content.Context r2 = r1.mo27503a()     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.d6 r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5029d6.m13967a(r2)     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.o6 r4 = r6.f10130a     // Catch:{ all -> 0x00df }
            boolean r5 = r4.f10034e     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0091
            r4 = r3
            goto L_0x0095
        L_0x0091:
            java.lang.String r4 = r4.f10032c     // Catch:{ all -> 0x00df }
            java.lang.String r4 = r6.f10131b     // Catch:{ all -> 0x00df }
        L_0x0095:
            java.lang.String r2 = r2.mo26935d(r4)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r6.mo27357a(r2)     // Catch:{ all -> 0x00df }
            goto L_0x00a1
        L_0x00a0:
            r2 = r3
        L_0x00a1:
            if (r2 != 0) goto L_0x00a5
            java.lang.Object r2 = r6.f10132c     // Catch:{ all -> 0x00df }
        L_0x00a5:
            c.q.a.c.g.i.y6 r1 = r1.mo27504b()     // Catch:{ all -> 0x00df }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzig r1 = (com.google.android.gms.internal.measurement.zzig) r1     // Catch:{ all -> 0x00df }
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00d2
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.x5 r1 = (p040c.p200q.p201a.p264c.p294g.p335i.C5336x5) r1     // Catch:{ all -> 0x00df }
            c.q.a.c.g.i.o6 r2 = r6.f10130a     // Catch:{ all -> 0x00df }
            android.net.Uri r4 = r2.f10031b     // Catch:{ all -> 0x00df }
            java.lang.String r5 = r2.f10030a     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.f10033d     // Catch:{ all -> 0x00df }
            java.lang.String r5 = r6.f10131b     // Catch:{ all -> 0x00df }
            java.lang.String r1 = r1.mo27892a(r4, r3, r2, r5)     // Catch:{ all -> 0x00df }
            if (r1 != 0) goto L_0x00ce
            java.lang.Object r2 = r6.f10132c     // Catch:{ all -> 0x00df }
            goto L_0x00d2
        L_0x00ce:
            java.lang.Object r2 = r6.mo27357a(r1)     // Catch:{ all -> 0x00df }
        L_0x00d2:
            r6.f10134e = r2     // Catch:{ all -> 0x00df }
            r6.f10133d = r0     // Catch:{ all -> 0x00df }
            goto L_0x00dd
        L_0x00d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00df }
            r0.<init>(r2)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r6)     // Catch:{ all -> 0x00df }
            goto L_0x00e2
        L_0x00df:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00df }
            throw r0
        L_0x00e2:
            java.lang.Object r0 = r6.f10134e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5262s6.mo27633b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo27634c() {
        String str = this.f10130a.f10033d;
        return this.f10131b;
    }
}
