package androidx.test.internal.runner;

import android.app.Instrumentation;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.test.filters.RequiresDevice;
import androidx.test.filters.SdkSuppress;
import androidx.test.filters.Suppress;
import androidx.test.internal.runner.ClassPathScanner;
import androidx.test.internal.runner.RunnerArgs;
import androidx.test.internal.runner.filters.ParentFilter;
import androidx.test.internal.runner.filters.TestsRegExFilter;
import androidx.test.internal.util.AndroidRunnerParams;
import androidx.test.internal.util.Checks;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.model.InitializationError;
import p648m.p668e.p677l.C9746d;
import p648m.p668e.p677l.C9749f;
import p648m.p668e.p677l.p678g.C9750a;
import p648m.p668e.p677l.p679h.C9759b;
import p648m.p668e.p680m.C9776c;
import p648m.p668e.p680m.p681d.C9783e;

public class TestRequestBuilder {
    public static final String AMBIGUOUS_ARGUMENTS_MSG = "Ambiguous arguments: cannot provide both test package and test class(es) to run";
    public static final String[] DEFAULT_EXCLUDED_PACKAGES = {"junit", "org.junit", "org.hamcrest", "org.mockito", "androidx.test.internal.runner.junit3", "org.jacoco", "net.bytebuddy"};
    public static final String MISSING_ARGUMENTS_MSG = "Must provide either classes to run, or paths to scan";
    public static final String TAG = "TestRequestBuilder";
    public final Bundle argsBundle;
    public ClassLoader classLoader;
    public ClassAndMethodFilter classMethodFilter;
    public List<Class<? extends C9783e>> customRunnerBuilderClasses;
    public final DeviceBuild deviceBuild;
    public Set<String> excludedClasses;
    public Set<String> excludedPackages;
    public C9750a filter;
    public boolean ignoreSuiteMethods;
    public Set<String> includedClasses;
    public Set<String> includedPackages;
    public final Instrumentation instr;
    public final List<String> pathsToScan;
    public long perTestTimeout;
    public boolean skipExecution;
    public final TestsRegExFilter testsRegExFilter;

    public static class AnnotationExclusionFilter extends ParentFilter {
        public final Class<? extends Annotation> annotationClass;

        public AnnotationExclusionFilter(Class<? extends Annotation> cls) {
            this.annotationClass = cls;
        }

        public String describe() {
            return String.format("not annotation %s", new Object[]{this.annotationClass.getName()});
        }

        public boolean evaluateTest(Description description) {
            Class<?> testClass = description.getTestClass();
            return (testClass == null || !testClass.isAnnotationPresent(this.annotationClass)) && description.getAnnotation(this.annotationClass) == null;
        }
    }

    public static class AnnotationInclusionFilter extends ParentFilter {
        public final Class<? extends Annotation> annotationClass;

        public AnnotationInclusionFilter(Class<? extends Annotation> cls) {
            this.annotationClass = cls;
        }

        public String describe() {
            return String.format("annotation %s", new Object[]{this.annotationClass.getName()});
        }

        public boolean evaluateTest(Description description) {
            Class<?> testClass = description.getTestClass();
            return description.getAnnotation(this.annotationClass) != null || (testClass != null && testClass.isAnnotationPresent(this.annotationClass));
        }

        public Class<? extends Annotation> getAnnotationClass() {
            return this.annotationClass;
        }
    }

    public static class BlankRunner extends C9749f {
        public BlankRunner() {
        }

        public Description getDescription() {
            return Description.createSuiteDescription("no tests found", new Annotation[0]);
        }

        public void run(C9759b bVar) {
        }
    }

    public static class ClassAndMethodFilter extends ParentFilter {
        public Map<String, MethodFilter> methodFilters;

        public ClassAndMethodFilter() {
            this.methodFilters = new HashMap();
        }

        public void addMethod(String str, String str2) {
            MethodFilter methodFilter = this.methodFilters.get(str);
            if (methodFilter == null) {
                methodFilter = new MethodFilter(str);
                this.methodFilters.put(str, methodFilter);
            }
            methodFilter.addInclusionMethod(str2);
        }

        public String describe() {
            return "Class and method filter";
        }

