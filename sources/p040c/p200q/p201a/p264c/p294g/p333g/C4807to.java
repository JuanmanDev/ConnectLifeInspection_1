package p040c.p200q.p201a.p264c.p294g.p333g;

import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.internal.p527firebaseauthapi.zzvg;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.g.g.to */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4807to {
    /* renamed from: a */
    public static void m13174a(String str, C4962zn znVar, C4729qo qoVar, Type type, C4378do doVar) {
        BufferedOutputStream bufferedOutputStream;
        try {
            C3495o.m8908j(znVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = znVar.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.setConnectTimeout(60000);
            doVar.mo25916a(httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            bufferedOutputStream.write(bytes, 0, length);
            bufferedOutputStream.close();
            m13175b(httpURLConnection, qoVar, type);
            return;
        } catch (SocketTimeoutException unused) {
            qoVar.mo26082c("TIMEOUT");
            return;
        } catch (UnknownHostException unused2) {
            qoVar.mo26082c("<<Network Error>>");
            return;
        } catch (IOException | NullPointerException | JSONException e) {
            qoVar.mo26082c(e.getMessage());
            return;
        } catch (Throwable th) {
            C4781so.m13090a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public static void m13175b(HttpURLConnection httpURLConnection, C4729qo qoVar, Type type) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (m13176c(responseCode)) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (!m13176c(responseCode)) {
                qoVar.mo26082c((String) C4936yn.m13619a(sb2, String.class));
            } else {
                qoVar.mo26081a((C4297ao) C4936yn.m13619a(sb2, type));
            }
            httpURLConnection.disconnect();
            return;
        } catch (SocketTimeoutException unused) {
            qoVar.mo26082c("TIMEOUT");
            httpURLConnection.disconnect();
            return;
        } catch (zzvg | IOException e) {
            try {
                qoVar.mo26082c(e.getMessage());
                return;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            C4781so.m13090a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public static final boolean m13176c(int i) {
        return i >= 200 && i < 300;
    }
}
