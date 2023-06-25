package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.d.g.l.y */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class C3425y implements Executor {

    /* renamed from: e */
    public final /* synthetic */ Handler f6387e;

    public /* synthetic */ C3425y(Handler handler) {
        this.f6387e = handler;
    }

    public final void execute(Runnable runnable) {
        this.f6387e.post(runnable);
    }
}
