package p040c.p200q.p201a.p264c.p347m;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p294g.p337k.C5383a;

/* renamed from: c.q.a.c.m.l0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5776l0 implements Executor {

    /* renamed from: e */
    public final Handler f11270e = new C5383a(Looper.getMainLooper());

    public final void execute(@NonNull Runnable runnable) {
        this.f11270e.post(runnable);
    }
}
