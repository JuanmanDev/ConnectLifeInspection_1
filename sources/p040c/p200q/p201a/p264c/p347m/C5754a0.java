package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.m.a0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5754a0 implements C5768h0 {

    /* renamed from: a */
    public final Executor f11244a;

    /* renamed from: b */
    public final Object f11245b = new Object();

    /* renamed from: c */
    public C5761e f11246c;

    public C5754a0(@NonNull Executor executor, @NonNull C5761e eVar) {
        this.f11244a = executor;
        this.f11246c = eVar;
    }

    /* renamed from: b */
    public final void mo28827b() {
        synchronized (this.f11245b) {
            this.f11246c = null;
        }
    }

    /* renamed from: c */
    public final void mo28828c(@NonNull C5771j jVar) {
        synchronized (this.f11245b) {
            if (this.f11246c != null) {
                this.f11244a.execute(new C5793z(this, jVar));
            }
        }
    }
}
