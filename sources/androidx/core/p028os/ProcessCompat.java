package androidx.core.p028os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* renamed from: androidx.core.os.ProcessCompat */
public final class ProcessCompat {

    @RequiresApi(16)
    /* renamed from: androidx.core.os.ProcessCompat$Api16Impl */
    public static class Api16Impl {
        public static Method sMethodUserIdIsAppMethod;
        public static boolean sResolved;
        public static final Object sResolvedLock = new Object();

        @SuppressLint({"PrivateApi"})
        public static boolean isApplicationUid(int i) {
            try {
                synchronized (sResolvedLock) {
                    if (!sResolved) {
                        sResolved = true;
                        sMethodUserIdIsAppMethod = Class.forName("android.os.UserId").getDeclaredMethod("isApp", new Class[]{Integer.TYPE});
                    }
                }
                if (sMethodUserIdIsAppMethod != null) {
                    Boolean bool = (Boolean) sMethodUserIdIsAppMethod.invoke((Object) null, new Object[]{Integer.valueOf(i)});
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @RequiresApi(17)
    /* renamed from: androidx.core.os.ProcessCompat$Api17Impl */
    public static class Api17Impl {
        public static Method sMethodUserHandleIsAppMethod;
        public static boolean sResolved;
        public static final Object sResolvedLock = new Object();

        @SuppressLint({"DiscouragedPrivateApi"})
        public static boolean isApplicationUid(int i) {
            try {
                synchronized (sResolvedLock) {
                    if (!sResolved) {
                        sResolved = true;
                        sMethodUserHandleIsAppMethod = UserHandle.class.getDeclaredMethod("isApp", new Class[]{Integer.TYPE});
                    }
                }
                if (sMethodUserHandleIsAppMethod != null) {
                    Boolean bool = (Boolean) sMethodUserHandleIsAppMethod.invoke((Object) null, new Object[]{Integer.valueOf(i)});
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.core.os.ProcessCompat$Api24Impl */
    public static class Api24Impl {
        public static boolean isApplicationUid(int i) {
            return Process.isApplicationUid(i);
        }
    }

    public static boolean isApplicationUid(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return Api24Impl.isApplicationUid(i);
        }
        if (i2 >= 17) {
            return Api17Impl.isApplicationUid(i);
        }
        if (i2 == 16) {
            return Api16Impl.isApplicationUid(i);
        }
        return true;
    }
}
