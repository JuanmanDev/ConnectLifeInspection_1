package p630io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p553f.p554a.p576f.p579c.p580a.C9079h;
import p553f.p554a.p576f.p579c.p580a.C9080i;

@Keep
/* renamed from: io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry */
public class FlutterFirebasePluginRegistry {
    public static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    /* renamed from: a */
    public static /* synthetic */ Void m25534a() {
        for (Map.Entry<String, FlutterFirebasePlugin> value : registeredPlugins.entrySet()) {
            C5777m.m16409a(((FlutterFirebasePlugin) value.getValue()).didReinitializeFirebaseCore());
        }
        return null;
    }

    /* renamed from: b */
    public static /* synthetic */ Map m25535b(C6331h hVar) {
        HashMap hashMap = new HashMap(registeredPlugins.size());
        for (Map.Entry next : registeredPlugins.entrySet()) {
            hashMap.put((String) next.getKey(), C5777m.m16409a(((FlutterFirebasePlugin) next.getValue()).getPluginConstantsForFirebaseApp(hVar)));
        }
        return hashMap;
    }

    public static C5771j<Void> didReinitializeFirebaseCore() {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, C9080i.f17823e);
    }

    public static C5771j<Map<String, Object>> getPluginConstantsForFirebaseApp(C6331h hVar) {
        return C5777m.m16412d(FlutterFirebasePlugin.cachedThreadPool, new C9079h(hVar));
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
