package p040c.p048b.p049a.p050a.p051a.p060m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import com.amazon.identity.auth.device.InvalidGrantAuthError;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.dataobject.AuthorizationToken;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.p059l.C1423h;
import p040c.p048b.p049a.p050a.p051a.p066s.C1470b;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.q */
/* compiled from: ServerCommunication */
public class C1442q {

    /* renamed from: a */
    public static final String f606a = "c.b.a.a.a.m.q";

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static void m697a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null) {
            throw new IOException("Network is unavailable");
        }
    }

    /* renamed from: b */
    public AuthorizationToken[] mo15279b(C1470b bVar, String str, String[] strArr, Context context, Bundle bundle, AppInfo appInfo) {
        C1485a.m836i(f606a, "Scopes=" + Arrays.toString(strArr), "getAuthorizationTokens : appId=" + appInfo.mo21443l());
        m697a(context);
        try {
            C1437l lVar = (C1437l) new C1436k(context, bVar, appInfo).mo15220j();
            lVar.mo15233j();
            return lVar.mo15267o();
        } catch (InvalidGrantAuthError e) {
            C1485a.m829b(f606a, "Invalid grant request given to the server. Cleaning up local state");
            C1423h.m562a(context);
            throw e;
        }
    }

    /* renamed from: c */
    public JSONObject mo15280c(Context context, String str, Bundle bundle, AppInfo appInfo) {
        m697a(context);
        C1439n nVar = (C1439n) new C1438m(bundle, str, context, appInfo).mo15220j();
        nVar.mo15233j();
        return nVar.mo15275k();
    }

    /* renamed from: d */
    public AuthorizationToken[] mo15281d(String str, String str2, String str3, String[] strArr, String str4, Context context, AppInfo appInfo) {
        C1485a.m836i(f606a, "Scopes=" + Arrays.toString(strArr), "getAuthorizationTokens : appId=" + appInfo.mo21443l());
        m697a(context);
        C1435j jVar = (C1435j) new C1434i(str, str2, str3, str4, appInfo, context).mo15220j();
        jVar.mo15233j();
        return jVar.mo15267o();
    }
}
