package p040c.p048b.p049a.p050a.p051a.p060m;

import android.content.Context;
import android.util.Pair;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import java.util.ArrayList;
import java.util.List;
import p040c.p048b.p049a.p050a.p051a.p060m.C1440o;

/* renamed from: c.b.a.a.a.m.c */
/* compiled from: AbstractOauthTokenRequest */
public abstract class C1428c<T extends C1440o> extends C1430e<T> {

    /* renamed from: o */
    public final String f558o;

    /* renamed from: p */
    public final String f559p;

    public C1428c(Context context, AppInfo appInfo) {
        super(context, appInfo);
        if (appInfo != null) {
            this.f558o = appInfo.mo21443l();
            this.f559p = appInfo.mo21446o();
            return;
        }
        throw new AuthError("Appinfo can not be null to make an OAuthTokenRequest", AuthError.ERROR_TYPE.ERROR_UNKNOWN);
    }

    /* renamed from: A */
    public abstract List<Pair<String, String>> mo15234A();

    /* renamed from: B */
    public abstract String mo15235B();

    /* renamed from: t */
    public String mo15236t() {
        return "/auth/o2/token";
    }

    /* renamed from: u */
    public List<Pair<String, String>> mo15237u() {
        return new ArrayList();
    }

    /* renamed from: v */
    public List<Pair<String, String>> mo15238v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("grant_type", mo15235B()));
        arrayList.add(new Pair("client_id", this.f559p));
        List<Pair<String, String>> A = mo15234A();
        if (A != null) {
            arrayList.addAll(A);
        }
        return arrayList;
    }

    /* renamed from: z */
    public String mo15239z() {
        return this.f558o;
    }
}
