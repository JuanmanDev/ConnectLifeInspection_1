package androidx.test.internal.util;

import androidx.test.internal.runner.listener.InstrumentationResultPrinter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p627i.p629b.C9389g;
import p627i.p629b.C9394k;

public class AndroidRunnerBuilderUtil {
    public static boolean hasJUnit3TestMethod(Class<?> cls) {
        for (Method isPublicTestMethod : cls.getMethods()) {
            if (isPublicTestMethod(isPublicTestMethod)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSuiteMethod(Class<?> cls) {
        try {
            cls.getMethod("suite", new Class[0]);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    public static boolean isJUnit3Test(Class<?> cls) {
        return C9389g.class.isAssignableFrom(cls);
    }

    public static boolean isJUnit3TestSuite(Class<?> cls) {
        return C9394k.class.isAssignableFrom(cls);
    }

    public static boolean isPublicTestMethod(Method method) {
        return isTestMethod(method) && Modifier.isPublic(method.getModifiers());
    }

    public static boolean isTestMethod(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith(InstrumentationResultPrinter.REPORT_KEY_NAME_TEST) && method.getReturnType().equals(Void.TYPE);
    }
}
