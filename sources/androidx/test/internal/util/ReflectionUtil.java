package androidx.test.internal.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {
    public static final String TAG = "ReflectionUtil";

    public static void reflectivelyInvokeRemoteMethod(String str, String str2) {
        Checks.checkNotNull(str);
        Checks.checkNotNull(str2);
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            "Attempting to reflectively call: ".concat(valueOf);
        } else {
            new String("Attempting to reflectively call: ");
        }
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
