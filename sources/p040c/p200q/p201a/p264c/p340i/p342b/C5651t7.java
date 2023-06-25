package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.t7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5651t7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ zzq f10927e;

    /* renamed from: l */
    public final /* synthetic */ C5616q8 f10928l;

    public C5651t7(C5616q8 q8Var, zzq zzq) {
        this.f10928l = q8Var;
        this.f10927e = zzq;
    }

    public final void run() {
        C5616q8 q8Var = this.f10928l;
        C5691x2 H = q8Var.f10788d;
        if (H == null) {
            q8Var.f10699a.mo28487b().mo28339r().mo28259a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C3495o.m8908j(this.f10927e);
            H.mo28456V(this.f10927e);
        } catch (RemoteException e) {
            this.f10928l.f10699a.mo28487b().mo28339r().mo28260b("Failed to reset data on the service: remote exception", e);
        }
        this.f10928l.mo28560E();
    }
}
