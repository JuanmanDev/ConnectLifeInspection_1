package p040c.p200q.p201a.p264c.p294g.p335i;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;

/* renamed from: c.q.a.c.g.i.d6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5029d6 implements C4981a6 {
    @GuardedBy("GservicesLoader.class")

    /* renamed from: c */
    public static C5029d6 f9855c;

    /* renamed from: a */
    public final Context f9856a;

    /* renamed from: b */
    public final ContentObserver f9857b;

    public C5029d6() {
        this.f9856a = null;
        this.f9857b = null;
    }

    public C5029d6(Context context) {
        this.f9856a = context;
        this.f9857b = new C5013c6(this, (Handler) null);
        context.getContentResolver().registerContentObserver(C5231q5.f10082a, true, this.f9857b);
    }

    /* renamed from: a */
    public static C5029d6 m13967a(Context context) {
        C5029d6 d6Var;
        C5029d6 d6Var2;
        synchronized (C5029d6.class) {
            if (f9855c == null) {
                if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    d6Var2 = new C5029d6(context);
                } else {
                    d6Var2 = new C5029d6();
                }
                f9855c = d6Var2;
            }
            d6Var = f9855c;
        }
        return d6Var;
    }

    /* renamed from: e */
    public static synchronized void m13968e() {
        Context context;
        synchronized (C5029d6.class) {
            C5029d6 d6Var = f9855c;
            if (!(d6Var == null || (context = d6Var.f9856a) == null || d6Var.f9857b == null)) {
                context.getContentResolver().unregisterContentObserver(f9855c.f9857b);
            }
            f9855c = null;
        }
    }

    /* renamed from: b */
    public final String mo26935d(String str) {
        Context context = this.f9856a;
        if (context != null && !C5246r5.m14717a(context)) {
            try {
                return (String) C5351y5.m15362a(new C4997b6(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ String mo27146c(String str) {
        return C5231q5.m14669a(this.f9856a.getContentResolver(), str, (String) null);
    }
}
