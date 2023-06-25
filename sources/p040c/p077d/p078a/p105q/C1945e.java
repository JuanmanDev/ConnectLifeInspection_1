package p040c.p077d.p078a.p105q;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: c.d.a.q.e */
/* compiled from: LogTime */
public final class C1945e {

    /* renamed from: a */
    public static final double f1629a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f1629a = d;
    }

    /* renamed from: a */
    public static double m2546a(long j) {
        return ((double) (m2547b() - j)) * f1629a;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m2547b() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }
}
