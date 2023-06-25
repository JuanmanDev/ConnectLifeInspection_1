package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.base.R$string;
import java.util.Locale;
import p040c.p200q.p201a.p264c.p276d.p289n.C3557h;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.d.j.b0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3448b0 {

    /* renamed from: a */
    public static final SimpleArrayMap<String, String> f6401a = new SimpleArrayMap<>();
    @Nullable

    /* renamed from: b */
    public static Locale f6402b;

    /* renamed from: a */
    public static String m8742a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C3573c.m9110a(context).mo20846d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m8743b(Context context) {
        return context.getResources().getString(R$string.common_google_play_services_notification_channel_name);
    }

    @NonNull
    /* renamed from: c */
    public static String m8744c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R$string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(R$string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(R$string.common_google_play_services_enable_button);
    }

    @NonNull
    /* renamed from: d */
    public static String m8745d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m8742a(context);
        if (i == 1) {
            return resources.getString(R$string.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R$string.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m8749h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m8749h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(R$string.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m8749h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m8749h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m8749h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(R$string.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C3557h.m9071d(context)) {
            return resources.getString(R$string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R$string.common_google_play_services_update_text, new Object[]{a});
        }
    }

    @NonNull
    /* renamed from: e */
    public static String m8746e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m8749h(context, "common_google_play_services_resolution_required_text", m8742a(context));
        }
        return m8745d(context, i);
    }

    @NonNull
    /* renamed from: f */
    public static String m8747f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m8750i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m8748g(context, i);
        }
        return str == null ? context.getResources().getString(R$string.common_google_play_services_notification_ticker) : str;
    }

    @Nullable
    /* renamed from: g */
    public static String m8748g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R$string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R$string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R$string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return m8750i(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m8750i(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return m8750i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m8750i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                sb.toString();
                return null;
        }
    }

    /* renamed from: h */
    public static String m8749h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m8750i(context, str);
        if (i == null) {
            i = resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8750i(android.content.Context r4, java.lang.String r5) {
        /*
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> r0 = f6401a
            monitor-enter(r0)
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ all -> 0x0079 }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x0079 }
            androidx.core.os.LocaleListCompat r1 = androidx.core.p028os.ConfigurationCompat.getLocales(r1)     // Catch:{ all -> 0x0079 }
            r2 = 0
            java.util.Locale r1 = r1.get(r2)     // Catch:{ all -> 0x0079 }
            java.util.Locale r2 = f6402b     // Catch:{ all -> 0x0079 }
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0079 }
            if (r2 != 0) goto L_0x0023
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> r2 = f6401a     // Catch:{ all -> 0x0079 }
            r2.clear()     // Catch:{ all -> 0x0079 }
            f6402b = r1     // Catch:{ all -> 0x0079 }
        L_0x0023:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> r1 = f6401a     // Catch:{ all -> 0x0079 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x002f
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r1
        L_0x002f:
            android.content.res.Resources r4 = p040c.p200q.p201a.p264c.p276d.C3328d.m8442d(r4)     // Catch:{ all -> 0x0079 }
            r1 = 0
            if (r4 != 0) goto L_0x0038
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r1
        L_0x0038:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch:{ all -> 0x0079 }
            if (r2 != 0) goto L_0x0055
            java.lang.String r4 = "Missing resource: "
            int r2 = r5.length()     // Catch:{ all -> 0x0079 }
            if (r2 == 0) goto L_0x004e
            r4.concat(r5)     // Catch:{ all -> 0x0079 }
            goto L_0x0053
        L_0x004e:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0079 }
            r5.<init>(r4)     // Catch:{ all -> 0x0079 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r1
        L_0x0055:
            java.lang.String r4 = r4.getString(r2)     // Catch:{ all -> 0x0079 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0079 }
            if (r2 == 0) goto L_0x0072
            java.lang.String r4 = "Got empty resource: "
            int r2 = r5.length()     // Catch:{ all -> 0x0079 }
            if (r2 == 0) goto L_0x006b
            r4.concat(r5)     // Catch:{ all -> 0x0079 }
            goto L_0x0070
        L_0x006b:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0079 }
            r5.<init>(r4)     // Catch:{ all -> 0x0079 }
        L_0x0070:
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r1
        L_0x0072:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> r1 = f6401a     // Catch:{ all -> 0x0079 }
            r1.put(r5, r4)     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r4
        L_0x0079:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p281j.C3448b0.m8750i(android.content.Context, java.lang.String):java.lang.String");
    }
}
