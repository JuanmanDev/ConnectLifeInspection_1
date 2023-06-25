package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.m.g0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5766g0<TResult, TContinuationResult> implements C5765g<TContinuationResult>, C5763f, C5759d, C5768h0 {

    /* renamed from: a */
    public final Executor f11260a;

    /* renamed from: b */
    public final C5769i f11261b;

    /* renamed from: c */
    public final C5780n0 f11262c;

    public C5766g0(@NonNull Executor executor, @NonNull C5769i iVar, @NonNull C5780n0 n0Var) {
        this.f11260a = executor;
        this.f11261b = iVar;
        this.f11262c = n0Var;
    }

    /* renamed from: a */
    public final void mo28832a() {
        this.f11262c.mo28871v();
    }

    /* renamed from: b */
    public final void mo28827b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo28828c(@NonNull C5771j jVar) {
        this.f11260a.execute(new C5764f0(this, jVar));
    }

    public final void onFailure(@NonNull Exception exc) {
        this.f11262c.mo28869t(exc);
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f11262c.mo28870u(tcontinuationresult);
    }
}
