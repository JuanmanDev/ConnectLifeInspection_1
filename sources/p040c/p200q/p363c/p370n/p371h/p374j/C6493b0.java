package p040c.p200q.p363c.p370n.p371h.p374j;

import android.content.Context;

/* renamed from: c.q.c.n.h.j.b0 */
/* compiled from: InstallerPackageNameProvider */
public class C6493b0 {

    /* renamed from: a */
    public String f12199a;

    /* renamed from: b */
    public static String m18154b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* renamed from: a */
    public synchronized String mo30655a(Context context) {
        if (this.f12199a == null) {
            this.f12199a = m18154b(context);
        }
        return "".equals(this.f12199a) ? null : this.f12199a;
    }
}
