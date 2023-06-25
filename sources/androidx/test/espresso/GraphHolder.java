package androidx.test.espresso;

import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.internal.runner.tracker.UsageTrackerRegistry;
import java.util.concurrent.atomic.AtomicReference;

public final class GraphHolder {
    public static final AtomicReference<GraphHolder> instance = new AtomicReference<>((Object) null);
    public final BaseLayerComponent component;

    public GraphHolder(BaseLayerComponent baseLayerComponent) {
        this.component = (BaseLayerComponent) Preconditions.checkNotNull(baseLayerComponent);
    }

    public static BaseLayerComponent baseLayer() {
        GraphHolder graphHolder = instance.get();
        if (graphHolder != null) {
            return graphHolder.component;
        }
        GraphHolder graphHolder2 = new GraphHolder(DaggerBaseLayerComponent.create());
        if (!instance.compareAndSet((Object) null, graphHolder2)) {
            return instance.get().component;
        }
        UsageTrackerRegistry.getInstance().trackUsage(Espresso.TAG, UsageTrackerRegistry.AxtVersions.ESPRESSO_VERSION);
        return graphHolder2.component;
    }
}
