package p040c.p151o.p152a.p153a.p167p.p168c;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.gigya.android.sdk.network.adapter.RestAdapter;
import com.gigya.android.sdk.p309ui.WebLoginActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import org.json.JSONObject;
import p040c.p151o.p152a.p153a.C2098a;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p156j.C2125e;
import p040c.p151o.p152a.p153a.p171s.C2184a;
import p040c.p151o.p152a.p153a.p171s.C2186c;
import p040c.p151o.p152a.p153a.p174u.C2201b;
import p040c.p151o.p152a.p153a.p174u.C2207h;

/* renamed from: c.o.a.a.p.c.h */
/* compiled from: WebLoginProvider */
public class C2174h extends C2168e {

    /* renamed from: g */
    public final C2184a f2157g;

    /* renamed from: h */
    public final C2098a f2158h;

    /* renamed from: c.o.a.a.p.c.h$a */
    /* compiled from: WebLoginProvider */
    public class C2175a implements WebLoginActivity.C3957b {

        /* renamed from: a */
        public final /* synthetic */ String f2159a;

        public C2175a(String str) {
            this.f2159a = str;
        }

        /* renamed from: a */
        public void mo17010a(Activity activity, Map<String, Object> map) {
            C2103f.m3056b("WebLoginProvider", "onResult: " + map.toString());
            String str = (String) map.get(NotificationCompat.CATEGORY_STATUS);
            if (str == null || !str.equals("ok")) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (map.containsKey("error_description")) {
                        String str2 = (String) map.get("error_description");
                        if (str2 != null) {
                            String[] split = str2.replace("+", "").split(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
                            if (split.length > 1) {
                                int parseInt = Integer.parseInt(split[0].trim());
                                String trim = split[1].trim();
                                jSONObject.put("errorCode", parseInt);
                                jSONObject.put("errorMessage", trim);
                            }
                        }
                        if (map.containsKey("x_regToken")) {
                            jSONObject.put("regToken", (String) map.get("x_regToken"));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C2103f.m3056b("WebLoginProvider", "onResult: with error = " + jSONObject.toString());
                C2174h.this.mo16999f(new C2125e(jSONObject.toString()));
            } else {
                C2174h.this.mo17001h(this.f2159a, C2174h.this.mo17009l(map));
            }
            if (activity != null) {
                activity.finish();
            }
        }

        /* renamed from: b */
        public void mo17011b() {
            C2171f fVar = C2174h.this.f2149f;
            if (fVar != null) {
                fVar.mo16913a();
            }
        }
    }

    /* renamed from: a */
    public void mo16980a() {
    }

    /* renamed from: c */
    public void mo16981c(Map<String, Object> map, String str) {
        if (!this.f2146c) {
            this.f2146c = true;
            this.f2147d = str;
            WebLoginActivity.m9843e(this.f2144a, mo17008k(this.f2144a, map, str), new C2175a((String) map.get("provider")));
        }
    }

    public String getName() {
        return "web";
    }

    /* renamed from: k */
    public final String mo17008k(Context context, Map<String, Object> map, String str) {
        TreeMap treeMap = new TreeMap();
        String str2 = (String) map.get("provider");
        if (str2 != null) {
            String str3 = (String) map.get(str2 + "ExtraPermissions");
            if (str3 != null) {
                map.remove(str2 + "ExtraPermissions");
                treeMap.put("x_extraPermissions", str3);
            }
        }
        treeMap.put("redirect_uri", "gigya://gsapi/" + context.getPackageName() + "/login_result");
        treeMap.put("response_type", FirebaseMessagingService.EXTRA_TOKEN);
        treeMap.put("client_id", this.f2158h.mo16854c());
        treeMap.put("gmid", this.f2158h.mo16856e());
        treeMap.put("ucid", this.f2158h.mo16858g());
        treeMap.put("x_secret_type", "oauth1");
        treeMap.put("x_sdk", "5.1.5");
        for (Map.Entry<String, Object> key : map.entrySet()) {
            String str4 = (String) key.getKey();
            Object obj = map.get(str4);
            if (obj != null) {
                if (str4.startsWith("x_")) {
                    treeMap.put(str4, obj);
                } else {
                    treeMap.put("x_" + str4, obj);
                }
            }
        }
        String str5 = str.equals("connect") ? "socialize.addConnection" : "socialize.login";
        Random random = new Random();
        treeMap.put("nonce", System.currentTimeMillis() + "_" + random.nextInt());
        if (this.f2157g.mo17017a()) {
            treeMap.put("oauth_token", this.f2157g.mo17018b().mo17025c());
            C2201b.m3346a(this.f2157g.mo17018b().mo17024b(), RestAdapter.f7201b, C2207h.m3360b(str5, this.f2158h.mo16853b()), treeMap, this.f2158h.mo16857f());
        }
        return String.format("%s://%s.%s/%s?%s", new Object[]{"https", "socialize", this.f2158h.mo16853b(), str5, C2207h.m3359a(treeMap)});
    }

    /* renamed from: l */
    public final C2186c mo17009l(Map<String, Object> map) {
        String str = (String) map.get("access_token");
        String str2 = (String) map.get("expires_in");
        if (str2 == null) {
            str2 = "0";
        }
        return new C2186c((String) map.get("x_access_token_secret"), str, Long.parseLong(str2));
    }
}
