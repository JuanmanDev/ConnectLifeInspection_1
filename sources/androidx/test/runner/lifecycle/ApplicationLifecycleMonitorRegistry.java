package androidx.test.runner.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public final class ApplicationLifecycleMonitorRegistry {
    public static final AtomicReference<ApplicationLifecycleMonitor> lifecycleMonitor = new AtomicReference<>((Object) null);

    public static ApplicationLifecycleMonitor getInstance() {
        ApplicationLifecycleMonitor applicationLifecycleMonitor = lifecycleMonitor.get();
        if (applicationLifecycleMonitor != null) {
            return applicationLifecycleMonitor;
        }
        throw new IllegalStateException("No lifecycle monitor registered! Are you running under an Instrumentation which registers lifecycle monitors?");
    }

    public static void registerInstance(ApplicationLifecycleMonitor applicationLifecycleMonitor) {
        lifecycleMonitor.set(applicationLifecycleMonitor);
    }
}
