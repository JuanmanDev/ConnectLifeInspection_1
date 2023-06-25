package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.m.c0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5758c0 implements C5768h0 {

    /* renamed from: a */
    public final Executor f11250a;

    /* renamed from: b */
    public final Object f11251b = new Object();

    /* renamed from: c */
    public C5763f f11252c;

    public C5758c0(@NonNull Executor executor, @NonNull C5763f fVar) {
        this.f11250a = executor;
        this.f11252c = fVar;
    }

    /* renamed from: b */
    public final void mo28827b() {
        synchronized (this.f11251b) {
            this.f11252c = null;
        }
    }

    /* renamed from: c */
    public final void mo28828c(@NonNull C5771j jVar) {
        if (!jVar.mo28856q() && !jVar.mo28854o()) {
            synchronized (this.f11251b) {
                if (this.f11252c != null) {
                    this.f11250a.execute(new C5756b0(this, jVar));
                }
            }
        }
    }
}
