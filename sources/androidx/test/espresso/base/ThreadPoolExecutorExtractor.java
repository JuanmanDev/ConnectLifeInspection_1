package androidx.test.espresso.base;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.test.espresso.core.internal.deps.guava.base.Optional;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public final class ThreadPoolExecutorExtractor {
    public static final String ASYNC_TASK_CLASS_NAME = "android.os.AsyncTask";
    public static final Callable<Optional<ThreadPoolExecutor>> LEGACY_ASYNC_TASK_EXECUTOR = new Callable<Optional<ThreadPoolExecutor>>() {
        public Optional<ThreadPoolExecutor> call() {
            try {
                Field declaredField = ((Class) ThreadPoolExecutorExtractor.LOAD_ASYNC_TASK_CLASS.call()).getDeclaredField(ThreadPoolExecutorExtractor.LEGACY_ASYNC_TASK_FIELD_NAME);
                declaredField.setAccessible(true);
                return Optional.m143of((ThreadPoolExecutor) declaredField.get((Object) null));
            } catch (ClassNotFoundException unused) {
                return Optional.absent();
            } catch (NoSuchFieldException unused2) {
                return Optional.absent();
            }
        }
    };
    public static final String LEGACY_ASYNC_TASK_FIELD_NAME = "sExecutor";
    public static final Callable<Class<?>> LOAD_ASYNC_TASK_CLASS = new Callable<Class<?>>() {
        public Class<?> call() {
            return Class.forName(ThreadPoolExecutorExtractor.ASYNC_TASK_CLASS_NAME);
        }
    };
    public static final String MODERN_ASYNC_TASK_CLASS_NAME = "androidx.loader.content.ModernAsyncTask";
    public static final Callable<Optional<ThreadPoolExecutor>> MODERN_ASYNC_TASK_EXTRACTOR = new Callable<Optional<ThreadPoolExecutor>>() {
        public Optional<ThreadPoolExecutor> call() {
            try {
                return Optional.m143of((ThreadPoolExecutor) Class.forName(ThreadPoolExecutorExtractor.MODERN_ASYNC_TASK_CLASS_NAME).getField(ThreadPoolExecutorExtractor.MODERN_ASYNC_TASK_FIELD_NAME).get((Object) null));
            } catch (ClassNotFoundException unused) {
                return Optional.absent();
            } catch (NoSuchFieldException unused2) {
                return Optional.absent();
            }
        }
    };
    public static final String MODERN_ASYNC_TASK_FIELD_NAME = "THREAD_POOL_EXECUTOR";
    public static final Callable<Optional<ThreadPoolExecutor>> POST_HONEYCOMB_ASYNC_TASK_EXECUTOR = new Callable<Optional<ThreadPoolExecutor>>() {
        public Optional<ThreadPoolExecutor> call() {
            try {
                return Optional.m143of((ThreadPoolExecutor) ((Class) ThreadPoolExecutorExtractor.LOAD_ASYNC_TASK_CLASS.call()).getField(ThreadPoolExecutorExtractor.MODERN_ASYNC_TASK_FIELD_NAME).get((Object) null));
            } catch (ClassNotFoundException unused) {
                return Optional.absent();
            } catch (NoSuchFieldException unused2) {
                return Optional.absent();
            }
        }
    };
    public final Handler mainHandler;

    public ThreadPoolExecutorExtractor(Looper looper) {
        this.mainHandler = new Handler(looper);
    }

    private <T> FutureTask<T> runOnMainThread(final FutureTask<T> futureTask) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.mainHandler.post(new Runnable(this) {
                public void run() {
                    try {
                        futureTask.run();
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                if (!futureTask.isDone()) {
                    throw new RuntimeException("Interrupted while waiting for task to complete.", e);
                }
            }
        } else {
            futureTask.run();
        }
        return futureTask;
    }

    public ThreadPoolExecutor getAsyncTaskThreadPool() {
        FutureTask futureTask;
        if (Build.VERSION.SDK_INT < 11) {
            futureTask = new FutureTask(LEGACY_ASYNC_TASK_EXECUTOR);
        } else {
            futureTask = new FutureTask(POST_HONEYCOMB_ASYNC_TASK_EXECUTOR);
        }
        try {
            return (ThreadPoolExecutor) ((Optional) runOnMainThread(futureTask).get()).get();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted while trying to get the async task executor!", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    public Optional<ThreadPoolExecutor> getCompatAsyncTaskThreadPool() {
        try {
            return (Optional) runOnMainThread(new FutureTask(MODERN_ASYNC_TASK_EXTRACTOR)).get();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted while trying to get the compat async executor!", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }
}
