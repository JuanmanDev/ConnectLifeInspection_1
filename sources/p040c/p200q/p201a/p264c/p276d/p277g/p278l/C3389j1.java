package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.g.l.j1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3389j1 implements Runnable {

    /* renamed from: e */
    public final C3383h1 f6326e;

    /* renamed from: l */
    public final /* synthetic */ C3392k1 f6327l;

    public C3389j1(C3392k1 k1Var, C3383h1 h1Var) {
        this.f6327l = k1Var;
        this.f6326e = h1Var;
    }

    @MainThread
    public final void run() {
        if (this.f6327l.f6328l) {
            ConnectionResult b = this.f6326e.mo20561b();
            if (b.mo24486S()) {
                C3392k1 k1Var = this.f6327l;
                C3381h hVar = k1Var.f8198e;
                Activity b2 = k1Var.mo24553b();
                PendingIntent R = b.mo24485R();
                C3495o.m8908j(R);
                hVar.startActivityForResult(GoogleApiActivity.m10861a(b2, R, this.f6326e.mo20560a(), false), 1);
                return;
            }
            C3392k1 k1Var2 = this.f6327l;
            if (k1Var2.f6331o.mo20385b(k1Var2.mo24553b(), b.mo24483P(), (String) null) != null) {
                C3392k1 k1Var3 = this.f6327l;
                k1Var3.f6331o.mo20401v(k1Var3.mo24553b(), this.f6327l.f8198e, b.mo24483P(), 2, this.f6327l);
            } else if (b.mo24483P() == 18) {
                C3392k1 k1Var4 = this.f6327l;
                Dialog q = k1Var4.f6331o.mo20396q(k1Var4.mo24553b(), this.f6327l);
                C3392k1 k1Var5 = this.f6327l;
                k1Var5.f6331o.mo20397r(k1Var5.mo24553b().getApplicationContext(), new C3386i1(this, q));
            } else {
                this.f6327l.mo20582l(b, this.f6326e.mo20560a());
            }
        }
    }
}
