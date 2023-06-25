package p040c.p048b.p049a.p050a.p051a.p056j;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.api.authorization.AuthorizeRequest;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import java.net.MalformedURLException;
import p040c.p048b.p049a.p050a.p051a.C1354a;
import p040c.p048b.p049a.p050a.p051a.p056j.p057q.C1412a;

/* renamed from: c.b.a.a.a.j.d */
/* compiled from: AuthorizationRequest */
public class C1385d extends C1354a {

    /* renamed from: d */
    public final String f429d;

    /* renamed from: e */
    public final String[] f430e;

    /* renamed from: f */
    public final Bundle f431f;

    /* renamed from: g */
    public final AppInfo f432g;

    /* renamed from: h */
    public final C1412a f433h;

    public C1385d(AuthorizeRequest authorizeRequest, String str, String[] strArr, Bundle bundle, AppInfo appInfo, C1412a aVar) {
        super(authorizeRequest);
        this.f429d = str;
        this.f430e = strArr;
        this.f431f = bundle;
        this.f432g = appInfo;
        this.f433h = aVar;
        if (authorizeRequest != null) {
            bundle.putString("InteractiveRequestType", authorizeRequest.mo15072d());
        }
    }

    /* renamed from: f */
    public String mo15047f(Context context) {
        try {
            return C1383c.m370i(context, context.getPackageName(), this.f429d, this.f430e, this.f379b, true, false, this.f431f, this.f432g);
        } catch (MalformedURLException e) {
            throw new AuthError("MalformedURLException", e, AuthError.ERROR_TYPE.ERROR_BAD_PARAM);
        }
    }

    /* renamed from: g */
    public boolean mo15048g(Uri uri, Context context) {
        C1387f.m384b(context, uri, this.f430e, this.f378a != null, this.f433h);
        return true;
    }
}
