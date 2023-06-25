package androidx.test.espresso.base;

import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;

public final class EventInjector {
    public static final String TAG = "EventInjector";
    public final EventInjectionStrategy injectionStrategy;

    public EventInjector(EventInjectionStrategy eventInjectionStrategy) {
        this.injectionStrategy = (EventInjectionStrategy) Preconditions.checkNotNull(eventInjectionStrategy);
    }

    public boolean injectKeyEvent(KeyEvent keyEvent) {
        KeyEvent keyEvent2;
        long downTime = keyEvent.getDownTime();
        long eventTime = keyEvent.getEventTime();
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        int repeatCount = keyEvent.getRepeatCount();
        int metaState = keyEvent.getMetaState();
        int deviceId = keyEvent.getDeviceId();
        int scanCode = keyEvent.getScanCode();
        int flags = keyEvent.getFlags();
        if (eventTime == 0) {
            eventTime = SystemClock.uptimeMillis();
        }
        long j = eventTime;
        long j2 = downTime == 0 ? j : downTime;
        if (Build.VERSION.SDK_INT < 9) {
            keyEvent2 = new KeyEvent(j2, j, action, keyCode, repeatCount, metaState, deviceId, scanCode, flags | 8);
        } else {
            keyEvent2 = new KeyEvent(j2, j, action, keyCode, repeatCount, metaState, deviceId, scanCode, flags | 8, keyEvent.getSource());
        }
        return this.injectionStrategy.injectKeyEvent(keyEvent2);
    }

    public boolean injectMotionEvent(MotionEvent motionEvent) {
        return this.injectionStrategy.injectMotionEvent(motionEvent, true);
    }

    public boolean injectMotionEventAsync(MotionEvent motionEvent) {
        return this.injectionStrategy.injectMotionEvent(motionEvent, false);
    }
}
