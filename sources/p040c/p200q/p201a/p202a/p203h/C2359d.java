package p040c.p200q.p201a.p202a.p203h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.stetho.inspector.network.DecompressionHelper;
import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.firebase.encoders.EncodingException;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p040c.p200q.p201a.p202a.C2350b;
import p040c.p200q.p201a.p202a.p203h.p204f.C2363a;
import p040c.p200q.p201a.p202a.p203h.p204f.C2389j;
import p040c.p200q.p201a.p202a.p203h.p204f.C2390k;
import p040c.p200q.p201a.p202a.p203h.p204f.C2392l;
import p040c.p200q.p201a.p202a.p203h.p204f.C2394m;
import p040c.p200q.p201a.p202a.p205i.C2526i;
import p040c.p200q.p201a.p202a.p205i.C2527j;
import p040c.p200q.p201a.p202a.p205i.p206a0.C2396a;
import p040c.p200q.p201a.p202a.p205i.p207b0.C2406b;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;
import p040c.p200q.p201a.p202a.p205i.p214x.C2554f;
import p040c.p200q.p201a.p202a.p205i.p214x.C2562l;
import p040c.p200q.p363c.p385q.C6707a;

/* renamed from: c.q.a.a.h.d */
/* compiled from: CctTransportBackend */
public final class C2359d implements C2562l {

    /* renamed from: a */
    public final C6707a f2598a;

    /* renamed from: b */
    public final ConnectivityManager f2599b;

    /* renamed from: c */
    public final Context f2600c;

    /* renamed from: d */
    public final URL f2601d;

    /* renamed from: e */
    public final C2512a f2602e;

    /* renamed from: f */
    public final C2512a f2603f;

    /* renamed from: g */
    public final int f2604g;

    /* renamed from: c.q.a.a.h.d$a */
    /* compiled from: CctTransportBackend */
    public static final class C2360a {

        /* renamed from: a */
        public final URL f2605a;

        /* renamed from: b */
        public final C2389j f2606b;
        @Nullable

        /* renamed from: c */
        public final String f2607c;

        public C2360a(URL url, C2389j jVar, @Nullable String str) {
            this.f2605a = url;
            this.f2606b = jVar;
            this.f2607c = str;
        }

        /* renamed from: a */
        public C2360a mo17676a(URL url) {
            return new C2360a(url, this.f2606b, this.f2607c);
        }
    }

    /* renamed from: c.q.a.a.h.d$b */
    /* compiled from: CctTransportBackend */
    public static final class C2361b {

        /* renamed from: a */
        public final int f2608a;
        @Nullable

        /* renamed from: b */
        public final URL f2609b;

        /* renamed from: c */
        public final long f2610c;

        public C2361b(int i, @Nullable URL url, long j) {
            this.f2608a = i;
            this.f2609b = url;
            this.f2610c = j;
        }
    }

    public C2359d(Context context, C2512a aVar, C2512a aVar2, int i) {
        this.f2598a = C2389j.m4165b();
        this.f2600c = context;
        this.f2599b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2601d = m4051l(C2358c.f2591c);
        this.f2602e = aVar2;
        this.f2603f = aVar;
        this.f2604g = i;
    }

