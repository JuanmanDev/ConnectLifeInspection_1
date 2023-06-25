package p040c.p151o.p152a.p153a.p172t.p173c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: c.o.a.a.t.c.a */
/* compiled from: GigyaPluginEvent */
public class C2192a {
    @NonNull

    /* renamed from: a */
    public final Map<String, Object> f2178a;

    public C2192a(@NonNull Map<String, Object> map) {
        this.f2178a = map;
    }

    @Nullable
    /* renamed from: a */
    public String mo17034a() {
        String str = (String) this.f2178a.get("eventName");
        if (str == null) {
            return null;
        }
        return str;
    }

    @NonNull
    /* renamed from: b */
    public Map<String, Object> mo17035b() {
        return this.f2178a;
    }
}
