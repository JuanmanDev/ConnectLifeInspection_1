package androidx.camera.core;

import android.graphics.Rect;

public interface OnFocusListener {
    void onFocusLocked(Rect rect);

    void onFocusTimedOut(Rect rect);

    void onFocusUnableToLock(Rect rect);
}
