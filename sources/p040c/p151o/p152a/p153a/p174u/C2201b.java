package p040c.p151o.p152a.p153a.p174u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import java.util.TreeMap;

/* renamed from: c.o.a.a.u.b */
/* compiled from: AuthUtils */
public class C2201b {
    /* renamed from: a */
    public static void m3346a(String str, int i, String str2, @NonNull TreeMap<String, Object> treeMap, @Nullable Long l) {
        treeMap.put(NotificationCompat.CarExtender.KEY_TIMESTAMP, Long.toString((System.currentTimeMillis() / 1000) + (l != null ? l.longValue() : 0)));
        String b = C2205f.m3357b(str, i == 1 ? ShareTarget.METHOD_POST : ShareTarget.METHOD_GET, str2, treeMap);
        if (b != null) {
            treeMap.put("sig", b);
        }
    }
}
