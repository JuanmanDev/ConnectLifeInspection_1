package p040c.p200q.p363c.p367l.p368h;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p294g.p333g.C4283aa;

/* renamed from: c.q.c.l.h.u */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6398u implements Executor {

    /* renamed from: l */
    public static final C6398u f12076l = new C6398u();

    /* renamed from: e */
    public final Handler f12077e = new C4283aa(Looper.getMainLooper());

    /* renamed from: a */
    public static C6398u m17941a() {
        return f12076l;
    }

    public final void execute(Runnable runnable) {
        this.f12077e.post(runnable);
    }
}
