package p040c.p200q.p201a.p264c.p340i.p342b;

import com.juconnect.vivino.global.UrlConstKt;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: c.q.a.c.i.b.e4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class C5468e4 implements Callable {

    /* renamed from: e */
    public final /* synthetic */ C5552l4 f10429e;

    /* renamed from: l */
    public final /* synthetic */ String f10430l;

    public /* synthetic */ C5468e4(C5552l4 l4Var, String str) {
        this.f10429e = l4Var;
        this.f10430l = str;
    }

    public final Object call() {
        C5552l4 l4Var = this.f10429e;
        String str = this.f10430l;
        C5458d6 R = l4Var.f10663b.mo28734V().mo28387R(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", UrlConstKt.APP_PLATFORM);
        hashMap.put("package_name", str);
        l4Var.f10699a.mo28649z().mo28249q();
        hashMap.put("gmp_version", 74029L);
        if (R != null) {
            String g0 = R.mo28188g0();
            if (g0 != null) {
                hashMap.put("app_version", g0);
            }
            hashMap.put("app_version_int", Long.valueOf(R.mo28160L()));
            hashMap.put("dynamite_version", Long.valueOf(R.mo28169U()));
        }
        return hashMap;
    }
}
