package p040c.p048b.p049a.p050a.p051a.p055i;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.utils.HashAlgorithm;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.p067t.C1471a;
import p040c.p048b.p049a.p050a.p051a.p067t.C1472b;
import p040c.p048b.p049a.p050a.p051a.p067t.C1478g;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.i.a */
/* compiled from: APIKeyDecoder */
public final class C1375a {

    /* renamed from: a */
    public static final String f413a = "c.b.a.a.a.i.a";

    /* renamed from: a */
    public static AppInfo m342a(String str, String str2, Context context) {
        return m343b(str, str2, true, context);
    }

    /* renamed from: b */
    public static AppInfo m343b(String str, String str2, boolean z, Context context) {
        C1485a.m836i(f413a, "Begin decoding API Key for packageName=", str);
        JSONObject a = new C1472b().mo15339a(str2);
        String str3 = f413a;
        C1485a.m836i(str3, "APIKey", "payload=" + a);
        if (a == null) {
            String str4 = f413a;
            C1485a.m838k(str4, "Unable to decode APIKey for pkg=" + str);
            return null;
        }
        if (z) {
            try {
                m345d(str, a, context);
            } catch (SecurityException e) {
                String str5 = f413a;
                C1485a.m838k(str5, "Failed to decode: " + e.getMessage());
                String str6 = f413a;
                C1485a.m838k(str6, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (PackageManager.NameNotFoundException e2) {
                String str7 = f413a;
                C1485a.m838k(str7, "Failed to decode: " + e2.getMessage());
                String str62 = f413a;
                C1485a.m838k(str62, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (CertificateException e3) {
                String str8 = f413a;
                C1485a.m838k(str8, "Failed to decode: " + e3.getMessage());
                String str622 = f413a;
                C1485a.m838k(str622, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (NoSuchAlgorithmException e4) {
                String str9 = f413a;
                C1485a.m838k(str9, "Failed to decode: " + e4.getMessage());
                String str6222 = f413a;
                C1485a.m838k(str6222, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (JSONException e5) {
                String str10 = f413a;
                C1485a.m838k(str10, "Failed to decode: " + e5.getMessage());
                String str62222 = f413a;
                C1485a.m838k(str62222, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (IOException e6) {
                String str11 = f413a;
                C1485a.m838k(str11, "Failed to decode: " + e6.getMessage());
                String str622222 = f413a;
                C1485a.m838k(str622222, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (AuthError e7) {
                String str12 = f413a;
                C1485a.m838k(str12, "Failed to decode: " + e7.getMessage());
                String str6222222 = f413a;
                C1485a.m838k(str6222222, "Unable to decode APIKey for pkg=" + str);
                return null;
            }
        }
        return m344c(a);
    }

    /* renamed from: c */
    public static AppInfo m344c(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject2;
        String string = jSONObject.getString("ver");
        if (string.equals("1")) {
            str2 = jSONObject.getString("appId");
            str = str2;
        } else {
            str2 = jSONObject.getString("appFamilyId");
            str = jSONObject.getString("appVariantId");
        }
        if (string.equals("3")) {
            try {
                jSONObject2 = jSONObject.getJSONObject("endpoints");
            } catch (JSONException unused) {
                C1485a.m838k(f413a, "APIKey does not contain endpoints object");
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                String string2 = jSONObject2.getString("authz");
                String string3 = jSONObject2.getString("tokenExchange");
                if (string2 != null && !string2.startsWith("https")) {
                    throw new AuthError("Authorization Host in APIKey is invalid", AuthError.ERROR_TYPE.ERROR_BAD_PARAM);
                } else if (string3 == null || string3.startsWith("https")) {
                    str3 = string3;
                    str4 = string2;
                    String string4 = jSONObject.getString("pkg");
                    String[] a = C1471a.m793a(jSONObject, "scopes");
                    str5 = jSONObject.getString("clientId");
                    return new AppInfo(str2, str, string4, a, C1471a.m793a(jSONObject, "perm"), str5, str4, str3, jSONObject);
                } else {
                    throw new AuthError("Exchange Host in APIKey is invalid", AuthError.ERROR_TYPE.ERROR_BAD_PARAM);
                }
            }
        }
        str4 = null;
        str3 = null;
        String string42 = jSONObject.getString("pkg");
        String[] a2 = C1471a.m793a(jSONObject, "scopes");
        try {
            str5 = jSONObject.getString("clientId");
        } catch (JSONException unused2) {
            C1485a.m838k(f413a, "APIKey does not contain a client id");
            str5 = null;
        }
        return new AppInfo(str2, str, string42, a2, C1471a.m793a(jSONObject, "perm"), str5, str4, str3, jSONObject);
    }

    /* renamed from: d */
    public static void m345d(String str, JSONObject jSONObject, Context context) {
        C1485a.m836i(f413a, "verifyPayload for packageName=", str);
        if (!jSONObject.getString("iss").equals("Amazon")) {
            throw new SecurityException("Decoding fails: issuer (" + jSONObject.getString("iss") + ") is not = " + "Amazon" + " pkg=" + str);
        } else if (str == null || str.equals(jSONObject.getString("pkg"))) {
            if (jSONObject.has("appsig")) {
                String string = jSONObject.getString("appsig");
                C1485a.m836i(f413a, "Validating MD5 signature in API key", String.format("pkg = %s and signature %s", new Object[]{str, string}));
                m346e(string, str, HashAlgorithm.MD5, context);
            }
            if (jSONObject.has("appsigSha256")) {
                String string2 = jSONObject.getString("appsigSha256");
                C1485a.m836i(f413a, "Validating SHA256 signature in API key", String.format("pkg = %s and signature %s", new Object[]{str, string2}));
                m346e(string2, str, HashAlgorithm.SHA_256, context);
            }
        } else {
            throw new SecurityException("Decoding fails: package names don't match! - " + str + " != " + jSONObject.getString("pkg"));
        }
    }

    /* renamed from: e */
    public static void m346e(String str, String str2, HashAlgorithm hashAlgorithm, Context context) {
        if (str != null) {
            String replace = str.replace(RunnerArgs.CLASSPATH_SEPARATOR, "");
            List<String> a = C1478g.m812a(str2, hashAlgorithm, context);
            String str3 = f413a;
            C1485a.m832e(str3, "Number of signatures = " + a.size());
            C1485a.m836i(f413a, "Fingerprint checking", a.toString());
            if (!a.contains(replace.toLowerCase(Locale.US))) {
                throw new SecurityException("Decoding failed: certificate fingerprint can't be verified! pkg=" + str2);
            }
            return;
        }
        String str4 = f413a;
        C1485a.m828a(str4, "App Signature is null. pkg=" + str2);
        throw new SecurityException("Decoding failed: certificate fingerprint can't be verified! pkg=" + str2);
    }
}
