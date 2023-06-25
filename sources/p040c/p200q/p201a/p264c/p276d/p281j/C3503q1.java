package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import androidx.core.p028os.EnvironmentCompat;

/* renamed from: c.q.a.c.d.j.q1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3503q1 implements Handler.Callback {

    /* renamed from: e */
    public final /* synthetic */ C3506r1 f6498e;

    public /* synthetic */ C3503q1(C3506r1 r1Var, C3500p1 p1Var) {
        this.f6498e = r1Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f6498e.f6500f) {
                C3494n1 n1Var = (C3494n1) message.obj;
                C3497o1 o1Var = (C3497o1) this.f6498e.f6500f.get(n1Var);
                if (o1Var != null && o1Var.mo20769i()) {
                    if (o1Var.mo20770j()) {
                        o1Var.mo20767g("GmsClientSupervisor");
                    }
                    this.f6498e.f6500f.remove(n1Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f6498e.f6500f) {
                C3494n1 n1Var2 = (C3494n1) message.obj;
                C3497o1 o1Var2 = (C3497o1) this.f6498e.f6500f.get(n1Var2);
                if (o1Var2 != null && o1Var2.mo20761a() == 3) {
                    String valueOf = String.valueOf(n1Var2);
                    new Exception();
                    "Timeout waiting for ServiceConnection callback " + valueOf;
                    ComponentName b = o1Var2.mo20762b();
                    if (b == null) {
                        b = n1Var2.mo20753b();
                    }
                    if (b == null) {
                        String d = n1Var2.mo20755d();
                        C3495o.m8908j(d);
                        b = new ComponentName(d, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    o1Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
