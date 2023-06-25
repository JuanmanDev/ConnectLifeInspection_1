package p040c.p200q.p201a.p264c.p275c;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;

/* renamed from: c.q.a.c.c.f */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C3301f extends ClassLoader {
    public final Class<?> loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (Log.isLoggable("CloudMessengerCompat", 3) || Build.VERSION.SDK_INT != 23) {
            return zzd.class;
        }
        boolean isLoggable = Log.isLoggable("CloudMessengerCompat", 3);
        return zzd.class;
    }
}
