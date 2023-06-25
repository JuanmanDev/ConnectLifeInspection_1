package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.m.m */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5777m {
    /* renamed from: a */
    public static <TResult> TResult m16409a(@NonNull C5771j<TResult> jVar) {
        C3495o.m8906h();
        C3495o.m8909k(jVar, "Task must not be null");
        if (jVar.mo28855p()) {
            return m16417i(jVar);
        }
        C5783p pVar = new C5783p((C5781o) null);
        m16418j(jVar, pVar);
        pVar.mo28877b();
        return m16417i(jVar);
    }

    /* renamed from: b */
    public static <TResult> TResult m16410b(@NonNull C5771j<TResult> jVar, long j, @NonNull TimeUnit timeUnit) {
        C3495o.m8906h();
        C3495o.m8909k(jVar, "Task must not be null");
        C3495o.m8909k(timeUnit, "TimeUnit must not be null");
        if (jVar.mo28855p()) {
            return m16417i(jVar);
        }
        C5783p pVar = new C5783p((C5781o) null);
        m16418j(jVar, pVar);
        if (pVar.mo28878c(j, timeUnit)) {
            return m16417i(jVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    public static <TResult> C5771j<TResult> m16411c(@NonNull Callable<TResult> callable) {
        return m16412d(C5775l.f11268a, callable);
    }

    @NonNull
    @Deprecated
    /* renamed from: d */
    public static <TResult> C5771j<TResult> m16412d(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        C3495o.m8909k(executor, "Executor must not be null");
        C3495o.m8909k(callable, "Callback must not be null");
        C5780n0 n0Var = new C5780n0();
        executor.execute(new C5782o0(n0Var, callable));
        return n0Var;
    }

    @NonNull
    /* renamed from: e */
    public static <TResult> C5771j<TResult> m16413e(@NonNull Exception exc) {
        C5780n0 n0Var = new C5780n0();
        n0Var.mo28869t(exc);
        return n0Var;
    }

    @NonNull
    /* renamed from: f */
    public static <TResult> C5771j<TResult> m16414f(TResult tresult) {
        C5780n0 n0Var = new C5780n0();
        n0Var.mo28870u(tresult);
        return n0Var;
    }

    @NonNull
    /* renamed from: g */
    public static C5771j<Void> m16415g(@Nullable Collection<? extends C5771j<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m16414f((Object) null);
        }
        for (C5771j jVar : collection) {
            if (jVar == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C5780n0 n0Var = new C5780n0();
        C5785r rVar = new C5785r(collection.size(), n0Var);
        for (C5771j j : collection) {
            m16418j(j, rVar);
        }
        return n0Var;
    }

    @NonNull
    /* renamed from: h */
    public static C5771j<Void> m16416h(@Nullable C5771j<?>... jVarArr) {
        if (jVarArr == null || jVarArr.length == 0) {
            return m16414f((Object) null);
        }
        return m16415g(Arrays.asList(jVarArr));
    }

    /* renamed from: i */
    public static Object m16417i(@NonNull C5771j jVar) {
        if (jVar.mo28856q()) {
            return jVar.mo28852m();
        }
        if (jVar.mo28854o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(jVar.mo28851l());
    }

    /* renamed from: j */
    public static void m16418j(C5771j jVar, C5784q qVar) {
        jVar.mo28847h(C5775l.f11269b, qVar);
        jVar.mo28845f(C5775l.f11269b, qVar);
        jVar.mo28840a(C5775l.f11269b, qVar);
    }
}
