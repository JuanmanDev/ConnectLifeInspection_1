package androidx.test.internal.runner.junit4.statement;

import android.os.Looper;
import androidx.test.platform.app.InstrumentationRegistry;
import java.lang.annotation.Annotation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p648m.p668e.p680m.p681d.C9781d;
import p648m.p668e.p680m.p681d.C9785g;

public class UiThreadStatement extends C9785g {
    public static final String TAG = "UiThreadStatement";
    public final C9785g base;
    public final boolean runOnUiThread;

    public UiThreadStatement(C9785g gVar, boolean z) {
        this.base = gVar;
        this.runOnUiThread = z;
    }

    public static boolean hasAnnotation(C9781d dVar, Class<? extends Annotation> cls) {
        return (cls == null || dVar.getAnnotation(cls) == null) ? false : true;
    }

    public static Class<? extends Annotation> loadUiThreadClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        FutureTask futureTask = new FutureTask(runnable, (Object) null);
        InstrumentationRegistry.getInstrumentation().runOnMainSync(futureTask);
        try {
            futureTask.get();
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }

    public static boolean shouldRunOnUiThread(C9781d dVar) {
        Class<? extends Annotation> loadUiThreadClass = loadUiThreadClass("android.test.UiThreadTest");
        if (hasAnnotation(dVar, loadUiThreadClass)) {
            return true;
        }
        Class<? extends Annotation> loadUiThreadClass2 = loadUiThreadClass("androidx.test.annotation.UiThreadTest");
        if (hasAnnotation(dVar, loadUiThreadClass) || hasAnnotation(dVar, loadUiThreadClass2)) {
            return true;
        }
        return false;
    }

    public void evaluate() {
        if (this.runOnUiThread) {
            final AtomicReference atomicReference = new AtomicReference();
            runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        UiThreadStatement.this.base.evaluate();
                    } catch (Throwable th) {
                        atomicReference.set(th);
                    }
                }
            });
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                throw th;
            }
            return;
        }
        this.base.evaluate();
    }

    public boolean isRunOnUiThread() {
        return this.runOnUiThread;
    }
}
