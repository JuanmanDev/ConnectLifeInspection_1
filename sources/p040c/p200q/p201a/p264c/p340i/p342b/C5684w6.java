package p040c.p200q.p201a.p264c.p340i.p342b;

/* renamed from: c.q.a.c.i.b.w6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5684w6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ boolean f11061e;

    /* renamed from: l */
    public final /* synthetic */ C5423a7 f11062l;

    public C5684w6(C5423a7 a7Var, boolean z) {
        this.f11062l = a7Var;
        this.f11061e = z;
    }

    public final void run() {
        boolean o = this.f11062l.f10699a.mo28642o();
        boolean n = this.f11062l.f10699a.mo28641n();
        this.f11062l.f10699a.mo28638k(this.f11061e);
        if (n == this.f11061e) {
            this.f11062l.f10699a.mo28487b().mo28343v().mo28260b("Default data collection state already set to", Boolean.valueOf(this.f11061e));
        }
        if (this.f11062l.f10699a.mo28642o() == o || this.f11062l.f10699a.mo28642o() != this.f11062l.f10699a.mo28641n()) {
            this.f11062l.f10699a.mo28487b().mo28345x().mo28261c("Default data collection is different than actual status", Boolean.valueOf(this.f11061e), Boolean.valueOf(o));
        }
        this.f11062l.mo28048P();
    }
}
