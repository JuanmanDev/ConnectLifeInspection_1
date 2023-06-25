package p040c.p200q.p363c.p400x;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: c.q.c.x.n0 */
/* compiled from: NotificationParams */
public class C6843n0 {
    @NonNull

    /* renamed from: a */
    public final Bundle f13101a;

    public C6843n0(@NonNull Bundle bundle) {
        if (bundle != null) {
            this.f13101a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: d */
    public static int m19435d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    public static boolean m19436s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* renamed from: t */
    public static boolean m19437t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m19439v("gcm.n.e")));
    }

    /* renamed from: u */
    public static boolean m19438u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    public static String m19439v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: z */
    public static String m19440z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean mo31645a(String str) {
        String p = mo31659p(str);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }

    /* renamed from: b */
    public Integer mo31646b(String str) {
        String p = mo31659p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            "Couldn't parse value of " + m19440z(str) + "(" + p + ") into an int";
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public JSONArray mo31647c(String str) {
        String p = mo31659p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            "Malformed JSON for key " + m19440z(str) + ": " + p + ", falling back to default";
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public int[] mo31648e() {
        JSONArray c = mo31647c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m19435d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            "LightSettings is invalid: " + c + ". Skipping setting LightSettings";
            return null;
        } catch (IllegalArgumentException e) {
            "LightSettings is invalid: " + c + ". " + e.getMessage() + ". Skipping setting LightSettings";
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public Uri mo31649f() {
        String p = mo31659p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = mo31659p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    @Nullable
    /* renamed from: g */
    public Object[] mo31650g(String str) {
        JSONArray c = mo31647c(str + "_loc_args");
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    @Nullable
    /* renamed from: h */
    public String mo31651h(String str) {
        return mo31659p(str + "_loc_key");
    }

    @Nullable
    /* renamed from: i */
    public String mo31652i(Resources resources, String str, String str2) {
        String h = mo31651h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            m19440z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.";
            return null;
        }
        Object[] g = mo31650g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException unused) {
            "Missing format argument for " + m19440z(str2) + ": " + Arrays.toString(g) + " Default value will be used.";
            return null;
        }
    }

    /* renamed from: j */
    public Long mo31653j(String str) {
        String p = mo31659p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            "Couldn't parse value of " + m19440z(str) + "(" + p + ") into a long";
            return null;
        }
    }

    /* renamed from: k */
    public String mo31654k() {
        return mo31659p("gcm.n.android_channel_id");
    }

    @Nullable
    /* renamed from: l */
    public Integer mo31655l() {
        Integer b = mo31646b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        "notificationCount is invalid: " + b + ". Skipping setting notificationCount.";
        return null;
    }

    @Nullable
    /* renamed from: m */
    public Integer mo31656m() {
        Integer b = mo31646b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        "notificationPriority is invalid " + b + ". Skipping setting notificationPriority.";
        return null;
    }

    /* renamed from: n */
    public String mo31657n(Resources resources, String str, String str2) {
        String p = mo31659p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return mo31652i(resources, str, str2);
    }

    @Nullable
    /* renamed from: o */
    public String mo31658o() {
        String p = mo31659p("gcm.n.sound2");
        return TextUtils.isEmpty(p) ? mo31659p("gcm.n.sound") : p;
    }

    /* renamed from: p */
    public String mo31659p(String str) {
        return this.f13101a.getString(mo31662w(str));
    }

    @Nullable
    /* renamed from: q */
    public long[] mo31660q() {
        JSONArray c = mo31647c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            "User defined vibrateTimings is invalid: " + c + ". Skipping setting vibrateTimings.";
            return null;
        }
    }

    /* renamed from: r */
    public Integer mo31661r() {
        Integer b = mo31646b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        "visibility is invalid: " + b + ". Skipping setting visibility.";
        return null;
    }

    /* renamed from: w */
    public final String mo31662w(String str) {
        if (!this.f13101a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = m19439v(str);
            if (this.f13101a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    /* renamed from: x */
    public Bundle mo31663x() {
        Bundle bundle = new Bundle(this.f13101a);
        for (String str : this.f13101a.keySet()) {
            if (!m19436s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle mo31664y() {
        Bundle bundle = new Bundle(this.f13101a);
        for (String str : this.f13101a.keySet()) {
            if (m19438u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
