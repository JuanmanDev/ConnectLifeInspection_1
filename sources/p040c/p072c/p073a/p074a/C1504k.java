package p040c.p072c.p073a.p074a;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* renamed from: c.c.a.a.k */
/* compiled from: KeyboardUtils */
public final class C1504k {
    /* renamed from: a */
    public static void m934a(@NonNull Activity activity) {
        if (activity != null) {
            m935b(activity.getWindow());
            return;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: b */
    public static void m935b(@NonNull Window window) {
        if (window != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C1535z.m1079a().getSystemService("input_method");
            if (inputMethodManager != null) {
                String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
                for (int i = 0; i < 4; i++) {
                    try {
                        Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i]);
                        if (!declaredField.isAccessible()) {
                            declaredField.setAccessible(true);
                        }
                        Object obj = declaredField.get(inputMethodManager);
                        if (obj instanceof View) {
                            if (((View) obj).getRootView() == window.getDecorView().getRootView()) {
                                declaredField.set(inputMethodManager, (Object) null);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                return;
            }
            return;
        }
        throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* renamed from: c */
    public static void m936c() {
        InputMethodManager inputMethodManager = (InputMethodManager) C1535z.m1079a().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(0, 0);
        }
    }
}
