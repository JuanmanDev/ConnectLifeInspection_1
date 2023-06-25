package p040c.p200q.p201a.p264c.p347m;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.m.n0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5780n0<TResult> extends C5771j<TResult> {

    /* renamed from: a */
    public final Object f11273a = new Object();

    /* renamed from: b */
    public final C5770i0 f11274b = new C5770i0();

    /* renamed from: c */
    public boolean f11275c;

    /* renamed from: d */
    public volatile boolean f11276d;
    @Nullable

    /* renamed from: e */
    public Object f11277e;

    /* renamed from: f */
    public Exception f11278f;

    /* renamed from: A */
    public final void mo28867A() {
        if (this.f11275c) {
            throw DuplicateTaskCompletionException.m22041of(this);
        }
    }

    /* renamed from: B */
    public final void mo28868B() {
        synchronized (this.f11273a) {
            if (this.f11275c) {
                this.f11274b.mo28839b(this);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final C5771j<TResult> mo28840a(@NonNull Executor executor, @NonNull C5759d dVar) {
        this.f11274b.mo28838a(new C5792y(executor, dVar));
        mo28868B();
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final C5771j<TResult> mo28841b(@NonNull Activity activity, @NonNull C5761e<TResult> eVar) {
        C5754a0 a0Var = new C5754a0(C5775l.f11268a, eVar);
        this.f11274b.mo28838a(a0Var);
        C5778m0.m16419l(activity).mo28866m(a0Var);
        mo28868B();
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final C5771j<TResult> mo28842c(@NonNull C5761e<TResult> eVar) {
        this.f11274b.mo28838a(new C5754a0(C5775l.f11268a, eVar));
        mo28868B();
        return this;
    }

    @NonNull
    /* renamed from: d */
    public final C5771j<TResult> mo28843d(@NonNull Executor executor, @NonNull C5761e<TResult> eVar) {
        this.f11274b.mo28838a(new C5754a0(executor, eVar));
        mo28868B();
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final C5771j<TResult> mo28844e(@NonNull C5763f fVar) {
        mo28845f(C5775l.f11268a, fVar);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final C5771j<TResult> mo28845f(@NonNull Executor executor, @NonNull C5763f fVar) {
        this.f11274b.mo28838a(new C5758c0(executor, fVar));
        mo28868B();
        return this;
    }

    @NonNull
    /* renamed from: g */
    public final C5771j<TResult> mo28846g(@NonNull C5765g<? super TResult> gVar) {
        mo28847h(C5775l.f11268a, gVar);
        return this;
    }

    @NonNull
    /* renamed from: h */
    public final C5771j<TResult> mo28847h(@NonNull Executor executor, @NonNull C5765g<? super TResult> gVar) {
        this.f11274b.mo28838a(new C5762e0(executor, gVar));
        mo28868B();
        return this;
    }

    @NonNull
    /* renamed from: i */
    public final <TContinuationResult> C5771j<TContinuationResult> mo28848i(@NonNull C5757c<TResult, TContinuationResult> cVar) {
        return mo28849j(C5775l.f11268a, cVar);
    }

    @NonNull
    /* renamed from: j */
    public final <TContinuationResult> C5771j<TContinuationResult> mo28849j(@NonNull Executor executor, @NonNull C5757c<TResult, TContinuationResult> cVar) {
        C5780n0 n0Var = new C5780n0();
        this.f11274b.mo28838a(new C5788u(executor, cVar, n0Var));
        mo28868B();
        return n0Var;
    }

    @NonNull
    /* renamed from: k */
    public final <TContinuationResult> C5771j<TContinuationResult> mo28850k(@NonNull Executor executor, @NonNull C5757c<TResult, C5771j<TContinuationResult>> cVar) {
        C5780n0 n0Var = new C5780n0();
        this.f11274b.mo28838a(new C5790w(executor, cVar, n0Var));
        mo28868B();
        return n0Var;
    }

    @Nullable
    /* renamed from: l */
    public final Exception mo28851l() {
        Exception exc;
        synchronized (this.f11273a) {
            exc = this.f11278f;
        }
        return exc;
    }

    /* renamed from: m */
    public final TResult mo28852m() {
        TResult tresult;
        synchronized (this.f11273a) {
            mo28874y();
            mo28875z();
            Exception exc = this.f11278f;
            if (exc == null) {
                tresult = this.f11277e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    /* renamed from: n */
    public final <X extends Throwable> TResult mo28853n(@NonNull Class<X> cls) {
        TResult tresult;
        synchronized (this.f11273a) {
            mo28874y();
            mo28875z();
            if (!cls.isInstance(this.f11278f)) {
                Exception exc = this.f11278f;
                if (exc == null) {
                    tresult = this.f11277e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f11278f));
            }
        }
        return tresult;
    }

    /* renamed from: o */
    public final boolean mo28854o() {
        return this.f11276d;
    }

    /* renamed from: p */
    public final boolean mo28855p() {
        boolean z;
        synchronized (this.f11273a) {
            z = this.f11275c;
        }
        return z;
    }

    /* renamed from: q */
    public final boolean mo28856q() {
        boolean z;
        synchronized (this.f11273a) {
            z = false;
            if (this.f11275c && !this.f11276d && this.f11278f == null) {
                z = true;
            }
        }
        return z;
    }

    @NonNull
    /* renamed from: r */
    public final <TContinuationResult> C5771j<TContinuationResult> mo28857r(@NonNull C5769i<TResult, TContinuationResult> iVar) {
        Executor executor = C5775l.f11268a;
        C5780n0 n0Var = new C5780n0();
        this.f11274b.mo28838a(new C5766g0(executor, iVar, n0Var));
        mo28868B();
        return n0Var;
    }

    @NonNull
    /* renamed from: s */
    public final <TContinuationResult> C5771j<TContinuationResult> mo28858s(Executor executor, C5769i<TResult, TContinuationResult> iVar) {
        C5780n0 n0Var = new C5780n0();
        this.f11274b.mo28838a(new C5766g0(executor, iVar, n0Var));
        mo28868B();
        return n0Var;
    }

    /* renamed from: t */
    public final void mo28869t(@NonNull Exception exc) {
        C3495o.m8909k(exc, "Exception must not be null");
        synchronized (this.f11273a) {
            mo28867A();
            this.f11275c = true;
            this.f11278f = exc;
        }
        this.f11274b.mo28839b(this);
    }

    /* renamed from: u */
    public final void mo28870u(@Nullable Object obj) {
        synchronized (this.f11273a) {
            mo28867A();
            this.f11275c = true;
            this.f11277e = obj;
        }
        this.f11274b.mo28839b(this);
    }

    /* renamed from: v */
    public final boolean mo28871v() {
        synchronized (this.f11273a) {
            if (this.f11275c) {
                return false;
            }
            this.f11275c = true;
            this.f11276d = true;
            this.f11274b.mo28839b(this);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo28872w(@NonNull Exception exc) {
        C3495o.m8909k(exc, "Exception must not be null");
        synchronized (this.f11273a) {
            if (this.f11275c) {
                return false;
            }
            this.f11275c = true;
            this.f11278f = exc;
            this.f11274b.mo28839b(this);
            return true;
        }
    }

    /* renamed from: x */
    public final boolean mo28873x(@Nullable Object obj) {
        synchronized (this.f11273a) {
            if (this.f11275c) {
                return false;
            }
            this.f11275c = true;
            this.f11277e = obj;
            this.f11274b.mo28839b(this);
            return true;
        }
    }

    /* renamed from: y */
    public final void mo28874y() {
        C3495o.m8912n(this.f11275c, "Task is not yet complete");
    }

    /* renamed from: z */
    public final void mo28875z() {
        if (this.f11276d) {
            throw new CancellationException("Task is already canceled.");
        }
    }
}
