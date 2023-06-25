package androidx.test.internal.runner.junit3;

import android.os.Looper;
import androidx.test.internal.util.AndroidRunnerParams;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p627i.p629b.C9388f;
import p627i.p629b.C9392j;
import p627i.p629b.C9394k;
import p648m.p668e.C9692h;

@C9692h
public class AndroidTestSuite extends DelegatingFilterableTestSuite {
    public static final String TAG = "AndroidTestSuite";
    public final AndroidRunnerParams androidRunnerParams;

    public AndroidTestSuite(Class<?> cls, AndroidRunnerParams androidRunnerParams2) {
        this((C9394k) new NonLeakyTestSuite(cls), androidRunnerParams2);
    }

    private String getStackTraces() {
        StringBuilder sb = new StringBuilder();
        Thread currentThread = Thread.currentThread();
        sb.append(currentThread.toString());
        sb.append(10);
        for (StackTraceElement stackTraceElement : currentThread.getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement.toString());
            sb.append(10);
        }
        sb.append(10);
        Thread thread = Looper.getMainLooper().getThread();
        sb.append(thread.toString());
        sb.append(10);
        for (StackTraceElement stackTraceElement2 : thread.getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement2.toString());
            sb.append(10);
        }
        sb.append(10);
        return sb.toString();
    }

    private void runTestWithTimeout(final C9388f fVar, final AndroidTestResult androidTestResult, long j) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory(this) {
            public Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName(AndroidTestSuite.TAG);
                return newThread;
            }
        });
        C11182 r1 = new Runnable(this) {
            public void run() {
                fVar.run(androidTestResult);
            }
        };
        androidTestResult.setCurrentTimeout(j);
        Future<?> submit = newSingleThreadExecutor.submit(r1);
        newSingleThreadExecutor.shutdown();
        try {
            if (!newSingleThreadExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                newSingleThreadExecutor.shutdownNow();
                if (!newSingleThreadExecutor.awaitTermination(1, TimeUnit.MINUTES)) {
                    try {
                        submit.get(0, TimeUnit.MILLISECONDS);
                    } catch (ExecutionException e) {
                        e.getCause();
                    } catch (TimeoutException unused) {
                    }
                    terminateAllRunnerExecution(new IllegalStateException(String.format("Test timed out after %d milliseconds but execution thread failed to terminate\nDumping instr and main threads:\n%s", new Object[]{Long.valueOf(j), getStackTraces()})));
                }
            }
        } catch (InterruptedException e2) {
            terminateAllRunnerExecution(new IllegalStateException(String.format("Test execution thread got interrupted:\n%s\nDumping instr and main threads:\n%s", new Object[]{e2, getStackTraces()})));
        }
    }

    private void runTestsWithTimeout(long j, AndroidTestResult androidTestResult) {
        int testCount = testCount();
        for (int i = 0; i < testCount; i++) {
            runTestWithTimeout(testAt(i), androidTestResult, j);
        }
    }

    private void terminateAllRunnerExecution(final RuntimeException runtimeException) {
        Thread thread = new Thread(new Runnable(this) {
            public void run() {
                throw runtimeException;
            }
        }, "Terminator");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException unused) {
        }
    }

    public void run(C9392j jVar) {
        AndroidTestResult androidTestResult = new AndroidTestResult(this.androidRunnerParams.getBundle(), this.androidRunnerParams.getInstrumentation(), jVar);
        long perTestTimeout = this.androidRunnerParams.getPerTestTimeout();
        if (perTestTimeout > 0) {
            runTestsWithTimeout(perTestTimeout, androidTestResult);
        } else {
            super.run(androidTestResult);
        }
    }

    public AndroidTestSuite(C9394k kVar, AndroidRunnerParams androidRunnerParams2) {
        super(kVar);
        this.androidRunnerParams = androidRunnerParams2;
    }
}
