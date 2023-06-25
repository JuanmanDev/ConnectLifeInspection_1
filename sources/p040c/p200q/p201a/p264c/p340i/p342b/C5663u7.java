package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.u7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5663u7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f11017e;

    /* renamed from: l */
    public final /* synthetic */ zzq f11018l;

    /* renamed from: m */
    public final /* synthetic */ C5616q8 f11019m;

    public C5663u7(C5616q8 q8Var, AtomicReference atomicReference, zzq zzq) {
        this.f11019m = q8Var;
        this.f11017e = atomicReference;
        this.f11018l = zzq;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f11017e) {
            try {
                if (!this.f11019m.f10699a.mo28622F().mo28681q().mo28326i(zzah.ANALYTICS_STORAGE)) {
                    this.f11019m.f10699a.mo28487b().mo28345x().mo28259a("Analytics storage consent denied; will not get app instance id");
                    this.f11019m.f10699a.mo28624I().mo28035C((String) null);
                    this.f11019m.f10699a.mo28622F().f11075g.mo28671b((String) null);
                    this.f11017e.set((Object) null);
                    this.f11017e.notify();
                    return;
                }
                C5616q8 q8Var = this.f11019m;
                C5691x2 H = q8Var.f10788d;
                if (H == null) {
                    q8Var.f10699a.mo28487b().mo28339r().mo28259a("Failed to get app instance id");
                    this.f11017e.notify();
                    return;
                }
                C3495o.m8908j(this.f11018l);
                this.f11017e.set(H.mo28471y(this.f11018l));
                String str = (String) this.f11017e.get();
                if (str != null) {
                    this.f11019m.f10699a.mo28624I().mo28035C(str);
                    this.f11019m.f10699a.mo28622F().f11075g.mo28671b(str);
                }
                this.f11019m.mo28560E();
                atomicReference = this.f11017e;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f11019m.f10699a.mo28487b().mo28339r().mo28260b("Failed to get app instance id", e);
                    atomicReference = this.f11017e;
                } catch (Throwable th) {
                    this.f11017e.notify();
                    throw th;
                }
            }
        }
    }
}
