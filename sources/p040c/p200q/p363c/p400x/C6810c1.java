package p040c.p200q.p363c.p400x;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p363c.p400x.C6815d1;

/* renamed from: c.q.c.x.c1 */
/* compiled from: WithinAppServiceBinder */
public class C6810c1 extends Binder {

    /* renamed from: e */
    public final C6811a f13042e;

    /* renamed from: c.q.c.x.c1$a */
    /* compiled from: WithinAppServiceBinder */
    public interface C6811a {
        /* renamed from: a */
        C5771j<Void> mo31584a(Intent intent);
    }

    public C6810c1(C6811a aVar) {
        this.f13042e = aVar;
    }

    /* renamed from: b */
    public void mo31583b(C6815d1.C6816a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
            this.f13042e.mo31584a(aVar.f13055a).mo28843d(C6867y.f13147e, new C6859v(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
