package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzaw;
import p040c.p200q.p201a.p264c.p294g.p335i.C5088h1;

/* renamed from: c.q.a.c.i.b.a8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5424a8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ zzaw f10336e;

    /* renamed from: l */
    public final /* synthetic */ String f10337l;

    /* renamed from: m */
    public final /* synthetic */ C5088h1 f10338m;

    /* renamed from: n */
    public final /* synthetic */ C5616q8 f10339n;

    public C5424a8(C5616q8 q8Var, zzaw zzaw, String str, C5088h1 h1Var) {
        this.f10339n = q8Var;
        this.f10336e = zzaw;
        this.f10337l = str;
        this.f10338m = h1Var;
    }

    public final void run() {
        C5648t4 t4Var;
        byte[] bArr = null;
        try {
            C5616q8 q8Var = this.f10339n;
            C5691x2 H = q8Var.f10788d;
            if (H == null) {
                q8Var.f10699a.mo28487b().mo28339r().mo28259a("Discarding data. Failed to send event to service to bundle");
                t4Var = this.f10339n.f10699a;
            } else {
                bArr = H.mo28469u(this.f10336e, this.f10337l);
                this.f10339n.mo28560E();
                t4Var = this.f10339n.f10699a;
            }
        } catch (RemoteException e) {
            this.f10339n.f10699a.mo28487b().mo28339r().mo28260b("Failed to send event to the service to bundle", e);
            t4Var = this.f10339n.f10699a;
        } catch (Throwable th) {
            this.f10339n.f10699a.mo28629N().mo28276G(this.f10338m, bArr);
            throw th;
        }
        t4Var.mo28629N().mo28276G(this.f10338m, bArr);
    }
}
