package androidx.test.runner;

import android.app.Instrumentation;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.test.internal.runner.RunnerArgs;
import androidx.test.internal.runner.TestExecutor;
import androidx.test.internal.runner.TestRequestBuilder;
import androidx.test.internal.runner.listener.ActivityFinisherRunListener;
import androidx.test.internal.runner.listener.CoverageListener;
import androidx.test.internal.runner.listener.DelayInjector;
import androidx.test.internal.runner.listener.InstrumentationResultPrinter;
import androidx.test.internal.runner.listener.LogRunListener;
import androidx.test.internal.runner.listener.SuiteAssignmentPrinter;
import androidx.test.internal.runner.tracker.AnalyticsBasedUsageTracker;
import androidx.test.internal.runner.tracker.UsageTrackerRegistry;
import androidx.test.internal.util.ReflectionUtil;
import androidx.test.orchestrator.instrumentationlistener.OrchestratedInstrumentationListener;
import androidx.test.runner.MonitoringInstrumentation;
import androidx.test.runner.lifecycle.ApplicationLifecycleCallback;
import androidx.test.runner.lifecycle.ApplicationLifecycleMonitorRegistry;
import androidx.test.runner.screenshot.Screenshot;
import java.util.HashSet;
import p648m.p668e.p677l.C9746d;
import p648m.p668e.p677l.p679h.C9757a;

public class AndroidJUnitRunner extends MonitoringInstrumentation implements OrchestratedInstrumentationListener.OnConnectListener {
    public static final String LOG_TAG = "AndroidJUnitRunner";
    public Bundle arguments;
    public InstrumentationResultPrinter instrumentationResultPrinter = new InstrumentationResultPrinter();
    public OrchestratedInstrumentationListener orchestratorListener;
    public RunnerArgs runnerArgs;
    public UsageTrackerFacilitator usageTrackerFacilitator;

    private void addCoverageListener(RunnerArgs runnerArgs2, TestExecutor.Builder builder) {
        if (runnerArgs2.codeCoverage) {
            builder.addRunListener(new CoverageListener(runnerArgs2.codeCoveragePath));
        }
    }

    private void addDelayListener(RunnerArgs runnerArgs2, TestExecutor.Builder builder) {
        int i = runnerArgs2.delayInMillis;
        if (i > 0) {
            builder.addRunListener(new DelayInjector(i));
        } else if (runnerArgs2.logOnly && Build.VERSION.SDK_INT < 16) {
            builder.addRunListener(new DelayInjector(15));
        }
    }

    private void addListenersFromArg(RunnerArgs runnerArgs2, TestExecutor.Builder builder) {
        for (C9757a addRunListener : runnerArgs2.listeners) {
            builder.addRunListener(addRunListener);
        }
    }

    private void addListenersLegacyOrder(RunnerArgs runnerArgs2, TestExecutor.Builder builder) {
        if (runnerArgs2.logOnly) {
            builder.addRunListener(getInstrumentationResultPrinter());
        } else if (runnerArgs2.suiteAssignment) {
            builder.addRunListener(new SuiteAssignmentPrinter());
        } else {
            builder.addRunListener(new LogRunListener());
            OrchestratedInstrumentationListener orchestratedInstrumentationListener = this.orchestratorListener;
            if (orchestratedInstrumentationListener != null) {
                builder.addRunListener(orchestratedInstrumentationListener);
            } else {
                builder.addRunListener(getInstrumentationResultPrinter());
            }
            builder.addRunListener(new ActivityFinisherRunListener(this, new MonitoringInstrumentation.ActivityFinisher(), new Runnable() {
                public void run() {
                    AndroidJUnitRunner.this.waitForActivitiesToComplete();
                }
            }));
            addDelayListener(runnerArgs2, builder);
            addCoverageListener(runnerArgs2, builder);
        }
        addListenersFromArg(runnerArgs2, builder);
    }

    private void addListenersNewOrder(RunnerArgs runnerArgs2, TestExecutor.Builder builder) {
        addListenersFromArg(runnerArgs2, builder);
        if (runnerArgs2.logOnly) {
            builder.addRunListener(getInstrumentationResultPrinter());
        } else if (runnerArgs2.suiteAssignment) {
            builder.addRunListener(new SuiteAssignmentPrinter());
        } else {
            builder.addRunListener(new LogRunListener());
            addDelayListener(runnerArgs2, builder);
            addCoverageListener(runnerArgs2, builder);
            OrchestratedInstrumentationListener orchestratedInstrumentationListener = this.orchestratorListener;
            if (orchestratedInstrumentationListener != null) {
                builder.addRunListener(orchestratedInstrumentationListener);
            } else {
                builder.addRunListener(getInstrumentationResultPrinter());
            }
            builder.addRunListener(new ActivityFinisherRunListener(this, new MonitoringInstrumentation.ActivityFinisher(), new Runnable() {
                public void run() {
                    AndroidJUnitRunner.this.waitForActivitiesToComplete();
                }
            }));
        }
    }

    private void addScreenCaptureProcessors(RunnerArgs runnerArgs2) {
        Screenshot.addScreenCaptureProcessors(new HashSet(runnerArgs2.screenCaptureProcessors));
    }

    private Bundle getArguments() {
        return this.arguments;
    }

