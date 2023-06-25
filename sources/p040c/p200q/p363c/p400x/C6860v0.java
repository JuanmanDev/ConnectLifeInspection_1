package p040c.p200q.p363c.p400x;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.q.c.x.v0 */
/* compiled from: Store */
public class C6860v0 {

    /* renamed from: a */
    public final SharedPreferences f13132a;

    /* renamed from: c.q.c.x.v0$a */
    /* compiled from: Store */
    public static class C6861a {

        /* renamed from: d */
        public static final long f13133d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f13134a;

        /* renamed from: b */
        public final String f13135b;

        /* renamed from: c */
        public final long f13136c;

        public C6861a(String str, String str2, long j) {
            this.f13134a = str;
            this.f13135b = str2;
            this.f13136c = j;
        }

        /* renamed from: a */
        public static String m19500a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FirebaseMessagingService.EXTRA_TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(NotificationCompat.CarExtender.KEY_TIMESTAMP, j);
                return jSONObject.toString();
            } catch (JSONException e) {
                "Failed to encode token: " + e;
                return null;
            }
        }

        /* renamed from: c */
        public static C6861a m19501c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C6861a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C6861a(jSONObject.getString(FirebaseMessagingService.EXTRA_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(NotificationCompat.CarExtender.KEY_TIMESTAMP));
            } catch (JSONException e) {
                "Failed to parse token: " + e;
                return null;
            }
        }

        /* renamed from: b */
        public boolean mo31694b(String str) {
            return System.currentTimeMillis() > this.f13136c + f13133d || !str.equals(this.f13135b);
        }
    }

    public C6860v0(Context context) {
        this.f13132a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        mo31688a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    public final void mo31688a(Context context, String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo31692e()) {
                    mo31690c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    "Error creating file in no backup dir: " + e.getMessage();
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo31689b(String str, String str2) {
        return str + "|T|" + str2 + "|" + "*";
    }

    /* renamed from: c */
    public synchronized void mo31690c() {
        this.f13132a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized C6861a mo31691d(String str, String str2) {
        return C6861a.m19501c(this.f13132a.getString(mo31689b(str, str2), (String) null));
    }

    /* renamed from: e */
    public synchronized boolean mo31692e() {
        return this.f13132a.getAll().isEmpty();
    }

    /* renamed from: f */
    public synchronized void mo31693f(String str, String str2, String str3, String str4) {
        String a = C6861a.m19500a(str3, str4, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f13132a.edit();
            edit.putString(mo31689b(str, str2), a);
            edit.commit();
        }
    }
}
