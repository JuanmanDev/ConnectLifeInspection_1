package p630io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.List;

@RequiresApi(30)
@SuppressLint({"NewApi", "Override"})
@Keep
@VisibleForTesting
@TargetApi(30)
/* renamed from: io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback */
public class ImeSyncDeferringInsetsCallback extends WindowInsetsAnimation.Callback implements View.OnApplyWindowInsetsListener {
    public boolean animating = false;
    public int deferredInsetTypes;
    public WindowInsets lastWindowInsets;
    public boolean needsSave = false;
    public int overlayInsetTypes;
    public View view;

    public ImeSyncDeferringInsetsCallback(@NonNull View view2, int i, int i2) {
        super(1);
        this.overlayInsetTypes = i;
        this.deferredInsetTypes = i2;
        this.view = view2;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this);
        this.view.setOnApplyWindowInsetsListener(this);
    }

    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
        this.view = view2;
        if (this.needsSave) {
            this.lastWindowInsets = windowInsets;
            this.needsSave = false;
        }
        if (this.animating) {
            return WindowInsets.CONSUMED;
        }
        return view2.onApplyWindowInsets(windowInsets);
    }

    public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        View view2;
        if (this.animating && (windowInsetsAnimation.getTypeMask() & this.deferredInsetTypes) != 0) {
            this.animating = false;
            WindowInsets windowInsets = this.lastWindowInsets;
            if (windowInsets != null && (view2 = this.view) != null) {
                view2.dispatchApplyWindowInsets(windowInsets);
            }
        }
    }

    public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        if ((windowInsetsAnimation.getTypeMask() & this.deferredInsetTypes) != 0) {
            this.animating = true;
            this.needsSave = true;
        }
    }

    public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
        if (this.animating && !this.needsSave) {
            boolean z = false;
            for (WindowInsetsAnimation typeMask : list) {
                if ((typeMask.getTypeMask() & this.deferredInsetTypes) != 0) {
                    z = true;
                }
            }
            if (!z) {
                return windowInsets;
            }
            WindowInsets.Builder builder = new WindowInsets.Builder(this.lastWindowInsets);
            builder.setInsets(this.deferredInsetTypes, Insets.of(0, 0, 0, Math.max(windowInsets.getInsets(this.deferredInsetTypes).bottom - windowInsets.getInsets(this.overlayInsetTypes).bottom, 0)));
            this.view.onApplyWindowInsets(builder.build());
        }
        return windowInsets;
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback((WindowInsetsAnimation.Callback) null);
        this.view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
    }
}
