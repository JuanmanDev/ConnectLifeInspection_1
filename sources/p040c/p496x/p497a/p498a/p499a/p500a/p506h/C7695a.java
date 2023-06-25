package p040c.p496x.p497a.p498a.p499a.p500a.p506h;

import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.p530ju.lib.datacommunication.network.http.core.HiRequest;
import com.p530ju.lib.datacommunication.network.http.core.HttpException;
import com.p530ju.lib.datacommunication.network.http.core.signature.SignatureException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import okio.BufferedSink;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7659b;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7664d;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7669e;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7672f;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h.C7682b;
import p040c.p496x.p497a.p498a.p499a.p500a.p507i.C7708a;

/* renamed from: c.x.a.a.a.a.h.a */
public class C7695a extends C7672f {

    /* renamed from: a */
    public final OkHttpClient f14464a;

    /* renamed from: b */
    public final C7672f.C7673a f14465b;

    /* renamed from: c */
    public final C7672f.C7675c f14466c;

    /* renamed from: c.x.a.a.a.a.h.a$a */
    public static /* synthetic */ class C7696a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14467a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ju.lib.datacommunication.network.http.core.HiRequest$Method[] r0 = com.p530ju.lib.datacommunication.network.http.core.HiRequest.Method.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14467a = r0
                com.ju.lib.datacommunication.network.http.core.HiRequest$Method r1 = com.p530ju.lib.datacommunication.network.http.core.HiRequest.Method.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14467a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ju.lib.datacommunication.network.http.core.HiRequest$Method r1 = com.p530ju.lib.datacommunication.network.http.core.HiRequest.Method.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14467a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ju.lib.datacommunication.network.http.core.HiRequest$Method r1 = com.p530ju.lib.datacommunication.network.http.core.HiRequest.Method.HEAD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14467a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ju.lib.datacommunication.network.http.core.HiRequest$Method r1 = com.p530ju.lib.datacommunication.network.http.core.HiRequest.Method.PUT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14467a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ju.lib.datacommunication.network.http.core.HiRequest$Method r1 = com.p530ju.lib.datacommunication.network.http.core.HiRequest.Method.DELETE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14467a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ju.lib.datacommunication.network.http.core.HiRequest$Method r1 = com.p530ju.lib.datacommunication.network.http.core.HiRequest.Method.PATCH     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p496x.p497a.p498a.p499a.p500a.p506h.C7695a.C7696a.<clinit>():void");
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$b */
    public class C7697b implements Interceptor {
        public C7697b(C7695a aVar) {
        }

        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            Object tag = request.tag();
            if (tag instanceof C7707l) {
                HiRequest.C8726c f = ((C7707l) tag).f14475a.mo44440f();
                if (f == null || !request.url().host().equals(f.f16479b)) {
                    String header = request.header("Host");
                    if (!C7695a.m21798l(request.url().host()) && !request.url().host().equals(header)) {
                        request = request.newBuilder().header("Host", request.url().host()).build();
                    }
                } else {
                    request = request.newBuilder().header("Host", f.f16478a).build();
                }
            }
            return chain.proceed(request);
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$c */
    public class C7698c implements Interceptor {
        public C7698c() {
        }

        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            String host = request.url().host();
            if (C7695a.m21798l(host)) {
                return chain.proceed(request);
            }
            C7669e a = C7695a.this.f14466c.mo33163a(host);
            if (a == null || a.mo33146f() == null || a.mo33146f().isEmpty()) {
                throw new UnknownHostException(host);
            }
            try {
                return chain.proceed(request.newBuilder().header("X_REAL_HOST", a.mo33146f().get(0).getHostAddress()).build());
            } catch (Exception e) {
                if ((e instanceof SocketTimeoutException) && e.getMessage() != null && e.getMessage().contains("failed to connect to") && C7695a.this.f14466c != null) {
                    C7695a.this.f14466c.mo33164b(request.url().host(), (InetAddress) null);
                }
                throw e;
            }
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$d */
    public class C7699d implements Interceptor {
        public C7699d() {
        }

        /* renamed from: a */
        public final long mo33224a(int i) {
            if (C7695a.this.f14465b == null) {
                return 0;
            }
            return C7695a.this.f14465b.mo33162a(i);
        }

        /* renamed from: b */
        public final int mo33225b(Request request) {
            Object tag = request.tag();
            if (!(tag instanceof C7707l)) {
                return 0;
            }
            HiRequest a = ((C7707l) tag).f14475a;
            if (a.mo44441g() >= 0) {
                return a.mo44441g();
            }
            return 0;
        }

