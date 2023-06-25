package p553f.p554a.p570e.p571a;

import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: f.a.e.a.i */
/* compiled from: MethodCall */
public final class C9016i {

    /* renamed from: a */
    public final String f17687a;

    /* renamed from: b */
    public final Object f17688b;

    public C9016i(String str, Object obj) {
        this.f17687a = str;
        this.f17688b = obj;
    }

    @Nullable
    /* renamed from: a */
    public <T> T mo46571a(String str) {
        Object obj = this.f17688b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    /* renamed from: b */
    public <T> T mo46572b() {
        return this.f17688b;
    }
}
