package p040c.p107e.p108a;

import java.util.Map;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.platform.Platform;
import p040c.p107e.p108a.p109e.C1968a;

/* renamed from: c.e.a.a */
/* compiled from: AuthenticationCacheInterceptor */
public class C1964a implements Interceptor {

    /* renamed from: a */
    public final Map<String, C1968a> f1645a;

    /* renamed from: b */
    public final C1965b f1646b;

    public C1964a(Map<String, C1968a> map, C1965b bVar) {
        this.f1645a = map;
        this.f1646b = bVar;
    }

    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        String a = this.f1646b.mo16457a(request);
        C1968a aVar = this.f1645a.get(a);
        Connection connection = chain.connection();
        Request a2 = aVar != null ? aVar.mo16459a(connection != null ? connection.route() : null, request) : null;
        if (a2 == null) {
            a2 = request;
        }
        Response proceed = chain.proceed(a2);
        int code = proceed != null ? proceed.code() : 0;
        if (aVar == null) {
            return proceed;
        }
        if ((code != 401 && code != 407) || this.f1645a.remove(a) == null) {
            return proceed;
        }
        proceed.body().close();
        Platform.get().log("Cached authentication expired. Sending a new request.", 4, (Throwable) null);
        return chain.proceed(request);
    }

    public C1964a(Map<String, C1968a> map) {
        this(map, new C1967d());
    }
}
