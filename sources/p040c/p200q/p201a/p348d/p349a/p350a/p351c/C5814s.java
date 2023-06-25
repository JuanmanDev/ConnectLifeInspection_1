package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: c.q.a.d.a.a.c.s */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5814s implements ServiceConnection {

    /* renamed from: e */
    public final /* synthetic */ C5815t f11320e;

    public /* synthetic */ C5814s(C5815t tVar, C5813r rVar) {
        this.f11320e = tVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f11320e.f11323b.mo28898d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C5815t tVar = this.f11320e;
        tVar.mo28908c().post(new C5811p(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11320e.f11323b.mo28898d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C5815t tVar = this.f11320e;
        tVar.mo28908c().post(new C5812q(this));
    }
}
