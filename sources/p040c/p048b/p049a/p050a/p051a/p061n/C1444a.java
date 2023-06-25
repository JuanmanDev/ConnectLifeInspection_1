package p040c.p048b.p049a.p050a.p051a.p061n;

import android.content.Context;
import com.amazon.identity.auth.device.api.authorization.Region;
import com.amazon.identity.auth.device.authorization.Service;
import com.amazon.identity.auth.device.authorization.Stage;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import p040c.p048b.p049a.p050a.p051a.C1360g;

/* renamed from: c.b.a.a.a.n.a */
/* compiled from: AbstractEndpointDomainBuilder */
public abstract class C1444a {

    /* renamed from: f */
    public static Map<String, String> f609f = new HashMap();

    /* renamed from: g */
    public static Map<String, Region> f610g = new HashMap();

    /* renamed from: a */
    public Stage f611a = Stage.PROD;

    /* renamed from: b */
    public Service f612b;

    /* renamed from: c */
    public boolean f613c = false;

    /* renamed from: d */
    public Region f614d = Region.NA;

    /* renamed from: e */
    public String f615e;

    public C1444a(Context context, AppInfo appInfo) {
        this.f614d = C1360g.m285c(context);
        if (appInfo != null) {
            this.f615e = appInfo.mo21448q();
        }
    }

    /* renamed from: a */
    public static void m712a(Service service, Stage stage, boolean z, Region region, String str) {
        f609f.put(m713g(service, stage, z, region), str);
        if (Region.AUTO != region && Service.PANDA == service) {
            f610g.put(str, region);
        }
    }

    /* renamed from: g */
    public static String m713g(Service service, Stage stage, boolean z, Region region) {
        return String.format("%s.%s.%s.%s", new Object[]{service.toString(), stage.toString(), Boolean.valueOf(z), region.toString()});
    }

    /* renamed from: b */
    public C1444a mo15291b(Region region) {
        this.f614d = region;
        return this;
    }

    /* renamed from: c */
    public C1444a mo15292c(boolean z) {
        this.f613c = z;
        return this;
    }

    /* renamed from: d */
    public C1444a mo15293d(Service service) {
        this.f612b = service;
        return this;
    }

    /* renamed from: e */
    public String mo15294e() {
        if (Region.AUTO == this.f614d) {
            this.f614d = mo15296h();
        }
        return f609f.get(m713g(this.f612b, this.f611a, this.f613c, this.f614d));
    }

    /* renamed from: f */
    public final String mo15295f(String str) {
        return "https://" + new URL(str).getHost();
    }

    /* renamed from: h */
    public Region mo15296h() {
        Region region = Region.NA;
        try {
            return this.f615e != null ? f610g.get(mo15295f(this.f615e)) : region;
        } catch (MalformedURLException unused) {
            return region;
        }
    }
}