        public boolean evaluateTest(Description description) {
            MethodFilter methodFilter;
            if (!this.methodFilters.isEmpty() && (methodFilter = this.methodFilters.get(description.getClassName())) != null) {
                return methodFilter.shouldRun(description);
            }
            return true;
        }

        public void removeMethod(String str, String str2) {
            MethodFilter methodFilter = this.methodFilters.get(str);
            if (methodFilter == null) {
                methodFilter = new MethodFilter(str);
                this.methodFilters.put(str, methodFilter);
            }
            methodFilter.addExclusionMethod(str2);
        }
    }

    public interface DeviceBuild {
        String getHardware();

        int getSdkVersionInt();
    }

    public static class DeviceBuildImpl implements DeviceBuild {
        public DeviceBuildImpl() {
        }

        public String getHardware() {
            return Build.HARDWARE;
        }

        public int getSdkVersionInt() {
            return Build.VERSION.SDK_INT;
        }
    }

    public static class ExtendedSuite extends C9776c {
        public ExtendedSuite(List<C9749f> list) {
            super((Class<?>) null, list);
        }

        public static C9776c createSuite(List<C9749f> list) {
            try {
                return new ExtendedSuite(list);
            } catch (InitializationError unused) {
                String name = C9776c.class.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 107);
                sb.append("Internal Error: ");
                sb.append(name);
                sb.append("(Class<?>, List<Runner>) should never throw an InitializationError when passed a null Class");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    public static class LenientFilterRequest extends C9746d {
        public final C9750a filter;
        public final C9746d request;

        public LenientFilterRequest(C9746d dVar, C9750a aVar) {
            this.request = dVar;
            this.filter = aVar;
        }

        public C9749f getRunner() {
            try {
                C9749f runner = this.request.getRunner();
                this.filter.apply(runner);
                return runner;
            } catch (NoTestsRemainException unused) {
                return new BlankRunner();
            }
        }
    }

    public static class MethodFilter extends ParentFilter {
        public final String className;
        public Set<String> excludedMethods = new HashSet();
        public Set<String> includedMethods = new HashSet();

        public MethodFilter(String str) {
            this.className = str;
        }

        private String stripParameterizedSuffix(String str) {
            return Pattern.compile(".+(\\[[0-9]+\\])$").matcher(str).matches() ? str.substring(0, str.lastIndexOf(91)) : str;
        }

        public void addExclusionMethod(String str) {
            this.excludedMethods.add(str);
        }

        public void addInclusionMethod(String str) {
            this.includedMethods.add(str);
        }

        public String describe() {
            String str = this.className;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24);
            sb.append("Method filter for ");
            sb.append(str);
            sb.append(" class");
            return sb.toString();
        }

        public boolean evaluateTest(Description description) {
            String methodName = description.getMethodName();
            if (methodName == null) {
                return false;
            }
            String stripParameterizedSuffix = stripParameterizedSuffix(methodName);
            if (this.excludedMethods.contains(stripParameterizedSuffix)) {
                return false;
            }
            if (this.includedMethods.isEmpty() || this.includedMethods.contains(stripParameterizedSuffix) || stripParameterizedSuffix.equals("initializationError")) {
                return true;
            }
            return false;
        }
    }

    @VisibleForTesting
    public class RequiresDeviceFilter extends AnnotationExclusionFilter {
        public static final String EMULATOR_HARDWARE_GCE = "gce_x86";
        public static final String EMULATOR_HARDWARE_GOLDFISH = "goldfish";
        public static final String EMULATOR_HARDWARE_RANCHU = "ranchu";
        public final Set<String> emulatorHardwareNames = new HashSet(Arrays.asList(new String[]{EMULATOR_HARDWARE_GOLDFISH, EMULATOR_HARDWARE_RANCHU, EMULATOR_HARDWARE_GCE}));

        public RequiresDeviceFilter() {
            super(RequiresDevice.class);
        }

        public String describe() {
            return String.format("skip tests annotated with RequiresDevice if necessary", new Object[0]);
        }

        public boolean evaluateTest(Description description) {
            if (!super.evaluateTest(description)) {
                return !this.emulatorHardwareNames.contains(TestRequestBuilder.this.getDeviceHardware());
            }
            return true;
        }
    }

    public class SdkSuppressFilter extends ParentFilter {
        public SdkSuppressFilter() {
        }

