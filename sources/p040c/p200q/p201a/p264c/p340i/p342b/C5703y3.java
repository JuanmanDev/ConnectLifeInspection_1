package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ServiceConnection;
import android.os.Bundle;
import p040c.p200q.p201a.p264c.p294g.p335i.C5256s0;

/* renamed from: c.q.a.c.i.b.y3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5703y3 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5256s0 f11135e;

    /* renamed from: l */
    public final /* synthetic */ ServiceConnection f11136l;

    /* renamed from: m */
    public final /* synthetic */ C5714z3 f11137m;

    public C5703y3(C5714z3 z3Var, C5256s0 s0Var, ServiceConnection serviceConnection) {
        this.f11137m = z3Var;
        this.f11135e = s0Var;
        this.f11136l = serviceConnection;
    }

    public final void run() {
        C5714z3 z3Var = this.f11137m;
        C5420a4 a4Var = z3Var.f11189l;
        String a = z3Var.f11188e;
        C5256s0 s0Var = this.f11135e;
        a4Var.f10315a.mo28486a().mo28029h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", a);
        try {
            if (s0Var.mo27511F(bundle) == null) {
                a4Var.f10315a.mo28487b().mo28339r().mo28259a("Install Referrer Service returned a null response");
            }
        } catch (Exception e) {
            a4Var.f10315a.mo28487b().mo28339r().mo28260b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        a4Var.f10315a.mo28486a().mo28029h();
        C5648t4.m16092t();
        throw null;
    }
}
