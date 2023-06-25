package androidx.test.rule;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.test.internal.runner.junit4.statement.UiThreadStatement;
import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.MonitoringInstrumentation;
import androidx.test.runner.intercepting.SingleActivityFactory;
import androidx.test.runner.lifecycle.ActivityLifecycleCallback;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import androidx.test.runner.lifecycle.Stage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import net.sqlcipher.database.SQLiteDatabase;
import org.junit.runner.Description;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p680m.p681d.C9785g;

public class ActivityTestRule<T extends Activity> implements C9741c {
    public static final String FIELD_RESULT_CODE = "mResultCode";
    public static final String FIELD_RESULT_DATA = "mResultData";
    public static final int NO_FLAGS_SET = 0;
    public static final String TAG = "ActivityTestRule";
    @VisibleForTesting
    public volatile WeakReference<T> activity;
    public final Class<T> activityClass;
    public SingleActivityFactory<T> activityFactory;
    public volatile Instrumentation.ActivityResult activityResult;
    public boolean initialTouchMode;
    public Instrumentation instrumentation;
    public boolean launchActivity;
    public final int launchFlags;
    public final ActivityLifecycleCallback lifecycleCallback;
    public final String targetPackage;

    public class ActivityStatement extends C9785g {
        public final C9785g base;

        public ActivityStatement(C9785g gVar) {
            this.base = gVar;
        }

        public void evaluate() {
            MonitoringInstrumentation monitoringInstrumentation = ActivityTestRule.this.instrumentation instanceof MonitoringInstrumentation ? (MonitoringInstrumentation) ActivityTestRule.this.instrumentation : null;
            try {
                if (!(ActivityTestRule.this.activityFactory == null || monitoringInstrumentation == null)) {
                    monitoringInstrumentation.interceptActivityUsing(ActivityTestRule.this.activityFactory);
                }
                if (ActivityTestRule.this.launchActivity) {
                    ActivityTestRule.this.launchActivity(ActivityTestRule.this.getActivityIntent());
                }
                this.base.evaluate();
            } finally {
                if (monitoringInstrumentation != null) {
                    monitoringInstrumentation.useDefaultInterceptingActivityFactory();
                }
                if (((Activity) ActivityTestRule.this.activity.get()) != null) {
                    ActivityTestRule.this.finishActivity();
                }
                Instrumentation.ActivityResult unused = ActivityTestRule.this.activityResult = null;
                ActivityLifecycleMonitorRegistry.getInstance().removeLifecycleCallback(ActivityTestRule.this.lifecycleCallback);
            }
        }
    }

    public class LifecycleCallback implements ActivityLifecycleCallback {
        public LifecycleCallback() {
        }

        public void onActivityLifecycleChanged(Activity activity, Stage stage) {
            if (!ActivityTestRule.this.activityClass.isInstance(activity)) {
                return;
            }
            if (Stage.RESUMED == stage) {
                ActivityTestRule activityTestRule = ActivityTestRule.this;
                activityTestRule.activity = activityTestRule.makeWeakReference((Activity) activityTestRule.activityClass.cast(activity));
            } else if (Stage.PAUSED == stage && activity.isFinishing() && ActivityTestRule.this.activityResult != null) {
                ActivityTestRule activityTestRule2 = ActivityTestRule.this;
                activityTestRule2.setActivityResultForActivity((Activity) activityTestRule2.activityClass.cast(activity));
            }
        }
    }

    public ActivityTestRule(Class<T> cls) {
        this(cls, false);
    }

