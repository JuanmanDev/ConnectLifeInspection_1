package p040c.p200q.p201a.p264c.p340i.p342b;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.f8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5484f8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ zzq f10471e;

    /* renamed from: l */
    public final /* synthetic */ boolean f10472l;

    /* renamed from: m */
    public final /* synthetic */ zzaw f10473m;

    /* renamed from: n */
    public final /* synthetic */ C5616q8 f10474n;

    public C5484f8(C5616q8 q8Var, boolean z, zzq zzq, boolean z2, zzaw zzaw, String str) {
        this.f10474n = q8Var;
        this.f10471e = zzq;
        this.f10472l = z2;
        this.f10473m = zzaw;
    }

    public final void run() {
        zzaw zzaw;
        C5616q8 q8Var = this.f10474n;
        C5691x2 H = q8Var.f10788d;
        if (H == null) {
            q8Var.f10699a.mo28487b().mo28339r().mo28259a("Discarding data. Failed to send event to service");
            return;
        }
        C3495o.m8908j(this.f10471e);
        C5616q8 q8Var2 = this.f10474n;
        if (this.f10472l) {
            zzaw = null;
        } else {
            zzaw = this.f10473m;
        }
        q8Var2.mo28576r(H, zzaw, this.f10471e);
        this.f10474n.mo28560E();
    }
}
