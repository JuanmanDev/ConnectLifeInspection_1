package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.core.p028os.HandlerCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MainThreadAsyncHandler {
    public static volatile Handler sHandler;

    public static Handler getInstance() {
        if (sHandler != null) {
            return sHandler;
        }
        synchronized (MainThreadAsyncHandler.class) {
            if (sHandler == null) {
                sHandler = HandlerCompat.createAsync(Looper.getMainLooper());
            }
        }
        return sHandler;
    }
}
