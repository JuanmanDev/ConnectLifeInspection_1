package androidx.test.internal.runner;

import androidx.annotation.VisibleForTesting;
import androidx.test.filters.LargeTest;
import androidx.test.filters.MediumTest;
import androidx.test.filters.SmallTest;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.runner.Description;

public final class TestSize {
    public static final Set<TestSize> ALL_SIZES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new TestSize[]{SMALL, MEDIUM, LARGE})));
    public static final TestSize LARGE = new TestSize("large", LargeTest.class, "android.test.suitebuilder.annotation.LargeTest", Float.MAX_VALUE);
    public static final TestSize MEDIUM = new TestSize("medium", MediumTest.class, "android.test.suitebuilder.annotation.MediumTest", 1000.0f);
    public static final TestSize NONE = new TestSize("", (Class<? extends Annotation>) null, (String) null, 0.0f);
    public static final TestSize SMALL = new TestSize("small", SmallTest.class, "android.test.suitebuilder.annotation.SmallTest", 200.0f);
    public final Class<? extends Annotation> platformAnnotationClass;
    public final Class<? extends Annotation> runnerFilterAnnotationClass;
    public final String sizeQualifierName;
    public final float testSizeRunTimeThreshold;

    @VisibleForTesting
    public TestSize(String str, Class<? extends Annotation> cls, String str2, float f) {
        this.sizeQualifierName = str;
        this.platformAnnotationClass = loadPlatformAnnotationClass(str2);
        this.runnerFilterAnnotationClass = cls;
        this.testSizeRunTimeThreshold = f;
    }

    public static TestSize fromDescription(Description description) {
        TestSize testSize = NONE;
        Iterator<TestSize> it = ALL_SIZES.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TestSize next = it.next();
            if (next.testMethodIsAnnotatedWithTestSize(description)) {
                testSize = next;
                break;
            }
        }
        if (!NONE.equals(testSize)) {
            return testSize;
        }
        for (TestSize next2 : ALL_SIZES) {
            if (next2.testClassIsAnnotatedWithTestSize(description)) {
                return next2;
            }
        }
        return testSize;
    }

    public static TestSize fromString(String str) {
        TestSize testSize = NONE;
        for (TestSize next : ALL_SIZES) {
            if (next.getSizeQualifierName().equals(str)) {
                testSize = next;
            }
        }
        return testSize;
    }

    private Class<? extends Annotation> getFrameworkAnnotation() {
        return this.platformAnnotationClass;
    }

    private Class<? extends Annotation> getRunnerAnnotation() {
        return this.runnerFilterAnnotationClass;
    }

    public static TestSize getTestSizeForRunTime(float f) {
        if (runTimeSmallerThanThreshold(f, SMALL.getRunTimeThreshold())) {
            return SMALL;
        }
        if (runTimeSmallerThanThreshold(f, MEDIUM.getRunTimeThreshold())) {
            return MEDIUM;
        }
        return LARGE;
    }

    public static boolean hasAnnotation(Class<?> cls, Class<? extends Annotation> cls2) {
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isAnyTestSize(java.lang.Class<? extends java.lang.annotation.Annotation> r3) {
        /*
            java.util.Set<androidx.test.internal.runner.TestSize> r0 = ALL_SIZES
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            androidx.test.internal.runner.TestSize r1 = (androidx.test.internal.runner.TestSize) r1
            java.lang.Class r2 = r1.getRunnerAnnotation()
            if (r2 == r3) goto L_0x001e
            java.lang.Class r1 = r1.getFrameworkAnnotation()
            if (r1 != r3) goto L_0x0006
        L_0x001e:
            r3 = 1
            return r3
        L_0x0020:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.internal.runner.TestSize.isAnyTestSize(java.lang.Class):boolean");
    }

    public static Class<? extends Annotation> loadPlatformAnnotationClass(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static boolean runTimeSmallerThanThreshold(float f, float f2) {
        return Float.compare(f, f2) < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TestSize.class != obj.getClass()) {
            return false;
        }
        return this.sizeQualifierName.equals(((TestSize) obj).sizeQualifierName);
    }

    public float getRunTimeThreshold() {
        return this.testSizeRunTimeThreshold;
    }

    public String getSizeQualifierName() {
        return this.sizeQualifierName;
    }

    public int hashCode() {
        return this.sizeQualifierName.hashCode();
    }

    public boolean testClassIsAnnotatedWithTestSize(Description description) {
        Class<?> testClass = description.getTestClass();
        if (testClass == null) {
            return false;
        }
        if (hasAnnotation(testClass, this.runnerFilterAnnotationClass) || hasAnnotation(testClass, this.platformAnnotationClass)) {
            return true;
        }
        return false;
    }

    public boolean testMethodIsAnnotatedWithTestSize(Description description) {
        return (description.getAnnotation(this.runnerFilterAnnotationClass) == null && description.getAnnotation(this.platformAnnotationClass) == null) ? false : true;
    }
}
