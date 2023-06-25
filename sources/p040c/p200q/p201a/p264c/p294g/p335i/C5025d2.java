package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: c.q.a.c.g.i.d2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public final class C5025d2 implements ThreadFactory {

    /* renamed from: e */
    public final ThreadFactory f9854e = Executors.defaultThreadFactory();

    public C5025d2(C5303v2 v2Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f9854e.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
