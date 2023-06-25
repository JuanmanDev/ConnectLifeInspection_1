package p040c.p200q.p363c.p400x;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;

/* renamed from: c.q.c.x.q0 */
/* compiled from: ProxyNotificationPreferences */
public final class C6849q0 {
    /* renamed from: a */
    public static SharedPreferences m19470a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    @WorkerThread
    /* renamed from: b */
    public static boolean m19471b(Context context) {
        return m19470a(context).getBoolean("proxy_notification_initialized", false);
    }

    @WorkerThread
    /* renamed from: c */
    public static void m19472c(Context context, boolean z) {
        SharedPreferences.Editor edit = m19470a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
