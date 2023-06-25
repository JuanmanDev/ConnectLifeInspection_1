package p040c.p200q.p201a.p264c.p276d.p289n;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p264c.p276d.C3332f;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.d.n.p */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3565p {
    /* renamed from: a */
    public static boolean m9095a(@NonNull Context context, int i) {
        if (!m9096b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C3332f.m8454a(context).mo20410b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            boolean isLoggable = Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m9096b(@NonNull Context context, int i, @NonNull String str) {
        return C3573c.m9110a(context).mo20849g(i, str);
    }
}
