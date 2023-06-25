package androidx.test.runner;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.InstrumentationConnection;
import androidx.test.internal.runner.RunnerArgs;
import androidx.test.internal.runner.hidden.ExposedInstrumentationApi;
import androidx.test.internal.runner.intent.IntentMonitorImpl;
import androidx.test.internal.runner.intercepting.DefaultInterceptingActivityFactory;
import androidx.test.internal.runner.lifecycle.ActivityLifecycleMonitorImpl;
import androidx.test.internal.runner.lifecycle.ApplicationLifecycleMonitorImpl;
import androidx.test.internal.util.Checks;
import androidx.test.internal.util.ProcSummary;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.intent.IntentMonitorRegistry;
import androidx.test.runner.intent.IntentStubberRegistry;
import androidx.test.runner.intercepting.InterceptingActivityFactory;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitor;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.ApplicationLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.ApplicationStage;
import androidx.test.runner.lifecycle.Stage;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class MonitoringInstrumentation extends ExposedInstrumentationApi {
    public static final long MILLIS_TO_POLL_FOR_ACTIVITY_STOP;
    public static final long MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP;
    public static final int START_ACTIVITY_TIMEOUT_SECONDS = 45;
    public static final String TAG = "MonitoringInstr";
    public AtomicBoolean anActivityHasBeenLaunched = new AtomicBoolean(false);
    public ApplicationLifecycleMonitorImpl applicationMonitor = new ApplicationLifecycleMonitorImpl();
    public ExecutorService executorService;
    public volatile boolean finished = false;
    public Handler handlerForMainLooper;
    public MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() {
        public boolean queueIdle() {
            MonitoringInstrumentation.this.lastIdleTime.set(System.currentTimeMillis());
            return true;
        }
    };
    public IntentMonitorImpl intentMonitor = new IntentMonitorImpl();
    public volatile InterceptingActivityFactory interceptingActivityFactory;
    public ThreadLocal<Boolean> isDexmakerClassLoaderInitialized = new ThreadLocal<>();
    public AtomicBoolean isJsBridgeLoaded = new AtomicBoolean(false);
    public volatile Boolean isOriginalInstr = null;
    public String jsBridgeClassName;
    public AtomicLong lastIdleTime = new AtomicLong(0);
    public ActivityLifecycleMonitorImpl lifecycleMonitor = new ActivityLifecycleMonitorImpl();
    public Thread.UncaughtExceptionHandler standardHandler;
    public AtomicInteger startedActivityCounter = new AtomicInteger(0);

    public class ActivityFinisher implements Runnable {
        public ActivityFinisher() {
        }

        public void run() {
            ArrayList<Activity> arrayList = new ArrayList<>();
            Iterator it = EnumSet.range(Stage.CREATED, Stage.STOPPED).iterator();
            while (it.hasNext()) {
                arrayList.addAll(MonitoringInstrumentation.this.lifecycleMonitor.getActivitiesInStage((Stage) it.next()));
            }
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder(60);
            sb.append("Activities that are still in CREATED to STOPPED: ");
            sb.append(size);
            sb.toString();
            for (Activity activity : arrayList) {
                if (!activity.isFinishing()) {
                    try {
                        String valueOf = String.valueOf(activity);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                        sb2.append("Finishing activity: ");
                        sb2.append(valueOf);
                        sb2.toString();
                        activity.finish();
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    public static class StubResultCallable implements Callable<Instrumentation.ActivityResult> {
        public final Intent intent;

        public StubResultCallable(Intent intent2) {
            this.intent = intent2;
        }

        public Instrumentation.ActivityResult call() {
            return IntentStubberRegistry.getInstance().getActivityResultForIntent(this.intent);
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(2);
        MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP = millis;
        MILLIS_TO_POLL_FOR_ACTIVITY_STOP = millis / 40;
    }

    private List<String> getTargetProcessValues() {
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.emptyList();
        }
        try {
            String str = getContext().getPackageManager().getInstrumentationInfo(getComponentName(), 0).targetProcesses;
            if (str == null) {
                str = "";
            }
            String trim = str.trim();
            if (trim.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String trim2 : trim.split(RunnerArgs.CLASS_SEPARATOR, -1)) {
                String trim3 = trim2.trim();
                if (trim3.length() > 0) {
                    arrayList.add(trim3);
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(getComponentName());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Cannot locate ourselves: ");
            sb.append(valueOf);
            Log.wtf(TAG, sb.toString(), e);
            String valueOf2 = String.valueOf(getComponentName());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
            sb2.append("Cannot locate ourselves: ");
            sb2.append(valueOf2);
            throw new IllegalStateException(sb2.toString(), e);
        }
    }

    private boolean isHostingProcess(String str, ProcSummary procSummary) {
        int length = str.length();
        int length2 = procSummary.cmdline.length();
        if (length == length2) {
            return str.equals(procSummary.cmdline);
        }
        if (length < length2 || !str.startsWith(procSummary.cmdline) || !str.endsWith(procSummary.name)) {
            return false;
        }
        String valueOf = String.valueOf(procSummary);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 165 + String.valueOf(str).length());
        sb.append("Use smaller processNames in AndroidManifest.xml. Long names are truncated. This process's cmdline is a prefix of the processName and suffix of comm - assuming: ");
        sb.append(valueOf);
        sb.append(" is: ");
        sb.append(str);
        sb.toString();
        return true;
    }

    private boolean isOriginalInstrumentationProcess() {
        Boolean bool = this.isOriginalInstr;
        if (bool == null) {
            bool = Boolean.valueOf(isOriginalUncached());
            this.isOriginalInstr = bool;
        }
        return bool.booleanValue();
    }

    private boolean isOriginalUncached() {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        List<String> targetProcessValues = getTargetProcessValues();
        if (targetProcessValues.isEmpty()) {
            return true;
        }
        boolean equals = "*".equals(targetProcessValues.get(0));
        if (targetProcessValues.size() == 1 && !equals) {
            return true;
        }
        try {
            ProcSummary summarize = ProcSummary.summarize("self");
            if (!equals) {
                return isHostingProcess(targetProcessValues.get(0), summarize);
            }
            String str = getTargetContext().getApplicationInfo().processName;
            if (str == null) {
                str = getTargetContext().getPackageName();
            }
            return isHostingProcess(str, summarize);
        } catch (ProcSummary.SummaryException unused) {
            return false;
        }
    }

    private void logUncaughtExceptions() {
        this.standardHandler = Thread.currentThread().getUncaughtExceptionHandler();
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread, Throwable th) {
                MonitoringInstrumentation.this.onException(thread, th);
                if (MonitoringInstrumentation.this.standardHandler != null) {
                    String.format("Invoking uncaught exception handler %s (a %s)", new Object[]{MonitoringInstrumentation.this.standardHandler, MonitoringInstrumentation.this.standardHandler.getClass()});
                    MonitoringInstrumentation.this.standardHandler.uncaughtException(thread, th);
                } else {
                    String valueOf = String.valueOf(thread.getName());
                    if (valueOf.length() != 0) {
                        "Invoking uncaught exception handler for thread: ".concat(valueOf);
                    } else {
                        new String("Invoking uncaught exception handler for thread: ");
                    }
                    thread.getThreadGroup().uncaughtException(thread, th);
                }
                if (!"robolectric".equals(Build.FINGERPRINT) && Looper.getMainLooper().getThread().equals(thread)) {
                    System.exit(-10);
                }
            }
        });
    }

    private void setupDexmakerClassloader() {
        if (!Boolean.TRUE.equals(this.isDexmakerClassLoaderInitialized.get())) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            ClassLoader classLoader = getTargetContext().getClassLoader();
            String.format("Setting context classloader to '%s', Original: '%s'", new Object[]{classLoader.toString(), contextClassLoader.toString()});
            Thread.currentThread().setContextClassLoader(classLoader);
            this.isDexmakerClassLoaderInitialized.set(Boolean.TRUE);
        }
    }

    private Instrumentation.ActivityResult stubResultFor(Intent intent) {
        if (!IntentStubberRegistry.isLoaded()) {
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return IntentStubberRegistry.getInstance().getActivityResultForIntent(intent);
        }
        FutureTask futureTask = new FutureTask(new StubResultCallable(intent));
        runOnMainSync(futureTask);
        try {
            return (Instrumentation.ActivityResult) futureTask.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(String.format("Could not retrieve stub result for intent %s", new Object[]{intent}), e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e2);
        }
    }

    private void tryLoadingJsBridge(final String str) {
        if (str != null) {
            runOnMainSync(new Runnable() {
                public void run() {
                    try {
                        Class.forName(str).getDeclaredMethod("installBridge", new Class[0]).invoke((Object) null, new Object[0]);
                        MonitoringInstrumentation.this.isJsBridgeLoaded.set(true);
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException("JSbridge is available at runtime, but calling it failed.", e);
                    }
                }
            });
            return;
        }
        throw new NullPointerException("JsBridge class name cannot be null!");
    }

    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.lifecycleMonitor.signalLifecycleChange(Stage.PRE_ON_CREATE, activity);
        super.callActivityOnCreate(activity, bundle);
        this.lifecycleMonitor.signalLifecycleChange(Stage.CREATED, activity);
    }

    public void callActivityOnDestroy(Activity activity) {
        super.callActivityOnDestroy(activity);
        this.lifecycleMonitor.signalLifecycleChange(Stage.DESTROYED, activity);
    }

    public void callActivityOnPause(Activity activity) {
        super.callActivityOnPause(activity);
        this.lifecycleMonitor.signalLifecycleChange(Stage.PAUSED, activity);
    }

    public void callActivityOnRestart(Activity activity) {
        super.callActivityOnRestart(activity);
        this.lifecycleMonitor.signalLifecycleChange(Stage.RESTARTED, activity);
    }

    public void callActivityOnResume(Activity activity) {
        super.callActivityOnResume(activity);
        this.lifecycleMonitor.signalLifecycleChange(Stage.RESUMED, activity);
    }

    public void callActivityOnStart(Activity activity) {
        this.startedActivityCounter.incrementAndGet();
        try {
            super.callActivityOnStart(activity);
            this.lifecycleMonitor.signalLifecycleChange(Stage.STARTED, activity);
        } catch (RuntimeException e) {
            this.startedActivityCounter.decrementAndGet();
            throw e;
        }
    }

    public void callActivityOnStop(Activity activity) {
        try {
            super.callActivityOnStop(activity);
            this.lifecycleMonitor.signalLifecycleChange(Stage.STOPPED, activity);
        } finally {
            this.startedActivityCounter.decrementAndGet();
        }
    }

    public void callApplicationOnCreate(Application application) {
        this.applicationMonitor.signalLifecycleChange(application, ApplicationStage.PRE_ON_CREATE);
        super.callApplicationOnCreate(application);
        this.applicationMonitor.signalLifecycleChange(application, ApplicationStage.CREATED);
    }

    public void dumpThreadStateToOutputs(String str) {
        getThreadState();
    }

    public void execStartActivities(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent[] intentArr, Bundle bundle) {
        for (Intent execStartActivity : intentArr) {
            execStartActivity(context, iBinder, iBinder2, activity, execStartActivity, -1, bundle);
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
        this.intentMonitor.signalIntent(intent);
        Instrumentation.ActivityResult stubResultFor = stubResultFor(intent);
        if (stubResultFor == null) {
            return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i);
        }
        String.format("Stubbing intent %s", new Object[]{intent});
        return stubResultFor;
    }

    public void finish(int i, Bundle bundle) {
        if (!this.finished) {
            this.finished = true;
            this.handlerForMainLooper.post(new ActivityFinisher());
            long currentTimeMillis = System.currentTimeMillis();
            waitForActivitiesToComplete();
            String.format("waitForActivitiesToComplete() took: %sms", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            ActivityLifecycleMonitorRegistry.registerInstance((ActivityLifecycleMonitor) null);
            restoreUncaughtExceptionHandler();
            super.finish(i, bundle);
        }
    }

    public String getThreadState() {
        Set<Map.Entry<Thread, StackTraceElement[]>> entrySet = Thread.getAllStackTraces().entrySet();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : entrySet) {
            StringBuilder sb2 = new StringBuilder("  ");
            sb2.append(next.getKey());
            sb2.append("\n");
            for (StackTraceElement stackTraceElement : (StackTraceElement[]) next.getValue()) {
                sb2.append("    ");
                sb2.append(stackTraceElement.toString());
                sb2.append("\n");
            }
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|4|5|6|7|8|9|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void installMultidex() {
        /*
            r8 = this;
            java.lang.String r0 = "multidex is available at runtime, but calling it failed."
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 >= r2) goto L_0x0046
            java.lang.String r1 = "androidx.multidex.MultiDex"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0046, InvocationTargetException -> 0x003f, IllegalAccessException -> 0x0038 }
            java.lang.String r2 = "installInstrumentation"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0034 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{ NoSuchMethodException -> 0x0034 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r7 = 1
            r4[r7] = r5     // Catch:{ NoSuchMethodException -> 0x0034 }
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r4)     // Catch:{ NoSuchMethodException -> 0x0034 }
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0034 }
            android.content.Context r5 = r8.getContext()     // Catch:{ NoSuchMethodException -> 0x0034 }
            r3[r6] = r5     // Catch:{ NoSuchMethodException -> 0x0034 }
            android.content.Context r5 = r8.getTargetContext()     // Catch:{ NoSuchMethodException -> 0x0034 }
            r3[r7] = r5     // Catch:{ NoSuchMethodException -> 0x0034 }
            r2.invoke(r4, r3)     // Catch:{ NoSuchMethodException -> 0x0034 }
            goto L_0x0046
        L_0x0034:
            r8.installOldMultiDex(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0046, InvocationTargetException -> 0x003f, IllegalAccessException -> 0x0038 }
            goto L_0x0046
        L_0x0038:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
        L_0x003f:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.runner.MonitoringInstrumentation.installMultidex():void");
    }

    public void installOldMultiDex(Class<?> cls) {
        cls.getDeclaredMethod("install", new Class[]{Context.class}).invoke((Object) null, new Object[]{getTargetContext()});
    }

    public void interceptActivityUsing(InterceptingActivityFactory interceptingActivityFactory2) {
        Checks.checkNotNull(interceptingActivityFactory2);
        this.interceptingActivityFactory = interceptingActivityFactory2;
    }

    @Deprecated
    public boolean isPrimaryInstrProcess(@Nullable String str) {
        return isPrimaryInstrProcess();
    }

    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        String name = cls.getPackage().getName();
        String packageName = context.getPackageName();
        ComponentName component = intent.getComponent();
        if (!packageName.equals(component.getPackageName()) && name.equals(component.getPackageName())) {
            intent.setComponent(new ComponentName(packageName, component.getClassName()));
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    public void onCreate(Bundle bundle) {
        logUncaughtExceptions();
        installMultidex();
        InstrumentationRegistry.registerInstance(this, bundle);
        androidx.test.InstrumentationRegistry.registerInstance(this, bundle);
        ActivityLifecycleMonitorRegistry.registerInstance(this.lifecycleMonitor);
        ApplicationLifecycleMonitorRegistry.registerInstance(this.applicationMonitor);
        IntentMonitorRegistry.registerInstance(this.intentMonitor);
        this.handlerForMainLooper = new Handler(Looper.getMainLooper());
        this.executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 0, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory(this) {
            public Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName(MonitoringInstrumentation.class.getSimpleName());
                return newThread;
            }
        });
        Looper.myQueue().addIdleHandler(this.idleHandler);
        super.onCreate(bundle);
        specifyDexMakerCacheProperty();
        setupDexmakerClassloader();
        useDefaultInterceptingActivityFactory();
    }

    public void onDestroy() {
        Looper.myQueue().removeIdleHandler(this.idleHandler);
        InstrumentationConnection.getInstance().terminate();
        super.onDestroy();
    }

    public boolean onException(Object obj, Throwable th) {
        String.format("Exception encountered by: %s. Dumping thread state to outputs and pining for the fjords.", new Object[]{obj});
        dumpThreadStateToOutputs("ThreadState-onException.txt");
        return super.onException(obj, th);
    }

    public void onStart() {
        super.onStart();
        String str = this.jsBridgeClassName;
        if (str != null) {
            tryLoadingJsBridge(str);
        }
        waitForIdleSync();
        setupDexmakerClassloader();
        InstrumentationConnection.getInstance().init(this, new ActivityFinisher());
    }

    public void restoreUncaughtExceptionHandler() {
        Thread.currentThread().setUncaughtExceptionHandler(this.standardHandler);
    }

    public void runOnMainSync(Runnable runnable) {
        FutureTask futureTask = new FutureTask(runnable, (Object) null);
        super.runOnMainSync(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    public final void setJsBridgeClassName(String str) {
        if (str == null) {
            throw new NullPointerException("JsBridge class name cannot be null!");
        } else if (!this.isJsBridgeLoaded.get()) {
            this.jsBridgeClassName = str;
        } else {
            throw new IllegalStateException("JsBridge is already loaded!");
        }
    }

    public void specifyDexMakerCacheProperty() {
        System.getProperties().put("dexmaker.dexcache", getTargetContext().getDir("dxmaker_cache", 0).getAbsolutePath());
    }

    public Activity startActivitySync(final Intent intent) {
        Checks.checkNotMainThread();
        long j = this.lastIdleTime.get();
        if (this.anActivityHasBeenLaunched.compareAndSet(false, true)) {
            intent.addFlags(67108864);
        }
        Future submit = this.executorService.submit(new Callable<Activity>() {
            public Activity call() {
                return MonitoringInstrumentation.super.startActivitySync(intent);
            }
        });
        try {
            return (Activity) submit.get(45, TimeUnit.SECONDS);
        } catch (TimeoutException unused) {
            dumpThreadStateToOutputs("ThreadState-startActivityTimeout.txt");
            submit.cancel(true);
            throw new RuntimeException(String.format("Could not launch intent %s within %s seconds. Perhaps the main thread has not gone idle within a reasonable amount of time? There could be an animation or something constantly repainting the screen. Or the activity is doing network calls on creation? See the threaddump logs. For your reference the last time the event queue was idle before your activity launch request was %s and now the last time the queue went idle was: %s. If these numbers are the same your activity might be hogging the event queue.", new Object[]{intent, 45, Long.valueOf(j), Long.valueOf(this.lastIdleTime.get())}));
        } catch (ExecutionException e) {
            throw new RuntimeException("Could not launch activity", e.getCause());
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("interrupted", e2);
        }
    }

    public void useDefaultInterceptingActivityFactory() {
        this.interceptingActivityFactory = new DefaultInterceptingActivityFactory();
    }

    public void waitForActivitiesToComplete() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            long currentTimeMillis = System.currentTimeMillis() + MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP;
            int i = this.startedActivityCounter.get();
            while (i > 0 && System.currentTimeMillis() < currentTimeMillis) {
                try {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unstopped activity count: ");
                    sb.append(i);
                    sb.toString();
                    Thread.sleep(MILLIS_TO_POLL_FOR_ACTIVITY_STOP);
                    i = this.startedActivityCounter.get();
                } catch (InterruptedException unused) {
                }
            }
            if (i > 0) {
                dumpThreadStateToOutputs("ThreadState-unstopped.txt");
                String.format("Still %s activities active after waiting %s ms.", new Object[]{Integer.valueOf(i), Long.valueOf(MILLIS_TO_WAIT_FOR_ACTIVITY_TO_STOP)});
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot be called from main thread!");
    }

    public final boolean isPrimaryInstrProcess() {
        return isOriginalInstrumentationProcess();
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        this.intentMonitor.signalIntent(intent);
        Instrumentation.ActivityResult stubResultFor = stubResultFor(intent);
        if (stubResultFor == null) {
            return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle);
        }
        String.format("Stubbing intent %s", new Object[]{intent});
        return stubResultFor;
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        this.intentMonitor.signalIntent(intent);
        Instrumentation.ActivityResult stubResultFor = stubResultFor(intent);
        if (stubResultFor == null) {
            return super.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle);
        }
        String.format("Stubbing intent %s", new Object[]{intent});
        return stubResultFor;
    }

    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        if (this.interceptingActivityFactory.shouldIntercept(classLoader, str, intent)) {
            return this.interceptingActivityFactory.create(classLoader, str, intent);
        }
        return super.newActivity(classLoader, str, intent);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle, UserHandle userHandle) {
        return super.execStartActivity(context, iBinder, iBinder2, activity, intent, i, bundle, userHandle);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.intentMonitor.signalIntent(intent);
        Instrumentation.ActivityResult stubResultFor = stubResultFor(intent);
        if (stubResultFor == null) {
            return super.execStartActivity(context, iBinder, iBinder2, fragment, intent, i, bundle);
        }
        String.format("Stubbing intent %s", new Object[]{intent});
        return stubResultFor;
    }
}
