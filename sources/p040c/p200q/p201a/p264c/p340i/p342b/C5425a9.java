package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import kotlinx.coroutines.DebugKt;

/* renamed from: c.q.a.c.i.b.a9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class C5425a9 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5437b9 f10340e;

    public /* synthetic */ C5425a9(C5437b9 b9Var) {
        this.f10340e = b9Var;
    }

    public final void run() {
        C5437b9 b9Var = this.f10340e;
        C5449c9 c9Var = b9Var.f10358m;
        long j = b9Var.f10356e;
        long j2 = b9Var.f10357l;
        c9Var.f10371b.mo28029h();
        c9Var.f10371b.f10699a.mo28487b().mo28338q().mo28259a("Application going to the background");
        c9Var.f10371b.f10699a.mo28622F().f11086r.mo28589a(true);
        Bundle bundle = new Bundle();
        if (!c9Var.f10371b.f10699a.mo28649z().mo28237D()) {
            c9Var.f10371b.f10530e.mo28230b(j2);
            c9Var.f10371b.f10530e.mo28232d(false, false, j2);
        }
        c9Var.f10371b.f10699a.mo28624I().mo28069v(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j, bundle);
    }
}
