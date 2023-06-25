package p040c.p200q.p363c.p400x;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import java.util.concurrent.atomic.AtomicInteger;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: c.q.c.x.d0 */
/* compiled from: CommonNotificationBuilder */
public final class C6813d0 {

    /* renamed from: a */
    public static final AtomicInteger f13045a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: c.q.c.x.d0$a */
    /* compiled from: CommonNotificationBuilder */
    public static class C6814a {

        /* renamed from: a */
        public final NotificationCompat.Builder f13046a;

        /* renamed from: b */
        public final String f13047b;

        /* renamed from: c */
        public final int f13048c;

        public C6814a(NotificationCompat.Builder builder, String str, int i) {
            this.f13046a = builder;
            this.f13047b = str;
            this.f13048c = i;
        }
    }

    @Nullable
    /* renamed from: a */
    public static PendingIntent m19323a(Context context, C6843n0 n0Var, String str, PackageManager packageManager) {
        Intent f = m19328f(str, n0Var, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(n0Var.mo31664y());
        if (m19339q(n0Var)) {
            f.putExtra("gcm.n.analytics_data", n0Var.mo31663x());
        }
        return PendingIntent.getActivity(context, m19329g(), f, m19334l(1073741824));
    }

    @Nullable
    /* renamed from: b */
    public static PendingIntent m19324b(Context context, Context context2, C6843n0 n0Var) {
        if (!m19339q(n0Var)) {
            return null;
        }
        return m19325c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(n0Var.mo31663x()));
    }

    /* renamed from: c */
    public static PendingIntent m19325c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m19329g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m19334l(1073741824));
    }

    /* renamed from: d */
    public static C6814a m19326d(Context context, Context context2, C6843n0 n0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context2, str);
        String n = n0Var.mo31657n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            builder.setContentTitle(n);
        }
        String n2 = n0Var.mo31657n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            builder.setContentText(n2);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(n2));
        }
        builder.setSmallIcon(m19335m(packageManager, resources, packageName, n0Var.mo31659p("gcm.n.icon"), bundle));
        Uri n3 = m19336n(packageName, n0Var, resources);
        if (n3 != null) {
            builder.setSound(n3);
        }
        builder.setContentIntent(m19323a(context, n0Var, packageName, packageManager));
        PendingIntent b = m19324b(context, context2, n0Var);
        if (b != null) {
            builder.setDeleteIntent(b);
        }
        Integer h = m19330h(context2, n0Var.mo31659p("gcm.n.color"), bundle);
        if (h != null) {
            builder.setColor(h.intValue());
        }
        builder.setAutoCancel(!n0Var.mo31645a("gcm.n.sticky"));
        builder.setLocalOnly(n0Var.mo31645a("gcm.n.local_only"));
        String p = n0Var.mo31659p("gcm.n.ticker");
        if (p != null) {
            builder.setTicker(p);
        }
        Integer m = n0Var.mo31656m();
        if (m != null) {
            builder.setPriority(m.intValue());
        }
        Integer r = n0Var.mo31661r();
        if (r != null) {
            builder.setVisibility(r.intValue());
        }
        Integer l = n0Var.mo31655l();
        if (l != null) {
            builder.setNumber(l.intValue());
        }
        Long j = n0Var.mo31653j("gcm.n.event_time");
        if (j != null) {
            builder.setShowWhen(true);
            builder.setWhen(j.longValue());
        }
        long[] q = n0Var.mo31660q();
        if (q != null) {
            builder.setVibrate(q);
        }
        int[] e = n0Var.mo31648e();
        if (e != null) {
            builder.setLights(e[0], e[1], e[2]);
        }
        builder.setDefaults(m19331i(n0Var));
        return new C6814a(builder, m19337o(n0Var), 0);
    }

    /* renamed from: e */
    public static C6814a m19327e(Context context, C6843n0 n0Var) {
        Bundle j = m19332j(context.getPackageManager(), context.getPackageName());
        return m19326d(context, context, n0Var, m19333k(context, n0Var.mo31654k(), j), j);
    }

    /* renamed from: f */
    public static Intent m19328f(String str, C6843n0 n0Var, PackageManager packageManager) {
        String p = n0Var.mo31659p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            return intent;
        }
        Uri f = n0Var.mo31649f();
        if (f == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage(str);
        intent2.setData(f);
        return intent2;
    }

    /* renamed from: g */
    public static int m19329g() {
        return f13045a.incrementAndGet();
    }

    /* renamed from: h */
    public static Integer m19330h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                "Color is invalid: " + str + ". Notification will use default color.";
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(ContextCompat.getColor(context, i));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        return null;
    }

    /* renamed from: i */
    public static int m19331i(C6843n0 n0Var) {
        int i = n0Var.mo31645a("gcm.n.default_sound") ? 1 : 0;
        if (n0Var.mo31645a("gcm.n.default_vibrate_timings")) {
            i |= 2;
        }
        return n0Var.mo31645a("gcm.n.default_light_settings") ? i | 4 : i;
    }

    /* renamed from: j */
    public static Bundle m19332j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            "Couldn't get own application info: " + e;
        }
        return Bundle.EMPTY;
    }

    @VisibleForTesting
    @TargetApi(26)
    /* renamed from: k */
    public static String m19333k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.";
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    str2 = "Misc";
                } else {
                    str2 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str2, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static int m19334l(int i) {
        return Build.VERSION.SDK_INT >= 23 ? i | 67108864 : i;
    }

    /* renamed from: m */
    public static int m19335m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m19338p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m19338p(resources, identifier2)) {
                return identifier2;
            }
            "Icon resource " + str2 + " not found. Notification will use default icon.";
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m19338p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                "Couldn't get own application info: " + e;
            }
        }
        if (i == 0 || !m19338p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    public static Uri m19336n(String str, C6843n0 n0Var, Resources resources) {
        String o = n0Var.mo31658o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    /* renamed from: o */
    public static String m19337o(C6843n0 n0Var) {
        String p = n0Var.mo31659p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    /* renamed from: p */
    public static boolean m19338p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i;
            return false;
        } catch (Resources.NotFoundException unused) {
            "Couldn't find resource " + i + ", treating it as an invalid icon";
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m19339q(@NonNull C6843n0 n0Var) {
        return n0Var.mo31645a("google.c.a.e");
    }
}
