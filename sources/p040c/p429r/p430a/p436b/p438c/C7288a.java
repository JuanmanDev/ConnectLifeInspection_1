package p040c.p429r.p430a.p436b.p438c;

import android.content.Context;
import android.view.WindowManager;

/* renamed from: c.r.a.b.c.a */
/* compiled from: ScreenUtil */
public class C7288a {

    /* renamed from: a */
    public static int f13916a;

    /* renamed from: b */
    public static int f13917b;

    /* renamed from: a */
    public static int m21421a(Context context) {
        if (f13917b == 0) {
            f13917b = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
        }
        return f13917b;
    }

    /* renamed from: b */
    public static int m21422b(Context context) {
        if (f13916a == 0) {
            f13916a = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
        }
        return f13916a;
    }
}
