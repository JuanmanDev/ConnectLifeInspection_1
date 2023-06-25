package androidx.test.espresso.base;

import android.view.KeyEvent;
import android.view.MotionEvent;

public interface EventInjectionStrategy {
    boolean injectKeyEvent(KeyEvent keyEvent);

    boolean injectMotionEvent(MotionEvent motionEvent, boolean z);
}
