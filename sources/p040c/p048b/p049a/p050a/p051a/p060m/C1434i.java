package p040c.p048b.p049a.p050a.p051a.p060m;

import android.content.Context;
import android.util.Pair;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import java.util.ArrayList;
import java.util.List;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.i */
/* compiled from: OauthCodeForTokenRequest */
public class C1434i extends C1428c<C1435j> {

    /* renamed from: u */
    public static final String f587u = "c.b.a.a.a.m.i";

    /* renamed from: q */
    public final String f588q;

    /* renamed from: r */
    public final String f589r;

    /* renamed from: s */
    public final String f590s;

    /* renamed from: t */
    public final String f591t;

    public C1434i(String str, String str2, String str3, String str4, AppInfo appInfo, Context context) {
        super(context, appInfo);
        this.f588q = str;
        this.f589r = str3;
        this.f590s = str4;
        this.f591t = str2;
    }

    /* renamed from: A */
    public List<Pair<String, String>> mo15234A() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("code", this.f588q));
        arrayList.add(new Pair("redirect_uri", this.f589r));
        arrayList.add(new Pair("code_verifier", this.f591t));
        return arrayList;
    }

    /* renamed from: B */
    public String mo15235B() {
        return "authorization_code";
    }

    /* renamed from: C */
    public C1435j mo15211a(C1433h hVar) {
        return new C1435j(hVar, mo15239z(), this.f590s);
    }

    /* renamed from: f */
    public void mo15216f() {
        C1485a.m836i(f587u, "Executing OAuth Code for Token Exchange. redirectUri=" + this.f589r + " appId=" + mo15239z(), "code=" + this.f588q);
    }
}
