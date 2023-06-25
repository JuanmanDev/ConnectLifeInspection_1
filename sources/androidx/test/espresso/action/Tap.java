package androidx.test.espresso.action;

import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.test.espresso.UiController;
import androidx.test.espresso.action.MotionEvents;
import androidx.test.espresso.action.Tapper;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import java.lang.reflect.InvocationTargetException;

public enum Tap implements Tapper {
    SINGLE {
        public Tapper.Status sendTap(UiController uiController, float[] fArr, float[] fArr2) {
            return sendTap(uiController, fArr, fArr2, 0, 0);
        }

        public Tapper.Status sendTap(UiController uiController, float[] fArr, float[] fArr2, int i, int i2) {
            Tapper.Status access$100 = Tap.sendSingleTap(uiController, fArr, fArr2, i, i2);
            if (Tapper.Status.SUCCESS == access$100) {
                uiController.loopMainThreadForAtLeast((long) (((float) ViewConfiguration.getTapTimeout()) * 1.5f));
            }
            return access$100;
        }
    },
    LONG {
        public Tapper.Status sendTap(UiController uiController, float[] fArr, float[] fArr2) {
            return sendTap(uiController, fArr, fArr2, 0, 0);
        }

        public Tapper.Status sendTap(UiController uiController, float[] fArr, float[] fArr2, int i, int i2) {
            Preconditions.checkNotNull(uiController);
            Preconditions.checkNotNull(fArr);
            Preconditions.checkNotNull(fArr2);
            MotionEvent motionEvent = MotionEvents.sendDown(uiController, fArr, fArr2, i, i2).down;
            try {
                uiController.loopMainThreadForAtLeast((long) (((float) ViewConfiguration.getLongPressTimeout()) * 1.5f));
                if (!MotionEvents.sendUp(uiController, motionEvent)) {
                    MotionEvents.sendCancel(uiController, motionEvent);
                    return Tapper.Status.FAILURE;
                }
                motionEvent.recycle();
                return Tapper.Status.SUCCESS;
            } finally {
                motionEvent.recycle();
            }
        }
    },
    DOUBLE {
        public Tapper.Status sendTap(UiController uiController, float[] fArr, float[] fArr2) {
            return sendTap(uiController, fArr, fArr2, 0, 0);
        }

        public Tapper.Status sendTap(UiController uiController, float[] fArr, float[] fArr2, int i, int i2) {
            Preconditions.checkNotNull(uiController);
            Preconditions.checkNotNull(fArr);
            Preconditions.checkNotNull(fArr2);
            Tapper.Status access$100 = Tap.sendSingleTap(uiController, fArr, fArr2, i, i2);
            Tapper.Status status = Tapper.Status.FAILURE;
            if (access$100 == status) {
                return status;
            }
            if (Tap.DOUBLE_TAP_MIN_TIMEOUT > 0) {
                uiController.loopMainThreadForAtLeast((long) Tap.DOUBLE_TAP_MIN_TIMEOUT);
            }
            Tapper.Status access$1002 = Tap.sendSingleTap(uiController, fArr, fArr2, i, i2);
            Tapper.Status status2 = Tapper.Status.FAILURE;
            if (access$1002 == status2) {
                return status2;
            }
            Tapper.Status status3 = Tapper.Status.WARNING;
            if (access$1002 == status3 || access$100 == status3) {
                return Tapper.Status.WARNING;
            }
            return Tapper.Status.SUCCESS;
        }
    };
    
    public static final int DOUBLE_TAP_MIN_TIMEOUT = 0;
    public static final String TAG = null;

    /* access modifiers changed from: public */
    static {
        int i;
        TAG = Tap.class.getSimpleName();
        if (Build.VERSION.SDK_INT > 18) {
            try {
                i = ((Integer) ViewConfiguration.class.getDeclaredMethod("getDoubleTapMinTime", new Class[0]).invoke((Object) null, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        DOUBLE_TAP_MIN_TIMEOUT = i;
    }

    public static Tapper.Status sendSingleTap(UiController uiController, float[] fArr, float[] fArr2, int i, int i2) {
        Preconditions.checkNotNull(uiController);
        Preconditions.checkNotNull(fArr);
        Preconditions.checkNotNull(fArr2);
        MotionEvents.DownResultHolder sendDown = MotionEvents.sendDown(uiController, fArr, fArr2, i, i2);
        try {
            if (!MotionEvents.sendUp(uiController, sendDown.down)) {
                MotionEvents.sendCancel(uiController, sendDown.down);
                return Tapper.Status.FAILURE;
            }
            sendDown.down.recycle();
            return sendDown.longPress ? Tapper.Status.WARNING : Tapper.Status.SUCCESS;
        } finally {
            sendDown.down.recycle();
        }
    }
}
