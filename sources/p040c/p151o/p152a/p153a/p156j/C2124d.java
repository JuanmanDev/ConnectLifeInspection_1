package p040c.p151o.p152a.p153a.p156j;

import android.text.TextUtils;
import androidx.navigation.NavInflater;
import androidx.test.internal.runner.RunnerArgs;
import com.gigya.android.sdk.network.adapter.RestAdapter;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import p040c.p151o.p152a.p153a.C2098a;
import p040c.p151o.p152a.p153a.p154i.C2106a;

/* renamed from: c.o.a.a.j.d */
/* compiled from: GigyaApiRequestFactory */
public class C2124d implements C2126f {

    /* renamed from: a */
    public final C2098a f2092a;

    /* renamed from: b */
    public String f2093b;

    /* renamed from: a */
    public C2123c mo16919a(String str, Map<String, Object> map, RestAdapter.HttpMethod httpMethod) {
        TreeMap treeMap = new TreeMap();
        if (map != null) {
            treeMap.putAll(map);
        }
        treeMap.put("sdk", this.f2093b);
        treeMap.put("targetEnv", "mobile");
        treeMap.put("httpStatusCodes", Boolean.FALSE);
        treeMap.put("format", "json");
        Random random = new Random();
        treeMap.put("nonce", System.currentTimeMillis() + "_" + random.nextInt());
        String e = this.f2092a.mo16856e();
        if (e != null) {
            treeMap.put("gmid", e);
        }
        String g = this.f2092a.mo16858g();
        if (g != null) {
            treeMap.put("ucid", g);
        }
        mo16920b(str, treeMap);
        return new C2123c(httpMethod, str, treeMap);
    }

    /* renamed from: b */
    public final void mo16920b(String str, Map<String, Object> map) {
        C2106a d = this.f2092a.mo16855d();
        if (d != null) {
            String str2 = null;
            String join = d.mo16889c() != null ? TextUtils.join(RunnerArgs.CLASS_SEPARATOR, d.mo16889c()) : null;
            if (d.mo16888b() != null) {
                str2 = TextUtils.join(RunnerArgs.CLASS_SEPARATOR, d.mo16888b());
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -542928031:
                    if (str.equals("accounts.login")) {
                        c = 1;
                        break;
                    }
                    break;
                case -88007091:
                    if (str.equals("accounts.getAccountInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1767023720:
                    if (str.equals("accounts.verifyLogin")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2059954091:
                    if (str.equals("accounts.register")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                if (!map.containsKey(NavInflater.TAG_INCLUDE) && join != null) {
                    map.put(NavInflater.TAG_INCLUDE, join);
                }
                if (!map.containsKey("extraProfileFields") && str2 != null) {
                    map.put("extraProfileFields", str2);
                }
            } else if ((c == 1 || c == 2 || c == 3) && !map.containsKey(NavInflater.TAG_INCLUDE) && join != null) {
                map.put(NavInflater.TAG_INCLUDE, join);
            }
        }
    }
}