    private void parseRunnerArgs(Bundle bundle) {
        this.runnerArgs = new RunnerArgs.Builder().fromManifest(this).fromBundle(this, bundle).build();
    }

    private void registerUserTracker() {
        Context targetContext = getTargetContext();
        if (targetContext != null) {
            this.usageTrackerFacilitator.registerUsageTracker(new AnalyticsBasedUsageTracker.Builder(targetContext).buildIfPossible());
        }
    }

    private boolean waitForDebugger(RunnerArgs runnerArgs2) {
        return runnerArgs2.debug && !runnerArgs2.listTestsForOrchestrator;
    }

    @VisibleForTesting
    public final void addListeners(RunnerArgs runnerArgs2, TestExecutor.Builder builder) {
        if (runnerArgs2.newRunListenerMode) {
            addListenersNewOrder(runnerArgs2, builder);
        } else {
            addListenersLegacyOrder(runnerArgs2, builder);
        }
    }

    @VisibleForTesting
    public C9746d buildRequest(RunnerArgs runnerArgs2, Bundle bundle) {
        TestRequestBuilder createTestRequestBuilder = createTestRequestBuilder(this, bundle);
        createTestRequestBuilder.addPathsToScan(runnerArgs2.classpathToScan);
        if (runnerArgs2.classpathToScan.isEmpty()) {
            createTestRequestBuilder.addPathToScan(getContext().getPackageCodePath());
        }
        createTestRequestBuilder.addFromRunnerArgs(runnerArgs2);
        registerUserTracker();
        return createTestRequestBuilder.build();
    }

    public TestRequestBuilder createTestRequestBuilder(Instrumentation instrumentation, Bundle bundle) {
        return new TestRequestBuilder(instrumentation, bundle);
    }

    public void finish(int i, Bundle bundle) {
        try {
            this.usageTrackerFacilitator.trackUsage("AndroidJUnitRunner", UsageTrackerRegistry.AxtVersions.RUNNER_VERSION);
            this.usageTrackerFacilitator.sendUsages();
        } catch (RuntimeException unused) {
        }
        super.finish(i, bundle);
    }

    @VisibleForTesting
    public InstrumentationResultPrinter getInstrumentationResultPrinter() {
        return this.instrumentationResultPrinter;
    }

    public void onCreate(Bundle bundle) {
        this.arguments = bundle;
        parseRunnerArgs(bundle);
        if (waitForDebugger(this.runnerArgs)) {
            Debug.waitForDebugger();
        }
        if (isPrimaryInstrProcess(this.runnerArgs.targetProcess)) {
            this.usageTrackerFacilitator = new UsageTrackerFacilitator(this.runnerArgs);
        } else {
            this.usageTrackerFacilitator = new UsageTrackerFacilitator(false);
        }
        super.onCreate(bundle);
        for (ApplicationLifecycleCallback addLifecycleCallback : this.runnerArgs.appListeners) {
            ApplicationLifecycleMonitorRegistry.getInstance().addLifecycleCallback(addLifecycleCallback);
        }
        addScreenCaptureProcessors(this.runnerArgs);
        RunnerArgs runnerArgs2 = this.runnerArgs;
        if (runnerArgs2.orchestratorService == null || !isPrimaryInstrProcess(runnerArgs2.targetProcess)) {
            start();
            return;
        }
        OrchestratedInstrumentationListener orchestratedInstrumentationListener = new OrchestratedInstrumentationListener(this);
        this.orchestratorListener = orchestratedInstrumentationListener;
        orchestratedInstrumentationListener.connect(getContext());
    }

    public boolean onException(Object obj, Throwable th) {
        InstrumentationResultPrinter instrumentationResultPrinter2 = getInstrumentationResultPrinter();
        if (instrumentationResultPrinter2 != null) {
            instrumentationResultPrinter2.reportProcessCrash(th);
        }
        return super.onException(obj, th);
    }

    public void onOrchestratorConnect() {
        start();
    }

    public void onStart() {
        setJsBridgeClassName("androidx.test.espresso.web.bridge.JavaScriptBridge");
        super.onStart();
        RunnerArgs runnerArgs2 = this.runnerArgs;
        if (!runnerArgs2.listTestsForOrchestrator || !isPrimaryInstrProcess(runnerArgs2.targetProcess)) {
            RunnerArgs.TestArg testArg = this.runnerArgs.remoteMethod;
            if (testArg != null) {
                ReflectionUtil.reflectivelyInvokeRemoteMethod(testArg.testClassName, testArg.methodName);
            }
            if (isPrimaryInstrProcess(this.runnerArgs.targetProcess)) {
                Bundle bundle = new Bundle();
                try {
                    TestExecutor.Builder builder = new TestExecutor.Builder(this);
                    addListeners(this.runnerArgs, builder);
                    bundle = builder.build().execute(buildRequest(this.runnerArgs, getArguments()));
                } catch (RuntimeException e) {
                    String valueOf = String.valueOf(Log.getStackTraceString(e));
                    bundle.putString("stream", valueOf.length() != 0 ? "Fatal exception when running tests\n".concat(valueOf) : new String("Fatal exception when running tests\n"));
                }
                finish(-1, bundle);
                return;
            }
            return;
        }
        this.orchestratorListener.addTests(buildRequest(this.runnerArgs, getArguments()).getRunner().getDescription());
        finish(-1, new Bundle());
    }
}
