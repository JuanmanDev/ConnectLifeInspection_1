package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.q3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5611q3 extends BroadcastReceiver {

    /* renamed from: a */
    public final C5709y9 f10762a;

    /* renamed from: b */
    public boolean f10763b;

    /* renamed from: c */
    public boolean f10764c;

    static {
        Class<C5611q3> cls = C5611q3.class;
    }

    public C5611q3(C5709y9 y9Var) {
        C3495o.m8908j(y9Var);
        this.f10762a = y9Var;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo28530b() {
        this.f10762a.mo28744g();
        this.f10762a.mo28486a().mo28029h();
        if (!this.f10763b) {
            this.f10762a.mo28490f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f10764c = this.f10762a.mo28736X().mo28499m();
            this.f10762a.mo28487b().mo28343v().mo28260b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10764c));
            this.f10763b = true;
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo28531c() {
        this.f10762a.mo28744g();
        this.f10762a.mo28486a().mo28029h();
        this.f10762a.mo28486a().mo28029h();
        if (this.f10763b) {
            this.f10762a.mo28487b().mo28343v().mo28259a("Unregistering connectivity change receiver");
            this.f10763b = false;
            this.f10764c = false;
            try {
                this.f10762a.mo28490f().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f10762a.mo28487b().mo28339r().mo28260b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        this.f10762a.mo28744g();
        String action = intent.getAction();
        this.f10762a.mo28487b().mo28343v().mo28260b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m = this.f10762a.mo28736X().mo28499m();
            if (this.f10764c != m) {
                this.f10764c = m;
                this.f10762a.mo28486a().mo28540z(new C5599p3(this, m));
                return;
            }
            return;
        }
        this.f10762a.mo28487b().mo28344w().mo28260b("NetworkBroadcastReceiver received unknown action", action);
    }
}
