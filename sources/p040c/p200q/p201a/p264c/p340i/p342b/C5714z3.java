package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import p040c.p200q.p201a.p264c.p294g.p335i.C5241r0;
import p040c.p200q.p201a.p264c.p294g.p335i.C5256s0;

/* renamed from: c.q.a.c.i.b.z3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5714z3 implements ServiceConnection {

    /* renamed from: e */
    public final String f11188e;

    /* renamed from: l */
    public final /* synthetic */ C5420a4 f11189l;

    public C5714z3(C5420a4 a4Var, String str) {
        this.f11189l = a4Var;
        this.f11188e = str;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                C5256s0 e = C5241r0.m14700e(iBinder);
                if (e == null) {
                    this.f11189l.f10315a.mo28487b().mo28344w().mo28259a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f11189l.f10315a.mo28487b().mo28343v().mo28259a("Install Referrer Service connected");
                this.f11189l.f10315a.mo28486a().mo28540z(new C5703y3(this, e, this));
            } catch (RuntimeException e2) {
                this.f11189l.f10315a.mo28487b().mo28344w().mo28260b("Exception occurred while calling Install Referrer API", e2);
            }
        } else {
            this.f11189l.f10315a.mo28487b().mo28344w().mo28259a("Install Referrer connection returned with null binder");
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11189l.f10315a.mo28487b().mo28343v().mo28259a("Install Referrer Service disconnected");
    }
}
