package retrofit2;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p692o.C9855b;
import p692o.C9858d;
import p692o.C9909p;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo47991d2 = {"retrofit2/KotlinExtensions$await$4$2", "Lo/d;", "Lretrofit2/Call;", "call", "", "t", "", "onFailure", "(Lretrofit2/Call;Ljava/lang/Throwable;)V", "Lretrofit2/Response;", "response", "onResponse", "(Lretrofit2/Call;Lretrofit2/Response;)V", "retrofit"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions$await$4$2 implements C9858d<T> {
    public final /* synthetic */ CancellableContinuation $continuation;

    public KotlinExtensions$await$4$2(CancellableContinuation cancellableContinuation) {
        this.$continuation = cancellableContinuation;
    }

    public void onFailure(@NotNull C9855b<T> bVar, @NotNull Throwable th) {
        CancellableContinuation cancellableContinuation = this.$continuation;
        Result.Companion companion = Result.Companion;
        cancellableContinuation.resumeWith(Result.m27299constructorimpl(ResultKt.createFailure(th)));
    }

    public void onResponse(@NotNull C9855b<T> bVar, @NotNull C9909p<T> pVar) {
        if (pVar.mo51319d()) {
            CancellableContinuation cancellableContinuation = this.$continuation;
            T a = pVar.mo51317a();
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m27299constructorimpl(a));
            return;
        }
        CancellableContinuation cancellableContinuation2 = this.$continuation;
        HttpException httpException = new HttpException(pVar);
        Result.Companion companion2 = Result.Companion;
        cancellableContinuation2.resumeWith(Result.m27299constructorimpl(ResultKt.createFailure(httpException)));
    }
}
