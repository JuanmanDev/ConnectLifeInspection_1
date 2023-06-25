package androidx.test.internal.runner.junit4;

import androidx.test.internal.util.AndroidRunnerParams;
import java.lang.reflect.Method;
import org.junit.Test;
import p648m.p668e.p669j.p670d.C9704f;
import p648m.p668e.p677l.C9749f;

public class AndroidJUnit4Builder extends C9704f {
    public static final String TAG = "AndroidJUnit4Builder";
    public final AndroidRunnerParams androidRunnerParams;
    public final boolean scanningPath;

    public AndroidJUnit4Builder(AndroidRunnerParams androidRunnerParams2, boolean z) {
        this.androidRunnerParams = androidRunnerParams2;
        this.scanningPath = z;
    }

    public static boolean hasTestMethods(Class<?> cls) {
        try {
            for (Method isAnnotationPresent : cls.getMethods()) {
                if (isAnnotationPresent.isAnnotationPresent(Test.class)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            String.format("%s in hasTestMethods for %s", new Object[]{th.toString(), cls.getName()});
            return false;
        }
    }

    public C9749f runnerForClass(Class<?> cls) {
        if (!this.scanningPath || hasTestMethods(cls)) {
            return new AndroidJUnit4ClassRunner(cls, this.androidRunnerParams);
        }
        return null;
    }

    @Deprecated
    public AndroidJUnit4Builder(AndroidRunnerParams androidRunnerParams2) {
        this(androidRunnerParams2, false);
    }
}
