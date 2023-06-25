package p630io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p363c.C6331h;

@Keep
/* renamed from: io.flutter.plugins.firebase.core.FlutterFirebasePlugin */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    C5771j<Void> didReinitializeFirebaseCore();

    C5771j<Map<String, Object>> getPluginConstantsForFirebaseApp(C6331h hVar);
}
