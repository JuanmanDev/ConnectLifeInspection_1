package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.m.e0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5762e0 implements C5768h0 {

    /* renamed from: a */
    public final Executor f11255a;

    /* renamed from: b */
    public final Object f11256b = new Object();

    /* renamed from: c */
    public C5765g f11257c;

    public C5762e0(@NonNull Executor executor, @NonNull C5765g gVar) {
        this.f11255a = executor;
        this.f11257c = gVar;
    }

    /* renamed from: b */
    public final void mo28827b() {
        synchronized (this.f11256b) {
            this.f11257c = null;
        }
    }

    /* renamed from: c */
    public final void mo28828c(@NonNull C5771j jVar) {
        if (jVar.mo28856q()) {
            synchronized (this.f11256b) {
                if (this.f11257c != null) {
                    this.f11255a.execute(new C5760d0(this, jVar));
                }
            }
        }
    }
}
