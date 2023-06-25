package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;

/* renamed from: c.q.a.c.i.b.x7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5696x7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5519i7 f11112e;

    /* renamed from: l */
    public final /* synthetic */ C5616q8 f11113l;

    public C5696x7(C5616q8 q8Var, C5519i7 i7Var) {
        this.f11113l = q8Var;
        this.f11112e = i7Var;
    }

    public final void run() {
        C5616q8 q8Var = this.f11113l;
        C5691x2 H = q8Var.f10788d;
        if (H == null) {
            q8Var.f10699a.mo28487b().mo28339r().mo28259a("Failed to send current screen to service");
            return;
        }
        try {
            C5519i7 i7Var = this.f11112e;
            if (i7Var == null) {
                H.mo28451L(0, (String) null, (String) null, q8Var.f10699a.mo28490f().getPackageName());
            } else {
                H.mo28451L(i7Var.f10562c, i7Var.f10560a, i7Var.f10561b, q8Var.f10699a.mo28490f().getPackageName());
            }
            this.f11113l.mo28560E();
        } catch (RemoteException e) {
            this.f11113l.f10699a.mo28487b().mo28339r().mo28260b("Failed to send current screen to the service", e);
        }
    }
}
