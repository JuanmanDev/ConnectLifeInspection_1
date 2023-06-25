package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.m.u */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5788u implements C5768h0 {

    /* renamed from: a */
    public final Executor f11293a;

    /* renamed from: b */
    public final C5757c f11294b;

    /* renamed from: c */
    public final C5780n0 f11295c;

    public C5788u(@NonNull Executor executor, @NonNull C5757c cVar, @NonNull C5780n0 n0Var) {
        this.f11293a = executor;
        this.f11294b = cVar;
        this.f11295c = n0Var;
    }

    /* renamed from: b */
    public final void mo28827b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo28828c(@NonNull C5771j jVar) {
        this.f11293a.execute(new C5787t(this, jVar));
    }
}
