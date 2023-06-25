package p040c.p200q.p363c.p400x;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.concurrent.TimeUnit;

/* renamed from: c.q.c.x.e0 */
/* compiled from: Constants */
public final class C6818e0 {

    /* renamed from: a */
    public static final long f13059a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: c.q.c.x.e0$a */
    /* compiled from: Constants */
    public static final class C6819a {
        /* renamed from: a */
        public static ArrayMap<String, String> m19349a(Bundle bundle) {
            ArrayMap<String, String> arrayMap = new ArrayMap<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            return arrayMap;
        }
    }
}
