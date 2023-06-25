package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.m.w */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5790w<TResult, TContinuationResult> implements C5765g<TContinuationResult>, C5763f, C5759d, C5768h0 {

    /* renamed from: a */
    public final Executor f11298a;

    /* renamed from: b */
    public final C5757c f11299b;

    /* renamed from: c */
    public final C5780n0 f11300c;

    public C5790w(@NonNull Executor executor, @NonNull C5757c cVar, @NonNull C5780n0 n0Var) {
        this.f11298a = executor;
        this.f11299b = cVar;
        this.f11300c = n0Var;
    }

    /* renamed from: a */
    public final void mo28832a() {
        this.f11300c.mo28871v();
    }

    /* renamed from: b */
    public final void mo28827b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo28828c(@NonNull C5771j jVar) {
        this.f11298a.execute(new C5789v(this, jVar));
    }

    public final void onFailure(@NonNull Exception exc) {
        this.f11300c.mo28869t(exc);
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f11300c.mo28870u(tcontinuationresult);
    }
}
