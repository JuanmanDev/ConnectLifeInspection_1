package p553f.p554a.p556d.p558b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f.a.d.b.b */
/* compiled from: FlutterEngineCache */
public class C8919b {

    /* renamed from: b */
    public static C8919b f17485b;

    /* renamed from: a */
    public final Map<String, C8916a> f17486a = new HashMap();

    @NonNull
    /* renamed from: b */
    public static C8919b m24152b() {
        if (f17485b == null) {
            f17485b = new C8919b();
        }
        return f17485b;
    }

    @Nullable
    /* renamed from: a */
    public C8916a mo46388a(@NonNull String str) {
        return this.f17486a.get(str);
    }

    /* renamed from: c */
    public void mo46389c(@NonNull String str, @Nullable C8916a aVar) {
        if (aVar != null) {
            this.f17486a.put(str, aVar);
        } else {
            this.f17486a.remove(str);
        }
    }

    /* renamed from: d */
    public void mo46390d(@NonNull String str) {
        mo46389c(str, (C8916a) null);
    }
}
