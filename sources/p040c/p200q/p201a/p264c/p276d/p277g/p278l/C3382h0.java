package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import com.google.android.gms.common.ConnectionResult;
import p040c.p200q.p201a.p264c.p276d.p281j.C3474i;

/* renamed from: c.q.a.c.d.g.l.h0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3382h0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ ConnectionResult f6301e;

    /* renamed from: l */
    public final /* synthetic */ C3385i0 f6302l;

    public C3382h0(C3385i0 i0Var, ConnectionResult connectionResult) {
        this.f6302l = i0Var;
        this.f6301e = connectionResult;
    }

    public final void run() {
        C3385i0 i0Var = this.f6302l;
        C3373e0 e0Var = (C3373e0) i0Var.f6312f.f6287v.get(i0Var.f6308b);
        if (e0Var != null) {
            if (this.f6301e.mo24487T()) {
                this.f6302l.f6311e = true;
                if (this.f6302l.f6307a.mo20433m()) {
                    this.f6302l.mo20567h();
                    return;
                }
                try {
                    C3385i0 i0Var2 = this.f6302l;
                    i0Var2.f6307a.mo20422b((C3474i) null, i0Var2.f6307a.mo20421a());
                } catch (SecurityException unused) {
                    this.f6302l.f6307a.mo20423c("Failed to get service from broker.");
                    e0Var.mo20500H(new ConnectionResult(10), (Exception) null);
                }
            } else {
                e0Var.mo20500H(this.f6301e, (Exception) null);
            }
        }
    }
}
