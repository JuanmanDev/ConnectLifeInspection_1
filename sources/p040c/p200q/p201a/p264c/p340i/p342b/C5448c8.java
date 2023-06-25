package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.c8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5448c8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ zzq f10368e;

    /* renamed from: l */
    public final /* synthetic */ C5616q8 f10369l;

    public C5448c8(C5616q8 q8Var, zzq zzq) {
        this.f10369l = q8Var;
        this.f10368e = zzq;
    }

    public final void run() {
        C5616q8 q8Var = this.f10369l;
        C5691x2 H = q8Var.f10788d;
        if (H == null) {
            q8Var.f10699a.mo28487b().mo28339r().mo28259a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C3495o.m8908j(this.f10368e);
            H.mo28464l(this.f10368e);
            this.f10369l.mo28560E();
        } catch (RemoteException e) {
            this.f10369l.f10699a.mo28487b().mo28339r().mo28260b("Failed to send measurementEnabled to the service", e);
        }
    }
}
