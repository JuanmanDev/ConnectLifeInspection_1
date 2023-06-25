package p040c.p107e.p108a;

import java.util.Map;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import p040c.p107e.p108a.p109e.C1968a;

/* renamed from: c.e.a.c */
/* compiled from: CachingAuthenticatorDecorator */
public class C1966c implements Authenticator {

    /* renamed from: a */
    public final Authenticator f1647a;

    /* renamed from: b */
    public final Map<String, C1968a> f1648b;

    /* renamed from: c */
    public final C1965b f1649c;

    public C1966c(Authenticator authenticator, Map<String, C1968a> map, C1965b bVar) {
        this.f1647a = authenticator;
        this.f1648b = map;
        this.f1649c = bVar;
    }

    public Request authenticate(Route route, Response response) {
        Request authenticate = this.f1647a.authenticate(route, response);
        if (!(authenticate == null || authenticate.header("Authorization") == null || !(this.f1647a instanceof C1968a))) {
            this.f1648b.put(this.f1649c.mo16457a(authenticate), (C1968a) this.f1647a);
        }
        return authenticate;
    }

    public C1966c(Authenticator authenticator, Map<String, C1968a> map) {
        this(authenticator, map, new C1967d());
    }
}
