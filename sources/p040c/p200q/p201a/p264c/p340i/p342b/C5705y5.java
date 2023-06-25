package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: c.q.a.c.i.b.y5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class C5705y5 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5423a7 f11142e;

    /* renamed from: l */
    public final /* synthetic */ Bundle f11143l;

    /* renamed from: m */
    public final /* synthetic */ long f11144m;

    public /* synthetic */ C5705y5(C5423a7 a7Var, Bundle bundle, long j) {
        this.f11142e = a7Var;
        this.f11143l = bundle;
        this.f11144m = j;
    }

    public final void run() {
        C5423a7 a7Var = this.f11142e;
        Bundle bundle = this.f11143l;
        long j = this.f11144m;
        if (TextUtils.isEmpty(a7Var.f10699a.mo28618B().mo28708t())) {
            a7Var.mo28038F(bundle, 0, j);
        } else {
            a7Var.f10699a.mo28487b().mo28345x().mo28259a("Using developer consent only; google app id found");
        }
    }
}
