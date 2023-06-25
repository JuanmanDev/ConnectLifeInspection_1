package p040c.p048b.p049a.p050a.p051a.p055i;

import android.content.Context;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import p040c.p048b.p049a.p050a.p051a.p067t.C1481j;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.i.b */
/* compiled from: AbstractAppIdentifier */
public abstract class C1376b implements C1377c {

    /* renamed from: a */
    public static final String f414a = "c.b.a.a.a.i.b";

    /* renamed from: a */
    public AppInfo mo15096a(String str, Context context) {
        C1485a.m836i(f414a, "getAppInfo : packageName=", str);
        return mo15098c(str, context);
    }

    /* renamed from: b */
    public final String mo15097b(String str, Context context) {
        C1485a.m836i(f414a, "Finding API Key for ", str);
        return mo15099d(context, str).mo15346a();
    }

    /* renamed from: c */
    public AppInfo mo15098c(String str, Context context) {
        C1485a.m836i(f414a, "getAppInfoFromAPIKey : packageName=", str);
        if (str != null) {
            return C1375a.m342a(str, mo15097b(str, context), context);
        }
        C1485a.m838k(f414a, "packageName can't be null!");
        return null;
    }

    /* renamed from: d */
    public C1481j mo15099d(Context context, String str) {
        return new C1481j(context, str);
    }

    /* renamed from: e */
    public boolean mo15100e(Context context) {
        if (context != null) {
            return mo15101f(context.getPackageName(), context);
        }
        C1485a.m838k(f414a, "context can't be null!");
        return false;
    }

    /* renamed from: f */
    public boolean mo15101f(String str, Context context) {
        C1485a.m836i(f414a, "isAPIKeyValid : packageName=", str);
        if (str == null) {
            C1485a.m838k(f414a, "packageName can't be null!");
            return false;
        } else if (mo15096a(str, context) != null) {
            return true;
        } else {
            return false;
        }
    }
}
