package androidx.test.platform.p033ui;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* renamed from: androidx.test.platform.ui.UiController */
public interface UiController {
    boolean injectKeyEvent(KeyEvent keyEvent);

    boolean injectMotionEvent(MotionEvent motionEvent);

    boolean injectString(String str);

    void loopMainThreadForAtLeast(long j);

    void loopMainThreadUntilIdle();
}
