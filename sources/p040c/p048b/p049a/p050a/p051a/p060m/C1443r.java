package p040c.p048b.p049a.p050a.p051a.p060m;

import android.content.Context;
import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.dataobject.AuthorizationToken;
import com.amazon.identity.auth.device.dataobject.RequestedScope;
import com.amazon.identity.auth.device.utils.LWAConstants$AUTHORIZE_BUNDLE_KEY;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p040c.p048b.p049a.p050a.p051a.p056j.C1406o;
import p040c.p048b.p049a.p050a.p051a.p059l.C1420e;
import p040c.p048b.p049a.p050a.p051a.p059l.C1424i;
import p040c.p048b.p049a.p050a.p051a.p059l.C1425j;
import p040c.p048b.p049a.p050a.p051a.p066s.C1469a;
import p040c.p048b.p049a.p050a.p051a.p066s.C1470b;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.r */
/* compiled from: TokenVendor */
public class C1443r {

    /* renamed from: b */
    public static final String f607b = "c.b.a.a.a.m.r";

    /* renamed from: a */
    public C1442q f608a = new C1442q();

    /* renamed from: b */
    public static C1469a m701b(RequestedScope[] requestedScopeArr, Context context) {
        C1485a.m832e(f607b, "Try finding a common access token for requested scopes");
        if (requestedScopeArr == null || requestedScopeArr.length == 0) {
            return null;
        }
        C1420e t = C1420e.m543t(context);
        C1469a aVar = (C1469a) t.mo15200s(requestedScopeArr[0].mo21505l());
        if (aVar == null) {
            return null;
        }
        for (int i = 1; i < requestedScopeArr.length; i++) {
            AuthorizationToken s = t.mo15200s(requestedScopeArr[i].mo21505l());
            if (s == null || s.mo15163d() != aVar.mo15163d()) {
                C1485a.m832e(f607b, "Common access token not found!");
                return null;
            }
        }
        String str = f607b;
        C1485a.m836i(str, "Common access token found.", "accessAtzToken=" + aVar);
        return aVar;
    }

    /* renamed from: c */
    public static C1470b m702c(RequestedScope[] requestedScopeArr, Context context) {
        C1485a.m832e(f607b, "Try finding a common refresh token for requested scopes");
        if (requestedScopeArr == null || requestedScopeArr.length == 0) {
            return null;
        }
        C1420e t = C1420e.m543t(context);
        C1470b bVar = (C1470b) t.mo15200s(requestedScopeArr[0].mo21506m());
        if (bVar == null) {
            return null;
        }
        for (int i = 1; i < requestedScopeArr.length; i++) {
            AuthorizationToken s = t.mo15200s(requestedScopeArr[i].mo21506m());
            if (s == null || s.mo15163d() != bVar.mo15163d()) {
                C1485a.m832e(f607b, "Common refresh token not found!");
                return null;
            }
        }
        String str = f607b;
        C1485a.m836i(str, "Common refresh token found.", "refreshAtzToken=" + bVar);
        return bVar;
    }

    /* renamed from: a */
    public List<RequestedScope> mo15282a(Context context) {
        return C1425j.m574u(context).mo15186e();
    }

    /* renamed from: d */
    public RequestedScope[] mo15283d(String str, String str2, String[] strArr, Context context) {
        int length = strArr.length;
        RequestedScope[] requestedScopeArr = new RequestedScope[length];
        for (int i = 0; i < length; i++) {
            RequestedScope t = C1425j.m574u(context).mo15210t(strArr[i], str2, str);
            if (t != null) {
                requestedScopeArr[i] = t;
            } else {
                String str3 = f607b;
                C1485a.m838k(str3, "RequestedScope shouldn't be null!!!! - " + t + ", but continuing anyway...");
                requestedScopeArr[i] = new RequestedScope(strArr[i], str2, str);
            }
        }
        return requestedScopeArr;
    }

    /* renamed from: e */
    public void mo15284e(Context context, AuthorizationToken authorizationToken) {
        if (authorizationToken.mo15165f(context) == -1) {
            throw new AuthError("Unable to insert " + authorizationToken.mo21465p() + " token into db", AuthError.ERROR_TYPE.ERROR_DATA_STORAGE);
        }
    }

    /* renamed from: f */
    public final boolean mo15285f(C1469a aVar, Bundle bundle) {
        int i = 300;
        if (bundle != null) {
            i = bundle.getInt(AuthzConstants$BUNDLE_KEY.MINIMUM_TOKEN_LIFETIME.val, 300);
        }
        return aVar != null && aVar.mo21466q(i);
    }

    /* renamed from: g */
    public final void mo15286g(AuthorizationToken authorizationToken, AuthorizationToken authorizationToken2, Context context) {
        authorizationToken.mo15167h(authorizationToken2.mo15163d());
        if (!authorizationToken.mo15168i(context)) {
            throw new IOException("Updating token failed unexpectedly!");
        }
    }

