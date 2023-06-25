package p040c.p072c.p073a.p074a;

import android.graphics.Point;
import android.view.WindowManager;

/* renamed from: c.c.a.a.u */
/* compiled from: ScreenUtils */
public final class C1525u {
    /* renamed from: a */
    public static int m1060a() {
        WindowManager windowManager = (WindowManager) C1535z.m1079a().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }
}
