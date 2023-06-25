package p040c.p200q.p201a.p219b.p261o0;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.StringRes;

@SuppressLint({"InlinedApi"})
/* renamed from: c.q.a.b.o0.r */
/* compiled from: NotificationUtil */
public final class C3171r {
    /* renamed from: a */
    public static void m7913a(Context context, String str, @StringRes int i, int i2) {
        if (C3152e0.f5819a >= 26) {
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel(str, context.getString(i), i2));
        }
    }
}
