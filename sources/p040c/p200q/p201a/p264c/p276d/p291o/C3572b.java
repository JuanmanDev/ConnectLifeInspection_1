package p040c.p200q.p201a.p264c.p276d.p291o;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;

/* renamed from: c.q.a.c.d.o.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3572b {
    @NonNull

    /* renamed from: a */
    public final Context f6556a;

    public C3572b(@NonNull Context context) {
        this.f6556a = context;
    }

    /* renamed from: a */
    public int mo20843a(@NonNull String str) {
        return this.f6556a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int mo20844b(@NonNull String str, @NonNull String str2) {
        return this.f6556a.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    /* renamed from: c */
    public ApplicationInfo mo20845c(@NonNull String str, int i) {
        return this.f6556a.getPackageManager().getApplicationInfo(str, i);
    }

    @NonNull
    /* renamed from: d */
    public CharSequence mo20846d(@NonNull String str) {
        return this.f6556a.getPackageManager().getApplicationLabel(this.f6556a.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    /* renamed from: e */
    public PackageInfo mo20847e(@NonNull String str, int i) {
        return this.f6556a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: f */
    public boolean mo20848f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C3571a.m9102a(this.f6556a);
        }
        if (!C3562m.m9087h() || (nameForUid = this.f6556a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f6556a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean mo20849g(int i, @NonNull String str) {
        if (C3562m.m9083d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f6556a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f6556a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
