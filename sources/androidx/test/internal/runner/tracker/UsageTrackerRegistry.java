package androidx.test.internal.runner.tracker;

import androidx.test.internal.runner.tracker.UsageTracker;
import androidx.test.internal.util.Checks;

public final class UsageTrackerRegistry {
    public static volatile UsageTracker instance = new UsageTracker.NoOpUsageTracker();

    public interface AxtVersions {
        public static final String ESPRESSO_VERSION = "3.2.0";
        public static final String RUNNER_VERSION = "1.2.0";
    }

    public static UsageTracker getInstance() {
        return instance;
    }

    public static void registerInstance(UsageTracker usageTracker) {
        instance = (UsageTracker) Checks.checkNotNull(usageTracker);
    }
}
