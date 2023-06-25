package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.internal.zzah;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.y2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5702y2 extends C5432b4 {

    /* renamed from: c */
    public String f11121c;

    /* renamed from: d */
    public String f11122d;

    /* renamed from: e */
    public int f11123e;

    /* renamed from: f */
    public String f11124f;

    /* renamed from: g */
    public long f11125g;

    /* renamed from: h */
    public final long f11126h;

    /* renamed from: i */
    public List f11127i;

    /* renamed from: j */
    public String f11128j;

    /* renamed from: k */
    public int f11129k;

    /* renamed from: l */
    public String f11130l;

    /* renamed from: m */
    public String f11131m;

    /* renamed from: n */
    public String f11132n;

    /* renamed from: o */
    public long f11133o = 0;

    /* renamed from: p */
    public String f11134p = null;

    public C5702y2(C5648t4 t4Var, long j) {
        super(t4Var);
        this.f11126h = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0187 A[Catch:{ IllegalStateException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0190 A[Catch:{ IllegalStateException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b8 A[Catch:{ IllegalStateException -> 0x01d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0248  */
    @androidx.annotation.WorkerThread
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28109l() {
        /*
            r11 = this;
            c.q.a.c.i.b.t4 r0 = r11.f10699a
            android.content.Context r0 = r0.mo28490f()
            java.lang.String r0 = r0.getPackageName()
            c.q.a.c.i.b.t4 r1 = r11.f10699a
            android.content.Context r1 = r1.mo28490f()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0034
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28339r()
            java.lang.Object r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo28260b(r9, r8)
            goto L_0x0099
        L_0x0034:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            goto L_0x004c
        L_0x0039:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28339r()
            java.lang.Object r8 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo28260b(r9, r8)
        L_0x004c:
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = "manual_install"
            goto L_0x005a
        L_0x0051:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005a
            r6 = r4
        L_0x005a:
            c.q.a.c.i.b.t4 r7 = r11.f10699a     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r7 = r7.mo28490f()     // Catch:{ NameNotFoundException -> 0x0084 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0084 }
            if (r7 == 0) goto L_0x0099
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0084 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0084 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0084 }
            if (r9 != 0) goto L_0x007b
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0084 }
            goto L_0x007c
        L_0x007b:
            r8 = r2
        L_0x007c:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0081 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0081 }
            goto L_0x0099
        L_0x0081:
            r7 = r2
            r2 = r8
            goto L_0x0085
        L_0x0084:
            r7 = r2
        L_0x0085:
            c.q.a.c.i.b.t4 r8 = r11.f10699a
            c.q.a.c.i.b.i3 r8 = r8.mo28487b()
            c.q.a.c.i.b.g3 r8 = r8.mo28339r()
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo28261c(r10, r9, r2)
            r2 = r7
        L_0x0099:
            r11.f11121c = r0
            r11.f11124f = r6
            r11.f11122d = r2
            r11.f11123e = r3
            r2 = 0
            r11.f11125g = r2
            c.q.a.c.i.b.t4 r2 = r11.f10699a
            java.lang.String r2 = r2.mo28630O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c2
            c.q.a.c.i.b.t4 r2 = r11.f10699a
            java.lang.String r2 = r2.mo28631P()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c2
            r2 = r3
            goto L_0x00c3
        L_0x00c2:
            r2 = r5
        L_0x00c3:
            c.q.a.c.i.b.t4 r6 = r11.f10699a
            int r6 = r6.mo28647x()
            switch(r6) {
                case 0: goto L_0x014d;
                case 1: goto L_0x013d;
                case 2: goto L_0x012d;
                case 3: goto L_0x011d;
                case 4: goto L_0x010d;
                case 5: goto L_0x00fd;
                case 6: goto L_0x00ed;
                case 7: goto L_0x00dd;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28342u()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.mo28259a(r8)
            goto L_0x015c
        L_0x00dd:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28342u()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.mo28259a(r8)
            goto L_0x015c
        L_0x00ed:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28345x()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.mo28259a(r8)
            goto L_0x015c
        L_0x00fd:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28343v()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.mo28259a(r8)
            goto L_0x015c
        L_0x010d:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28342u()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.mo28259a(r8)
            goto L_0x015c
        L_0x011d:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28342u()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.mo28259a(r8)
            goto L_0x015c
        L_0x012d:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28343v()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.mo28259a(r8)
            goto L_0x015c
        L_0x013d:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28342u()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.mo28259a(r8)
            goto L_0x015c
        L_0x014d:
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            c.q.a.c.i.b.i3 r7 = r7.mo28487b()
            c.q.a.c.i.b.g3 r7 = r7.mo28343v()
            java.lang.String r8 = "App measurement collection enabled"
            r7.mo28259a(r8)
        L_0x015c:
            r11.f11130l = r4
            r11.f11131m = r4
            c.q.a.c.i.b.t4 r7 = r11.f10699a
            r7.mo28489d()
            if (r2 == 0) goto L_0x016f
            c.q.a.c.i.b.t4 r2 = r11.f10699a
            java.lang.String r2 = r2.mo28630O()
            r11.f11131m = r2
        L_0x016f:
            c.q.a.c.i.b.t4 r2 = r11.f10699a     // Catch:{ IllegalStateException -> 0x01d7 }
            android.content.Context r2 = r2.mo28490f()     // Catch:{ IllegalStateException -> 0x01d7 }
            c.q.a.c.i.b.t4 r7 = r11.f10699a     // Catch:{ IllegalStateException -> 0x01d7 }
            java.lang.String r7 = r7.mo28633R()     // Catch:{ IllegalStateException -> 0x01d7 }
            java.lang.String r8 = "google_app_id"
            java.lang.String r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5507h7.m15764b(r2, r8, r7)     // Catch:{ IllegalStateException -> 0x01d7 }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01d7 }
            if (r3 == r7) goto L_0x0188
            r4 = r2
        L_0x0188:
            r11.f11130l = r4     // Catch:{ IllegalStateException -> 0x01d7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01d7 }
            if (r2 != 0) goto L_0x01b6
            c.q.a.c.i.b.t4 r2 = r11.f10699a     // Catch:{ IllegalStateException -> 0x01d7 }
            android.content.Context r2 = r2.mo28490f()     // Catch:{ IllegalStateException -> 0x01d7 }
            c.q.a.c.i.b.t4 r3 = r11.f10699a     // Catch:{ IllegalStateException -> 0x01d7 }
            java.lang.String r3 = r3.mo28633R()     // Catch:{ IllegalStateException -> 0x01d7 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r2)     // Catch:{ IllegalStateException -> 0x01d7 }
            android.content.res.Resources r4 = r2.getResources()     // Catch:{ IllegalStateException -> 0x01d7 }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x01d7 }
            if (r7 != 0) goto L_0x01aa
            goto L_0x01ae
        L_0x01aa:
            java.lang.String r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5564m4.m15891a(r2)     // Catch:{ IllegalStateException -> 0x01d7 }
        L_0x01ae:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5564m4.m15892b(r2, r4, r3)     // Catch:{ IllegalStateException -> 0x01d7 }
            r11.f11131m = r2     // Catch:{ IllegalStateException -> 0x01d7 }
        L_0x01b6:
            if (r6 != 0) goto L_0x01eb
            c.q.a.c.i.b.t4 r2 = r11.f10699a     // Catch:{ IllegalStateException -> 0x01d7 }
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()     // Catch:{ IllegalStateException -> 0x01d7 }
            c.q.a.c.i.b.g3 r2 = r2.mo28343v()     // Catch:{ IllegalStateException -> 0x01d7 }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r11.f11121c     // Catch:{ IllegalStateException -> 0x01d7 }
            java.lang.String r6 = r11.f11130l     // Catch:{ IllegalStateException -> 0x01d7 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01d7 }
            if (r6 == 0) goto L_0x01d1
            java.lang.String r6 = r11.f11131m     // Catch:{ IllegalStateException -> 0x01d7 }
            goto L_0x01d3
        L_0x01d1:
            java.lang.String r6 = r11.f11130l     // Catch:{ IllegalStateException -> 0x01d7 }
        L_0x01d3:
            r2.mo28261c(r3, r4, r6)     // Catch:{ IllegalStateException -> 0x01d7 }
            goto L_0x01eb
        L_0x01d7:
            r2 = move-exception
            c.q.a.c.i.b.t4 r3 = r11.f10699a
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()
            c.q.a.c.i.b.g3 r3 = r3.mo28339r()
            java.lang.Object r0 = p040c.p200q.p201a.p264c.p340i.p342b.C5515i3.m15778z(r0)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.mo28261c(r4, r0, r2)
        L_0x01eb:
            r0 = 0
            r11.f11127i = r0
            c.q.a.c.i.b.t4 r0 = r11.f10699a
            r0.mo28489d()
            c.q.a.c.i.b.t4 r0 = r11.f10699a
            c.q.a.c.i.b.g r0 = r0.mo28649z()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo28257y(r2)
            if (r0 != 0) goto L_0x0202
            goto L_0x0237
        L_0x0202:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0218
            c.q.a.c.i.b.t4 r0 = r11.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28345x()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo28259a(r2)
            goto L_0x0239
        L_0x0218:
            java.util.Iterator r2 = r0.iterator()
        L_0x021c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0237
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            c.q.a.c.i.b.t4 r4 = r11.f10699a
            c.q.a.c.i.b.ga r4 = r4.mo28629N()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.mo28286Q(r6, r3)
            if (r3 != 0) goto L_0x021c
            goto L_0x0239
        L_0x0237:
            r11.f11127i = r0
        L_0x0239:
            if (r1 == 0) goto L_0x0248
            c.q.a.c.i.b.t4 r0 = r11.f10699a
            android.content.Context r0 = r0.mo28490f()
            boolean r0 = p040c.p200q.p201a.p264c.p276d.p291o.C3571a.m9102a(r0)
            r11.f11129k = r0
            return
        L_0x0248:
            r11.f11129k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5702y2.mo28109l():void");
    }

    /* renamed from: n */
    public final boolean mo28061n() {
        return true;
    }

    @WorkerThread
    /* renamed from: o */
    public final int mo28703o() {
        mo28106i();
        return this.f11129k;
    }

    @WorkerThread
    /* renamed from: p */
    public final int mo28704p() {
        mo28106i();
        return this.f11123e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0272  */
    @androidx.annotation.WorkerThread
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzq mo28705q(java.lang.String r37) {
        /*
            r36 = this;
            r1 = r36
            r36.mo28029h()
            com.google.android.gms.measurement.internal.zzq r33 = new com.google.android.gms.measurement.internal.zzq
            java.lang.String r3 = r36.mo28707s()
            java.lang.String r4 = r36.mo28708t()
            r36.mo28106i()
            java.lang.String r5 = r1.f11122d
            r36.mo28106i()
            int r0 = r1.f11123e
            long r6 = (long) r0
            r36.mo28106i()
            java.lang.String r0 = r1.f11124f
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r0)
            java.lang.String r8 = r1.f11124f
            c.q.a.c.i.b.t4 r0 = r1.f10699a
            c.q.a.c.i.b.g r0 = r0.mo28649z()
            r0.mo28249q()
            r36.mo28106i()
            r36.mo28029h()
            long r9 = r1.f11125g
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L_0x00d4
            c.q.a.c.i.b.t4 r0 = r1.f10699a
            c.q.a.c.i.b.ga r9 = r0.mo28629N()
            c.q.a.c.i.b.t4 r0 = r1.f10699a
            android.content.Context r0 = r0.mo28490f()
            c.q.a.c.i.b.t4 r10 = r1.f10699a
            android.content.Context r10 = r10.mo28490f()
            java.lang.String r10 = r10.getPackageName()
            r9.mo28029h()
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r0)
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = p040c.p200q.p201a.p264c.p340i.p342b.C5498ga.m15695t()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            c.q.a.c.i.b.t4 r0 = r9.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo28259a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00d2
        L_0x0078:
            if (r13 == 0) goto L_0x00d1
            boolean r10 = r9.mo28291V(r0, r10)     // Catch:{ NameNotFoundException -> 0x00c1 }
            if (r10 != 0) goto L_0x00bf
            c.q.a.c.d.o.b r0 = p040c.p200q.p201a.p264c.p276d.p291o.C3573c.m9110a(r0)     // Catch:{ NameNotFoundException -> 0x00c1 }
            c.q.a.c.i.b.t4 r10 = r9.f10699a     // Catch:{ NameNotFoundException -> 0x00c1 }
            android.content.Context r10 = r10.mo28490f()     // Catch:{ NameNotFoundException -> 0x00c1 }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c1 }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.mo20847e(r10, r13)     // Catch:{ NameNotFoundException -> 0x00c1 }
            android.content.pm.Signature[] r10 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00c1 }
            if (r10 == 0) goto L_0x00af
            android.content.pm.Signature[] r10 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00c1 }
            int r10 = r10.length     // Catch:{ NameNotFoundException -> 0x00c1 }
            if (r10 <= 0) goto L_0x00af
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00c1 }
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00c1 }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00c1 }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00c1 }
            long r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5498ga.m15694q0(r0)     // Catch:{ NameNotFoundException -> 0x00c1 }
            r15 = r9
            goto L_0x0076
        L_0x00af:
            c.q.a.c.i.b.t4 r0 = r9.f10699a     // Catch:{ NameNotFoundException -> 0x00c1 }
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()     // Catch:{ NameNotFoundException -> 0x00c1 }
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()     // Catch:{ NameNotFoundException -> 0x00c1 }
            java.lang.String r10 = "Could not get signatures"
            r0.mo28259a(r10)     // Catch:{ NameNotFoundException -> 0x00c1 }
            goto L_0x0076
        L_0x00bf:
            r15 = r11
            goto L_0x0076
        L_0x00c1:
            r0 = move-exception
            c.q.a.c.i.b.t4 r9 = r9.f10699a
            c.q.a.c.i.b.i3 r9 = r9.mo28487b()
            c.q.a.c.i.b.g3 r9 = r9.mo28339r()
            java.lang.String r10 = "Package name not found"
            r9.mo28260b(r10, r0)
        L_0x00d1:
            r9 = r11
        L_0x00d2:
            r1.f11125g = r9
        L_0x00d4:
            r13 = r9
            c.q.a.c.i.b.t4 r0 = r1.f10699a
            boolean r0 = r0.mo28642o()
            c.q.a.c.i.b.t4 r9 = r1.f10699a
            c.q.a.c.i.b.x3 r9 = r9.mo28622F()
            boolean r9 = r9.f11085q
            r10 = 1
            r15 = r9 ^ 1
            r36.mo28029h()
            c.q.a.c.i.b.t4 r9 = r1.f10699a
            boolean r9 = r9.mo28642o()
            r11 = 0
            if (r9 != 0) goto L_0x00f6
        L_0x00f2:
            r20 = r11
            goto L_0x017c
        L_0x00f6:
            p040c.p200q.p201a.p264c.p294g.p335i.C5269sd.m14818b()
            c.q.a.c.i.b.t4 r9 = r1.f10699a
            c.q.a.c.i.b.g r9 = r9.mo28649z()
            c.q.a.c.i.b.t2 r12 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10966b0
            boolean r9 = r9.mo28235B(r11, r12)
            if (r9 == 0) goto L_0x0117
            c.q.a.c.i.b.t4 r9 = r1.f10699a
            c.q.a.c.i.b.i3 r9 = r9.mo28487b()
            c.q.a.c.i.b.g3 r9 = r9.mo28343v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo28259a(r12)
            goto L_0x00f2
        L_0x0117:
            c.q.a.c.i.b.t4 r9 = r1.f10699a     // Catch:{ ClassNotFoundException -> 0x017a }
            android.content.Context r9 = r9.mo28490f()     // Catch:{ ClassNotFoundException -> 0x017a }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x017a }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x017a }
            if (r9 != 0) goto L_0x012a
            goto L_0x00f2
        L_0x012a:
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x016b }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r12[r2] = r18     // Catch:{ Exception -> 0x016b }
            java.lang.String r11 = "getInstance"
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x016b }
            c.q.a.c.i.b.t4 r10 = r1.f10699a     // Catch:{ Exception -> 0x016b }
            android.content.Context r10 = r10.mo28490f()     // Catch:{ Exception -> 0x016b }
            r12[r2] = r10     // Catch:{ Exception -> 0x016b }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x016b }
            if (r11 != 0) goto L_0x0148
            goto L_0x017a
        L_0x0148:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x015b }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x015b }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x015b }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x015b }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x015b }
            r20 = r9
            goto L_0x017c
        L_0x015b:
            c.q.a.c.i.b.t4 r9 = r1.f10699a
            c.q.a.c.i.b.i3 r9 = r9.mo28487b()
            c.q.a.c.i.b.g3 r9 = r9.mo28345x()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            r9.mo28259a(r10)
            goto L_0x017a
        L_0x016b:
            c.q.a.c.i.b.t4 r9 = r1.f10699a
            c.q.a.c.i.b.i3 r9 = r9.mo28487b()
            c.q.a.c.i.b.g3 r9 = r9.mo28346y()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
            r9.mo28259a(r10)
        L_0x017a:
            r20 = 0
        L_0x017c:
            c.q.a.c.i.b.t4 r9 = r1.f10699a
            c.q.a.c.i.b.x3 r10 = r9.mo28622F()
            c.q.a.c.i.b.t3 r10 = r10.f11073e
            long r10 = r10.mo28615a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0194
            long r9 = r9.f10896G
            r12 = r3
            r22 = r9
            goto L_0x019d
        L_0x0194:
            r12 = r3
            long r2 = r9.f10896G
            long r2 = java.lang.Math.min(r2, r10)
            r22 = r2
        L_0x019d:
            r36.mo28106i()
            int r11 = r1.f11129k
            c.q.a.c.i.b.t4 r2 = r1.f10699a
            c.q.a.c.i.b.g r2 = r2.mo28649z()
            boolean r24 = r2.mo28234A()
            c.q.a.c.i.b.t4 r2 = r1.f10699a
            c.q.a.c.i.b.x3 r2 = r2.mo28622F()
            r2.mo28029h()
            android.content.SharedPreferences r2 = r2.mo28679o()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r25 = r2.getBoolean(r3, r9)
            r36.mo28106i()
            java.lang.String r3 = r1.f11131m
            c.q.a.c.i.b.t4 r2 = r1.f10699a
            c.q.a.c.i.b.g r2 = r2.mo28649z()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo28252t(r9)
            if (r2 != 0) goto L_0x01d6
            r26 = 0
            goto L_0x01e2
        L_0x01d6:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r26 = r2
        L_0x01e2:
            long r9 = r1.f11126h
            java.util.List r2 = r1.f11127i
            r19 = r2
            c.q.a.c.i.b.t4 r2 = r1.f10699a
            c.q.a.c.i.b.x3 r2 = r2.mo28622F()
            c.q.a.c.i.b.h r2 = r2.mo28681q()
            java.lang.String r30 = r2.mo28324h()
            java.lang.String r2 = r1.f11128j
            if (r2 != 0) goto L_0x021f
            c.q.a.c.i.b.t4 r2 = r1.f10699a
            c.q.a.c.i.b.g r2 = r2.mo28649z()
            r21 = r3
            c.q.a.c.i.b.t2 r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10988m0
            r27 = r9
            r9 = 0
            boolean r2 = r2.mo28235B(r9, r3)
            if (r2 == 0) goto L_0x021a
            c.q.a.c.i.b.t4 r2 = r1.f10699a
            c.q.a.c.i.b.ga r2 = r2.mo28629N()
            java.lang.String r2 = r2.mo28306q()
            r1.f11128j = r2
            goto L_0x0223
        L_0x021a:
            java.lang.String r2 = ""
            r1.f11128j = r2
            goto L_0x0223
        L_0x021f:
            r21 = r3
            r27 = r9
        L_0x0223:
            java.lang.String r3 = r1.f11128j
            p040c.p200q.p201a.p264c.p294g.p335i.C5179md.m14505b()
            c.q.a.c.i.b.t4 r2 = r1.f10699a
            c.q.a.c.i.b.g r2 = r2.mo28649z()
            c.q.a.c.i.b.t2 r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10982j0
            r10 = 0
            boolean r2 = r2.mo28235B(r10, r9)
            if (r2 == 0) goto L_0x0272
            r36.mo28029h()
            long r9 = r1.f11133o
            r16 = 0
            int r2 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0245
            r16 = r3
            goto L_0x0266
        L_0x0245:
            c.q.a.c.i.b.t4 r2 = r1.f10699a
            c.q.a.c.d.n.d r2 = r2.mo28488c()
            long r9 = r2.mo20838a()
            r16 = r3
            long r2 = r1.f11133o
            long r9 = r9 - r2
            java.lang.String r2 = r1.f11132n
            if (r2 == 0) goto L_0x0266
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0266
            java.lang.String r2 = r1.f11134p
            if (r2 != 0) goto L_0x0266
            r36.mo28710v()
        L_0x0266:
            java.lang.String r2 = r1.f11132n
            if (r2 != 0) goto L_0x026d
            r36.mo28710v()
        L_0x026d:
            java.lang.String r2 = r1.f11132n
            r32 = r2
            goto L_0x0276
        L_0x0272:
            r16 = r3
            r32 = r10
        L_0x0276:
            r9 = 74029(0x1212d, double:3.6575E-319)
            r17 = 0
            r29 = 0
            r31 = r19
            r2 = r33
            r35 = r16
            r34 = r21
            r3 = r12
            r21 = r11
            r11 = r13
            r13 = r37
            r14 = r0
            r16 = r20
            r19 = r22
            r22 = r24
            r23 = r25
            r24 = r34
            r25 = r26
            r26 = r27
            r28 = r31
            r31 = r35
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5702y2.mo28705q(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    @WorkerThread
    /* renamed from: r */
    public final String mo28706r() {
        mo28106i();
        return this.f11131m;
    }

    @WorkerThread
    /* renamed from: s */
    public final String mo28707s() {
        mo28106i();
        C3495o.m8908j(this.f11121c);
        return this.f11121c;
    }

    @WorkerThread
    /* renamed from: t */
    public final String mo28708t() {
        mo28029h();
        mo28106i();
        C3495o.m8908j(this.f11130l);
        return this.f11130l;
    }

    @WorkerThread
    /* renamed from: u */
    public final List mo28709u() {
        return this.f11127i;
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo28710v() {
        String str;
        mo28029h();
        if (!this.f10699a.mo28622F().mo28681q().mo28326i(zzah.ANALYTICS_STORAGE)) {
            this.f10699a.mo28487b().mo28338q().mo28259a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.f10699a.mo28629N().mo28312u().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        C5491g3 q = this.f10699a.mo28487b().mo28338q();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        q.mo28259a(String.format("Resetting session stitching token to %s", objArr));
        this.f11132n = str;
        this.f11133o = this.f10699a.mo28488c().mo20838a();
    }

    /* renamed from: w */
    public final boolean mo28711w(String str) {
        String str2 = this.f11134p;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f11134p = str;
        return z;
    }
}
