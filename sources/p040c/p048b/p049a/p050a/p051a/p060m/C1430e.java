package p040c.p048b.p049a.p050a.p051a.p060m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.p028os.EnvironmentCompat;
import com.amazon.identity.auth.device.authorization.Service;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import p040c.p048b.p049a.p050a.p051a.p060m.C1440o;
import p040c.p048b.p049a.p050a.p051a.p061n.C1444a;
import p040c.p048b.p049a.p050a.p051a.p061n.C1445b;
import p040c.p048b.p049a.p050a.p051a.p067t.C1475d;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

@SuppressLint({"TrustAllX509TrustManager"})
/* renamed from: c.b.a.a.a.m.e */
/* compiled from: AbstractPandaRequest */
public abstract class C1430e<T extends C1440o> extends C1426a<T> {

    /* renamed from: m */
    public static final String f560m = "c.b.a.a.a.m.e";

    /* renamed from: n */
    public static final String f561n = ("LWAAndroidSDK/3.0.6/Android/" + Build.VERSION.RELEASE + "/" + Build.MODEL);

    /* renamed from: g */
    public final List<Pair<String, String>> f562g = new ArrayList(10);

    /* renamed from: h */
    public String f563h;

    /* renamed from: i */
    public String f564i;

    /* renamed from: j */
    public String f565j = "3.0.6";

    /* renamed from: k */
    public Context f566k;

    /* renamed from: l */
    public AppInfo f567l;

    public C1430e(Context context, AppInfo appInfo) {
        this.f566k = context;
        this.f567l = appInfo;
        this.f563h = C1475d.m804b(context);
        this.f564i = C1475d.m806d(context);
    }

    /* renamed from: b */
    public String mo15212b() {
        String t = mo15236t();
        C1444a a = C1445b.m720a(this.f566k, this.f567l);
        a.mo15293d(Service.PANDA);
        a.mo15292c(mo15247x());
        String e = a.mo15294e();
        return new URL(e + t).toString();
    }

    /* renamed from: c */
    public void mo15213c() {
        mo15241o();
        mo15243q();
    }

    /* renamed from: e */
    public void mo15215e() {
        mo15244r();
        mo15240n();
        mo15242p();
    }

    /* renamed from: i */
    public void mo15219i(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
    }

    /* renamed from: l */
    public void mo15222l(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setDoOutput(true);
        String y = mo15248y();
        if (!TextUtils.isEmpty(y)) {
            byte[] bytes = y.getBytes("UTF-8");
            httpsURLConnection.setFixedLengthStreamingMode(bytes.length);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            try {
                outputStream.write(bytes);
            } finally {
                try {
                    outputStream.flush();
                } catch (IOException e) {
                    C1485a.m830c(f560m, "Couldn't flush write body stream", e);
                }
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    C1485a.m830c(f560m, "Couldn't close write body stream", e2);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo15240n() {
        this.f562g.add(new Pair("app_name", this.f563h));
        if (this.f564i != null) {
            this.f562g.add(new Pair("app_version", this.f564i));
        }
    }

    /* renamed from: o */
    public final void mo15241o() {
        this.f553c.add(new Pair("User-Agent", f561n));
        this.f553c.add(new Pair("Accept-Language", mo15245s()));
        this.f553c.add(new Pair("Accept", "application/json"));
        this.f553c.add(new Pair("Accept-Charset", "UTF-8"));
        this.f553c.add(new Pair("X-Amzn-RequestId", UUID.randomUUID().toString()));
    }

    /* renamed from: p */
    public final void mo15242p() {
        if (!TextUtils.isEmpty(Build.MANUFACTURER) && !Build.MANUFACTURER.equals(EnvironmentCompat.MEDIA_UNKNOWN)) {
            this.f562g.add(new Pair("di.hw.name", Build.MANUFACTURER));
        }
        if (!TextUtils.isEmpty(Build.MODEL) && !Build.MODEL.equals(EnvironmentCompat.MEDIA_UNKNOWN)) {
            this.f562g.add(new Pair("di.hw.version", Build.MODEL));
        }
        this.f562g.add(new Pair("di.os.name", "Android"));
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE) && !Build.VERSION.RELEASE.equals(EnvironmentCompat.MEDIA_UNKNOWN)) {
            this.f562g.add(new Pair("di.os.version", Build.VERSION.RELEASE));
        }
        this.f562g.add(new Pair("di.sdk.version", this.f565j));
    }

    /* renamed from: q */
    public final void mo15243q() {
        List<Pair<String, String>> u = mo15237u();
        if (u != null) {
            this.f553c.addAll(u);
        }
    }

    /* renamed from: r */
    public final void mo15244r() {
        List<Pair<String, String>> v = mo15238v();
        if (v != null) {
            this.f562g.addAll(v);
        }
    }

    /* renamed from: s */
    public final String mo15245s() {
        String str = Locale.getDefault().getLanguage() + AccountManagerConstants$LOCALE.LOCALE_SEPERATOR + Locale.getDefault().getCountry();
        C1485a.m832e(f560m, "Device Language is: " + str);
        return str;
    }

    /* renamed from: t */
    public abstract String mo15236t();

    /* renamed from: u */
    public abstract List<Pair<String, String>> mo15237u();

    /* renamed from: v */
    public abstract List<Pair<String, String>> mo15238v();

    /* renamed from: w */
    public final List<Pair<String, String>> mo15246w() {
        for (Pair next : this.f562g) {
            if (next != null) {
                String str = f560m;
                C1485a.m836i(str, "Parameter Added to request", "name=" + ((String) next.first) + " val=" + ((String) next.second));
            } else {
                C1485a.m829b(f560m, "Parameter Added to request was NULL");
            }
        }
        return this.f562g;
    }

    /* renamed from: x */
    public boolean mo15247x() {
        return false;
    }

    /* renamed from: y */
    public String mo15248y() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Pair next : mo15246w()) {
            if (!TextUtils.isEmpty((CharSequence) next.first) && !TextUtils.isEmpty((CharSequence) next.second)) {
                if (z) {
                    z = false;
                } else {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode((String) next.first, "UTF-8"));
                sb.append(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
                sb.append(URLEncoder.encode((String) next.second, "UTF-8"));
            }
        }
        String sb2 = sb.toString();
        C1485a.m836i(f560m, "Request body", sb2);
        return sb2;
    }
}
