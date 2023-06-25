package p040c.p200q.p363c.p367l;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.c.l.a */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C6355a {

    /* renamed from: a */
    public final String f12026a;
    @Nullable

    /* renamed from: b */
    public final String f12027b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        Collections.unmodifiableMap(hashMap);
    }

    public C6355a(String str) {
        String d = m17872d(str, "apiKey");
        String d2 = m17872d(str, "oobCode");
        String d3 = m17872d(str, "mode");
        if (d == null || d2 == null || d3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        C3495o.m8904f(d);
        C3495o.m8904f(d2);
        this.f12026a = d2;
        C3495o.m8904f(d3);
        m17872d(str, "continueUrl");
        m17872d(str, "languageCode");
        this.f12027b = m17872d(str, "tenantId");
    }

    @Nullable
    /* renamed from: b */
    public static C6355a m17871b(@Nullable String str) {
        C3495o.m8904f(str);
        try {
            return new C6355a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: d */
    public static String m17872d(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            C3495o.m8904f(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public String mo30445a() {
        return this.f12026a;
    }

    @Nullable
    /* renamed from: c */
    public final String mo30446c() {
        return this.f12027b;
    }
}
