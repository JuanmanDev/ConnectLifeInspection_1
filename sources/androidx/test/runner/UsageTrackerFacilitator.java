package androidx.test.runner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import androidx.test.internal.runner.tracker.UsageTracker;
import androidx.test.internal.runner.tracker.UsageTrackerRegistry;
import androidx.test.internal.util.Checks;

public class UsageTrackerFacilitator implements UsageTracker {
    public static final String TAG = "UsageTrackerFacilitator";
    public final boolean shouldTrackUsage;

    public UsageTrackerFacilitator(@NonNull RunnerArgs runnerArgs) {
        Checks.checkNotNull(runnerArgs, "runnerArgs cannot be null!");
        boolean z = true;
        if (runnerArgs.orchestratorService != null) {
            this.shouldTrackUsage = (runnerArgs.disableAnalytics || !runnerArgs.listTestsForOrchestrator) ? false : z;
        } else {
            this.shouldTrackUsage = !runnerArgs.disableAnalytics;
        }
    }

    public void registerUsageTracker(@Nullable UsageTracker usageTracker) {
        if (usageTracker == null || !shouldTrackUsage()) {
            UsageTrackerRegistry.registerInstance(new UsageTracker.NoOpUsageTracker());
        } else {
            UsageTrackerRegistry.registerInstance(usageTracker);
        }
    }

    public void sendUsages() {
        if (shouldTrackUsage()) {
            UsageTrackerRegistry.getInstance().sendUsages();
        }
    }

    public boolean shouldTrackUsage() {
        return this.shouldTrackUsage;
    }

    public void trackUsage(String str, String str2) {
        if (shouldTrackUsage()) {
            UsageTrackerRegistry.getInstance().trackUsage(str, str2);
        }
    }

    public UsageTrackerFacilitator(boolean z) {
        this.shouldTrackUsage = z;
    }
}
