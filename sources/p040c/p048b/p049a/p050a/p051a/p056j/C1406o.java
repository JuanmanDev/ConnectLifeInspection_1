package p040c.p048b.p049a.p050a.p051a.p056j;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.IInterface;
import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.utils.HashAlgorithm;
import com.amazon.identity.auth.map.device.utils.MAPVersion;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p040c.p048b.p049a.p050a.p051a.p061n.C1445b;
import p040c.p048b.p049a.p050a.p051a.p067t.C1478g;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

@SuppressLint({"PackageManagerGetSignatures"})
/* renamed from: c.b.a.a.a.j.o */
/* compiled from: ThirdPartyServiceHelper */
public class C1406o {

    /* renamed from: a */
    public static final String f491a = "c.b.a.a.a.j.o";

    /* renamed from: b */
    public static String f492b = "7cac391937981b6134bdce1fd9834c253181f5abf91ded6078210d0f91ace360";

    /* renamed from: c */
    public static String f493c = "2f19adeb284eb36f7f07786152b9a1d14b21653203ad0b04ebbf9c73ab6d7625";

    /* renamed from: d */
    public static Object f494d = new Object();

    /* renamed from: c.b.a.a.a.j.o$a */
    /* compiled from: ThirdPartyServiceHelper */
    public class C1407a implements C1382b {

        /* renamed from: a */
        public final /* synthetic */ C1409c f495a;

        /* renamed from: b */
        public final /* synthetic */ C1405n f496b;

        /* renamed from: c */
        public final /* synthetic */ Intent f497c;

        /* renamed from: d */
        public final /* synthetic */ CountDownLatch f498d;

        public C1407a(C1406o oVar, C1409c cVar, C1405n nVar, Intent intent, CountDownLatch countDownLatch) {
            this.f495a = cVar;
            this.f496b = nVar;
            this.f497c = intent;
            this.f498d = countDownLatch;
        }

        /* renamed from: a */
        public void mo15106a(AuthError authError) {
            this.f495a.mo15157j((IInterface) null);
            this.f495a.mo15156i((C1405n) null);
            this.f495a.mo15158k((Intent) null);
            C1485a.m832e(C1406o.f491a, "Bind - error");
            this.f498d.countDown();
        }

        /* renamed from: b */
        public void mo15107b(IInterface iInterface) {
            this.f495a.mo15157j(iInterface);
            this.f495a.mo15156i(this.f496b);
            this.f495a.mo15158k(this.f497c);
            this.f498d.countDown();
        }
    }

    /* renamed from: c.b.a.a.a.j.o$b */
    /* compiled from: ThirdPartyServiceHelper */
    public static class C1408b {

        /* renamed from: a */
        public static C1409c f499a;

        /* renamed from: b */
        public static long f500b;

        /* renamed from: a */
        public static C1409c m469a() {
            return f499a;
        }

        /* renamed from: b */
        public static boolean m470b() {
            if (f499a != null && new Date().getTime() <= f500b + 86400000) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public static void m471c(C1409c cVar) {
            f499a = cVar;
            if (cVar == null) {
                f500b = 0;
            } else {
                f500b = new Date().getTime();
            }
        }
    }

    /* renamed from: c.b.a.a.a.j.o$c */
    /* compiled from: ThirdPartyServiceHelper */
    public class C1409c {

        /* renamed from: a */
        public final MAPVersion f501a;

        /* renamed from: b */
        public IInterface f502b;

        /* renamed from: c */
        public C1405n f503c;

        /* renamed from: d */
        public Intent f504d;

        /* renamed from: e */
        public final ResolveInfo f505e;

        public C1409c(C1406o oVar, MAPVersion mAPVersion, IInterface iInterface, C1405n nVar, boolean z, ResolveInfo resolveInfo, Intent intent) {
            this.f501a = mAPVersion;
            this.f502b = iInterface;
            mo15156i(nVar);
            this.f505e = resolveInfo;
            this.f504d = intent;
        }

        /* renamed from: d */
        public C1405n mo15151d() {
            return this.f503c;
        }

        /* renamed from: e */
        public MAPVersion mo15152e() {
            return this.f501a;
        }

