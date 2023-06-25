package androidx.test.espresso.base;

import android.os.Build;
import android.os.SystemClock;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.view.InputDeviceCompat;
import androidx.test.espresso.InjectEventSecurityException;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class InputManagerEventInjectionStrategy implements EventInjectionStrategy {
    public static final long KEYBOARD_DISMISSAL_DELAY_MILLIS = 1000;
    public static final String TAG = "EventInjectionStrategy";
    public int asyncEventMode;
    public boolean initComplete;
    public Method injectInputEventMethod;
    public Object instanceInputManagerObject;
    public Method setSourceMotionMethod;
    public int syncEventMode;

    public InputManagerEventInjectionStrategy() {
        Preconditions.checkState(Build.VERSION.SDK_INT >= 16, "Unsupported API level.");
    }

    private boolean innerInjectMotionEvent(MotionEvent motionEvent, boolean z, boolean z2) {
        try {
            if ((motionEvent.getSource() & 2) == 0 && !isFromTouchpadInGlassDevice(motionEvent)) {
                this.setSourceMotionMethod.invoke(motionEvent, new Object[]{4098});
            }
            return ((Boolean) this.injectInputEventMethod.invoke(this.instanceInputManagerObject, new Object[]{motionEvent, Integer.valueOf(z2 ? this.syncEventMode : this.asyncEventMode)})).booleanValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof SecurityException)) {
                throw new RuntimeException(e3);
            } else if (z) {
                SystemClock.sleep(1000);
                innerInjectMotionEvent(motionEvent, false, z2);
                return false;
            } else {
                throw new InjectEventSecurityException(cause);
            }
        } catch (SecurityException e4) {
            throw new InjectEventSecurityException((Throwable) e4);
        }
    }

    public static boolean isFromTouchpadInGlassDevice(MotionEvent motionEvent) {
        return (Build.DEVICE.contains("glass") || Build.DEVICE.contains("Glass") || Build.DEVICE.contains("wingman")) && (motionEvent.getSource() & InputDeviceCompat.SOURCE_TOUCHPAD) != 0;
    }

    public void initialize() {
        if (!this.initComplete) {
            try {
                Class<?> cls = Class.forName("android.hardware.input.InputManager");
                Method declaredMethod = cls.getDeclaredMethod(RootsOracle.GET_GLOBAL_INSTANCE, new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(cls, new Object[0]);
                this.instanceInputManagerObject = invoke;
                Method declaredMethod2 = invoke.getClass().getDeclaredMethod("injectInputEvent", new Class[]{InputEvent.class, Integer.TYPE});
                this.injectInputEventMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Field field = cls.getField("INJECT_INPUT_EVENT_MODE_WAIT_FOR_FINISH");
                field.setAccessible(true);
                this.syncEventMode = field.getInt(cls);
                if (Build.VERSION.SDK_INT >= 28) {
                    this.asyncEventMode = 0;
                } else {
                    Field field2 = cls.getField("INJECT_INPUT_EVENT_MODE_ASYNC");
                    field2.setAccessible(true);
                    this.asyncEventMode = field2.getInt(cls);
                }
                this.setSourceMotionMethod = MotionEvent.class.getDeclaredMethod("setSource", new Class[]{Integer.TYPE});
                this.initComplete = true;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            } catch (NoSuchFieldException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    public boolean injectKeyEvent(KeyEvent keyEvent) {
        try {
            return ((Boolean) this.injectInputEventMethod.invoke(this.instanceInputManagerObject, new Object[]{keyEvent, Integer.valueOf(this.syncEventMode)})).booleanValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof SecurityException) {
                throw new InjectEventSecurityException(cause);
            }
            throw new RuntimeException(e2);
        } catch (SecurityException e3) {
            throw new InjectEventSecurityException((Throwable) e3);
        }
    }

    public boolean injectMotionEvent(MotionEvent motionEvent, boolean z) {
        return innerInjectMotionEvent(motionEvent, true, z);
    }
}
