package p040c.p072c.p073a.p074a;

import android.content.res.Resources;
import com.juconnect.vivino.global.UrlConstKt;

/* renamed from: c.c.a.a.e */
/* compiled from: BarUtils */
public final class C1498e {
    /* renamed from: a */
    public static int m914a() {
        Resources resources = C1535z.m1079a().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", UrlConstKt.APP_PLATFORM);
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