        public Response intercept(Interceptor.Chain chain) {
            int i;
            long a;
            Response proceed;
            Request request = chain.request();
            int b = mo33225b(request);
            int i2 = 0;
            while (true) {
                try {
                    proceed = chain.proceed(request);
                    if ((proceed == null || !proceed.isSuccessful()) && i2 < b) {
                        i = i2 + 1;
                        a = mo33224a(i2);
                        if (a <= 0) {
                            i2 = i;
                        }
                        try {
                            Thread.sleep(a);
                        } catch (InterruptedException unused) {
                        }
                        i2 = i;
                    }
                } catch (IOException e) {
                    C7708a.m21821e("HTTP1.Stack", e, "RetryInterceptor: currentTime = " + i2 + ", url = " + request.url());
                    if (i2 < b) {
                        i = i2 + 1;
                        a = mo33224a(i2);
                        if (a <= 0) {
                        }
                    } else {
                        throw e;
                    }
                } catch (Throwable th) {
                    long a2 = mo33224a(i2);
                    if (a2 > 0) {
                        try {
                            Thread.sleep(a2);
                        } catch (InterruptedException unused2) {
                        }
                    }
                    throw th;
                }
            }
            return proceed;
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$e */
    public class C7700e implements Interceptor {
        public C7700e() {
        }

        public Response intercept(Interceptor.Chain chain) {
            C7664d.C7668d dVar;
            Request request = chain.request();
            Object tag = request.tag();
            if (tag instanceof C7707l) {
                C7707l lVar = (C7707l) tag;
                C7664d.C7668d b = lVar.f14476b;
                if (b == null) {
                    dVar = new C7664d.C7668d();
                    C7664d.C7668d unused = lVar.f14476b = dVar;
                } else {
                    while (b.mo33133a() != null) {
                        b = b.mo33133a();
                    }
                    b.mo33137e(new C7664d.C7668d());
                    dVar = b.mo33133a();
                }
                if (chain.connection().route() != null) {
                    dVar.mo33134b(chain.connection().route().socketAddress());
                }
                dVar.mo33143k(request.url().toString());
                dVar.mo33138f(C7695a.this.mo33213f(request.headers()));
                dVar.mo33139g(System.currentTimeMillis());
            } else {
                dVar = null;
            }
            try {
                Response proceed = chain.proceed(request);
                if (dVar != null) {
                    dVar.mo33141i(System.currentTimeMillis());
                    dVar.mo33142j(true);
                    dVar.mo33135c(proceed.code());
                    dVar.mo33140h(C7695a.this.mo33213f(proceed.headers()));
                }
                return proceed;
            } catch (IOException e) {
                if (dVar != null) {
                    dVar.mo33141i(System.currentTimeMillis());
                    dVar.mo33142j(false);
                    dVar.mo33136d(e);
                }
                throw e;
            } catch (RuntimeException e2) {
                if (dVar != null) {
                    dVar.mo33141i(System.currentTimeMillis());
                    dVar.mo33142j(false);
                    dVar.mo33136d(new IOException(e2));
                }
                throw e2;
            }
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$f */
    public class C7701f implements HttpLoggingInterceptor.C9972a {
        public C7701f(C7695a aVar) {
        }

        public void log(String str) {
            C7708a.m21820d("HTTP1.Stack", str);
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$g */
    public class C7702g implements Interceptor {

        /* renamed from: a */
        public final /* synthetic */ HttpLoggingInterceptor f14471a;

        public C7702g(C7695a aVar, HttpLoggingInterceptor httpLoggingInterceptor) {
            this.f14471a = httpLoggingInterceptor;
        }

        public Response intercept(Interceptor.Chain chain) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("Connection: ");
            sb.append(chain.connection().route());
            objArr[0] = sb.toString() != null ? chain.connection().route().toString() : "null";
            C7708a.m21820d("HTTP1.Stack", objArr);
            return this.f14471a.intercept(chain);
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$h */
    public class C7703h implements Dns {

        /* renamed from: a */
        public final /* synthetic */ C7672f.C7675c f14472a;

        public C7703h(C7695a aVar, C7672f.C7675c cVar) {
            this.f14472a = cVar;
        }

        public List<InetAddress> lookup(String str) {
            C7669e a = this.f14472a.mo33163a(str);
            if (a != null) {
                List<InetAddress> f = a.mo33146f();
                if (f == null || f.isEmpty()) {
                    throw new UnknownHostException(str);
                }
                List<InetAddress> h = a.mo33148h();
                if (h != null && !h.isEmpty()) {
                    f.addAll(h);
                }
                C7708a.m21818b("HTTP1.Stack", "inetAddresseslist=" + f);
                return f;
            }
            throw new UnknownHostException(str);
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$i */
    public static class C7704i implements C7672f.C7674b {
        public C7704i(Call call) {
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$j */
    public static final class C7705j extends C7664d.C7666b {

        /* renamed from: a */
        public ResponseBody f14473a;

        public C7705j(ResponseBody responseBody) {
            this.f14473a = responseBody;
        }

        /* renamed from: a */
        public String mo33125a() {
            try {
                return this.f14473a.string();
            } catch (IOException e) {
                throw new HttpException(1001, "Connect error! ", e);
            }
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$k */
    public static final class C7706k extends RequestBody {

        /* renamed from: a */
        public HiRequest.C8724a f14474a;

        public C7706k(HiRequest.C8724a aVar) {
            this.f14474a = aVar;
        }

        public long contentLength() {
            return this.f14474a.mo44445a();
        }

        public MediaType contentType() {
            String b = this.f14474a.mo33184b();
            if (b == null) {
                return null;
            }
            return MediaType.parse(b);
        }

        public void writeTo(BufferedSink bufferedSink) {
            this.f14474a.mo33185c(bufferedSink.outputStream());
        }
    }

    /* renamed from: c.x.a.a.a.a.h.a$l */
    public static final class C7707l {

        /* renamed from: a */
        public final HiRequest f14475a;

        /* renamed from: b */
        public C7664d.C7668d f14476b;

        public C7707l(HiRequest hiRequest) {
            this.f14475a = hiRequest;
        }
    }

    public C7695a(C7672f.C7676d dVar, C7695a aVar) {
        OkHttpClient.Builder builder;
        C7708a.m21818b("HTTP1.Stack", "" + dVar);
        if (aVar == null) {
            builder = new OkHttpClient.Builder();
        } else {
            builder = aVar.f14464a.newBuilder();
            builder.interceptors().clear();
            builder.networkInterceptors().clear();
        }
        C7672f.C7675c e = dVar.mo33169e();
        this.f14466c = e;
        if (e != null) {
            builder.dns(mo33216i(e));
        } else {
            builder.dns(Dns.SYSTEM);
        }
        if (dVar.mo33166b() == null || dVar.mo33167c() <= 0) {
            builder.cache((Cache) null);
        } else {
            builder.cache(new Cache(dVar.mo33166b(), dVar.mo33167c()));
        }
        if (dVar.mo33168d() > 0) {
            builder.connectTimeout(dVar.mo33168d(), TimeUnit.MILLISECONDS);
        }
        if (dVar.mo33171g() > 0) {
            builder.readTimeout(dVar.mo33171g(), TimeUnit.MILLISECONDS);
        }
        if (!(dVar.mo33172h() == null || dVar.mo33173i() == null)) {
            builder.sslSocketFactory(dVar.mo33172h(), dVar.mo33173i());
        }
        if (dVar.mo33170f() != null) {
            builder.hostnameVerifier(dVar.mo33170f());
        }
        if (dVar.mo33174j()) {
            builder.addNetworkInterceptor(mo33220n());
        }
        if (dVar.mo33175k()) {
            builder.addInterceptor(mo33222p());
        }
        if (this.f14466c != null) {
            builder.addInterceptor(mo33219m());
        }
        builder.addNetworkInterceptor(mo33221o());
        builder.addNetworkInterceptor(mo33223q());
        this.f14464a = builder.build();
        this.f14465b = dVar.mo33165a();
    }

    /* renamed from: l */
    public static boolean m21798l(String str) {
        return Pattern.compile("^((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]|[*])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]|[*])$").matcher(str).matches();
    }

    /* renamed from: b */
    public C7664d mo33161b(HiRequest hiRequest) {
        String str;
        String i = hiRequest.mo44443i();
        if (TextUtils.isEmpty(i) || i.startsWith("null") || i.startsWith("NULL")) {
            throw new HttpException(-1, "url is invalid");
        }
        C7708a.m21818b("HTTP1.Stack", "execute: " + hiRequest.mo44438d() + ", " + hiRequest.mo44443i());
        Request j = mo33217j(hiRequest);
        try {
            Call newCall = this.f14464a.newCall(j);
            mo33160a(hiRequest, new C7704i(newCall));
            Response execute = newCall.execute();
            C7682b h = hiRequest.mo44442h();
            if (!execute.isSuccessful() || h == null) {
                return mo33215h(execute, hiRequest);
            }
            String string = execute.body().string();
            "success result---->>" + string;
            String header = execute.header("X-Sign-For");
            "success sign---->>" + header;
            if (TextUtils.isEmpty(header)) {
                str = h.mo33191b(string);
            } else {
                str = h.mo33190a(string, header);
            }
            if (!TextUtils.isEmpty(str)) {
                return mo33215h(execute.newBuilder().body(ResponseBody.create(execute.body().contentType(), str)).build(), hiRequest);
            }
            throw new SignatureException(str);
        } catch (IOException e) {
            HttpException httpException = new HttpException(1001, "Connect error! ", e);
            Object tag = j.tag();
            if (tag instanceof C7707l) {
                httpException.setTrace(((C7707l) tag).f14476b);
            }
            throw httpException;
        } catch (SignatureException e2) {
            throw new HttpException(PointerIconCompat.TYPE_HELP, "Verify signature error! ", e2);
        }
    }

    /* renamed from: f */
    public final C7659b mo33213f(Headers headers) {
        C7659b.C7661b bVar = new C7659b.C7661b();
        for (int i = 0; i < headers.size(); i++) {
            bVar.mo33114b(headers.name(i), headers.value(i));
        }
        return bVar.mo33115c();
    }

    /* renamed from: g */
    public final C7664d.C7666b mo33214g(ResponseBody responseBody) {
        if (responseBody == null) {
            return null;
        }
        return new C7705j(responseBody);
    }

    /* renamed from: h */
    public final C7664d mo33215h(Response response, HiRequest hiRequest) {
        C7664d.C7667c cVar = new C7664d.C7667c();
        cVar.mo33131l(hiRequest);
        cVar.mo33129j(response.code());
        cVar.mo33130k(response.message());
        Headers headers = response.headers();
        for (int i = 0; i < headers.size(); i++) {
            cVar.mo33126g(headers.name(i), headers.value(i));
        }
        Object tag = response.request().tag();
        if (tag instanceof C7707l) {
            cVar.mo33132m(((C7707l) tag).f14476b);
        }
        if (response.body() != null) {
            cVar.mo33127h(mo33214g(response.body()));
        }
        return cVar.mo33128i();
    }

    /* renamed from: i */
    public final Dns mo33216i(C7672f.C7675c cVar) {
        return new C7703h(this, cVar);
    }

    /* renamed from: j */
    public final Request mo33217j(HiRequest hiRequest) {
        Request.Builder tag = new Request.Builder().url(hiRequest.mo44443i()).tag(new C7707l(hiRequest));
        C7659b c = hiRequest.mo44437c();
        for (int i = 0; i < c.mo33112c(); i++) {
            tag.addHeader(c.mo33110a(i), c.mo33111b(i));
        }
        switch (C7696a.f14467a[hiRequest.mo44439e().ordinal()]) {
            case 1:
                tag.get();
                break;
            case 2:
                tag.post(mo33218k(hiRequest.mo44435a()));
                break;
            case 3:
                tag.head();
                break;
            case 4:
                tag.put(mo33218k(hiRequest.mo44435a()));
                break;
            case 5:
                tag.delete(mo33218k(hiRequest.mo44435a()));
                break;
            case 6:
                tag.patch(mo33218k(hiRequest.mo44435a()));
                break;
            default:
                throw new IllegalArgumentException("METHOD = " + hiRequest.mo44439e());
        }
        return tag.build();
    }

    /* renamed from: k */
    public final RequestBody mo33218k(HiRequest.C8724a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C7706k(aVar);
    }

    /* renamed from: m */
    public final Interceptor mo33219m() {
        return new C7698c();
    }

    /* renamed from: n */
    public final Interceptor mo33220n() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new C7701f(this));
        httpLoggingInterceptor.mo52898c(HttpLoggingInterceptor.Level.BODY);
        return new C7702g(this, httpLoggingInterceptor);
    }

    /* renamed from: o */
    public final Interceptor mo33221o() {
        return new C7697b(this);
    }

    /* renamed from: p */
    public final Interceptor mo33222p() {
        return new C7699d();
    }

    /* renamed from: q */
    public final Interceptor mo33223q() {
        return new C7700e();
    }
}
