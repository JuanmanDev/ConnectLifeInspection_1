package androidx.core.p028os;

import android.os.Build;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(17)
/* renamed from: androidx.core.os.UserHandleCompat */
public class UserHandleCompat {
    @Nullable
    public static Method sGetUserIdMethod;
    @Nullable
    public static Constructor<UserHandle> sUserHandleConstructor;

    @RequiresApi(24)
    /* renamed from: androidx.core.os.UserHandleCompat$Api24Impl */
    public static class Api24Impl {
        @NonNull
        public static UserHandle getUserHandleForUid(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    public static Method getGetUserIdMethod() {
        if (sGetUserIdMethod == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", new Class[]{Integer.TYPE});
            sGetUserIdMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sGetUserIdMethod;
    }

    public static Constructor<UserHandle> getUserHandleConstructor() {
        if (sUserHandleConstructor == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(new Class[]{Integer.TYPE});
            sUserHandleConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return sUserHandleConstructor;
    }

    @NonNull
    public static UserHandle getUserHandleForUid(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getUserHandleForUid(i);
        }
        try {
            Method getUserIdMethod = getGetUserIdMethod();
            Object[] objArr = {Integer.valueOf(i)};
            return getUserHandleConstructor().newInstance(new Object[]{(Integer) getUserIdMethod.invoke((Object) null, objArr)});
        } catch (NoSuchMethodException e) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e);
            throw noSuchMethodError;
        } catch (IllegalAccessException e2) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e2);
            throw illegalAccessError;
        } catch (InstantiationException e3) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e3);
            throw instantiationError;
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
