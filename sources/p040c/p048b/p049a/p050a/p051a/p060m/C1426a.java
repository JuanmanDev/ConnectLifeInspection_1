package p040c.p048b.p049a.p050a.p051a.p060m;

import android.text.TextUtils;
import android.util.Pair;
import com.amazon.identity.auth.device.AuthError;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import p040c.p048b.p049a.p050a.p051a.p060m.C1440o;
import p040c.p048b.p049a.p050a.p051a.p061n.C1445b;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.a */
/* compiled from: AbstractHTTPSRequest */
public abstract class C1426a<T extends C1440o> {

    /* renamed from: d */
    public static final String f548d = "c.b.a.a.a.m.a";

    /* renamed from: e */
    public static final int f549e = ((int) TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS));

    /* renamed from: f */
    public static final int f550f = ((int) TimeUnit.MILLISECONDS.convert(64, TimeUnit.SECONDS));

    /* renamed from: a */
    public final C1432g f551a = new C1432g(f549e, f550f);

    /* renamed from: b */
    public boolean f552b;

    /* renamed from: c */
    public final List<Pair<String, String>> f553c = new ArrayList();

    /* renamed from: a */
    public abstract T mo15211a(C1433h hVar);

    /* renamed from: b */
    public abstract String mo15212b();

    /* renamed from: c */
    public abstract void mo15213c();

    /* renamed from: d */
    public HttpsURLConnection mo15214d(String str) {
        URL url = new URL(str);
        C1432g.m641j(url);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        C1445b.m722c(httpsURLConnection);
        mo15219i(httpsURLConnection);
        httpsURLConnection.setConnectTimeout(30000);
        mo15223m(httpsURLConnection);
        return httpsURLConnection;
    }

    /* renamed from: e */
    public abstract void mo15215e();

    /* renamed from: f */
    public abstract void mo15216f();

    /* renamed from: g */
    public final void mo15217g(HttpsURLConnection httpsURLConnection) {
        C1485a.m836i(f548d, "Http request method", httpsURLConnection.getRequestMethod());
        Map requestProperties = httpsURLConnection.getRequestProperties();
        if (requestProperties != null) {
            C1485a.m832e(f548d, "Number of Headers : " + requestProperties.size());
            for (Map.Entry entry : requestProperties.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list != null && list.size() > 0) {
                    C1485a.m836i(f548d, "Header used for request: name=" + str, "val=" + TextUtils.join(", ", list));
                }
            }
        } else {
            C1485a.m832e(f548d, "No Headers");
        }
        mo15216f();
    }

    /* renamed from: h */
    public T mo15218h(HttpsURLConnection httpsURLConnection) {
        C1433h hVar = null;
        while (this.f551a.mo15256i() < 1) {
            hVar = C1433h.m648e(httpsURLConnection);
            String str = f548d;
            C1485a.m836i(str, "Get response.", "Response code: " + hVar.mo15258b());
            if (this.f552b || !C1432g.m640g(hVar.mo15258b())) {
                break;
            }
            String str2 = f548d;
            C1485a.m838k(str2, "Connection failed on request attempt " + (this.f551a.mo15256i() + 1) + " of " + 1);
            httpsURLConnection = mo15221k(mo15212b());
        }
        return mo15211a(hVar);
    }

    /* renamed from: i */
    public abstract void mo15219i(HttpsURLConnection httpsURLConnection);

    /* renamed from: j */
    public final T mo15220j() {
        try {
            mo15213c();
            mo15215e();
            String b = mo15212b();
            this.f552b = C1432g.m639f(new URL(b));
            HttpsURLConnection d = mo15214d(b);
            mo15217g(d);
            mo15222l(d);
            String str = f548d;
            C1485a.m832e(str, "Request url: " + d.getURL());
            return mo15218h(d);
        } catch (MalformedURLException e) {
            C1485a.m830c(f548d, "Invalid URL", e);
            throw new AuthError("MalformedURLException", e, AuthError.ERROR_TYPE.ERROR_BAD_PARAM);
        } catch (IOException e2) {
            String str2 = f548d;
            C1485a.m830c(str2, "Received IO error when executing token request:" + e2.toString(), e2);
            throw new AuthError("Received communication error when executing token request", e2, AuthError.ERROR_TYPE.ERROR_IO);
        } catch (IllegalStateException e3) {
            String str3 = f548d;
            C1485a.m830c(str3, "Received IllegalStateException error when executing token request:" + e3.toString(), e3);
            throw new AuthError("Received communication error when executing token request", e3, AuthError.ERROR_TYPE.ERROR_COM);
        }
    }

    /* renamed from: k */
    public HttpsURLConnection mo15221k(String str) {
        try {
            Thread.sleep((long) this.f551a.mo15255h());
        } catch (InterruptedException e) {
            C1485a.m839l(f548d, "Backoff wait interrupted", e);
        }
        HttpsURLConnection d = mo15214d(str);
        mo15222l(d);
        return d;
    }

    /* renamed from: l */
    public abstract void mo15222l(HttpsURLConnection httpsURLConnection);

    /* renamed from: m */
    public void mo15223m(HttpsURLConnection httpsURLConnection) {
        for (Pair next : this.f553c) {
            httpsURLConnection.setRequestProperty((String) next.first, (String) next.second);
        }
    }
}
