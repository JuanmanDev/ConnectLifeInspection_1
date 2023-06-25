package p040c.p200q.p363c.p400x;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import androidx.annotation.WorkerThread;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;

/* renamed from: c.q.c.x.p0 */
/* compiled from: ProxyNotificationInitializer */
public final class C6847p0 {
    /* renamed from: a */
    public static boolean m19465a(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    @WorkerThread
    /* renamed from: b */
    public static void m19466b(Context context) {
        if (!C6849q0.m19471b(context)) {
            m19468d(C6867y.f13147e, context, m19469e(context));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m19467c(Context context, boolean z, C5773k kVar) {
        try {
            if (!m19465a(context)) {
                "error configuring notification delegate for package " + context.getPackageName();
                return;
            }
            C6849q0.m19472c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            kVar.mo28863e(null);
        } finally {
            kVar.mo28863e(null);
        }
    }

    @TargetApi(29)
    /* renamed from: d */
    public static C5771j<Void> m19468d(Executor executor, Context context, boolean z) {
        if (!C3562m.m9089j()) {
            return C5777m.m16414f(null);
        }
        C5773k kVar = new C5773k();
        executor.execute(new C6850r(context, z, kVar));
        return kVar.mo28859a();
    }

    /* renamed from: e */
    public static boolean m19469e(Context context) {
        ApplicationInfo applicationInfo;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