    /* access modifiers changed from: private */
    public void setActivityResultForActivity(T t) {
        Checks.checkState(Looper.myLooper() == Looper.getMainLooper(), "Must be called on the main thread!");
        Checks.checkNotNull(t, "Activity wasn't created yet or already destroyed!");
        try {
            Field declaredField = Activity.class.getDeclaredField(FIELD_RESULT_CODE);
            declaredField.setAccessible(true);
            Field declaredField2 = Activity.class.getDeclaredField(FIELD_RESULT_DATA);
            declaredField2.setAccessible(true);
            this.activityResult = new Instrumentation.ActivityResult(((Integer) declaredField.get(t)).intValue(), (Intent) declaredField2.get(t));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("Looks like the Android Activity class has changed itsprivate fields for mResultCode or mResultData. Time to update the reflection code.", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Field mResultCode or mResultData is not accessible", e2);
        }
    }

    public void afterActivityFinished() {
    }

    public void afterActivityLaunched() {
    }

    public C9785g apply(C9785g gVar, Description description) {
        return new ActivityStatement(gVar);
    }

    public void beforeActivityLaunched() {
    }

    @VisibleForTesting
    public void callFinishOnMainSync() {
        try {
            final Activity activity2 = (Activity) this.activity.get();
            runOnUiThread(new Runnable() {
                public void run() {
                    Checks.checkState(activity2 != null, "Activity was not launched. If you manually finished it, you must launch it again before finishing it. ");
                    activity2.finish();
                    ActivityTestRule.this.setActivityResultForActivity(activity2);
                }
            });
            this.instrumentation.waitForIdleSync();
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to execute activity.finish() on the main thread", th);
        }
    }

    public void finishActivity() {
        try {
            if (this.activity.get() != null) {
                callFinishOnMainSync();
            }
        } finally {
            this.activity = makeWeakReference((Activity) null);
            afterActivityFinished();
        }
    }

    public T getActivity() {
        return (Activity) this.activity.get();
    }

    public Intent getActivityIntent() {
        return null;
    }

    public Instrumentation.ActivityResult getActivityResult() {
        if (this.activityResult == null) {
            final Activity activity2 = (Activity) this.activity.get();
            Checks.checkNotNull(activity2, "Activity wasn't created yet or already destroyed!");
            try {
                runOnUiThread(new Runnable() {
                    public void run() {
                        Checks.checkState(activity2.isFinishing(), "Activity is not finishing!");
                        ActivityTestRule.this.setActivityResultForActivity(activity2);
                    }
                });
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }
        return this.activityResult;
    }

    public T launchActivity(@Nullable Intent intent) {
        this.instrumentation.setInTouchMode(this.initialTouchMode);
        if (intent == null && (intent = getActivityIntent()) == null) {
            intent = new Intent("android.intent.action.MAIN");
        }
        if (intent.getComponent() == null) {
            intent.setClassName(this.targetPackage, this.activityClass.getName());
        }
        if (intent.getFlags() == 0) {
            intent.addFlags(this.launchFlags);
        }
        beforeActivityLaunched();
        T t = (Activity) this.activityClass.cast(this.instrumentation.startActivitySync(intent));
        this.activity = makeWeakReference(t);
        this.instrumentation.waitForIdleSync();
        if (t != null) {
            ActivityLifecycleMonitorRegistry.getInstance().addLifecycleCallback(this.lifecycleCallback);
            afterActivityLaunched();
        } else {
            String format = String.format("Activity %s, failed to launch", new Object[]{intent.getComponent()});
            Bundle bundle = new Bundle();
            String valueOf = String.valueOf(format);
            bundle.putString("stream", valueOf.length() != 0 ? "ActivityTestRule ".concat(valueOf) : new String("ActivityTestRule "));
            this.instrumentation.sendStatus(0, bundle);
        }
        return t;
    }

    @VisibleForTesting
    public WeakReference<T> makeWeakReference(T t) {
        return new WeakReference<>(t);
    }

    public void runOnUiThread(Runnable runnable) {
        UiThreadStatement.runOnUiThread(runnable);
    }

    @VisibleForTesting
    public void setInstrumentation(Instrumentation instrumentation2) {
        this.instrumentation = (Instrumentation) Checks.checkNotNull(instrumentation2, "instrumentation cannot be null!");
    }

    public ActivityTestRule(Class<T> cls, boolean z) {
        this(cls, z, true);
    }

    public ActivityTestRule(Class<T> cls, boolean z, boolean z2) {
        this(cls, InstrumentationRegistry.getInstrumentation().getTargetContext().getPackageName(), SQLiteDatabase.CREATE_IF_NECESSARY, z, z2);
    }

    public ActivityTestRule(SingleActivityFactory<T> singleActivityFactory, boolean z, boolean z2) {
        this(singleActivityFactory.getActivityClassToIntercept(), z, z2);
        this.activityFactory = singleActivityFactory;
    }

    public ActivityTestRule(Class<T> cls, @NonNull String str, int i, boolean z, boolean z2) {
        this.lifecycleCallback = new LifecycleCallback();
        this.initialTouchMode = false;
        this.launchActivity = false;
        this.activity = makeWeakReference((Activity) null);
        this.instrumentation = InstrumentationRegistry.getInstrumentation();
        this.activityClass = cls;
        this.targetPackage = (String) Checks.checkNotNull(str, "targetPackage cannot be null!");
        this.launchFlags = i;
        this.initialTouchMode = z;
        this.launchActivity = z2;
    }
}
