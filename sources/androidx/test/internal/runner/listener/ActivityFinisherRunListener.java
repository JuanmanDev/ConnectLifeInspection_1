package androidx.test.internal.runner.listener;

import android.app.Instrumentation;
import androidx.test.internal.runner.InstrumentationConnection;
import androidx.test.internal.util.Checks;
import androidx.test.runner.MonitoringInstrumentation;
import org.junit.runner.Description;
import p648m.p668e.p677l.p679h.C9757a;

public class ActivityFinisherRunListener extends C9757a {
    public final MonitoringInstrumentation.ActivityFinisher activityFinisher;
    public final Instrumentation instrumentation;
    public final Runnable waitForActivitiesToFinishRunnable;

    public ActivityFinisherRunListener(Instrumentation instrumentation2, MonitoringInstrumentation.ActivityFinisher activityFinisher2, Runnable runnable) {
        this.instrumentation = (Instrumentation) Checks.checkNotNull(instrumentation2);
        this.activityFinisher = (MonitoringInstrumentation.ActivityFinisher) Checks.checkNotNull(activityFinisher2);
        this.waitForActivitiesToFinishRunnable = (Runnable) Checks.checkNotNull(runnable);
    }

    public void testFinished(Description description) {
        InstrumentationConnection.getInstance().requestRemoteInstancesActivityCleanup();
        this.instrumentation.runOnMainSync(this.activityFinisher);
        this.waitForActivitiesToFinishRunnable.run();
    }

    public void testStarted(Description description) {
        this.instrumentation.runOnMainSync(this.activityFinisher);
        this.waitForActivitiesToFinishRunnable.run();
    }
}
