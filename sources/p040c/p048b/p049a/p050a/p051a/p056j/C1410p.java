package p040c.p048b.p049a.p050a.p051a.p056j;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import java.io.IOException;
import java.util.Arrays;
import p040c.p048b.p049a.p050a.p051a.p055i.C1377c;
import p040c.p048b.p049a.p050a.p051a.p059l.C1423h;
import p040c.p048b.p049a.p050a.p051a.p059l.C1424i;
import p040c.p048b.p049a.p050a.p051a.p060m.C1443r;
import p040c.p048b.p049a.p050a.p051a.p063p.C1461a;
import p040c.p048b.p049a.p050a.p051a.p064q.C1462a;
import p040c.p048b.p049a.p050a.p051a.p067t.C1474c;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.p */
/* compiled from: TokenHelper */
public final class C1410p {

    /* renamed from: a */
    public static final String f506a = "c.b.a.a.a.j.p";

    /* renamed from: b */
    public static C1443r f507b = new C1443r();

    /* renamed from: c.b.a.a.a.j.p$a */
    /* compiled from: TokenHelper */
    public static class C1411a extends C1474c<String> {

        /* renamed from: b */
        public final /* synthetic */ String[] f508b;

        /* renamed from: c */
        public final /* synthetic */ String f509c;

        public C1411a(String[] strArr, String str) {
            this.f508b = strArr;
            this.f509c = str;
        }

        /* renamed from: c */
        public String mo15142a(Context context, C1379a aVar) {
            return C1410p.m486d(context, this.f508b, this.f509c, aVar);
        }
    }

    /* renamed from: b */
    public static void m484b(Context context, String str, String str2, String[] strArr, C1462a aVar, C1377c cVar, Bundle bundle) {
        Bundle bundle2;
        C1485a.m836i(f506a, "Scopes=" + Arrays.toString(strArr), "GetToken pkg=" + str);
        AppInfo a = cVar.mo15096a(str, context);
        if (a == null) {
            C1485a.m829b(f506a, "appInfo is null for " + str);
            aVar.mo15067b(new AuthError("APIKey info is unavailable for " + str, (Throwable) null, AuthError.ERROR_TYPE.ERROR_ACCESS_DENIED));
            return;
        }
        try {
            String e = m487e(context, str, strArr, a, bundle);
            if (e == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = C1461a.m770a(AuthzConstants$BUNDLE_KEY.TOKEN.val, e);
            }
            aVar.mo15068c(bundle2);
        } catch (AuthError e2) {
            aVar.mo15067b(e2);
        }
    }

    /* renamed from: c */
    public static String m485c(Context context, String str, String[] strArr) {
        return (String) new C1411a(strArr, str).mo15345b(context, new C1406o());
    }

    /* renamed from: d */
    public static String m486d(Context context, String[] strArr, String str, C1379a aVar) {
        C1423h.m562a(context);
        C1424i.m567s(context).mo15183b();
        Bundle o = aVar.mo15104o((Bundle) null, str, strArr);
        if (o != null) {
            o.setClassLoader(context.getClassLoader());
            String string = o.getString("accessAtzToken");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            AuthError authError = (AuthError) o.getParcelable(AuthError.AUTH_ERROR_EXECEPTION);
            if (authError == null) {
                C1485a.m832e(f506a, "No results from service");
            } else if (AuthError.ERROR_TYPE.ERROR_INVALID_TOKEN == authError.getType()) {
                C1485a.m829b(f506a, "Invalid token. Cleaning up.");
                C1424i.m567s(context).mo15183b();
            } else {
                String str2 = f506a;
                C1485a.m832e(str2, "AuthError from service " + authError.getMessage());
                C1406o.m455c(context);
                throw authError;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m487e(Context context, String str, String[] strArr, AppInfo appInfo, Bundle bundle) {
        try {
            String k = f507b.mo15290k((String) null, strArr, context, bundle, appInfo);
            if (k == null) {
                k = m485c(context, str, strArr);
            }
            String str2 = f506a;
            C1485a.m836i(str2, "GetToken", " appid=" + appInfo.mo21443l() + " atzToken=" + k);
            return k;
        } catch (IOException e) {
            C1485a.m830c(f506a, e.getMessage(), e);
            throw new AuthError("Error communicating with server", e, AuthError.ERROR_TYPE.ERROR_IO);
        }
    }
}
