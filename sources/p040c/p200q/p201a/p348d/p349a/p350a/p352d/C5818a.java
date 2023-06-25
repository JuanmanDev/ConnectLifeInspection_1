package p040c.p200q.p201a.p348d.p349a.p350a.p352d;

import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.d.a.a.d.a */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5818a {

    /* renamed from: a */
    public static final Map f11336a = new HashMap();

    /* renamed from: b */
    public static final Map f11337b = new HashMap();

    static {
        f11336a.put(-1, "The Play Store app is either not installed or not the official version.");
        f11336a.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        f11336a.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        f11337b.put(-1, "PLAY_STORE_NOT_FOUND");
        f11337b.put(-2, "INVALID_REQUEST");
        f11337b.put(-100, "INTERNAL_ERROR");
    }

    /* renamed from: a */
    public static String m16520a(int i) {
        Map map = f11336a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        return ((String) f11336a.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f11337b.get(valueOf)) + ")";
    }
}
