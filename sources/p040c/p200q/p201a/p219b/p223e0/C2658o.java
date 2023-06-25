package p040c.p200q.p201a.p219b.p223e0;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.Map;

/* renamed from: c.q.a.b.e0.o */
/* compiled from: WidevineUtil */
public final class C2658o {
    /* renamed from: a */
    public static long m5178a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public static Pair<Long, Long> m5179b(DrmSession<?> drmSession) {
        Map<String, String> a = drmSession.mo18439a();
        if (a == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m5178a(a, "LicenseDurationRemaining")), Long.valueOf(m5178a(a, "PlaybackDurationRemaining")));
    }
}
