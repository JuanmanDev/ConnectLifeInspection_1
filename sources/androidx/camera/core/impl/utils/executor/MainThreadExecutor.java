package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

public final class MainThreadExecutor {
    public static volatile ScheduledExecutorService sInstance;

    public static ScheduledExecutorService getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (MainThreadExecutor.class) {
            if (sInstance == null) {
                sInstance = new HandlerScheduledExecutorService(new Handler(Looper.getMainLooper()));
            }
        }
        return sInstance;
    }
}
