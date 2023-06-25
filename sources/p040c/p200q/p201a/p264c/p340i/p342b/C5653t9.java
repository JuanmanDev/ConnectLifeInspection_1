package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: c.q.a.c.i.b.t9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5653t9 implements C5486fa {

    /* renamed from: a */
    public final /* synthetic */ C5709y9 f10932a;

    public C5653t9(C5709y9 y9Var) {
        this.f10932a = y9Var;
    }

    /* renamed from: a */
    public final void mo28233a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C5709y9 y9Var = this.f10932a;
            if (y9Var.f11167l != null) {
                y9Var.f11167l.mo28487b().mo28339r().mo28260b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f10932a.mo28486a().mo28540z(new C5641s9(this, str, "_err", bundle));
    }
}
