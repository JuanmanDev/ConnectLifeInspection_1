package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: c.q.a.c.m.p */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5783p<T> implements C5784q<T> {

    /* renamed from: a */
    public final CountDownLatch f11281a = new CountDownLatch(1);

    public /* synthetic */ C5783p(C5781o oVar) {
    }

    /* renamed from: a */
    public final void mo28832a() {
        this.f11281a.countDown();
    }

    /* renamed from: b */
    public final void mo28877b() {
        this.f11281a.await();
    }

    /* renamed from: c */
    public final boolean mo28878c(long j, TimeUnit timeUnit) {
        return this.f11281a.await(j, timeUnit);
    }

    public final void onFailure(@NonNull Exception exc) {
        this.f11281a.countDown();
    }

    public final void onSuccess(T t) {
        this.f11281a.countDown();
    }
}
