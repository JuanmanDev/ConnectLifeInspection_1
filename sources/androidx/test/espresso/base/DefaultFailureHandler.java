package androidx.test.espresso.base;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.test.espresso.EspressoException;
import androidx.test.espresso.FailureHandler;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.base.Throwables;
import androidx.test.espresso.internal.inject.TargetContext;
import androidx.test.internal.platform.util.TestOutputEmitter;
import java.util.concurrent.atomic.AtomicInteger;
import junit.framework.AssertionFailedError;
import p648m.p657c.C9623e;

public final class DefaultFailureHandler implements FailureHandler {
    public static final AtomicInteger failureCount = new AtomicInteger(0);
    public final Context appContext;

    public static final class AssertionFailedWithCauseError extends AssertionFailedError {
        public AssertionFailedWithCauseError(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public DefaultFailureHandler(@TargetContext Context context) {
        this.appContext = (Context) Preconditions.checkNotNull(context);
    }

    public static float getAnimatorDurationScale(ContentResolver contentResolver) {
        if (isJellyBeanMR1OrHigher()) {
            return getSetting(contentResolver, "animator_duration_scale", "animator_duration_scale");
        }
        return 0.0f;
    }

    public static float getGlobalSetting(ContentResolver contentResolver, String str) {
        try {
            return Settings.Global.getFloat(contentResolver, str);
        } catch (Settings.SettingNotFoundException unused) {
            return 0.0f;
        }
    }

    public static float getSetting(ContentResolver contentResolver, String str, String str2) {
        if (isJellyBeanMR1OrHigher()) {
            return getGlobalSetting(contentResolver, str);
        }
        return getSystemSetting(contentResolver, str2);
    }

    public static float getSystemSetting(ContentResolver contentResolver, String str) {
        try {
            return Settings.System.getFloat(contentResolver, str);
        } catch (Settings.SettingNotFoundException unused) {
            return 0.0f;
        }
    }

    public static float getTransitionAnimationScale(ContentResolver contentResolver) {
        return getSetting(contentResolver, "transition_animation_scale", "transition_animation_scale");
    }

    private Throwable getUserFriendlyError(Throwable th, C9623e<View> eVar) {
        if (th instanceof PerformException) {
            StringBuilder sb = new StringBuilder();
            if (!isAnimationAndTransitionDisabled(this.appContext)) {
                sb.append("Animations or transitions are enabled on the target device.\nFor more info check: https://developer.android.com/training/testing/espresso/setup#set-up-environment\n\n");
            }
            sb.append(eVar.toString());
            throw new PerformException.Builder().from((PerformException) th).withViewDescription(sb.toString()).build();
        }
        if (th instanceof AssertionError) {
            th = new AssertionFailedWithCauseError(th.getMessage(), th);
        }
        th.setStackTrace(Thread.currentThread().getStackTrace());
        return th;
    }

    public static float getWindowAnimationScale(ContentResolver contentResolver) {
        return getSetting(contentResolver, "window_animation_scale", "window_animation_scale");
    }

    public static boolean isAnimationAndTransitionDisabled(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return isEqualToZero(getTransitionAnimationScale(contentResolver)) && isEqualToZero(getWindowAnimationScale(contentResolver)) && isEqualToZero(getAnimatorDurationScale(contentResolver));
    }

    public static boolean isEqualToZero(float f) {
        return Float.compare(Math.abs(f), 0.0f) == 0;
    }

    public static boolean isJellyBeanMR1OrHigher() {
        return Build.VERSION.SDK_INT >= 17;
    }

    public void handle(Throwable th, C9623e<View> eVar) {
        int incrementAndGet = failureCount.incrementAndGet();
        StringBuilder sb = new StringBuilder(29);
        sb.append("view-op-error-");
        sb.append(incrementAndGet);
        sb.append(BrowserServiceFileProvider.FILE_EXTENSION);
        TestOutputEmitter.takeScreenshot(sb.toString());
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("explore-window-hierarchy-");
        sb2.append(incrementAndGet);
        sb2.append(".xml");
        TestOutputEmitter.captureWindowHierarchy(sb2.toString());
        if ((th instanceof EspressoException) || (th instanceof AssertionFailedError) || (th instanceof AssertionError)) {
            Throwables.throwIfUnchecked(getUserFriendlyError(th, eVar));
            throw new RuntimeException(getUserFriendlyError(th, eVar));
        } else {
            Throwables.throwIfUnchecked(th);
            throw new RuntimeException(th);
        }
    }
}
