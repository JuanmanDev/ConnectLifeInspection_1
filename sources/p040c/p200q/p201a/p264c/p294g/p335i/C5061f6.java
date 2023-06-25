package p040c.p200q.p201a.p264c.p294g.p335i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.internal.measurement.zzig;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: c.q.a.c.g.i.f6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5061f6 {

    /* renamed from: a */
    public static volatile zzig f9889a = zzig.zzc();

    /* renamed from: b */
    public static final Object f9890b = new Object();

    /* renamed from: a */
    public static boolean m14065a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        } else if (f9889a.zzb()) {
            return ((Boolean) f9889a.zza()).booleanValue();
        } else {
            synchronized (f9890b) {
                if (f9889a.zzb()) {
                    boolean booleanValue = ((Boolean) f9889a.zza()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : SQLiteDatabase.CREATE_IF_NECESSARY);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f9889a = zzig.zzd(Boolean.valueOf(z));
                    return ((Boolean) f9889a.zza()).booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f9889a = zzig.zzd(Boolean.valueOf(z));
                return ((Boolean) f9889a.zza()).booleanValue();
            }
        }
    }
}
