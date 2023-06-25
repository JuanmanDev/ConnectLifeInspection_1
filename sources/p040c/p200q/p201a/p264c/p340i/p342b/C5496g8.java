package p040c.p200q.p201a.p264c.p340i.p342b;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.g8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5496g8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ zzq f10499e;

    /* renamed from: l */
    public final /* synthetic */ boolean f10500l;

    /* renamed from: m */
    public final /* synthetic */ zzac f10501m;

    /* renamed from: n */
    public final /* synthetic */ zzac f10502n;

    /* renamed from: o */
    public final /* synthetic */ C5616q8 f10503o;

    public C5496g8(C5616q8 q8Var, boolean z, zzq zzq, boolean z2, zzac zzac, zzac zzac2) {
        this.f10503o = q8Var;
        this.f10499e = zzq;
        this.f10500l = z2;
        this.f10501m = zzac;
        this.f10502n = zzac2;
    }

    public final void run() {
        zzac zzac;
        C5616q8 q8Var = this.f10503o;
        C5691x2 H = q8Var.f10788d;
        if (H == null) {
            q8Var.f10699a.mo28487b().mo28339r().mo28259a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C3495o.m8908j(this.f10499e);
        C5616q8 q8Var2 = this.f10503o;
        if (this.f10500l) {
            zzac = null;
        } else {
            zzac = this.f10501m;
        }
        q8Var2.mo28576r(H, zzac, this.f10499e);
        this.f10503o.mo28560E();
    }
}
