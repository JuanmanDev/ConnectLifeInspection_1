package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import androidx.work.Configuration;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements Initializer<WorkManager> {
    public static final String TAG = Logger.tagWithPrefix("WrkMgrInitializer");

    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }

    @NonNull
    public WorkManager create(@NonNull Context context) {
        Logger.get().debug(TAG, "Initializing WorkManager with default configuration.", new Throwable[0]);
        WorkManager.initialize(context, new Configuration.Builder().build());
        return WorkManager.getInstance(context);
    }
}
