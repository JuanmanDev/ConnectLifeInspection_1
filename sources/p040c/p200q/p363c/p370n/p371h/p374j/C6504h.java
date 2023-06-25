package p040c.p200q.p363c.p370n.p371h.p374j;

import android.content.Context;
import android.content.pm.PackageInfo;
import p040c.p200q.p363c.p370n.p371h.C6476e;

/* renamed from: c.q.c.n.h.j.h */
/* compiled from: AppData */
public class C6504h {

    /* renamed from: a */
    public final String f12212a;

    /* renamed from: b */
    public final String f12213b;

    /* renamed from: c */
    public final String f12214c;

    /* renamed from: d */
    public final String f12215d;

    /* renamed from: e */
    public final String f12216e;

    /* renamed from: f */
    public final String f12217f;

    /* renamed from: g */
    public final C6476e f12218g;

    public C6504h(String str, String str2, String str3, String str4, String str5, String str6, C6476e eVar) {
        this.f12212a = str;
        this.f12213b = str2;
        this.f12214c = str3;
        this.f12215d = str4;
        this.f12216e = str5;
        this.f12217f = str6;
        this.f12218g = eVar;
    }

    /* renamed from: a */
    public static C6504h m18190a(Context context, C6549z zVar, String str, String str2, C6476e eVar) {
        String packageName = context.getPackageName();
        String g = zVar.mo30819g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C6504h(str, str2, g, packageName, num, str3, eVar);
    }
}
