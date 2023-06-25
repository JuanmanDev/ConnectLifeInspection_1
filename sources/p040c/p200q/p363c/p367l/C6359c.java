package p040c.p200q.p363c.p367l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: c.q.c.l.c */
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class C6359c {

    /* renamed from: a */
    public Map<String, Object> f12030a;

    public C6359c(@Nullable String str, @NonNull Map<String, Object> map) {
        this.f12030a = map;
    }

    @NonNull
    /* renamed from: a */
    public Map<String, Object> mo30450a() {
        return this.f12030a;
    }

    @Nullable
    /* renamed from: b */
    public String mo30451b() {
        Map map = (Map) this.f12030a.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }
}
