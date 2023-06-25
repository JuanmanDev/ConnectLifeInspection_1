package p040c.p301y.p302b.p517d;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: c.y.b.d.a */
/* compiled from: OkHttpSSL */
public class C7743a {

    /* renamed from: c.y.b.d.a$a */
    /* compiled from: OkHttpSSL */
    public class C7744a implements HostnameVerifier {
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* renamed from: a */
    public static HostnameVerifier m21826a() {
        return new C7744a();
    }
}