        /* renamed from: f */
        public final ResolveInfo mo15153f() {
            return this.f505e;
        }

        /* renamed from: g */
        public IInterface mo15154g() {
            return this.f502b;
        }

        /* renamed from: h */
        public Intent mo15155h() {
            return this.f504d;
        }

        /* renamed from: i */
        public final void mo15156i(C1405n nVar) {
            this.f503c = nVar;
        }

        /* renamed from: j */
        public void mo15157j(IInterface iInterface) {
            this.f502b = iInterface;
        }

        /* renamed from: k */
        public void mo15158k(Intent intent) {
            this.f504d = intent;
        }
    }

    /* renamed from: c */
    public static void m455c(Context context) {
        synchronized (f494d) {
            C1485a.m832e(f491a, "Clearing Highest Versioned Service");
            C1409c a = C1408b.m469a();
            if (a != null) {
                m458l(context, a.mo15151d(), a.mo15155h());
                C1408b.m471c((C1409c) null);
            }
        }
    }

    /* renamed from: i */
    public static boolean m456i(Context context, Signature[] signatureArr) {
        if (!C1445b.m721b()) {
            C1485a.m832e(f491a, "Attempting to check fingerprint in development environment");
            return m457k(f492b, signatureArr[0]);
        }
        C1485a.m832e(f491a, "Attempting to check fingerprint in production environment");
        return m457k(f493c, signatureArr[0]);
    }

    /* renamed from: k */
    public static boolean m457k(String str, Signature signature) {
        try {
            String d = C1478g.m815d(signature, HashAlgorithm.SHA_256);
            String str2 = f491a;
            C1485a.m836i(str2, "Expected fingerprint", "Fingerprint=" + str);
            String str3 = f491a;
            C1485a.m836i(str3, "Extracted fingerprint", "Fingerprint=" + d);
            return str.equals(d);
        } catch (CertificateException e) {
            C1485a.m836i(f491a, "CertificateException getting Fingerprint. ", e.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e2) {
            C1485a.m836i(f491a, "NoSuchAlgorithmException getting Fingerprint. ", e2.getMessage());
            return false;
        } catch (IOException e3) {
            C1485a.m836i(f491a, "IOException getting Fingerprint. ", e3.getMessage());
            return false;
        }
    }

    /* renamed from: l */
    public static void m458l(Context context, ServiceConnection serviceConnection, Intent intent) {
        String packageName = intent != null ? intent.getComponent().getPackageName() : null;
        String str = f491a;
        C1485a.m828a(str, "Unbinding pkg=" + packageName);
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException unused) {
                String.format("IllegalArgumentException is received during unbinding from %s. Ignored.", new Object[]{packageName});
            }
        }
    }

    /* renamed from: m */
    public static void m459m(Context context) {
        synchronized (f494d) {
            C1485a.m832e(f491a, "Unbinding Highest Versioned Service");
            C1409c a = C1408b.m469a();
            if (!(a == null || a.mo15151d() == null)) {
                m458l(context, a.mo15151d(), a.mo15155h());
                a.mo15157j((IInterface) null);
                a.mo15156i((C1405n) null);
                a.mo15158k((Intent) null);
            }
        }
    }

    /* renamed from: b */
    public boolean mo15144b(Context context) {
        if (C1408b.m470b()) {
            return false;
        }
        C1409c a = C1408b.m469a();
        ServiceInfo serviceInfo = a.mo15153f().serviceInfo;
        ComponentName componentName = new ComponentName(serviceInfo.applicationInfo.packageName, serviceInfo.name);
        Intent intent = new Intent();
        intent.setComponent(componentName);
        C1405n nVar = new C1405n();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        nVar.mo15133d(new C1407a(this, a, nVar, intent, countDownLatch));
        if (context.bindService(intent, nVar, 5)) {
            try {
                C1485a.m832e(f491a, "Awaiting latch");
                if (!countDownLatch.await(10, TimeUnit.SECONDS)) {
                    C1485a.m838k(f491a, "Unable to establish bind within timelimit = 10");
                    C1408b.m471c((C1409c) null);
                    throw new AuthError("Binding to authorization service has timed out!", AuthError.ERROR_TYPE.ERROR_THREAD);
                }
            } catch (InterruptedException e) {
                String str = f491a;
                C1485a.m836i(str, "InterruptedException", "msg+=" + e.getMessage());
                C1408b.m471c((C1409c) null);
                throw new AuthError("Binding to authorization service has timed out!", e, AuthError.ERROR_TYPE.ERROR_THREAD);
            }
        } else {
            C1408b.m471c((C1409c) null);
            String str2 = f491a;
            C1485a.m838k(str2, "Bind Service " + intent.getComponent().flattenToString() + "unsuccessful");
        }
        return true;
    }

