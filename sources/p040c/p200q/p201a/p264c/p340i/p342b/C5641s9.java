package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzaw;
import kotlinx.coroutines.DebugKt;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.s9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5641s9 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f10864e;

    /* renamed from: l */
    public final /* synthetic */ String f10865l = "_err";

    /* renamed from: m */
    public final /* synthetic */ Bundle f10866m;

    /* renamed from: n */
    public final /* synthetic */ C5653t9 f10867n;

    public C5641s9(C5653t9 t9Var, String str, String str2, Bundle bundle) {
        this.f10867n = t9Var;
        this.f10864e = str;
        this.f10866m = bundle;
    }

    public final void run() {
        zzaw w0 = this.f10867n.f10932a.mo28745g0().mo28316w0(this.f10864e, this.f10865l, this.f10866m, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, this.f10867n.f10932a.mo28488c().mo20838a(), false, true);
        C5709y9 y9Var = this.f10867n.f10932a;
        C3495o.m8908j(w0);
        y9Var.mo28751k(w0, this.f10864e);
    }
}
