package p040c.p200q.p201a.p264c.p340i.p342b;

import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.s7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5639s7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ zzq f10854e;

    /* renamed from: l */
    public final /* synthetic */ boolean f10855l;

    /* renamed from: m */
    public final /* synthetic */ zzkw f10856m;

    /* renamed from: n */
    public final /* synthetic */ C5616q8 f10857n;

    public C5639s7(C5616q8 q8Var, zzq zzq, boolean z, zzkw zzkw) {
        this.f10857n = q8Var;
        this.f10854e = zzq;
        this.f10855l = z;
        this.f10856m = zzkw;
    }

    public final void run() {
        zzkw zzkw;
        C5616q8 q8Var = this.f10857n;
        C5691x2 H = q8Var.f10788d;
        if (H == null) {
            q8Var.f10699a.mo28487b().mo28339r().mo28259a("Discarding data. Failed to set user property");
            return;
        }
        C3495o.m8908j(this.f10854e);
        C5616q8 q8Var2 = this.f10857n;
        if (this.f10855l) {
            zzkw = null;
        } else {
            zzkw = this.f10856m;
        }
        q8Var2.mo28576r(H, zzkw, this.f10854e);
        this.f10857n.mo28560E();
    }
}
