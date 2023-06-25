package p040c.p200q.p363c.p370n.p371h.p381p;

import android.text.TextUtils;
import androidx.transition.Transition;
import com.juconnect.vivino.global.UrlConstKt;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6532q;
import p040c.p200q.p363c.p370n.p371h.p378m.C6669a;
import p040c.p200q.p363c.p370n.p371h.p378m.C6670b;
import p040c.p200q.p363c.p370n.p371h.p378m.C6671c;

/* renamed from: c.q.c.n.h.p.c */
/* compiled from: DefaultSettingsSpiCall */
public class C6687c implements C6698k {

    /* renamed from: a */
    public final String f12793a;

    /* renamed from: b */
    public final C6670b f12794b;

    /* renamed from: c */
    public final C6479f f12795c;

    public C6687c(String str, C6670b bVar) {
        this(str, bVar, C6479f.m18125f());
    }

    /* renamed from: a */
    public JSONObject mo31313a(C6697j jVar, boolean z) {
        if (z) {
            try {
                Map<String, String> f = mo31318f(jVar);
                C6669a d = mo31316d(f);
                mo31314b(d, jVar);
                C6479f fVar = this.f12795c;
                fVar.mo30641b("Requesting settings from " + this.f12793a);
                C6479f fVar2 = this.f12795c;
                fVar2.mo30647i("Settings query params were: " + f);
                return mo31319g(d.mo31253c());
            } catch (IOException e) {
                this.f12795c.mo30644e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* renamed from: b */
    public final C6669a mo31314b(C6669a aVar, C6697j jVar) {
        mo31315c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f12821a);
        mo31315c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", UrlConstKt.APP_PLATFORM);
        mo31315c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C6532q.m18328l());
        mo31315c(aVar, "Accept", "application/json");
        mo31315c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f12822b);
        mo31315c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f12823c);
        mo31315c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f12824d);
        mo31315c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f12825e.mo30654a());
        return aVar;
    }

    /* renamed from: c */
    public final void mo31315c(C6669a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.mo31254d(str, str2);
        }
    }

    /* renamed from: d */
    public C6669a mo31316d(Map<String, String> map) {
        C6669a a = this.f12794b.mo31256a(this.f12793a, map);
        a.mo31254d("User-Agent", "Crashlytics Android SDK/" + C6532q.m18328l());
        a.mo31254d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a;
    }

    /* renamed from: e */
    public final JSONObject mo31317e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C6479f fVar = this.f12795c;
            fVar.mo30650l("Failed to parse settings JSON from " + this.f12793a, e);
            C6479f fVar2 = this.f12795c;
            fVar2.mo30649k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    public final Map<String, String> mo31318f(C6697j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f12828h);
        hashMap.put("display_version", jVar.f12827g);
        hashMap.put("source", Integer.toString(jVar.f12829i));
        String str = jVar.f12826f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(Transition.MATCH_INSTANCE_STR, str);
        }
        return hashMap;
    }

    /* renamed from: g */
    public JSONObject mo31319g(C6671c cVar) {
        int b = cVar.mo31258b();
        C6479f fVar = this.f12795c;
        fVar.mo30647i("Settings response code was: " + b);
        if (mo31320h(b)) {
            return mo31317e(cVar.mo31257a());
        }
        C6479f fVar2 = this.f12795c;
        fVar2.mo30643d("Settings request failed; (status: " + b + ") from " + this.f12793a);
        return null;
    }

    /* renamed from: h */
    public boolean mo31320h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public C6687c(String str, C6670b bVar, C6479f fVar) {
        if (str != null) {
            this.f12795c = fVar;
            this.f12794b = bVar;
            this.f12793a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
