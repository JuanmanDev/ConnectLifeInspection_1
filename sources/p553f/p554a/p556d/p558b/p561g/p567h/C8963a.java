package p553f.p554a.p556d.p558b.p561g.p567h;

import androidx.annotation.NonNull;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.C8916a;

/* renamed from: f.a.d.b.g.h.a */
/* compiled from: GeneratedPluginRegister */
public class C8963a {
    /* renamed from: a */
    public static void m24276a(@NonNull C8916a aVar) {
        try {
            Class.forName("io.flutter.plugins.GeneratedPluginRegistrant").getDeclaredMethod("registerWith", new Class[]{C8916a.class}).invoke((Object) null, new Object[]{aVar});
        } catch (Exception unused) {
            C8896b.m24033e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find and invoke the GeneratedPluginRegistrant.");
        }
    }
}
