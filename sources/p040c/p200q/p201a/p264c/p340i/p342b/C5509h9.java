package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import p040c.p200q.p201a.p264c.p294g.p335i.C5361z0;

/* renamed from: c.q.a.c.i.b.h9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5509h9 extends C5432b4 {

    /* renamed from: c */
    public Handler f10528c;

    /* renamed from: d */
    public final C5497g9 f10529d = new C5497g9(this);

    /* renamed from: e */
    public final C5485f9 f10530e = new C5485f9(this);

    /* renamed from: f */
    public final C5449c9 f10531f = new C5449c9(this);

    public C5509h9(C5648t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m15767q(C5509h9 h9Var, long j) {
        h9Var.mo28029h();
        h9Var.mo28334s();
        h9Var.f10699a.mo28487b().mo28343v().mo28260b("Activity paused, time", Long.valueOf(j));
        h9Var.f10531f.mo28137a(j);
        if (h9Var.f10699a.mo28649z().mo28237D()) {
            h9Var.f10530e.mo28230b(j);
        }
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m15768r(C5509h9 h9Var, long j) {
        h9Var.mo28029h();
        h9Var.mo28334s();
        h9Var.f10699a.mo28487b().mo28343v().mo28260b("Activity resumed, time", Long.valueOf(j));
        if (h9Var.f10699a.mo28649z().mo28237D() || h9Var.f10699a.mo28622F().f11086r.mo28590b()) {
            h9Var.f10530e.mo28231c(j);
        }
        h9Var.f10531f.mo28138b();
        C5497g9 g9Var = h9Var.f10529d;
        g9Var.f10504a.mo28029h();
        if (g9Var.f10504a.f10699a.mo28642o()) {
            g9Var.mo28268b(g9Var.f10504a.f10699a.mo28488c().mo20838a(), false);
        }
    }

    /* renamed from: n */
    public final boolean mo28061n() {
        return false;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo28334s() {
        mo28029h();
        if (this.f10528c == null) {
            this.f10528c = new C5361z0(Looper.getMainLooper());
        }
    }
}
