package p040c.p048b.p049a.p050a.p051a.p060m;

import android.content.Context;
import android.util.Pair;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import java.util.ArrayList;
import java.util.List;
import p040c.p048b.p049a.p050a.p051a.p066s.C1470b;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.k */
/* compiled from: OauthTokenRequest */
public class C1436k extends C1428c<C1437l> {

    /* renamed from: r */
    public static final String f593r = "c.b.a.a.a.m.k";

    /* renamed from: q */
    public final C1470b f594q;

    public C1436k(Context context, C1470b bVar, AppInfo appInfo) {
        super(context, appInfo);
        this.f594q = bVar;
    }

    /* renamed from: A */
    public List<Pair<String, String>> mo15234A() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("refresh_token", this.f594q.toString()));
        return arrayList;
    }

    /* renamed from: B */
    public String mo15235B() {
        return "refresh_token";
    }

    /* renamed from: C */
    public C1437l mo15211a(C1433h hVar) {
        return new C1437l(hVar, mo15239z(), (String) null);
    }

    /* renamed from: f */
    public void mo15216f() {
        C1485a.m836i(f593r, "Executing OAuth access token exchange. appId=" + mo15239z(), "refreshAtzToken=" + this.f594q.toString());
    }
}