    /* renamed from: d */
    public C1409c mo15145d(List<C1409c> list) {
        String str = f491a;
        C1485a.m832e(str, "Number of MAP services to compare = " + list.size());
        C1409c cVar = null;
        for (C1409c next : list) {
            if (cVar == null || next.mo15152e().mo21569a(cVar.mo15152e()) > 0) {
                cVar = next;
            }
        }
        return cVar;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: e */
    public List<C1409c> mo15146e(Context context, List<ResolveInfo> list, C1409c cVar) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : list) {
            if (cVar == null || !next.serviceInfo.applicationInfo.packageName.equals(cVar.f505e.serviceInfo.applicationInfo.packageName)) {
                try {
                    C1485a.m836i(f491a, "Verifying signature for pkg=", next.serviceInfo.applicationInfo.packageName);
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(next.serviceInfo.applicationInfo.packageName, 64);
                    if (!mo15150j(context) || !mo15149h(packageInfo)) {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr.length != 1) {
                            String str = f491a;
                            C1485a.m836i(str, "Security count failure", "Signature count (" + signatureArr.length + ") is incorrect.");
                        } else if (!m456i(context, signatureArr)) {
                            C1485a.m836i(f491a, "Security check failure", "Signature is incorrect.");
                        }
                    } else {
                        C1485a.m836i(f491a, "Current platform=", "FireOS with CredentialManager");
                    }
                    ComponentName componentName = new ComponentName(next.serviceInfo.applicationInfo.packageName, next.serviceInfo.name);
                    Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
                    if (bundle != null) {
                        boolean z = bundle.getBoolean("map.primary");
                        String string = bundle.getString("map.version");
                        if (!TextUtils.isEmpty(string) || z) {
                            arrayList.add(new C1409c(this, z ? MAPVersion.f6965m : new MAPVersion(string), (IInterface) null, new C1405n(), z, next, new Intent().setComponent(componentName)));
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String str2 = f491a;
                    C1485a.m836i(str2, "NameNotFoundException.", "msg=" + e.getMessage());
                }
            } else {
                String str3 = f491a;
                C1485a.m832e(str3, "Ignoring previous service =" + next.serviceInfo.name);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r0 = r6.getPackageManager();
        r2 = new android.content.Intent();
        r2.setAction("com.amazon.identity.auth.device.authorization.MapAuthorizationService");
        r0 = r0.queryIntentServices(r2, 0);
        p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(f491a, "Number of services found : " + r0.size());
        r7 = mo15146e(r6, r0, r7);
        r2 = f494d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m471c(mo15145d(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m469a() != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(f491a, "Returning no service to use");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        mo15144b(r6);
        p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(f491a, "Returning service to use");
        r6 = p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m469a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (r6 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        r1 = r6.mo15154g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        return r1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.IInterface mo15147f(android.content.Context r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = p040c.p048b.p049a.p050a.p051a.p065r.C1467d.m792b()
            if (r0 != 0) goto L_0x00b0
            java.lang.String r0 = f491a
            java.lang.String r1 = "getAuthorizationServiceInstance"
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m828a(r0, r1)
            java.lang.Object r0 = f494d
            monitor-enter(r0)
            r1 = 0
            if (r7 == 0) goto L_0x0028
            c.b.a.a.a.j.o$c r7 = p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m469a()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x0049
            c.b.a.a.a.j.n r2 = r7.mo15151d()     // Catch:{ all -> 0x00ad }
            android.content.Intent r3 = r7.mo15155h()     // Catch:{ all -> 0x00ad }
            m458l(r6, r2, r3)     // Catch:{ all -> 0x00ad }
            p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m471c(r1)     // Catch:{ all -> 0x00ad }
            goto L_0x0049
        L_0x0028:
            c.b.a.a.a.j.o$c r7 = p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m469a()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x0048
            c.b.a.a.a.j.n r2 = r7.mo15151d()     // Catch:{ all -> 0x00ad }
            android.content.Intent r3 = r7.mo15155h()     // Catch:{ all -> 0x00ad }
            m458l(r6, r2, r3)     // Catch:{ all -> 0x00ad }
            boolean r2 = r5.mo15144b(r6)     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x0045
            android.os.IInterface r6 = r7.mo15154g()     // Catch:{ all -> 0x00ad }
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            return r6
        L_0x0045:
            p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m471c(r1)     // Catch:{ all -> 0x00ad }
        L_0x0048:
            r7 = r1
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.amazon.identity.auth.device.authorization.MapAuthorizationService"
            r2.setAction(r3)
            r3 = 0
            java.util.List r0 = r0.queryIntentServices(r2, r3)
            java.lang.String r2 = f491a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number of services found : "
            r3.append(r4)
            int r4 = r0.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(r2, r3)
            java.util.List r7 = r5.mo15146e(r6, r0, r7)
            java.lang.Object r2 = f494d
            monitor-enter(r2)
            c.b.a.a.a.j.o$c r7 = r5.mo15145d(r7)     // Catch:{ all -> 0x00aa }
            p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m471c(r7)     // Catch:{ all -> 0x00aa }
            c.b.a.a.a.j.o$c r7 = p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m469a()     // Catch:{ all -> 0x00aa }
            if (r7 != 0) goto L_0x0094
            java.lang.String r6 = f491a     // Catch:{ all -> 0x00aa }
            java.lang.String r7 = "Returning no service to use"
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(r6, r7)     // Catch:{ all -> 0x00aa }
            monitor-exit(r2)     // Catch:{ all -> 0x00aa }
            return r1
        L_0x0094:
            r5.mo15144b(r6)     // Catch:{ all -> 0x00aa }
            java.lang.String r6 = f491a     // Catch:{ all -> 0x00aa }
            java.lang.String r7 = "Returning service to use"
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m832e(r6, r7)     // Catch:{ all -> 0x00aa }
            c.b.a.a.a.j.o$c r6 = p040c.p048b.p049a.p050a.p051a.p056j.C1406o.C1408b.m469a()     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x00a8
            android.os.IInterface r1 = r6.mo15154g()     // Catch:{ all -> 0x00aa }
        L_0x00a8:
            monitor-exit(r2)     // Catch:{ all -> 0x00aa }
            return r1
        L_0x00aa:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00aa }
            throw r6
        L_0x00ad:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            throw r6
        L_0x00b0:
            java.lang.String r6 = f491a
            java.lang.String r7 = "getAuthorizationServiceInstance started on main thread"
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m829b(r6, r7)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "getAuthorizationServiceInstance started on main thread"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p056j.C1406o.mo15147f(android.content.Context, boolean):android.os.IInterface");
    }

    /* renamed from: g */
    public C1379a mo15148g(Context context, boolean z) {
        String str = f491a;
        C1485a.m832e(str, "Attempting to retrieve remote Android service. Ignore cached service=" + z);
        return (C1379a) mo15147f(context, z);
    }

    /* renamed from: h */
    public final boolean mo15149h(PackageInfo packageInfo) {
        boolean equals = TextUtils.equals(packageInfo.packageName, "com.amazon.identity.auth.device.authorization");
        C1485a.m836i(f491a, "Is current package CredentialManager:", String.valueOf(equals));
        return equals;
    }

    /* renamed from: j */
    public final boolean mo15150j(Context context) {
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("com.amazon.software.fireos");
        C1485a.m836i(f491a, "Is current platform FireOS:", String.valueOf(hasSystemFeature));
        return hasSystemFeature;
    }
}
