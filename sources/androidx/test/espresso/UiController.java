package androidx.test.espresso;

import android.view.KeyEvent;
import android.view.MotionEvent;

public interface UiController {
    boolean injectKeyEvent(KeyEvent keyEvent);

    boolean injectMotionEvent(MotionEvent motionEvent);

    boolean injectMotionEventSequence(Iterable<MotionEvent> iterable);

    boolean injectString(String str);

    void loopMainThreadForAtLeast(long j);

    void loopMainThreadUntilIdle();
}
