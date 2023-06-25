package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public interface ProgressUpdater {
    @NonNull
    C6316e<Void> updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data);
}
