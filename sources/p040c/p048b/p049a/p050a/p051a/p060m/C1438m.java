package p040c.p048b.p049a.p050a.p051a.p060m;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import java.util.ArrayList;
import java.util.List;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.m */
/* compiled from: ProfileRequest */
public class C1438m extends C1429d<C1439n> {

    /* renamed from: q */
    public static final String f600q = "c.b.a.a.a.m.m";

    /* renamed from: o */
    public String f601o;

    /* renamed from: p */
    public boolean f602p;

    public C1438m(Bundle bundle, String str, Context context, AppInfo appInfo) {
        super(context, appInfo);
        this.f601o = str;
        if (bundle != null) {
            this.f602p = bundle.getBoolean(AuthzConstants$BUNDLE_KEY.SANDBOX.val, false);
        }
    }

    /* renamed from: f */
    public void mo15216f() {
        String str = f600q;
        C1485a.m836i(str, "Executing profile request", "accessToken=" + this.f601o);
    }

    /* renamed from: t */
    public String mo15236t() {
        return "/user/profile";
    }

    /* renamed from: u */
    public List<Pair<String, String>> mo15237u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("Authorization", "Bearer " + this.f601o));
        return arrayList;
    }

    /* renamed from: v */
    public List<Pair<String, String>> mo15238v() {
        return new ArrayList();
    }

    /* renamed from: x */
    public boolean mo15247x() {
        return this.f602p;
    }

    /* renamed from: z */
    public C1439n mo15211a(C1433h hVar) {
        return new C1439n(hVar);
    }
}
