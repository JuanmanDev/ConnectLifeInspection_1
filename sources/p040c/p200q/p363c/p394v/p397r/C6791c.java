package p040c.p200q.p363c.p394v.p397r;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.stetho.inspector.network.DecompressionHelper;
import com.facebook.stetho.server.http.HttpHeaders;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3550a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3558i;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.p390s.C6750j;
import p040c.p200q.p363c.p393u.C6757b;

/* renamed from: c.q.c.v.r.c */
/* compiled from: FirebaseInstallationServiceClient */
public class C6791c {

    /* renamed from: d */
    public static final Pattern f12983d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    public static final Charset f12984e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f12985a;

    /* renamed from: b */
    public final C6757b<C6750j> f12986b;

    /* renamed from: c */
    public final C6792d f12987c = new C6792d();

    public C6791c(@NonNull Context context, @NonNull C6757b<C6750j> bVar) {
        this.f12985a = context;
        this.f12986b = bVar;
    }

    /* renamed from: a */
    public static String m19254a(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    public static JSONObject m19255b(@Nullable String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static JSONObject m19256c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: h */
    public static byte[] m19257h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    public static boolean m19258i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    public static void m19259j() {
    }

    /* renamed from: k */
    public static void m19260k(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (!TextUtils.isEmpty(m19262o(httpURLConnection))) {
            m19254a(str, str2, str3);
        }
    }

    /* renamed from: m */
    public static long m19261m(String str) {
        C3495o.m8900b(f12983d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    @androidx.annotation.Nullable
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19262o(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f12984e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p394v.p397r.C6791c.m19262o(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: s */
    public static void m19263s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    @NonNull
    /* renamed from: d */
    public InstallationResponse mo31547d(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) {
        InstallationResponse n;
        if (this.f12987c.mo31557b()) {
            int i = 0;
            URL g = mo31550g(String.format("projects/%s/installations", new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = mo31551l(g, str);
                try {
                    l.setRequestMethod(ShareTarget.METHOD_POST);
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    mo31554q(l, str2, str4);
                    int responseCode = l.getResponseCode();
                    this.f12987c.mo31559f(responseCode);
                    if (m19258i(responseCode)) {
                        n = mo31552n(l);
                    } else {
                        m19260k(l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m19259j();
                            InstallationResponse.C8291a a = InstallationResponse.m22994a();
                            a.mo31535e(InstallationResponse.ResponseCode.BAD_CONFIG);
                            n = a.mo31531a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    /* renamed from: e */
    public TokenResult mo31548e(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        TokenResult p;
        if (this.f12987c.mo31557b()) {
            int i = 0;
            URL g = mo31550g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = mo31551l(g, str);
                try {
                    l.setRequestMethod(ShareTarget.METHOD_POST);
                    l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    mo31555r(l);
                    int responseCode = l.getResponseCode();
                    this.f12987c.mo31559f(responseCode);
                    if (m19258i(responseCode)) {
                        p = mo31553p(l);
                    } else {
                        m19260k(l, (String) null, str, str3);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    m19259j();
                                    TokenResult.C8292a a = TokenResult.m23006a();
                                    a.mo31544b(TokenResult.ResponseCode.BAD_CONFIG);
                                    p = a.mo31543a();
                                } else {
                                    l.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i++;
                                }
                            }
                        }
                        TokenResult.C8292a a2 = TokenResult.m23006a();
                        a2.mo31544b(TokenResult.ResponseCode.AUTH_ERROR);
                        p = a2.mo31543a();
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    /* renamed from: f */
    public final String mo31549f() {
        try {
            byte[] a = C3550a.m9042a(this.f12985a, this.f12985a.getPackageName());
            if (a != null) {
                return C3558i.m9076c(a, false);
            }
            "Could not get fingerprint hash for package: " + this.f12985a.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            "No such package: " + this.f12985a.getPackageName();
            return null;
        }
    }

    /* renamed from: g */
    public final URL mo31550g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: l */
    public final HttpURLConnection mo31551l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", DecompressionHelper.GZIP_ENCODING);
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f12985a.getPackageName());
            C6750j jVar = this.f12986b.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) C5777m.m16409a(jVar.mo31417a()));
                } catch (ExecutionException unused) {
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", mo31549f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    public final InstallationResponse mo31552n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f12984e));
        TokenResult.C8292a a = TokenResult.m23006a();
        InstallationResponse.C8291a a2 = InstallationResponse.m22994a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo31536f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo31533c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo31534d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(FirebaseMessagingService.EXTRA_TOKEN)) {
                        a.mo31545c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo31546d(m19261m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo31532b(a.mo31543a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a2.mo31535e(InstallationResponse.ResponseCode.OK);
        return a2.mo31531a();
    }

    /* renamed from: p */
    public final TokenResult mo31553p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f12984e));
        TokenResult.C8292a a = TokenResult.m23006a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(FirebaseMessagingService.EXTRA_TOKEN)) {
                a.mo31545c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo31546d(m19261m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a.mo31544b(TokenResult.ResponseCode.OK);
        return a.mo31543a();
    }

    /* renamed from: q */
    public final void mo31554q(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) {
        m19263s(httpURLConnection, m19257h(m19255b(str, str2)));
    }

    /* renamed from: r */
    public final void mo31555r(HttpURLConnection httpURLConnection) {
        m19263s(httpURLConnection, m19257h(m19256c()));
    }
}