        private SdkSuppress getAnnotationForTest(Description description) {
            SdkSuppress sdkSuppress = (SdkSuppress) description.getAnnotation(SdkSuppress.class);
            if (sdkSuppress != null) {
                return sdkSuppress;
            }
            Class<?> testClass = description.getTestClass();
            if (testClass != null) {
                return (SdkSuppress) testClass.getAnnotation(SdkSuppress.class);
            }
            return null;
        }

        public String describe() {
            return String.format("skip tests annotated with SdkSuppress if necessary", new Object[0]);
        }

        public boolean evaluateTest(Description description) {
            SdkSuppress annotationForTest = getAnnotationForTest(description);
            if (annotationForTest == null) {
                return true;
            }
            if (TestRequestBuilder.this.getDeviceSdkInt() < annotationForTest.minSdkVersion() || TestRequestBuilder.this.getDeviceSdkInt() > annotationForTest.maxSdkVersion()) {
                return false;
            }
            return true;
        }
    }

    public static class ShardingFilter extends C9750a {
        public final int numShards;
        public final int shardIndex;

        public ShardingFilter(int i, int i2) {
            this.numShards = i;
            this.shardIndex = i2;
        }

        public String describe() {
            return String.format("Shard %s of %s shards", new Object[]{Integer.valueOf(this.shardIndex), Integer.valueOf(this.numShards)});
        }

        public boolean shouldRun(Description description) {
            if (!description.isTest() || Math.abs(description.hashCode()) % this.numShards == this.shardIndex) {
                return true;
            }
            return false;
        }
    }

    public static class SizeFilter extends ParentFilter {
        public final TestSize testSize;

        public SizeFilter(TestSize testSize2) {
            this.testSize = testSize2;
        }

        public String describe() {
            return "";
        }

        public boolean evaluateTest(Description description) {
            if (this.testSize.testMethodIsAnnotatedWithTestSize(description)) {
                return true;
            }
            if (!this.testSize.testClassIsAnnotatedWithTestSize(description)) {
                return false;
            }
            for (Annotation annotationType : description.getAnnotations()) {
                if (TestSize.isAnyTestSize(annotationType.annotationType())) {
                    return false;
                }
            }
            return true;
        }
    }

    public TestRequestBuilder(Instrumentation instrumentation, Bundle bundle) {
        this(new DeviceBuildImpl(), instrumentation, bundle);
    }

    private Collection<String> getClassNamesFromClassPath() {
        if (!this.pathsToScan.isEmpty()) {
            String.format("Scanning classpath to find tests in paths %s", new Object[]{this.pathsToScan});
            ClassPathScanner createClassPathScanner = createClassPathScanner(this.pathsToScan);
            ClassPathScanner.ChainedClassNameFilter chainedClassNameFilter = new ClassPathScanner.ChainedClassNameFilter();
            chainedClassNameFilter.add(new ClassPathScanner.ExternalClassNameFilter());
            for (String str : DEFAULT_EXCLUDED_PACKAGES) {
                if (!this.includedPackages.contains(str)) {
                    this.excludedPackages.add(str);
                }
            }
            if (!this.includedPackages.isEmpty()) {
                chainedClassNameFilter.add(new ClassPathScanner.InclusivePackageNamesFilter(this.includedPackages));
            }
            for (String excludePackageNameFilter : this.excludedPackages) {
                chainedClassNameFilter.add(new ClassPathScanner.ExcludePackageNameFilter(excludePackageNameFilter));
            }
            chainedClassNameFilter.add(new ClassPathScanner.ExcludeClassNamesFilter(this.excludedClasses));
            try {
                return createClassPathScanner.getClassPathEntries(chainedClassNameFilter);
            } catch (IOException unused) {
                return Collections.emptyList();
            }
        } else {
            throw new IllegalStateException("neither test class to execute or class paths were provided");
        }
    }

    /* access modifiers changed from: private */
    public String getDeviceHardware() {
        return this.deviceBuild.getHardware();
    }

    /* access modifiers changed from: private */
    public int getDeviceSdkInt() {
        return this.deviceBuild.getSdkVersionInt();
    }

    private C9783e getRunnerBuilder(AndroidRunnerParams androidRunnerParams, boolean z) {
        if (this.skipExecution) {
            return new AndroidLogOnlyBuilder(androidRunnerParams, z, this.customRunnerBuilderClasses);
        }
        return new AndroidRunnerBuilder(androidRunnerParams, z, this.customRunnerBuilderClasses);
    }

