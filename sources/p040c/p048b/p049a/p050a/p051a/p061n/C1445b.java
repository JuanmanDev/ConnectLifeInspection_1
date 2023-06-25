package p040c.p048b.p049a.p050a.p051a.p061n;

import android.content.Context;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: c.b.a.a.a.n.b */
/* compiled from: LWAEnvironment */
public class C1445b {
    /* renamed from: a */
    public static synchronized C1444a m720a(Context context, AppInfo appInfo) {
        C1446c cVar;
        synchronized (C1445b.class) {
            cVar = new C1446c(context, appInfo);
        }
        return cVar;
    }

    /* renamed from: b */
    public static boolean m721b() {
        return true;
    }

    /* renamed from: c */
    public static void m722c(HttpsURLConnection httpsURLConnection) {
    }
}
