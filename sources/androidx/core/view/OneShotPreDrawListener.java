package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

public final class OneShotPreDrawListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final Runnable mRunnable;
    public final View mView;
    public ViewTreeObserver mViewTreeObserver;

    public OneShotPreDrawListener(View view, Runnable runnable) {
        this.mView = view;
        this.mViewTreeObserver = view.getViewTreeObserver();
        this.mRunnable = runnable;
    }

    @NonNull
    public static OneShotPreDrawListener add(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            OneShotPreDrawListener oneShotPreDrawListener = new OneShotPreDrawListener(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
            view.addOnAttachStateChangeListener(oneShotPreDrawListener);
            return oneShotPreDrawListener;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public boolean onPreDraw() {
        removeListener();
        this.mRunnable.run();
        return true;
    }

    public void onViewAttachedToWindow(@NonNull View view) {
        this.mViewTreeObserver = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(@NonNull View view) {
        removeListener();
    }

    public void removeListener() {
        if (this.mViewTreeObserver.isAlive()) {
            this.mViewTreeObserver.removeOnPreDrawListener(this);
        } else {
            this.mView.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.mView.removeOnAttachStateChangeListener(this);
    }
}
