package androidx.camera.core.impl.utils.futures.internal;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class InternalFutureFailureAccess {
    public abstract Throwable tryInternalFastPathGetFailure();
}
