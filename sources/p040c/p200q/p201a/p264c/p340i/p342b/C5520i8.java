package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C5088h1;

/* renamed from: c.q.a.c.i.b.i8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5520i8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f10566e;

    /* renamed from: l */
    public final /* synthetic */ String f10567l;

    /* renamed from: m */
    public final /* synthetic */ zzq f10568m;

    /* renamed from: n */
    public final /* synthetic */ C5088h1 f10569n;

    /* renamed from: o */
    public final /* synthetic */ C5616q8 f10570o;

    public C5520i8(C5616q8 q8Var, String str, String str2, zzq zzq, C5088h1 h1Var) {
        this.f10570o = q8Var;
        this.f10566e = str;
        this.f10567l = str2;
        this.f10568m = zzq;
        this.f10569n = h1Var;
    }

    public final void run() {
        C5648t4 t4Var;
        ArrayList arrayList = new ArrayList();
        try {
            C5616q8 q8Var = this.f10570o;
            C5691x2 H = q8Var.f10788d;
            if (H == null) {
                q8Var.f10699a.mo28487b().mo28339r().mo28261c("Failed to get conditional properties; not connected to service", this.f10566e, this.f10567l);
                t4Var = this.f10570o.f10699a;
            } else {
                C3495o.m8908j(this.f10568m);
                arrayList = C5498ga.m15696v(H.mo28450J(this.f10566e, this.f10567l, this.f10568m));
                this.f10570o.mo28560E();
                t4Var = this.f10570o.f10699a;
            }
        } catch (RemoteException e) {
            this.f10570o.f10699a.mo28487b().mo28339r().mo28262d("Failed to get conditional properties; remote exception", this.f10566e, this.f10567l, e);
            t4Var = this.f10570o.f10699a;
        } catch (Throwable th) {
            this.f10570o.f10699a.mo28629N().mo28274E(this.f10569n, arrayList);
            throw th;
        }
        t4Var.mo28629N().mo28274E(this.f10569n, arrayList);
    }
}
