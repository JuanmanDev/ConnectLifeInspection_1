package p040c.p200q.p201a.p264c.p276d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import p040c.p200q.p201a.p264c.p276d.p281j.C3513t1;
import p040c.p200q.p201a.p264c.p276d.p289n.C3557h;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;
import p040c.p200q.p201a.p264c.p294g.p300f.C3655m;

/* renamed from: c.q.a.c.d.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3326c {

    /* renamed from: a */
    public static final int f6203a = C3330e.f6210a;

    /* renamed from: b */
    public static final C3326c f6204b = new C3326c();

    @NonNull
    /* renamed from: f */
    public static C3326c m8424f() {
        return f6204b;
    }

    /* renamed from: a */
    public int mo20403a(@NonNull Context context) {
        return C3330e.m8443a(context);
    }

    @Nullable
    /* renamed from: b */
    public Intent mo20385b(@Nullable Context context, int i, @Nullable String str) {
        if (i == 1 || i == 2) {
            if (context != null && C3557h.m9071d(context)) {
                return C3513t1.m8948a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f6203a);
            sb.append(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
            if (context != null) {
                try {
                    sb.append(C3573c.m9110a(context).mo20847e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C3513t1.m8949b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C3513t1.m8950c("com.google.android.gms");
        }
    }

    @Nullable
    /* renamed from: c */
    public PendingIntent mo20386c(@NonNull Context context, int i, int i2) {
        return mo20404d(context, i, i2, (String) null);
    }

    @Nullable
    /* renamed from: d */
    public PendingIntent mo20404d(@NonNull Context context, int i, int i2, @Nullable String str) {
        Intent b = mo20385b(context, i, str);
        if (b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, b, C3655m.f6600a | 134217728);
    }

    @NonNull
    /* renamed from: e */
    public String mo20387e(int i) {
        return C3330e.m8444b(i);
    }

    /* renamed from: g */
    public int mo20388g(@NonNull Context context) {
        return mo20389h(context, f6203a);
    }

    /* renamed from: h */
    public int mo20389h(@NonNull Context context, int i) {
        int f = C3330e.m8448f(context, i);
        if (C3330e.m8449g(context, f)) {
            return 18;
        }
        return f;
    }

    /* renamed from: i */
    public boolean mo20405i(@NonNull Context context, @NonNull String str) {
        return C3330e.m8453k(context, str);
    }

    /* renamed from: j */
    public boolean mo20390j(int i) {
        return C3330e.m8451i(i);
    }
}
