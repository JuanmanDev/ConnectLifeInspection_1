package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.text.BidiFormatter;

public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    @RequiresApi(16)
    public static class Api16Impl {
        @DoNotInline
        public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & -1793 : systemUiVisibility | BidiFormatter.DirectionalityEstimator.DIR_TYPE_CACHE_SIZE);
        }
    }

    @RequiresApi(28)
    public static class Api28Impl {
        @DoNotInline
        public static <T> T requireViewById(Window window, int i) {
            return window.requireViewById(i);
        }
    }

    @RequiresApi(30)
    public static class Api30Impl {
        @DoNotInline
        public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @NonNull
    public static WindowInsetsControllerCompat getInsetsController(@NonNull Window window, @NonNull View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Window window, @IdRes int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) Api28Impl.requireViewById(window, i);
        }
        T findViewById = window.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Api30Impl.setDecorFitsSystemWindows(window, z);
        } else if (i >= 16) {
            Api16Impl.setDecorFitsSystemWindows(window, z);
        }
    }
}
