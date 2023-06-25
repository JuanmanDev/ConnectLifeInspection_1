package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p276d.p288m.C3548a;
import p040c.p200q.p201a.p264c.p294g.p300f.C3656n;

/* renamed from: c.q.a.c.d.j.r1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3506r1 extends C3468g {

    /* renamed from: f */
    public final HashMap f6500f = new HashMap();

    /* renamed from: g */
    public final Context f6501g;

    /* renamed from: h */
    public volatile Handler f6502h;

    /* renamed from: i */
    public final C3503q1 f6503i = new C3503q1(this, (C3500p1) null);

    /* renamed from: j */
    public final C3548a f6504j;

    /* renamed from: k */
    public final long f6505k;

    /* renamed from: l */
    public final long f6506l;

    public C3506r1(Context context, Looper looper) {
        this.f6501g = context.getApplicationContext();
        this.f6502h = new C3656n(looper, this.f6503i);
        this.f6504j = C3548a.m9034b();
        this.f6505k = 5000;
        this.f6506l = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    /* renamed from: d */
    public final void mo20721d(C3494n1 n1Var, ServiceConnection serviceConnection, String str) {
        C3495o.m8909k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6500f) {
            C3497o1 o1Var = (C3497o1) this.f6500f.get(n1Var);
            if (o1Var == null) {
                String n1Var2 = n1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + n1Var2);
            } else if (o1Var.mo20768h(serviceConnection)) {
                o1Var.mo20766f(serviceConnection, str);
                if (o1Var.mo20769i()) {
                    this.f6502h.sendMessageDelayed(this.f6502h.obtainMessage(0, n1Var), this.f6505k);
                }
            } else {
                String n1Var3 = n1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + n1Var3);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo20723f(C3494n1 n1Var, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        boolean j;
        C3495o.m8909k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6500f) {
            C3497o1 o1Var = (C3497o1) this.f6500f.get(n1Var);
            if (o1Var == null) {
                o1Var = new C3497o1(this, n1Var);
                o1Var.mo20764d(serviceConnection, serviceConnection, str);
                o1Var.mo20765e(str, executor);
                this.f6500f.put(n1Var, o1Var);
            } else {
                this.f6502h.removeMessages(0, n1Var);
                if (!o1Var.mo20768h(serviceConnection)) {
                    o1Var.mo20764d(serviceConnection, serviceConnection, str);
                    int a = o1Var.mo20761a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(o1Var.mo20762b(), o1Var.mo20763c());
                    } else if (a == 2) {
                        o1Var.mo20765e(str, executor);
                    }
                } else {
                    String n1Var2 = n1Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + n1Var2);
                }
            }
            j = o1Var.mo20770j();
        }
        return j;
    }
}
