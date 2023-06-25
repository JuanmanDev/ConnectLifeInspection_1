package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.y7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5707y7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ zzq f11145e;

    /* renamed from: l */
    public final /* synthetic */ Bundle f11146l;

    /* renamed from: m */
    public final /* synthetic */ C5616q8 f11147m;

    public C5707y7(C5616q8 q8Var, zzq zzq, Bundle bundle) {
        this.f11147m = q8Var;
        this.f11145e = zzq;
        this.f11146l = bundle;
    }

    public final void run() {
        C5616q8 q8Var = this.f11147m;
        C5691x2 H = q8Var.f10788d;
        if (H == null) {
            q8Var.f10699a.mo28487b().mo28339r().mo28259a("Failed to send default event parameters to service");
            return;
        }
        try {
            C3495o.m8908j(this.f11145e);
            H.mo28465n(this.f11146l, this.f11145e);
        } catch (RemoteException e) {
            this.f11147m.f10699a.mo28487b().mo28339r().mo28260b("Failed to send default event parameters to service", e);
        }
    }
}
