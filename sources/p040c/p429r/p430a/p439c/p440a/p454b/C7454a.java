package p040c.p429r.p430a.p439c.p440a.p454b;

import com.hisense.connect_life.hismart.networks.retrofit.SSLSocketClient;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: c.r.a.c.a.b.a */
/* compiled from: lambda */
public final /* synthetic */ class C7454a implements HostnameVerifier {

    /* renamed from: a */
    public static final /* synthetic */ C7454a f14143a = new C7454a();

    private /* synthetic */ C7454a() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return SSLSocketClient.m27092_get_hostnameVerifier_$lambda1(str, sSLSession);
    }
}