    private Class<? extends Annotation> loadAnnotationClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            String.format("Could not find annotation class: %s", new Object[]{str});
            return null;
        } catch (ClassCastException unused2) {
            String.format("Class %s is not an annotation", new Object[]{str});
            return null;
        }
    }

    private void maybeAddLegacySuppressFilter() {
        try {
            this.filter = this.filter.intersect(new AnnotationExclusionFilter(Class.forName("android.test.suitebuilder.annotation.Suppress")));
        } catch (ClassNotFoundException unused) {
        }
    }

    private void validate(Set<String> set) {
        if (set.isEmpty() && this.pathsToScan.isEmpty()) {
            throw new IllegalArgumentException(MISSING_ARGUMENTS_MSG);
        }
    }

    public TestRequestBuilder addAnnotationExclusionFilter(String str) {
        Class<? extends Annotation> loadAnnotationClass = loadAnnotationClass(str);
        if (loadAnnotationClass != null) {
            addFilter(new AnnotationExclusionFilter(loadAnnotationClass));
        }
        return this;
    }

    public TestRequestBuilder addAnnotationInclusionFilter(String str) {
        Class<? extends Annotation> loadAnnotationClass = loadAnnotationClass(str);
        if (loadAnnotationClass != null) {
            addFilter(new AnnotationInclusionFilter(loadAnnotationClass));
        }
        return this;
    }

    public TestRequestBuilder addCustomRunnerBuilderClass(Class<? extends C9783e> cls) {
        this.customRunnerBuilderClasses.add(cls);
        return this;
    }

    public TestRequestBuilder addFilter(C9750a aVar) {
        this.filter = this.filter.intersect(aVar);
        return this;
    }

    public TestRequestBuilder addFromRunnerArgs(RunnerArgs runnerArgs) {
        int i;
        for (RunnerArgs.TestArg next : runnerArgs.tests) {
            String str = next.methodName;
            if (str == null) {
                addTestClass(next.testClassName);
            } else {
                addTestMethod(next.testClassName, str);
            }
        }
        for (RunnerArgs.TestArg next2 : runnerArgs.notTests) {
            String str2 = next2.methodName;
            if (str2 == null) {
                removeTestClass(next2.testClassName);
            } else {
                removeTestMethod(next2.testClassName, str2);
            }
        }
        for (String addTestPackage : runnerArgs.testPackages) {
            addTestPackage(addTestPackage);
        }
        for (String removeTestPackage : runnerArgs.notTestPackages) {
            removeTestPackage(removeTestPackage);
        }
        String str3 = runnerArgs.testSize;
        if (str3 != null) {
            addTestSizeFilter(TestSize.fromString(str3));
        }
        for (String addAnnotationInclusionFilter : runnerArgs.annotations) {
            addAnnotationInclusionFilter(addAnnotationInclusionFilter);
        }
        for (String addAnnotationExclusionFilter : runnerArgs.notAnnotations) {
            addAnnotationExclusionFilter(addAnnotationExclusionFilter);
        }
        for (C9750a addFilter : runnerArgs.filters) {
            addFilter(addFilter);
        }
        long j = runnerArgs.testTimeout;
        if (j > 0) {
            setPerTestTimeout(j);
        }
        int i2 = runnerArgs.numShards;
        if (i2 > 0 && (i = runnerArgs.shardIndex) >= 0 && i < i2) {
            addShardingFilter(i2, i);
        }
        if (runnerArgs.logOnly) {
            setSkipExecution(true);
        }
        ClassLoader classLoader2 = runnerArgs.classLoader;
        if (classLoader2 != null) {
            setClassLoader(classLoader2);
        }
        for (Class<? extends C9783e> addCustomRunnerBuilderClass : runnerArgs.runnerBuilderClasses) {
            addCustomRunnerBuilderClass(addCustomRunnerBuilderClass);
        }
        String str4 = runnerArgs.testsRegEx;
        if (str4 != null) {
            setTestsRegExFilter(str4);
        }
        return this;
    }

    public TestRequestBuilder addPathToScan(String str) {
        this.pathsToScan.add(str);
        return this;
    }

    public TestRequestBuilder addPathsToScan(Iterable<String> iterable) {
        for (String addPathToScan : iterable) {
            addPathToScan(addPathToScan);
        }
        return this;
    }

    public TestRequestBuilder addShardingFilter(int i, int i2) {
        return addFilter(new ShardingFilter(i, i2));
    }

    public TestRequestBuilder addTestClass(String str) {
        this.includedClasses.add(str);
        return this;
    }

    public TestRequestBuilder addTestMethod(String str, String str2) {
        this.includedClasses.add(str);
        this.classMethodFilter.addMethod(str, str2);
        return this;
    }

    public TestRequestBuilder addTestPackage(String str) {
        this.includedPackages.add(str);
        return this;
    }

    public TestRequestBuilder addTestSizeFilter(TestSize testSize) {
        if (!TestSize.NONE.equals(testSize)) {
            addFilter(new SizeFilter(testSize));
        } else {
            String.format("Unrecognized test size '%s'", new Object[]{testSize.getSizeQualifierName()});
        }
        return this;
    }

    public C9746d build() {
        Collection collection;
        this.includedPackages.removeAll(this.excludedPackages);
        this.includedClasses.removeAll(this.excludedClasses);
        validate(this.includedClasses);
        boolean isEmpty = this.includedClasses.isEmpty();
        TestLoader testLoader = TestLoader.testLoader(this.classLoader, getRunnerBuilder(new AndroidRunnerParams(this.instr, this.argsBundle, this.perTestTimeout, this.ignoreSuiteMethods || isEmpty), isEmpty), isEmpty);
        if (isEmpty) {
            collection = getClassNamesFromClassPath();
        } else {
            collection = this.includedClasses;
        }
        return new LenientFilterRequest(C9746d.runner(ExtendedSuite.createSuite(testLoader.getRunnersFor(collection, isEmpty))), this.filter);
    }

    public ClassPathScanner createClassPathScanner(List<String> list) {
        return new ClassPathScanner((Collection<String>) list);
    }

    public TestRequestBuilder ignoreSuiteMethods(boolean z) {
        this.ignoreSuiteMethods = z;
        return this;
    }

    public TestRequestBuilder removeTestClass(String str) {
        this.excludedClasses.add(str);
        return this;
    }

    public TestRequestBuilder removeTestMethod(String str, String str2) {
        this.classMethodFilter.removeMethod(str, str2);
        return this;
    }

    public TestRequestBuilder removeTestPackage(String str) {
        this.excludedPackages.add(str);
        return this;
    }

    public TestRequestBuilder setClassLoader(ClassLoader classLoader2) {
        this.classLoader = classLoader2;
        return this;
    }

    public TestRequestBuilder setPerTestTimeout(long j) {
        this.perTestTimeout = j;
        return this;
    }

    public TestRequestBuilder setSkipExecution(boolean z) {
        this.skipExecution = z;
        return this;
    }

    public TestRequestBuilder setTestsRegExFilter(String str) {
        this.testsRegExFilter.setPattern(str);
        return this;
    }

    @VisibleForTesting
    public TestRequestBuilder(DeviceBuild deviceBuild2, Instrumentation instrumentation, Bundle bundle) {
        this.pathsToScan = new ArrayList();
        this.includedPackages = new HashSet();
        this.excludedPackages = new HashSet();
        this.includedClasses = new HashSet();
        this.excludedClasses = new HashSet();
        this.classMethodFilter = new ClassAndMethodFilter();
        this.testsRegExFilter = new TestsRegExFilter();
        this.filter = new AnnotationExclusionFilter(Suppress.class).intersect(new SdkSuppressFilter()).intersect(new RequiresDeviceFilter()).intersect(this.classMethodFilter).intersect(this.testsRegExFilter);
        this.customRunnerBuilderClasses = new ArrayList();
        this.skipExecution = false;
        this.perTestTimeout = 0;
        this.ignoreSuiteMethods = false;
        this.deviceBuild = (DeviceBuild) Checks.checkNotNull(deviceBuild2);
        this.instr = (Instrumentation) Checks.checkNotNull(instrumentation);
        this.argsBundle = (Bundle) Checks.checkNotNull(bundle);
        maybeAddLegacySuppressFilter();
    }
}
