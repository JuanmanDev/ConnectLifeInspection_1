package p040c.p200q.p201a.p264c.p294g.p298d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: c.q.a.c.g.d.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3635e {

    /* renamed from: a */
    public static final int f6584a;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 33554432;
        if (i < 31 && (i < 30 || Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'S' || Build.VERSION.CODENAME.charAt(0) > 'Z')) {
            i2 = 0;
        }
        f6584a = i2;
    }

    /* renamed from: a */
    public static PendingIntent m9181a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, i2);
    }
}
