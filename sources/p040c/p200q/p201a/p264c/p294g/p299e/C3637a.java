package p040c.p200q.p201a.p264c.p294g.p299e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: c.q.a.c.g.e.a */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C3637a {

    /* renamed from: a */
    public static final int f6585a;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 33554432;
        if (i < 31 && (i < 30 || Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'S' || Build.VERSION.CODENAME.charAt(0) > 'Z')) {
            i2 = 0;
        }
        f6585a = i2;
    }

    /* renamed from: a */
    public static PendingIntent m9182a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
