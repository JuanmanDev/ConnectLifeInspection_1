package androidx.camera.core.impl.utils.executor;

import java.util.concurrent.Executor;

public final class DirectExecutor implements Executor {
    public static volatile DirectExecutor sDirectExecutor;

    public static Executor getInstance() {
        if (sDirectExecutor != null) {
            return sDirectExecutor;
        }
        synchronized (DirectExecutor.class) {
            if (sDirectExecutor == null) {
                sDirectExecutor = new DirectExecutor();
            }
        }
        return sDirectExecutor;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
