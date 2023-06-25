package p040c.p077d.p078a.p104p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p040c.p077d.p078a.p081k.C1567c;

/* renamed from: c.d.a.p.a */
/* compiled from: ApplicationVersionSignature */
public final class C1934a {

    /* renamed from: a */
    public static final ConcurrentMap<String, C1567c> f1613a = new ConcurrentHashMap();

    @Nullable
    /* renamed from: a */
    public static PackageInfo m2526a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            "Cannot resolve info for" + context.getPackageName();
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    public static String m2527b(@Nullable PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    @NonNull
    /* renamed from: c */
    public static C1567c m2528c(@NonNull Context context) {
        String packageName = context.getPackageName();
        C1567c cVar = (C1567c) f1613a.get(packageName);
        if (cVar != null) {
            return cVar;
        }
        C1567c d = m2529d(context);
        C1567c putIfAbsent = f1613a.putIfAbsent(packageName, d);
        return putIfAbsent == null ? d : putIfAbsent;
    }

    @NonNull
    /* renamed from: d */
    public static C1567c m2529d(@NonNull Context context) {
        return new C1936c(m2527b(m2526a(context)));
    }
}
