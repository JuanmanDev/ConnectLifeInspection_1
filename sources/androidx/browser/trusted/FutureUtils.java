package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public class FutureUtils {
    @NonNull
    public static <T> C6316e<T> immediateFailedFuture(@NonNull Throwable th) {
        ResolvableFuture create = ResolvableFuture.create();
        create.setException(th);
        return create;
    }
}
