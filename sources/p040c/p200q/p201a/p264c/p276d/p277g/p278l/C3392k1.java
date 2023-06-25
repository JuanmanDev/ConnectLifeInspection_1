package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p201a.p264c.p276d.C3324b;
import p040c.p200q.p201a.p264c.p294g.p298d.C3636f;

/* renamed from: c.q.a.c.d.g.l.k1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3392k1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: l */
    public volatile boolean f6328l;

    /* renamed from: m */
    public final AtomicReference<C3383h1> f6329m = new AtomicReference<>((Object) null);

    /* renamed from: n */
    public final Handler f6330n = new C3636f(Looper.getMainLooper());

    /* renamed from: o */
    public final C3324b f6331o;

    public C3392k1(C3381h hVar, C3324b bVar) {
        super(hVar);
        this.f6331o = bVar;
    }

    /* renamed from: p */
    public static final int m8665p(@Nullable C3383h1 h1Var) {
        if (h1Var == null) {
            return -1;
        }
        return h1Var.mo20560a();
    }

    /* renamed from: e */
    public final void mo20577e(int i, int i2, Intent intent) {
        C3383h1 h1Var = this.f6329m.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.f6331o.mo20388g(mo24553b());
                if (g == 0) {
                    mo20585o();
                    return;
                } else if (h1Var != null) {
                    if (h1Var.mo20561b().mo24483P() == 18 && g == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            mo20585o();
            return;
        } else if (i2 == 0) {
            if (h1Var != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                mo20582l(new ConnectionResult(i3, (PendingIntent) null, h1Var.mo20561b().toString()), m8665p(h1Var));
                return;
            }
            return;
        }
        if (h1Var != null) {
            mo20582l(h1Var.mo20561b(), h1Var.mo20560a());
        }
    }

    /* renamed from: f */
    public final void mo20578f(@Nullable Bundle bundle) {
        super.mo20578f(bundle);
        if (bundle != null) {
            this.f6329m.set(bundle.getBoolean("resolving_error", false) ? new C3383h1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: i */
    public final void mo20579i(Bundle bundle) {
        super.mo20579i(bundle);
        C3383h1 h1Var = this.f6329m.get();
        if (h1Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", h1Var.mo20560a());
            bundle.putInt("failed_status", h1Var.mo20561b().mo24483P());
            bundle.putParcelable("failed_resolution", h1Var.mo20561b().mo24485R());
        }
    }

    /* renamed from: j */
    public void mo20580j() {
        super.mo20580j();
        this.f6328l = true;
    }

    /* renamed from: k */
    public void mo20581k() {
        super.mo20581k();
        this.f6328l = false;
    }

    /* renamed from: l */
    public final void mo20582l(ConnectionResult connectionResult, int i) {
        this.f6329m.set((Object) null);
        mo20583m(connectionResult, i);
    }

    /* renamed from: m */
    public abstract void mo20583m(ConnectionResult connectionResult, int i);

    /* renamed from: n */
    public abstract void mo20584n();

    /* renamed from: o */
    public final void mo20585o() {
        this.f6329m.set((Object) null);
        mo20584n();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo20582l(new ConnectionResult(13, (PendingIntent) null), m8665p(this.f6329m.get()));
    }

    /* renamed from: s */
    public final void mo20587s(ConnectionResult connectionResult, int i) {
        C3383h1 h1Var = new C3383h1(connectionResult, i);
        if (this.f6329m.compareAndSet((Object) null, h1Var)) {
            this.f6330n.post(new C3389j1(this, h1Var));
        }
    }
}
