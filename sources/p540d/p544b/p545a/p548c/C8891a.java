package p540d.p544b.p545a.p548c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.HashMap;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: d.b.a.c.a */
/* compiled from: PackageInfoPlugin */
public class C8891a implements C9017j.C9021c, C8944a {

    /* renamed from: e */
    public Context f17414e;

    /* renamed from: l */
    public C9017j f17415l;

    /* renamed from: a */
    public static long m24020a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }

    /* renamed from: b */
    public final void mo46254b(Context context, C9003c cVar) {
        this.f17414e = context;
        C9017j jVar = new C9017j(cVar, "dev.fluttercommunity.plus/package_info");
        this.f17415l = jVar;
        jVar.mo46575e(this);
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo46254b(bVar.mo46464a(), bVar.mo46465b());
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        this.f17414e = null;
        this.f17415l.mo46575e((C9017j.C9021c) null);
        this.f17415l = null;
    }

    public void onMethodCall(C9016i iVar, C9017j.C9022d dVar) {
        try {
            if (iVar.f17687a.equals("getAll")) {
                PackageManager packageManager = this.f17414e.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(this.f17414e.getPackageName(), 0);
                HashMap hashMap = new HashMap();
                hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                hashMap.put("packageName", this.f17414e.getPackageName());
                hashMap.put("version", packageInfo.versionName);
                hashMap.put("buildNumber", String.valueOf(m24020a(packageInfo)));
                dVar.success(hashMap);
                return;
            }
            dVar.notImplemented();
        } catch (PackageManager.NameNotFoundException e) {
            dVar.error("Name not found", e.getMessage(), (Object) null);
        }
    }
}
