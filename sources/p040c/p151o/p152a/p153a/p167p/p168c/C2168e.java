package p040c.p151o.p152a.p153a.p167p.p168c;

import android.content.Context;
import java.util.Map;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p156j.C2125e;
import p040c.p151o.p152a.p153a.p164n.C2148a;
import p040c.p151o.p152a.p153a.p166o.C2153a;
import p040c.p151o.p152a.p153a.p171s.C2186c;

/* renamed from: c.o.a.a.p.c.e */
/* compiled from: Provider */
public abstract class C2168e implements C2163c {

    /* renamed from: a */
    public final Context f2144a;

    /* renamed from: b */
    public final C2153a f2145b;

    /* renamed from: c */
    public boolean f2146c;

    /* renamed from: d */
    public String f2147d;

    /* renamed from: e */
    public String f2148e;

    /* renamed from: f */
    public C2171f f2149f;

    /* renamed from: c.o.a.a.p.c.e$a */
    /* compiled from: Provider */
    public class C2169a implements Runnable {
        public C2169a() {
        }

        public void run() {
            C2168e.this.f2145b.mo16965d(C2168e.this.getName());
        }
    }

    /* renamed from: c.o.a.a.p.c.e$b */
    /* compiled from: Provider */
    public class C2170b implements Runnable {
        public C2170b() {
        }

        public void run() {
            C2168e.this.f2145b.mo16965d(C2168e.this.getName());
        }
    }

    /* renamed from: a */
    public void mo16980a() {
        this.f2146c = false;
    }

    /* renamed from: b */
    public void mo16992b(String str) {
        this.f2148e = str;
    }

    /* renamed from: e */
    public void mo16998e() {
        this.f2146c = false;
        this.f2149f.mo16913a();
    }

    /* renamed from: f */
    public void mo16999f(C2125e eVar) {
        this.f2146c = false;
        C2103f.m3056b("Provider", "onProviderLoginFailed: provider = " + getName() + ", error =" + eVar.toString());
        this.f2149f.mo16914b(eVar);
    }

    /* renamed from: g */
    public void mo17000g(String str) {
        this.f2146c = false;
        C2103f.m3056b("Provider", "onProviderLoginFailed: provider = " + getName() + ", error =" + str);
        this.f2149f.mo16914b(new C2125e(C2148a.m3191c(str).mo16955f()));
    }

    /* renamed from: h */
    public void mo17001h(String str, C2186c cVar) {
        this.f2146c = false;
        C2103f.m3056b("Provider", "onLoginSuccess: provider = " + getName() + ", sessionToken = " + cVar.mo17025c());
        this.f2149f.mo16915c(str, cVar, new C2170b());
    }

    /* renamed from: i */
    public void mo17002i(Map<String, Object> map, String str, String str2) {
        String str3;
        this.f2146c = false;
        C2103f.m3056b("Provider", "onLoginSuccess: provider = " + getName() + ", providerSessions = " + str);
        map.put("providerSessions", str);
        map.put("loginMode", str2);
        if (str2.equals("link") && (str3 = this.f2148e) != null) {
            map.put("regToken", str3);
        }
        this.f2149f.mo16916d(map, new C2169a());
    }
}
