package p040c.p048b.p049a.p050a.p051a;

import android.content.Context;
import android.net.Uri;
import com.amazon.identity.auth.device.AuthError;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p040c.p048b.p049a.p050a.p051a.p052h.p054c.C1373a;
import p040c.p048b.p049a.p050a.p051a.p060m.C1441p;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.e */
/* compiled from: RequestManager */
public final class C1358e {

    /* renamed from: c */
    public static final String f385c = "c.b.a.a.a.e";

    /* renamed from: d */
    public static C1358e f386d;

    /* renamed from: a */
    public final Map<String, C1354a> f387a;

    /* renamed from: b */
    public final C1357d f388b;

    public C1358e(C1357d dVar) {
        this.f387a = Collections.synchronizedMap(new LinkedHashMap(10));
        this.f388b = dVar;
    }

    /* renamed from: c */
    public static synchronized C1358e m270c() {
        C1358e eVar;
        synchronized (C1358e.class) {
            if (f386d == null) {
                f386d = new C1358e();
            }
            eVar = f386d;
        }
        return eVar;
    }

    /* renamed from: e */
    public static String m271e(Uri uri) {
        String str = new C1441p(uri).mo15278a().get("clientRequestId");
        if (str != null) {
            return str;
        }
        throw new AuthError(String.format("Response does not have a requestId: %s", new Object[]{uri.toString()}), AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
    }

    /* renamed from: h */
    public static boolean m272h(Uri uri) {
        return new C1441p(uri).mo15278a().get("InteractiveRequestType") != null;
    }

    /* renamed from: a */
    public final void mo15056a() {
        while (this.f387a.size() >= 10) {
            synchronized (this.f387a) {
                String next = this.f387a.keySet().iterator().next();
                String str = f385c;
                C1485a.m828a(str, "Purging active request " + next);
                this.f387a.remove(next);
                C1359f.m278a().mo15063d(next);
            }
        }
    }

    /* renamed from: b */
    public void mo15057b(C1354a aVar, Context context) {
        String str = f385c;
        C1485a.m828a(str, "Executing request " + aVar.mo15046e());
        if (aVar.mo15042a()) {
            aVar.mo15049h();
            mo15056a();
            this.f387a.put(aVar.mo15046e(), aVar);
            this.f388b.mo15055b(aVar, aVar.mo15047f(context), context);
            return;
        }
        throw new AuthError(String.format("Reached maximum attempts for the request: %s", new Object[]{aVar.mo15046e()}), AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
    }

    /* renamed from: d */
    public C1373a mo15058d(String str) {
        C1354a aVar = this.f387a.get(str);
        if (aVar == null || aVar.mo15045d() == null) {
            return null;
        }
        return aVar.mo15045d().mo15308j();
    }

    /* renamed from: f */
    public boolean mo15059f(Uri uri, Context context) {
        return mo15060g(uri, context, (C1373a) null);
    }

    /* renamed from: g */
    public boolean mo15060g(Uri uri, Context context, C1373a aVar) {
        String e = m271e(uri);
        C1485a.m836i(f385c, "Handling response for request " + e, "uri=" + uri.toString());
        C1354a remove = this.f387a.remove(e);
        if (remove == null) {
            return false;
        }
        if (aVar != null) {
            remove.mo15045d().mo15310l(aVar);
        }
        if (remove.mo15048g(uri, context)) {
            return true;
        }
        C1485a.m828a(f385c, "Retrying request " + e);
        mo15057b(remove, context);
        return true;
    }

    public C1358e() {
        this(new C1357d());
    }
}
