package p040c.p200q.p363c.p367l.p368h;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3515b;

/* renamed from: c.q.c.l.h.w */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6400w {
    @VisibleForTesting

    /* renamed from: a */
    public static final Map f12078a;

    static {
        HashMap hashMap = new HashMap();
        f12078a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        f12078a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        f12078a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        f12078a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        f12078a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m17942a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || !f12078a.containsKey(string)) {
                return C6381g.m17909a("WEB_INTERNAL_ERROR:" + str);
            }
            return C6381g.m17909a(((String) f12078a.get(string)) + RunnerArgs.CLASSPATH_SEPARATOR + string2);
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            return C6381g.m17909a("WEB_INTERNAL_ERROR:" + str + "[ " + localizedMessage + " ]");
        }
    }

    /* renamed from: b */
    public static void m17943b(Intent intent, Status status) {
        C3515b.m8981d(status, intent, "com.google.firebase.auth.internal.STATUS");
    }
}
