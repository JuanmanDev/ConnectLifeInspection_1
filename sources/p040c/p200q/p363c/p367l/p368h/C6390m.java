package p040c.p200q.p363c.p367l.p368h;

import com.google.android.gms.internal.p527firebaseauthapi.zzqx;
import java.util.HashMap;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;
import p040c.p200q.p363c.p367l.C6359c;

/* renamed from: c.q.c.l.h.m */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6390m {

    /* renamed from: a */
    public static final C3537a f12064a = new C3537a("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static C6359c m17917a(String str) {
        Map map;
        try {
            map = C6391n.m17919b(str);
        } catch (zzqx e) {
            f12064a.mo20806b("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        return new C6359c(str, map);
    }
}
