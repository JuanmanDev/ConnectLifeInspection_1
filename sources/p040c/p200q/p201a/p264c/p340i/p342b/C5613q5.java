package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: c.q.a.c.i.b.q5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5613q5 {
    /* renamed from: a */
    public static Object m15998a(@NonNull Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()}));
    }

    /* renamed from: b */
    public static void m15999b(@NonNull Bundle bundle, @NonNull Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
