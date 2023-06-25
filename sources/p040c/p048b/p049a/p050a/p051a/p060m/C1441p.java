package p040c.p048b.p049a.p050a.p051a.p060m;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.b.a.a.a.m.p */
/* compiled from: ResponseUri */
public class C1441p {

    /* renamed from: a */
    public final Uri f605a;

    public C1441p(Uri uri) {
        this.f605a = uri;
    }

    /* renamed from: a */
    public Map<String, String> mo15278a() {
        String queryParameter = this.f605a.getQueryParameter("state");
        if (queryParameter != null) {
            HashMap hashMap = new HashMap();
            for (String split : TextUtils.split(queryParameter, "&")) {
                String[] split2 = TextUtils.split(split, MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
                if (split2 != null && split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
            return hashMap;
        }
        throw new AuthError(String.format("Response does not have a state parameter: %s", new Object[]{this.f605a.toString()}), AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
    }
}
