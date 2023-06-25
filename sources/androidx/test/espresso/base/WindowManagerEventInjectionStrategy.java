package androidx.test.espresso.base;

import android.os.Build;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.test.espresso.InjectEventSecurityException;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class WindowManagerEventInjectionStrategy implements EventInjectionStrategy {
    public static final String TAG = "WindowManagerEventInjectionStrategy";
    public boolean initComplete;
    public Method injectInputKeyEventMethod;
    public Method injectInputMotionEventMethod;
    public Object wmInstance;

    public WindowManagerEventInjectionStrategy() {
        int i = Build.VERSION.SDK_INT;
        Preconditions.checkState(i >= 7 && i <= 15, "Unsupported API level.");
    }

    public void initialize() {
        if (!this.initComplete) {
            try {
                Class<?> cls = Class.forName("android.os.ServiceManager");
                Method declaredMethod = cls.getDeclaredMethod("getService", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(cls, new Object[]{"window"});
                Class<?> cls2 = Class.forName("android.view.IWindowManager$Stub");
                Method declaredMethod2 = cls2.getDeclaredMethod("asInterface", new Class[]{IBinder.class});
                declaredMethod2.setAccessible(true);
                Object invoke2 = declaredMethod2.invoke(cls2, new Object[]{invoke});
                this.wmInstance = invoke2;
                Method declaredMethod3 = invoke2.getClass().getDeclaredMethod("injectPointerEvent", new Class[]{MotionEvent.class, Boolean.TYPE});
                this.injectInputMotionEventMethod = declaredMethod3;
                declaredMethod3.setAccessible(true);
                Method declaredMethod4 = this.wmInstance.getClass().getDeclaredMethod("injectKeyEvent", new Class[]{KeyEvent.class, Boolean.TYPE});
                this.injectInputKeyEventMethod = declaredMethod4;
                declaredMethod4.setAccessible(true);
                this.initComplete = true;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (IllegalArgumentException e3) {
                throw e3;
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException(e5);
            } catch (SecurityException e6) {
                throw e6;
            }
        }
    }

    public boolean injectKeyEvent(KeyEvent keyEvent) {
        try {
            return ((Boolean) this.injectInputKeyEventMethod.invoke(this.wmInstance, new Object[]{keyEvent, Boolean.TRUE})).booleanValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof SecurityException) {
                throw new InjectEventSecurityException(cause);
            }
            throw new RuntimeException(e3);
        } catch (SecurityException e4) {
            throw new InjectEventSecurityException((Throwable) e4);
        }
    }

    public boolean injectMotionEvent(MotionEvent motionEvent, boolean z) {
        try {
            return ((Boolean) this.injectInputMotionEventMethod.invoke(this.wmInstance, new Object[]{motionEvent, Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof SecurityException) {
                throw new InjectEventSecurityException(cause);
            }
            throw new RuntimeException(e3);
        } catch (SecurityException e4) {
            throw new InjectEventSecurityException((Throwable) e4);
        }
    }
}
