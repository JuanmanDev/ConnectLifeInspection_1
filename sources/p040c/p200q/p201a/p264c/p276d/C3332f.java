package p040c.p200q.p201a.p264c.p276d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.RestrictedInheritance;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: c.q.a.c.d.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3332f {

    /* renamed from: c */
    public static C3332f f6215c;

    /* renamed from: a */
    public final Context f6216a;

    /* renamed from: b */
    public volatile String f6217b;

    public C3332f(@NonNull Context context) {
        this.f6216a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: a */
    public static C3332f m8454a(@NonNull Context context) {
        C3495o.m8908j(context);
        synchronized (C3332f.class) {
            if (f6215c == null) {
                C3327c0.m8437d(context);
                f6215c = new C3332f(context);
            }
        }
        return f6215c;
    }

    /* renamed from: d */
    public static final C3583y m8455d(PackageInfo packageInfo, C3583y... yVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        C3584z zVar = new C3584z(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < yVarArr.length; i++) {
            if (yVarArr[i].equals(zVar)) {
                return yVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m8456e(@NonNull PackageInfo packageInfo, boolean z) {
        C3583y yVar;
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                yVar = m8455d(packageInfo, C3325b0.f6202a);
            } else {
                yVar = m8455d(packageInfo, C3325b0.f6202a[0]);
            }
            if (yVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo20410b(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m8456e(packageInfo, false)) {
            return true;
        }
        return m8456e(packageInfo, true) && C3330e.m8447e(this.f6216a);
    }

    /* renamed from: c */
    public boolean mo20411c(int i) {
        C3536j0 j0Var;
        int length;
        String[] packagesForUid = this.f6216a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            j0Var = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C3495o.m8908j(j0Var);
                    break;
                }
                j0Var = mo20412f(packagesForUid[i2], false, false);
                if (j0Var.f6530a) {
                    break;
                }
                i2++;
            }
        } else {
            j0Var = C3536j0.m9018c("no pkgs");
        }
        j0Var.mo20804e();
        return j0Var.f6530a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r8 = r8.applicationInfo;
     */
    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p276d.C3536j0 mo20412f(java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L_0x0009
            c.q.a.c.d.j0 r6 = p040c.p200q.p201a.p264c.p276d.C3536j0.m9018c(r7)
            return r6
        L_0x0009:
            java.lang.String r8 = r5.f6217b
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0090
            boolean r8 = p040c.p200q.p201a.p264c.p276d.C3327c0.m8438e()
            r0 = 0
            if (r8 == 0) goto L_0x0023
            android.content.Context r7 = r5.f6216a
            boolean r7 = p040c.p200q.p201a.p264c.p276d.C3330e.m8447e(r7)
            c.q.a.c.d.j0 r7 = p040c.p200q.p201a.p264c.p276d.C3327c0.m8435b(r6, r7, r0, r0)
            goto L_0x007d
        L_0x0023:
            android.content.Context r8 = r5.f6216a     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0084 }
            r1 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r1)     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r1 = r5.f6216a
            boolean r1 = p040c.p200q.p201a.p264c.p276d.C3330e.m8447e(r1)
            if (r8 != 0) goto L_0x003c
            c.q.a.c.d.j0 r7 = p040c.p200q.p201a.p264c.p276d.C3536j0.m9018c(r7)
            goto L_0x007d
        L_0x003c:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto L_0x0077
            int r7 = r7.length
            r2 = 1
            if (r7 == r2) goto L_0x0045
            goto L_0x0077
        L_0x0045:
            c.q.a.c.d.z r7 = new c.q.a.c.d.z
            android.content.pm.Signature[] r3 = r8.signatures
            r3 = r3[r0]
            byte[] r3 = r3.toByteArray()
            r7.<init>(r3)
            java.lang.String r3 = r8.packageName
            c.q.a.c.d.j0 r1 = p040c.p200q.p201a.p264c.p276d.C3327c0.m8434a(r3, r7, r1, r0)
            boolean r4 = r1.f6530a
            if (r4 == 0) goto L_0x0075
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto L_0x0075
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0075
            c.q.a.c.d.j0 r7 = p040c.p200q.p201a.p264c.p276d.C3327c0.m8434a(r3, r7, r0, r2)
            boolean r7 = r7.f6530a
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = "debuggable release cert app rejected"
            c.q.a.c.d.j0 r7 = p040c.p200q.p201a.p264c.p276d.C3536j0.m9018c(r7)
            goto L_0x007d
        L_0x0075:
            r7 = r1
            goto L_0x007d
        L_0x0077:
            java.lang.String r7 = "single cert required"
            c.q.a.c.d.j0 r7 = p040c.p200q.p201a.p264c.p276d.C3536j0.m9018c(r7)
        L_0x007d:
            boolean r8 = r7.f6530a
            if (r8 == 0) goto L_0x0083
            r5.f6217b = r6
        L_0x0083:
            return r7
        L_0x0084:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            java.lang.String r6 = r8.concat(r6)
            c.q.a.c.d.j0 r6 = p040c.p200q.p201a.p264c.p276d.C3536j0.m9019d(r6, r7)
            return r6
        L_0x0090:
            c.q.a.c.d.j0 r6 = p040c.p200q.p201a.p264c.p276d.C3536j0.m9017b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.C3332f.mo20412f(java.lang.String, boolean, boolean):c.q.a.c.d.j0");
    }
}
