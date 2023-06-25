package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class JsReplyProxy {
    public abstract void postMessage(@NonNull String str);
}
