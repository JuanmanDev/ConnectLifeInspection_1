package p040c.p200q.p201a.p264c.p347m;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.m.j */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public abstract class C5771j<TResult> {
    @NonNull
    /* renamed from: a */
    public C5771j<TResult> mo28840a(@NonNull Executor executor, @NonNull C5759d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    /* renamed from: b */
    public C5771j<TResult> mo28841b(@NonNull Activity activity, @NonNull C5761e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: c */
    public C5771j<TResult> mo28842c(@NonNull C5761e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: d */
    public C5771j<TResult> mo28843d(@NonNull Executor executor, @NonNull C5761e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: e */
    public abstract C5771j<TResult> mo28844e(@NonNull C5763f fVar);

    @NonNull
    /* renamed from: f */
    public abstract C5771j<TResult> mo28845f(@NonNull Executor executor, @NonNull C5763f fVar);

    @NonNull
    /* renamed from: g */
    public abstract C5771j<TResult> mo28846g(@NonNull C5765g<? super TResult> gVar);

    @NonNull
    /* renamed from: h */
    public abstract C5771j<TResult> mo28847h(@NonNull Executor executor, @NonNull C5765g<? super TResult> gVar);

    @NonNull
    /* renamed from: i */
    public <TContinuationResult> C5771j<TContinuationResult> mo28848i(@NonNull C5757c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: j */
    public <TContinuationResult> C5771j<TContinuationResult> mo28849j(@NonNull Executor executor, @NonNull C5757c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: k */
    public <TContinuationResult> C5771j<TContinuationResult> mo28850k(@NonNull Executor executor, @NonNull C5757c<TResult, C5771j<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* renamed from: l */
    public abstract Exception mo28851l();

    /* renamed from: m */
    public abstract TResult mo28852m();

    /* renamed from: n */
    public abstract <X extends Throwable> TResult mo28853n(@NonNull Class<X> cls);

    /* renamed from: o */
    public abstract boolean mo28854o();

    /* renamed from: p */
    public abstract boolean mo28855p();

    /* renamed from: q */
    public abstract boolean mo28856q();

    @NonNull
    /* renamed from: r */
    public <TContinuationResult> C5771j<TContinuationResult> mo28857r(@NonNull C5769i<TResult, TContinuationResult> iVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    /* renamed from: s */
    public <TContinuationResult> C5771j<TContinuationResult> mo28858s(@NonNull Executor executor, @NonNull C5769i<TResult, TContinuationResult> iVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
