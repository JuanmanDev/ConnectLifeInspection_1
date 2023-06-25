package p040c.p151o.p152a.p153a.p164n;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import p040c.p151o.p152a.p153a.p156j.C2125e;

/* renamed from: c.o.a.a.n.a */
/* compiled from: GigyaError */
public class C2148a extends C2149b {

    /* renamed from: c */
    public String f2116c;

    /* renamed from: d */
    public String f2117d;

    public C2148a(int i, String str, String str2) {
        this.f2118a = i;
        this.f2117d = str;
        this.f2119b = str2;
    }

    /* renamed from: b */
    public static C2148a m3190b() {
        return new C2148a(200001, "Operation canceled", "");
    }

    /* renamed from: c */
    public static C2148a m3191c(String str) {
        return new C2148a(400, str, "");
    }

    /* renamed from: d */
    public static C2148a m3192d(C2125e eVar) {
        return new C2148a(eVar.mo16921a(), eVar.mo16924d(), eVar.mo16925e(), eVar.mo16923c());
    }

    /* renamed from: e */
    public static C2148a m3193e() {
        return new C2148a(400, "General error", "");
    }

    /* renamed from: g */
    public static C2148a m3194g() {
        return new C2148a(403005, "Unauthorized user", "");
    }

    /* renamed from: a */
    public int mo16954a() {
        return this.f2118a;
    }

    /* renamed from: f */
    public String mo16955f() {
        String str = this.f2116c;
        if (str != null) {
            return str;
        }
        return new Gson().toJson((Object) this);
    }

    @NonNull
    public String toString() {
        return "<< Gigya error: code: " + this.f2118a + ", message: " + this.f2117d + ", callId: " + this.f2119b;
    }

    public C2148a(String str, int i, String str2, String str3) {
        this.f2116c = str;
        this.f2118a = i;
        this.f2117d = str2;
        this.f2119b = str3;
    }
}