    /* renamed from: d */
    public static int m4044d(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
        }
        if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: e */
    public static int m4045e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.NetworkType.NONE.getValue();
        }
        return networkInfo.getType();
    }

    /* renamed from: f */
    public static int m4046f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C2396a.m4210d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: h */
    public static TelephonyManager m4047h(Context context) {
        return (TelephonyManager) context.getSystemService(EventBusConstKt.PHONE);
    }

    @VisibleForTesting
    /* renamed from: i */
    public static long m4048i() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* renamed from: j */
    public static /* synthetic */ C2360a m4049j(C2360a aVar, C2361b bVar) {
        URL url = bVar.f2609b;
        if (url == null) {
            return null;
        }
        C2396a.m4208b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo17676a(bVar.f2609b);
    }

    /* renamed from: k */
    public static InputStream m4050k(InputStream inputStream, String str) {
        return DecompressionHelper.GZIP_ENCODING.equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: l */
    public static URL m4051l(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public BackendResponse mo17672a(C2554f fVar) {
        C2389j g = mo17675g(fVar);
        URL url = this.f2601d;
        String str = null;
        if (fVar.mo17990c() != null) {
            try {
                C2358c c = C2358c.m4039c(fVar.mo17990c());
                if (c.mo17668d() != null) {
                    str = c.mo17668d();
                }
                if (c.mo17669e() != null) {
                    url = m4051l(c.mo17669e());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.m10200a();
            }
        }
        try {
            C2361b bVar = (C2361b) C2406b.m4229a(5, new C2360a(url, g, str), new C2357b(this), C2356a.f2589a);
            if (bVar.f2608a == 200) {
                return BackendResponse.m10202e(bVar.f2610c);
            }
            if (bVar.f2608a < 500) {
                if (bVar.f2608a != 404) {
                    if (bVar.f2608a == 400) {
                        return BackendResponse.m10201d();
                    }
                    return BackendResponse.m10200a();
                }
            }
            return BackendResponse.m10203f();
        } catch (IOException e) {
            C2396a.m4210d("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.m10203f();
        }
    }

    /* renamed from: b */
    public C2527j mo17673b(C2527j jVar) {
        NetworkInfo activeNetworkInfo = this.f2599b.getActiveNetworkInfo();
        C2527j.C2528a l = jVar.mo17970l();
        l.mo17971a("sdk-version", Build.VERSION.SDK_INT);
        l.mo17973c("model", Build.MODEL);
        l.mo17973c("hardware", Build.HARDWARE);
        l.mo17973c(EventBusConstKt.DEVICE, Build.DEVICE);
        l.mo17973c("product", Build.PRODUCT);
        l.mo17973c("os-uild", Build.ID);
        l.mo17973c("manufacturer", Build.MANUFACTURER);
        l.mo17973c("fingerprint", Build.FINGERPRINT);
        l.mo17972b("tz-offset", m4048i());
        l.mo17971a("net-type", m4045e(activeNetworkInfo));
        l.mo17971a("mobile-subtype", m4044d(activeNetworkInfo));
        l.mo17973c("country", Locale.getDefault().getCountry());
        l.mo17973c("locale", Locale.getDefault().getLanguage());
        l.mo17973c("mcc_mnc", m4047h(this.f2600c).getSimOperator());
        l.mo17973c("application_build", Integer.toString(m4046f(this.f2600c)));
        return l.mo17791d();
    }

    /* renamed from: c */
    public final C2361b mo17674c(C2360a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream k;
        C2396a.m4212f("CctTransportBackend", "Making request to: %s", aVar.f2605a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f2605a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f2604g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.8"}));
        httpURLConnection.setRequestProperty("Content-Encoding", DecompressionHelper.GZIP_ENCODING);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", DecompressionHelper.GZIP_ENCODING);
        String str = aVar.f2607c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f2598a.mo31334a(aVar.f2606b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C2396a.m4212f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                C2396a.m4208b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(HttpHeaders.CONTENT_TYPE));
                C2396a.m4208b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C2361b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new C2361b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    k = m4050k(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C2361b bVar = new C2361b(responseCode, (URL) null, C2394m.m4204b(new BufferedReader(new InputStreamReader(k))).mo17761c());
                    if (k != null) {
                        k.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            C2396a.m4210d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C2361b(500, (URL) null, 0);
        } catch (EncodingException | IOException e2) {
            C2396a.m4210d("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C2361b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: g */
    public final C2389j mo17675g(C2554f fVar) {
        C2390k.C2391a aVar;
        HashMap hashMap = new HashMap();
        for (C2527j next : fVar.mo17989b()) {
            String j = next.mo17788j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C2527j jVar = (C2527j) ((List) entry.getValue()).get(0);
            C2392l.C2393a a = C2392l.m4185a();
            a.mo17758f(QosTier.DEFAULT);
            a.mo17759g(this.f2603f.mo17952a());
            a.mo17760h(this.f2602e.mo17952a());
            ClientInfo.C3989a a2 = ClientInfo.m10188a();
            a2.mo17724c(ClientInfo.ClientType.ANDROID_FIREBASE);
            C2363a.C2364a a3 = C2363a.m4058a();
            a3.mo17701m(Integer.valueOf(jVar.mo17967g("sdk-version")));
            a3.mo17698j(jVar.mo17966b("model"));
            a3.mo17694f(jVar.mo17966b("hardware"));
            a3.mo17692d(jVar.mo17966b(EventBusConstKt.DEVICE));
            a3.mo17700l(jVar.mo17966b("product"));
            a3.mo17699k(jVar.mo17966b("os-uild"));
            a3.mo17696h(jVar.mo17966b("manufacturer"));
            a3.mo17693e(jVar.mo17966b("fingerprint"));
            a3.mo17691c(jVar.mo17966b("country"));
            a3.mo17695g(jVar.mo17966b("locale"));
            a3.mo17697i(jVar.mo17966b("mcc_mnc"));
            a3.mo17690b(jVar.mo17966b("application_build"));
            a2.mo17723b(a3.mo17689a());
            a.mo17754b(a2.mo17722a());
            try {
                a.mo17773i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a.mo17774j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C2527j jVar2 : (List) entry.getValue()) {
                C2526i e = jVar2.mo17784e();
                C2350b b = e.mo17962b();
                if (b.equals(C2350b.m4027b("proto"))) {
                    aVar = C2390k.m4169j(e.mo17961a());
                } else if (b.equals(C2350b.m4027b("json"))) {
                    aVar = C2390k.m4168i(new String(e.mo17961a(), Charset.forName("UTF-8")));
                } else {
                    C2396a.m4213g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b);
                }
                aVar.mo17737c(jVar2.mo17786f());
                aVar.mo17738d(jVar2.mo17789k());
                aVar.mo17742h(jVar2.mo17968h("tz-offset"));
                NetworkConnectionInfo.C3990a a4 = NetworkConnectionInfo.m10194a();
                a4.mo17772c(NetworkConnectionInfo.NetworkType.forNumber(jVar2.mo17967g("net-type")));
                a4.mo17771b(NetworkConnectionInfo.MobileSubtype.forNumber(jVar2.mo17967g("mobile-subtype")));
                aVar.mo17739e(a4.mo17770a());
                if (jVar2.mo17783d() != null) {
                    aVar.mo17736b(jVar2.mo17783d());
                }
                arrayList3.add(aVar.mo17735a());
            }
            a.mo17755c(arrayList3);
            arrayList2.add(a.mo17753a());
        }
        return C2389j.m4164a(arrayList2);
    }

    public C2359d(Context context, C2512a aVar, C2512a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