    /* renamed from: h */
    public final String mo15287h(C1470b bVar, String str, String[] strArr, C1469a aVar, Context context, AppInfo appInfo) {
        AuthorizationToken authorizationToken;
        C1470b bVar2 = bVar;
        String[] strArr2 = strArr;
        C1469a aVar2 = aVar;
        Context context2 = context;
        C1485a.m836i(f607b, "Updating existing token", "token=" + aVar2);
        if (bVar2 != null) {
            if (strArr2 != null) {
                try {
                    if (strArr2.length != 0) {
                        AuthorizationToken[] b = this.f608a.mo15279b(bVar, str, strArr, context, (Bundle) null, appInfo);
                        boolean z = false;
                        authorizationToken = b[0];
                        if (b[1] != null) {
                            C1485a.m836i(f607b, "Refresh token", "token=" + bVar2);
                            mo15286g(b[1], bVar2, context2);
                            bVar2 = (C1470b) b[1];
                        }
                        C1470b bVar3 = bVar2;
                        if (authorizationToken != null) {
                            C1485a.m836i(f607b, "Refreshed token", "token=" + aVar2);
                            if (aVar2 != null) {
                                authorizationToken.mo15167h(aVar.mo15163d());
                            } else {
                                z = true;
                            }
                            C1424i.m567s(context).mo15183b();
                            if (authorizationToken.mo15166g(context2)) {
                                if (z) {
                                    mo15288i(appInfo.mo21443l(), strArr, context, (C1469a) authorizationToken, bVar3, str);
                                }
                                C1485a.m832e(f607b, "Update success!");
                            } else {
                                throw new IOException("Updating token failed unexpectedly!");
                            }
                        }
                    }
                } catch (Throwable th) {
                    C1406o.m459m(context);
                    throw th;
                }
            }
            C1406o.m459m(context);
            return null;
        }
        authorizationToken = null;
        C1406o.m459m(context);
        if (authorizationToken != null) {
            return authorizationToken.mo21464o();
        }
        return null;
    }

    /* renamed from: i */
    public void mo15288i(String str, String[] strArr, Context context, C1469a aVar, C1470b bVar, String str2) {
        for (RequestedScope requestedScope : mo15283d(str2, str, strArr, context)) {
            if (requestedScope.mo15163d() == -1) {
                requestedScope.mo21511r(aVar.mo15163d());
                requestedScope.mo21512s(bVar.mo15163d());
                C1485a.m832e(f607b, "Inserting " + requestedScope + " : rowid=" + requestedScope.mo15165f(context));
            } else {
                AuthorizationToken authorizationToken = (AuthorizationToken) aVar.mo15162c(context).mo15189h(requestedScope.mo21505l());
                if (authorizationToken != null) {
                    C1485a.m836i(f607b, "Deleting old access token.", "accessAtzToken=" + authorizationToken + " : " + authorizationToken.mo15161b(context));
                }
                requestedScope.mo21511r(aVar.mo15163d());
                AuthorizationToken authorizationToken2 = (AuthorizationToken) bVar.mo15162c(context).mo15189h(requestedScope.mo21506m());
                if (authorizationToken2 != null) {
                    C1485a.m836i(f607b, "Deleting old refresh token ", "refreshAtzToken=" + authorizationToken2 + " : " + authorizationToken2.mo15161b(context));
                }
                requestedScope.mo21512s(bVar.mo15163d());
                C1485a.m832e(f607b, "Updating " + requestedScope + " : " + requestedScope.mo15168i(context));
            }
        }
    }

    /* renamed from: j */
    public Bundle mo15289j(String str, String str2, String str3, String[] strArr, String str4, Context context, AppInfo appInfo, Bundle bundle) {
        String[] strArr2 = strArr;
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (strArr2 == null || strArr2.length == 0) {
            throw new AuthError("No scopes provided in parameters", AuthError.ERROR_TYPE.ERROR_BAD_API_PARAM);
        }
        C1485a.m832e(f607b, "Vending new tokens from Code");
        AuthorizationToken[] d = this.f608a.mo15281d(str, str2, str3, strArr, str4, context, appInfo);
        if (d != null) {
            C1469a aVar = (C1469a) d[0];
            if (aVar != null) {
                mo15284e(context2, aVar);
                C1470b bVar = (C1470b) d[1];
                if (bVar != null) {
                    mo15284e(context2, bVar);
                    Bundle bundle3 = bundle2;
                    mo15288i(appInfo.mo21443l(), strArr, context, aVar, bVar, str4);
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(AuthzConstants$BUNDLE_KEY.AUTHORIZE.val, "authorized");
                    if (!(aVar == null || bundle3 == null || !bundle3.getBoolean(LWAConstants$AUTHORIZE_BUNDLE_KEY.RETURN_ACCESS_TOKEN.val))) {
                        bundle4.putString(AuthzConstants$BUNDLE_KEY.TOKEN.val, aVar.mo21464o());
                    }
                    return bundle4;
                }
                throw new AuthError("Refresh Atz token was null from server communication", AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
            }
            throw new AuthError("Access Atz token was null from server communication", AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
        }
        throw new AuthError("No tokens returned", AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
    }

    /* renamed from: k */
    public String mo15290k(String str, String[] strArr, Context context, Bundle bundle, AppInfo appInfo) {
        C1485a.m836i(f607b, "Vending out token: appId=" + appInfo.mo21443l() + ", scopes=" + Arrays.toString(strArr), "directedId=" + str);
        if (strArr == null || strArr.length == 0) {
            C1485a.m832e(f607b, "Vend token - No scopes passed in");
        }
        RequestedScope[] d = mo15283d(str, appInfo.mo21443l(), strArr, context);
        C1469a b = m701b(d, context);
        C1470b c = m702c(d, context);
        if (!mo15285f(b, bundle)) {
            return mo15287h(c, str, strArr, b, context, appInfo);
        }
        C1485a.m832e(f607b, "Common token still has acceptable life, returning it back to caller");
        return b.mo21464o();
    }
}
