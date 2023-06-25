package p040c.p200q.p201a.p348d.p349a.p350a;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p040c.p200q.p201a.p348d.p349a.p350a.p351c.C5804i;

/* renamed from: c.q.a.d.a.a.l */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5826l {

    /* renamed from: a */
    public static final Map f11349a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        new C5804i("PlayCoreVersion");
    }

    /* renamed from: a */
    public static Bundle m16529a() {
        Bundle bundle = new Bundle();
        Map b = m16530b();
        bundle.putInt("playcore_version_code", ((Integer) b.get("java")).intValue());
        if (b.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b.get("native")).intValue());
        }
        if (b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b.get("unity")).intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static synchronized Map m16530b() {
        Map map;
        synchronized (C5826l.class) {
            f11349a.put("java", 11004);
            map = f11349a;
        }
        return map;
    }
}
