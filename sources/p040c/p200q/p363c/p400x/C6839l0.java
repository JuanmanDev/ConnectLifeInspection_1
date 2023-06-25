package p040c.p200q.p363c.p400x;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompatJellybean;
import androidx.test.internal.runner.RunnerArgs;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.concurrent.ExecutionException;
import p040c.p200q.p201a.p202a.C2350b;
import p040c.p200q.p201a.p202a.C2351c;
import p040c.p200q.p201a.p202a.C2353e;
import p040c.p200q.p201a.p202a.C2354f;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p364k.p365a.C6341a;
import p040c.p200q.p363c.p394v.C6767h;
import p040c.p200q.p363c.p400x.p401e1.C6820a;

/* renamed from: c.q.c.x.l0 */
/* compiled from: MessagingAnalytics */
public class C6839l0 {
    /* renamed from: A */
    public static boolean m19399A(Intent intent) {
        if (intent == null || m19418r(intent)) {
            return false;
        }
        return m19400B(intent.getExtras());
    }

    /* renamed from: B */
    public static boolean m19400B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m19401a() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            r1 = 0
            p040c.p200q.p363c.C6331h.m17785l()     // Catch:{ IllegalStateException -> 0x0046 }
            c.q.c.h r2 = p040c.p200q.p363c.C6331h.m17785l()
            android.content.Context r2 = r2.mo30404j()
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0021
            boolean r0 = r3.getBoolean(r4, r1)
            return r0
        L_0x0021:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x0046
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            boolean r3 = r3.containsKey(r0)     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            android.os.Bundle r2 = r2.metaData     // Catch:{  }
            boolean r0 = r2.getBoolean(r0, r1)     // Catch:{  }
            return r0
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p400x.C6839l0.m19401a():boolean");
    }

    /* renamed from: b */
    public static MessagingClientEvent m19402b(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.C8296a p = MessagingClientEvent.m23049p();
        p.mo37507m(m19416p(extras));
        p.mo37499e(event);
        p.mo37500f(m19406f(extras));
        p.mo37503i(m19413m());
        p.mo37505k(MessagingClientEvent.SDKPlatform.ANDROID);
        p.mo37502h(m19411k(extras));
        String h = m19408h(extras);
        if (h != null) {
            p.mo37501g(h);
        }
        String o = m19415o(extras);
        if (o != null) {
            p.mo37506l(o);
        }
        String c = m19403c(extras);
        if (c != null) {
            p.mo37497c(c);
        }
        String i = m19409i(extras);
        if (i != null) {
            p.mo37496b(i);
        }
        String e = m19405e(extras);
        if (e != null) {
            p.mo37498d(e);
        }
        long n = m19414n(extras);
        if (n > 0) {
            p.mo37504j(n);
        }
        return p.mo37495a();
    }

    @Nullable
    /* renamed from: c */
    public static String m19403c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    @Nullable
    /* renamed from: d */
    public static String m19404d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    @Nullable
    /* renamed from: e */
    public static String m19405e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    @NonNull
    /* renamed from: f */
    public static String m19406f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) C5777m.m16409a(C6767h.m19129m(C6331h.m17785l()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    /* renamed from: g */
    public static String m19407g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    @Nullable
    /* renamed from: h */
    public static String m19408h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    @Nullable
    /* renamed from: i */
    public static String m19409i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    @Nullable
    /* renamed from: j */
    public static String m19410j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    @NonNull
    /* renamed from: k */
    public static MessagingClientEvent.MessageType m19411k(Bundle bundle) {
        if (bundle == null || !C6843n0.m19437t(bundle)) {
            return MessagingClientEvent.MessageType.DATA_MESSAGE;
        }
        return MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
    }

    @NonNull
    /* renamed from: l */
    public static String m19412l(Bundle bundle) {
        return (bundle == null || !C6843n0.m19437t(bundle)) ? "data" : "display";
    }

    @NonNull
    /* renamed from: m */
    public static String m19413m() {
        return C6331h.m17785l().mo30404j().getPackageName();
    }

    @Nullable
    /* renamed from: n */
    public static long m19414n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException unused) {
            }
        }
        C6331h l = C6331h.m17785l();
        String f = l.mo30406o().mo30424f();
        if (f != null) {
            try {
                return Long.parseLong(f);
            } catch (NumberFormatException unused2) {
            }
        }
        String c = l.mo30406o().mo30420c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException unused3) {
                return 0;
            }
        } else {
            String[] split = c.split(RunnerArgs.CLASSPATH_SEPARATOR);
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            return Long.parseLong(str);
        }
    }

    @Nullable
    /* renamed from: o */
    public static String m19415o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @NonNull
    /* renamed from: p */
    public static int m19416p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            "Invalid TTL: " + obj;
            return 0;
        }
    }

    @Nullable
    /* renamed from: q */
    public static String m19417q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    public static boolean m19418r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m19419s(Intent intent) {
        m19424x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m19420t(Intent intent) {
        m19424x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m19421u(Bundle bundle) {
        m19425y(bundle);
        m19424x("_no", bundle);
    }

    /* renamed from: v */
    public static void m19422v(Intent intent) {
        if (m19399A(intent)) {
            m19424x("_nr", intent.getExtras());
        }
        if (m19426z(intent)) {
            m19423w(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.m23021k());
        }
    }

    /* renamed from: w */
    public static void m19423w(MessagingClientEvent.Event event, Intent intent, @Nullable C2354f fVar) {
        MessagingClientEvent b;
        if (fVar != null && (b = m19402b(event, intent)) != null) {
            try {
                C2353e<C6820a> a = fVar.mo17662a("FCM_CLIENT_EVENT_LOGGING", C6820a.class, C2350b.m4027b("proto"), C6798a0.f13002a);
                C6820a.C6821a b2 = C6820a.m19350b();
                b2.mo31599b(b);
                a.mo17660a(C2351c.m4029d(b2.mo31598a()));
            } catch (RuntimeException unused) {
            }
        }
    }

    @VisibleForTesting
    /* renamed from: x */
    public static void m19424x(String str, Bundle bundle) {
        try {
            C6331h.m17785l();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = m19404d(bundle);
            if (d != null) {
                bundle2.putString("_nmid", d);
            }
            String e = m19405e(bundle);
            if (e != null) {
                bundle2.putString("_nmn", e);
            }
            String i = m19409i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString(NotificationCompatJellybean.KEY_LABEL, i);
            }
            String g = m19407g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString("message_channel", g);
            }
            String o = m19415o(bundle);
            if (o != null) {
                bundle2.putString("_nt", o);
            }
            String j = m19410j(bundle);
            if (j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j));
                } catch (NumberFormatException unused) {
                }
            }
            String q = m19417q(bundle);
            if (q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q));
                } catch (NumberFormatException unused2) {
                }
            }
            String l = m19412l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                "Logging to scion event=" + str + " scionPayload=" + bundle2;
            }
            C6341a aVar = (C6341a) C6331h.m17785l().mo30402h(C6341a.class);
            if (aVar != null) {
                aVar.mo30437a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    /* renamed from: y */
    public static void m19425y(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.tc"))) {
                C6341a aVar = (C6341a) C6331h.m17785l().mo30402h(C6341a.class);
                boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
                if (aVar != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    aVar.mo30438b("fcm", "_ln", string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString("campaign", string);
                    aVar.mo30437a("fcm", "_cmp", bundle2);
                    return;
                }
                return;
            }
            boolean isLoggable2 = Log.isLoggable("FirebaseMessaging", 3);
        }
    }

    /* renamed from: z */
    public static boolean m19426z(Intent intent) {
        if (intent == null || m19418r(intent)) {
            return false;
        }
        return m19401a();
    }
}
