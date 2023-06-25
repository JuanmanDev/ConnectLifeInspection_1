package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C5088h1;

/* renamed from: c.q.a.c.i.b.r7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5627r7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f10825e;

    /* renamed from: l */
    public final /* synthetic */ String f10826l;

    /* renamed from: m */
    public final /* synthetic */ zzq f10827m;

    /* renamed from: n */
    public final /* synthetic */ boolean f10828n;

    /* renamed from: o */
    public final /* synthetic */ C5088h1 f10829o;

    /* renamed from: p */
    public final /* synthetic */ C5616q8 f10830p;

    public C5627r7(C5616q8 q8Var, String str, String str2, zzq zzq, boolean z, C5088h1 h1Var) {
        this.f10830p = q8Var;
        this.f10825e = str;
        this.f10826l = str2;
        this.f10827m = zzq;
        this.f10828n = z;
        this.f10829o = h1Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C5616q8 q8Var = this.f10830p;
            C5691x2 H = q8Var.f10788d;
            if (H == null) {
                q8Var.f10699a.mo28487b().mo28339r().mo28261c("Failed to get user properties; not connected to service", this.f10825e, this.f10826l);
                this.f10830p.f10699a.mo28629N().mo28275F(this.f10829o, bundle2);
                return;
            }
            C3495o.m8908j(this.f10827m);
            List<zzkw> T = H.mo28455T(this.f10825e, this.f10826l, this.f10828n, this.f10827m);
            bundle = new Bundle();
            if (T != null) {
                for (zzkw zzkw : T) {
                    String str = zzkw.f14907o;
                    if (str != null) {
                        bundle.putString(zzkw.f14904l, str);
                    } else {
                        Long l = zzkw.f14906n;
                        if (l != null) {
                            bundle.putLong(zzkw.f14904l, l.longValue());
                        } else {
                            Double d = zzkw.f14909q;
                            if (d != null) {
                                bundle.putDouble(zzkw.f14904l, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f10830p.mo28560E();
                this.f10830p.f10699a.mo28629N().mo28275F(this.f10829o, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f10830p.f10699a.mo28487b().mo28339r().mo28261c("Failed to get user properties; remote exception", this.f10825e, e);
                    this.f10830p.f10699a.mo28629N().mo28275F(this.f10829o, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f10830p.f10699a.mo28629N().mo28275F(this.f10829o, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f10830p.f10699a.mo28487b().mo28339r().mo28261c("Failed to get user properties; remote exception", this.f10825e, e);
            this.f10830p.f10699a.mo28629N().mo28275F(this.f10829o, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f10830p.f10699a.mo28629N().mo28275F(this.f10829o, bundle2);
            throw th;
        }
    }
}
