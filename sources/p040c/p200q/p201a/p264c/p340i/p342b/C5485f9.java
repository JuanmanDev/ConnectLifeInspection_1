package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import kotlinx.coroutines.DebugKt;
import p040c.p200q.p201a.p264c.p294g.p335i.C5193nc;

/* renamed from: c.q.a.c.i.b.f9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5485f9 {

    /* renamed from: a */
    public long f10475a;

    /* renamed from: b */
    public long f10476b;

    /* renamed from: c */
    public final C5583o f10477c = new C5461d9(this, this.f10478d.f10699a);

    /* renamed from: d */
    public final /* synthetic */ C5509h9 f10478d;

    public C5485f9(C5509h9 h9Var) {
        this.f10478d = h9Var;
        long b = h9Var.f10699a.mo28488c().mo20839b();
        this.f10475a = b;
        this.f10476b = b;
    }

    /* renamed from: a */
    public final void mo28229a() {
        this.f10477c.mo28495b();
        this.f10475a = 0;
        this.f10476b = 0;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo28230b(long j) {
        this.f10477c.mo28495b();
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo28231c(long j) {
        this.f10478d.mo28029h();
        this.f10477c.mo28495b();
        this.f10475a = j;
        this.f10476b = j;
    }

    @WorkerThread
    /* renamed from: d */
    public final boolean mo28232d(boolean z, boolean z2, long j) {
        this.f10478d.mo28029h();
        this.f10478d.mo28106i();
        C5193nc.m14579b();
        if (!this.f10478d.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10972e0)) {
            this.f10478d.f10699a.mo28622F().f11083o.mo28616b(this.f10478d.f10699a.mo28488c().mo20838a());
        } else if (this.f10478d.f10699a.mo28642o()) {
            this.f10478d.f10699a.mo28622F().f11083o.mo28616b(this.f10478d.f10699a.mo28488c().mo20838a());
        }
        long j2 = j - this.f10475a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f10476b;
                this.f10476b = j;
            }
            this.f10478d.f10699a.mo28487b().mo28343v().mo28260b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C5498ga.m15697y(this.f10478d.f10699a.mo28626K().mo28552s(!this.f10478d.f10699a.mo28649z().mo28237D()), bundle, true);
            if (!z2) {
                this.f10478d.f10699a.mo28624I().mo28068u(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
            }
            this.f10475a = j;
            this.f10477c.mo28495b();
            this.f10477c.mo28496d(3600000);
            return true;
        }
        this.f10478d.f10699a.mo28487b().mo28343v().mo28260b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
