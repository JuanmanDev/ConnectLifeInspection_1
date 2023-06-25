package androidx.test.runner.screenshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.test.InstrumentationRegistry;
import androidx.test.annotation.Beta;
import androidx.test.internal.util.Checks;
import androidx.test.runner.screenshot.TakeScreenshotCallable;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Beta
public final class Screenshot {
    public static int androidRuntimeVersion = Build.VERSION.SDK_INT;
    public static Set<ScreenCaptureProcessor> screenCaptureProcessorSet = new HashSet();
    public static TakeScreenshotCallable.Factory takeScreenshotCallableFactory = new TakeScreenshotCallable.Factory();
    public static UiAutomationWrapper uiWrapper = new UiAutomationWrapper();

    public static final class ScreenShotException extends RuntimeException {
        public ScreenShotException(Throwable th) {
            super(th);
        }
    }

    public static void addScreenCaptureProcessors(Set<ScreenCaptureProcessor> set) {
        screenCaptureProcessorSet.addAll(set);
    }

    public static ScreenCapture capture() {
        try {
            return captureImpl((View) null);
        } catch (NullPointerException e) {
            throw new IllegalStateException(e);
        } catch (IOException e2) {
            throw new ScreenShotException(e2);
        } catch (InterruptedException e3) {
            throw new ScreenShotException(e3);
        } catch (ExecutionException e4) {
            throw new ScreenShotException(e4);
        }
    }

    public static ScreenCapture captureImpl(View view) {
        Bitmap bitmap;
        if (view != null || androidRuntimeVersion < 18) {
            bitmap = captureViewBasedImpl(view);
        } else {
            bitmap = captureUiAutomatorImpl();
        }
        return new ScreenCapture(bitmap).setProcessors(screenCaptureProcessorSet);
    }

    public static Bitmap captureUiAutomatorImpl() {
        return uiWrapper.takeScreenshot();
    }

    public static Bitmap captureViewBasedImpl(@NonNull View view) {
        Checks.checkNotNull(view, "Taking view based screenshot requires using either takeScreenshot(view) or takeScreenshot(activity) where view and activity are non-null.");
        FutureTask futureTask = new FutureTask(takeScreenshotCallableFactory.create(view));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            futureTask.run();
        } else {
            InstrumentationRegistry.getInstrumentation().runOnMainSync(futureTask);
        }
        return (Bitmap) futureTask.get();
    }

    @VisibleForTesting
    public static void setAndroidRuntimeVersion(int i) {
        androidRuntimeVersion = i;
    }

    public static void setScreenshotProcessors(Set<ScreenCaptureProcessor> set) {
        screenCaptureProcessorSet = set;
    }

    @VisibleForTesting
    public static void setTakeScreenshotCallableFactory(TakeScreenshotCallable.Factory factory) {
        takeScreenshotCallableFactory = factory;
    }

    @VisibleForTesting
    public static void setUiAutomationWrapper(UiAutomationWrapper uiAutomationWrapper) {
        uiWrapper = uiAutomationWrapper;
    }

    public static ScreenCapture capture(@NonNull Activity activity) {
        Checks.checkNotNull(activity, "activity cannot be null!");
        try {
            return captureImpl(activity.getWindow().getDecorView().getRootView());
        } catch (IOException e) {
            throw new ScreenShotException(e);
        } catch (InterruptedException e2) {
            throw new ScreenShotException(e2);
        } catch (ExecutionException e3) {
            throw new ScreenShotException(e3);
        }
    }

    public static ScreenCapture capture(@NonNull View view) {
        Checks.checkNotNull(view, "view cannot be null!");
        try {
            return captureImpl(view);
        } catch (IOException e) {
            throw new ScreenShotException(e);
        } catch (InterruptedException e2) {
            throw new ScreenShotException(e2);
        } catch (ExecutionException e3) {
            throw new ScreenShotException(e3);
        }
    }
}
