package androidx.camera.core.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@FunctionalInterface
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface AsyncFunction<I, O> {
    C6316e<O> apply(@Nullable I i);
}
