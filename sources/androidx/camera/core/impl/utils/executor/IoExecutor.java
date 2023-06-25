package androidx.camera.core.impl.utils.executor;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class IoExecutor implements Executor {
    public static volatile Executor sExecutor;
    public final ExecutorService mIoService = Executors.newFixedThreadPool(2, new ThreadFactory() {
        public static final String THREAD_NAME_STEM = "CameraX-camerax_io_%d";
        public final AtomicInteger mThreadId = new AtomicInteger(0);

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, THREAD_NAME_STEM, new Object[]{Integer.valueOf(this.mThreadId.getAndIncrement())}));
            return thread;
        }
    });

    public static Executor getInstance() {
        if (sExecutor != null) {
            return sExecutor;
        }
        synchronized (IoExecutor.class) {
            if (sExecutor == null) {
                sExecutor = new IoExecutor();
            }
        }
        return sExecutor;
    }

    public void execute(@NonNull Runnable runnable) {
        this.mIoService.execute(runnable);
    }
}