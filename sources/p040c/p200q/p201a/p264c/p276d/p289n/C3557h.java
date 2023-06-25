package p040c.p200q.p201a.p264c.p276d.p289n;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.C3330e;

/* renamed from: c.q.a.c.d.n.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3557h {
    @Nullable

    /* renamed from: a */
    public static Boolean f6540a;
    @Nullable

    /* renamed from: b */
    public static Boolean f6541b;
    @Nullable

    /* renamed from: c */
    public static Boolean f6542c;
    @Nullable

    /* renamed from: d */
    public static Boolean f6543d;

    /* renamed from: a */
    public static boolean m9068a(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f6543d == null) {
            boolean z = false;
            if (C3562m.m9087h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f6543d = Boolean.valueOf(z);
        }
        return f6543d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m9069b() {
        int i = C3330e.f6210a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: c */
    public static boolean m9070c(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f6540a == null) {
            boolean z = false;
            if (C3562m.m9084e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f6540a = Boolean.valueOf(z);
        }
        return f6540a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m9071d(@NonNull Context context) {
        if (m9070c(context) && !C3562m.m9086g()) {
            return true;
        }
        if (m9072e(context)) {
            return !C3562m.m9087h() || C3562m.m9090k();
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m9072e(@NonNull Context context) {
        if (f6541b == null) {
            boolean z = false;
            if (C3562m.m9085f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f6541b = Boolean.valueOf(z);
        }
        return f6541b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m9073f(@NonNull Context context) {
        if (f6542c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f6542c = Boolean.valueOf(z);
        }
        return f6542c.booleanValue();
    }
}
