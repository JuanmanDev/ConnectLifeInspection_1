package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzq;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.w7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5685w7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ zzq f11063e;

    /* renamed from: l */
    public final /* synthetic */ C5616q8 f11064l;

    public C5685w7(C5616q8 q8Var, zzq zzq) {
        this.f11064l = q8Var;
        this.f11063e = zzq;
    }

    public final void run() {
        C5616q8 q8Var = this.f11064l;
        C5691x2 H = q8Var.f10788d;
        if (H == null) {
            q8Var.f10699a.mo28487b().mo28339r().mo28259a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C3495o.m8908j(this.f11063e);
            H.mo28449I(this.f11063e);
            this.f11064l.f10699a.mo28619C().mo28101t();
            this.f11064l.mo28576r(H, (AbstractSafeParcelable) null, this.f11063e);
            this.f11064l.mo28560E();
        } catch (RemoteException e) {
            this.f11064l.f10699a.mo28487b().mo28339r().mo28260b("Failed to send app launch to the service", e);
        }
    }
}
