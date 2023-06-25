package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.text.TextUtils;
import kotlinx.coroutines.DebugKt;

/* renamed from: c.q.a.c.i.b.o6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5590o6 implements C5486fa {

    /* renamed from: a */
    public final /* synthetic */ C5423a7 f10717a;

    public C5590o6(C5423a7 a7Var) {
        this.f10717a = a7Var;
    }

    /* renamed from: a */
    public final void mo28233a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f10717a.mo28065r(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        } else {
            this.f10717a.mo28067t(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle, str);
            throw null;
        }
    }
}
