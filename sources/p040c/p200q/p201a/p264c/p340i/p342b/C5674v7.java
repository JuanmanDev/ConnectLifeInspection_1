package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzq;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C5088h1;

/* renamed from: c.q.a.c.i.b.v7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5674v7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ zzq f11041e;

    /* renamed from: l */
    public final /* synthetic */ C5088h1 f11042l;

    /* renamed from: m */
    public final /* synthetic */ C5616q8 f11043m;

    public C5674v7(C5616q8 q8Var, zzq zzq, C5088h1 h1Var) {
        this.f11043m = q8Var;
        this.f11041e = zzq;
        this.f11042l = h1Var;
    }

    public final void run() {
        C5648t4 t4Var;
        String str = null;
        try {
            if (!this.f11043m.f10699a.mo28622F().mo28681q().mo28326i(zzah.ANALYTICS_STORAGE)) {
                this.f11043m.f10699a.mo28487b().mo28345x().mo28259a("Analytics storage consent denied; will not get app instance id");
                this.f11043m.f10699a.mo28624I().mo28035C((String) null);
                this.f11043m.f10699a.mo28622F().f11075g.mo28671b((String) null);
                t4Var = this.f11043m.f10699a;
            } else {
                C5616q8 q8Var = this.f11043m;
                C5691x2 H = q8Var.f10788d;
                if (H == null) {
                    q8Var.f10699a.mo28487b().mo28339r().mo28259a("Failed to get app instance id");
                    t4Var = this.f11043m.f10699a;
                } else {
                    C3495o.m8908j(this.f11041e);
                    str = H.mo28471y(this.f11041e);
                    if (str != null) {
                        this.f11043m.f10699a.mo28624I().mo28035C(str);
                        this.f11043m.f10699a.mo28622F().f11075g.mo28671b(str);
                    }
                    this.f11043m.mo28560E();
                    t4Var = this.f11043m.f10699a;
                }
            }
        } catch (RemoteException e) {
            this.f11043m.f10699a.mo28487b().mo28339r().mo28260b("Failed to get app instance id", e);
            t4Var = this.f11043m.f10699a;
        } catch (Throwable th) {
            this.f11043m.f10699a.mo28629N().mo28279J(this.f11042l, (String) null);
            throw th;
        }
        t4Var.mo28629N().mo28279J(this.f11042l, str);
    }
}
