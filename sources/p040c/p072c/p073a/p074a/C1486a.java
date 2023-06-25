package p040c.p072c.p073a.p074a;

import android.app.Activity;
import android.os.Build;

/* renamed from: c.c.a.a.a */
/* compiled from: ActivityUtils */
public final class C1486a {
    /* renamed from: a */
    public static boolean m840a(Activity activity) {
        return activity != null && !activity.isFinishing() && (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed());
    }
}
