package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.m.y */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5792y implements C5768h0 {

    /* renamed from: a */
    public final Executor f11302a;

    /* renamed from: b */
    public final Object f11303b = new Object();

    /* renamed from: c */
    public C5759d f11304c;

    public C5792y(@NonNull Executor executor, @NonNull C5759d dVar) {
        this.f11302a = executor;
        this.f11304c = dVar;
    }

    /* renamed from: b */
    public final void mo28827b() {
        synchronized (this.f11303b) {
            this.f11304c = null;
        }
    }

    /* renamed from: c */
    public final void mo28828c(@NonNull C5771j jVar) {
        if (jVar.mo28854o()) {
            synchronized (this.f11303b) {
                if (this.f11304c != null) {
                    this.f11302a.execute(new C5791x(this));
                }
            }
        }
    }
}
