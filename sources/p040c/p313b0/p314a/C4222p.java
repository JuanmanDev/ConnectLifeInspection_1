package p040c.p313b0.p314a;

import android.net.http.SslCertificate;
import android.os.Handler;
import android.os.Looper;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: c.b0.a.p */
/* compiled from: Util */
public class C4222p {

    /* renamed from: c.b0.a.p$a */
    /* compiled from: Util */
    public class C4223a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9017j f8999e;

        /* renamed from: l */
        public final /* synthetic */ String f9000l;

        /* renamed from: m */
        public final /* synthetic */ Object f9001m;

        /* renamed from: n */
        public final /* synthetic */ Map f9002n;

        /* renamed from: o */
        public final /* synthetic */ CountDownLatch f9003o;

        /* renamed from: c.b0.a.p$a$a */
        /* compiled from: Util */
        public class C4224a implements C9017j.C9022d {
            public C4224a() {
            }

            public void error(String str, String str2, Object obj) {
                Map map = C4223a.this.f9002n;
                map.put("error", "ERROR: " + str + " " + str2);
                C4223a.this.f9002n.put(BundleJUnitUtils.KEY_RESULT, obj);
                C4223a.this.f9003o.countDown();
            }

            public void notImplemented() {
                C4223a.this.f9003o.countDown();
            }

            public void success(Object obj) {
                C4223a.this.f9002n.put(BundleJUnitUtils.KEY_RESULT, obj);
                C4223a.this.f9003o.countDown();
            }
        }

        public C4223a(C9017j jVar, String str, Object obj, Map map, CountDownLatch countDownLatch) {
            this.f8999e = jVar;
            this.f9000l = str;
            this.f9001m = obj;
            this.f9002n = map;
            this.f9003o = countDownLatch;
        }

        public void run() {
            this.f8999e.mo46574d(this.f9000l, this.f9001m, new C4224a());
        }
    }

    /* renamed from: c.b0.a.p$b */
    /* compiled from: Util */
    public class C4225b implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: c.b0.a.p$c */
    /* compiled from: Util */
    public class C4226c implements HostnameVerifier {
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* renamed from: c.b0.a.p$d */
    /* compiled from: Util */
    public static class C4227d {

        /* renamed from: a */
        public X509Certificate[] f9005a;

        /* renamed from: b */
        public PrivateKey f9006b;

        public C4227d(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.f9006b = privateKey;
            this.f9005a = x509CertificateArr;
        }
    }

    /* renamed from: c.b0.a.p$e */
    /* compiled from: Util */
    public static class C4228e {

        /* renamed from: a */
        public Object f9007a;

        /* renamed from: b */
        public String f9008b;

        public C4228e(Object obj, String str) {
            this.f9007a = obj;
            this.f9008b = str;
        }
    }

    /* renamed from: a */
    public static InputStream m11503a(String str) {
        C9024l.C9027c cVar = C4221o.f8994b;
        return C4221o.f8993a.getResources().getAssets().open(cVar != null ? cVar.mo46300e(str) : C4221o.f8996d.mo46414a(str));
    }

    /* renamed from: b */
    public static OkHttpClient m11504b() {
        try {
            TrustManager[] trustManagerArr = {new C4225b()};
            SSLContext instance = SSLContext.getInstance("SSL");
            instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(socketFactory, (X509TrustManager) trustManagerArr[0]);
            builder.hostnameVerifier(new C4226c());
            return builder.connectTimeout(15, TimeUnit.SECONDS).writeTimeout(15, TimeUnit.SECONDS).readTimeout(15, TimeUnit.SECONDS).build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m11505c(String str) {
        C9024l.C9027c cVar = C4221o.f8994b;
        String e = cVar != null ? cVar.mo46300e(str) : C4221o.f8996d.mo46414a(str);
        IOException e2 = null;
        InputStream a = m11503a(str);
        if (a != null) {
            try {
                a.close();
            } catch (IOException e3) {
                e2 = e3;
            }
        }
        if (e2 == null) {
            return "file:///android_asset/" + e;
        }
        throw e2;
    }

    /* renamed from: d */
    public static X509Certificate m11506d(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray == null) {
            return null;
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
        } catch (CertificateException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static C4228e m11507e(C9017j jVar, String str, Object obj) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HashMap hashMap = new HashMap();
        hashMap.put(BundleJUnitUtils.KEY_RESULT, (Object) null);
        hashMap.put("error", (Object) null);
        new Handler(Looper.getMainLooper()).post(new C4223a(jVar, str, obj, hashMap, countDownLatch));
        countDownLatch.await();
        return new C4228e(hashMap.get(BundleJUnitUtils.KEY_RESULT), (String) hashMap.get("error"));
    }

    /* renamed from: f */
    public static C4227d m11508f(String str, String str2, String str3) {
        C4227d dVar = null;
        try {
            InputStream a = m11503a(str);
            KeyStore instance = KeyStore.getInstance(str3);
            instance.load(a, str2 != null ? str2.toCharArray() : null);
            String nextElement = instance.aliases().nextElement();
            Key key = instance.getKey(nextElement, str2.toCharArray());
            if (key instanceof PrivateKey) {
                dVar = new C4227d((PrivateKey) key, new X509Certificate[]{(X509Certificate) instance.getCertificate(nextElement)});
            }
            a.close();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return dVar;
    }
}
