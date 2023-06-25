package p553f.p554a.p570e.p575e;

import java.util.HashMap;
import java.util.Map;

/* renamed from: f.a.e.e.h */
/* compiled from: PlatformViewRegistryImpl */
public class C9058h implements C9057g {

    /* renamed from: a */
    public final Map<String, C9056f> f17767a = new HashMap();

    /* renamed from: a */
    public boolean mo46682a(String str, C9056f fVar) {
        if (this.f17767a.containsKey(str)) {
            return false;
        }
        this.f17767a.put(str, fVar);
        return true;
    }

    /* renamed from: b */
    public C9056f mo46683b(String str) {
        return this.f17767a.get(str);
    }
}
