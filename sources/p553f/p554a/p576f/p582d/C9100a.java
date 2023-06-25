package p553f.p554a.p576f.p582d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.HashMap;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: f.a.f.d.a */
/* compiled from: PackageInfoPlugin */
public class C9100a implements C9017j.C9021c, C8944a {

    /* renamed from: e */
    public Context f17847e;

    /* renamed from: l */
    public C9017j f17848l;

    /* renamed from: a */
    public static long m24691a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }

    /* renamed from: b */
    public final void mo46797b(Context context, C9003c cVar) {
        this.f17847e = context;
        C9017j jVar = new C9017j(cVar, "plugins.flutter.io/package_info");
        this.f17848l = jVar;
        jVar.mo46575e(this);
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo46797b(bVar.mo46464a(), bVar.mo46465b());
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        this.f17847e = null;
        this.f17848l.mo46575e((C9017j.C9021c) null);
        this.f17848l = null;
    }

    public void onMethodCall(C9016i iVar, C9017j.C9022d dVar) {
        try {
            if (iVar.f17687a.equals("getAll")) {
                PackageManager packageManager = this.f17847e.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(this.f17847e.getPackageName(), 0);
                HashMap hashMap = new HashMap();
                hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                hashMap.put("packageName", this.f17847e.getPackageName());
                hashMap.put("version", packageInfo.versionName);
                hashMap.put("buildNumber", String.valueOf(m24691a(packageInfo)));
                dVar.success(hashMap);
                return;
            }
            dVar.notImplemented();
        } catch (PackageManager.NameNotFoundException e) {
            dVar.error("Name not found", e.getMessage(), (Object) null);
        }
    }
}
