package p040c.p200q.p201a.p264c.p265a.p266a;

import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p040c.p200q.p201a.p264c.p294g.p295a.C3610i;

/* renamed from: c.q.a.c.a.a.d */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class C3224d {
    @WorkerThread
    /* renamed from: a */
    public static final void m8288a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            C3610i.m9153b(263);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
                sb.toString();
            }
            httpURLConnection.disconnect();
            C3610i.m9152a();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            sb2.toString();
            C3610i.m9152a();
        } catch (IOException | RuntimeException e2) {
            try {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                sb3.toString();
            } finally {
                C3610i.m9152a();
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
