package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.q.a.c.d.j.f1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3467f1 implements ServiceConnection {

    /* renamed from: e */
    public final int f6456e;

    /* renamed from: l */
    public final /* synthetic */ C3453d f6457l;

    public C3467f1(C3453d dVar, int i) {
        this.f6457l = dVar;
        this.f6456e = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3481k kVar;
        C3453d dVar = this.f6457l;
        if (iBinder == null) {
            C3453d.m8766b0(dVar, 16);
            return;
        }
        synchronized (dVar.f6422r) {
            C3453d dVar2 = this.f6457l;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C3481k)) {
                kVar = new C3516u0(iBinder);
            } else {
                kVar = (C3481k) queryLocalInterface;
            }
            dVar2.f6423s = kVar;
        }
        this.f6457l.mo20665c0(0, (Bundle) null, this.f6456e);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6457l.f6422r) {
            this.f6457l.f6423s = null;
        }
        Handler handler = this.f6457l.f6420p;
        handler.sendMessage(handler.obtainMessage(6, this.f6456e, 1));
    }
}
